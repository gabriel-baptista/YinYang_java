/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author gbdso
 */
public class ConexaoBD {
    public Statement stm;
    public ResultSet res;
    private String driver = "com.mysql.jdbc.Driver";
    private String caminho = "jdbc:mysql://localhost:3306/projetoDB";
    private String usuario = "root";
    private String senha = "";
    Connection con;
    
    public void conexao()
    {
        try 
        {
            System.setProperty("jdbc.Drivers", driver);
            con = DriverManager.getConnection(caminho, usuario, senha);
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Erro na conxão do Banco de Dados:\n"+ex.getMessage());
        }
    }
    
    public void desconecta()
    {
        try 
        {
            con.close();
            JOptionPane.showMessageDialog(null, "Desconexão realizada com sucesso!");
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o Banco de Dados:\n"+ex.getMessage());
        }
        
    }
}
