package interfaces;
import javax.swing.JOptionPane;
import java.sql.*;

public class CadastrarUsuario extends javax.swing.JFrame {
    String nome, login, senha, confirm_senha, nivel_acesso;
    int lvlAcess, senha_confirmada;

    public CadastrarUsuario() {
        initComponents();
        nome = login = senha = confirm_senha = nivel_acesso = "";
        lvlAcess = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoLVLAcess = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        BotaoCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CampoNomeUser = new javax.swing.JTextField();
        CampoLoginUser = new javax.swing.JTextField();
        CampoSenhaUser = new javax.swing.JPasswordField();
        CampoConfirmSenhaUser = new javax.swing.JPasswordField();
        BotaoVoltar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        BotaoLVLAcess.setBackground(new java.awt.Color(200, 200, 200));
        BotaoLVLAcess.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        BotaoLVLAcess.setForeground(new java.awt.Color(0, 150, 0));
        BotaoLVLAcess.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nutricionista", "Secretaria" }));
        BotaoLVLAcess.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoLVLAcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLVLAcessActionPerformed(evt);
            }
        });
        BotaoLVLAcess.getAccessibleContext().setAccessibleName("");
        BotaoLVLAcess.getAccessibleContext().setAccessibleDescription("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(200, 200, 200));
        jPanel1.setForeground(new java.awt.Color(0, 150, 0));

        BotaoCadastrar.setBackground(new java.awt.Color(200, 200, 200));
        BotaoCadastrar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        BotaoCadastrar.setForeground(new java.awt.Color(0, 150, 0));
        BotaoCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/folder/EntrarConfirmar.png"))); // NOI18N
        BotaoCadastrar.setText("Cadastrar");
        BotaoCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 150, 0));
        jLabel1.setText("Nome:");

        jLabel2.setBackground(new java.awt.Color(200, 200, 200));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 150, 0));
        jLabel2.setText("Login:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 150, 0));
        jLabel3.setText("Senha:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 150, 0));
        jLabel4.setText("Digite a senha novamente:");

        CampoNomeUser.setBackground(new java.awt.Color(200, 200, 200));
        CampoNomeUser.setForeground(new java.awt.Color(0, 150, 0));

        CampoLoginUser.setBackground(new java.awt.Color(200, 200, 200));
        CampoLoginUser.setForeground(new java.awt.Color(0, 200, 0));

        CampoSenhaUser.setBackground(new java.awt.Color(200, 200, 200));
        CampoSenhaUser.setForeground(new java.awt.Color(0, 150, 0));

        CampoConfirmSenhaUser.setBackground(new java.awt.Color(200, 200, 200));
        CampoConfirmSenhaUser.setForeground(new java.awt.Color(0, 200, 0));

        BotaoVoltar.setBackground(new java.awt.Color(200, 200, 200));
        BotaoVoltar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        BotaoVoltar.setForeground(new java.awt.Color(0, 150, 0));
        BotaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/folder/Voltar.png"))); // NOI18N
        BotaoVoltar.setText("Voltar");
        BotaoVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 150, 0));
        jLabel5.setText("Cadastrar Usuário");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(BotaoVoltar)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(BotaoCadastrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CampoSenhaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoConfirmSenhaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoLoginUser, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(CampoLoginUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CampoSenhaUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CampoConfirmSenhaUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoVoltar)
                    .addComponent(BotaoCadastrar))
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(491, 401));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarActionPerformed
        if(CampoNomeUser.getText().compareTo("") == 0 || CampoLoginUser.getText().compareTo("") == 0 || CampoSenhaUser.getText().compareTo("") == 0 || CampoConfirmSenhaUser.getText().compareTo("") == 0)
        {
            JOptionPane.showMessageDialog(null,"Erro \n Há dados faltando nos campos","Erro", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            nome = CampoNomeUser.getText();
            login = CampoLoginUser.getText();
            senha = CampoSenhaUser.getText();
            confirm_senha = CampoConfirmSenhaUser.getText();
            lvlAcess = BotaoLVLAcess.getSelectedIndex();
            if(lvlAcess == 0)
            {
                nivel_acesso = "nutricionista";
            }
            else if(lvlAcess == 1)
            {
                nivel_acesso = "secretaria";
            }
            if(confirm_senha.equals(senha))
            {
                senha_confirmada = 1;
            }
            else
            {
                senha_confirmada = 2;
                JOptionPane.showMessageDialog(null,"Erro \n As senhas inseridas não são iguais","Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(senha_confirmada == 1)
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetoDB", "root", "");
                Statement stm = con.createStatement();
                stm.executeUpdate("INSERT INTO usuarios(nome_usuario, login_usuario, senha_usuario, nivel_acesso) VALUES('"+nome+"', '"+login+"', '"+senha+"', '"+nivel_acesso+"')");
                JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso", "Concluído", JOptionPane.INFORMATION_MESSAGE);
            }
            catch(ClassNotFoundException ex)
            {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void BotaoLVLAcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLVLAcessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoLVLAcessActionPerformed

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
        principal_nutricionista priN = new principal_nutricionista();
        priN.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.JComboBox<String> BotaoLVLAcess;
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JPasswordField CampoConfirmSenhaUser;
    private javax.swing.JTextField CampoLoginUser;
    private javax.swing.JTextField CampoNomeUser;
    private javax.swing.JPasswordField CampoSenhaUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
