/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ebais;
   
public class Patient {

    private int id;
    private String name;
    private String canton;
    private String district;
    
    public Patient(){
          
    
    }
    
   public void setId(int idFromUser){
   
   this.id = idFromUser;
       
   } 
    
   public int getId(){
   
   return this.id;       
   }
   
   public void setName(String nameFromUser){
   
   this.name = nameFromUser;
       
   } 
    
   public String getName(){
   
   return this.name;       
   }
    
   public void setCanton(String cantonFromUser){
   
   this.canton = cantonFromUser;
       
   } 
    
   public String getCanton(){
   
   return this.canton;       
   }
   
   public void setDistrict(String districtFromUser){
   
   this.district = districtFromUser;
       
   } 
    
   public String getDistrict(){
   
   return this.district;       
   }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", name=" + name + ", canton=" + canton + ", district=" + district + '}';
    }
   
   
}
