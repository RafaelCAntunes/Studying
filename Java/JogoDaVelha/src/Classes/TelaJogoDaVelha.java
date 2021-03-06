package Classes;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Antunes
 * 09/08/2017
 */
public class TelaJogoDaVelha extends javax.swing.JFrame {

    /**
     * Creates new form TelaJogoDaVelha
     */
    public TelaJogoDaVelha() {
        initComponents();
        
        setLocationRelativeTo(null);//centraliza janela na tela
        
        panJogo.setVisible(false);
         
        lblJogador.setText("<html> Turno do Jogador " + jogador + "(" + jogada + ") </html>");
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panMenu = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        btnNovaPartida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panJogo = new javax.swing.JPanel();
        btnL1C2 = new javax.swing.JButton();
        btnL2C1 = new javax.swing.JButton();
        btnL2C2 = new javax.swing.JButton();
        btnL1C1 = new javax.swing.JButton();
        btnL2C3 = new javax.swing.JButton();
        btnL1C3 = new javax.swing.JButton();
        btnL3C2 = new javax.swing.JButton();
        btnL3C3 = new javax.swing.JButton();
        btnL3C1 = new javax.swing.JButton();
        lblJogador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSair.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnNovaPartida.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnNovaPartida.setText("Novo Jogo");
        btnNovaPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaPartidaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Jogo da Velha");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel2.setText("Created by Rafael Antunes");

        javax.swing.GroupLayout panMenuLayout = new javax.swing.GroupLayout(panMenu);
        panMenu.setLayout(panMenuLayout);
        panMenuLayout.setHorizontalGroup(
            panMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMenuLayout.createSequentialGroup()
                .addGroup(panMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panMenuLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(panMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnNovaPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panMenuLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        panMenuLayout.setVerticalGroup(
            panMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMenuLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNovaPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        btnL1C2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnL1C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnL1C2ActionPerformed(evt);
            }
        });

        btnL2C1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnL2C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnL2C1ActionPerformed(evt);
            }
        });

        btnL2C2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnL2C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnL2C2ActionPerformed(evt);
            }
        });

        btnL1C1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnL1C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnL1C1ActionPerformed(evt);
            }
        });

        btnL2C3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnL2C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnL2C3ActionPerformed(evt);
            }
        });

        btnL1C3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnL1C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnL1C3ActionPerformed(evt);
            }
        });

        btnL3C2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnL3C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnL3C2ActionPerformed(evt);
            }
        });

        btnL3C3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnL3C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnL3C3ActionPerformed(evt);
            }
        });

        btnL3C1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnL3C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnL3C1ActionPerformed(evt);
            }
        });

        lblJogador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblJogador.setText("Turno do Jogador X");

        javax.swing.GroupLayout panJogoLayout = new javax.swing.GroupLayout(panJogo);
        panJogo.setLayout(panJogoLayout);
        panJogoLayout.setHorizontalGroup(
            panJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panJogoLayout.createSequentialGroup()
                .addGroup(panJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panJogoLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(panJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panJogoLayout.createSequentialGroup()
                                .addComponent(btnL2C1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnL2C2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnL2C3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panJogoLayout.createSequentialGroup()
                                .addComponent(btnL1C1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnL1C2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnL1C3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panJogoLayout.createSequentialGroup()
                                .addComponent(btnL3C1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnL3C2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnL3C3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panJogoLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(lblJogador)))
                .addGap(86, 86, 86))
        );
        panJogoLayout.setVerticalGroup(
            panJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panJogoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnL1C2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnL1C1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnL1C3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnL2C1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnL2C2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnL2C3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnL3C2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnL3C3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnL3C1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addComponent(panMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnL1C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnL1C1ActionPerformed
       
        linha = 0;
        coluna = 0;
        houveJogada = movimento();
        if (houveJogada==true)
        {
             btnL1C1.setText(Character.toString(jogada));
            vitoria();
        }
    }//GEN-LAST:event_btnL1C1ActionPerformed

    private void btnL1C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnL1C2ActionPerformed
       linha = 0;
        coluna = 1;
        houveJogada = movimento();
        if (houveJogada==true)
        {
            btnL1C2.setText(Character.toString(jogada));
            vitoria();
        }
    }//GEN-LAST:event_btnL1C2ActionPerformed

    private void btnL1C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnL1C3ActionPerformed
         linha = 0;
        coluna = 2;
        houveJogada = movimento();
        if (houveJogada==true)
        {
             btnL1C3.setText(Character.toString(jogada));
            vitoria();
        }
    }//GEN-LAST:event_btnL1C3ActionPerformed

    private void btnL2C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnL2C1ActionPerformed
        linha = 1;
        coluna = 0;
        houveJogada = movimento();
        if (houveJogada==true)
        {
             btnL2C1.setText(Character.toString(jogada));
            vitoria();
        }
    }//GEN-LAST:event_btnL2C1ActionPerformed

    private void btnL2C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnL2C2ActionPerformed
     linha = 1;
        coluna = 1;
        houveJogada = movimento();
        if (houveJogada==true)
        {
             btnL2C2.setText(Character.toString(jogada));
            vitoria();
        }
    }//GEN-LAST:event_btnL2C2ActionPerformed

    private void btnL2C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnL2C3ActionPerformed
    linha = 1;
        coluna = 2;
        houveJogada = movimento();
        if (houveJogada==true)
        {
             btnL2C3.setText(Character.toString(jogada));
            vitoria();
        }
    }//GEN-LAST:event_btnL2C3ActionPerformed

    private void btnL3C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnL3C1ActionPerformed
       linha = 2;
        coluna = 0;
        houveJogada = movimento();
        if (houveJogada==true)
        {
             btnL3C1.setText(Character.toString(jogada));
            vitoria();
        }
    }//GEN-LAST:event_btnL3C1ActionPerformed

    private void btnL3C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnL3C2ActionPerformed
   linha = 2;
        coluna = 1;
        houveJogada = movimento();
        if (houveJogada==true)
        {
             btnL3C2.setText(Character.toString(jogada));
            vitoria();
        }
    }//GEN-LAST:event_btnL3C2ActionPerformed

    private void btnL3C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnL3C3ActionPerformed
         linha = 2;
        coluna = 2;
        houveJogada = movimento();
        if (houveJogada==true)
        {
             btnL3C3.setText(Character.toString(jogada));
            vitoria();
        }
    }//GEN-LAST:event_btnL3C3ActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnNovaPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaPartidaActionPerformed
    limpaTela();
    panMenu.setVisible(false);
    panJogo.setVisible(true);
    }//GEN-LAST:event_btnNovaPartidaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaJogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogoDaVelha().setVisible(true);
            }
        });
        
    /* for (int x = 0; x<3; x++){       // for usado para "limpar" vetor assim que inicia partida
         for (int y = 0; y<3; y++ ){
             jogo[x][y]=' ';
         }
        
     }
     */
}
 static char jogo[][] = new char[3][3];
 static char jogada='X';
