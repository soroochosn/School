public class School {
    String name;
    Section[] sections = new Section[200];
    int sectionCount=0;

    public School(String n){
        this.name=n;
    }

    public void addSection(Section s){
        sections[sectionCount]=s;
        sectionCount++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Section[] getSections() {
        return sections;
    }
}


