import java.util.*;
//class userDetails {
//    public String name;
//    public int age;
//    userDetails(String name, int age) {
//        this.name=name;
//        this.age=age;
//    }
//    public void setUser(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//    public String toString() {
//        return (name +" "+ age);
//    }
//}

interface userDetails {
//    String name;
//    int age;
    String getName();
    int getAge();
//    void setUser();
//    String toString();
}

class u1 implements userDetails{
    public u1(String name, int age) {
        this.name = name;
        this.age = age;
        details = new Linkedlist[];
        for(int i =0;i<10;i++){
            details[i]=new LinkedList<integer>();
        }
    }
    String name;
    int age;
    public void setDetails(Sting name, int age){
        details.add(name);
        int count=1;
        for(int i = 0; i<count;i++){
            details[i].addLast(age);
        }
        count ++;
    }
    Scanner s = new Scanner(System.in);
    public String getName() {
        System.out.println("enter name: ");
        name=s.nextLine();
        return name;
    }
    public int getAge() {
        System.out.println("enter age: ");
        age=s.nextInt();
        return age;
    }
    Linkedlist<String> details[];
}


public class asgn {
    public static void main(String[] args) {
        System.out.println("welcome to expo2020 portal");
        System.out.println("how many people are ");
        boolean isFull = false;
        int capacity = 10;
        u1 u = new u1(null, 0);
        for(int i=0;i<capacity;i++) {

        }

    }
}
