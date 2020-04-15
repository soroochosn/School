Public class Runner {
    public static void main(String[] args){
      School b = new School("Berkeley High");
      Section c = new Section("Math");
      Section d = new Section("Biology");
      Section e = new Section("Computer Science");
      Teacher A = new Teacher("Alboss", "Computer Science");
      Teacher M = new Teacher("Mueller", "Biology");
      Teacher a = new Teacher("Nathan", "Math");
      Student Emmett = new Student("Emmett", 11);
      Student Soroosh = new Student("Soroosh", 11);
      Student Lucas = new Student("Lucas", 11);
      Student Matthew = new Student("Matthew", 11);
      Student Andrew = new Student("Andrew", 11);
      Student James = new Student("James", 11);



      b.addSection(c);
      b.addSection(d);
      b.addSection(e);

      c.setTeacher(a);
      d.setTeacher(M);
      e.setTeacher(A);

      A.addSection(e);
      M.addSection(d);
      a.addSection(c);

      c.addStudent(Emmett);
      c.addStudent(Lucas);
      c.addStudent(Matthew);
      d.addStudent(Andrew);
      d.addStudent(Emmett);
      d.addStudent(Soroosh);
      e.addStudent(Andrew);
      e.addStudent(Lucas);
      e.addStudent(James);

        Emmett.addSection(c);
        Lucas.addSection(c);
        Matthew.addSection(c);
        Andrew.addSection(d);
        Emmett.addSection(d);
        Soroosh.addSection(d);
        Andrew.addSection(e);
        Lucas.addSection(e);
        James.addSection(e);



        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
        System.out.println(e.toString());
        System.out.println(A.toString());
        System.out.println(M.toString());
        System.out.println(a.toString());
        System.out.println(Emmett.toString());
        System.out.println(Soroosh.toString());
        System.out.println(Lucas.toString());
        System.out.println(Matthew.toString());
        System.out.println(Andrew.toString());
        System.out.println(James.toString());






    }

}
