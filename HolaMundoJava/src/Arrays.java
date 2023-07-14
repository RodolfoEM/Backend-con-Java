public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions = new String[17]; //El tamaño 17 sirve para limitar el array
        String days[] = new String[7]; //Esta es una buena forma de usar arrays ya que los días son fijos y no aumentan, depende de la lógica del negocio

        //Array de 2 dimensiones
        /*
         * +------------------------------+
         * |  Country    |  City          |
         * --------------------------------
         * | México      | CDMX           |
         * | México      | Guadalajara    |
         * | Colombia    | Bogotá         |
         * | Colombia    | Medellín       |
         * +------------------------------+
         * */
        String[][] cities = new String[4][2]; // 4 filas y 2 columnas -> 4*2=8(espacios)

        //Arreglo de 3 dimensiones
        int [][][] numbers = new int[2][2][2]; // 2 filas, 2 columnas y 2 páginas

        androidVersions[0] = "Apple pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        for (int i = 0; i < androidVersions.length; i++) {
            System.out.println(androidVersions[i]);
        }

        // Foreach usado en el array "androidVersions"
        for (String version:androidVersions) {
            System.out.println(version);
        }

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogota";
        cities[2][0] = "México";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "México";
        cities[3][1] = "CDMX";

        for (int row = 0; row < cities.length; row++) {
            for (int col = 0; col < cities[row].length; col++) {
                System.out.println(cities[row][col]);
            }
        }

        // Foreach usado en el array "cities" de dos dimensiones
        for (String[] pair:cities) { // Traemos la primera dimensión(filas)
            for (String name:pair) { // Traemos la segunda dimensión(columna)
                System.out.println(name);
            }
        }


        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";


        for (int i = 0; i <=1 ; i++) {
            for (int j = 0; j <=0; j++) {
                for (int k = 0; k <=0; k++) {
                    for (int l = 0; l <=1; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }


    }
}
