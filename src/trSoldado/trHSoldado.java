package trSoldado;

import trArchivo.TandazoRobinsoncvs;
import trComida.trAlimento;

public class trHSoldado extends trAlimento {

    private String trTipoAlimento;
    
    public String getTrTipoAlimento() {
        return trTipoAlimento;
    }
    public void setTrTipoAlimento(String trTipoAlimento) {
        this.trTipoAlimento = trTipoAlimento;
    }

    public trHSoldado(String trAlimento) {
        
    }

    public static void trComer(String trAlimento){
        
        trAlimento = trAlimento.toLowerCase();

         if (trAlimento != null && trAlimento.equalsIgnoreCase("carne")) {

            System.out.println("Alimento adecuado para la hormiga soldado.");
            System.out.println("Comiendo...");
            System.out.println("La hormiga soldado VIVE plenamente.");

            TandazoRobinsoncvs.hormigaEnergia = true;

        } else {

            System.out.println("Alimento incorrecto para la hormiga soldado");
            System.out.println("Procesando...");
            System.out.println("La hormiga soldado MUERE.");

            TandazoRobinsoncvs.hormigaEnergia = false;
        }
    }

}
