package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    // Atributos:
    private String speciality;

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
//AvaibleAppointment

    //Método constructor

    public Doctor(String name, String email){
        super(name, email);
        System.out.println("El nombre del doctor asignado es: " + name);
        this.speciality = speciality;
    }

    // Comportamientos (métodos):

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpesiality: " + speciality + "\nAvailable: " + availableAppointments;
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Cruz Roja");
        System.out.println("Departamento: Cancerología");
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;
        public AvailableAppointment(Date date, String time){
            this.date=date;
            this.time=time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appontments \nDate: " + date + "\nTime: " + time;
        }
    }
}