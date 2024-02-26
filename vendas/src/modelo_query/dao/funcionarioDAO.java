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
//import model.bean.Produto;
//import model.bean.Produto;
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

    public List<funcionario> read() {

        Connection con = Banco.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<funcionario> funcionarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM funcionarios");
            rs = stmt.executeQuery();

            while (rs.next()) {

                funcionario f = new funcionario();

                f.setId(rs.getInt("idfuncionarios"));
                f.setnome(rs.getString("nome"));
                f.setlogin(rs.getString("login"));
                f.setsenha(rs.getString("senha"));
                /*produto.setDescricao(rs.getString("descricao"));
                produto.setQtd(rs.getInt("qtd"));
                produto.setPreco(rs.getDouble("preco"));
                produtos.add(produto); */
                funcionarios.add(f);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Banco.closeConnection(con, stmt, rs);
        }

        return funcionarios;

    }
    
     public void delete(funcionario p) {

        Connection con = Banco.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM funcionarios WHERE idFuncionarios = ?");
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

