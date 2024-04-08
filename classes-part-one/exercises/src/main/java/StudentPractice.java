public class StudentPractice {
    public static void main(String[] args){
        //instantiate your Student class below
        Student student = new Student("Hal Robison", 64114, 1, 4.0);
        Teacher historyTeacher = new Teacher("Phillip", "Hodges", "history", 15);
        Course worldHistory = new Course("World History", historyTeacher);

        System.out.println("NAME: " + student.getName());
        System.out.println("ID: " + student.getStudentId());
    }
}
