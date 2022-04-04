/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.instituto.controlador;

import ec.edu.instituto.vista.Administrador;
import ec.edu.instituto.vista.Docente;
import ec.edu.instituto.vista.Estudiante;
import ec.edu.intsupeior.vista.Loggin;
import ec.edu.intsupeior.controlador.Conexion;
import java.sql.SQLException;

/**
 *
 * @author PERSONAL
 */
public class Controlador {
    private String Loggin;
    private String Administrador;
    private String Estudiante;
    private String Docente;
    
    
   public Controlador(String Loggin ,String Administrador , String Estudiante,String Docente){
   this.Loggin = Loggin;
   this.Administrador = Administrador;
   this.Estudiante= Estudiante;
   this.Docente = Docente;
           }

    public Controlador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getLoggin() {
        return Loggin;
    }

    public void setLoggin(String Loggin) {
        this.Loggin = Loggin;
    }

    public String getAdministrador() {
        return Administrador;
    }

    public void setAdministrador(String Administrador) {
        this.Administrador = Administrador;
    }

    public String getEstudiante() {
        return Estudiante;
    }

    public void setEstudiante(String Estudiante) {
        this.Estudiante = Estudiante;
    }

    public String getDocente() {
        return Docente;
    }

    public void setDocente(String Docente) {
        this.Docente = Docente;
    }
 
    
  
  public void probarConexion() throws SQLException{
      Conexion.getConnection("Prueba2", "root", "root");
      
      
      Conexion.getConnection("Prueba2", "root", "root").close();
  }

    public void showLoggin() {
        Loggin.setVisible(true);
        
    }
    
    public void showAdminsitrador(){
        Administrador.setVisible(true);
    }
    
}

