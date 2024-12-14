public class SOHO 
{
    public static void main(String[] args)
    {
        int arr[] = {-7, 1, 5, 2, -4, 3, 0};
        int left_sum=0,right_sum=0;
        for(int i=0;i<arr.length;i++)
        {
            right_sum+=arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            right_sum=right_sum-arr[i];
            if(left_sum==right_sum)
            {
                System.out.print(arr[i]);
            }
            left_sum=left_sum+arr[i];
        }   
    }
}