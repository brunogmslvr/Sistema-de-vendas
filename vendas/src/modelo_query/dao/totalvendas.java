package modelo_query.dao;

import conexao.Banco;
// busca dados do mysql aqui 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.Produto;

/**
 *
 * @author Samuelson
 */
public class totalvendas {

    public int checkdata(String data) {

        Connection con = Banco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        int check = 0;

        try {
                                        
            stmt = con.prepareStatement("SELECT sun (valor) as total FROM vendas WHERE datas = ?");
            stmt.setString(1, data);
            //stmt.setString(2, senha);

            rs = stmt.executeQuery();
            
            
            if (rs.next()) {                
                //check = 1;
                check = rs.getInt("total");
            }
            /*
             while (rs.next()) {
               check = rs.getInt("valor"))
            }
            
            
*/
        } catch (SQLException ex) {
            Logger.getLogger(totalvendas.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Banco.closeConnection(con, stmt, rs);
        }

        return check;

    }

}
