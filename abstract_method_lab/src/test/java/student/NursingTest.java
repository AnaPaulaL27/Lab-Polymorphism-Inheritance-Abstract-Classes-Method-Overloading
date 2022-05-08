package student;

import Timetable.Weekday;
import assignments.NursingAssignment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import universities.University;

import java.time.Period;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NursingTest {


    private Nursing nursingStudent1;
    private Nursing nursingStudent2;
    private Graduation graduation;

    @BeforeEach

    public void setUp() {
        University uni = new University();
        graduation = new Graduation("Knightsbridge", "Kingsmead University", "Nursing");

        nursingStudent1 = new Nursing("Cremilda Moreno", "+44 7346543987", "Nursing",
                3629145, 9250, true, uni, true,
                true);


        nursingStudent2 = new Nursing("Maria Fernando", "+44 7565203587", "Nursing",
                3578321, 9250, false, uni, false,
                false);


        //add tasks

        uni.getNursingVLE().add(new NursingAssignment("Reflection on the importance of Hand Hygiene",
                "Dora Yankee"));

        uni.getNursingVLE().add(new NursingAssignment("Nursing Communication Process",
                "Sue Donald"));

        uni.getNursingVLE().add(new NursingAssignment("Registered Nurse in the Nursing Home Act",
                "Sue Donald"));


    }

    @Test
    public void hasName() {

        assertThat(nursingStudent1.getName()).isEqualTo("Cremilda Moreno");
        assertThat(nursingStudent2.getName()).isEqualTo("Maria Fernando");
    }

    @Test
    public void hasContact() {

        assertThat(nursingStudent1.getContact()).isEqualTo("+44 7346543987");
        assertThat(nursingStudent2.getContact()).isEqualTo("+44 7565203587");
    }

    @Test
    public void hasCourse() {

        assertThat(nursingStudent1.getCourse()).isEqualTo("Nursing");
    }

    @Test
    public void hasStudentId() {

        assertThat(nursingStudent1.getStudentId()).isEqualTo(3629145);
    }

    @Test
    public void hasStudentFees() {

        assertThat(nursingStudent1.getStudentFees()).isEqualTo(9250);
    }

    @Test
    public void canCheckIfLivingInLondon() {
        assertThat(nursingStudent2.getIsLivingInLondon()).isEqualTo(false);

    }

    @Test
    public void canCheckIfExperiencedInCare() {
        assertThat(nursingStudent1.getIsExperiencedInCare()).isEqualTo(true);
        assertThat(nursingStudent2.getIsExperiencedInCare()).isEqualTo(false);
    }

    @Test
    public void canCheckDBSStatus() {
        assertThat(nursingStudent1.getHasCompletedDBSCheck()).isEqualTo(true);
        assertThat(nursingStudent2.getHasCompletedDBSCheck()).isEqualTo(false);
    }

    @Test

    public void canGoOnPracticePlacement() {
        assertThat(nursingStudent1.practicePlacement()).isEqualTo("Cremilda Moreno is on a practice placement");
        assertThat(nursingStudent2.practicePlacement()).isEqualTo("Maria Fernando is on a practice placement");

    }

    @Test

    public void canPullAssignments() {

        nursingStudent1.submissions();
        nursingStudent1.submissions();

        assertThat(nursingStudent1.uni.getNursingVLE().size()).isEqualTo(1);
    }

    @Test

    public void canStudy() {

        assertThat(nursingStudent1.study()).isEqualTo("Cremilda Moreno is studying");
        assertThat(nursingStudent2.study()).isEqualTo("Maria Fernando is studying");

    }

    @Test

    public void canJoinSocieties() {
        assertThat(nursingStudent1.joinSocieties()).isEqualTo("Cremilda Moreno is joining a society");
        assertThat(nursingStudent2.joinSocieties()).isEqualTo("Maria Fernando is joining a society");

    }

    @Test

    public void canAddGraduationTicket() {
        nursingStudent1.addTicket(graduation);
        assertThat(nursingStudent1.getBoughtNursingGraduationTickets().size()).isEqualTo(1);
    }

    @Test

    public void canCancelGraduationTicket() {
        nursingStudent2.removeTicket(graduation);
        assertThat(nursingStudent1.getBoughtNursingGraduationTickets().size()).isEqualTo(0);
    }

    @Test

    public void canCheckTimetable() {
        assertThat(nursingStudent1.checkTimetable().isEmpty()).isEqualTo(false);
    }
}

