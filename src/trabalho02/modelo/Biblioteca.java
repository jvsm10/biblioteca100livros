/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho02.modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Danilo Medeiros Eler
 */
public class Biblioteca {
    private Config configuracoes;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Emprestimo> emprestimos;
    private ArrayList<Livro> livros;

    public Biblioteca() {
        this.usuarios = new ArrayList<Usuario>();
        this.emprestimos = new ArrayList<Emprestimo>();
        this.livros = new ArrayList<Livro>();
        this.configuracoes = new Config();
    }

    public Config getConfiguracoes() {
        return configuracoes;
    }

    public void setConfiguracoes(Config configuracoes) {
        this.configuracoes = configuracoes;
    }

    public void addAluno(String codUsuario, String nome, String curso, int ano){
        Usuario aluno = new Aluno(codUsuario, nome, curso, ano, configuracoes.getDiasAluno());
        this.usuarios.add(aluno);
        Collections.sort(usuarios);
    }

    public void addProfessor(String codUsuario, String nome, String titulacao){
        Usuario professor = new Professor(codUsuario, nome, titulacao, configuracoes.getDiasProfessor());
        this.usuarios.add(professor);
        Collections.sort(usuarios);
    }

    public void addLivro(String codLivro, String nome, String ano) {
        Livro livro = new Livro(codLivro, nome, ano);
        this.livros.add(livro);
        Collections.sort(livros);
    }
    public ArrayList<Usuario> getUserBusca(String tipo){
        if(usuarios.isEmpty()) return null;
        ArrayList<Usuario> user = new ArrayList<>();
            for(Usuario perc: usuarios){
                if(perc.getTipo().equals(tipo))
                    user.add(perc);
        }
        return user;
    }
    public Usuario buscarUsuario(String codUser){
        if(usuarios.isEmpty()) return null;
        for(Usuario user: usuarios){
            if(user.getCodUsuario().equals(codUser)){
                return user;
            }
        }
        return null;
    }
    public ArrayList<Usuario> buscarUsuarioTodos(){
        if(usuarios.isEmpty()) return null;
        else return usuarios;
    }
    public ArrayList<Livro> buscarLivroTodos(){
        if(livros.isEmpty()) return null;
        else return livros;
    }
    
    public void removerUsuario(String codUsuario){
        if(usuarios.isEmpty()) return;
        for(Usuario user: usuarios){
            if(user.getCodUsuario().equals(codUsuario)){
                usuarios.remove(user);
                return;
            }
        }
    }
    public void removerLivro(String codLivro){
        if(livros.isEmpty()) return;
        for(Livro li: livros){
            if(li.getCodLivro().equals(codLivro)){
                livros.remove(li);
                return;
            }
        }
    }
    public ArrayList<Livro> getLivroBusca(){
        return livros;
    }
    public Livro buscaLivro(String codLivro) {
        if(livros.isEmpty()) return null;
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getCodLivro().equals(codLivro)) {
                return livros.get(i);
            }
        }
        return null;
    }

    public String salvarLivros(){
        String nomeArquivo = configuracoes.getArquivoLivros();
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(nomeArquivo);
            oos = new ObjectOutputStream(fos);
            //oos.writeObject(this.livros);
            //ou salvar livro a livro
            oos.writeInt(livros.size());
            for (Livro li : livros){
                oos.writeObject(li);
            }
            oos.close();
            fos.close();
            return "";
        }catch (IOException ex) {
            Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
            return ex.getMessage();
            }
    }

    public void recuperarLivros(){
        String nomeArquivo = configuracoes.getArquivoLivros();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        try {
            fis = new FileInputStream(nomeArquivo);
            ois = new ObjectInputStream(fis);
            ///this.livros = (ArrayList<Livro>) ois.readObject();
            ///ou ler livro por livro do arquivo -- depende de como salvou
            this.livros.clear();
            int numLivros = ois.readInt();
            for (int i=0; i<numLivros; i++){
                Livro livro = (Livro) ois.readObject();
                livros.add( livro );
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                ois.close();
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public String salvarUsuarios() {
        String nomeArquivo = configuracoes.getArquivoUsuarios();
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(nomeArquivo);
            oos = new ObjectOutputStream(fos);
            oos.writeInt(usuarios.size());
            for (int i = 0; i < usuarios.size(); i++) {
                oos.writeObject(usuarios.get(i));
            }
            oos.close();
            fos.close();
            return "";
        } catch (IOException ex) {
            Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
            return ex.getMessage();
        
//        } finally {
//            try {
//                oos.close();
//                fos.close();
//            } catch (IOException ex) {
//                Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
    }


    public void recuperarUsuarios() {
        String nomeArquivo = configuracoes.getArquivoUsuarios();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(nomeArquivo);
            ois = new ObjectInputStream(fis);
            ///this.livros = (ArrayList<Livro>) ois.readObject();
            ///ou ler livro por livro do arquivo -- depende de como salvou
            this.usuarios.clear();
            int numLivros = ois.readInt();
            for (int i=0; i<numLivros; i++){
                Usuario user = (Usuario) ois.readObject();
                usuarios.add( user );
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                ois.close();
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public String salvarEmprestimos() {
        String nomeArquivo = configuracoes.getArquivoEmprestimos();
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(nomeArquivo);
            oos = new ObjectOutputStream(fos);
            //oos.writeObject(this.livros);
            //ou salvar livro a livro
            oos.writeInt(emprestimos.size());
            for (int i = 0; i < emprestimos.size(); i++) {
                oos.writeObject(emprestimos.get(i));
            }
            return "";
        } catch (IOException ex) {
            Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                oos.close();
//                fos.close();
//            } catch (IOException ex) {
//                Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
//            }
            return ex.getMessage();
        }  
    }

    public void recuperarEmprestimos() {
        String nomeArquivo = configuracoes.getArquivoEmprestimos();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        File f = new File("emprestimos.dat");
        if(f.exists()){
        try {
            fis = new FileInputStream(nomeArquivo);
            ois = new ObjectInputStream(fis);
            ///this.livros = (ArrayList<Livro>) ois.readObject();
            ///ou ler livro por livro do arquivo -- depende de como salvou
            this.emprestimos.clear();
            int numEmpres = ois.readInt();
            for (int i=0; i<numEmpres; i++){
                Emprestimo emp = (Emprestimo) ois.readObject();
                emprestimos.add( emp );
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                ois.close();
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    }
    
    public String salvarConfig(){
        
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("config.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(configuracoes);
            oos.close();
            fos.close();
            return "";
        }catch (IOException ex) {
            Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
            return ex.getMessage();
            }
    }
        public void recuperarConfig() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
                
            fis = new FileInputStream("config.dat");
            ois = new ObjectInputStream(fis);
            configuracoes = (Config) ois.readObject(); 
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                ois.close();
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
