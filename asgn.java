import java.util.*;
import java.lang.*;
import distpav.*;

//

import static java.lang.System.exit;

public class asgn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("welcome to expos0s0");

        System.out.println("Pls enter number of ppl to enter");
        int n = s.nextInt();

        userDetails userdetails = new userDetails();
        userDetails.enterDetails();

        System.out.println("which district would you like to enter first? ");
        //use iterator to display districts stored in linkedlists, which is to be initiated in another class
//        district d= new district(); // object created for district class
//        d.dists();


        distpav dp = new distpav();

        // for getting districts
        dp.districts(); //change to askdist

        // ********* selects district **********
//        String garbageScan1 = s.nextLine();
//        String selectDist = s.nextLine();

        // remove lowercases and spaces from the String input
//        String currentDist = selectDist.toLowerCase().replaceAll("\\s+", "");
//        if (currentDist.equals("exit")) {
//            System.exit(0); //exits code successfully
//        }

        // ********* allots parking ***********
//        parking parkng = new parking(currentDist);
//        String currentParking = parkng.allotPark();
//        System.out.println("your parking is " + currentParking);

        // shows chosen districts
//        System.out.println("your chosen district is " + currentDist);

        System.out.println("choose pavilion to enter\n");
        dp.pavilions(currentDist);
        String selectPav = s.nextLine();
        System.out.println(selectPav);
        String currentPav = selectPav.toLowerCase().replaceAll("\\s+", "");


    }

    public static void exit(int status){}

}
