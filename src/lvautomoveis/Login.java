package lvautomoveis;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        TituloLogin = new javax.swing.JLabel();
        CampoEmail = new javax.swing.JTextField();
        BotaoLoginEntrar = new javax.swing.JButton();
        CampoLoginSenha = new javax.swing.JTextField();
        SubTituloEmail = new javax.swing.JLabel();
        SubTituloSenha = new javax.swing.JLabel();
        BotaoLoginCriarConta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LVAutomóveis");
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(243, 242, 241));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(242, 240, 211));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

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
        Left.setMinimumSize(new java.awt.Dimension(400, 500));

        TituloLogin.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        TituloLogin.setForeground(new java.awt.Color(191, 89, 0));
        TituloLogin.setText("LOGIN");

        CampoEmail.setBackground(new java.awt.Color(242, 240, 211));
        CampoEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CampoEmail.setForeground(new java.awt.Color(51, 51, 51));
        CampoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEmailActionPerformed(evt);
            }
        });

        BotaoLoginEntrar.setBackground(new java.awt.Color(191, 89, 0));
        BotaoLoginEntrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotaoLoginEntrar.setForeground(new java.awt.Color(242, 240, 211));
        BotaoLoginEntrar.setText("Login");

        CampoLoginSenha.setBackground(new java.awt.Color(242, 240, 211));
        CampoLoginSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CampoLoginSenha.setForeground(new java.awt.Color(51, 51, 51));
        CampoLoginSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoLoginSenhaActionPerformed(evt);
            }
        });

        SubTituloEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SubTituloEmail.setForeground(new java.awt.Color(242, 240, 211));
        SubTituloEmail.setText("Email");

        SubTituloSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SubTituloSenha.setForeground(new java.awt.Color(242, 240, 211));
        SubTituloSenha.setText("Senha");

        BotaoLoginCriarConta.setBackground(new java.awt.Color(191, 89, 0));
        BotaoLoginCriarConta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotaoLoginCriarConta.setForeground(new java.awt.Color(242, 240, 211));
        BotaoLoginCriarConta.setText("Criar conta");
        BotaoLoginCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLoginCriarContaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CampoLoginSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addComponent(SubTituloEmail)
                    .addComponent(SubTituloSenha)
                    .addComponent(BotaoLoginEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoLoginCriarConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CampoEmail))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addComponent(TituloLogin)
                .addGap(144, 144, 144))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(TituloLogin)
                .addGap(18, 18, 18)
                .addComponent(SubTituloEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(SubTituloSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoLoginSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(BotaoLoginEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoLoginCriarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
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

        getAccessibleContext().setAccessibleName("LOGIN");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEmailActionPerformed

    private void CampoLoginSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoLoginSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoLoginSenhaActionPerformed

    private void BotaoLoginCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLoginCriarContaActionPerformed
       
         Criar CriarFrame = new Criar();
         CriarFrame.setVisible(true);
         CriarFrame.pack();
         CriarFrame.setLocationRelativeTo(null);
         this.dispose();
    }//GEN-LAST:event_BotaoLoginCriarContaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoLoginCriarConta;
    private javax.swing.JButton BotaoLoginEntrar;
    private javax.swing.JTextField CampoEmail;
    private javax.swing.JTextField CampoLoginSenha;
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JLabel SubTituloEmail;
    private javax.swing.JLabel SubTituloSenha;
    private javax.swing.JLabel TituloLogin;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
