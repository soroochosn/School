import java.util.Arrays;

public class Teacher extends Person{
    private Section[] sections = new Section[10];
    private String subject;
    private int sectionCount;

    public Teacher(String name, String subject){
        super(name);
        this.subject = subject;
    }

    public Section[] getSection() {
        return sections;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void addSection(Section s){
        sections[sectionCount] = s;
        sectionCount++;
    }

    @Override
    public String toString() {
        String o = "";
        for(int i = 0; i<sectionCount;i++) {
            o += sections[i].getName() + " (" + sections[i].getCurrentSize() + ")";
        }

        return name + " teaches the following sections: " + o;
    }
}
