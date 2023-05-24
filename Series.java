import java.util.*;
import java.io.*;

class Series{
  
    public static void main(String []argh){
        int q;
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
                printSeries(a, b, n);
        }

        in.close();
    }

    private static void printSeries(int a, int b, int n) {
        int result = a;
        for (int i = 0; i < n; i++) {
            result += (int) (Math.pow(2, i) * b);
            System.out.print(result + " ");
        }
        System.out.println();
    }
}
