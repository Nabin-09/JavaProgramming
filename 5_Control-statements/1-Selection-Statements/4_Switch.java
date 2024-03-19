//This program shows the basics of Switch cases in Java programming
class Switch {
    public static void main(String a[]){
        int month = 4;
        String season;
        switch(month){
            case 12:
            case 1:
            case 2:
            season = "Winter";
            break;
            case 3:
            case 4:
            case 5:
            season = "Spring";
            break;
            case 6:
            case 7:
            case 8:
            season = "Summer";
            break;
            default:
            season = "Bogus month";
        }
        System.out.println("April is the "+ season + " of the year. ");
    }
}
