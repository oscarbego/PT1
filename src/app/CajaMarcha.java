package app;

/*
* PRUEBA TÉCNICA
* PROYECTO 1: Descripción Completa en Archivo de Word (Prueba Técnica JAVA)
*
* CLASE CajaMarcha
* Se refiere a la caja de velociades del vehiculo
* 
* Elaborado por: NORMA JUDITH ORTEGA RODRIGUEZ
* Fecha: 12 de marzo 2022
*/


public class CajaMarcha {

    //Caja de marchas o velocidades

    private int marchas;
    private int marchaActual;
    
    
    // --------------- metodos de la clase --------------------
    
    public CajaMarcha(int velocidades)
    {
        // Asigna cuantas velociades va a tener la caja de marcha
        this.marchas = velocidades;
    }
    
    public void cambiarMarcha()
    {
       // SUBE de 1 en 1 la palanca de marcha 
       if(getMarchaActual() < getMarchas())
                setMarchaActual(getMarchaActual() + 1);
    }
    
    public void reduceMarcha()
    {
        // BAJA de 1 en 1 la palanca de marcha 
        if(getMarchaActual() > 0)
                setMarchaActual(getMarchaActual() - 1);
    }

    // ----------------- metodos get´s y set´s -------------------
    
    public int getMarchas() {
        return marchas;
    }
    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }

   
    public int getMarchaActual() {
        return marchaActual;
    }
    public void setMarchaActual(int marchaActual) {
        this.marchaActual = marchaActual;
    }
  
    
}// cierra public class
