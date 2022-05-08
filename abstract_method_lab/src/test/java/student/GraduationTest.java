package student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import universities.University;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GraduationTest {

    //Properties

    Graduation graduation;
    Nursing nursingStudent1, nursingStudent2;
    Geography geographyStudent1, geographyStudent2;


    @BeforeEach

    public void setUp() {

        University uni = new University();

        graduation = new Graduation("Knightsbridge", "University of NorthSea", "Nursing");

        nursingStudent1 = new Nursing("Cremilda Moreno", "+44 7346543987", "Nursing",
                3629145, 9250, true, uni, true,
                true);


        nursingStudent2 = new Nursing("Maria Fernando", "+44 7565203587", "Nursing",
                3578321, 9250, false, uni, false,
                false);

        geographyStudent1 = new Geography("Arabella Hopkins", "+44 7346553987",
                "Geography", 3629135, 9250,
                true, uni, true);


        geographyStudent2 = new Geography("Daisy Miller", "+44 7565033587",
                "Geography", 3528321, 13050, false, uni,
                false);

    }


    @Test

    //Test that students can be added to graduation ceremony

    public void canAddNursingStudents() {

        graduation.addSNursingStudent(nursingStudent1);
        graduation.addSNursingStudent(nursingStudent2);

        assertThat(graduation.getNursingGraduationStudents().size()).isEqualTo(2);

    }

    @Test

    //Test that students can be removed from graduation ceremony

    public void canRemoveNursingStudents() {

        graduation.removeNursingStudent(nursingStudent2);
        assertThat(graduation.getNursingGraduationStudents().size()).isEqualTo(0);
    }

    @Test

    //Test that Geography students can be removed from the nursing graduation ceremony

    public void canRemoveGeogStudents() {

        graduation.removeGeographyStudent(geographyStudent1);
        graduation.removeGeographyStudent(geographyStudent2);

        assertThat(graduation.getNursingGraduationStudents().size()).isEqualTo(0);

    }

}
