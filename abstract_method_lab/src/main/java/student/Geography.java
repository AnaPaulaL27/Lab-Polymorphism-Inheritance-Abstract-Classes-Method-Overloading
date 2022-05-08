package student;


import Timetable.Weekday;
import assignments.Assignment;
import universities.University;

import java.util.ArrayList;

public class Geography extends Student {

    //properties
    private boolean hasTakenGeographyAlevel;

    // all other properties are inherited from student


    //constructor - method to create new object


    public Geography(String name,
                     String contact,
                     String course,
                     int studentId,
                     int studentFees,
                     boolean isLivingInLondon,
                     University uni,
                     boolean hasTakenGeographyAlevel) {
        super(name, contact, course, studentId, studentFees, isLivingInLondon, uni);
        this.hasTakenGeographyAlevel = hasTakenGeographyAlevel;
    }





    //getters

    public boolean hasTakenGeographyAlevel() {
        return hasTakenGeographyAlevel;
    }


    //other methods

   public String fieldTrip() {
       return this.getName() + " is on a field trip" ;
   }

    //method to check timetable

    public String checkTimetable() {
        Weekday day = Weekday.TUESDAY;

        //two equal SIGNS for comparison, distinguishes from regular =

        if (day == Weekday.MONDAY) {
            return getName() + " it's a Monday, you have Lectures from 12pm-2pm";

        } else if (day == Weekday.TUESDAY) {
            return getName() + " it's a Tuesday, you have lectures from 12pm-2pm";

        } else if (day == Weekday.WEDNESDAY) {
            return getName() + " you are off today, kick your feet up and enjoy...";

        } else if (day == Weekday.THURSDAY) {
            return getName() + " you have a field trip today at 10am";

        } else if (day == Weekday.FRIDAY) {
            return getName() + " you have a meeting with your supervisor at 11am, and lectures from 12pm-6pm";

        } else {
            return getName() + " it's the weekend! Relax...";
        }

    }


        @Override
    //Accessing nursing vle
    public Assignment submissions() {
        Assignment assignment = this.uni.getGeographyVLE().pop();
        System.out.println(assignment.getTitle());
        System.out.println(assignment.getTutor());

        assignment.setIsSubmitted(true);
        return assignment;
    }

    @Override
    //doing assignment
    public Assignment submission(Assignment assignment) {
        System.out.println(assignment.getTitle());
        System.out.println(assignment.getTutor());

        assignment.setIsSubmitted(true);
        return assignment;


    }

    //Interface

    public String graduate(int degreeScore){
        return this.name + "graduated in " + getCourse() + " with a " +
                "degree score of " + degreeScore + "%";
    }


    //
}
