package trSoldado;

public interface trIHormiga {

    public static void trComer(String trAlimento){
        
        trAlimento = trAlimento.toLowerCase();
        if (trAlimento == "carne"){
            System.out.println("Alimento adecuado para la hormiga soldado.");
            System.out.println("Comiendo...");
            System.out.println("La hormiga soldado VIVE plenamente.");
        }else {
            System.out.println("Alimento incorrecto para la hormiga soldado");
            System.out.println("Procesando...");
            System.out.println("La hormiga soldado MUERE debido a que fue alimentado incorrectamente.");
        }
    }
    
}
