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
    public abstract class Usuario implements Serializable, Comparable<Usuario> {
    protected String codUsuario;
    protected String nome;
    protected int diasEmprestimo;//numero de dias permitidos para emprestimo

    public Usuario(String codUsuario, String nome, int diasEmprestimo) {
        this.codUsuario = codUsuario;
        this.nome = nome;
        this.diasEmprestimo = diasEmprestimo;
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
    public abstract String getTipo();
    
    @Override
    public int compareTo(Usuario o) {
      return  nome.compareTo(o.nome);
    } 
    
}
