import java.util.ArrayList;

public class Modules {

    private String modName;
    private String id;
    private ArrayList<Student> students;
    private ArrayList<Course> coursesAssociated;

    public Modules(String modName, String id, ArrayList<Student> students, ArrayList<Course> coursesAssociated) {
        this.modName = modName;
        this.id = id;
        this.students = students;
        this.coursesAssociated = coursesAssociated;
    }

    public String getModName() {
        return modName;
    }

    public void setModName(String modName) {
        this.modName = modName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Course> getCoursesAssociated() {
        return coursesAssociated;
    }

    public void setCoursesAssociated(ArrayList<Course> coursesAssociated) {
        this.coursesAssociated = coursesAssociated;
    }
    public void addStudent(Student s,Modules m){

        if (m.getStudents().contains(s)){
            return;
        }
        else{
            m.students.add(s);
        }
    }
    public void addModuleToCourse(Modules m,Course c){
        if(c.getModules().contains(m)){
            return;
        }
        else{
            m.coursesAssociated.add(c);
            c.AddModuleToCourse(m, c);
        }
    }
}
