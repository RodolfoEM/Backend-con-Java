public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        System.out.println(circlrArea(y));
        System.out.println(sphereArea(y));
        System.out.println(sphereVolum(y));

        convertToDolar(35, "MXN");

    }

    public static double circlrArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double sphereVolum(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    /**
     * Descripción: Función, que especificando la moneda, convierte una cantidad de dinero a dolares
     *
     * @param quantity Descripción: es la cantidad de la moneda a convertir a dolares.
     * @param currency Descripción: moneda de la que se quiere convertir a dolares (MXN o COP).
     * @return quantity Descripción: devuelve la cantidad actualizada en dolares.
     * */
    public static double convertToDolar(double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity = quantity*0.052;
                break;
            case "COP":
                quantity = quantity*0.00031;
                break;
        }
        return quantity;
    }
}
