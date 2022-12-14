package activities;
import java.util.Arrays;



import java.util.*;
public class activities {
    {
        class A {
            int a, b;

            void selectVehicle() {
                System.out.println("Welcome");
                System.out.println("Lets see how environmentally friendly your vehicle is\n");
                System.out.println("which vehicle type do you have? ");
                System.out.println("\t\t1 - gasoline\n\t\t2 - electric");
                Scanner s = new Scanner(System.in);
                int num = s.nextInt();
                switch(num){
                    case 1: display1();
                    break;
                    case 2: display2();
                }
            }
            void display1() {
                System.out.println("Your vehicle produces " + a+" grams of CO2 per mile" );
            }
            void display2() {
                System.out.println("Your vehicle already produced " + b+" tonnes of CO2 for manufacturing batteries" );
            }
        }
        class B extends A {
            int c;

            void show() {
                System.out.println("********************************************************************************************************");
                System.out.println("\nDid you know?" + a + " " + b + " " + c);
                System.out.println("\nCompared to gasoline run and electric run vehicles");
                System.out.println("which produce "+a+" grams of CO2 per mile and");
                System.out.println(b+" grams of CO2 per mile");
                System.out.println("Hybrid vehicles produce only "+c+" grams of CO2 per mile");
                System.out.println("Making hybrid vehicles the best choice to go sustainable in this country with high vehicle population!!");
            }
        }
        class act1 {
            public void main(String[] args) {
                B obj = new B(); //derived class object
                obj.a = 411;
                obj.b = 15;
                obj.c = 44;
                obj.selectVehicle();
                obj.show();
            }
        }
    }// end of act 1


    {// for opportunity pavilions
        //interface done
        interface Printable{
            void print();
        }
        interface Showable{
            void show();
        }
        class act2 implements Printable,Showable{
            public void print(){System.out.println("Hello there! you are in the opportunity zone...");}
            public void show(){System.out.println("Where you will see countries that aim at\n\tfuture focus\n\tinclusive growth\n\tand youth power\nHave a nice day!");}

            public void main(String[] args){
                act2 obj = new act2();
                obj.print();
                obj.show();
            }
        }
    }// end of act 2


    {
        class NegNumExc extends Exception
        {
            public NegNumExc ()
            {
                super ("This program does not support negative numbers.");
            }
        }

        class Prime
        {
            public static void main (String[]args)
            {
                Scanner sc = new Scanner (System.in);

                int start = sc.nextInt ();
                int end = sc.nextInt ();
                try
                {
                    if (start < 0 || end <= start)
                    {
                        throw new NegNumExc ();
                    }
                    else
                    {
                        for (int i = start; i <= end; i++)
                        {
                            if (isPrime (i))
                            {
                                System.out.println (i);
                            }
                        }
                    }
                }
                finally
                {
                    System.out.println ("Invalid Inputs.");
                    return;
                }


            }

            static boolean isPrime (int x)
            {
                for (int i = 2; i < (x / 2); i++)
                {
                    if (x % i == 0)
                    {
                        return false;
                    }
                }
                return true;
            }
        }


        class InvStudentExc extends Exception
        {
            public InvStudentExc ()
            {
                super ("Invalid Student.");
            }
        }

        class Student
        {
            public String name, id;
            public int age, year;

            Student (String n, int a, int y, String i)
            {
                this.name = n;
                this.id = i;

                this.age = a;
                this.year = y;
            }
        }


         class act3{
            public static void main (String[]args)
            {
                Scanner sc = new Scanner (System.in);

                String name, id;
                int age, year;
                System.out.println("this pavilion has entry only to registered students");
                System.out.println("\t!!!registrations are closed!!!\n");
                System.out.println("To find out if you are allowed...");
                System.out.println("enter name: ");
                name = sc.nextLine ();
                System.out.println("enter id: ");
                id = sc.nextLine ();
                System.out.println("enter age: ");
                age = sc.nextInt ();
                System.out.println("enter year of study in university: {1,2,3,4}");
                year = sc.nextInt ();

                Student s = new Student (name, age, year, id);
                try
                {
                    if (isValidName (s.name) && isValidAge (s.age) && isValidYear (s.year)
                            && isValidId (s.id))
                    {
                        System.out.println ("Valid Student.");
                        System.out.println("But sorry to disappoint you");
                        System.out.println("this pavilion is temporarily closed for renovation");
                        System.out.println("but don't worry \nyour OPPORTUNITY awaits you on Oct 1, 2022");
                        System.out.println("\nSee you at Expo city");
                    }
                    else
                    {
                        throw new InvStudentExc ();
                    }
                }
                finally
                {
                    System.out.println ("Invalid Student.");
                    return;
                }
            }
            static boolean isValidName (String name)
            {
                int i;
                for (char c:name.toCharArray ())
                {
                    i = ((int) c);
                    if ((i >= 65 && i <= 90) || (i >= 97 && i <= 122))
                    {
                        continue;
                    }
                    return false;
                }
                return true;
            }
            static boolean isValidAge (int age)
            {
                if (age >= 35 || age <= 0)
                {
                    return false;
                }
                return true;
            }
            static boolean isValidYear (int year)
            {
                int digit;
                while (year != 0)
                {
                    digit = year % 10;
                    year /= 10;
                    if (digit < 1 || digit > 4)
                    {
                        return false;
                    }
                }
                return true;
            }
            static boolean isValidId (String id)
            {
                if (id.length () != 6)
                {
                    return false;
                }
                int char_no;
                char[] arr = id.toCharArray ();
                for (int i = 0; i < id.length (); i++)
                {
                    char_no = ((int) arr[i]);
                    if (i == 0)
                    {
                        if (arr[i] != 'f')
                        {
                            return false;
                        }
                    }
                    else if (i >= 1 && i <= 4)
                    {
                        if (i < 48 || i > 57)
                        {
                            return false;
                        }
                    }
                    else
                    {
                        if (arr[i] != 'U')
                        {
                            return false;
                        }
                    }
                }
                return true;
            }
        }


    }
}

