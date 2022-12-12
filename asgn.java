import java.util.*;
import java.lang.*;
import distpav.*;

//

import static java.lang.System.exit;

public class asgn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("welcome to expo2020");

        userDetails userdetails = new userDetails();
        userDetails.enterDetails(); //this will ask for no. of ppl entering and rest all

//        System.out.println("which district would you like to enter first? ");
        //use iterator to display districts stored in linkedlists, which is to be initiated in another class
//        district d= new district(); // object created for district class
//        d.dists();


        distpav dp = new distpav();

        // for getting districts
        dp.askdist(); //change to askdist

        System.out.println("choose pavilion to enter\n");



    }

    public static void exit(int status){}

}
