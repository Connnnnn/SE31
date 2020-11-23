import static org.junit.jupiter.api.Assertions.assertEquals;

import org.joda.time.DateTime;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

public class TestClass {


        ArrayList<Student> students;
        ArrayList<Course> courses;
        ArrayList<Modules> modules;
        Date date;
        Student testStudent = new Student("Conor Keaney", 21,"08/12/1998" ,"17323273", new ArrayList<Course>(), new ArrayList<Modules>());
        Modules myTestModule = new Modules("TestModule","123",new ArrayList<Student>(),new ArrayList<Course>());
        Course testCourse = new Course("TestCourse",new ArrayList<Modules>(),new ArrayList<Student>(),new DateTime(2017,9,01, 00, 00), new DateTime(2021,05,15, 00, 00));



        @Test
        public void gettingUsernameShouldReturnNamePlusAge() {

            // assert statements
            assertEquals("conorkeaney21", testStudent.getUsername(), "" +
                    "Correct, Test Passed");

        }


        @Test
        //StudentTests
        public void testingAddCourse(){
            testStudent.addCourse(testCourse);
            assertEquals(1,testStudent.getCourses().size(),"testPass");

        }
        @Test

        public void testStudentToModule(){
            testStudent.addStudentToModule(testStudent,myTestModule);

            assertEquals(1,testStudent.getModules().size());
            assertEquals(1,myTestModule.getStudents().size(),"testing");
        }

        //module tests
        @Test

        public void moduleAddStudentTest(){
            myTestModule.addStudent(testStudent,myTestModule);
            assertEquals(1,myTestModule.getStudents().size(),"testing");
        }

        @Test

        public void addModuleToCourseTest(){
            myTestModule.addModuleToCourse(myTestModule,testCourse);

            assertEquals(1,myTestModule.getCoursesAssociated().size());
            assertEquals(1,testCourse.getModules().size());
        }


        //courseTest
        @Test
        public void addModuleInCourseTest(){
            testCourse.AddModuleToCourse(myTestModule,testCourse);
            assertEquals(1,testCourse.getModules().size());
        }
        @Test

        public void addStudentToCourseTest(){
            testCourse.AddStudentToCourse(testStudent,testCourse);

            assertEquals(1,testCourse.getStudentsEnrolled().size(),"testing course has student");
            assertEquals(1,testStudent.getCourses().size(),"testing Student Has Course");
        }






}

