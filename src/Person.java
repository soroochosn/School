public class Person {
    protected String name;
    private int id;
    static int nextID = 0;

    public Person(String name){
        this.name = name;
        this.id = nextID;
        nextID = nextID++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}
