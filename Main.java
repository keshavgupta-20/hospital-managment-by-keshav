// This project is not complete.

package hospitalmanagmentSystem;
import java.util.*;
interface staffInterface{
    void new_staff();
    void staff_info();
}
public class Main {
    public static  void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" enter \n 1 for user \n 2 for patient");
        int new_login = scan.nextInt();
        if(new_login == 1){
            password p3 = new password();
            p3.new_pass();
            System.out.println("\n main menu");
            System.out.println("1. Doctor \n2. lab \n3. medical \n4. staff");
            int choice = scan.nextInt();
            switch(choice){
                case 1:{
                    System.out.println("Press 1 for new entry \n press 2 for existing list");
                    int c1 = scan.nextInt();
                    if(c1==1){
                        Doctor D1 = new Doctor();
                        D1.new_Doctor();
                    }
                    else{
                        DoctorInfo D2 = new DoctorInfo();
                        D2.DoctorInfo();
                        D2.printRandomDoctorInfo();
                    }
                }
                case 2 :{
                    System.out.println("Press 1 for new entry \n press 2 for existing list");
                    int c1 = scan.nextInt();
                    lab L1 =new lab();
                    if(c1 ==1){
                        L1.new_feci();
                    }
                    else{
                        L1.feci_list();
                    }

                }
                case 3:{
                    System.out.println("press 1 for new entry \n press 2 for exisitng list");
                    int c1 = scan.nextInt();
                    medical m1 = new medical();
                    if(c1 == 1){
                        m1.new_medi();
                    }
                    else{
                        m1.show_medi();
                    }
                }
                case 4:{
                    System.out.println("press 1 for new entry \n press 2 for exisitng list");
                    int c1= scan.nextInt();
                    staff s1 = new staff();
                    if(c1==1){
                        s1.new_Staff();
                    }
                    else{
                        newstaff n1 =new newstaff();
                        n1.staff_info();
                    }
                }
            }


        }
        else if(new_login==2){
            System.out.println("\n main menu");
            System.out.println("1. Doctor \n2. lab \n3. medical");
            int choice = scan.nextInt();
            switch(choice){
                case 1:{
                    DoctorInfo D2 = new DoctorInfo();
                    D2.DoctorInfo();
                    D2.printRandomDoctorInfo();
                    break;
                }
                case 2:{
                    lab l1 = new lab();
                    l1.feci_list();
                    break;
                }
                case 3:{
                    medical m1  =new medical();
                    m1.show_medi();
                    break;
                }

            }

        }
    }
}
