import static org.junit.jupiter.api.Assertions.assertEquals;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Date;

public class TestClass {

        Student testStudent = new Student("Conor Keaney", 21,"08/12/1998" ,"17323273", new ArrayList<Course>(), new ArrayList<Modules>());
        Modules testModule = new Modules("TestModule","123",new ArrayList<Student>(),new ArrayList<Course>());
        Course testCourse = new Course("TestCourse",new ArrayList<Modules>(),new ArrayList<Student>(),new DateTime(2017,9,01, 00, 00), new DateTime(2021,05,15, 00, 00));



        //---------------------------------------------------------
        //-------------------STUDENT TESTS--------------------------
        //---------------------------------------------------------

        @Test
        public void testingAddCourse(){
            testStudent.addCourse(testCourse);
            assertEquals(1,testStudent.getCourses().size(),"testPass");

            assertEquals(testStudent.getCourses().get(0).getCourseName(), testCourse.getCourseName(), "Testing if correct course added");

        }
        @Test
        public void testStudentToModule(){
            testStudent.addStudentToModule(testStudent,testModule);

            assertEquals(1,testStudent.getModules().size());
            assertEquals(1,testModule.getStudents().size(),"testing");

            assertEquals(testModule.getStudents().get(0).getUsername(), testStudent.getUsername(), "Testing if correct student added");
            assertEquals(testStudent.getModules().get(0).getModName(), testModule.getModName(), "Testing if correct module added");
        }

        @Test
        public void userNameIsNameAndAge() {

             assertEquals("conorkeaney21", testStudent.getUsername(),"Correct, Test Passed");
        }

        //---------------------------------------------------------
        //-------------------MODULE TESTS--------------------------
        //---------------------------------------------------------

        @Test
        public void moduleAddStudentTest(){
            testModule.addStudent(testStudent,testModule);
            assertEquals(1,testModule.getStudents().size(),"Different number of students");

            assertEquals(testModule.getStudents().get(0).getUsername(), testStudent.getUsername(), "Testing Username");
        }

        @Test
        public void addModuleToCourseTest(){
            testModule.addModuleToCourse(testModule,testCourse);

            assertEquals(1,testModule.getCoursesAssociated().size(), "Testing number of courses");
            assertEquals(1,testCourse.getModules().size(),"Testing number of modules");

            assertEquals(testCourse.getModules().get(0).getId(), testModule.getId(), "Testing for correct ID");

        }


        //---------------------------------------------------------
        //-------------------COURSE TESTS--------------------------
        //---------------------------------------------------------

        @Test
        public void addModuleInCourseTest(){
            testCourse.AddModuleToCourse(testModule,testCourse);
            assertEquals(1,testCourse.getModules().size());

            assertEquals(testCourse.getModules().get(0).getModName(), testModule.getModName(), "Testing for correct module added");
        }

        @Test
        public void addStudentToCourseTest(){
            testCourse.AddStudentToCourse(testStudent,testCourse);

            assertEquals(1,testCourse.getStudentsEnrolled().size(),"Does course have student");
            assertEquals(1,testStudent.getCourses().size(),"Does student have course");

            assertEquals(testCourse.getStudentsEnrolled().get(0).getUsername(), testStudent.getUsername(), "Testing for correct student added");
        }

}

