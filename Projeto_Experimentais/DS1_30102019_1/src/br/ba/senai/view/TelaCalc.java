/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.senai.view;

import br.ba.senai.beans.Calculadora;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows
 */
public class TelaCalc extends javax.swing.JFrame {

    /**
     * Creates new form TelaCalc
     */
    public TelaCalc() {
        initComponents();
        setLocationRelativeTo(this);
        setSize(245, 320);
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
        txtValor1 = new javax.swing.JTextField();
        txtValor2 = new javax.swing.JTextField();
        txtRes = new javax.swing.JTextField();
        btnSomar = new javax.swing.JButton();
        btnSubtrair = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);
        jPanel1.add(txtValor1);
        txtValor1.setBounds(110, 50, 118, 30);
        jPanel1.add(txtValor2);
        txtValor2.setBounds(110, 90, 118, 30);

        txtRes.setEditable(false);
        jPanel1.add(txtRes);
        txtRes.setBounds(110, 140, 118, 30);

        btnSomar.setText("+");
        btnSomar.setToolTipText("Somar Valores");
        btnSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Somar(evt);
            }
        });
        jPanel1.add(btnSomar);
        btnSomar.setBounds(20, 190, 93, 40);

        btnSubtrair.setText("-");
        btnSubtrair.setToolTipText("Subtrair Valores");
        btnSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Subtrair(evt);
            }
        });
        jPanel1.add(btnSubtrair);
        btnSubtrair.setBounds(130, 190, 90, 40);

        btnDividir.setText("/");
        btnDividir.setToolTipText("Dividir Valores");
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dividir(evt);
            }
        });
        jPanel1.add(btnDividir);
        btnDividir.setBounds(20, 240, 93, 40);

        btnMultiplicar.setText("*");
        btnMultiplicar.setToolTipText("Multiplicar Valores");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicar(evt);
            }
        });
        jPanel1.add(btnMultiplicar);
        btnMultiplicar.setBounds(130, 240, 92, 40);

        jLabel1.setText("Valor 1: ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 50, 70, 30);

        jLabel2.setText("Valor 2: ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 90, 60, 30);

        jLabel3.setText("Resultado:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 140, 80, 30);

        jLabel4.setText("Calculadora");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 10, 80, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-4, -4, 240, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Somar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Somar
        // TODO add your handling code here:
        try {
            Calculadora hp = new Calculadora();
            
            double v1 = Double.parseDouble(txtValor1.getText());
            double v2 = Double.parseDouble(txtValor2.getText());
            double res = hp.somar(v1, v2);
            txtRes.setText(String.valueOf(res));
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(this, "Não digite letra!!!", "Calculadora informa", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Somar

    private void Subtrair(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Subtrair
        // TODO add your handling code here:
        try {
            Calculadora hp = new Calculadora();
            
            double v1 = Double.parseDouble(txtValor1.getText());
            double v2 = Double.parseDouble(txtValor2.getText());
            double res = hp.subtrair(v1, v2);
            txtRes.setText(String.valueOf(res));
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(this, "Não digite letra!!!", "Calculadora informa", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Subtrair

    private void Dividir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dividir
        // TODO add your handling code here:

          try {
            Calculadora hp = new Calculadora();
            
            int v1 = Integer.parseInt(txtValor1.getText());
            int v2 = Integer.parseInt(txtValor2.getText());
            int res = hp.dividir(v1, v2);
            txtRes.setText(String.valueOf(res));
        }catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(this, "Não digite letra!!!", "Calculadora informa", JOptionPane.ERROR_MESSAGE);            
        }catch (ArithmeticException arithmeticException) {
            JOptionPane.showMessageDialog(this, "Não divide por 0!!!", "Calculadora informa", JOptionPane.ERROR_MESSAGE);            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, "erro!!!", "Calculadora informa", JOptionPane.ERROR_MESSAGE);            
        }
         finally{
              System.out.println("OK");
          }
    }//GEN-LAST:event_Dividir

    private void multiplicar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicar
        // TODO add your handling code here:
        try {
            Calculadora hp = new Calculadora();
            
            double v1 = Double.parseDouble(txtValor1.getText());
            double v2 = Double.parseDouble(txtValor2.getText());
            double res = hp.multiplicar(v1, v2);
            txtRes.setText(String.valueOf(res));
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(this, "Não digite letra!!!", "Calculadora informa", JOptionPane.ERROR_MESSAGE);            
        }
    }//GEN-LAST:event_multiplicar

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
            java.util.logging.Logger.getLogger(TelaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnSomar;
    private javax.swing.JButton btnSubtrair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtRes;
    private javax.swing.JTextField txtValor1;
    private javax.swing.JTextField txtValor2;
    // End of variables declaration//GEN-END:variables
}
