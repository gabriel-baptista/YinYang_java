/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import java.sql.*;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gbdso
 */
public class DaoAgenda {
    BeansAgenda agenda = new BeansAgenda();
    ConexaoBD conex =  new ConexaoBD();
    ConexaoBD conexPaciente = new ConexaoBD();
    ConexaoBD conexNutricionista = new ConexaoBD();
    int codNutri;
    int codPac;
    
    public void Salvar(BeansAgenda Agenda)
    {
        BuscarNutricionista(agenda.getNomeNutricionista());
        BuscarPaciente(agenda.getNomePac());
        conex.conexao();
        
        try 
        {
            PreparedStatement pst = conex.con.prepareStatement("INSERT INTO consulta (agenda_idpaciente, agenda_idnutricionista, agenda_data, agenda_status) VALUES(?, ?, ?, ?)");
            pst.setInt(1, codPac);
            pst.setInt(2, codNutri);
            pst.setDate(3, new java.sql.Date(agenda.getData().getTime()));
            pst.setString(4, agenda.getStatus());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Agendamento marcado com sucesso!");
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,"Erro ao salvar agendamento!\n" +ex);
        }
        conex.desconecta();
    }
    
    public void BuscarNutricionista(String nomeNutricionista)
    {
        /*conexNutricionista.conexao();
        conexNutricionista.executaSql("SELECT * FROM usuarios WHERE nome_usuario = '"+nomeNutricionista+"'");*/
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetoDB", "root", "");
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery("SELECT * FROM usuarios WHERE nome_usuario = '"+nomeNutricionista+"'");
            //conexNutricionista.res.first();
            //codNutri = conexNutricionista.res.getInt("usuario_id");
            while(res.next())
            {
                codNutri = conexNutricionista.res.getInt("usuario_id");
            }
        }
        catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, "Error", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Nutricionista não encontrado");
        }
    }
    
    public void BuscarPaciente(String nomePaciente)
    {
        /*conexPaciente.conexao();
        conexPaciente.executaSql("SELECT * FROM cliente WHERE nome_cliente = '"+nomePaciente+"'");*/
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetoDB", "root", "");
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery("SELECT * FROM cliente WHERE nome_cliente = '"+nomePaciente+"'");
            //conexPaciente.res.first();
            //codPac = conexPaciente.res.getInt("cliente_id");
            while(res.next())
            {
                codPac = conexPaciente.res.getInt("cliente_id");

            }
        }
        catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, "Error", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Paciente não encontrado");
        }
    }
}
