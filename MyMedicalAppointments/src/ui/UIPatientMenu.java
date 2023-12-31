package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {
    public static void showPAtientMEnu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome" + UIMenu.patientLogged);
            System.out.println("1.Book an appoinment");
            System.out.println("2.My appoinment");
            System.out.println("3.Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        }while (response!=0);
    }
    private static void showBookAppoinmentMenu(){
        int response = 0;
        do {
            System.out.println("::Book an appoinment");
            System.out.println("::Select date");
            //Numeración de la lista de fechas en el primer Integer
            //Indice de la fecha selecionada
            // 1. Doctor#1
            // - - - Fecha#1
            // - - - Fecha#2
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppoinments.size(); i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments
                        = UIDoctorMenu.doctorsAvailableAppoinments.get(i).getAvailableAppointments();
                Map<Integer, Doctor> doctorAppoinments = new TreeMap<>();
                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppoinments.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppoinments.get(i));
                    doctors.put(Integer.valueOf(k), doctorAppoinments);
                }
            }
            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());

        } while (response!=0);
    }
}
