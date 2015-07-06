/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.amil.conversorcsv.view;

import br.com.amil.conversorcsv.controller.RelatorioController;
import br.com.amil.conversorcsv.model.Relatorio;
import br.com.amil.conversorcsv.util.Util;
import java.io.File;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    List<Relatorio> relatorios;
    File arquivoSelecionado;

    public Principal() {

        initComponents();
        habilitaLabels(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jButtonVisualizarDados = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelFilename = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaLog = new javax.swing.JTextArea();
        jButtonCarregarArquivo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemSelecionarArquivo = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor Arquivo");
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(603, 455));
        setMinimumSize(new java.awt.Dimension(603, 455));
        setResizable(false);
        getContentPane().setLayout(null);

        jButtonVisualizarDados.setText("Visualizar Dados");
        jButtonVisualizarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarDadosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVisualizarDados);
        jButtonVisualizarDados.setBounds(380, 70, 160, 40);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel1.setText("Arquivo Selecionado: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 30, 160, 18);

        jLabelFilename.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabelFilename.setText("jLabel2");
        getContentPane().add(jLabelFilename);
        jLabelFilename.setBounds(20, 60, 330, 18);

        jTextAreaLog.setColumns(20);
        jTextAreaLog.setRows(5);
        jScrollPane1.setViewportView(jTextAreaLog);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 170, 540, 240);

        jButtonCarregarArquivo.setText("Carregar Arquivo");
        jButtonCarregarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarregarArquivoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCarregarArquivo);
        jButtonCarregarArquivo.setBounds(380, 20, 160, 40);

        jMenu1.setText("Operação");

        jMenuItemSelecionarArquivo.setText("Selecionar Arquivo");
        jMenuItemSelecionarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSelecionarArquivoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSelecionarArquivo);

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSelecionarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSelecionarArquivoActionPerformed

        int returnVal = jFileChooser1.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {

            arquivoSelecionado = jFileChooser1.getSelectedFile();
            appendLista("Arquivo Selecionado");
            habilitaLabels(true);

        } else {
             appendLista("Acesso a arquivo cancelado pelo usuário.");
        }
    }//GEN-LAST:event_jMenuItemSelecionarArquivoActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        int opcao = JOptionPane.showConfirmDialog(this, "Sair?", "Confirma Sair?", JOptionPane.YES_NO_OPTION);

        if (opcao == 0) {
            System.exit(0);

        }
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jButtonVisualizarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarDadosActionPerformed

        ListaDadosView ldv = new ListaDadosView(relatorios);
        
        ldv.setVisible(true);
        
        
        
    }//GEN-LAST:event_jButtonVisualizarDadosActionPerformed

    private void jButtonCarregarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarregarArquivoActionPerformed
      try {

            RelatorioController r = new RelatorioController(this);
            
            r.carregaListaRelatorio(arquivoSelecionado);
            relatorios = r.getListaRelatorios();

            for (Relatorio rl : relatorios) {

                System.out.println(rl.toString());

            }

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(this, "Erro: ", ex.getMessage(), JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jButtonCarregarArquivoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    private void habilitaLabels(boolean habilita) {

        jLabel1.setVisible(habilita);
        jLabelFilename.setVisible(habilita);

        jLabelFilename.setText(habilita ? arquivoSelecionado.getAbsolutePath() : "");

    }

    public void appendLista(String texto) {

        StringBuilder sb = new StringBuilder();
        sb.append(jTextAreaLog.getText());
        jTextAreaLog.setText("");
        sb.append(Util.getDataHoraAtual());
        sb.append(" - ");
        sb.append(texto);
        sb.append("\n");
        jTextAreaLog.setText(sb.toString());

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCarregarArquivo;
    private javax.swing.JButton jButtonVisualizarDados;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFilename;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSelecionarArquivo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaLog;
    // End of variables declaration//GEN-END:variables
}
