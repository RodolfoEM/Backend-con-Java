package model;

public class Patient extends User{
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    public Patient(String name, String email){
        super(name, email);
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historíal completo desde nacimiento");
    }

    //54.5
    public void setWeight(double weight) {
        this.weight = weight;
    }

    //54.5 Kg String
    public String getweight(){
        return this.weight + " Kg";
    }

    public String getHeight() {
        return height + " m";
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
