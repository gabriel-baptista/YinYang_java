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
 * @author rodri
 */
public class PerfilPacientePaciente extends javax.swing.JFrame 
{
    /**
     * Creates new form PerfilPacienteNutri
     * @param ID1
     * @param CPF1
     */
    public String id;
    public double id1;
    String cpf, idade, massa_magra, massa_gorda, peso_atual, peso_inicial, sexo, desjejum_id, almoco_id, lanche_tarde_id, jantar_id, ceia_id, cliente_id, desjejum_cliente, almoco_cliente, lanche_cliente, jantar_cliente, ceia_cliente, desjejum_op1, desjejum_op2, desjejum_op3, almoco_op1, almoco_op2, almoco_op3, lanche_op1, lanche_op2, lanche_op3, jantar_op1, jantar_op2, jantar_op3, ceia_op1, ceia_op2, ceia_op3;
    double cpf1, idade1, massa_magra1, massa_gorda1, peso_atual1, peso_inicial1, desjejum_id1, almoco_id1, lanche_tarde_id1, jantar_id1, ceia_id1, cliente_id1, desjejum_cliente1, almoco_cliente1, lanche_cliente1, jantar_cliente1, ceia_cliente1;
    
    public PerfilPacientePaciente(double id1) 
    {
        initComponents();
        id = idade = cpf = massa_magra = massa_gorda = peso_atual = peso_inicial = sexo = desjejum_id = almoco_id = lanche_tarde_id = jantar_id = ceia_id = cliente_id = desjejum_op1 = desjejum_op2 = desjejum_op3 = almoco_op1 = almoco_op2 = almoco_op3 = lanche_op1 = lanche_op2 = lanche_op3 = jantar_op1 = jantar_op2 = jantar_op3 = ceia_op1 = ceia_op2 = ceia_op3 = "";
        id1 = idade1 = cpf1 = massa_magra1 = massa_gorda1 = peso_atual1 = peso_inicial1 = desjejum_id1 = almoco_id1 = lanche_tarde_id1 = jantar_id1 = ceia_id1 = cliente_id1 = 0;
    }
    
    public void Exportarid_perfilcliente(id_cliente model1)
    {
        CampoId_Cliente.setText(model1.getid_cliente());
        id = CampoId_Cliente.getText();
        id1 = Double.parseDouble(id);
    }
    
    public void ExportarNome(cliente model)
    {
        nome.setText(model.getcliente());
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
        LabelSexo = new javax.swing.JLabel();
        LabelPesoInicial = new javax.swing.JLabel();
        LabelPesoAtual = new javax.swing.JLabel();
        LabelMassaMagra = new javax.swing.JLabel();
        LabelMassaGorda = new javax.swing.JLabel();
        LabelIdade = new javax.swing.JLabel();
        CampoIdade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        CampoId_Cliente = new javax.swing.JTextField();
        CampoSexo = new javax.swing.JTextField();
        CampoPesoInicial = new javax.swing.JTextField();
        CampoPesoAtual = new javax.swing.JTextField();
        CampoMassaMagra = new javax.swing.JTextField();
        CampoMassaGorda = new javax.swing.JTextField();
        LabelId_Cliente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BotaoHome = new javax.swing.JButton();
        jLabelCPF = new javax.swing.JLabel();
        CampoCPF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaPlanoAlimentar = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(200, 200, 200));
        jPanel1.setForeground(new java.awt.Color(0, 150, 0));

        LabelSexo.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        LabelSexo.setForeground(new java.awt.Color(0, 150, 0));
        LabelSexo.setText("Sexo:");

        LabelPesoInicial.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        LabelPesoInicial.setForeground(new java.awt.Color(0, 150, 0));
        LabelPesoInicial.setText("Peso Inicial:");

        LabelPesoAtual.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        LabelPesoAtual.setForeground(new java.awt.Color(0, 150, 0));
        LabelPesoAtual.setText("Peso Atual: ");

        LabelMassaMagra.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        LabelMassaMagra.setForeground(new java.awt.Color(0, 150, 0));
        LabelMassaMagra.setText("Massa Magra: ");

        LabelMassaGorda.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        LabelMassaGorda.setForeground(new java.awt.Color(0, 150, 0));
        LabelMassaGorda.setText("Massa Gorda: ");

