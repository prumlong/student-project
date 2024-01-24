public class Student {
    public String name, course, address;
    public int numCourse, grade;
  
    public Student(String name, String address,int numCourse) {
      this.name = name;
      this.address = address;
      this.numCourse = numCourse;
    }
    //create method
      public void addCourseGrade(String course, int grade) {
        this.course = course;
        this.grade = grade;
        System.out.println("Course: " + course);
        System.out.println("Grade: " + grade);
      }
    //display method
    public void printGrade(){
      System.out.println("Name: " + name);
      System.out.println("Address: " + address);
      System.out.println("Number of course(s): " + numCourse);
    }
}
  