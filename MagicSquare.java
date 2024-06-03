import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'formingMagicSquare' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY s as parameter.
     */

    static int overallCost = Integer.MAX_VALUE;
    public static int formingMagicSquare(int s[][]) {
    // Write your code here
        // int ans;
        
        int given[] = new int[9];
        int k=0;
        for(int i=0;i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                given[k++] = s[i][j];
            }
        }
        int a[] = new int[9];
        boolean d[] = new boolean[10];
        for(int i=0;i<10;i++)
        {
            d[i] = true;
        }
        return magic(given, a, d, 0);    
    }
    
    public static int magic(int given[], int a[], boolean d[], int idx)
    {
        if(idx == a.length)
        {
            if(isMagic(a))
            {
                int cost = compare(a, given);
                overallCost = Math.min(overallCost, cost);
                return overallCost;
            }
        }
        int arr = 0;
        for(int i = 1; i<10;i++)
        {
            if(d[i] == true)
            {
                a[idx] = i;
                d[i] = false;
                arr = magic(given, a, d, idx+1);
                d[i] = true;
            }
        }
        return arr;
    }
    
    static boolean isMagic(int a[])
    {
        int tmp[] = new int[8];
        tmp[0] = a[0]+a[1]+a[2];
        tmp[1] = a[3]+a[4]+a[5];
        tmp[2] = a[6]+a[7]+a[8];
        tmp[3] = a[0]+a[3]+a[6];
        tmp[4] = a[1]+a[4]+a[7];
        tmp[5] = a[2]+a[5]+a[8];
        tmp[6] = a[0]+a[4]+a[8];
        tmp[7] = a[2]+a[4]+a[6];  
        
        int ans = 0;
        for(int i=0;i<8;i++)
        {
            ans^=tmp[i];
        }
        
        return ans==0;
    }
    
    static int compare(int a[], int b[])
    {
        int cost=0;
        for(int i=0;i<b.length;i++)
        {
            cost+= Math.abs(b[i]-a[i]);
        }
        return cost;
    }

}

public class MagicSquare {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int si[][] = new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                si[i][j] = s.nextInt();
            }
        }
        

        int result = Result.formingMagicSquare(si);

        System.out.println(result);
    }
}

