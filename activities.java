package activities;


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
        class SingleInheritance {
            public void main(String args[]) {
                B obj = new B(); //derived class object
                obj.a = 411;
                obj.b = 15;
                obj.c = 44;
                obj.selectVehicle();
                obj.show();
            }
        }
    }
}

