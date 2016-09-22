/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author JDAVID
 */
public class Persona {

    private String nombre;
    private String apellido;
    private String tipoid;
    private int numidentidad;
public Persona(){}
    public Persona(String nom,String ap,String tpid,int numid){
      
        nombre=nom;
        apellido=ap;
        tipoid=tpid;
        numidentidad=numid;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipid() {
        return tipoid;
    }

    public void setTipid(String tipid) {
        this.tipoid = tipid;
    }

    public int getNumidentidad() {
        return numidentidad;
    }

    public void setNumidentidad(int numidentidad) {
        this.numidentidad = numidentidad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre:" + nombre + ", apellido:" + apellido + ", tipo de documento:" + tipoid + ", numero de identidad:" + numidentidad + '}';
    }
    

}
