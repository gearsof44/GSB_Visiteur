/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author latatiasteph
 */
public class VISITEUR extends javax.swing.JFrame {

    /**
     * Creates new form VISITEURS
     */
    public VISITEUR() {
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

        jTextFieldTitreVisiteurs = new javax.swing.JTextField();
        jLabelChercherVisiteur = new javax.swing.JLabel();
        jLabelNomVisiteur = new javax.swing.JLabel();
        jLabelPrenomVisiteur = new javax.swing.JLabel();
        jLabelAdresseVisiteur = new javax.swing.JLabel();
        jLabelVilleVisiteur = new javax.swing.JLabel();
        jLabelSecteurVisiteur = new javax.swing.JLabel();
        jLabelLaboVisiteur = new javax.swing.JLabel();
        jButtonPrécédentVisiteur = new javax.swing.JButton();
        jButtonSuivantVisiteur = new javax.swing.JButton();
        jButtonFermerVisiteur = new javax.swing.JButton();
        jComboBoxChercherVisiteur = new javax.swing.JComboBox<>();
        jButtonValiderNomVisiteur = new javax.swing.JButton();
        jTextFieldNomVisiteur = new javax.swing.JTextField();
        jTextFieldPrenomVisiteur = new javax.swing.JTextField();
        jTextFieldAdresseVisiteur = new javax.swing.JTextField();
        jTextFieldCodePostalVisiteur = new javax.swing.JTextField();
        jTextFieldSecteurVisiteur = new javax.swing.JTextField();
        jTextFieldLaboVisiteur = new javax.swing.JTextField();
        jTextFieldBarreVisiteurs = new javax.swing.JTextField();
        jTextFieldVilleVisiteur = new javax.swing.JTextField();
        jLabelLogoVisiteurs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        jTextFieldTitreVisiteurs.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jTextFieldTitreVisiteurs.setForeground(new java.awt.Color(51, 51, 153));
        jTextFieldTitreVisiteurs.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTitreVisiteurs.setText("VISITEURS");
        jTextFieldTitreVisiteurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTitreVisiteursActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTitreVisiteurs);
        jTextFieldTitreVisiteurs.setBounds(10, 11, 610, 28);

        jLabelChercherVisiteur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelChercherVisiteur.setForeground(new java.awt.Color(51, 51, 153));
        jLabelChercherVisiteur.setText("Chercher");
        getContentPane().add(jLabelChercherVisiteur);
        jLabelChercherVisiteur.setBounds(15, 61, 54, 15);

        jLabelNomVisiteur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNomVisiteur.setForeground(new java.awt.Color(51, 51, 153));
        jLabelNomVisiteur.setText("NOM");
        getContentPane().add(jLabelNomVisiteur);
        jLabelNomVisiteur.setBounds(10, 111, 28, 15);

        jLabelPrenomVisiteur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPrenomVisiteur.setForeground(new java.awt.Color(51, 51, 153));
        jLabelPrenomVisiteur.setText("PRENOM");
        getContentPane().add(jLabelPrenomVisiteur);
        jLabelPrenomVisiteur.setBounds(10, 149, 52, 15);

        jLabelAdresseVisiteur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelAdresseVisiteur.setForeground(new java.awt.Color(51, 51, 153));
        jLabelAdresseVisiteur.setText("ADRESSE");
        getContentPane().add(jLabelAdresseVisiteur);
        jLabelAdresseVisiteur.setBounds(10, 187, 57, 15);

        jLabelVilleVisiteur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelVilleVisiteur.setForeground(new java.awt.Color(51, 51, 153));
        jLabelVilleVisiteur.setText("VILLE");
        getContentPane().add(jLabelVilleVisiteur);
        jLabelVilleVisiteur.setBounds(10, 225, 34, 15);

        jLabelSecteurVisiteur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSecteurVisiteur.setForeground(new java.awt.Color(51, 51, 153));
        jLabelSecteurVisiteur.setText("SECTEUR");
        getContentPane().add(jLabelSecteurVisiteur);
        jLabelSecteurVisiteur.setBounds(10, 263, 54, 15);

        jLabelLaboVisiteur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelLaboVisiteur.setForeground(new java.awt.Color(51, 51, 153));
        jLabelLaboVisiteur.setText("LABO");
        getContentPane().add(jLabelLaboVisiteur);
        jLabelLaboVisiteur.setBounds(10, 301, 33, 15);

        jButtonPrécédentVisiteur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonPrécédentVisiteur.setForeground(new java.awt.Color(51, 51, 153));
        jButtonPrécédentVisiteur.setText("Précédent");
        getContentPane().add(jButtonPrécédentVisiteur);
        jButtonPrécédentVisiteur.setBounds(77, 347, 95, 23);

        jButtonSuivantVisiteur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSuivantVisiteur.setForeground(new java.awt.Color(51, 51, 153));
        jButtonSuivantVisiteur.setText("Suivant");
        getContentPane().add(jButtonSuivantVisiteur);
        jButtonSuivantVisiteur.setBounds(200, 347, 79, 23);

