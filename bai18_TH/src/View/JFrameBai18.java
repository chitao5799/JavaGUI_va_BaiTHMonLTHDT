/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author NCT99
 */
public class JFrameBai18 extends javax.swing.JFrame {

    /**
     * Creates new form JFrameBai18
     */
    public JFrameBai18() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelRoot = new javax.swing.JPanel();
        jPanelMenuLeft = new javax.swing.JPanel();
        jPanelTitle = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jPanelNhanSu = new javax.swing.JPanel();
        jLabelNhanSu = new javax.swing.JLabel();
        jPanelView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelTitle.setBackground(new java.awt.Color(0, 102, 102));

        jLabelTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(0, 153, 0));
        jLabelTitle.setText("Quản Lý Nhân Sự");

        javax.swing.GroupLayout jPanelTitleLayout = new javax.swing.GroupLayout(jPanelTitle);
        jPanelTitle.setLayout(jPanelTitleLayout);
        jPanelTitleLayout.setHorizontalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelTitle)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelTitle)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanelNhanSu.setBackground(new java.awt.Color(0, 153, 51));

        jLabelNhanSu.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelNhanSu.setText("Nhân Sự");

        javax.swing.GroupLayout jPanelNhanSuLayout = new javax.swing.GroupLayout(jPanelNhanSu);
        jPanelNhanSu.setLayout(jPanelNhanSuLayout);
        jPanelNhanSuLayout.setHorizontalGroup(
            jPanelNhanSuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNhanSuLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabelNhanSu)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanelNhanSuLayout.setVerticalGroup(
            jPanelNhanSuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNhanSuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNhanSu, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelMenuLeftLayout = new javax.swing.GroupLayout(jPanelMenuLeft);
        jPanelMenuLeft.setLayout(jPanelMenuLeftLayout);
        jPanelMenuLeftLayout.setHorizontalGroup(
            jPanelMenuLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelMenuLeftLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanelNhanSu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMenuLeftLayout.setVerticalGroup(
            jPanelMenuLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLeftLayout.createSequentialGroup()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanelNhanSu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 358, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelViewLayout = new javax.swing.GroupLayout(jPanelView);
        jPanelView.setLayout(jPanelViewLayout);
        jPanelViewLayout.setHorizontalGroup(
            jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        jPanelViewLayout.setVerticalGroup(
            jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelRootLayout = new javax.swing.GroupLayout(jPanelRoot);
        jPanelRoot.setLayout(jPanelRootLayout);
        jPanelRootLayout.setHorizontalGroup(
            jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRootLayout.createSequentialGroup()
                .addComponent(jPanelMenuLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelRootLayout.setVerticalGroup(
            jPanelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenuLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
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
            java.util.logging.Logger.getLogger(JFrameBai18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameBai18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameBai18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameBai18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameBai18().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelNhanSu;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelMenuLeft;
    private javax.swing.JPanel jPanelNhanSu;
    private javax.swing.JPanel jPanelRoot;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JPanel jPanelView;
    // End of variables declaration//GEN-END:variables
}
