/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.modele.dao;

import java.sql.Connection;
import java.sql.SQLException;
import modele.dao.DaoTypePraticien;
import modele.dao.Jdbc;
import modele.metier.TypePraticien;

/**
 *
 * @author btssio
 */
public class testDaoTypePraticien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        
                java.sql.Connection cnx = null;

                test0_Connexion();
                System.out.println("Test1 effectué : connexion\n");
                test1_GetOneTypePraticien();
                System.out.println("Test2 effectué : get one\n");
        
    }

    private static void test0_Connexion() throws SQLException, ClassNotFoundException {
        Jdbc.creer("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:", "@localhost:1521:XE", "", "gsb", "gsb");
        Jdbc.getInstance().connecter();
        Connection cnx = Jdbc.getInstance().getConnexion();
        System.out.println(cnx);
    }
    
    private static void test1_GetOneTypePraticien() throws SQLException {
        TypePraticien test;
        String code_type_pra = "MH";
        test = DaoTypePraticien.selectOneById(code_type_pra);
        System.out.println(test);
    }
    
}
