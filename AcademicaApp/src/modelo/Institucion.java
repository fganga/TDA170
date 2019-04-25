/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.Operacion;
import java.util.Date;

/**
 *
 * @author fredy
 */
public class Institucion {
    private int idInstitucion;
    private String nombreInstitucion;
    private Date fechaRegistro;

    public int getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(int idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    /*Agregamos una nueva institucion*/
    public void agregarInstitucion(){
        //Crear un objeto de la clase Operación
        Operacion operacion = new Operacion();
        //Instrucción SQL para agregar institucion
        String sql ="insert into institucion(nombre_institucion) values('"+this.nombreInstitucion+"')";
        //Enviámos la instrucción SQL al método ejecutar
        operacion.ejecutar(sql);
        
    }
    
}
