import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    // Atributos:
    static int id = 0; //Autoincrement
    private String name;
    private String email;
    private String speciality;

    //AvaibleAppointment

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

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
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
    }
}
