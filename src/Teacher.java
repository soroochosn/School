public class Teacher extends Person{
    Section[] sections = new Section[10];
    String subject;
    int sectionCount=0;

    public Teacher(String name, int grade) {
        super(name);
        this.subject = subject;
    }
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Section[] getSections() {
        return sections;
    }
    public void addSection(Section s){
        sections[sectionCount]=s;
        sectionCount++;
    }
}