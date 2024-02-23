/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo_query.dao;

import conexao.Banco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.funcionario;

/**
 *
 * @author Samuelson
 */
public class funcionarioDAO {

    public void create(funcionario f) {
        
        Connection con = Banco.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO `sistema_vendas`.`funcionarios` (nome,senha,login) VALUES (?,?,?)");
            stmt.setString(1, f.getnome());
            stmt.setString(2, f.getsenha());
            stmt.setString(3, f.getlogin());
            //stmt.setInt(2, p.getQtd());
            //stmt.setDouble(3, p.getPreco());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            Banco.closeConnection(con, stmt);
        }

    }

    
    
    
    
    
    

}
