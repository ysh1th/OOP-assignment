
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("welcome to expo2020");
        // enter user details
        System.out.println("Pls enter number of ppl to enter");
        int n, age;
        String name;
        n = s.nextInt();
        String[] Name = new String[n+1];
        int[] Age = new int[n+1];
        int i;
        for(i=1;i<=n;i++) {
            System.out.println("enter name"+i);
            String garbageScan1 = s.nextLine();
            Name[i]=s.nextLine();
            System.out.println(Name[i]);
            System.out.println("enter age");
            Age[i]=s.nextInt();
            System.out.println(Age[i]);
        }

        //date and time selection
        System.out.println("enter month of entry");
        int month = s.nextInt();
        System.out.println("enter date of entry");
        int date = s.nextInt();
        System.out.println("enter hours of entry (10-22)");
        int hour = s.nextInt();
        // System.out.println("the population @expo2020: "+population.getPopulation(month, date, hour));

        System.out.println("which district would you like to enter first? ");
        //use iterator to display districts stored in linkedlists, which is to be initiated in another class
        district d= new district(); // object created for district class
        d.dists();
        String garbageScan1 = s.nextLine();
        String selectDist = s.nextLine();
        String currentDist = selectDist.toLowerCase();
        System.out.println(currentDist);

        //call for method in a class to check if currentDist == district
        // and call for function in that function to display the pavilions




        // if district sustainability: parking A-c
        // if district mobility/jubilee: parking D-F
        //if district opportunity/ al  forsan: parking g-i
        // if district sustainability: parking A-c


    }
}
