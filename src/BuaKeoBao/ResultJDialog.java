/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuaKeoBao;

/**
 *
 * @author Admin
 */
public class ResultJDialog extends javax.swing.JDialog {

    /**
     * Creates new form ResultJDialog
     */
    public ResultJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        time();
    }

    void time() {
        Thread thread1 = new Thread() {
            public void run() {
                while (!time.getText().equals("0")) {
                    try {
                        Thread.sleep(1000);
                        int t = Integer.parseInt(time.getText());
                        time.setText((t - 1) + "");
                    } catch (Exception ex) {
                        System.out.println("Time !!!");
                    }
                    if (time.getText().equals("0")) {
                        try {
                            Thread.sleep(1000);
                        } catch (Exception ex) {}
                        dispose();
                    }
                }
            }
        };
        thread1.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Result");
        getContentPane().setLayout(null);

        icon.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/game/loseJDialog.png"))); // NOI18N
        icon.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        icon.setFocusable(false);
        icon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        icon.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(icon);
        icon.setBounds(0, 0, 310, 128);

        text.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text.setText("Win");
        getContentPane().add(text);
        text.setBounds(0, 120, 310, 51);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\game\\src\\Image\\other\\round.png")); // NOI18N
        jLabel8.setFocusable(false);
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel8.setPreferredSize(new java.awt.Dimension(110, 110));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(110, 170, 90, 90);

        time.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        time.setForeground(new java.awt.Color(0, 0, 0));
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText("5");
        getContentPane().add(time);
        time.setBounds(130, 185, 50, 60);

        setSize(new java.awt.Dimension(325, 306));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ResultJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ResultJDialog dialog = new ResultJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel text;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
