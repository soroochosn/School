import java.util.Arrays;

public class School {
    private String name;
    private Section[] sections = new Section[200];
    private int sectionCount = 0;

    public School(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Section[] getSection() {
        return sections;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSection(Section s){
        sections[sectionCount] = s;
        sectionCount++;
    }


    public String toString() {
        return "The school named " + name + " has " + sectionCount + " sections.";

    }
}
