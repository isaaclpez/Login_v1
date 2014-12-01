/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgMenu;
/**
 *
 * @author isaac_000
 */
public class admin {
   
    private String usuario;
    private String contrasena;

   private clsConn cnn=new clsConn();
    
      public String insertar3(){
        if (verificau(usuario,contrasena)==true){
            return "-1";
        }

      return "1";
    }   
      
      public boolean verificau(String key, String key2){
String sql="SELECT * FROM usuarios us WHERE us.user='"+key+"' AND us.pass ='"+key2+"'";
if (    getCnn().verificar(sql) == 1)
return true;
return false;
}

 
      
      public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contrasena
     */
    public String getcontrasena() {
        return contrasena;
    }

    /**
     * @param contrasena the contrasena to set
     */
    public void setcontrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
       public clsConn getCnn() {
        return cnn;
    }
}
