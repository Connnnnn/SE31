import java.util.ArrayList;
import java.util.Date;

public class Student {

    private String Name;
    private int Age;
    private String DOB;
    private String ID;
    private String userName;
    private ArrayList<Course> courses;
    private ArrayList<Modules> modules;

    public Student(String name, int age, String DOB, String ID, ArrayList<Course> courses, ArrayList<Modules> modules) {

        Name = name;
        Age = age;
        this.DOB = DOB;
        this.ID = ID;
        this.courses = courses;
        this.modules = modules;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUsername() {
        String name = this.getName().toLowerCase();
        name = name.replaceAll("\\s+", "");

        int age = this.getAge();
        this.userName = name + age;

        return userName;
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<Modules> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Modules> modules) {
        this.modules = modules;
    }

    public void addCourse(Course c){
        if (this.courses.contains(c)){
            return;
        }
        else{
            this.courses.add(c);
        }
    }

    public void addStudentToModule(Student s,Modules m){
        if (m.getStudents().contains(s)) {
            return;
        }
        else{
            s.modules.add(m);
            m.addStudent(s,m);
            return;
        }


    }
}
