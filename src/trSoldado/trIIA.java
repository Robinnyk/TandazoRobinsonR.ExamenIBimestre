package trSoldado;

public interface trIIA {

    public static boolean trbuscar(String trTipoArsenal){

        trTipoArsenal = trTipoArsenal.toLowerCase();
        if (trTipoArsenal == "aaaa" || trTipoArsenal == "abbbb"){
            System.out.println("Coordenadas detectadas correctamente.");
            System.out.println("Inciando proceso para explotar el arsenal bélico...");
            return true;
        }
        return false;
        
    }
}
