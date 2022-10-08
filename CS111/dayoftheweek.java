public class dayoftheweek {
    //Signature
    public static void main (String[] args){
        //get inputs
        /*int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);

        int y0 = year - (14-month/12);
        int x = y0 + y0/4- y0/100 +y0/400;
        int m0 = month + 12 * ((14-month)/12)-2;
        int d0 = (day + x + 31*m0/12) % 7;

        if (d0 == 0) System.out.println("You were born on a Sunday");
        if (d0 == 1) System.out.println("You were born on a Monday");
        if (d0 == 2) System.out.println("You were born on a Tuesday");
        if (d0 == 3) System.out.println("You were born on a Wednesday");
        if (d0 == 4) System.out.println("You were born on a Thursday");
        if (d0 == 5) System.out.println("You were born on a Friday");
        if (d0 == 6) System.out.println("You were born on a Saturday");*/

        int n = Integer.parseInt(args[0]);
        for (int i = 1; i < n; i++){
            System.out.println(i + " " + "|");
            System.out.println();
        }

    }
}