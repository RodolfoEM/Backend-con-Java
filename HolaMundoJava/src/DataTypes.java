public class DataTypes {
    public static void main(String[] args) {
        int n = 1234567890;
        long nL = 12345678901L;

        double nD = 123.456;
        float nF = 123.456F;

        // desde Java 10 de pueden declarar variables con "var" sin definir el tipo de dato

        var salary = 1000; //int
        //pension 3%
        var pension = salary * 0.03; //double
        var totalSalary = salary - pension;

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Rodolfo Espinosa";
        System.out.println("EMPLOYEE: " + employeeName + " SALARY: " + totalSalary);
    }
}
