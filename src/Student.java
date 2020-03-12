public class Student extends Person{
    Section[] sections = new Section[10];
    int grade=0;
    int sectionCount=0;

    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Section[] getSections() {
        return sections;
    }
    public void addSections(Section s){
        sections[sectionCount]=s;
        sectionCount++;
    }
}
