public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;


        System.out.println(Math.PI);// 3.141592653589793
        System.out.println(Math.E); // 2.718281828459045

        Math.ceil(2.1);// 3.0 (redondear hacia arriba)
        Math.floor(2.1); // 2.0 (redondear hacia abajo)

        Math.pow(x, y); // 8.0 (número elevado a una potencia)
        Math.sqrt(x); // 1.73... (raíz cuadrada)

        Math.max(x, y); // 3.0 (el número más grande)

        // Área de un círculo (PI * r^2):
        System.out.println(Math.PI * Math.pow(y, 2));

        // Área de una esfera (4 * PI * r^2):
        System.out.println(4 * Math.PI * Math.pow(y, 2));

        // Volumen de una esfera ( (4/3) * PI * r^3):
        System.out.println((4/3) * Math.PI * Math.pow(y, 3));
    }
}
