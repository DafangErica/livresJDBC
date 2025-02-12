/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetbiblio;

import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

/* 
 * @author NT Store
 */
public class Livre extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    private String url = "jdbc:mysql://localhost/bd_biblio";
    private String user = "root";
    private String pwd = "";

    public void Connexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pwd);

        } catch (Exception ex) {
            System.out.println("une Erreur s'est produit");
        }

    }

    public Livre() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTGenreLivre = new javax.swing.JTextField();
        JTNombrePage = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBModifié = new javax.swing.JButton();
        jBEnregistre1 = new javax.swing.JButton();
        jBQuitter = new javax.swing.JButton();
        JTNomLivre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTNumeroLivre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom livre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 91, 28));

        jLabel2.setText("Genre livre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 91, 28));

        jLabel3.setText("Nombre page");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 91, 28));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setText("GESTION BIBLIO");
        jLabel5.setPreferredSize(new java.awt.Dimension(85, 30));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 14, 215, 28));

        JTGenreLivre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTGenreLivreActionPerformed(evt);
            }
        });
        getContentPane().add(JTGenreLivre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 289, -1));
        getContentPane().add(JTNombrePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 289, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Numero Livre", "Nom livre", "Genre livre", "Nombre Page"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 261, 705, 257));

        jBModifié.setText("Affiché");
        jBModifié.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModifiéActionPerformed(evt);
            }
        });
        getContentPane().add(jBModifié, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 83, -1));

        jBEnregistre1.setText("Enregistré");
        jBEnregistre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEnregistre1ActionPerformed(evt);
            }
        });
        getContentPane().add(jBEnregistre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, -1, -1));

        jBQuitter.setText("Quitter");
        jBQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBQuitterActionPerformed(evt);
            }
        });
        getContentPane().add(jBQuitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, -1, -1));
        getContentPane().add(JTNomLivre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 289, -1));

        jLabel4.setText("Numero livre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 80, 20));
        getContentPane().add(JTNumeroLivre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 289, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_jTable1MouseClicked

    private void jBEnregistre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEnregistre1ActionPerformed
        // TODO add your handling code here:
        int numeroLivre = Integer.parseInt(JTNumeroLivre.getText());
        String nomLivre = JTNomLivre.getText();
        String genreLivre = JTGenreLivre.getText();
        int nombrePage = Integer.parseInt(JTNombrePage.getText());
        try{
            if("".equals(numeroLivre) && "".equals(nomLivre)&& "".equals(genreLivre)&& "".equals(nombrePage)){
                JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs");
            }else{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con=(Connection) DriverManager.getConnection(url,user,pwd);
                pst = con.prepareStatement("insert into livre(numeroLivre,nomLivre,genreLivre,nombrePage)"+
                        "values (?,?,?,?)");
                pst.setInt(1, numeroLivre);
                 pst.setString(2, nomLivre);
                  pst.setString(3, genreLivre);
                   pst.setInt(4, nombrePage);
                   pst.execute();
                   JOptionPane.showMessageDialog(null,"Ajouter");
                   con.close();
                
            }
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        

    }//GEN-LAST:event_jBEnregistre1ActionPerformed

    private JFrame frame;
    private void jBQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBQuitterActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "voulez vous quitter l application? ",
                "Livre", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jBQuitterActionPerformed

    private void JTGenreLivreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTGenreLivreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTGenreLivreActionPerformed

    private void jBModifiéActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModifiéActionPerformed
        // TODO add your handling code here:
         try{
            
                Class.forName("com.mysql.cj.jdbc.Driver");
                con=(Connection) DriverManager.getConnection(url,user,pwd);
                Statement st = con.createStatement();
                String query="select* from livre";
                ResultSet rs=st.executeQuery(query);
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                        
                
                
                
            
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jBModifiéActionPerformed

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
            java.util.logging.Logger.getLogger(Livre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Livre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Livre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Livre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Livre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTGenreLivre;
    private javax.swing.JTextField JTNomLivre;
    private javax.swing.JTextField JTNombrePage;
    private javax.swing.JTextField JTNumeroLivre;
    private javax.swing.JButton jBEnregistre1;
    private javax.swing.JButton jBModifié;
    private javax.swing.JButton jBQuitter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
