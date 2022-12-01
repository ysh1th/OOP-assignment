import java.util.*;

public class asgn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("welcome to expo2020");
        System.out.println("Pls enter number of ppl to enter");
        int n, age;
        String name;
        n = s.nextInt();
        String[] Name = new String[n+1];
        int[] Age = new int[n+1];
        int i;
        for(i=1;i<=n;i++) {
            System.out.println("enter name"+i);
            String def = s.nextLine();
            Name[i]=s.nextLine();
            System.out.println(Name[i]);
            System.out.println("enter age");
            Age[i]=s.nextInt();
            System.out.println(Age[i]);
        }

        System.out.println("enter month of entry");
        int month = s.nextInt();
        System.out.println("enter date of entry");
        int date = s.nextInt();
        System.out.println("enter hours of entry (10-22)");
        int hour = s.nextInt();
        // System.out.println("the population @expo2020: "+population.getPopulation(month, date, hour));

        System.out.println("which district? ");
        //use iterator to display districts stored in linkedlists

        // if district sustainability: parking A-c
        // if district mobility/jubilee: parking D-F
        //if district opportunity/ al  forsan: parking g-i
        // if district sustainability: parking A-c


    }
}
