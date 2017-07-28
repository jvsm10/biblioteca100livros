/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho02.modelo;

import java.io.Serializable;

/**
 *
 * @author Danilo Medeiros Eler
 */
public class Livro implements Serializable, Comparable<Livro>{
    private String codLivro;
    private String nome;
    private String ano;
    private boolean emprestado;

    public Livro(String codLivro, String nome, String ano) {
        this.codLivro = codLivro;
        this.nome = nome;
        this.ano = ano;
        this.emprestado = false;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCodLivro() {
        return codLivro;
    }

    public void setCodLivro(String codLivro) {
        this.codLivro = codLivro;
    }

    public boolean estaEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public void emprestar(){
        this.setEmprestado(true);
    }

    public void devolver(){
        this.setEmprestado(false);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Livro o) {
        int cod1 = Integer.parseInt(codLivro);
        int cod2 = Integer.parseInt(o.codLivro); 
      return cod1-cod2;
    }
}
