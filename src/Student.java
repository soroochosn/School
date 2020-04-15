import java.util.Arrays;

public class Student extends Person{
    private Section[] sections = new Section[10];
    private int grade;
    private int sectionCount;

    public Student(String name, int grade){
        super(name);
        this.grade = grade;
    }

    public Section[] getSection() {
        return sections;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void addSection(Section s){
        sections[sectionCount] = s;
        sectionCount++;
    }



    @Override
    public String toString() {
        String o = "";
        for(int i = 0; i<sectionCount;i++) {
            o += sections[i].getName() + " taught by " + sections[i].getTeacher().getName();
            if(i < sectionCount-1) {
                o += ", ";
            }
        }
        return name + " is in " + grade + " grade and is enrolled in the following sections: " + o;

    }
}
