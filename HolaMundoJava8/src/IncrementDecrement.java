public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        //Postfija
        lives --; //Decremento
        System.out.println(lives);
        lives --;
        System.out.println(lives);
        lives ++;//Incremento
        System.out.println(lives);

        //Prefija
        //Gana un regalo por ganar una vida
        int gift = 100 + lives++; //Postfijo accede al dato de lives antes de sumarle uno
        int gift = 100 + ++lives; //Prefijo suma y despues muestra el dato
        System.out.println(gift);
    }
}
