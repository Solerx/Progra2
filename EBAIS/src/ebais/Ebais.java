/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebais;

import java.util.ArrayList;

/**
 *
 * @author laboratorio
 */
public class Ebais {

    private int id;
    private String name;
    private String location;
    private ArrayList<Clinic> listOfClinics = new ArrayList<>();
    private ArrayList<Doctor> listOfDoctors = new ArrayList<>();
    private ArrayList<Patient> listOfPatients = new ArrayList<>();
    private ArrayList<Appointment> listOfAppointments = new ArrayList<>();

    public Ebais() {

    }

    public Ebais(int id, String name, String location) {

        this.id = id;
        this.name = name;
        this.location = location;
        //listOfDoctors.add(doctor);

    }

    public void setId(int id) {

        this.id = id;
    }

    public int getId() {

        return id;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setLocation(String location) {

        this.location = location;
    }

    public String getLocation() {

        return location;
    }

    public void setListOfDoctors(ArrayList<Doctor> listOfDoctor) {

        this.listOfDoctors = listOfDoctor;
    }

    public ArrayList<Doctor> getListOfDoctors() {

        return this.listOfDoctors;
    }

    public void setListOfPatients(ArrayList<Patient> listOfPatients) {

        this.listOfPatients = listOfPatients;
    }

    public ArrayList<Patient> getListOfPatients() {

        return this.listOfPatients;
    }

    public void setListOfAppointments(ArrayList<Appointment> listOfAppointments) {

        this.listOfAppointments = listOfAppointments;
    }

    public ArrayList<Appointment> getListOfAppointments() {

        return this.listOfAppointments;
    }
    
       public ArrayList<Clinic> getListOfClinics() {
        return listOfClinics;
    }

    public void setListOfClinics(ArrayList<Clinic> listOfClinics) {
        this.listOfClinics = listOfClinics;
    }

    @Override
    public String toString() {
        return "Ebais{" + "id=" + id + ", name=" + name + ", location=" + location + ", listOfDoctors=" + listOfDoctors + ", listOfPatients=" + listOfPatients + ", listOfAppointments=" + listOfAppointments + '}';
    }

    public void getMetPatients() {

        for (Appointment a : listOfAppointments) {

            String patient = a.getPatient().getName();
            System.out.println("" + patient);
        }      
    }
    
    public void addDoctor(Doctor doctor) {

        this.listOfDoctors.add(doctor);

    }
    
    public void addPatient(Patient patient) {

        this.listOfPatients.add(patient);

    }
    
    public void addAppointment(Appointment appointment) {

        this.listOfAppointments.add(appointment);

    }
     
}