        LabelIdade.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        LabelIdade.setForeground(new java.awt.Color(0, 150, 0));
        LabelIdade.setText("Idade:");

        CampoIdade.setEditable(false);
        CampoIdade.setBackground(new java.awt.Color(215, 215, 215));
        CampoIdade.setForeground(new java.awt.Color(0, 150, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 150, 0));
        jLabel1.setText("Plano Alimentar:");

        CampoId_Cliente.setEditable(false);
        CampoId_Cliente.setBackground(new java.awt.Color(215, 215, 215));
        CampoId_Cliente.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        CampoId_Cliente.setForeground(new java.awt.Color(0, 150, 0));
        CampoId_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoId_ClienteActionPerformed(evt);
            }
        });

        CampoSexo.setEditable(false);
        CampoSexo.setBackground(new java.awt.Color(215, 215, 215));
        CampoSexo.setForeground(new java.awt.Color(0, 150, 0));

        CampoPesoInicial.setEditable(false);
        CampoPesoInicial.setBackground(new java.awt.Color(215, 215, 215));
        CampoPesoInicial.setForeground(new java.awt.Color(0, 150, 0));

        CampoPesoAtual.setEditable(false);
        CampoPesoAtual.setBackground(new java.awt.Color(215, 215, 215));
        CampoPesoAtual.setForeground(new java.awt.Color(0, 150, 0));

        CampoMassaMagra.setEditable(false);
        CampoMassaMagra.setBackground(new java.awt.Color(215, 215, 215));

        CampoMassaGorda.setEditable(false);
        CampoMassaGorda.setBackground(new java.awt.Color(215, 215, 215));
        CampoMassaGorda.setForeground(new java.awt.Color(0, 150, 0));

        LabelId_Cliente.setBackground(new java.awt.Color(200, 200, 200));
        LabelId_Cliente.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        LabelId_Cliente.setForeground(new java.awt.Color(0, 150, 0));
        LabelId_Cliente.setText("Id");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 150, 0));
        jLabel2.setText("kg");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 150, 0));
        jLabel3.setText("kg");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 150, 0));
        jLabel4.setText("kg");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 150, 0));
        jLabel5.setText("kg");

        BotaoHome.setBackground(new java.awt.Color(215, 215, 215));
        BotaoHome.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        BotaoHome.setForeground(new java.awt.Color(0, 150, 0));
        BotaoHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/folder/Home.png"))); // NOI18N
        BotaoHome.setText("Home");
        BotaoHome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoHomeActionPerformed(evt);
            }
        });

        jLabelCPF.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelCPF.setForeground(new java.awt.Color(0, 150, 0));
        jLabelCPF.setText("CPF:");

        CampoCPF.setEditable(false);
        CampoCPF.setBackground(new java.awt.Color(215, 215, 215));
        CampoCPF.setForeground(new java.awt.Color(0, 150, 0));
        CampoCPF.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TabelaPlanoAlimentar.setBackground(new java.awt.Color(215, 215, 215));
        TabelaPlanoAlimentar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 126, 140), 2));
        TabelaPlanoAlimentar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TabelaPlanoAlimentar.setForeground(new java.awt.Color(0, 150, 0));
        TabelaPlanoAlimentar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Opção 1", "Opção 2 ", "Opção 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaPlanoAlimentar.setSelectionBackground(new java.awt.Color(153, 153, 153));
        TabelaPlanoAlimentar.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TabelaPlanoAlimentar);

        jLabel9.setForeground(new java.awt.Color(0, 150, 0));
        jLabel9.setText("Jantar");

        jLabel8.setForeground(new java.awt.Color(0, 150, 0));
        jLabel8.setText("Lanche da tarde");

        jLabel7.setForeground(new java.awt.Color(0, 150, 0));
        jLabel7.setText("Almoço");

        jLabel6.setForeground(new java.awt.Color(0, 150, 0));
        jLabel6.setText("Desjejum");

        nome.setEditable(false);
        nome.setBackground(new java.awt.Color(200, 200, 200));
        nome.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        nome.setForeground(new java.awt.Color(0, 150, 0));
        nome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nome.setBorder(null);
        nome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotaoHome)
                .addGap(0, 655, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabelMassaMagra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelId_Cliente)
                            .addComponent(CampoId_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelSexo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CampoMassaMagra, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addComponent(CampoSexo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LabelIdade)
                                        .addComponent(LabelPesoInicial)
                                        .addComponent(CampoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CampoPesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(72, 72, 72))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LabelMassaGorda)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(CampoMassaGorda, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel2)))
                                    .addGap(58, 58, 58)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel5)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelPesoAtual)
                            .addComponent(CampoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CampoPesoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabelCPF)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(0, 620, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(nome, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotaoHome)
                .addGap(18, 18, 18)
                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelId_Cliente)
                    .addComponent(LabelIdade)
                    .addComponent(jLabelCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoId_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelPesoAtual)
                            .addComponent(LabelSexo))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LabelMassaMagra)
                                    .addComponent(LabelMassaGorda))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CampoMassaMagra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CampoPesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(CampoPesoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CampoMassaGorda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel9))))
                    .addComponent(LabelPesoInicial))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(769, 524));
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
            while (dados.next()) 
            {
                
                idade = dados.getString("idade_cliente");
                idade1 = Double.parseDouble(idade);
                cpf = dados.getString("cpf_cliente");
                cpf1 = Double.parseDouble(cpf);
                sexo = dados.getString("sexo_cliente");
                peso_inicial = dados.getString("peso_cliente");
                peso_inicial1 = Double.parseDouble(peso_inicial);
                peso_atual = dados.getString("peso_atual");
                peso_atual1 = Double.parseDouble(peso_atual);
                massa_magra = dados.getString("massa_magra");
                massa_magra1 = Double.parseDouble(massa_magra);
                massa_gorda = dados.getString("massa_gorda");  
                massa_gorda1 = Double.parseDouble(massa_gorda); 
                
                CampoIdade.setText(idade);
                CampoCPF.setText(cpf);
                CampoSexo.setText(sexo);
                CampoPesoInicial.setText(peso_inicial);
                CampoPesoAtual.setText(peso_atual);
                CampoMassaMagra.setText(massa_magra);
                CampoMassaGorda.setText(massa_gorda);
                
               
            }
            con.close();
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void consultaDadosTabela(String sql)
    {
        try 
        {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/projetoDB", "root", "");
            PreparedStatement banco = (PreparedStatement) con.prepareStatement(sql);
            banco.execute();
            ResultSet dadoss = banco.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel) TabelaPlanoAlimentar.getModel();
            model.setNumRows(0);

            while (dadoss.next()) 
            {
                model.addRow(new Object[]
                {
                    dadoss.getString("de.opcao1"),
                    dadoss.getString("de.opcao2"),
                    dadoss.getString("de.opcao3"),
                });
                model.addRow(new Object[]
                {
                    dadoss.getString("al.opcao1"),
                    dadoss.getString("al.opcao2"),
                    dadoss.getString("al.opcao3"),
                });
                model.addRow(new Object[]
                {
                    dadoss.getString("la.opcao1"),
                    dadoss.getString("la.opcao2"),
                    dadoss.getString("la.opcao3"),
                });
                model.addRow(new Object[]
                {
                    dadoss.getString("ja.opcao1"),
                    dadoss.getString("ja.opcao2"),
                    dadoss.getString("ja.opcao3"),
                });
                model.addRow(new Object[]
                {
                    dadoss.getString("ce.opcao1"),
                    dadoss.getString("ce.opcao2"),
                    dadoss.getString("ce.opcao3"),
                });
                
                 //desjejum_id, almoco_id, lanche_tarde_id, jantar_id, ceia_id, cliente_id
                cliente_id = dadoss.getString("id_cliente");
                cliente_id1 = Double.parseDouble("id_cliente");
                desjejum_id = dadoss.getString("desjejum_id");
                desjejum_id1 = Double.parseDouble(desjejum_id);
                desjejum_op1 = dadoss.getString("de.opcao1");
                desjejum_op2 = dadoss.getString("de.opcao2");
                desjejum_op3 = dadoss.getString("de.opcao3");
                        
                almoco_id = dadoss.getString("almoco_id");
                almoco_id1 = Double.parseDouble(almoco_id);
                almoco_op1 = dadoss.getString("al.opcao1");
                almoco_op2 = dadoss.getString("al.opcao2");
                almoco_op3 = dadoss.getString("al.opcao3");
                
                lanche_tarde_id = dadoss.getString("lanche_tarde_id");
                lanche_tarde_id1 = Double.parseDouble(lanche_tarde_id);
                lanche_op1 = dadoss.getString("la.opcao1");
                lanche_op2 = dadoss.getString("la.opcao2");
                lanche_op3 = dadoss.getString("la.opcao3");
                
                jantar_id = dadoss.getString("jantar_id");
                jantar_id1 = Double.parseDouble(jantar_id);
                jantar_op1 = dadoss.getString("ja.opcao1");
                jantar_op2 = dadoss.getString("ja.opcao2");
                jantar_op3 = dadoss.getString("ja.opcao3");
                
                ceia_id = dadoss.getString("ceia_id");
                ceia_id1 = Double.parseDouble(ceia_id);
                ceia_op1 = dadoss.getString("ce.opcao1");
                ceia_op2 = dadoss.getString("ce.opcao2");
                ceia_op3 = dadoss.getString("ce.opcao3"); 
            }
            banco.close();
            con.close();
        } 
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error", ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.consultaDados("SELECT * FROM cliente WHERE cliente_id = '"+id1+"'");
        this.consultaDadosTabela("SELECT c.cliente_id, c.nome_cliente, de.desjejum_id, de.id_cliente, de.opcao1, de.opcao2, de.opcao3, al.almoco_id, al.id_cliente, al.opcao1, \n" +
                            "al.opcao2, al.opcao3, la.lancheTarde_id, la.id_cliente, la.opcao1, la.opcao2, la.opcao3, ja.jantar_id, ja.id_cliente, ja.opcao1, ja.opcao2, \n" +
                            "ja.opcao3, ce.ceia_id, ce.id_cliente, ce.opcao1, ce.opcao2, ce.opcao3 FROM cliente AS c\n" +
                            "INNER JOIN desjejum AS de ON c.cliente_id = '"+id1+"' AND c.cliente_id = de.id_cliente AND de.opcao1 = de.opcao1 AND de.opcao2 = de.opcao2 AND de.opcao3 = de.opcao3\n" +
                            "INNER JOIN almoco AS al ON c.cliente_id = al.id_cliente AND al.opcao1 = al.opcao1 AND al.opcao2 = al.opcao2 AND al.opcao3 = al.opcao3\n" +
                            "INNER JOIN lancheTarde AS la ON c.cliente_id = la.id_cliente AND la.opcao1 = la.opcao1 AND la.opcao2 = la.opcao2 AND la.opcao3 = la.opcao3\n" +
                            "INNER JOIN jantar AS ja ON c.cliente_id = ja.id_cliente AND ja.opcao1 = ja.opcao1 AND ja.opcao2 = ja.opcao2 AND ja.opcao3 = ja.opcao3\n" +
                            "INNER JOIN ceia AS ce ON c.cliente_id = ce.id_cliente AND ce.opcao1 = ce.opcao1 AND ce.opcao2 = ce.opcao2 AND ce.opcao3 = ce.opcao3;");
        
    }//GEN-LAST:event_formWindowOpened

    private void BotaoHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoHomeActionPerformed
        principal_paciente PriP = new principal_paciente(id1);
        PriP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoHomeActionPerformed

    private void CampoId_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoId_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoId_ClienteActionPerformed

    private void TabelaPlanoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaPlanoMouseClicked
       
    }//GEN-LAST:event_TabelaPlanoMouseClicked

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoHome;
    private javax.swing.JTextField CampoCPF;
    private javax.swing.JTextField CampoId_Cliente;
    private javax.swing.JTextField CampoIdade;
    private javax.swing.JTextField CampoMassaGorda;
    private javax.swing.JTextField CampoMassaMagra;
    private javax.swing.JTextField CampoPesoAtual;
    private javax.swing.JTextField CampoPesoInicial;
    private javax.swing.JTextField CampoSexo;
    private javax.swing.JLabel LabelId_Cliente;
    private javax.swing.JLabel LabelIdade;
    private javax.swing.JLabel LabelMassaGorda;
    private javax.swing.JLabel LabelMassaMagra;
    private javax.swing.JLabel LabelPesoAtual;
    private javax.swing.JLabel LabelPesoInicial;
    private javax.swing.JLabel LabelSexo;
    private javax.swing.JTable TabelaPlanoAlimentar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nome;
    // End of variables declaration//GEN-END:variables
}