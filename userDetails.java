import java.util.*;
public class userDetails {
    public int ppl;
    public int age;
    public String name;
//    userDetails(int ppl) {
//        this.ppl = ppl;
//    }
    public userDetails() {

    }
    public static void enterDetails(){
        Scanner s = new Scanner(System.in);

        System.out.println("enter no. of ppl entering: ");
        int ppl = s.nextInt();
        String[] Name = new String[ppl+1];
        int[] Age = new int[ppl+1];

        for(int i=1;i<=ppl;i++) {
            System.out.println("enter name"+i);
            Name[i]=s.nextLine();
            System.out.println(Name[i]);
            System.out.println("enter age");
            Age[i]=s.nextInt();
            String garbageScan1 = s.nextLine();
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
        System.out.println("entering on " + date +"/"+ month + " at " + hour);
    }
}
