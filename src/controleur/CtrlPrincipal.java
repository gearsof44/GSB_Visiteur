package controleur;

import Vue.VueVisiteurs;
import javax.swing.JOptionPane;

public class CtrlPrincipal {

    CtrlVisiteur ctrlVisiteur;
    CtrlMenu ctrlMenu;

    public void afficherVisiteur() {
        this.ctrlVisiteur.getVue().setVisible(true);
    }
    
    public void afficherMenu() {
        this.ctrlMenu.getVue().setVisible(true);
    }
    
//    public void afficherCompteRendu() {
//        this.ctrlCompteRendu.getVue().setVisible(true);
//    }
    
    public void cacherVisiteur() {
        this.ctrlVisiteur.getVue().setVisible(false);
    }
    
    public void cacherMenu() {
        this.ctrlMenu.getVue().setVisible(false);
    }
    
//    public void cacherCompteRendu() {
//        this.ctrlCompteRendu.getVue().setVisible(false);
//    }
   
    
    public void quitterApplication() {
        // Confirmer avant de quitter
        int rep = JOptionPane.showConfirmDialog(null, "Quitter l'application\nEtes-vous sûr(e) ?", "GSB", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (rep == JOptionPane.YES_OPTION) {
            // mettre fin à l'application
            System.exit(0);
        }
    }
    
    public void gotoVisiteur() {
        cacherMenu();
//        cacherCompterendu();
        afficherVisiteur();
    }
    
    public void gotoCompterendu() {    
        cacherMenu();
        cacherVisiteur();
//        afficherCompterendu();
    }
    
    public void gotoMenu() {
        cacherVisiteur();
//        cacherCompteRendu();
        afficherMenu();
    }

    public CtrlVisiteur getCtrlVisiteur() {
        return ctrlVisiteur;
    }
    
    public CtrlMenu getCtrlMenu() {
        return ctrlMenu;
    }

    public void setCtrlVisiteur(CtrlVisiteur ctrlVisiteur) {
        this.ctrlVisiteur = ctrlVisiteur;
    } 
    
    public void setCtrlMenu(CtrlMenu ctrlMenu) {
        this.ctrlMenu = ctrlMenu;
    } 

}