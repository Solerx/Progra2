/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebais;

import java.util.Calendar;

/**
 *
 * @author laboratorio
 */
public class Appointment {

    private Patient patient;
    private Doctor doctor;
    private Calendar date;
    private String description;

    public Appointment() {

    }

    public Appointment(Patient patient, Doctor doctor) {

        this.patient = patient;
        this.doctor = doctor;

    }

    public void setPatient(Patient patient) {

        this.patient = patient;
    }

    public Patient getPatient() {

        return this.patient;
    }

    public void setDoctor(Doctor doctor) {

        this.doctor = doctor;
    }

    public Doctor getDoctor() {

        return this.doctor;
    }

    public void setDate(Calendar date) {

        this.date = date;
    }

    public Calendar getDate() {

        return this.date;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public String getDescription() {

        return this.description;
    }

    @Override
    public String toString() {
        return "Appointment{" + "patient=" + patient + ", doctor=" + doctor + ", date=" + date + ", description=" + description + '}';
    }
    
    
}
