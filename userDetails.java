import java.util.*;
public class userDetails {
    public int ppl;
    public int age;
    public String name;
    userDetails(int ppl) {
        this.ppl = ppl;
    }

    public static void enterDetails(int ppl){
        String[] Name = new String[ppl+1];
        int[] Age = new int[ppl+1];
        Scanner s = new Scanner(System.in);

        for(int i=1;i<=ppl;i++) {
            System.out.println("enter name"+i);
            Name[i]=s.nextLine();
            System.out.println(Name[i]);
            System.out.println("enter age");
            Age[i]=s.nextInt();
            String garbageScan1 = s.nextLine();

            System.out.println(Age[i]);
        }
    }
}
