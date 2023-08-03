public class Doctor {
    // Atributos:
    static int id = 0; //Autoincrement
    String name;
    String speciality;

    //Método constructor
    Doctor(){
        System.out.println("Construyendo el objeto Doctor");
        id++;
    }

    Doctor(String name){
        System.out.println("El nombre del doctor asignado es: " + name);
    }

    // Comportamientos (métodos):
    public void showName() {
        // Instrucciones...
        System.out.println(name);
    }
    public void showID(){
        System.out.println("ID Doctor: " + id);
    }
}
