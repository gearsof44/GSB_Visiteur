/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import Vue.VueCompteRendu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modele.dao.DaoPraticien;
import modele.dao.DaoRapport;
import modele.dao.DaoVisiteur;
import modele.metier.Praticien;
import modele.metier.Rapport;
import modele.metier.Visiteur;

/**
 *
 * @author btssio
 */
public class CtrlCompteRendu implements WindowListener, ActionListener{
    
    public static int index_compte_rendu;
    private VueCompteRendu vue; // LA VUE
    private CtrlPrincipal ctrlPrincipal;
    
    public CtrlCompteRendu(VueCompteRendu vue, CtrlPrincipal ctrl) {
        this.vue = vue;
        this.ctrlPrincipal = ctrl;
        // le contrôleur écoute la vue
        this.vue.addWindowListener(this);
//        this.vue.getjComboBoxChercherVisiteur().addActionListener(this);
        this.vue.getjButtonCompteRenduDetails().addActionListener(this);
        this.vue.getjButtonCompteRenduFermer().addActionListener(this);
        this.vue.getjButtonCompteRenduNouveau().addActionListener(this);
        this.vue.getjButtonCompteRenduAjouter().addActionListener(this);
        this.vue.getjButtonCompteRenduPrécédent().addActionListener(this);
        this.vue.getjButtonCompteRenduSuivant().addActionListener(this);
        this.vue.getjComboBoxCompteRenduPraticien().addActionListener(this);
        this.vue.getjTextFieldCompteRenduBilan().addActionListener(this);
        this.vue.getjTextFieldCompteRenduDateRapport().addActionListener(this);
        this.vue.getjTextFieldCompteRenduMotifVisite().addActionListener(this);
        this.vue.getjTextFieldCompteRenduNumeroRapport().addActionListener(this);
        this.vue.getjTextFieldTitreCompteRendu().addActionListener(this);
        this.vue.getjButtonCompteRenduAjouter().setEnabled(false);
        // préparer l'état iniitial de la vue
        index_compte_rendu = 0;
        rechercherTousVisiteur();
        rechercherTousPraticien();

    }
    
    private void rechercherTousPraticien() {
        List<Praticien> lesPraticiens = null;
        try {
            lesPraticiens = DaoPraticien.selectAll();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(getVue(), "CtrlLesVisiteurs - échec de sélection des visiteurs");
        }
        afficherLesPraticiens(lesPraticiens);
    }
    
    private void rechercherTousVisiteur() {
        List<Visiteur> lesVisiteurs2 = null;
        try {
             lesVisiteurs2 = DaoVisiteur.selectAll();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(getVue(), "CtrlLesVisiteurs - échec de sélection des visiteurs");
        }
        afficherLesVisiteurs(lesVisiteurs2);
    }

        /**
     * fonction permettant d'ajouter les praticiens entrés en paramètre dans la liste déroulante de la vue Praticien
     * 
     * @param lesPraticiens 
     */
    private void afficherLesPraticiens(List<Praticien> lesPraticiens) {
        //Pour chaque Praticien, on l'ajoute à la liste déroulante
        for (Praticien unPraticien :  lesPraticiens){
            getVue().getModeleComboBoxPraticien().addElement(unPraticien);
        }
    }
    
        /**
     * fonction permettant d'ajouter les visiteurs entrés en paramètre dans la liste déroulante de la vue Visiteurs
     * 
     * @param lesVisiteurs 
     */
    private void afficherLesVisiteurs(List<Visiteur> lesVisiteurs) {
        //Pour chaque visiteur, on l'ajoute à la liste déroulante
        for (Visiteur unVisiteur :  lesVisiteurs){
            getVue().getModeleComboBoxVisiteur().addElement(unVisiteur);
        }
    }
    
    public VueCompteRendu getVue() {
        return vue;
    }
    
    
    public void setVue(VueCompteRendu vue) {
        this.vue = vue;
    }
    
    public CtrlPrincipal getCtrlPrincipal() {
        return ctrlPrincipal;
    }

