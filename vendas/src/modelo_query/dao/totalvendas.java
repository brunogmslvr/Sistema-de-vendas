package modelo_query.dao;

import conexao.Banco;
// busca dados do mysql aqui 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.venda_bean;

/**
 *
 * @author Samuelson
 */
public class totalvendas {
    
   public void create(venda_bean  v) {
        
        Connection con = Banco.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement ("INSERT INTO vendas (datas,obs,valor) VALUES(?,?,?)");
            stmt.setString(1, v.getData());
            stmt.setString(2, v.getobervacao());
            stmt.setInt(3, v.getvalor());
          //  stmt.setInt(2, p.getQtd());
          //  stmt.setDouble(3, p.getPreco());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            Banco.closeConnection(con, stmt);
        }
  
   }

    public int checkdata(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
