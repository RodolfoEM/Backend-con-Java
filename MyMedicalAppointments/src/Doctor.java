public class Doctor {
    // Atributos:
    static int id = 0; //Autoincrement
    String name;
    String speciality;

    //Método constructor
    Doctor(){
        System.out.println("Construyendo el objeto Doctor");
    }

    Doctor(String name, String speciality){
        id++;
        System.out.println("El nombre del doctor asignado es: " + name);
        this.name = name;
        this.speciality = speciality;
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
