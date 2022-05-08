package assignments;

public abstract class Assignment {

    //defining assignment -needs title, description,

    protected String title;
    protected String tutor;
    protected boolean isSubmitted;


    // in constructor

    Assignment(String title, String tutor) {
        this.title = title;

        this.tutor= tutor;

        this.isSubmitted = false;
    }


    //getters + setters

    public String getTitle() {return title;
    }

    public String getTutor() {return tutor;
    }

    public boolean getIsSubmitted() {return isSubmitted;
    }

    public void setIsSubmitted(boolean submitted) {isSubmitted = submitted;
    }
}