        jButtonFermerVisiteur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonFermerVisiteur.setForeground(new java.awt.Color(51, 51, 153));
        jButtonFermerVisiteur.setText("Fermer");
        getContentPane().add(jButtonFermerVisiteur);
        jButtonFermerVisiteur.setBounds(480, 350, 73, 23);

        jComboBoxChercherVisiteur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxChercherVisiteur);
        jComboBoxChercherVisiteur.setBounds(77, 59, 132, 20);

        jButtonValiderNomVisiteur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonValiderNomVisiteur.setForeground(new java.awt.Color(51, 51, 153));
        jButtonValiderNomVisiteur.setText("Ok");
        getContentPane().add(jButtonValiderNomVisiteur);
        jButtonValiderNomVisiteur.setBounds(227, 57, 49, 23);
        getContentPane().add(jTextFieldNomVisiteur);
        jTextFieldNomVisiteur.setBounds(77, 109, 132, 20);
        getContentPane().add(jTextFieldPrenomVisiteur);
        jTextFieldPrenomVisiteur.setBounds(77, 147, 132, 20);
        getContentPane().add(jTextFieldAdresseVisiteur);
        jTextFieldAdresseVisiteur.setBounds(77, 185, 132, 20);
        getContentPane().add(jTextFieldCodePostalVisiteur);
        jTextFieldCodePostalVisiteur.setBounds(77, 223, 35, 20);
        getContentPane().add(jTextFieldSecteurVisiteur);
        jTextFieldSecteurVisiteur.setBounds(77, 261, 132, 20);
        getContentPane().add(jTextFieldLaboVisiteur);
        jTextFieldLaboVisiteur.setBounds(77, 299, 132, 20);

        jTextFieldBarreVisiteurs.setBackground(new java.awt.Color(51, 51, 153));
        getContentPane().add(jTextFieldBarreVisiteurs);
        jTextFieldBarreVisiteurs.setBounds(10, 91, 277, 7);
        getContentPane().add(jTextFieldVilleVisiteur);
        jTextFieldVilleVisiteur.setBounds(122, 223, 87, 20);

        jLabelLogoVisiteurs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vue/gh,hgfb.png"))); // NOI18N
        getContentPane().add(jLabelLogoVisiteurs);
        jLabelLogoVisiteurs.setBounds(0, 0, 620, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTitreVisiteursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTitreVisiteursActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTitreVisiteursActionPerformed

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
            java.util.logging.Logger.getLogger(VISITEUR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VISITEUR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VISITEUR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VISITEUR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VISITEUR().setVisible(true);
            }
        });
    }

    public JComboBox<String> getjComboBoxChercherVisiteur() {
        return jComboBoxChercherVisiteur;
    }

    public JTextField getjTextFieldAdresseVisiteur() {
        return jTextFieldAdresseVisiteur;
    }

    public JTextField getjTextFieldCodePostalVisiteur() {
        return jTextFieldCodePostalVisiteur;
    }

    public JTextField getjTextFieldLaboVisiteur() {
        return jTextFieldLaboVisiteur;
    }

    public JTextField getjTextFieldNomVisiteur() {
        return jTextFieldNomVisiteur;
    }

    public JTextField getjTextFieldPrenomVisiteur() {
        return jTextFieldPrenomVisiteur;
    }

    public JTextField getjTextFieldSecteurVisiteur() {
        return jTextFieldSecteurVisiteur;
    }

    public JTextField getjTextFieldTitreVisiteurs() {
        return jTextFieldTitreVisiteurs;
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFermerVisiteur;
    private javax.swing.JButton jButtonPrécédentVisiteur;
    private javax.swing.JButton jButtonSuivantVisiteur;
    private javax.swing.JButton jButtonValiderNomVisiteur;
    private javax.swing.JComboBox<String> jComboBoxChercherVisiteur;
    private javax.swing.JLabel jLabelAdresseVisiteur;
    private javax.swing.JLabel jLabelChercherVisiteur;
    private javax.swing.JLabel jLabelLaboVisiteur;
    private javax.swing.JLabel jLabelLogoVisiteurs;
    private javax.swing.JLabel jLabelNomVisiteur;
    private javax.swing.JLabel jLabelPrenomVisiteur;
    private javax.swing.JLabel jLabelSecteurVisiteur;
    private javax.swing.JLabel jLabelVilleVisiteur;
    private javax.swing.JTextField jTextFieldAdresseVisiteur;
    private javax.swing.JTextField jTextFieldBarreVisiteurs;
    private javax.swing.JTextField jTextFieldCodePostalVisiteur;
    private javax.swing.JTextField jTextFieldLaboVisiteur;
    private javax.swing.JTextField jTextFieldNomVisiteur;
    private javax.swing.JTextField jTextFieldPrenomVisiteur;
    private javax.swing.JTextField jTextFieldSecteurVisiteur;
    private javax.swing.JTextField jTextFieldTitreVisiteurs;
    private javax.swing.JTextField jTextFieldVilleVisiteur;
    // End of variables declaration//GEN-END:variables
}
