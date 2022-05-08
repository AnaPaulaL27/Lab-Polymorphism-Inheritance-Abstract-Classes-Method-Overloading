package student;

import assignments.Assignment;
import universities.University;

import java.util.ArrayList;

public abstract class Student {
    public String name;
    public String contact;
    public String course;
    public int studentId;
    public int studentFees;
    protected boolean isLivingInLondon;
    protected University uni;


    //constructor-  method to create new object

    public Student(String name, String contact, String course, int studentId,
                   int studentFees, boolean isLivingInLondon, University uni) {

        this.name = name;
        this.contact = contact;
        this.course = course;
        this.studentId = studentId;
        this.studentFees = studentFees;
        this.isLivingInLondon = isLivingInLondon;
        this.uni = uni;
    }

    //Getters and Setters

    public String getName() {return name;
    }


    public int getStudentId() {return studentId;
    }

    public int getStudentFees() {return studentFees;
    }


    public boolean getIsLivingInLondon() {return isLivingInLondon;
    }

    public void setUni(University uni) {this.uni = uni;

    }

    public String getCourse() {return course;
    }

    public void setCourse(String course) {this.course = course;
    }

    public University getUni() {return uni;
    }

    public String getContact() {
        return contact;
    }


    //other methods
    public String study() {
        return this.name + " is studying";
    }

    public String joinSocieties() {
        return this.name + " is joining a society";
    }


    //A method to add assignments onto the virtual learning environment

    public void addAssignment(Assignment assignment) {
        //adds it to the VLE
    }


   //let create a method that allows us to take the
    //assignments from the  VLE
        //but let make it abstract i.e., it contains definition
        // but no implementation- it defines a contract that derived classes must implement

        public abstract Assignment submissions();

        public abstract Assignment submission(Assignment assignment);

    }


