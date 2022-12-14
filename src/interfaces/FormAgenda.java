/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gbdso
 */
public class FormAgenda extends javax.swing.JFrame {
    BeansAgenda agenda = new BeansAgenda();
    String nome, ID, cpf;
    double ID1, CPF1;
    /**
     * Creates new form FormAgenda
     */
    public FormAgenda() {
        initComponents();
        preencherNutricionistas();
        nome = ID = cpf = "";
        ID1 = CPF1 = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaCLientes = new javax.swing.JTable();
        BarraPesquisa = new javax.swing.JTextField();
        PesquisaIDCLiente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BotaoBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        EscolherData = new com.toedter.calendar.JDateChooser();
        BotaoCancelarAgendamento = new javax.swing.JButton();
        BotaoFinalizarAgendamento = new javax.swing.JButton();
        ComboBoxNutricionista = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(200, 200, 200));

        TabelaCLientes.setBackground(new java.awt.Color(200, 200, 200));
        TabelaCLientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 126, 140), 2));
        TabelaCLientes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TabelaCLientes.setForeground(new java.awt.Color(0, 150, 0));
        TabelaCLientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaCLientes.setSelectionBackground(new java.awt.Color(153, 153, 153));
        TabelaCLientes.getTableHeader().setReorderingAllowed(false);
        TabelaCLientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaCLientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaCLientes);

        BarraPesquisa.setBackground(new java.awt.Color(200, 200, 200));
        BarraPesquisa.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        BarraPesquisa.setForeground(new java.awt.Color(0, 150, 0));
        BarraPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarraPesquisaActionPerformed(evt);
            }
        });

        PesquisaIDCLiente.setBackground(new java.awt.Color(200, 200, 200));
        PesquisaIDCLiente.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        PesquisaIDCLiente.setForeground(new java.awt.Color(200, 200, 200));
        PesquisaIDCLiente.setUI(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 150, 0));
        jLabel1.setText("Agendamento");

        jLabel2.setForeground(new java.awt.Color(0, 150, 0));
        jLabel2.setText("Paciente:");

        BotaoBuscar.setBackground(new java.awt.Color(200, 200, 200));
        BotaoBuscar.setForeground(new java.awt.Color(0, 150, 0));
        BotaoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/folder/Buscar.png"))); // NOI18N
        BotaoBuscar.setText("Buscar");
        BotaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoBuscarActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 150, 0));
        jLabel3.setText("Nutricionista:");

        jLabel4.setForeground(new java.awt.Color(0, 150, 0));
        jLabel4.setText("Data:");

        EscolherData.setBackground(new java.awt.Color(200, 200, 200));
        EscolherData.setForeground(new java.awt.Color(0, 150, 0));
        EscolherData.setToolTipText("");

        BotaoCancelarAgendamento.setBackground(new java.awt.Color(200, 200, 200));
        BotaoCancelarAgendamento.setForeground(new java.awt.Color(0, 150, 0));
        BotaoCancelarAgendamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/folder/EntrarCancelar.png"))); // NOI18N
        BotaoCancelarAgendamento.setText("Cancelar Agendamento");
        BotaoCancelarAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarAgendamentoActionPerformed(evt);
            }
        });

        BotaoFinalizarAgendamento.setBackground(new java.awt.Color(200, 200, 200));
        BotaoFinalizarAgendamento.setForeground(new java.awt.Color(0, 150, 0));
        BotaoFinalizarAgendamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/folder/EntrarConfirmar.png"))); // NOI18N
        BotaoFinalizarAgendamento.setText("Finzalizar Agendamento");
        BotaoFinalizarAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFinalizarAgendamentoActionPerformed(evt);
            }
        });

        ComboBoxNutricionista.setBackground(new java.awt.Color(200, 200, 200));
        ComboBoxNutricionista.setForeground(new java.awt.Color(0, 150, 0));
        ComboBoxNutricionista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(335, 335, 335))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(PesquisaIDCLiente, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(BarraPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoBuscar)
                        .addGap(2, 2, 2))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BotaoCancelarAgendamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoFinalizarAgendamento)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxNutricionista, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EscolherData, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(89, 89, 89))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PesquisaIDCLiente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BarraPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ComboBoxNutricionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addComponent(EscolherData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoFinalizarAgendamento)
                    .addComponent(BotaoCancelarAgendamento))
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(750, 567));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void consultaDados(String sql) 
    {
        try 
        {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/projetoDB", "root", "");
            PreparedStatement banco = (PreparedStatement) con.prepareStatement(sql);
            banco.execute();
            ResultSet dados = banco.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel) TabelaCLientes.getModel();
            model.setNumRows(0);

            while (dados.next()) 
            {
                model.addRow(new Object[]
                {
                    dados.getString("cliente_id"),
                    dados.getString("nome_cliente"),
                    dados.getString("cpf_cliente"),
                });
                ID = dados.getString("cliente_id");
                ID1 = Double.parseDouble(ID);
                nome = dados.getString("nome_cliente");
                cpf = dados.getString("cpf_cliente");
                CPF1 = Double.parseDouble(cpf);   
            }
            banco.close();
            con.close();
        } 
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void preencherNutricionistas()
    {
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetoDB", "root", "");
            Statement stm = con.createStatement();
            ResultSet res = stm.executeQuery("SELECT * FROM usuarios ORDER BY nome_usuario");
            ComboBoxNutricionista.removeAllItems();
            while(res.next())
            {
                ComboBoxNutricionista.addItem(res.getString("nome_usuario"));
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        }   
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.consultaDados("SELECT * FROM cliente ORDER BY nome_cliente");
    }//GEN-LAST:event_formWindowOpened

    private void BotaoFinalizarAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFinalizarAgendamentoActionPerformed
        /*agenda.setNomePac(BarraPesquisa.getText());
        agenda.setNomeNutricionista((String) ComboBoxNutricionista.getSelectedItem());
        agenda.setData(EscolherData.getDate());
        agenda.setStatus("Aberto");
        DaoAgenda dao = new DaoAgenda();
        dao.Salvar(agenda);*/
        //JOptionPane.showMessageDialog(null,"Agendamento realizado com sucesso!");
    }//GEN-LAST:event_BotaoFinalizarAgendamentoActionPerformed

    private void BotaoCancelarAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarAgendamentoActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotaoCancelarAgendamentoActionPerformed

    private void BotaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoBuscarActionPerformed
        this.consultaDados("SELECT * FROM cliente WHERE nome_cliente = '"+BarraPesquisa.getText()+"' ORDER BY nome_cliente");
    }//GEN-LAST:event_BotaoBuscarActionPerformed

    private void BarraPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarraPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BarraPesquisaActionPerformed

    private void TabelaCLientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaCLientesMouseClicked
        BarraPesquisa.setText(TabelaCLientes.getValueAt(TabelaCLientes.getSelectedRow(), 1).toString());
        PesquisaIDCLiente.setText(TabelaCLientes.getValueAt(TabelaCLientes.getSelectedRow(), 0).toString());
    }//GEN-LAST:event_TabelaCLientesMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BarraPesquisa;
    private javax.swing.JButton BotaoBuscar;
    private javax.swing.JButton BotaoCancelarAgendamento;
    private javax.swing.JButton BotaoFinalizarAgendamento;
    private javax.swing.JComboBox<String> ComboBoxNutricionista;
    private com.toedter.calendar.JDateChooser EscolherData;
    private javax.swing.JTextField PesquisaIDCLiente;
    private javax.swing.JTable TabelaCLientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
