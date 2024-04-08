public class Course {
    private String topic;
    private StudentPractice.Teacher instructor;

    public Course (String topic, StudentPractice.Teacher instructor) {
        this.topic = topic;
        this.instructor = instructor;
    }

    public Course(String worldHistory, Teacher historyTeacher) {
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public StudentPractice.Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(StudentPractice.Teacher instructor) {
        this.instructor = instructor;
    }

}