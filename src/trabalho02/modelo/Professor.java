/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho02.modelo;

/**
 *
 * @author Danilo Medeiros Eler
 */
public class Professor extends Usuario{    
    protected String titulacao;
    protected String tipo;
    public Professor(String codUsuario, String nome, String titulacao, int dias) {
        super(codUsuario, nome, dias); //emprestimo por X dias
        this.titulacao = titulacao;
        tipo="Professor";
    }

    public String getTitulacao() {
        return titulacao;
    }

    public String getTipo() {
        return tipo;
    }

}
