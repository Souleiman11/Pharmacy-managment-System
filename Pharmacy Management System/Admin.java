
public class Admin extends User{
    
    int id;

    public Admin(String name, String password, int id) {
        super(name, password);
        this.id = id;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void login(String username, String password){
        if(validateName(username) && validatePassword(password)){
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials!");
        }
    }

    public void logout() {
        System.out.println("Logout successful!");
    }

    public void addMedicines(int id, String name, int quantity){
        Medicine newMedicine = new Medicine(id, name, quantity);
        MedicineStock.add(newMedicine);
        System.out.println("Medicine added with ID: " + id + ", Name: " + name + ", Quantity: " + quantity);
    }
    
}