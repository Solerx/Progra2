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
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Ebais ebais = new Ebais(1, "Montes de Oca", "San Jose");
        Clinic clinic = new Clinic("Odontologia", 2);
        Doctor doctor = new Doctor(1, "Dr. Juan", clinic);
        Patient patient = new Patient(1, "Pancho", "Central", "San Jose", Calendar.getInstance());
        Specialty specialty = new Specialty("Odontologo", "Latina");

        ebais.addDoctor(doctor);
        ebais.getListOfClinics().add(clinic);
        doctor.addPatient(patient);
        doctor.addSpecialty(specialty);
        //System.out.println(ebais.getListOfDoctors().size());
        System.out.println(doctor.getListOfPacients().size());
        
        for (Doctor d: ebais.getListOfDoctors()) {
            
            System.out.println(d.getName());
            
        }

    }

}
