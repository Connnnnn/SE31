import org.joda.time.DateTime;

import java.time.LocalDate;
import java.util.ArrayList;

public class Course {

    private String courseName;
    private ArrayList<Modules> modules;
    private ArrayList<Student> studentsEnrolled;
    private LocalDate startDate;
    private LocalDate endDate;

    public Course(String courseName, ArrayList<Modules> modules, ArrayList<Student> studentsEnrolled, LocalDate startDate, LocalDate endDate) {
        this.courseName = courseName;
        this.modules = modules;
        this.studentsEnrolled = studentsEnrolled;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Modules> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Modules> modules) {
        this.modules = modules;
    }

    public ArrayList<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(ArrayList<Student> studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
