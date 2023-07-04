public class SwitchStatement {
    public static void main(String[] args) {

        String mode = "light";

        switch (mode){
            case "noche":
                System.out.println("Activando modo Oscuro");
                break;
            case "light":
                System.out.println("Activando modo light");
                break;
            default:
                System.out.println("Modo por default");
            break;
        }
    }
}
