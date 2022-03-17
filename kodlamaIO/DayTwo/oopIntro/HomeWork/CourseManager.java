package kodlamaIO.DayTwo.oopIntro.HomeWork;

public class CourseManager {
    public void lectureVid(Course course){
        System.out.println(course.nameOfCourse + " is watched!");
    }
    public void homeWork(Course course){
        System.out.println(course.percentageOfProgress+" increased!");
    }
}
