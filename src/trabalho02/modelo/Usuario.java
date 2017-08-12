/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho02.modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Danilo Medeiros Eler
 */
    public abstract class Usuario implements Serializable, Comparable<Usuario> {
    protected String codUsuario;
    protected String nome;
    protected int diasEmprestimo;//numero de dias permitidos para emprestimo
    protected ArrayList<String> historico;

    public Usuario(String codUsuario, String nome, int diasEmprestimo) {
        this.codUsuario = codUsuario;
        this.nome = nome;
        this.diasEmprestimo = diasEmprestimo;
        historico = new ArrayList<String>();
    }

    public ArrayList<String> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<String> historico) {
        this.historico = historico;
    }
    public void addHistorico(String cod){
        this.historico.add(cod);
    }

    public int getDiasEmprestimo() {
        return diasEmprestimo;
    }

    public void setDiasEmprestimo(int diasEmprestimo) {
        this.diasEmprestimo = diasEmprestimo;
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public boolean buscaLivro(String codLivro,int j) {
        if(historico.isEmpty()) return false;
        for (int i = 0; i < j; i++) {
            if (historico.get(i).equals(codLivro)) {
                return true;
            }
        }
        return false;
    }

    public abstract String getTipo();
    
    @Override
    public int compareTo(Usuario o) {
      return  nome.compareTo(o.nome);
    } 
    
}
