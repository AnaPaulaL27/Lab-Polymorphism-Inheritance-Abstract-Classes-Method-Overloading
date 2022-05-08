package student;


import assignments.GeographyAssignment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import universities.University;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GeographyTest {

    private Geography geographyStudent1;
    private Geography geographyStudent2;

    @BeforeEach

    public void setUp() {
        University uni = new University();

        geographyStudent1 = new Geography("Arabella Hopkins", "+44 7346553987",
                "Geography", 3629135, 9250,
                true, uni, true);


        geographyStudent2 = new Geography("Daisy Miller", "+44 7565033587",
                "Geography", 3528321, 13050,
                false, uni, false);

        //add tasks

        uni.getGeographyVLE().add(new GeographyAssignment("The Sedimentary Development of " +
                "the Eratosthenes Seamount", "Steve Higgins"));

        uni.getGeographyVLE().add(new GeographyAssignment("Theory of Evolution Influence on Physical Geography " +
                "Development", "Emma Jones"));

        uni.getGeographyVLE().add(new GeographyAssignment("Peripheral and Semi-Peripheral Regions in World " +
                "System Theory", "Juan Lopez"));
    }

    @Test
    public void hasName() {

        assertThat(geographyStudent1.getName()).isEqualTo("Arabella Hopkins");
        assertThat(geographyStudent2.getName()).isEqualTo("Daisy Miller");
    }

    @Test
    public void hasContact() {

        assertThat(geographyStudent1.getContact()).isEqualTo("+44 7346553987");
        assertThat(geographyStudent2.getContact()).isEqualTo("+44 7565033587");
    }

    @Test
    public void hasCourse() {

        assertThat(geographyStudent1.getCourse()).isEqualTo("Geography");
    }

    @Test
    public void hasStudentId() {

        assertThat(geographyStudent1.getStudentId()).isEqualTo(3629135);
    }

    @Test
    public void hasStudentFees() {

        assertThat(geographyStudent2.getStudentFees()).isEqualTo(13050);
    }

    @Test
    public void canCheckIfLivingInLondon() {
        assertThat(geographyStudent2.getIsLivingInLondon()).isEqualTo(false);

    }

    @Test

    public void canCheckIfHasTakenGeographyALevel() {
        assertThat(geographyStudent1.hasTakenGeographyAlevel()).isEqualTo(true);
        assertThat(geographyStudent2.hasTakenGeographyAlevel()).isEqualTo(false);

    }

    @Test

    public void canCheckIfCanGoOnFieldTrip() {
        assertThat(geographyStudent1.fieldTrip()).isEqualTo("Arabella Hopkins is on a field trip");
        assertThat(geographyStudent2.fieldTrip()).isEqualTo("Daisy Miller is on a field trip");

    }


    @Test

    public void canPullAssignments() {

        geographyStudent1.submissions();
        geographyStudent1.submissions();

        assertThat(geographyStudent1.uni.getGeographyVLE().size()).isEqualTo(1);
    }

    @Test

    public void canStudy() {

        assertThat(geographyStudent1.study()).isEqualTo("Arabella Hopkins is studying");
        assertThat(geographyStudent2.study()).isEqualTo("Daisy Miller is studying");

    }

    @Test

    public void canJoinSocieties() {
        assertThat(geographyStudent1.joinSocieties()).isEqualTo("Arabella Hopkins is joining a society");
        assertThat(geographyStudent2.joinSocieties()).isEqualTo("Daisy Miller is joining a society");

    }

    @Test

    public void canCheckTimetable(){
        assertThat(geographyStudent1.checkTimetable().isEmpty()).isEqualTo(false);


    }
}


