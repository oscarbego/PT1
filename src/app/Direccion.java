
package app;

/*
* PRUEBA TÉCNICA
* PROYECTO 1: Descripción Completa en Archivo de Word (Prueba Técnica JAVA)
*
* CLASE Direccion
* 
* Elaborado por: NORMA JUDITH ORTEGA RODRIGUEZ
* Fecha: 12 de marzo 2022
*/

public class Direccion {
    
    private String calle;    
    private String colonia;
    private String ciudad;
    private String estado; 
    private int codigoPostal;

    // ------------------------ metodos get´s y set´s ------------------------

    public String getCalle() {
        return calle;
    } 
    public void setCalle(String calle) {
        this.calle = calle;
    }


    public String getColonia() {
        return colonia;
    }
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    

    public String getCiudad() {
        return ciudad;
    }
     public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

 
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }


    public int getCodigoPostal() {
        return codigoPostal;
    }
    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
   
    
}//Cierra public class Direccion
