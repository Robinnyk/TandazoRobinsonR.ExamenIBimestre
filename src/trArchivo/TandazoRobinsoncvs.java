package trArchivo;

import java.util.Scanner;

// Refactorización: Se metió la clase a un package debido a errores con variables.

public abstract class TandazoRobinsoncvs {

    // Refactorización: Se añadieron estas dos variables simplemente para darle mejor proceso al sistema, pues no atribuyen mucho al código.
    public static boolean confirmarArsenal1 = false;
    public static boolean confirmarArsenal2 = false;
    public static boolean hormigaEnergia = false;
    
    
    static String trCoordenadas = "01 y 09";
    static String trTipoArsenal = "aaaaabbbb";

    public static boolean isHormigaEnergia() {
        return hormigaEnergia;
    }

    public static void setHormigaEnergia(boolean energia) {
        hormigaEnergia = energia;
    }


    public static void ingresoDatos(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese las coordenadas ucranianas de ataque (por ejemplo: 02 y 04):");  
        String coords = sc.nextLine();
        coords = coords.toLowerCase();

        if (coords.equalsIgnoreCase(trCoordenadas)){
            System.out.println("Coordenadas de ataque correctas.\n");
            System.out.println("Ingrese los tipos de arsenal a destruir:");
            
            int opcTemp;
            do {
                System.out.println("Elija como quiere digitar los tipos de arsenal:");
                System.out.println("(1) Individualmente");
                System.out.println("(2) Concatenado");
                opcTemp = sc.nextInt();
                sc.nextLine();

                if (opcTemp == 1){
                    System.out.println("Ingrese el tipo de arsenal de la Coordenada 01");
                    String arsenal1 = sc.nextLine();
                    
                    System.out.println("Ingrese el tipo de arsenal de la Coordenada 09");
                    String arsenal2 = sc.nextLine();

                    if (arsenal1.equalsIgnoreCase("aaaa") && arsenal2.equalsIgnoreCase("abbbb") && hormigaEnergia == true){
                        System.out.println("Tipos de arsenal a destruir correctos.\n");
                        confirmarArsenal1 = true;
                        confirmarArsenal2 = true;
                    }else if (arsenal1.equalsIgnoreCase("aaaa") && hormigaEnergia == true){
                        System.out.println("El primer tipo de arsenal es correcto.\n");
                        confirmarArsenal1 = true;
                    }else if (arsenal2.equalsIgnoreCase("abbbb") && hormigaEnergia == true){
                        System.out.println("El segundo tipo de arsenal es correcto.\n");
                        confirmarArsenal2 = true;
                    }else if (hormigaEnergia = false){ 
                        System.out.println("\nLa hormiga murió, no puede completar la misión.");
                        confirmarArsenal1 = false;
                        confirmarArsenal2 = false;
                    }else{
                        System.out.println("Tipos de arsenal a destruir incorrectos.\n");
                    }
                }else if (opcTemp == 2){
                    System.out.println("Ingrese el tipo de arsenal concatenado de la Coordenado 01 y 09 (en ese orden)");
                    String arsenal1y2 = sc.nextLine();

                    if (arsenal1y2.equalsIgnoreCase(trTipoArsenal) && hormigaEnergia == true){
                        System.out.println("Tipos de arsenal a destruir correctos.\n");
                        confirmarArsenal1 = true;
                        confirmarArsenal2 = true;
                    }else if (hormigaEnergia = false){
                        System.out.println("\nLa hormiga murió, no puede completar la misión.");
                        confirmarArsenal1 = false;
                        confirmarArsenal2 = false;
                    }else{
                        System.out.println("Tipos de arsenal a destruir incorrectos.\n");
                    }
                }
                
            } while (opcTemp != 1 && opcTemp != 2);
            
           
            
        }else{
            System.out.println("Error. Coordenadas de ataque incorrectas.\n");
        }
    }

    // Refactorización: Se eliminó el método cargarDatos debido a que no aportaba nada al código.

}
