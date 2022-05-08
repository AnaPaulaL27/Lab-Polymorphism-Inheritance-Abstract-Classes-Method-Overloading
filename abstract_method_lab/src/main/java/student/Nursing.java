package student;

import Timetable.Weekday;
import assignments.Assignment;
import universities.University;

import java.util.ArrayList;
import java.util.List;

public class Nursing extends Student implements Graduate{

    //Properties:

    private boolean isExperiencedInCare;
    private boolean hasCompletedDBSCheck;
    private List<Graduation> boughtNursingGraduationTickets;
    // inherits all other properties from Student


    //constructor - method to create new object

    public Nursing(String name,
                   String contact,
                   String course,
                   int studentId,
                   int studentFees,
                   boolean isLivingInLondon,
                   University uni,
                   boolean isExperiencedInCare,
                   boolean hasCompletedDBSCheck) {
        super(name, contact, course, studentId, studentFees, isLivingInLondon, uni);
        this.isExperiencedInCare = isExperiencedInCare;
        this.hasCompletedDBSCheck = hasCompletedDBSCheck;
        this.boughtNursingGraduationTickets = new ArrayList<>();
    }


    //Getters

    public boolean getIsExperiencedInCare() {return isExperiencedInCare;
    }


    public boolean getHasCompletedDBSCheck() {return hasCompletedDBSCheck;

    }

    //Method to go on placement

    public String practicePlacement() {
        return this.name + " is on a practice placement";

    }

    public List<Graduation> getBoughtNursingGraduationTickets() {
        return boughtNursingGraduationTickets;
    }


    //method to check timetable

    public String checkTimetable() {
        Weekday day = Weekday.TUESDAY;

        //two equal SIGNS for comparison, distinguishes from regular =

        if (day == Weekday.MONDAY) {
           return getName() + " it's a Monday, you have Lectures from 9am-3pm";

        } else if (day == Weekday.TUESDAY) {
            return getName() + " it's a Tuesday, you have lectures from 12pm-2pm";

        } else if (day == Weekday.WEDNESDAY) {
            return getName() + " you are off today, kick your feet up and enjoy...";

        } else if (day == Weekday.THURSDAY) {
            return getName() + " it's you have a lab at 3pm";

        } else if (day == Weekday.FRIDAY) {
           return getName() + " you have a meeting with your supervisor at 9am, and lectures from 12pm-6pm";

        } else {
            return getName() + " it's the weekend! Relax...";
        }

    }

    //overriding

    @Override
    //Accessing nursing vle
    public Assignment submissions() {
        Assignment assignment = this.uni.getNursingVLE().pop();
        System.out.println(assignment.getTitle());
        System.out.println(assignment.getTutor());

        assignment.setIsSubmitted(false);
        return assignment;
    }

    @Override
    //doing assignment
    public Assignment submission(Assignment assignment) {
        System.out.println(assignment.getTitle());
        System.out.println(assignment.getTutor());

        assignment.setIsSubmitted(false);
        return assignment;
    }

    //method to add ticket

    public void addTicket(Graduation graduation) {
        boughtNursingGraduationTickets.add(graduation);
    }

    //method to remove ticket

    public void removeTicket(Graduation graduation) {
        boughtNursingGraduationTickets.add(graduation);
    }

    //Interface

    public String graduate(int degreeScore){
        return this.name + "graduated in " + getCourse() + " with a " +
                "degree score of " + degreeScore + "%";
    }

}





