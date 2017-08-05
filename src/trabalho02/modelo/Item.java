/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho02.modelo;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author Danilo Medeiros Eler
 */
public class Item implements Serializable{
    private String codEmprestimo;
    private String codLivro;
    private Calendar dataDevolucao;

    public String getCodLivro() {
        return codLivro;
    }

    
    public Item(String codEmprestimo, String codLivro) {
        this.codEmprestimo = codEmprestimo;
        this.codLivro = codLivro;
        //a data de devolução é atribuida na devolução do livro,
        //não é passada no construtor
        this.dataDevolucao = null;
    }

    public void setCodLivro(String codLivro) {
        this.codLivro = codLivro;
    }

    public Calendar getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Calendar dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    
}
