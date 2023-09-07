package hospitalmanagmentSystem;
import java.util.Scanner;

class staff {
    void new_Staff(){
        String name, designation, id;
        int salary;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name :-");
        name = scan.nextLine();
        System.out.print("Enter his id:- ");
        id  = scan.next();
        System.out.print("enter his Designation:- " );
        designation = scan.next();
        System.out.print("enter his salary :- ");
        salary = scan.nextInt();
        System.out.println("The details are saved in the pc");
    }
}
class newstaff extends staff implements staffInterface
{

    @Override
    public void new_staff() {

    }

    @Override
    public void staff_info() {
        staff s1 = new staff();
        s1.new_Staff();
        System.out.println();

    }
}
