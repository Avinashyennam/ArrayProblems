import java.util.*;
class TwoSum_LC
{
    public static void main(String args[])
    {
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=input.nextInt();
        }
        int target=input.nextInt();
        int i,j;
        breakLabel:
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if((nums[i]+nums[j])==target)
                {
                    nums[0]=i;
                    nums[1]=j;
                    //System.out.println("found at "+i+" "+j);
                    break breakLabel;
                }
            }
        }
        for(i=0;i<2;i++)
        {
            System.out.print(nums[i]);
        }

    }
}