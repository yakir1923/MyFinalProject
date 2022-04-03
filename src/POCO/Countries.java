package POCO;

public class Countries implements POCO {
    public int id;
    public String Name;


    public Countries() {
    }

    public Countries(int id, String name) {
        this.id = id;
        Name = name;
    }
}
