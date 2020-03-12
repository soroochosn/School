public class Section {
    private Teacher teacher;
    Student[] students = new Student[50];
    String name;
    int currentSize = 0;

    public Section(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student s) {
        students[currentSize] = s;
        currentSize++;

    }

    @Override
    public String toString() {
        return super.toString();
    }
}

