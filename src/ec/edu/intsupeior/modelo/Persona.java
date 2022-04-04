
package ec.edu.intsupeior.modelo;

/**
 *
 * @author PERSONAL
 */
public class Persona {
   String usuario;
   String tipo_ususario;
   String password;

    public Persona(String usuario, String tipo_ususario, String password) {
        this.usuario = usuario;
        this.tipo_ususario = tipo_ususario;
        this.password = password;
   
        
        
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTipo_ususario() {
        return tipo_ususario;
    }

    public void setTipo_ususario(String tipo_ususario) {
        this.tipo_ususario = tipo_ususario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
   
}
