public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //bono $200
        salary += 200;
        System.out.println(salary);

        //pension: $50 descuento
        salary -= 50;
        System.out.println(salary);

        //2 horas extra: $30*2
        //cupón de comida: $45
        salary+=(60-45);
        System.out.println(salary);

        // Actualizar variables de tipo String:
        String employeeName = "Anahí";
        employeeName += " Salgado";
        System.out.println(employeeName); // Anahí Salgado

        employeeName += " Díaz de la Vega";
        System.out.println(employeeName); // Anahí Salgado Díaz de la Vega

        employeeName = "Irene " + employeeName;
        System.out.println(employeeName); // Irene Anahí Salgado Díaz de la Vega
    }
}
