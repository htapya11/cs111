/******************************************************************************
 *  Compilation:  javac IntOps.java
 *  Execution:    java IntOps a b
 *
 *  Illustrates the integer operations a + b, a * b, a / b, and a % b.
 *
 *  % java IntOps 1234 99
 *  1234 + 99 = 1333
 *  1234 * 99 = 122166
 *  1234 / 99 = 12
 *  1234 % 99 = 46
 *  1234 = 12 * 99 + 46
 *
 *  % java IntOps 10 -3
 *  10 + -3 = 7
 *  10 * -3 = -30
 *  10 / -3 = -3
 *  10 % -3 = 1
 *  10 = -3 * -3 + 1
 *
 ******************************************************************************/

 public class IntOps {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int operation1 = a + b;
        int operation2 = a * b;
        int operation3 = a / b;
        int operation4 = a % b;
        int operation5 = operation3 * b + operation4;


        System.out.println(operation1);
        System.out.println(operation2);
        System.out.println(operation3);
        System.out.println(operation4);
        System.out.println(operation5);


    }
 }