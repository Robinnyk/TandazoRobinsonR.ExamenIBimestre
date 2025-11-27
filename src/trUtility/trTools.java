package trUtility;

public abstract class trTools{

    public static void barraCargaLoading (){
        
        char[] simbolos = {'\\', 'l', '/', '-', 'l'};

        for (int pos = 0; pos <= 99; pos++) {

            char simboloActual = simbolos[pos % simbolos.length];

            System.out.println(simboloActual + " " + pos + "%");
        }

        System.out.println("\\l/-l 100%");

    }

    public static void mostrarCoordenadas (){
        
        
        System.out.println("Loading | Geoposición | Lunes  | Martes | Miércoles | Jueves | Viernes | Tipo Arsenal");
        System.out.println("100%    | Coord-01    | 01-02  |        |           |        |         | a");
        System.out.println("100%    | Coord-07    |        |        |   03-06   |        |         | abcdd");
        System.out.println("100%    | Coord-05    |        |        |           |        | 05-10   | abcdt");
        System.out.println("100%    | Coord-01    | 01-02  |        |           |        |         | aa");
        System.out.println("100%    | Coord-02    |        | 02-04  |           |        |         | ab");
        System.out.println("100%    | Coord-09    | 01-02  |        |           |        |         | abbb");
        System.out.println("100%    | Coord-02    |        | 02-04  |           |        |         | abb");
        System.out.println("100%    | Coord-01    | 01-02  |        |           |        |         | aaa");
        System.out.println("100%    | Coord-01    | 01-02  |        |           |        |         | aaaa");
        System.out.println("100%    | Coord-09    | 01-02  |        |           |        |         | abbbb");
        
    }
}
