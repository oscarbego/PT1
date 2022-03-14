package app;

/*
* PRUEBA TÉCNICA
* PROYECTO 1: Descripción Completa en Archivo de Word (Prueba Técnica JAVA)
*
* CLASE Auto
* 
* Elaborado por: NORMA JUDITH ORTEGA RODRIGUEZ
* Fecha: 12 de marzo 2022
*/

public class Auto {

    private String color;
    private String chasis;
    
    private int velocidadMax;
    private int velocidadActual;
    private int numeroPuertas;   
    private int numeroMarchas;//numero de velocidades
    
    private boolean descapotable;
    private boolean automatico; 

    private double volumenCombustible;

    private Propietario propietario;
    private Marca marca;
    private CajaMarcha cajaMarcha;
    
   // ----------------- Metodos constructor Auto --------------------------
    
    //Constructor del auto cuando es AUTOMAMTICO
    public Auto( Propietario propietario, Marca marca )
    {
        this.propietario = propietario;
        this.marca= marca;
        this.automatico = true;
        this.numeroMarchas = 0;
        
    }
    
    //Constructor del auto ESTANDAR
    public Auto( Propietario propietario, Marca marca, int numeroMarchas )
    {
        this.propietario = propietario;
        this.marca= marca;
        this.automatico = false;
        //this.numeroMarchas = numeroMarchas;
        cajaMarcha = new CajaMarcha(numeroMarchas); //Crea objeto CajaMarchas
        
    }
    
        
    // ------------------- metodos de la clase Auto -----------------------
    
    public void acelerar()
    {
        //Acelera la velocidad del auto de 1 en 1 km/hr
        //sin exceder la velocidad maxima del auto permitida
        if(getVelocidadActual()< getVelocidadMax())
        {   
            setVelocidadActual(getVelocidadActual() + 1);
            System.out.println("Vel. actual " + getVelocidadActual());
        }
        else{
            System.out.println("no puede pasar la velocidad máxima");
            System.out.println("permitida para su auto");
        }
    }
    
    public void frenar()
    {
        //Detiene el automóvil, poniendo su velocidad en 0
        setVelocidadActual(0);
        System.out.println("Vel. actual " + getVelocidadActual());
    }
    
    public void reversa()
    {
        //Engrana la marcha atras siempre y cuando la 
        //velocidad actual sea 0 km/h
        
        if(getVelocidadActual() == 0)
            System.out.println("Reversa en marcha");
        else
            System.out.println("La reversa no se puede engranar si el auto va "
                    + "hacia a delante");
    }
    
    
    public void cambiarMarcha()
    {
        //Permite SUBIR la marcha (de la caja de marcha) en 1,
        //Solo lo realiza en vehiculos tipo ESTANDAR, los vehiculos
        //AUTOMATICOS lo realizan de forma automática
        
        if(isAutomatico())
            System.out.println("El auto lo hace de forma automatica");
        else
            {   
                getCajaMarcha().cambiarMarcha();
                System.out.println("Cambio a " + getCajaMarcha().getMarchaActual());
            }
    }
    
    public void reduceMarcha()
    {
        //Permite BAJAR la marcha (de la caja de marcha) en 1,
        //Solo lo realiza en vehiculos tipo ESTANDAR, los vehiculos
        //AUTOMATICOS lo realizan de forma automática
        
        if(isAutomatico())
            System.out.println("El auto lo hace de forma automatica");
         
        else
            {
                getCajaMarcha().reduceMarcha();
                System.out.println("Cambio a " + getCajaMarcha().getMarchaActual());
            }
    }
    
    
    public double autonomiaViaje(int consumoMedio)
    {
        // Calcula la autonomia del viaje del vehiculo teniendo como dato la cantidad
        // de combustible del vehiculo y recibiendo como parámetro el consumo medio
        
        System.out.println("Autonomia de Viaje: " + consumoMedio * getVolumenCombustible()+ "kms");
        System.out.println("");
        return consumoMedio * getVolumenCombustible();
    }

    
    public double showVolumenCombustible()
    {
        // Muestra la cantidad de combustible con que cuenta el vehiculo
        
        System.out.println("Volumen de Combustible: " + getVolumenCombustible());
        return getVolumenCombustible();
    }

    
    
    // ----------------- metodos get´s y set´s -------------------
    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }


    public String getChasis() {
        return chasis;
    }
    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    
    public int getVelocidadMax() {
        return velocidadMax;
    }
    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }


    public int getVelocidadActual() {
        return velocidadActual;
    }
    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }


    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }


    public int getNumeroMarchas() {
        return numeroMarchas;
    }
    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }


    public boolean isDescapotable() {
        return descapotable;
    }
    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }


    public boolean isAutomatico() {
        return automatico;
    }
    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }


    public double getVolumenCombustible() {
        return volumenCombustible;
    }
    public void setVolumenCombustible(double volumenCombustible) {
        this.volumenCombustible = volumenCombustible;
    }


    public Propietario getPropietario() {
        return propietario;
    }
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    
    public Marca getMarca() {
        return marca;
    }
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public CajaMarcha getCajaMarcha() {
        return cajaMarcha;
    }
    public void setCajaMarcha(CajaMarcha cajaMarcha) {
        this.cajaMarcha = cajaMarcha;
    }
    

}// cierra public class auto



