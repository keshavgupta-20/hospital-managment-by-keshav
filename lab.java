package hospitalmanagmentSystem;

import java.util.Scanner;

public class lab
{
    String fecility;
    int lab_cost;
    public void new_feci()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("fecility:-");
        fecility = input.nextLine();
        System.out.print("cost:-");
        lab_cost = input.nextInt();
    }
    public void feci_list()
    {
        System.out.println(fecility + "\t\t" + lab_cost);
    }
}