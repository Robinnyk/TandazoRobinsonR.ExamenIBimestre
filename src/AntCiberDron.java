import trUtility.trTools;
import trSoldado.trHSoldado;

import java.util.Scanner;

import trArchivo.TandazoRobinsoncvs;

public class AntCiberDron extends TandazoRobinsoncvs{

    public void inicializar(){
        
        Scanner sc = new Scanner(System.in);

        trHSoldado hormiga = new trHSoldado(null);

        System.out.println("Bienvenido al inicio de sesión");
        System.out.println("Por favor, digite su nombre o cédula:");
        String logIn = sc.nextLine();
        logIn = logIn.toLowerCase();

        System.out.println();
        System.out.println("La hormiga soldado debe alimentarse antes de ir al combate");
        System.out.println("¿Con qué vas a alimentarlo?");
        String alimentoHormiga = sc.nextLine();
        alimentoHormiga = alimentoHormiga.toLowerCase();
        System.out.println();

        if (alimentoHormiga.equalsIgnoreCase("carne")){
            hormiga.trComer(alimentoHormiga);

        }else{
            hormiga.trComer(null);
        }

        TandazoRobinsoncvs.ingresoDatos();

        System.out.println();
        System.out.println("Inicializando programa.... \n");
        trTools.barraCargaLoading();
        System.out.println();
        
        if(logIn.equalsIgnoreCase("Robinson Tandazo") || logIn.equalsIgnoreCase("1751292119")){
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("                       Bienvenido al programa AntCiberDron ");
            System.out.println("-----------------------------------------------------------------------------------------\n");
            System.out.println("[+] INFORMACIÓN:");
            System.out.println("    - Nombre: Robinson Alessandro Tandazo Reyes");
            System.out.println("    - Cédula: 1751292119\n");
            System.out.println("-----------------------------------------------------------------------------------------\n");
            System.out.println("[+] COORDENADAS GENERALES UCRANIANAS:");
            trTools.mostrarCoordenadas();
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------\n");
            System.out.println("[+] COORDENADAS UCRANIANAS A DESTRUIR:");
            System.out.println(" Geoposición | Tipo Arsenal | Acción");
            System.out.println(" Coord-01    |     aaaa     | " + confirmarArsenal1);
            System.out.println(" Coord-09    |     abbbb    | " + confirmarArsenal2 );
            System.out.println("-----------------------------------------------------------------------------------------\n");
        }else{
            System.out.println("Ingreso incorrecto.");
        }

        sc.close();

    }
    

}
