public class array2{
    public static void main (String[] args){
        //Gamblers - get a number between [0, 1) and use the following 
        //bet, goal, 10% - $3, 50% - -$5, 40% - $0, 40% - $0.50
        double bet = Double.parseDouble(args[0]);
        double goal = Double.parseDouble(args[1]);
        int maxtrials = Integer.parseInt(args[2]);
        double[] saved = new double[maxtrials];
        int trials = 0;
        int i = 0;
        while (bet < goal && trials <= maxtrials && bet > 0){
            Double randomNum = Math.random(); //[0, 1)
            if (randomNum < 0.1){
                bet += 3;
            }
            else if (randomNum < 0.6){
                bet -= 5;
            }
            else {
                bet += 0.5;
            }
            trials++;
            saved[i] = bet;
            i++;
            // System.out.println("Your bet is now: " + bet);


        }
        for (int j = 0; j < saved.length; j++){
            System.out.print (saved[j] + " ");
        }
        System.out.println();
    }
}