package universities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import student.Geography;
import student.Nursing;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class UniversityTest {

    //properties
    private University uni;


    @BeforeEach

    public void setUp(){

        uni= new University();

        //creating 3 students

        uni.addStudent(new Nursing("Cremilda Moreno", "+44 7346543987", "Nursing",
                3629145, 9250, true, uni, true,
                true));

        uni.addStudent(new Nursing("Susana Lopez", "+44 7346433321", "Nursing",
                329162, 13050, true, uni, false,
                true));

        uni.addStudent(new Geography("Bruno Martins", "+44 752144368", "Geography",
                329162, 13050, true, uni, false ));


    }


    @Test

    public void canAddStudentsToUniversity(){

        //Test to check that students are being added properly
            assertThat(uni.getStudents().size()).isEqualTo(3);

        }

    }




