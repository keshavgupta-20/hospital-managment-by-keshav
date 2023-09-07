package hospitalmanagmentSystem;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import javax.swing.plaf.synth.SynthSplitPaneUI;
class Doctor{
    void new_Doctor(){
        Scanner scan = new Scanner(System.in);
        String dname, Specalist, qualification;
        int Roomno;
        float worktime;
        System.out.print("Enter name of Doctor:- ");
        dname = scan.next();
        System.out.print("Enter his specalisation :- ");
        Specalist = scan.nextLine();
        System.out.print("Enter his qualififcation:- ");
        qualification = scan.next();
        System.out.print("Enter his Room No:- ");
        Roomno = scan.nextInt();
        System.out.print("Enter his WorkTime:-");
        worktime = scan.nextFloat();
        System.out.println("OK thank You");
    }

}
class DoctorInfo
{
    Scanner scan = new Scanner(System.in);

    private String[] doctorNames = {"Rajesh Agarwal", "Raman Shukla", "Keshav Gupta", "Raghav Chaddha", "Divyansh Joshi", "Aditya Patel", "Anshika Gupta"};
    private String[] specializations = {"Dermatologists", "Physician", "Cardiologists", "Neurologists", "Plastic Surgeons"};
    private int[] experience = new int[8];

        // Constructor to initialize doctor experience randomly
        void DoctorInfo() {
            Random random = new Random();
            for (int i = 0; i < experience.length; i++) {
                experience[i] = random.nextInt(30);
            }
        }

        void printRandomDoctorInfo() {
            Random random = new Random();
            for (int i = 0; i < 8; i++) {
                int doctorIndex = random.nextInt(doctorNames.length);
                String doctorName = doctorNames[doctorIndex];
                String specialization = specializations[random.nextInt(specializations.length)];
                int exp = experience[doctorIndex];

                System.out.println((i + 1) + ". Doctor name: " + doctorName);
                System.out.println("   Specialization: " + specialization);
                System.out.println("   Experience: " + exp + " years");

            }
            java.util.Date dt=new java.util.Date();
            long timeInMs=dt.getTime();
            java.sql.Date dt1=new java.sql.Date(timeInMs);
            System.out.println("Select the number which you want to make appointment");
            int DA1 = scan.nextInt();
            System.out.println("Your appointment is at " + dt1 + " on " + dt);
        }
    }





