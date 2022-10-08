public class variableinterest{
    public static void main (String[] args){
        //principal - double, numPayments - int, rate - double
        double principal = Double.parseDouble(args[0]);
        int numPayments = Integer.parseInt(args[1]);
        double rate = Double.parseDouble(args[2]);
        double borrowed = principal;

        for (int i = 1; i <= numPayments; i++){
            Double payment = (borrowed/numPayments) + (principal)*(rate/100)/12;
            System.out.println("payment " + i + " is " + payment);
            principal = principal - principal/numPayments;

        }
        System.out.println("Remaining Balance " + Math.round(principal));
    }
}