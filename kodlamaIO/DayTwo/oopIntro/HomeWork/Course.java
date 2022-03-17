package kodlamaIO.DayTwo.oopIntro.HomeWork;

public class Course {
    String nameOfCourse;
    int percentageOfProgress;
    String courseImageLink;
    String nameOfInstructor;
    String tutorImageLink;
    public Course(){
        System.out.println("Course is created");
    }
    public Course(String nameOfCourse,int percentageOfProgress,String courseImageLink,String nameOfInstructor,String instructorImageLink){
        this();
        this.nameOfCourse = nameOfCourse;
        this.percentageOfProgress = percentageOfProgress;
        this.courseImageLink = courseImageLink;
        this.nameOfInstructor = nameOfInstructor;
        this.tutorImageLink = instructorImageLink;
        
    }

}