static int i = 0, jogador = 1, linha = 0, coluna = 0;
static boolean houveJogada;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnL1C1;
    private javax.swing.JButton btnL1C2;
    private javax.swing.JButton btnL1C3;
    private javax.swing.JButton btnL2C1;
    private javax.swing.JButton btnL2C2;
    private javax.swing.JButton btnL2C3;
    private javax.swing.JButton btnL3C1;
    private javax.swing.JButton btnL3C2;
    private javax.swing.JButton btnL3C3;
    private javax.swing.JButton btnNovaPartida;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblJogador;
    private javax.swing.JPanel panJogo;
    private javax.swing.JPanel panMenu;
    // End of variables declaration//GEN-END:variables

    public static boolean movimento (){
               
      if (jogo[linha][coluna]==' '){
      jogo[linha][coluna] = jogada;
      i++;
      }
      else{
          JOptionPane.showMessageDialog(null, "<html>Espaço já ocupado, favor escolher outra opção</html>");
          return false;
      }
      
      return true;
 }

        public  void vitoria(){
    if(  (jogo[0][0] == jogada && jogo[0][1] == jogada && jogo[0][2] == jogada) || //primeira linha 
         (jogo[1][0] == jogada && jogo[1][1] == jogada && jogo[1][2] == jogada) || //segunda linha 
         (jogo[2][0] == jogada && jogo[2][1] == jogada && jogo[2][2] == jogada) || //terceira linha
         (jogo[0][0] == jogada && jogo[1][0] == jogada && jogo[2][0] == jogada) || //primera coluna
         (jogo[0][1] == jogada && jogo[1][1] == jogada && jogo[2][1] == jogada) || //segunda coluna
         (jogo[0][2] == jogada && jogo[1][2] == jogada && jogo[2][2] == jogada) || //terceira coluna
         (jogo[0][0] == jogada && jogo[1][1] == jogada && jogo[2][2] == jogada) || // diagonal \
         (jogo[0][2] == jogada && jogo[1][1] == jogada && jogo[2][0] == jogada))   // diagonal /
      {
      JOptionPane.showMessageDialog(null,"<html>Parabéns Jogador " + jogador + " você venceu!</html>");
     
      perguntaJogarNovamente();
    }
      else if (i==9)
      {
      JOptionPane.showMessageDialog(null, "<html> O jogo empatou...</html>");
      perguntaJogarNovamente();
      }
      else
      {
            if (jogador == 1)
            {
             jogador = 2;
             jogada = 'O';
            }
             
            else
            {
             jogador = 1;
             jogada = 'X';
            }
      lblJogador.setText("<html> Turno do Jogador " + jogador + "(" + jogada + ") </html>");          
      }
     
    }
     
        public void limpaTela(){ //Limpa todos os botões, a matriz e o "contador de jogadas"
      i=0;
      btnL1C1.setText(" ");
      btnL1C2.setText(" ");
      btnL1C3.setText(" ");
      btnL2C1.setText(" ");
      btnL2C2.setText(" ");
      btnL2C3.setText(" ");
      btnL3C1.setText(" ");
      btnL3C2.setText(" ");
      btnL3C3.setText(" ");
      
      for (int x = 0; x<3; x++){
         for (int y = 0; y<3; y++ ){
             jogo[x][y]=' ';
         }
        }
     }
        public void perguntaJogarNovamente()
        {
       int restart = JOptionPane.showConfirmDialog (null, "Quer jogar novamente?","Hey!", JOptionPane.YES_NO_OPTION); //por isso num método separado após confirmar funcionamento
      if (restart == JOptionPane.NO_OPTION)
      {
          System.exit(0);
      }
      else{
      limpaTela();
      }
        }
}
