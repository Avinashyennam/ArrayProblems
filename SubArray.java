import java.util.Scanner;
public class SubArray {
    public static void main(String args[])
    {
        // Scanner s = new Scanner(System.in);
        int a[] = {3, 2, 0, 1};
        int ans = 0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                int tmp = 0;
                for(int k=i; k<=j; k++)
                {
                    System.out.print(a[k]+" ");
                    tmp |= a[k]; 
                }
                System.out.println(" here subarray sum is "+tmp);
                ans+=tmp;
            }
        }
        System.out.println(ans);
    }
}
