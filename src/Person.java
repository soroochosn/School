public class Person {
    String name;
    int id = 0;
    static int nextid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextid() {
        return nextid;
    }
    
}
