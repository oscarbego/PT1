package app;

/*
* PRUEBA TÉCNICA
* PROYECTO 1: Descripción Completa en Archivo de Word (Prueba Técnica JAVA)
*
* CLASE Marca
*
* Elaborado por: NORMA JUDITH ORTEGA RODRIGUEZ
* Fecha: 12 de marzo 2022
*/

public class Marca {
    
    private int codigoId;
    private String nombre;  //Ej. Ford 
    private String modelo;  //Ej. Lobo
    private int anio;       // Ej. 2018      

    
    // -------------------- metodo constructor Marca -----------------------
    public Marca(int codigoId, String nombre,String modelo, int anio)
    {
        this.codigoId=codigoId;
        this.nombre=nombre; 
        this.modelo=modelo;
        this.anio=anio; 
    }
    
    
    // ----------------- metodos get´s y set´s de la clase -------------------
    

    public int getCodigoId() {
        return codigoId;
    }
    public void setCodigoId(int codigoId) {
        this.codigoId = codigoId;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
}//cierra public class Marca
