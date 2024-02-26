/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Samuelson
 */



public class funcionario {
    
   
    private String nome;
    private String senha;
    private String login;
    private int id;

   public int getId(){
   return id;
   }
   
   public void setId(int id){
   this.id = id;
   }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

   
  public String getsenha() {
        return senha;
    }

    public void setsenha(String senha) {
        this.senha = senha;
    }
     public String getlogin() {
        return login;
    }
    public void setlogin(String login) {
        this.login = login;
    }
    
    
    
    
    
}
