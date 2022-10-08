public class array{
    public static void main (String[] args){
        int n = Integer.parseInt(args[0]);
        int[] a; //declare array
        a = new int [n]; //initialize the memory
        //initialize array elements
        for (int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random()*n);
        }
        //print array elements
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println(); 

        //find the max
        int max = a[0];
        for (int i = 1; i < a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        System.out.println(max);
    }
}