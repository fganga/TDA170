/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author fredy
 * Parámetros de conexión para la libreria JDBC de Mysql
 */
public class Conexion {
    private String driver   = "com.mysql.jdbc.Driver";
    private String url      = "jdbc:mysql://192.168.56.3:3306/academica";
    private String user     = "fganga";
    private String pwd      = "inacap.2019";

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
}
