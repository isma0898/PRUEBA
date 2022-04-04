/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.instituto.controlador;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author PERSONAL
 */
public class Conexion {
    private static Connection conexion;
    
    public static Connection getConnection(String bddName,String user,String password){
        try {
        conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/" +bddName, user, password);
            System.out.println("conexion exitosa");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conexion;
    }
    
  public static void closeConnection(String bddName, String user, String password){
      try {
          getConnection(bddName, user, password).close();
          System.out.println("Cerrado correctamente");
      } catch (Exception e) {
          System.out.println(e.getMessage());
      }
  }}
    
    


    