    @Override
    public void windowOpened(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        ctrlPrincipal.gotoMenu();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vue.getjButtonCompteRenduFermer())){
            quitter();
        }
        if (e.getSource().equals(vue.getjComboBoxVisiteur())){
            Visiteur visiteur = (Visiteur) getVue().getModeleComboBoxVisiteur().getSelectedItem();
            try {
                afficherCompteRendu(visiteur);
            } catch (SQLException ex) {
                Logger.getLogger(CtrlCompteRendu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource().equals(vue.getjButtonCompteRenduSuivant())){
            Visiteur visiteur = (Visiteur) getVue().getModeleComboBoxVisiteur().getSelectedItem();
            try {
                compteRenduSuivant(visiteur);
            } catch (SQLException ex) {
                Logger.getLogger(CtrlCompteRendu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource().equals(vue.getjButtonCompteRenduPrécédent())){
            Visiteur visiteur = (Visiteur) getVue().getModeleComboBoxVisiteur().getSelectedItem();
            try {
                compteRenduPrecedant(visiteur);
            } catch (SQLException ex) {
                Logger.getLogger(CtrlCompteRendu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource().equals(vue.getjButtonCompteRenduNouveau())){
            try {
                viderCompteRendu();
                getVue().getjButtonCompteRenduAjouter().setEnabled(true);
            } catch (SQLException ex) {
                Logger.getLogger(CtrlCompteRendu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource().equals(vue.getjButtonCompteRenduAjouter())){
            try {
                ajouterCompteRendu();
                getVue().getjButtonCompteRenduAjouter().setEnabled(false);
            } catch (SQLException ex) {
                Logger.getLogger(CtrlCompteRendu.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(CtrlCompteRendu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }

    private void quitter() {
        ctrlPrincipal.gotoMenu();
    }
     
    
    private void afficherCompteRendu(Visiteur visiteur) throws SQLException {
        List<Rapport> rapport_list = DaoRapport.selectAllByVisiteur(visiteur);
        int rapport_list_size = rapport_list.size();
        if (index_compte_rendu > (rapport_list_size - 1)){
            index_compte_rendu -= 1;
        }
        else if (index_compte_rendu < 0){
            index_compte_rendu += 1;
        }
        Rapport le_rapport = rapport_list.get(index_compte_rendu);
        Praticien le_praticien = le_rapport.getPra_num();
        getVue().getModeleComboBoxPraticien().setSelectedItem(le_praticien);
        String str_date = le_rapport.getRap_date().toString();
        getVue().getjTextFieldCompteRenduNumeroRapport().setText(Integer.toString(le_rapport.getRap_num()));
        getVue().getjTextFieldCompteRenduDateRapport().setText(str_date);
        getVue().getjTextFieldCompteRenduMotifVisite().setText(le_rapport.getRap_motif());
        getVue().getjTextFieldCompteRenduBilan().setText(le_rapport.getRap_bilan());
    }
    
    private void ajouterCompteRendu() throws SQLException, ParseException {
        Visiteur visiteur = (Visiteur) getVue().getModeleComboBoxVisiteur().getSelectedItem();
        Praticien praticien = (Praticien) getVue().getModeleComboBoxPraticien().getSelectedItem();
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        String vis_mat = visiteur.getVis_matricule();
        int rap_num = DaoRapport.getMaxRapNum() + 1;
        int pra_num = praticien.getPra_num();
        String str_date = getVue().getjTextFieldCompteRenduDateRapport().getText();
        Date date = df.parse(str_date);
        String bilan = getVue().getjTextFieldCompteRenduBilan().getText();
        String motif = getVue().getjTextFieldCompteRenduMotifVisite().getText();
        Rapport inserted_rapport = new Rapport(visiteur,rap_num,praticien,date,bilan,motif);
        DaoRapport.insert(vis_mat, pra_num, inserted_rapport);
    }
    
    private void viderCompteRendu() throws SQLException{
        getVue().getjTextFieldCompteRenduBilan().setText("");
        getVue().getjTextFieldCompteRenduDateRapport().setText("");
        getVue().getjTextFieldCompteRenduMotifVisite().setText("");
        getVue().getjTextFieldCompteRenduNumeroRapport().setText(Integer.toString(DaoRapport.getMaxRapNum()+1));
    }
    
    private void compteRenduSuivant(Visiteur visiteur) throws SQLException{
        index_compte_rendu += 1;
        afficherCompteRendu(visiteur);
    }
    
    private void compteRenduPrecedant(Visiteur visiteur) throws SQLException{
        index_compte_rendu -= 1;
        afficherCompteRendu(visiteur);
    }
    
}
