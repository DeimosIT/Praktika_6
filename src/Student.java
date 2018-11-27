public class Student{
    int id;
    String student;

    Student()
    {
        id = 0;
        student = " ";
    }
    Student(int id, String student)
    {
        this.id = id;
        this.student = student;
    }
    @Override
    public String toString(){
        return "Student: "+this.student+" ID: "+this.id+"";
    }
}
