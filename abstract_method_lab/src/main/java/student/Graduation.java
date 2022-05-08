package student;

import java.util.ArrayList;
import java.util.List;

public class Graduation {

    //Properties
    private String Location;
    private String university;
    private String Course;
    private ArrayList<Nursing > nursingGraduationStudents;


    //Constructor

    public Graduation(String location, String university, String course) {
        Location = location;
        this.university = university;
        Course = course;
        this.nursingGraduationStudents = new ArrayList<>();
    }

    //Getters

    public String getLocation() {
        return Location;
    }

    public String getUniversity() {
        return university;
    }

    public String getCourse() {
        return Course;
    }

    public ArrayList<Nursing> getNursingGraduationStudents() {
        return nursingGraduationStudents;
    }

    //Method to add nursing students to graduation ceremony

    public void addSNursingStudent(Nursing nursingStudent) {
        this.nursingGraduationStudents.add(nursingStudent);
    }


    //Method to remove nursing students from graduation ceremony

    public void removeNursingStudent(Nursing nursingStudent) {

        this.nursingGraduationStudents.remove(nursingStudent);
    }

    //Method to remove geography students from graduation ceremony

    public void removeGeographyStudent(Geography geographyStudent) {
        this.nursingGraduationStudents.remove(geographyStudent);

    }

}


