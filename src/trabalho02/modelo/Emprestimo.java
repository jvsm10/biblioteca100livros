/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho02.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Danilo Medeiros Eler
 */
public class Emprestimo implements Serializable {
    private String codEmprestimo;
    private String codUsuario;
    private Calendar dataEmprestimo; //data do emprestimo
    private Calendar dataDevolucao; //data prevista para devolucao
    private ArrayList<Item> itens;

    public Emprestimo(String codEmprestimo, Usuario usuario) {
        this.codEmprestimo = codEmprestimo;
        this.codUsuario = usuario.getCodUsuario();
        this.itens = new ArrayList<Item>();
        this.dataEmprestimo = Calendar.getInstance();
        this.dataDevolucao = Calendar.getInstance();
                //acrestenca dias na data de emprestimo
        this.dataDevolucao.add(Calendar.DAY_OF_MONTH, usuario.getDiasEmprestimo());        
    }

    public String getCodEmprestimo() {
        return codEmprestimo;
    }

    public void setCodEmprestimo(String codEmprestimo) {
        this.codEmprestimo = codEmprestimo;
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Calendar getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Calendar dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Calendar getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Calendar dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
    
     public void addItem(String codEmprestimo, String codLivro){
        Item it = new  Item(codEmprestimo,codLivro);
        this.itens.add(it);
    }
     
    public void removerItem(String codLivro){
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i).getCodLivro().equals(codLivro)) {
                itens.remove(i);
            }
        }
    }
    
}
