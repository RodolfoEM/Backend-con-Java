public class Casting {
    public static void main(String[] args) {
        //En un año 30 perritos
        //Cuantos perritos al mes

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //ESTIMACIÓN
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //EXACTITUD
        int a = 30;
        int b = 12;

        System.out.println(a/b);
        System.out.println((double) a/b);

        int e = 30;
        int d = 12;
        double c = e/d;
        System.out.println(c); // 2.0 valor truncado por cast automático

        double f = (double) e/d;
        System.out.println(f); // 2.5 valor casteado
   }
}
