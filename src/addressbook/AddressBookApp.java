/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

/**
 *
 * @author lleoc
 */
public class AddressBookApp extends javax.swing.JFrame {

    /**
     * Creates new form AddressBookApp
     */
    public AddressBookApp() {
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

        FirstNameJLabel = new javax.swing.JLabel();
        SurNameJLabel = new javax.swing.JLabel();
        TelephoneNumberJLabel = new javax.swing.JLabel();
        FirstNameJTextField = new javax.swing.JTextField();
        SurNameJTextField = new javax.swing.JTextField();
        TelephoneNumberJTextField = new javax.swing.JTextField();
        AddJButton = new javax.swing.JButton();
        ClearJButton = new javax.swing.JButton();
        RemoveJButton = new javax.swing.JButton();
        SearchJButton = new javax.swing.JButton();
        ExitJButton = new javax.swing.JButton();
        AppJMenuBar = new javax.swing.JMenuBar();
        AddJMenu = new javax.swing.JMenu();
        ClearJMenu = new javax.swing.JMenu();
        RemoveJMenu = new javax.swing.JMenu();
        SeachJMenu = new javax.swing.JMenu();
        ExitJMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FirstNameJLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FirstNameJLabel.setText("First Name");

        SurNameJLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SurNameJLabel.setText("SurName");

        TelephoneNumberJLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TelephoneNumberJLabel.setText("Telephone Number");

        AddJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddJButton.setText("Add");

        ClearJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ClearJButton.setText("Clear");

        RemoveJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RemoveJButton.setText("Remove");

        SearchJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SearchJButton.setText("Search");

        ExitJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ExitJButton.setText("Exit");

        AddJMenu.setText("Add");
        AppJMenuBar.add(AddJMenu);

        ClearJMenu.setText("Clear");
        AppJMenuBar.add(ClearJMenu);

        RemoveJMenu.setText("Remove");
        AppJMenuBar.add(RemoveJMenu);

        SeachJMenu.setText("Search");
        AppJMenuBar.add(SeachJMenu);

        ExitJMenu.setText("Exit");
        AppJMenuBar.add(ExitJMenu);

        setJMenuBar(AppJMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ClearJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RemoveJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ExitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FirstNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SurNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TelephoneNumberJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FirstNameJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(SurNameJTextField)
                            .addComponent(TelephoneNumberJTextField))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FirstNameJLabel)
                    .addComponent(FirstNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SurNameJLabel)
                    .addComponent(SurNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelephoneNumberJLabel)
                    .addComponent(TelephoneNumberJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddJButton)
                    .addComponent(ClearJButton)
                    .addComponent(RemoveJButton)
                    .addComponent(ExitJButton)
                    .addComponent(SearchJButton))
                .addContainerGap(43, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(AddressBookApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddressBookApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddressBookApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddressBookApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddressBookApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddJButton;
    private javax.swing.JMenu AddJMenu;
    private javax.swing.JMenuBar AppJMenuBar;
    private javax.swing.JButton ClearJButton;
    private javax.swing.JMenu ClearJMenu;
    private javax.swing.JButton ExitJButton;
    private javax.swing.JMenu ExitJMenu;
    private javax.swing.JLabel FirstNameJLabel;
    private javax.swing.JTextField FirstNameJTextField;
    private javax.swing.JButton RemoveJButton;
    private javax.swing.JMenu RemoveJMenu;
    private javax.swing.JMenu SeachJMenu;
    private javax.swing.JButton SearchJButton;
    private javax.swing.JLabel SurNameJLabel;
    private javax.swing.JTextField SurNameJTextField;
    private javax.swing.JLabel TelephoneNumberJLabel;
    private javax.swing.JTextField TelephoneNumberJTextField;
    // End of variables declaration//GEN-END:variables
}