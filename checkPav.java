package distpav;

import activities.*;

import java.util.Scanner;

public class checkPav {
    public  String pav;
    public String dist;
    checkPav(String currentPav, String currentDist) {
        this.pav = currentPav;
        this.dist = currentDist;
    }

    public void allotAct(){
//        activities a0 = new activities();
//        act1 a1 = a0.act1;
        activities.act1 a = new activities.act1();
        activities.act2 b = new activities.act2();
        activities.act3 c = new activities.act3();

//        activities.act1 a = new activities.act1();

        switch (this.dist) {
            case "sustainability":
                switch (this.pav) {
                    case "brazil":
                        c.actmethod3();
                        // call for inner class imported from package (activities)
                        break;
                    case "singapore", "campusgermany":
                        b.actmethod2();
                        break;
                }
                break;
//                System.out.println("Or direct to exit?");

            case "opportunity":
                switch (this.pav) {
                    case "saudiarabia":
                        a.actmethod1();
                        break;
                    case "uk":
                        c.actmethod3();
                        break;
                    case "china":
                        a.actmethod1();
                        break;

//                    default:
//                        throw new IllegalStateException("Unexpected value: " + this.pav);
                }

                break;


            case "mobility":
                switch (this.pav) {
                    case "southkorea", "france":
                        b.actmethod2();


                        break;
                    case "jamaica":
                        c.actmethod3();
                        break;


                }

                break;
            case "alforsan":
                switch (this.pav) {
                    case "india", "japan":
                        a.actmethod1();
                        break;
                    case "uae":
                        b.actmethod2();
                        break;
                }

                break;


            case "jubilee":
                switch (this.pav) {
                    case "argentina", "portugal", "canada":
                        b.actmethod2();
                        break;
                }

                break;
        }
    }

}


