public class App {
    public static void main(String[] args) throws Exception {

        Student obj = new Student("pulong","Phnom Penh",6);
       
        try{
            obj.addCourseGrade("Java", 100);
            obj.addCourseGrade("C#", 100);
            obj.addCourseGrade("Network", 100);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("error: " + e );
        }
        System.out.println("\n-----------------------------");
        obj.printGrade();
        System.out.println("\n-----------------------------");
    }
}
