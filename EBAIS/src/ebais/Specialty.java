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
public class Specialty {
    
    private int id;
    private String name;
    private String university;
    private Calendar graduationYear;
 
    public Specialty(){
    
    }
    
    public Specialty(String name, String university){
        
        this.name = name;
        this.university = university;
        
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
    
    public void setUniversity(String university) {

        this.university = university;
    }

    public String getUniversity() {

        return university;
    }
    
    public void setGraduationYear(Calendar graduationYear) {

        this.graduationYear = graduationYear;
    }

    public Calendar getGraduationYear() {

        return graduationYear;
    }

    @Override
    public String toString() {
        return "Specialty{" + "id=" + id + ", name=" + name + ", university=" + university + ", graduationYear=" + graduationYear + '}';
    }
    
    
    
}
