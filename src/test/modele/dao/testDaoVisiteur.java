/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.modele.dao;

import java.sql.SQLException;
import modele.metier.Visiteur;
import modele.dao.Jdbc;
import modele.dao.DaoVisiteur;

/**
 *
 * @author btssio
 */
import java.sql.Connection;
public class testDaoVisiteur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        
                java.sql.Connection cnx = null;

//                test0_Connexion();
                System.out.println("Test1 effectué : connexion\n");
                test1_GetOneVisiteur();
                System.out.println("Test2 effectué : get one\n");
        
    }

    private static void test0_Connexion() throws SQLException, ClassNotFoundException {
        Jdbc.creer("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:", "@localhost:1521:XE", "", "gsb", "gsb");
        Jdbc.getInstance().connecter();
        Connection cnx = Jdbc.getInstance().getConnexion();
        System.out.println(cnx);
    }
    
    private static void test1_GetOneVisiteur() throws SQLException {
        Visiteur test;
        String matricule = "a131";
        test = DaoVisiteur.selectOneByID(matricule);
        System.out.println("test");
        System.out.println(test);
    }
    
}
