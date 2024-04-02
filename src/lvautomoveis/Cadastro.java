package lvautomoveis;
public class Cadastro extends javax.swing.JFrame {
    public Cadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        TituloCadastro = new javax.swing.JLabel();
        SubTituloNomeCadastro = new javax.swing.JLabel();
        CampoNomeCompleto = new javax.swing.JTextField();
        CampoCadastroEmail = new javax.swing.JTextField();
        SubTituloCadastroEmail = new javax.swing.JLabel();
        SubTituloCadastroSenha = new javax.swing.JLabel();
        CampoCadastroSenha = new javax.swing.JPasswordField();
        BotaoCadastroEntrar = new javax.swing.JButton();
        BotaoCadastroTenhoConta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Criar Conta");
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(242, 240, 211));

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel1.add(Right);
        Right.setBounds(0, 0, 400, 500);

        Left.setBackground(new java.awt.Color(25, 25, 26));

        TituloCadastro.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        TituloCadastro.setForeground(new java.awt.Color(191, 89, 0));
        TituloCadastro.setText("Cadastro");

        SubTituloNomeCadastro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SubTituloNomeCadastro.setForeground(new java.awt.Color(242, 240, 211));
        SubTituloNomeCadastro.setText("Nome Completo");

        CampoNomeCompleto.setBackground(new java.awt.Color(242, 240, 211));
        CampoNomeCompleto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        CampoCadastroEmail.setBackground(new java.awt.Color(242, 240, 211));

        SubTituloCadastroEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SubTituloCadastroEmail.setForeground(new java.awt.Color(242, 240, 211));
        SubTituloCadastroEmail.setText("Email");

        SubTituloCadastroSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SubTituloCadastroSenha.setForeground(new java.awt.Color(242, 240, 211));
        SubTituloCadastroSenha.setText("Senha");

        CampoCadastroSenha.setBackground(new java.awt.Color(242, 240, 211));

        BotaoCadastroEntrar.setBackground(new java.awt.Color(191, 89, 0));
        BotaoCadastroEntrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotaoCadastroEntrar.setForeground(new java.awt.Color(242, 240, 211));
        BotaoCadastroEntrar.setText("Criar");

        BotaoCadastroTenhoConta.setBackground(new java.awt.Color(191, 89, 0));
        BotaoCadastroTenhoConta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotaoCadastroTenhoConta.setForeground(new java.awt.Color(242, 240, 211));
        BotaoCadastroTenhoConta.setText("Já tenho conta");

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(TituloCadastro)
                .addGap(116, 116, 116))
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SubTituloNomeCadastro)
                    .addComponent(CampoNomeCompleto)
                    .addComponent(CampoCadastroEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addComponent(SubTituloCadastroEmail)
                    .addComponent(SubTituloCadastroSenha)
                    .addComponent(CampoCadastroSenha)
                    .addComponent(BotaoCadastroEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoCadastroTenhoConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(TituloCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SubTituloNomeCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SubTituloCadastroEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoCadastroEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SubTituloCadastroSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoCadastroSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(BotaoCadastroEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoCadastroTenhoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jPanel1.add(Left);
        Left.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastroEntrar;
    private javax.swing.JButton BotaoCadastroTenhoConta;
    private javax.swing.JTextField CampoCadastroEmail;
    private javax.swing.JPasswordField CampoCadastroSenha;
    private javax.swing.JTextField CampoNomeCompleto;
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JLabel SubTituloCadastroEmail;
    private javax.swing.JLabel SubTituloCadastroSenha;
    private javax.swing.JLabel SubTituloNomeCadastro;
    private javax.swing.JLabel TituloCadastro;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
