package distpav;

import activities.*;

public class checkPav {
    public  String pav;
    public String dist;
    checkPav(String currentPav, String currentDist) {
        this.pav = currentPav;
        this.dist = currentDist;
    }

    public void allotAct(){
        switch (this.dist) {
            case "sustainability":
                switch (this.pav) {
                    case "brazil":

                        // call for inner class imported from package (activities)
                        break;
                    case "Singapore":

                        break;
                    case "Campus Germany":

                        break;
                }
                break;
//                System.out.println("Or direct to exit?");

            case "opportunity":
                switch (this.pav) {
                    case "Saudi Arabia":

                        break;
                    case "UK":

                        break;
                    case "China":
                        activities.act1 act1 = new activities.act1();
                        break;

                }

                break;


            case "mobility":
                switch (this.pav) {
                    case "South Korea":

                        break;
                    case "Jamaica":

                        break;
                    case "France":

                        break;
                }

                break;



            case "alforsan":
                switch (this.pav) {
                    case "India":

                        break;
                    case "UAE":

                        break;
                    case "Japan":

                        break;
                }

                break;


            case "jubilee":
                switch (this.pav) {
                    case "Argentina":

                        break;
                    case "Portugal":

                        break;
                    case "Canada":

                        break;
                }

                break;
        }
    }

}
