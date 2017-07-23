/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho02.controlador;

import java.util.ArrayList;
import trabalho02.modelo.Biblioteca;
import trabalho02.modelo.Config;
import trabalho02.modelo.Livro;
import trabalho02.modelo.Usuario;
/**
 *
 * @author Danilo Medeiros Eler
 */
public class Controlador {
    private static Biblioteca user = new Biblioteca();
    public Config getConfiguracoes(){
        return BD.biblioteca.getConfiguracoes();
    }
    public void salvarLivros(){
        BD.biblioteca.salvarLivros();
    }
    public void recuperarLivros(){
        BD.biblioteca.recuperarLivros();
    }
    public void addAluno(String codUsuario, String nome, String curso, int ano){
        user.addAluno(codUsuario, nome, curso, ano);
}
    public void addProfessor(String codUsuario, String nome, String titulacao){
        user.addProfessor(codUsuario, nome, titulacao);
    }
    public Usuario buscarUsuario(String codUser){
        return user.buscarUsuario(codUser);
    }
    public ArrayList<Usuario> getUserBusca(String tipo){
       return user.getUserBusca(tipo);
       
    }
    public void removerUsuario(String codUsuario){
        user.removerUsuario(codUsuario);
    }
    public void addLivro(String codLivro, String nome, String ano){
        user.addLivro(codLivro, nome, ano);
    }
    public ArrayList<Livro> getLivroBusca(){
        return user.getLivroBusca();
    }
    public Livro buscaLivro(String codLivro) {
        return user.buscaLivro(codLivro);
    }
}
