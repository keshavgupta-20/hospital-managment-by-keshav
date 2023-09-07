package hospitalmanagmentSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class password {
    void new_pass() {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader P1 = new BufferedReader(is);
        String P2;
        try{
            int T = 3;
            while(T-->0)
            {
                System.out.print("Enter Password :: ");
                P2 = P1.readLine();
                if (!P2.equalsIgnoreCase("KeshavWorld")) {
                    System.out.println("Incorrect password");
                    System.out.println("Only " + T + " Attempt Remaining");
                }
                else
                {
                    break;

                }

            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}


