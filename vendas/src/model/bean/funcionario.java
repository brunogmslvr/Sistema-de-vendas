/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import conexao.Banco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuelson
 */



public class funcionario {
    
   private int id;
    private String nome;
    private String email;
    private String login;
    private String senha;
    
    


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
    
    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }
    
    public String getlogin() {
        return login;
    }
    public void setlogin(String login) {
        this.login = login;
    }

   
  public String getsenha() {
        return senha;
    }
    public void setsenha(String senha) {
        this.senha = senha;
    }
      
    
     public void delete(funcionario p) {

        Connection con = Banco.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM funcionario WHERE id = ?");
            stmt.setInt(1, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            Banco.closeConnection(con, stmt);
        }

    }
     
     public void update(funcionario p) {

        Connection con = Banco.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE funcionarios SET descricao = ? ,nome = ?,email = ?,login = ?,senha WHERE id = ?");
            stmt.setString(1, p.getnome());
            stmt.setString(2, p.getemail());
            stmt.setString(3, p.getlogin());
            stmt.setString(3, p.getsenha());
            stmt.setInt(4, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            Banco.closeConnection(con, stmt);
        }

    }
        
}



