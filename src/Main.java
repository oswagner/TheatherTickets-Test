import helper.DaysOfWeek;
import model.Children;
import model.Elderly;
import model.Student;

public class Main {

    public static void main(String[] args) {


        // TODO: 8/10/16 Need to implement unit tests

        // student without pass
        Student student = new Student(false);

        // student with pass
        Student studentWithPass = new Student(true);

        Children children = new Children();

        Elderly elderly = new Elderly();


        // TODO: 8/10/16 Improve output
        student.pay(DaysOfWeek.MONDAY);

        studentWithPass.pay(DaysOfWeek.WEDNESDAY);

        children.pay(DaysOfWeek.SATURDAY);

        elderly.pay(DaysOfWeek.HOLIDAY);


    }
}
