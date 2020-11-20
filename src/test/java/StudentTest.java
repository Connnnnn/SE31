

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

//import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private ArrayList<Course> courses = new ArrayList<Course>();
    private ArrayList<Modules> modules = new ArrayList<Modules>();

    @Test
    void getName() {
    }

    @Test
    void getAge() {
    }

    @Test
    void getDOB() {
    }

    @Test
    void getID() {
        Student student = new Student("Conor", 21, "1998-12-08", "1738", courses, modules);

        //assertEquals();
    }

    @Test
    void getUsername() {
    }

    @Test
    void getCourses() {
    }

    @Test
    void getModules() {
    }
}