package app;

/*
* PRUEBA TÉCNICA
* PROYECTO 1: Descripción Completa en Archivo de Word (Prueba Técnica JAVA)
*
* CLASE Propietario
* 
* Elaborado por: NORMA JUDITH ORTEGA RODRIGUEZ
* Fecha: 12 de marzo 2022
*/
public class Propietario {
 
    private String nombre;
    private String cpf;
    private String rg;    
    private String complemento;   
    
    private Direccion direccion;
    

 
    // ---------------  metodo constructor   -------------------------
    
    public Propietario(String nombre, String cpf, String rg, Direccion direccion)
    {
        this.nombre = nombre;
        this.cpf = cpf;
        this.rg = rg;
        this.direccion = direccion;
    }
    
    
    // ------------------- metodos get´s y set´s ---------------------------
   
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }


    public Direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
}// Cierra public class Propietario
