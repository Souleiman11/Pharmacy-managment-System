public class Pharmacist {
    private int id;
    private String name;

    public Pharmacist(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pharmacist [ID=" + id + ", Name=" + name + "]";
    }
}
