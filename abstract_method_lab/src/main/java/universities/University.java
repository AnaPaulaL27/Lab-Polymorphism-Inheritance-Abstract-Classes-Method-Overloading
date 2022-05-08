package universities;

import assignments.GeographyAssignment;
import assignments.NursingAssignment;
import student.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class University {

    //declaring the existence of a list

    List<Student> students;

    //now initialising

    protected LinkedList<GeographyAssignment> geographyVLE = new LinkedList<>();
    protected LinkedList<NursingAssignment> NursingVLE = new LinkedList<>();

    //constructor

    public University() {
        students = new ArrayList<>();
    }

    // Method to add students to the university

    public void addStudent(Student student) {
        this.students.add(student);


    }
    //Getters & Setters

    public List<Student> getStudents() {
        return this.students;
    }


    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public LinkedList<GeographyAssignment> getGeographyVLE() {
        return geographyVLE;
    }

    public void setGeographyVLE(LinkedList<GeographyAssignment> geographyVLE) {
        this.geographyVLE = geographyVLE;
    }

    public LinkedList<NursingAssignment> getNursingVLE() {
        return NursingVLE;
    }

    public void setNursingVLE(LinkedList<NursingAssignment> nursingVLE) {
        NursingVLE = nursingVLE;
    }

}





