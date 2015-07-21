/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebais;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author laboratorio
 */
public class Doctor {

    private int id;
    private String name;
    private ArrayList<Specialty> listOfSpecialty = new ArrayList<>();
    private ArrayList<Patient> listOfPacients = new ArrayList<>();
    private ArrayList<Appointment> listOfAppointments = new ArrayList<>();
    private Clinic clinic;

    public Doctor() {

    }

    public void setId(int id) {

        this.id = id;

    }

    public int getId() {

        return this.id;
    }

    public void setName(String name) {

        this.name = name;

    }

    public String getName() {

        return this.name;
    }

    public void setListOfSpecialty(ArrayList<Specialty> listOfSpecialty) {

        this.listOfSpecialty = listOfSpecialty;

    }

    public ArrayList<Specialty> getListOfSpecialty() {

        return this.listOfSpecialty;
    }

    public void setListOfPatients(ArrayList<Patient> listOfPacients) {

        this.listOfPacients = listOfPacients;
    }

    public ArrayList<Patient> getListOfPacients() {

        return this.listOfPacients;
    }

    public void setListOfAppointments(ArrayList<Appointment> listOfAppointments) {

        this.listOfAppointments = listOfAppointments;
    }

    public ArrayList<Appointment> getListOfAppointments() {

        return this.listOfAppointments;
    }

    public void setClinic(Clinic clinic) {

        this.clinic = clinic;

    }

    public Clinic getClinic() {

        return this.clinic;
    }

    @Override
    public String toString() {
        return "Doctor{" + "id=" + id + ", name=" + name + ", specialty=" + listOfSpecialty + ", listOfPacients=" + listOfPacients + ", clinic=" + clinic + '}';
    }

    public void meetPatient(Patient patient) {

        this.listOfPacients.add(patient);

    }

    public void getTodayMetPatients(Calendar today) {

        Calendar todayPatients = Calendar.getInstance();
        int year = todayPatients.get(Calendar.YEAR);
        int month = todayPatients.get(Calendar.MONTH);
        int day = todayPatients.get(Calendar.DAY_OF_MONTH);

        for (Patient p : listOfPacients) {

            for (Appointment a : listOfAppointments) {

                if (p == a.getPatient() && a.getDate().get(Calendar.YEAR) == year && a.getDate().get(Calendar.MONTH) == month && a.getDate().get(Calendar.DAY_OF_MONTH) == day) {

                    System.out.println("" + p);

                }
            }
        }
    }

    public void addSpecialty(Specialty specialty) {

        this.listOfSpecialty.add(specialty);

    }
    
    public void addPatient(Patient patient) {

        this.listOfPacients.add(patient);

    }
    
    public void addAppointment(Appointment appointment) {

        this.listOfAppointments.add(appointment);

    }
}
