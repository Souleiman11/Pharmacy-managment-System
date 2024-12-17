import java.util.ArrayList;

public class User {
    
    String name;
    String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }


    //List of Medicines
    public ArrayList<Medicine> MedicineStock = new ArrayList<>();
    //List of Pharmacists
    public ArrayList<Pharmacist> PharmacistsList = new ArrayList<>();


    public boolean validatePassword(String password) {
        return password.equals(this.password);
    }

    public boolean validateName(String name) {
        return name.equals(this.name);
    }

    //getters and setters
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPassword(){
        return password;
    }
    public void setPassword(String password) {
        this.password=password;
    }

    @Override
    public String toString(){
        return "name: "+this.name+
        ", password: "+this.password;
    }


    public void viewMedicine(String medName){
        // Display medicine details
        System.out.println("Medicine details:");
        // Add your code here to display medicine details
        for(Medicine medic:MedicineStock){
            if(medName.equals(medic.getName())){
                System.out.println(medic.toString());
                return;
            }
        }
    }



}
