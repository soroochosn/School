import java.util.Arrays;

public class Section {
    private Teacher teacher;
    private Student[] students = new Student[50];
    private String name;
    private int currentSize;

    public Section(String name){
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Student[] getStudent() {
        return students;
    }

    public String getName() {
        return name;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void addStudent(Student s){
        students[currentSize] = s;
        currentSize++;
    }



    public String toString() {
        String o = "";
        for(int i = 0; i<currentSize;i++) {
            o += students[i].name + ", ";
        }
        return this.name + " is taught by " + this.teacher.name +  " and has " + currentSize + " students: " + o;

    }
}
    public String toString() {
        return super.toString();
    }
}

