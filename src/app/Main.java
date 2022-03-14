
package app;
/*
* PRUEBA TÉCNICA
* PROYECTO 1: Descripción Completa en Archivo de Word (Prueba Técnica JAVA)
*
* Elaborado por: NORMA JUDITH ORTEGA RODRIGUEZ
* Fecha: 13 de marzo 2022
*/

import java.util.Scanner; //Libreria para poder leer datos del teclado


public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // +++++++++++++++++ DATOS DEL CLIENTE ++++++++++++++++++++++++
        
        System.out.println("****** DATOS DEL PROPIETARIO **********");
        System.out.println("");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.print("RG: ");
        String rg = sc.nextLine();
        
        System.out.println("Dirección");
        System.out.print("Calle: ");
        String calle = sc.nextLine();
        System.out.print("Colonia: ");
        String col = sc.nextLine();
        System.out.print("C.P.(Numerico): ");
        int cp = sc.nextInt();
        System.out.print("Ciudad: ");
                String cd=sc.next();
        System.out.print("Estado: ");
        String edo =sc.next();
        
        // Asignar la información a los atributos de la Clase Dirección
            Direccion direccion = new Direccion(); //Crear objeto  dirección
            
            //Asignar valores a los atributos
            direccion.setCalle(calle);
            direccion.setColonia(col);
            direccion.setCiudad(cd);
            direccion.setEstado(edo);
            direccion.setCodigoPostal(cp);
            
        //Crear objeto propietario, toda vez que ya se creo el objeto direccion
        Propietario propietario = new Propietario(nombre, cpf, rg, direccion); 
        
        
        // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // +++++++++++++++++ DATOS DEL AUTO ++++++++++++++++++++++++
        
        System.out.println("");
        System.out.println("****** DATOS DEL AUTO **********");
        System.out.println("--------------------------");
        
        // Datos Marca
        System.out.print("Código :");
        int codigo=sc.nextInt();
        System.out.print("Nombre(Ej. Ford) : ");
        //String nombreAuto =sc.nextLine();
        String nombreAuto=sc.next();
        System.out.print("Modelo(Ej. Lobo) :");
        String modeloAuto =sc.next();
        System.out.print("Año :");
        int anio=sc.nextInt();
        
                //Crear objeto Marca
                Marca marca=new Marca (codigo,nombreAuto,modeloAuto,anio); 
        
        
         // Solicitar datos del auto
        System.out.print("Color: ");
        String color = sc.next();
        System.out.print("Chasis: ");
        String chasis = sc.next();
        System.out.print("Número de puertas:");
        int puertas=sc.nextInt();
        System.out.print("Descapotable (SI / NO)?: ");
        String descapotable=sc.next();
        System.out.print("Velocidad maxima (km/hr): ");
        int velMax = sc.nextInt();
        System.out.print("Volumen del tanque de gasolina (lts): ");
        double volGas = sc.nextDouble(); 
              
            // Identificar que tipo de transmisión tiene el auto
        
                System.out.println("");
                System.out.println("Tipo de transmision: ");
                System.out.println("1.- Automatico");
                System.out.println("2.- Estandar");
            
                System.out.print("Elige tipo de transmision (1/2):");
                int tipoTrans = sc.nextInt();
           
                Auto auto;
                if(tipoTrans == 1)
                {
                    System.out.println("");
                    System.out.println("Elegiste Vehiculo automatico");

                    auto = new Auto(propietario,marca); //Crea objeto auto con transmisión AUTOMATICA
                }
                else
                {
                    System.out.println("");
                    System.out.println("Elegiste Vehiculo Estandar");
                    System.out.println("");

                    System.out.println("  ---------------------------------------------------------------");
                    System.out.println("  Los vehículos en la actualidad, que cuentan con una caja");
                    System.out.println("  de cambios manual, suelen tener entre cinco y seis marchas");
                    System.out.println("  además de la marcha atrás (reversa) y el punto muerto (neutral)");
                    System.out.println("  ---------------------------------------------------------------");

                    System.out.print("Cuantas marchas(velocidades) 5 ó 6?");
                    int velocidades = sc.nextInt();

                    auto = new Auto(propietario, marca, velocidades); //Crea objeto auto con transmisión ESTANDAR

                    System.out.println("");
                }
        
          
                //  Asignar los valores faltantes a los atributos del objeto auto
                auto.setColor(color);
                auto.setChasis(chasis);
                auto.setNumeroPuertas(puertas);
                auto.setVelocidadMax(velMax);
                auto.setVolumenCombustible(volGas);
                if(descapotable.toLowerCase().equals("si"))
                    auto.setDescapotable(true);


            
            // ------------------ MENU ACCIONES del vehiculo --------------------------
            
            boolean exit = false;      
            
            while(!exit) {
                System.out.println("");
                System.out.println("");
                System.out.println("=====================================");
                System.out.println("        SELECCIONE UNA ACCION");
                System.out.println("=====================================");
                System.out.println("(a) Acelerar");
                System.out.println("(b) Frenar");
                System.out.println("(c) Reversa");
                System.out.println("(d) Cambio de marcha");
                System.out.println("(e) Reducir marcha");
                System.out.println("(f) Ver Volumen del Combustible");
                System.out.println("(g) Ver Autonomia del Viaje");
                System.out.println("");
                System.out.println("(x) Salir ");
                System.out.println("=====================================");
                System.out.print("       Seleccione una opcion: ");

                String op = sc.nextLine();
            
                switch(op)
                {
                    case "a": 
                        auto.acelerar();
                        break;
                    case "b":
                        auto.frenar();
                        break;
                    case "c":
                        auto.reversa();
                        break;
                    case "d":
                        auto.cambiarMarcha();
                        break;
                    case "e":
                        auto.reduceMarcha();
                        break;
                    case "f":
                        auto.showVolumenCombustible();
                        break;
                    case "g":
                        System.out.println("Cuantos km da por litro?");
                        int kmL = sc.nextInt();
                        auto.autonomiaViaje(kmL);
                        break;
                    case "x":
                        exit = true;
                        System.out.println("fin");
                        break;
                    default:
                        System.out.println("Debe teclear una opcion válida!!!");
                        break;
                }//cierra switch
                
            }//cierra while menu
                    
    } // Cierra Public Static
    
} // Cierra Public Class
