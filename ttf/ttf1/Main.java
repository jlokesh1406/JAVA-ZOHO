//Brute, Better and Optimal Approaches
//----------(1.ARRAY)------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//1.largest element in an array
/* 
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        //1.brute
        //   time complexity : o(n^2)
        //   space complexity: o(1)
        int arr1[]={3,2,1,5,2};
        System.out.println(Brute(arr1, 0)); // 5
        System.out.println(Arrays.toString(arr1));// 1 2 2 3 5

        //2.better
        //   time complexity : o(n)
        //   space complexity: o(1)
        int arr2[]={3,2,1,5,2};
        System.out.println(Better(arr2, 0)); // 5
        System.out.println(Arrays.toString(arr2));// 3 2 1 5 2

        //3.Optimal
        //   time complexity : o(n) becuse of factor (1/2) is dropped in Big-O notation.
        //   space complexity: o(1)
        int arr3[]={3,2,1,5,2};
        System.out.println(Better(arr3, 0)); // 5
        System.out.println(Arrays.toString(arr3));// 3 2 1 5 2
    }
    static int Brute(int arr[],int largest)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr[arr.length-1];
    }
    static int Better(int arr[],int largest)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(largest<arr[i])
            {
                largest=arr[i];
            }
        }
        return largest;
    }
    static int Optimal(int arr[],int largest)
    {
        // 1 2 3 4 5 6
        for(int i=0;i<arr.length/2;i++)
        {
            if(largest<arr[i])
            {
                largest=arr[i];
            }
            if(largest<arr[arr.length-1-i])
            {
                largest=arr[arr.length-i-1];
            }
        }
        if(arr.length%2==1&&largest<arr[arr.length/2])
        {
            largest=arr[largest/2];
        }
        return largest;
    }
}
*/



//2.second largest in array
/* 
import java.util.*;
public class Main 
{
    public static void main(String[] args) {

        //1.Brute
        //   time complexity : o(n^2+n)
        //   space complexity: o(1)
        int arr1[]={2,3,4,5,51,23,51,15};
        System.out.println(Brute(arr1, 0));//23
        //2.Better
        //   time complexity : o(n) In Big-O notation, constant factors are ignored,so o(2n) simplifies to o(n)
        //   space complexity: o(1)
        int arr2[]={2,3,4,5,51,23,51,15};
        System.out.println(Better(arr2, 0));//23

        //3.Optimal
        //   time complexity : o(n) 
        //   space complexity: o(1)
        int arr3[]={2,3,4,5,51,23,51,15};
        System.out.println(Optimal(arr3, 0));//23
    }
    static int Brute(int arr1[],int largest)
    {
        Arrays.sort(arr1);
        for(int i=arr1.length-1;i>=0;i--)
        {
            if(arr1[arr1.length-1]!=arr1[i])
            {
                return arr1[i];
            }
        }
        return -1;
    }
    static int Better(int arr2[],int largest)
    {
        for(int i=0;i<arr2.length;i++)
        {
            if(arr2[i]>largest)
            {
                largest=arr2[i];
            }
        }
        int temp=largest;
        largest=0;
        for(int i=0;i<arr2.length;i++)
        {
            if(arr2[i]>largest&&temp!=arr2[i])
            {
                largest=arr2[i];
            }
        }
        return largest;
    }
    static int Optimal(int arr3[],int slargest)
    {
        int largest=Integer.MIN_VALUE; 
        slargest=Integer.MIN_VALUE;
        for(int i=0;i<arr3.length;i++)
        {
            if(arr3[i]>largest)
            {
                slargest=largest;
                largest=arr3[i];
            }
            else if(arr3[i]<largest&&arr3[i]>slargest)
            {
                slargest=arr3[i];
            }
        }
        return slargest;
    }
}
*/


//3.array is sorted are not
/* 
public class Main 
{
   public static void main(String[] args) 
    {
        //3.optimal
        int arr1[]={1,2,1,3,4};
        for(int i=1;i<arr1.length;i++)
        {
            if(arr1[i-1]>arr1[i])
            {
                System.out.println("---Array Unsorted---");
                return;
            }
        }
        System.out.println("---Array Sorted---");    
    }
}
*/
//4.remove duplicates in-phase from sorted array
/*
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        //1.better using set
        //  time complexity:o(n)
        //  space complexity:o(n)
        int arr1[]={1,1,2,2,2,4,5,5,6,6};
        System.out.println(better(arr1));//1 2 4 5 6    5

        //2.optimal 
        //  time complexity:o(n)
        //  space complexity:o(1)
        int arr2[]={1,1,2,2,2,4,5,5,6,6};
        System.out.println(Optimal(arr1,0));// 1 2 4 5 6    5
    }
    static int better(int arr1[])
    {
        Set<Integer> arr = new HashSet<>();
        for(int i=0;i<arr1.length;i++)
        {
            arr.add(arr1[i]);
        }
        for(Integer temp:arr)
        {
            System.out.print(temp+" ");
        }
        System.out.println();
        return arr.size();
    }
    static int Optimal(int arr[],int j)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(i==arr.length-1)
            {
                arr[j++]=arr[i];
            }
            else if(arr[i]!=arr[i+1])
            {
                arr[j++]=arr[i];
            }
        }
        for(int i=0;i<j;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return j;
    }
}
*/


//5.Left Rotate an array by one place
/* 
public class Main 
{
    public static void main(String[] args) {

        //1.better (with using third variable)
        int arr1[]={1,2,3,4,5};
        Better(arr1);
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        //2.Optimal (without using third variable)
        int arr2[]={1,2,3,4,5};
        Optimal(arr2);
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
    static void Better(int arr[])
    {
        int temp=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }
    static void Optimal(int arr[])
    {

        // 2 1 3 4 5
        // 2 3 1 4 5
        // 2 3 4 1 5
        // 2 3 4 5 1
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=arr[i]^arr[i+1];
            arr[i+1]=arr[i]^arr[i+1];
            arr[i]=arr[i]^arr[i+1];
        }
    }
}
*/


//6.Left Rotate the array By D places
/* 
public class Main 
{
    public static void main(String[] args) {
        //1.Brute:
        //  Time complexity : o(d1)+o(len-d1)+o()
        //  Space Complexity: o(d1)
        System.out.println("Brute");
        int arr1[]={1,2,3,4,5,6,7},d1=3;
        Brute(arr1, d1);
        for(int temp:arr1)
        {
            System.out.print(temp+" ");
        }

        System.out.println("\nOptimal:");
        
        //2.Optimal:
        int arr2[]={1,2,3,4,5,6,7},d2=3;
        //       1 2 3|4 5 6 7
        //       3 2 1|7 6 5 4  reverse(0 to d2-1) and revese(d2 to len)
        //       4 5 6|7 1 2 3  reverse(o to d2-1)    
        if(d2>=arr2.length)
        {
            d2=d2%arr2.length;
        }
        int len=arr2.length;              
        Optimal(arr2, 0, d2-1);
        Optimal(arr2, d2, len-1);
        Optimal(arr2, 0, len-1);
        for(int i=0;i<len;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
    static void Brute(int arr1[],int d1)
    {
        int temp[]=new int[d1];
        for(int i=0;i<d1;i++)
        {
            temp[i]=arr1[i];
        }
        for(int i=d1;i<arr1.length;i++)
        {
            arr1[i-d1]=arr1[i];
        }
        //int j=0;
        for(int i=arr1.length-d1;i<arr1.length;i++)
        {
            arr1[i]=temp[i-d1-1];
            //arr1[i]=temp[j++];
        }
    }
    static void Optimal(int arr[],int start,int end)
    {
        while(start<=end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
*/


//7.Move all Zero to the end of the array
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr1[]={1,0,2,3,2,0,0,4,5,1};
        //1.Brute:
        // Time Complexity:o(n)
        // Space Complexity:o(n)
        int temp1[]=Brute(arr1);
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(temp1[i]+" ");
        }
        System.out.println();
        //2.Optimal:
        // Time Complexity:o(n)
        // Space Complexity:o(1)
        int arr2[]={1,0,2,3,2,0,0,4,5,1};
        Optimal(arr2);
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }

    }
    static int[] Brute(int arr1[])
    {
        int temp[]=new int[arr1.length],j=0;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]!=0)
            {
                temp[j++]=arr1[i];
            }
        }
        for(int i=j;i<arr1.length;i++)
        {
            temp[i]=0;
        }
        return temp;
    }
    static void Optimal(int arr2[])
    {
        int j=0;
        for(int i=0;i<arr2.length;i++)
        {
            if(arr2[i]!=0)
            {
                arr2[j++]=arr2[i];
            }
        }
        for(int i=j;i<arr2.length;i++)
        {
            arr2[i]=0;
        }
    }
} 
*/



//8.Sorted Array Search
/* 
public class Main 
{
    public static void main(String[] args) {
        //1.Brute
        //  Time Complexity : o(n)
        //  Space Complexity: o(1)
        int arr1[]={1,2,3,4,6};
        int target1=6;
        System.out.println(Brute(arr1, target1));

        //2.Brute
        //  Time Complexity : o(n)
        //  Space Complexity: o(1)
        int arr2[]={1,2,3,4,6};
        int target2=6;
        System.out.println(Optimal(arr2, target2));
    }
    static int Brute(int arr1[],int target)
    {
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
    static int Optimal(int arr2[],int target)
    {
        int start=0,end=arr2.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr2[mid]>target)
            {
                end=mid-1;
            }
            else if(arr2[mid]<target)
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
*/


//9.Union of Two Sorted Arrays
/* 
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        //1.Brute:
        // Time Complexity: o(nlog)
        // Space Complexity:o(2n)
        int arr1[]={2,2,3,4,5},arr2[]={1,1,2,3,4};    
        ArrayList<Integer>temp1 = new ArrayList<>();
        ArrayList<Integer>temp2 = Brute(arr1, arr2, temp1);
        for(int i=0;i<temp2.size();i++)
        {
            System.out.print(temp2.get(i)+" ");  //2 3 4 5 1 
        }
        System.out.println();

        //2.Optimal
        // Time Complexity: O(n)+O(m)+O(n+m)=O(n+m)
        // Space Complexity:o(n+m)
        int arr3[]={2,2,3,4,5},arr4[]={1,1,2,3,4};    
        ArrayList<Integer>temp3 = Optimal(arr3, arr4);
        for(int i=0;i<temp3.size();i++)
        {
            System.out.print(temp3.get(i)+" ");//1 2 3 4 5
        }
    }
    static ArrayList<Integer> Brute(int arr1[],int arr2[],ArrayList<Integer>temp1)
    {
        for(int i:arr1)
        {
            if(!temp1.contains(i))
            {
                temp1.add(i);
            }
        }
        for(int i:arr2)
        {
            if(!temp1.contains(i))
            {
                temp1.add(i);
            }
        }
        return temp1;
    }

    static ArrayList<Integer> Optimal(int arr1[],int arr2[])
    {
        ArrayList<Integer>temp=new ArrayList<>();
        int start=RemoveDulicate(arr1);
        int end=RemoveDulicate(arr2);
        int i=0,j=0;
        while (i<start&&j<end) 
        {
            if(arr1[i]<arr2[j])
            {
                temp.add(arr1[i]);
                i++;
            }
            else if(arr1[i]>arr2[j])
            {
                temp.add(arr2[j]);
                j++;
            }
            else
            {
                temp.add(arr1[i]);
                i++;
                j++;
            }
        }
        while(i<start)
        {
            temp.add(arr1[i++]);
        }
        while (j<end) 
        {
            temp.add(arr2[j--]);    
        }
        return temp;
    }
    static int RemoveDulicate(int arr[])
    {
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr.length-1==i)
            {
                arr[j++]=arr[i];
            }
            else if(arr[i]!=arr[i+1])
            {
                arr[j++]=arr[i];
            }
        }
        return j;
    }
}
*/



//10.Missing Number 1 to N
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        //1.Brute:
        //  Time Complexity  : o(n^2)
        //  Space Complexity : o(1)
        int arr1[]={1,2,5,4},N1=5;   
        System.out.println(Brute(arr1, N1));

        //2.Optimal:
        //  Time Complexity  : o(n)
        //  Space Complexity : o(1)
        int arr2[]={1,2,5,4},N2=5;   
        Brute(arr2, N2);
        for(int i=0;i<arr2.length;i++)
        {
            if(i+1!=arr2[i])
            {
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(N2);

    }
    static int Brute(int arr1[],int N)
    {
        for(int i=1;i<=N;i++)
        {
            int flag=-1;
            for(int j=0;j<arr1.length;j++)
            {
                if(i==arr1[j])
                {
                    flag=1;
                    break;
                }
            }
            if(flag==-1)
            {
                return i;
            }
        }
        return N;
    }
    static void Optimal(int arr2[])
    {
        for(int i=0;i<arr2.length;)
        {
            int index=arr2[i];
            if( arr2.length>arr2[index] && arr2[i]!=arr2[index] )
            {
                int temp = arr2[i];
                arr2[i]=arr2[index];
                arr2[index]=temp;
            }
            else
            {
                i++;
            }
        }
    }
}
*/



//11.Maximum consecutive Ones
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr1[]={1,1,0,1,1,1,0,1,1,1,1},max=0,ones=0;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]==1)
            {
                ones++;
            }
            else if(arr1[i]==0)
            {
                if(max<ones)
                {
                    max=ones;
                }
                ones=0;
            }
            if(i==arr1.length-1)
            {
                if(max<ones)
                {
                    max=ones;
                }   
            }
        }   
        System.out.println(max); 
    }    
}
*/


//12.Find the Number that Appears Once,and the other twice
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        //1.Brute:
        //  Time Complexity  : O(n^2)
        //  Space Complexity : O(1)
        int arr1[]={1,1,2,3,3,4,4,5,5};   
        System.out.println(Brute(arr1)); //2

        //2.Optimal:
        //  Time Complexity  : O(n)
        //  Space Complexity : O(1)
        int arr2[]={1,1,2,3,3,4,4,5,5};   
        System.out.println(Optimal(arr2)); //2

    }   
    static int Brute(int arr1[])
    {
        for(int i=0;i<arr1.length;i++)
        {
            int ctr=0;
            for(int j=0;j<arr1.length;j++)
            {
                if(arr1[i]==arr1[j])
                {
                    ctr++;
                }
            }
            if(ctr==1)
            {
                return arr1[i];
            }
        }
        return -1;
    }
    static int Optimal(int arr[])
    {
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            ans=ans^arr[i];
        }
        return ans;
    }
}
*/


//13.Longest Subarray with sum K
/* 
public class Main 
{
    public static void main(String[] args)
    {
        //1.Optimal
        //  Time Complextity: O(n)
        //  Space Complexity: O(1)
        int arr1[]={1,2,3,1,1,1,1,3,3},k=6;// 4
        // int arr1[]={10,5,2,7,1,9},k=15;// 4
        System.out.println(Optimal(arr1, k));
    }
    static int Optimal(int arr1[],int k)
    {
        int max=0,sum=arr1[0];
        int i=0,j=0;
        while(j<arr1.length)
        {
            while(i<=j && sum > k)
            {
                sum=sum-arr1[i];
                i++;
            }
            if(sum==k)
            {
                if(max<j-i+1)
                {
                    max=j-i+1;
                }
            }
            j++;
            if(j<arr1.length)
            {
                sum=sum+=arr1[j];
            }
        }
        return max;
    }
}
*/


//14.two sum
/* 
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        //1.Brute
        //  Time Complexity : O(n^2)
        //  Space Complexity: O(1)
        int arr1[]={2,6,5,8,11},target1=14;
        int temp1[]=Brute(arr1, target1);
        System.out.println(temp1[0]+" "+temp1[1]);

        //2.Better
        //  Time Complexity : O(n^2)
        //  Space Complexity: O(n)
        int arr2[]={2,6,5,8,11},target2=14;
        int temp2[]=Better(arr2, target2);
        System.out.println(temp2[0]+" "+temp2[1]);

        //3.optimal
        // Time Complexity  : O(2logn)
        // Space Complexitu : O(1)
        int arr3[]={2,6,5,8,11},target3=14;
        //          2 5 6 8 11
        int temp3[]=Optimal(arr3, target3);
        System.out.println(temp3[0]+" "+temp3[1]);

    }
    static int[] Brute(int arr[],int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if( i!=j && arr[i]+arr[j]==target)
                {
                    return new int[]{i,j}; 
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int[] Better(int arr[],int target)
    {
        ArrayList<Integer>temp=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            temp.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(temp.contains(target-arr[i]))
            {
                return new int[]{i,temp.indexOf(target-arr[i])};
            }
        }
        return new int[]{-1,-1};
    }
    static int[] Optimal(int arr[],int target)
    {
        Arrays.sort(arr);
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int sum=arr[start]+arr[end];
            if(sum<target)
            {
                start++;
            }
            else if(sum>target)
            {
                end--;
            }
            else
            {
                return new int[]{start,end};
            }
        }
        return new int[]{start,end};
    }
}
*/


//15.Sort an array of 0's 1's and 2's
/* 
public class Main 
{
    public static void main(String[] args)
    {
        //1.brute:
        // Time Complexity  : O(2n)
        // Space Complexitty: O(1)
        int arr1[]={0,1,2,0,1,2,1,0,0,0,1,2};
        //0-5,1-4,2-3
        Brute(arr1);
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        
        //2.Optimal
        int arr2[]={0,1,2,0,1,2,1,0,0,0,1,2};
        Optimal(arr2);
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
    static void Brute(int arr[])
    {
        int zero=0,one=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                arr[zero++]=0;
            }
            else if(arr[i]==1)
            {
                one++;
            }
        }
        for(int i=zero;i<zero+one;i++)
        {
            arr[i]=1;
        }
        for(int i=zero+one;i<arr.length;i++)
        {
            arr[i]=2;
        }
    }
    static void Optimal(int arr[])
    {
        int left=0,right=arr.length-1;
        int mid=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[mid]==0)
            {
                int temp=arr[left];
                arr[left]=arr[mid];
                arr[mid]=temp;
                left++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else 
            {
                int temp=arr[right];
                arr[right]=arr[mid];
                arr[mid]=temp;
                right--;
            }
        }
    }
}
*/

//16.Majority Elements (N/2)
/* 
import java.util.*;
import java.util.Map.Entry;
public class Main
{
    public static void main(String[] args) 
    {
        //1.Brute
        // Time Complexity : O(n^2)
        // Space Complexity: O(1)
        int arr1[]={2,2,3,3,1,2,2};
        System.out.println(Brute(arr1));//2

        //2.Better
        int arr2[]={2,2,3,3,1,2,2};
        System.out.println(Better(arr2));//2

        //3.Optimal (Moore's Voting Algo)
        int arr3[]={2,2,3,3,1,2,2};
        System.out.println(Optimal(arr3));
    }
    static int Brute(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int ctr=0;
            for(int j=i;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    ctr++;
                }
            }
            if(ctr>arr.length/2)
            {
                return arr[i];
            }
        }
        return -1;
    }
    static int Better(int arr2[])
    {
        Map<Integer,Integer> temp = new HashMap<>();
        for(int i=0;i<arr2.length;i++)
        {
            int value=temp.getOrDefault(arr2[i], 0);
            temp.put(arr2[i],value+1);
        }
        for( Map.Entry<Integer, Integer> i : temp.entrySet())
        {
           // System.out.println(i.getKey()+" "+i.getValue());
            if(i.getValue()>arr2.length/2)
            {
                return i.getKey();    
            }
        }
        return -1; 
    }
    static int Optimal(int arr3[])
    {
        int ctr=0,element=0;
        for(int i=0;i<arr3.length;i++)
        {
            if(ctr==0)
            {
                element=arr3[i];
            }
            else if(element==arr3[i])
            {
                ctr++;
            }
            else
            {
                ctr--;
            }
        }
        ctr=0;
        for(int i=0;i<arr3.length;i++)
        {
            if(element==arr3[i])
            {
                ctr++;
            }
        }
        if(ctr>arr3.length/2)
        {
            return element;
        }
        return -1;
    }
}
*/

//17.Kadane's Algorithm,maximum subarray sum
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr1[]={-2,1,-3,4,-1,2,1,-5,4};    
        System.out.println(Brute(arr1));

       // int arr2[]={-2,1,-3,4,-1,2,1,-5,4}; 
        int arr2[]={5,4,-1,7,8};   
        System.out.println(Optimal(arr2));
    }
    static int Brute(int arr1[])
    {
        int max=0;
        for(int i=0;i<arr1.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr1.length;j++)
            {
                sum=sum+arr1[j];
                if(max<sum)
                {
                    max=sum;
                }
            }
        }
        return max;
    }
    static int Optimal(int arr2[])
    {
        int max=Integer.MIN_VALUE,sum=0;
        int startIndex=0,endIndex=0;
        for(int i=0;i<arr2.length;i++)
        {
            sum=sum+=arr2[i];
            if(max<sum)
            {
                max=sum;
                endIndex=i;
            }
            if(sum<0)
            {
                sum=0;
                startIndex=i+1;
            }
        }
        System.out.println(startIndex+" "+endIndex);
        return max;
    }
}
*/

//18.Max sum in sub-arrays two number
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr[]={4,3,1,5,6};
        long max=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(max<(arr[i]+arr[i+1]))
            {
                max=arr[i]+arr[i+1];
            }
        }
        System.out.println(max);    
    }
}
*/



//19.Rearrange Array Elements By Sign
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr1[]={3,1,-2,-5,2,-4};
        int arr2[]=Optimal(arr1);
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");//3 -2 1 -5 2 -4 
        }
    }
    static int[] Optimal(int arr[])
    {
        int positive=0,negative=1;
        int temp[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=0)
            {
                temp[positive]=arr[i];
                positive=positive+2;
            }
            else
            {
                temp[negative]=arr[i];
                negative=negative+2;
            }
        }
        return temp;
    }
}
*/

//20.Leaders in an Array problem
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr[]={16,17,4,3,5,2},max=0; // 17 5 2
        for(int i=arr.length-1;i>=0;i--) 
        {
            if(max<arr[i])
            {
                max=arr[i];
                arr[i]=-1*arr[i];
            }
        }      
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                System.out.print(-1*arr[i]+" ");
            }
        }
    }
}
*/


//21.Longest Consecutive Sequence in an Array
/* 
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        int arr1[]={102,4,100,1,101,3,2,1,1};
        System.out.println(Brute(arr1));//4

        int arr2[]={102,4,100,1,101,3,2,1,1};
        System.out.println(Better(arr2));//4

        int arr3[]={102,4,100,1,101,3,2,1,1};
        System.out.println(Optimal(arr3));//4

    }
    static int Brute(int arr[])
    {
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            int element=arr[i],ctr=0;
            for(int j=0;j<arr.length;j++)
            {
                if(element==arr[j])
                {
                    element++;
                    ctr++;
                    j=0;
                }
            }
            if(max<ctr){max=ctr;}
        }
        return max;
    }

    static int Better(int arr[])
    {
        Arrays.sort(arr); // use merge sort (n log n)
        int max=0,element=arr[0],ctr=0;
        for(int i=0;i<arr.length;i++)
        {
            if(element==arr[i])
            {
                ctr++;
                element++;
            }
            else
            {
                if(max<ctr){max=ctr;}
                ctr=0;
                element=arr[i];
            }
        }
        return max;
    }

    static int Optimal(int arr[])
    {
        ArrayList<Integer>temp=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!temp.contains(arr[i])){temp.add(arr[i]);}
        }
        int element=arr[0],ctr=0,max=0;
        for(int i=0;i<arr.length;)
        {
            if(temp.contains(element))
            {
                ctr++;
                element=element+1;
            }
            else
            {
                if(max<ctr){max=ctr;}
                ctr=0;
                element=arr[i++];
            }
        }
        return max;
    }
}
*/

//21.set matrix zero:
/* 
public class Main 
{
    public static void main(String[] args) {
        int arr[][]=
        {
           {0,1,2,0},
           {3,4,5,2},
           {1,3,1,5}
        };
        setZeroes(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void setZeroes(int[][] arr) 
    {
            int col00=1;
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[i].length;j++)
                {
                    if(arr[i][j]==0)
                    {
                        //row
                        arr[i][0]=0;
                        //col
                        if(j!=0)
                        {
                            arr[0][j]=0;
                        }
                        else
                        {
                            col00=0;
                        }
                    }
                }
            }
            //inside a arr without col1 and row1
            for(int i=1;i<arr.length;i++)
            {
                for(int j=1;j<arr[i].length;j++)
                {
                    if(arr[i][0]==0||arr[0][j]==0)
                    {
                        arr[i][j]=0;
                    }
                }
            }
            if(arr[0][0]==0)
            {
                for(int i=0;i<arr[0].length;i++)
                {
                    arr[0][i]=0;
                }
            }
            if(col00==0)
            {
                for(int i=0;i<arr.length;i++)
                {
                    arr[i][0]=0;
                }
            }
        }
}
*/

//22.Rotate Martix by by 90 degrees
/* 
public class Main
{
    public static void main(String[] args) 
    {
        int arr[][]=
        {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };    
        degree_90(arr);
        System.out.println("----degrees 90----");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        degree_90(arr);
        System.out.println("----degrees 180----");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        degree_90(arr);
        System.out.println("----degrees 270----");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        degree_90(arr);
        System.out.println("----degrees 0----");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void degree_90(int arr[][])
    {
        //transpose
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr[0].length;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;   
            }
        }
        //reverse
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length/2;j++)
            {
                arr[i][j]=arr[i][j]^arr[i][arr[0].length-j-1];
                arr[i][arr[0].length-j-1]=arr[i][j]^arr[i][arr[0].length-j-1];
                arr[i][j]=arr[i][j]^arr[i][arr[0].length-j-1];
            }
        }

    }
}
*/


//23.Sprial Matirx
/* 
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        // int arr[][]=
        // {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };
        int arr[][]=
        {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        List<Integer> temp = new ArrayList<Integer>();
        int row_s=0,row_e=arr.length-1,col_s=0,col_e=arr[0].length-1;
        while(row_s<=row_e&&col_s<=col_e)
        {
            for(int i=col_s;i<=col_e;i++)
            {
                temp.add(arr[row_s][i]);
            }
            row_s++;
            for(int i=row_s;i<=row_e;i++)
            {
                temp.add(arr[i][col_e]);
            }
            col_e--;
            if(row_s>row_e||col_s>col_e)
            {
                break;
            }
            for(int i=col_e;i>=col_s;i--)
            {
                temp.add(arr[row_e][i]);
            }
            row_e--;
            for(int i=row_e;i>=row_s;i--)
            {
                temp.add(arr[i][col_s]);
            }
            col_s++;
         }
         for(int i=0;i<temp.size();i++)
         {
            System.out.print(temp.get(i)+" ");
         }
    }
}
*/

//24.Number of sub arrays with sum k
/* 
public class Main 
{
    public static void main(String[] args) {
        int arr1[]={1,2,3,-3,1,1,1,4,2,-3},k1=3;
        System.out.println(brute(arr1, k1));//8

        int arr2[]={1,2,3,-3,1,1,1,4,2,-3},k2=3;
        System.out.println(Optimal(arr2, k2));//8
    }
    static int brute(int arr[],int k)
    {
        int ctr=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum+=arr[j];
                if(sum==k)
                {
                    ctr++;
                }
            }
        }
        return ctr;
    }
    static int Optimal(int arr[],int k)
    {
        int left=0,right=0,sum=0,ctr=0;
        while(left<arr.length)
        {
            sum=sum+arr[right];
            if(sum==k)
            {
                ctr++;
            }
            right++;
            if(right>=arr.length)
            {
                sum=0;
                left++;
                right=left;
            }
        }
        return ctr;
    }
}
*/

//25.Pascal's Triangleimport java.util.ArrayList;
/* 
import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
        int num1 = 5;     
        ArrayList<ArrayList<Integer>> arr1 = Pascal1(num1);
        for (int i = 0; i < num1; i++)
        {
            ArrayList<Integer> arr = arr1.get(i);
            for (int j = 0; j < arr.size(); j++) 
            {
                System.out.print(arr.get(j) + " ");
            }
            System.out.println();
        }
        Pascal2(num1);
    }

    static ArrayList<ArrayList<Integer>> Pascal1(int num) {
        ArrayList<ArrayList<Integer>> arr1 = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            ArrayList<Integer> temp1 = new ArrayList<>();
            for (int j = 0; j <= i; j++) 
            { 
                if (j == 0 || j == i) {
                    temp1.add(1);
                } else {
                    ArrayList<Integer> temp2 = arr1.get(i - 1);
                    temp1.add(temp2.get(j - 1) + temp2.get(j));
                }
            }
            arr1.add(temp1);
        }
        return arr1;
    }
    static void Pascal2(int num)
    {
        for(int i=1;i<=num;i++)
        {
            int temp=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(temp+" ");
                temp = temp * (i-j)/j;
            }
            System.out.println();
        }
    }
}
*/

//26.Majority Elements II n/3 time
/* 
import java.util.*;
public class Main 
{
    public static void main(String[] args) {
        int arr1[]={1,1,1,3,3,2,2,2};
        System.out.println(Brute(arr1));//1

        int arr2[]={1,1,1,3,3,2,2,2};
        System.out.println(Brute(arr2));//1

    }
    static int Brute(int arr1[])
    {
        for(int i=0;i<arr1.length;i++)
        {
            int ctr=0;
            for(int j=0;j<arr1.length;j++)
            {
                if(arr1[i]==arr1[j])
                {
                    ctr++;
                }
            }
            if(ctr>arr1.length/3)
            {
                return arr1[i];
            }
        }
        return -1;
    }
    static int Better(int arr2[])
    {
        Map<Integer,Integer>temp=new HashMap<>();
        for(int i=0;i<arr2.length;i++)
        {
            int value=temp.getOrDefault(arr2[i],0);
            temp.put(arr2[i], value+1);
        }
        for( Map.Entry<Integer, Integer> i : temp.entrySet())
        {
           // System.out.println(i.getKey()+" "+i.getValue());
            if(i.getValue()>arr2.length/3)
            {
                return i.getKey();    
            }
        }
        return -1;
    }
}
*/
//27.3 sum
/*
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        //1.Brute
        System.out.println("-----Brute-----");
        int arr1[]={-1,0,1,2,-1,-4};
        Brute(arr1);

        //2.Better
        //arr[i]+arr[j]+arr[k]=0
        //arr[i]+arr[j]=-arr[k];
        System.out.println("-----Better-----");
        int arr2[]={-1,0,1,2,-1,-4};
        Better(arr2);



    }
    static void Brute(int arr1[])
    {
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=i+1;j<arr1.length;j++)
            {
                for(int k=j+1;k<arr1.length;k++)
                {
                    if((arr1[i]+arr1[j]+arr1[k])==0)
                    {
                        System.out.println(arr1[i]+" "+arr1[j]+" "+arr1[k]);
                    }
                }
            }
        }
        return;
    }
    //  res.add(Arrays.asList(nums[i], nums[j], nums[k]));
    static void Better(int arr2[])
    {
        ArrayList<Integer>temp1=new ArrayList<>();
        ArrayList<ArrayList<Integer>> temp2 = new ArrayList<>();

        for(int i=0;i<arr2.length;i++)
        {
            temp1.add(arr2[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(i!=j&&temp1.contains(-(arr2[i]+arr2[j])))
                {
                    System.out.println(arr2[i]+" "+arr2[j]+" "+ -(arr2[i]+arr2[j]));
                }
            }
        }
    }

}
*/
//28.Find the Duplicate Number  1 to n (287)
/* 
public class Main 
{
    public static void main(String[] args) {
        int arr[]={1,3,4,2,2};
        for(int i=0;i<arr.length;)
        {
            int index=arr[i]-1;
            if(arr[i]!=arr[index])
            {
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }
            else
            {
                i++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if((i+1)!=arr[i])
            {
                System.out.println(arr[i]);//2
            }
        }
    }
}
*/

//30.2d binary search for target element
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr1[][]=
        {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        int temp1[]=Better(arr1, 3);
        System.out.println(temp1[0]+" "+temp1[1]); //0 1

        int temp2[]=Optimal(arr1, 3);
        System.out.println(temp2[0]+" "+temp2[1]); //0 1
    }
    static int[] Better(int arr1[][],int target1)
    {
        for(int i=0;i<arr1.length;i++)
        {
            int left=0,right=arr1[0].length-1;
            while (left<=right)
            {
                int mid=left+(right-left)/2;
                if(arr1[i][mid]>target1)
                {
                    right=mid-1;
                }   
                else if(arr1[i][mid]<target1)
                {
                    left=mid+1;
                }
                else
                {
                    return new int[]{i,mid};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int[] Optimal(int arr2[][],int target)
    {
        int n=arr2.length,m=arr2[0].length;
        int left=0,right=n*m-1;
        while (left<=right)
        {
            int mid=left+(right-left)/2;
            int row=mid/m,col=mid%m;
            if(arr2[row][col]>target)
            {
                right=mid-1;
            }
            else if(arr2[row][col]<target)   
            {
                left=mid+1;
            }
            else
            {
                return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }
}
*/

//31.pow(x,n)
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        double x=2.0;
        int n=10;    
        System.out.println(Optimal_Pow(x, n));//1024.0
    }
    static double Optimal_Pow(double x,int n)
    {
        double ans=1.0;
        long nn=n;
        if(nn<0){nn=-1*nn;}
        while(nn>0)
        {
            if(nn%2==1)
            {
                ans=ans*x;
                nn=nn-1;
            }
            else
            {
                x=x*x;
                nn=nn/2;
            }
        }
        if(n<0){ ans = (double)(1.0)/(double)(ans);}
        return ans;
    }

}
*/

//---------------------------------------------(2.Recursion)------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//1.Print Name N time
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        //--> Time Complexity :O(N)
        //--> Space Complextiy: O(N) becuse of stack space 
        int num1=5;
        Name(num1,0);
    }
    static void Name(int num,int i)
    {
        if(i>=num)
        {
            return;
        }
        System.out.println("Lokesh ");
        Name(num,i+1);// 4 3 2 1 0
    }
}
*/
//2.print 1 to n;
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int num1=4;    
        Print(num1, 1);
    }
    static void Print(int num,int i)
    {
        if(i>num)
        {
            return;
        }
        System.out.print(i+" ");
        Print(num, i+1);
    }
}
*/
//3.print n to 1;
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int num1=4;    
        Print(num1, 4); // 4 3 2 1
    }
    static void Print(int num,int i)
    {
        if(i==0)
        {
            return;
        }
        System.out.print(i+" ");
        Print(num, i-1);
    }
}
*/
//4.print for 1 to n in backtracking
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int num=5,i=5;    
        Print(num, i);//5 4 3 2 1 
    }
    static void Print(int num,int i)
    {
        if(i==0)
        {
            return;
        }
        System.out.print(i+" ");
        Print(num, i-1);
    }
}
*/

//5.print for n to 1 in backtracking
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int num=5,i=5;    
        Print(num, i);//1 2 3 4 5
    }
    static void Print(int num,int i)
    {
        if(i==0)
        {
            return;
        }
        Print(num, i-1);
        System.out.print(i+" ");
       // Print(num, i-1);
    }
}
*/

//6.sum of 1 to n
/* 
public class Main 
{
    public static void main(String[] args) {
        int num=5,i=1;
        System.out.println(SumOfN(num, i, 0));//15

        System.out.println(SumOfN(num));//15
    }
    static int SumOfN(int num,int i,int sum)
    {
        if(i>num)
        {
            return sum;
        }
        sum=sum+i;
        return SumOfN(num, i+1,sum);
    }
    static int SumOfN(int num)
    {
        if(num==0)
        {
            return num;
        }
        return num+SumOfN(num-1); 
    }
}
*/

//7.product of 1 to n
/* 
public class Main 
{
    public static void main(String[] args) {
        int num=5;
        System.out.println(SumOfN(num));//16
        System.out.println(ProductOfN(num));//120
    }
    static int SumOfN(int num)
    {
        if(num==0)
        {
            return 1;
        }
        return num+SumOfN(num-1); 
    }
    static int ProductOfN(int num)
    {
        if(num==0)
        {
            return 1;
        }
        return num*ProductOfN(num-1); 
    }
}
*/

//8.fibo series
/* 
public class Main 
{
    public static void main(String[] args) {
        int num=4;
        System.out.println(fib(num)); // 0 1 1 2 (4)
    }
    static int fib(int num)
    {
        if(num<=1)
        {
            return num;
        }
        return fib(num-1)+fib(num-2);
    }
}
*/

//9.reverse arr
/* 
public class Main 
{
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        reverse(arr1, 0, arr1.length-1);
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
    static void reverse(int arr[],int i,int j)
    {
        if(i>j)
        {
            return;
        }
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        reverse(arr, i+1, j-1);
    }
}
*/

//10.print all subsequences
//subsequences is a contigous/non-contigous sequenes,which follows the sum order
/*
     [3,1,2]
import java.util.*;
public class Main 
{
    public static void main(String[] args) {
        int nums[]={1,2,3};
        List<List<Integer>> temp=subsets(nums);
        for(int i=0;i<temp.size();i++)
        {
            List<Integer> temp2=temp.get(i);
            for(int j=0;j<temp2.size();j++)
            {
                System.out.print(temp2.get(j)+" ");
            }
            System.out.println();
        }
    }
    static List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }
    static void backtrack(int[] nums, int start, List<Integer> path, List<List<Integer>> result)
    {

        result.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++)
        {
            path.add(nums[i]);
            backtrack(nums, i + 1, path, result);
            path.remove(path.size() - 1);
        }
    }
}
*/


//1.Binary Search
/* 
public class Main 
{
    public static void main(String[] args)
    {
        int arr[]={-1,0,3,5,9,12},target=9;
        System.out.println(BinarySearch1(arr, target));//4
        System.out.println(BinarySearch2(arr, target, 0, arr.length-1));//4
    }
    static int BinarySearch1(int arr[],int target)
    {
        int left=0,right=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]>target)
            {
                right=mid-1;
            }
            else if(arr[mid]<target)
            {
                left=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    static int BinarySearch2(int arr[],int target,int left,int right)
    {
        if(left>right)
        {
            return -1;
        }
        int mid=left+(right-left)/2;
        if(arr[mid]>target)
        {
            return BinarySearch2(arr, target,left, mid-1);
        }
        else if(arr[mid]<target)
        {
            return BinarySearch2(arr, target, mid+1, right);
        }
        else
        {
            return mid;
        }
    }
}
*/

//2. Find the target which is equal to target of number Floor and Ceil
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr[]={1,2,8,10,11,12,19},target=7;
        System.out.println(BinarySearchWithFloor(arr, target));//2
        System.out.println(BinarySearchWithCeil(arr, target));//8
    }
    static int BinarySearchWithFloor(int arr[],int target)
    {
        int left=0,right=arr.length-1,ans=-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]<=target)
            {
                ans=arr[mid];
                left=mid+1;
            }
            else if(arr[mid]>target)
            {
                right=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return ans;
    }
    static int BinarySearchWithCeil(int arr[],int target)
    {
        int left=0,right=arr.length-1,ans=-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]>=target)
            {
                ans=arr[mid];
                right=mid-1;
                
            }
            else
            {
               left=mid+1;   
            }
        }
        return ans;
    }
}
*/
//3.Search Insert Position
/* 
public class java 
{
    public static void main(String[] args) 
    {
        int arr1[]={1,3,5,6},target=5;  
        System.out.println(FloorInsert(arr1, target));//2
    }
    static int FloorInsert(int arr1[],int target)
    {
        int left=0,right=arr1.length-1,ans=arr1.length;
        while (left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr1[mid]<=target)
            {
                ans=mid;   
                  left=mid+1;
            }
            else 
            {
                right=mid-1;
            }
        }
        return left;
    }

}
*/
//4.Find First and Last Position of Element in Sorted Array
/* 
public class Main 
{
    public static void main(String[] args) {
        int arr1[]={5,7,7,8,8,10},target1=8;
        Brute(arr1, target1); // 3 4

        int arr2[]={5,7,7,8,8,10},target2=8;
        Better(arr2, target2); // 3 4

        int arr3[]={5,7,7,8,8,10},target3=8;
        Optimal(arr3, target3); // 3 4
    }
    static void Brute(int arr[],int target)
    {
        int firstIndex=-1,LastIndex=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target && firstIndex==-1)
            {
                firstIndex=i;
            }
            if(arr[arr.length-i-1]==target && LastIndex==-1)
            {
                LastIndex=arr.length-i-1;
            }
        }
        System.out.println(firstIndex+" "+LastIndex);
        return;
    }
    static void Better(int arr[],int target)
    {
        int l=LowerBound(arr, target),u=UpperBound(arr, target);
        if(l==arr.length || arr[l]!=target)
        {
            System.out.println("Not Present target element in array");
            return;
        }
        System.out.println(LowerBound(arr, target)+" "+UpperBound(arr, target));
    }
    static int LowerBound(int arr[],int target)
    {
        int left=0,right=arr.length-1,ans=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]>=target)
            {
                ans=mid;
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return ans;
    }
    static int UpperBound(int arr[],int target)
    {
        int left=0,right=arr.length-1,ans=-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]>target)
            {
                ans=mid;
                right=mid-1;
            }
            else
            {
                
                left=mid+1;
            }
        }
        return ans;
    }
    static void Optimal(int arr[],int target)
    {
        //lower
        int l=Bound(arr, target, true);
        //upper
        int u=Bound(arr, target, false);
        if(l==arr.length || arr[l]!=target)
        {
            System.out.println("Not Present target element in array");
            return;
        }
        System.out.println(l+" "+u);

    }
    static int Bound(int arr[],int target,boolean Upper_Or_Lower)
    {
        int left=0,right=arr.length-1,ans=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            //lower Bound
            if(Upper_Or_Lower)
            {
                if(arr[mid]>=target)
                {
                    ans=mid;
                    right=mid-1;
                }
                else
                {
                    left=mid+1;
                }
            }
            else
            {
                if(arr[mid]>target)
                {
                    right=mid-1;
                }
                else
                {
                    ans=mid;
                    left=mid+1;
                }
            }
        }
        return ans;
    }
}
*/

//5.Count occurrences of a number in a sorted array with duplicates
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr[]={1,1,2,2,2,2,3},target=2;   
        int l=Bound(arr, target, true);
        int r=Bound(arr, target, false);
        if(l==arr.length || arr[l]!=target)
        {
            System.out.println("0");
            return;
        }
        System.out.println(r-l+1); // 4
    }
    static int Bound(int arr[],int target,boolean L_or_U)
    {
        int left=0,right=arr.length-1,ans=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(L_or_U)
            {
                //int temp=arr[i]>=target?right=mid-1:left=mid+1;(--ERROR---)
                if(arr[mid]>=target){ans=mid;right=mid-1;}
                else{left=mid+1;}
            }
            else
            {
                if(arr[mid]>target){right=mid-1;}
                else{ans=mid;left=mid+1;}   
            }
        }
        return ans;
    }
}
*/
//6.Search in Rotated Sorted Array (Unique element)
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr1[]={7,8,9,1,2,3,4,5,6},target1=1;
        System.out.println(Brute(arr1, target1)); // 3

        int arr2[]={7,8,9,1,2,3,4,5,6},target2=1;
        System.out.println(Better(arr2, target2)); //3

        int arr3[]={7,8,9,1,2,3,4,5,6},target3=1;
        System.out.println(Optimal(arr3, target3)); //3
    }
    static int Brute(int arr[],int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return-1;
    }
    static int Better(int arr[],int target)
    {
        for(int i=0;i<=arr.length/2;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
            if(arr[arr.length-i-1]==target)
            {
                return arr.length-i-1;
            }
        }
        return -1;
    }
    static int Optimal(int arr[],int target)
    {
        int left=0,right=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==target){return mid;}
            if(arr[left]<=arr[mid])
            {
                if(arr[left]<=target && target<=arr[mid])
                {
                    right=mid-1;
                }
                else
                {
                    left=mid+1;
                }
            }
            else
            {
                if(arr[mid]<=target && target<=arr[right])
                {
                    left=mid+1;
                }
                else
                {
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}
*/

//7.Minimum in Rotated Sorted Array (Unique)
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr1[]={4,5,6,7,0,1,2};
        System.out.println(Brute(arr1, 999));

        int arr2[]={4,5,6,7,0,1,2};
        System.out.println(Optimal(arr2, 999));
    }
    static int Brute(int arr[],int min)
    {
        for(int i=0;i<=arr.length/2;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            if(arr[arr.length-i-1]<min)
            {
                min=arr[arr.length-1-i];
            }
        }
        return min;
    }
    static int Optimal(int arr[],int min)
    {
        int left=0,right=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[left]<=arr[mid])
            {
                min=Math.min(min, arr[left]);
                left=mid+1;
            }
            else
            {
                right=mid-1;
                min=Math.min(min, arr[mid]);
            }
        }
        return min;
    }
}
*/
//8. Find out how many times array has been rotated
/* 
public class Main 
{
    public static void main(String[] args) {
        int arr1[]={3,4,5,1,2};
        System.out.println(Optimal(arr1, 9999));//3
    }
    static int Optimal(int arr1[],int min)
    {
        int left=0,right=arr1.length-1,index=-1;
        int ans=Integer.MAX_VALUE;
        while(left<=right)
        {
            int mid=left+(right-left)/2;//1+2
            if(arr1[left]<=arr1[right])
            {
                if(arr1[left]<ans)
                {
                    index=left;
                    ans=arr1[left];
                }
                break;
            }
            if(arr1[left]<=arr1[mid])
            {
                if(arr1[left]<=arr1[mid])
                {
                    index=left;
                    ans=arr1[left];
                }
                left=mid+1;
            }
            else
            {
                right=mid-1;
                if(arr1[mid]<ans)
                {
                    index=mid;
                    ans=arr1[mid];
                }
            }
        }
        return index;
    }
}
*/
//9.Single Element in a Sorted Array
/* 
public class Main 
{
    public static void main(String[] args) {
        int arr1[]={1,1,2,2,3,3,4,5,5,6,6};
        System.out.println(Brute(arr1, 0));//4

        int arr2[]={1,1,2,2,3,3,4,5,5,6,6};
        System.out.println(Better(arr2));//4


        
        int arr3[]={1,1,2,2,3,3,4,5,5,6,6};
        System.out.println(Better(arr3));//4/
    }
    static int Brute(int arr[],int ans)
    {
        for(int i=0;i<arr.length;i++)
        {
            ans=ans^arr[i];
        }
        return ans;
    }
    static int Better(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(i==0&&arr[i]!=arr[i+1])
            {
                return arr[i];
            }
            else if(i==arr.length-1 &&arr[i]!=arr[i-1])
            {
                return arr[i];
            }
            else if(i!=0&&i!=arr.length-1)
            {
                if(arr[i]!=arr[i-1] &&arr[i]!=arr[i+1])
                {
                    return arr[i];
                }
            }
        }
        return -1;
    }
    static int Optimal(int arr[])
    {
        //0 1 2 3 4 5 6 7 8 9 10
        //1,1,2,2,3,3,4,5,5,6,6;
        int len=arr.length;
        if(len==1){return arr[0];}
        if(arr[0]!=arr[1]){return arr[0];}
        if(arr[len-1]!=arr[len-2]){return arr[len-1];}
        int left=0,right=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if( arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1])
            {
                return arr[mid];
            }
            if(mid%2==1&&arr[mid]==arr[mid-1] || mid%2==0 && arr[mid]==arr[mid+1])
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return -1;
    }
}
*/
//10.find peek element
/* 
public class Main 
{
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7,8,5,1};
        System.out.println(Brute(arr1));//7

        int arr2[]={1,2,3,4,5,6,7,8,5,1};
        System.out.println(Brute(arr2));
    }
    static int Brute(int arr1[])
    {
        for(int i=1;i<arr1.length-1;i++)
        {
            if( arr1[i-1]<arr1[i] && arr1[i] > arr1[i+1])
            {
                return i;
            }
        }
        return -1;
    }
    static int Optimal(int arr1[])
    {
        int left=0,right=arr1.length-1;
        while (left<right)
        {    
            int mid=left+(right-left)/2;
            if(arr1[mid]>arr1[mid+1])
            {
                right=mid;
            }
            else
            {
                left=mid+1;
            }
        }
        return left;
    }
}
*/

//11.find SQRT of an integer return Floor(sqrt(number))
/* 
public class Main 
{
    public static void main(String[] args) {
        int number1=28;
        System.out.println(Brute1(number1));//5
        System.out.println(Brute2(number1));//5

        System.out.println(Optimal(number1));//5
    }
    static int Brute1(int num)
    {
        for(int i=1;i<=num;i++)
        {
            if(i*i>num)
            {
                return i-1;
            }
        }
        return -1;
    }
    static int Brute2(int num)
    {
        int ans=0;
        for(int i=1;i<=num;i++)
        {
            if((i*i)<=num)
            {
                ans=i;
            }
            else
            {
                break;
            }
        }
        return ans;
    }
    static int Optimal(int num)
    {
        int left=1,right=num,ans=0;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if((mid*mid)<=num)
            {
                ans=mid;
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return ans;
    }
}
*/

//12.Koko eating Bananas
// Ceil
/* 
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        int piles1[]={3,6,7,11},hours1=8;
        System.out.println(Better(piles1, hours1));// 4

        int piles2[]={3,6,7,11},hours2=8;
        System.out.println(Optimal(piles2, hours2));//4
    }
    static int Better(int piles[],int hours)
    {
        int max=0;
        for(int i=0;i<piles.length;i++)
        {
            if(piles[i]>max)
            {
                max=piles[i];
            }
        }
        for(int i=1;i<=max;i++)
        {
            int ctr=0;
            for(int j=0;j<piles.length;j++)
            {
                ctr+=(int)Math.ceil( (double)(piles[j])/(double)(i) );
            }
            if(ctr==hours)
            {
                return i;
            }
        }
        return -1;
    }
    static int Optimal(int piles[],int hours)
    {
        int left=0,right=max(piles,0);
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            int temp=calculate(piles, mid);
            if(temp<=hours)
            {
                right=mid-1;
            }
            else if(temp>hours)
            {
                left=mid+1;
            }
        }
        return left;
    }
    static int max(int arr[],int max)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }
    static int calculate(int arr[],int hours)
    {
        int ctr=0;
        for(int i=0;i<arr.length;i++)
        {
            ctr+=(int)Math.ceil( (double)(arr[i])/(double)(hours) );
        }
        return ctr;
    }
}
*/
//12. Minimum Number of Days to Make m Bouquets
// bloomdays,m-is no.of Bouquets required,k-adjacent flowers required
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int bloomdays1[]={7,7,7,7,13,11,12,7};    
    }
    static int Brute(int bloomdays2[])
    {
        int min=min(bloomdays2, 99999),max=max(bloomdays2, 0);
        while(min<=max)
        {
            int ctr=0;
        }
    }
    static int max(int arr[],int max)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    static int min(int arr[],int min)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
}

class Solution {
    public int minDays(int[] bloomDay, int m, int k) 
    {   
        max_min(bloomDay);
        long temp=(long)(m*k);
        if(temp>=bloomDay.length)
        {
            return -1;
        }
        int left=min,right=max;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(FormBouqutes(bloomDay,mid,m,k))
            {
                right=mid-1;
            }
            else 
            {
                left=mid+1;
            }
        } 
        return left;
    }
    static int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
    static void max_min(int arr[])
    {
        for(int i:arr)
        {
            if(max<i)
            {
                max=i;
            }
            if(min>i)
            {
                min=i;
            }
        }
        return;
    }
    static Boolean FormBouqutes(int arr[],int day,int m,int k)
    {
        int ctr=0,no_of_bouqutes=0;
        for(int i:arr)
        {
            if(i<=day)
            {
                ctr++;
            }
            else
            {
                no_of_bouqutes+=(ctr/k);
                ctr=0;   
            }
        }
        no_of_bouqutes+=(ctr/k);
        return no_of_bouqutes>=m;
    }
}
*/

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//----------------------------------1.Basic Maths Concept-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------



//1.Count Digits
/* 
public class Main 
{
    public static void main(String[] args) {
        int num=-123,ctr=0;
        while(num!=0)
        {
            ctr++;
            num/=10;
        }
        System.out.println(ctr);//3
    }
}
*/


//2.Reverse Number
/* 
public class Main 
{
    public static void main(String[] args) {
        int num=-123,result=0;
        while(num!=0)
        {
            result=result*10+num%10;
            num/=10;
        }
        System.out.println(result);//-321
    }
}
*/

//3.Check Palindrome
/*
public class Main 
{
    public static void main(String[] args) 
    {
        int number1=121,number2=number1;
        int reverseNumber=0;
        while (number1>0)
        {    
            reverseNumber=reverseNumber*10+number1%10;
            number1/=10;
        }    
        System.out.println(reverseNumber==number2); //true
        String str="121";
        int start=0,end=str.length()-1;
        while(start<=end)
        {
            if(str.charAt(start++)!=str.charAt(end--))
            {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);//true
        return;
    }
}
*/

//4.Armstrong Number
/*
public class Main 
{
    public static void main(String[] args) 
    {
        int number1=1634,number2=number1,lengthOfNumber=(int)(Math.log10(number1))+1;
        System.out.println(lengthOfNumber);//3
        int result=0;
        while(number1>0)
        {
            result+=(int)(Math.pow(number1%10,lengthOfNumber));
            number1=number1/10;
        }
        System.out.println(result);
        System.out.println(number2==result);
    }
}
*/

//5.print all divisors
/*
public class Main 
{
    public static void main(String[] args) 
    {
        int number=36;
        for(int i=1;i<=36;i++)
        {
            if(number%i==0)
            {
                System.out.print(i+" ");
            }
        }    
        System.out.println();
        // 1x36=36
        // 2x18=26
        // 3x12=36
        // 4x9=36
        // 6x6=36
        //--------
        // 9x4=36
        // 12x3=36
        // 18x2=36
        // 36x1=36
        for(int i=1;i<=Math.sqrt(number);i++)
        {
            if(number%i==0)
            {
                System.out.print(i+" ");
                if((number/i)!=i)// 36/6=6
                {
                    System.out.print(number/i+" ");
                }
            }
        }
    }
}
*/

//6.prime number check excatly 2 factors 1&itself
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int num=3;
        if(num<=1)
        {
            System.out.println("Not a Prime Number");
            return;
        }
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.println("Not a Prime Number");
                return;
            }
        }
        System.out.println("Prime Number");
    }
}
*/

//7.GCD/HCF--Greater Common division/Highest common factor
/* 
public class Main 
{
    public static void main(String[] args) 
    {  
        int num1=20,num2=40;
        for(int i=Math.min(num1, num2);i>=1;i--)
        {
            if(num1%i==0 &&num2%i==0)
            {
                System.out.println(i);
                break;
            }
        }  
        //------------------euclidean algorithm------------------
        //gcd(max(a,b),min(a,b))=gcd(max(a,b)-min(a,b),min(a,b))
        int num3=20,num4=40;
        while( num3>0 && num4>0)
        {
            if( num3>num4 )
            {
                num3=num3%num4;
            }
            else
            {
                num4=num4%num3;
            }
        }
        if(num3==0)
        {
            System.out.println(num4);
        }
        else
        {
            System.out.println(num3);
        }
    }
}
*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//----------------------------------2.Basic Pattern printing-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//1.
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int number=4;
        number=number*2;
        for(int i=0;i<=number;i++)
        {
            for(int j=0;j<=number;j++)
            {
                int temp=Math.min( Math.min(i,j),Math.min(number-i,number-j));
                System.out.print(temp+" ");
            }
            System.out.println();
        }    
    }   
}
*/
// 0 0 0 0 0 0 0 0 0 
// 0 1 1 1 1 1 1 1 0
// 0 1 2 2 2 2 2 1 0
// 0 1 2 3 3 3 2 1 0
// 0 1 2 3 4 3 2 1 0
// 0 1 2 3 3 3 2 1 0
// 0 1 2 2 2 2 2 1 0
// 0 1 1 1 1 1 1 1 0
// 0 0 0 0 0 0 0 0 0

//2.
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int number1=4;
        int number2=number1*2;
        for(int i=0;i<=number2;i++)
        {
            for(int j=0;j<=number2;j++)
            {
                int temp=number1-Math.min( Math.min(i,j),Math.min(number2-i,number2-j));
                System.out.print(temp+" ");
            }
            System.out.println();
        }    
    }   
}
4 3 3 3 3 3 3 3 4
4 3 2 2 2 2 2 3 4
4 3 2 1 1 1 2 3 4
4 3 2 1 0 1 2 3 4
4 3 2 1 1 1 2 3 4
4 3 2 2 2 2 2 3 4
4 3 3 3 3 3 3 3 4
4 4 4 4 4 4 4 4 4
*/

//3.
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int number1=4;
        int number2=number1*2;
        for(int i=0;i<=number2;i++)
        {
            for(int j=0;j<=number2;j++)
            {
                int temp=Math.min( Math.min(i,j),Math.min(number2-i,number2-j));
                System.out.print(temp%2==0?"X ":"0 ");
            }
            System.out.println();
        }    
    }   
}
X 0 0 0 0 0 0 0 X
X 0 X X X X X 0 X
X 0 X 0 0 0 X 0 X
X 0 X 0 X 0 X 0 X
X 0 X 0 0 0 X 0 X
X 0 X X X X X 0 X 
X 0 0 0 0 0 0 0 X
X X X X X X X X X
*/

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//----------------------------------3.Recursion----------------------------------------------------------------------------------------------------------------------------------------------------------------------------


//1.Print Name N Times
//Time Complexity:O(N)
//Space Complexity:O(N)
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        Name(5);   
    }
    static void Name(int num)
    {
        if(num==0)
        {
            return;
        }
        System.out.print("Lokesh-"+num+" ");
        Name(num-1);
    }
}
//    Lokesh-5 Lokesh-4 Lokesh-3 Lokesh-2 Lokesh-1 
*/

//2.print 1 to N
/* 
public class Main 
{
    public static void main(String[] args)
    {
        int num=5;
        function(num, 1);
    }
    static void function(int num,int i)
    {
        if(i>num)
        {
            return;
        }
        System.out.print(i+" ");
        function(num, i+1);
    }
}
//1 2 3 4 5  
*/

//3.print N to 1
/* 
public class Main 
{
    public static void main(String[] args) {
        int num=5;
        function(num);
    }
    static void function(int i)
    {
        if(i==0)
        {
            return;
        }
        System.out.print(i+" ");
        function(i-1);
    }
}
*/
//4.print 1 to N and N to 1 in recursion
/*
public class Main 
{
    public static void main(String[] args)
    {
        int num=5;
        function(num);
    }
    static void function(int num)
    {
        if(num==0)
        {
            return;
        }
        System.out.print(num+" "); // 5 4 3 2 1
        function(num-1);
        System.out.print(num+" ");//1 2 3 4 5
    }
}
*/

//5.String reverse
/* 
public class Main 
{
    public static void main(String[] args) {
        String str[]={"one","Two","Three"};
        function(str, 0);
    }
    static void function(String str[],int i)
    {
        if(i>=str.length)
        {
            return;
        }
        function(str, i+1);
        System.out.println(str[i]+" ");
    }
}
*/

//6.sum of first N number
/* 
public class Main 
{
    public static void main(String[] args) 
    { 
        int num=5;
        System.out.println(function1(num, 0));
        System.out.println(function2(num, 0));
    }

    static int function1(int num,int sum)
    {
        if(num==0)
        {
            return sum;
        }
        sum+=num;   // 1+2+3+4+5=15
        return function1(num-1,sum); 
    }
    static int function2(int num,int sum)
    {
        if(num==0)
        {
            return 0;
        }
        sum+=num;   // 1+2+3+4+5=15
        return num+function2(num-1,sum); 
    }
}
*/

//7.factorial of N
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int num=5;
        System.out.println(function1(num)); //120
    }
    static int  function1(int num)
    {
        if(num==0)
        {
            return 1;
        }
        return num*function1(num-1); 
    }
}
*/

//8.reverse given array
/* 
public class Main 
{
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        function(arr, 0, arr.length-1);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    static void function(int arr[],int left,int right)
    {
        if(left>=right)
        {
            return;
        }
        arr[left]=arr[left]^arr[right];
        arr[right]=arr[left]^arr[right];
        arr[left]=arr[left]^arr[right];
        function(arr, left+1, right-1);
    }
}
*/
//9. given string is parlindrome
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        char str[]={'m','a','D','a','m'};   
        System.out.println(fun(str, 0, str.length-1));//true
    }
    static boolean fun(char str[],int left,int right)
    {
        if(left>=right)
        {
            return true;
        }
        if(str[left]!=str[right])
        {
            return false;
        }
        return fun(str, left+1, right-1);
    }
}
*/

//10.fibonacci number 
/* 
public class Main 
{
    public static void main(String[] args) {
        int num=3;
        System.out.println(fun(num)); // 0 1 1 2 3 5 8
    }
    static int fun(int num)
    {
        if(num<=1)
        {
            return num;
        }
        return fun(num-1)+fun(num-2);
    }
}
*/


//11.print all subsequences
//subsequences a contigous /non-contigous sequencens,which follows the order

/* 
import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        int arr[]={3,1,2};
        List<List<Integer>> temp1=subsets(arr);

                             []
                        /    |    \
                    [3]     [1]   [2]
                    / \      |
                [3,1] [3,2] [1,2]
                /
            [3,1,2]

        for(int i=0;i<temp1.size();i++)
        {
            List<Integer> temp2=temp1.get(i);
            for(int j=0;j<temp2.size();j++)
            {
                System.out.print(temp2.get(j)+" ");
            }
            System.out.println();
        }

    }
    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }
    
    static void backtrack(int[] nums, int start, List<Integer> path, List<List<Integer>> result) 
    {
        result.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            backtrack(nums, i + 1, path, result);
            path.remove(path.size() - 1);
        }
    }
}
*/

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//---------------------------------------4.sorting------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


//1.bubble sort
//  Time Complexity : O(N^2)
//  Space Complexit : O(1)
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr[]={12,23,4,12,123,1};
        BubbleSort(arr);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }    
    }
    static void BubbleSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    arr[j]=arr[j]^arr[j+1];
                    arr[j+1]=arr[j]^arr[j+1];
                    arr[j]=arr[j]^arr[j+1];
                }
            }
        }
    }
}
*/

//2.selection sort
//  Time Complexity  : O(N^2)
//  Space Complexity : O(1)
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr[]={1,2,34,121,1,11,234,1};
        SelectionSort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void SelectionSort(int arr[])
    {
        int len=arr.length;
        for(int i=0;i<len-1;i++)
        {
            int min=i;
            for(int j=i+1;j<len;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            arr[i]=arr[i]^arr[min];
            arr[min]=arr[i]^arr[min];
            arr[i]=arr[i]^arr[min];
        }
        return;
    }
}
*/

//3.Insertion Sort
//  Time Complexity  : O(N^2)
//  Space Complexity : O(1)
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr[]={23,345,1,1,345,234,1};  
        Insertion_Sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        } 
    }
    static void Insertion_Sort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    arr[j]=arr[j]^arr[j-1];
                    arr[j-1]=arr[j]^arr[j-1];
                    arr[j]=arr[j]^arr[j-1];
                }
                else
                {
                    break;
                }
            }
        }
    }
}
*/

//4.
/* 
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int arr[] = {9, 4, 7, 6, 3, 1, 5, -1,-2,-2};
        int n = arr.length; // n should be equal to the length of the array
        mergeSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low; // starting index of left half of arr
        int right = mid + 1; // starting index of right half of arr

        // Storing elements in the temporary array in a sorted manner
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // If elements on the left half are still left
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // If elements on the right half are still left
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // Transferring all elements from temporary to arr
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid); // left half
        mergeSort(arr, mid + 1, high); // right half
        merge(arr, low, mid, high); // merging sorted halves
    }
}
*/


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//----------------------------------5.Array------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//1.Largest Element in an Array
/* 
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        int arr1[]={3,2,1,5,2}; 
        System.out.println(Brute(arr1));//5
        System.out.println(Optimal(arr1, 0));//5
    }
    static int Brute(int arr1[])
    {
        Arrays.sort(arr1);
        return arr1[arr1.length-1];
    }
    static int Optimal(int arr1[],int max)
    {
        for(int i=0;i<arr1.length;i++)
        {
            if(max<arr1[i])
            {
                max=arr1[i];
            }
        }
        return max;
    }
}
*/

//2.Second Largest Element in an Array
/* 
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {  
        //1.Brute
        int arr1[]={1,32,12,11,1123};
        System.out.println(Brute(arr1)); //32

        //2.Better
        int arr2[]={1,32,12,11,1123};
        System.out.println(Better(arr2)); //32

        //3.Optimal
        int arr3[]={1,32,12,11,1123};
        System.out.println(Optimal_max(arr3)); //32
        System.out.println(Optimal_min(arr3)); //11
    }
    static int Brute(int arr[])
    {
        Arrays.sort(arr); //merge sort
        int max=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
            if(max!=arr[i])
            {
                return arr[i];
            }
        }
        return -1;
    }
    static int Better(int arr[])
    {
        ArrayList<Integer>temp=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!temp.contains(arr[i]))
            {
                temp.add(arr[i]);
            }
        }
        Collections.sort(temp);
        return temp.get(temp.size()-2);
    }
    static int Optimal_max(int arr[])
    {
        int firstLongest=arr[0],secondLongest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(firstLongest<arr[i])
            {
                secondLongest=firstLongest;
                firstLongest=arr[i];
            }
            else if(arr[i]<firstLongest && arr[i]>secondLongest)
            {
                secondLongest = arr[i];
            }

        }
        return secondLongest;
    } 
    static int Optimal_min(int arr[])
    {
        int firstSmallest=arr[0],secondSmallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(firstSmallest>arr[i])
            {
                secondSmallest=firstSmallest;
                firstSmallest=arr[i];
            }
            else if(arr[i]!=firstSmallest && arr[i]<secondSmallest)
            {
                secondSmallest = arr[i];
            }

        }
        return secondSmallest;
    } 
}
*/

//3.Check if Array is Sorted and Rotated
/* 
public class Main 
{
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2},ctr=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                ctr++;
            }
        }
        if(arr[0]<arr[arr.length-1])
        {
            ctr++;
        }
        System.out.println( ctr<=1 ?" Array is Sorted ":"Array is Unsorted");  //Array is Sorted
    }
}
*/

//4.Array is Sorted or Not
/* 
public class Main 
{
    public static void main(String[] args) {
        int arr[]={1,2,3,1,2};
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                System.out.println("Array is Unsorted");
                return;
            }
        }
        System.out.println("Array is Sorted");
        return;
    }
}
*/

//5.Remove duplicates from Sorted Array 
/* 
import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        //1.Brute
        int arr1[]={1,1,2,2,2,3,3};
        ArrayList<Integer> temp1=Brute(arr1);
        for(Integer i:temp1)
        {
            System.out.print(i+" "); // 1 2 3
        }

        System.out.println();

        //2.optimal
        int arr2[]={1,1,2,2,2,3,3};
        int j=Optimal(arr2);
        for(int i=0;i<j;i++)
        {
            System.out.print(arr2[i]+" ");// 1 2 3
        }
    }
    static ArrayList<Integer> Brute(int arr1[])
    {
        ArrayList<Integer>temp=new ArrayList<>();
        for(int i:arr1)
        {
            if(!temp.contains(i))
            {
                temp.add(i);
            }
        }
        return temp;
    }
    static int Optimal(int arr2[])
    {
        int left=0;
        for(int i=0;i<arr2.length-1;i++)
        {
            if(arr2[i]!=arr2[i+1])
            {
                arr2[left++]=arr2[i];
            }
        }
        arr2[left++]=arr2[arr2.length-1];
        return left;
    }
}
*/

//6.Left Rotate an array by one place
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr1[]={1,2,3,4,5};
        int temp=arr1[0];
        int len=arr1.length;
        for(int i=1;i<len;i++)
        {
            arr1[i-1]=arr1[i];
        }   
        arr1[len-1]=temp;
        for(int i:arr1)
        {
            System.out.print(i+" "); // 2 3 4 5 1
        }
    }
}
*/

//7.Rotate Array By K places
/* 
public class Main 
{
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,7,8,9},k1=3;
        System.out.println("----Brute-----");
        Brute(arr1, k1);
        for(int i:arr1)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("----Optimal-----");
        int arr2[]={1,2,3,4,5,7,8,9},k2=3;
        Optimal(arr2, k2);
        for(int i:arr2)
        {
            System.out.print(i+" ");
        }
    }
    static void Brute(int arr1[],int k1)
    {
        int len=arr1.length;
        if(k1>=len)
        {k1=k1%len;}
        int temp[]=new int[k1];
        for(int i=0;i<k1;i++)
        {
            temp[i]=arr1[i];
        }
        for(int i=k1;i<len;i++)
        {
            arr1[i-k1]=arr1[i];
        }
        for(int i=len-k1;i<len;i++)
        {
            arr1[i]=temp[i-(len-k1)];
        }
        return;
    }
    static void Optimal(int arr[],int k)
    {
        int len=arr.length;
        if(k>=len)
        {
            k=k%len;
        }
        // 3 2 1 4 5 6 7 8 9
        reverse(arr, 0, k-1);
        //3 2 1 9 8 7 6 5 4
        reverse(arr, k, len-1);
        //4 5 6 7 8 9 1 2 3
        reverse(arr, 0, len-1);
    }
    static void reverse(int arr[],int left,int right)
    {
        while(left<=right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
*/

//8.Move Zeros to End
/* 
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        int arr1[]={1,0,2,3,2,0,0,4,5,1};   
        Brute(arr1); 
        for(int i:arr1)
        {
            System.out.print(i+" "); //1 2 3 2 4 5 1 0 0 0 
        }

        System.out.println();

        int arr2[]={1,0,2,3,2,0,0,4,5,1};   
        Better(arr2);
        for(int i:arr2)
        {
            System.out.print(i+" "); //1 2 3 2 4 5 1 0 0 0 
        }

        System.out.println();

        int arr3[]={1,0,2,3,2,0,0,4,5,1};   
        Optimal(arr3);
        for(int i:arr3)
        {
            System.out.print(i+" "); //1 2 3 2 4 5 1 0 0 0 
        }

    }
    static void Brute(int arr1[])
    {
        ArrayList<Integer> temp=new ArrayList<>();
        int i;
        for(i=0;i<arr1.length;i++)
        {
            if(arr1[i]!=0)
            {
                temp.add(arr1[i]);
            }
        }
        for(i=0;i<temp.size();i++)
        {
            arr1[i]=temp.get(i);
        }
        for(i=temp.size();i<arr1.length;i++)
        {
            arr1[i]=0;
        }
        return;
    }
    static void Better(int arr[])
    {
        int i,j=0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[j++]=arr[i];
            }
        }
        while(j<arr.length)
        {
            arr[j++]=0;
        }
        return;
    }
    static void Optimal(int arr[])
    {
        int i,j=0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                j=i;
                break;
            }
        }
        //1,0,2,3,2,0,0,4,5,1
        //  j i
        //1,2,0,3,2,0,0,4,5,1
        //    j i
        //1,2,3,0,2,0,0,4,5,1
        //      j i
        //1,2,3,2,0,0,0,4,5,1
        //        j i
        //1,2,3,2,0,0,0,4,5,1
        //        j     i
        //1,2,3,2,4,0,0,0,5,1
        //          j     i
        //1,2,3,2,4,5,0,0,0,1
        //            j     i
        //1,2,3,2,4,5,1,0,0,0
        for(i=j+1;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
}
*/

//9.Linear Search
/* 

public class Main 
{
    public static void main(String[] args) {
        int arr[]={1,2,3,2,3,1,5,3},target=3;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
        return;
    }
} // 2

*/

//10.Union of Sorted arrays
/* 
import java.util.*;
public class Main 
{
    public static void main(String[] args) {

        System.out.println("-------Brute-------");
        int arr1[]={1,1,2,3,4,5},arr2[]={2,3,4,4,5,6};
        ArrayList<Integer>temp1=Brute(arr1, arr2);
        for(Integer i:temp1)
        {
            System.out.print(i+" "); // 1 2 3 4 5 6
        }

        System.out.println();

        System.out.println("------Optimal------");
        int arr3[]={1,1,2,3,4,5},arr4[]={2,3,4,4,5,6};
        ArrayList<Integer>temp2=Optimal(arr3, arr4);
        for(Integer i:temp2)
        {
            System.out.print(i+" "); // 1 2 3 4 5 6
        }
        System.out.println();

    }
    static  ArrayList<Integer> Brute(int arr1[],int arr2[])
    {
        ArrayList<Integer>temp=new ArrayList<>();
        for(int i:arr1)
        {
            if(!temp.contains(i))
            {
                temp.add(i);
            }
        }
        for(int i:arr2)
        {
            if(!temp.contains(i))
            {
                temp.add(i);
            }
        }
        Collections.sort(temp);
        return temp;
    }
    static ArrayList<Integer> Optimal(int arr1[],int arr2[])
    {
        ArrayList<Integer>temp=new ArrayList<>();
        int left=RemoveDuplicate(arr1);
        int right=RemoveDuplicate(arr2);
        int i=0,j=0;
        while( i<left && j<right)
        {
            if(arr1[i]<arr2[j])
            {
                temp.add(arr1[i++]);
            }
            else if(arr1[i]>arr2[j])
            {
                temp.add(arr2[j++]);
            }
            else
            {
                temp.add(arr1[i]);
                i++;
                j++;
            }
        }
        while(i<left)
        {
            temp.add(arr1[i++]);
        }
        while(j<right)
        {
            temp.add(arr2[j++]);
        }
        return temp;
    }
    static int RemoveDuplicate(int arr[])
    {
        int i,j=0;
        for(i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                arr[j++]=arr[i];
            }
        }
        arr[j++]=arr[arr.length-1];
        return j;
    }
}
*/

//11.intersection of two sorted array
/* 
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {    
        System.out.println("----Brute-----");
        int arr1[]={1,2,2,3,3,4,5,6};
        int arr2[]={2,3,3,5,6,6,7};
        ArrayList<Integer>temp1=Brute(arr1, arr2);
        for(int i:temp1)
        {
            System.out.print(i+" "); // 2 3 5 6
        }


        System.out.println();


        System.out.println("-----Optimal-----");
        int arr3[]={1,2,2,3,3,4,5,6};
        int arr4[]={2,3,3,5,6,6,7};
        ArrayList<Integer>temp2=Optimal(arr3, arr4);
        for(int i:temp2)
        {
            System.out.print(i+" "); // 2 3 5 6
        }


    }
    static ArrayList<Integer> Brute(int arr1[],int arr2[])
    {
        ArrayList<Integer>temp1=new ArrayList<>();
        ArrayList<Integer>temp2=new ArrayList<>();
        for(int i:arr1)
        {
            temp1.add(i);
        }
        for(int i=0;i<arr2.length;i++)
        {
            if(temp1.contains(arr2[i]))
            {
                if(!temp2.contains(arr2[i]))
                {
                    temp2.add(arr2[i]);
                }
            }
        }
        return temp2;
    }
    static ArrayList<Integer> Optimal(int arr1[],int arr2[])
    {
        int i=0,j=0;
        ArrayList<Integer> temp=new ArrayList<>();
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                i++;
            }
            else if(arr1[i]<arr2[j])
            {
                j++;
            }
            else 
            {
                if(!temp.contains(arr1[i]))
                {
                    temp.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        return temp;
    }
}
*/

//12.find the missing Number
/* 
public class Main 
{
    public static void main(String[] args) {
        int arr1[]={3,0,1};     
        System.out.println(Brute(arr1)); //2

        int arr2[]={3,0,1};     
        System.out.println(Better(arr2)); //2

        int arr4[]={3,2,1};     
        System.out.println(Optimal(arr4)); //0
    }
    static int Brute(int arr[])
    {
        for(int i=0;i<arr.length;)
        {
            int index=arr[i];
            if(index<arr.length && arr[i]!=arr[index])
            {
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }
            else
            {
                i++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(i!=arr[i])
            {
                return i;
            }
        }
        return 1;
    }
    static int Better(int arr[])
    {
        int len=arr.length;
        int Tsum=(len*(len+1))/2,sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        return Tsum-sum;
    }
    static int Optimal(int arr[])
    {
        int ans=0;
        for(int i=1;i<=arr.length;i++)
        {
            ans=ans^i;
        }
        for(int i=0;i<arr.length;i++)
        {
            ans=ans^arr[i];
        }
        return ans;
    }
}
*/

//13.Maximum Consecutive Ones
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr[]={1,1,0,1,1,1,0,1,1};
        int max=0,ctr=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                ctr++;
                if(max<ctr)
                {
                    max=ctr;
                }
            }
            else
            {
                ctr=0;
            }
        } 
        System.out.println("Maximum Ones: "+max); //3
    }
}
*/

//14.Find the number that appears once, and the other numbers twice
/* 
public class Main 
{
    public static void main(String args[])
    {
        int arr1[]={1,1,3,3,4,4,2,6,6};
        System.out.println(Brute(arr1)); //2

        int arr2[]={1,1,3,3,4,4,2,6,6};
        System.out.println(Optimal(arr2)); //2

    }
    static int Brute(int arr1[])
    {
        int max=0;
        for(int i=0;i<arr1.length;i++)
        {
            if(max<arr1[i])
            {
                max=arr1[i];
            }
        }
        int temp[]=new int[max+1];
        for(int i=0;i<arr1.length;i++)
        {
            temp[arr1[i]]++;
        }
        for(int i=0;i<max+1;i++)
        {
            if(temp[i]==1)
            {
                return i;
            }
        }
        return -1;
    }
    static int Optimal(int arr[])
    {
        int ans=0;
        for(int i:arr)
        {
            ans=ans^i;
        }
        return ans;
    }
}
*/

//15.Longest subarray With Sum K
// subarray means continue
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr1[]={10,5,2,7,1,9},k1=15;    
        System.out.println(Brute(arr1, k1)); // 4 --> 5+2+7+1=>15

        //time complexity:O(2N)
        int arr2[]={10,5,2,7,1,9},k2=15;    
        System.out.println(Optimal(arr2, k2)); // 4 --> 5+2+7+1=>15
    }
    static int Brute(int arr[],int k)
    {
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum=sum+arr[j];
                if(sum==k)
                {
                    if(max<j-i+1)
                    {
                        max=j-i+1;
                    }
                }
            }

        }
        return max;
    }
    static int Optimal(int arr[],int k)
    {
        int left=0,right=0,sum=0,max=0;
        while(right<arr.length)
        {
            sum=sum+arr[right];
            while(left<=right &&sum>k)
            {
                sum=sum-arr[left];
                left++;
            }
            if(sum==k)
            {
                if(max<right-left+1)
                {
                    max=right-left+1;
                }
            }
            right++;
        }   
        return max;
    }
}
*/


//16.2Sum
/* 
import java.util.ArrayList;
import java.util.Arrays;

public class Main 
{
    public static void main(String[] args) 
    {
        int arr1[]={2,6,5,8,11},target1=14;
        int temp1[]=Brute(arr1, target1);
        System.out.println(temp1[0]+" "+temp1[1]); //1 3


        int arr2[]={2,6,5,8,11},target2=14;
        int temp2[]=Better(arr2, target2);
        System.out.println(temp2[0]+" "+temp2[1]);//1 3


        int arr3[]={2,6,5,8,11},target3=14;
        System.out.println(Optimal(arr3, target3));// YES



    }
    static int[] Brute(int arr[],int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if( i!=j &&arr[i]+arr[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int[] Better(int arr[],int target)
    {
        ArrayList<Integer>temp=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            temp.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(temp.contains(target-arr[i]))
            {
                return new int[]{i,temp.indexOf(target-arr[i])};
            }
        }
        return new int[]{-1,-1};
    }
    static String Optimal(int arr[],int target)
    {
        Arrays.sort(arr);//use merge sort
        int left=0,right=arr.length-1;
        while(left<right)
        {
            if(arr[left]+arr[right]>target)
            {
                right--;
            }
            else if(arr[left]+arr[right]<target)
            {
                left++;
            }
            else
            {
                return "YES";
            }
        }
        return "NO";
    }
}
*/


//17.Sort an array of 0's 1's & 2's 
/* 
import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        int arr1[]={0,1,2,0,1,2,1,2,0,0,0,1}; 
        Brute(arr1);
        for(int i:arr1)
        {
            System.out.print(i+" "); // 0 0 0 0 0 1 1 1 1 2 2 2 
        }

        System.out.println();

        int arr2[]={0,1,2,0,1,2,1,2,0,0,0,1}; 
        Better(arr2);
        for(int i:arr2)
        {
            System.out.print(i+" "); // 0 0 0 0 0 1 1 1 1 2 2 2 
        }

        System.out.println();

        int arr3[]={0,1,2,0,1,2,1,2,0,0,0,1}; 
        Optimal(arr3);
        for(int i:arr3)
        {
            System.out.print(i+" "); // 0 0 0 0 0 1 1 1 1 2 2 2 
        }
    }
    static void Brute(int arr[])
    {
        Arrays.sort(arr);// use merge sort
    }
    static void Better(int arr[])
    {
        int zero=0,one=0;
        for(int i:arr)
        {
            if(i==0){zero++;}
            else if(i==1){one++;}
        }
        for(int i=0;i<zero;i++)
        {
            arr[i]=0;
        }
        for(int i=zero;i<zero+one;i++)
        {
            arr[i]=1;   
        }
        for(int i=zero+one;i<arr.length;i++)
        {
            arr[i]=2;
        }
        return;
    }
    static void Optimal(int arr[])
    {

        //0,1,2,0,1,2,1,2,0,0,0,1
        //li                    r         

        int left=0,right=arr.length-1;
        int i=0;
        while(i<=right)
        {
            if(arr[i]==0)
            {
                int temp=arr[left];
                arr[left]=arr[i];
                arr[i]=temp;
                left++;
                i++;
            }
            else if(arr[i]==1)
            {
                i++;
            }
            else 
            {
                int temp=arr[i];
                arr[i]=arr[right];
                arr[right]=temp;
                right--;
            }
        }   
    }
}
*/

//18.Majority element (>N/2 times)
/* 
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        int arr1[]={2,2,3,3,1,2,2};
        System.out.println(Brute(arr1)); //2

        int arr2[]={2,2,3,3,1,2,2};
        System.out.println(Better(arr2));//2

        //Moore's Voting Algorithm
        int arr3[]={7,7,5,7,5,1,5,7,5,5,7,7,5,5,5};
        System.out.println(Optimal(arr3)); //5
    }
    static int Brute(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int ctr=0;
            for(int j=i+i;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    ctr++;
                }
            }
            if(ctr>arr.length/2)
            {
                return arr[i];
            }
        }
        return -1;
    }
    static int Better(int arr[])
    {
        int len=arr.length;
        HashMap<Integer,Integer>temp=new HashMap<>();
        for(int i=0;i<len;i++)
        {
            temp.put(arr[i],temp.getOrDefault(arr[i],0)+1);
        }
        for (Map.Entry<Integer, Integer> i : temp.entrySet()) 
        {
           // System.out.println(i.getKey()+" "+i.getValue());
           if(i.getValue()>len/2)
           {
              return i.getKey();
           }
        }
        return -1;
    }
    //Moore's Voting Algorithm
    static int Optimal(int arr[])
    {
        int element=0,ctr=0;
        for(int i=0;i<arr.length;i++)
        {
            if(ctr==0)
            {
                element=arr[i];
                ctr++;
            }
            else if(element==arr[i])
            {
                ctr++;
            }
            else
            {
                ctr--;
            }
        }
        return element;
    }
}
*/

//19.Kadane's Algorithm, maximum subarray sum
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr1[]={-2,1,-3,4,-1,2,1,-5,4};   
        System.out.println(Optimal(arr1));  //6
    }
    static int Optimal(int arr1[])
    {
        int sum=0,max=0;
        for(int i=0;i<arr1.length;i++)
        {
            sum=sum+arr1[i];
            if(sum<0)
            {
                sum=0;
            }
            if(max<sum)
            {
                max=sum;
            }
        }
        return max;
    }
}
*/

//20.Rearrange the array in alternating positive and negative items (equal +-)
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr1[]={3,1,-2,-5,2,-4};    
        int temp[]=Better(arr1);
        for(int i:temp)
        {
            System.out.print(i+" ");
        }
    }
    static int[] Better(int arr[])
    {
        int positive_index=0;
        int negative_index=1;
        int temp[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                temp[negative_index]=arr[i];
                negative_index=negative_index+2;
            }
            else
            {
                temp[positive_index]=arr[i];
                positive_index=positive_index+2;
            }   
        }
        return temp;
    }
}
*/

//21.Rearrange the array in alternating positive and negative items (not equal +-)
/* 
import java.util.*;
public class Main 
{
    public static void main(String[] args) {
        int arr[]={-1,2,3,4,5,-7,1};
        Brute(arr);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    static void Brute(int arr[])
    {
        ArrayList<Integer>positive=new ArrayList<>();
        ArrayList<Integer>negative=new ArrayList<>();
        for(int i:arr)
        {
            if(i<0)
            {
                negative.add(i);
            }
            else
            {
                positive.add(i);
            }
        }
        int i=0,j=0,ctr=0;
        // 2 3 4 5 1 
        // -1 -7
        while( i<positive.size() && j<negative.size())
        {
            arr[ctr++]=positive.get(i);
            arr[ctr++]=negative.get(j);
            i++;j++;
        }
        while(i<positive.size())
        {
            arr[ctr++]=positive.get(i++);
        }
        while(j<negative.size())
        {
            arr[ctr++]=negative.get(j++);
        }
        return;
    }
}
*/

//22.Leaders in array
/* 
public class Main 
{
    public static void main(String[] args) {
        int arr[]={16,17,4,3,5,2},max=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
            else
            {
                arr[i]=-123;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=-123)
            {
                System.out.print(arr[i]+" "); // 17 5 2
            }
        }
    }
}
*/

//23.longest Consecutive Sequences
/* 
import java.util.*;
public class Main 
{
    public static void main(String[] args) {
        int arr1[]={102,4,100,1,101,3,2,1,1};
        System.out.println(Brute(arr1)); //4

        int arr2[]={102,4,100,1,101,3,2,1,1};
        System.out.println(Better(arr2)); //4

        int arr3[]={102,4,100,1,101,3,2,1,1};
        System.out.println(Optimal(arr3)); //4
    }
    static int Brute(int arr[])
    {
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            int element=arr[i],ctr=0;
            for(int j=0;j<arr.length;j++)
            {
                if(element==arr[j])
                {
                    ctr++;
                    element=arr[j]+1;
                    j=0;
                }
            }
            if(max<ctr)
            {
                max=ctr;
            }
        }
        return max; 
    }
    static int Better(int arr[])
    {
        //1 1 1 2 3 4 100 101 102
        Arrays.sort(arr);
        int ctr=0,max=0,element=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(element==arr[i])
            {
                ctr++;
                element++;
            }
            else if(element-1==arr[i])
            {
                continue;
            }
            else
            {
                if(max<ctr)
                {
                    max=ctr;
                }
                ctr=0;
            }
        }
        return max;
    }
    static int Optimal(int arr[])
    {
        ArrayList<Integer>temp=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!temp.contains(arr[i]))
            {
                temp.add(arr[i]);
            }
        }
        int element=temp.get(0);
        int ctr=0,max=0;
        for(int i=0;i<temp.size();)
        {
            if(temp.contains(element))
            {
                ctr++;
                element++;
            }
            else
            {
                if(max<ctr)
                {
                    max=ctr;
                }
                ctr=0;
                element=arr[i];
                i++;
            }
        } 
        return max;
    }
}
*/

//24.set Matrix zero
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr[][]=
        {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        function(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void function(int arr[][])
    {
        int col00=1;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==0)
                {
                    arr[i][0]=0;
                    if(j!=0)
                    {
                        arr[0][j]=0;
                    }
                    else
                    {
                        col00=0;
                    }
                }
            }
        }
        //inside 
        for(int i=1;i<arr.length;i++)
        {
            for(int j=1;j<arr[0].length;j++)
            {
                if(arr[i][0]==0||arr[0][j]==0)
                {
                    arr[i][j]=0;
                }
            }
        }
        if(arr[0][0]==0)
        {
            for(int i=0;i<arr[0].length;i++)
            {
                arr[0][i]=0;
            }
        }
        if(col00==0)
        {
            for(int i=0;i<arr.length;i++)
            {
                arr[i][0]=0;
            }
        }
        return;
    }

}
*/

//25.Rotate Matrix by N degrees
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr[][]=
        {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println("----90 Degree-----");
        NinetyDegree(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("----180 Degree-----");
        NinetyDegree(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("----270 Degree-----");
        NinetyDegree(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("----180 Degree-----");
        NinetyDegree(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void NinetyDegree(int arr[][])
    {
        SetTranspose(arr);
        SetReverse(arr);
        return;
    }
    static void SetTranspose(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr[0].length;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    static void SetReverse(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            int left=0,right=arr[0].length-1;
            while(left<=right)
            {
                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;
                left++;
                right--;
            }
        }
    }
}
*/

//26. Spiral Matrix
/* 
public class Main 
{
    public static void main(String[] args) {
        int arr[][]=
        {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int r1=0,r2=arr.length-1,c1=0,c2=arr[0].length-1;
        while( r1<=r2 && c1<=c2)
        {
            for(int i=c1;i<=c2;i++)
            {
                System.out.print(arr[r1][i]+" ");
            }
            r1++;
            for(int i=r1;i<=r2;i++)
            {
                System.out.print(arr[i][c2]+" ");
            }
            c2--;
            if (r1>r2 ||c1>c2) 
            {
                break;   
            }

            for(int i=c2;i>=c1;i--)
            {
                System.out.print(arr[r2][i]+" ");
            }
            r2--;
            for(int i=r2;i>=r1;i--)
            {
                System.out.print(arr[i][c1]+" ");
            }
            System.out.println();
        }
    }
}

//1 2 3 6 9 8 7 4 
//4 5
*/

//27.count Subarray Sum Equals K
/* 
public class Main 
{
    public static void main(String[] args) {

        int arr1[]={1,2,3,-3,1,1,1,4,2,-3},k1=3;
        System.out.println(Brute(arr1, k1));// 8

        int arr2[]={1,2,3,-3,1,1,1,4,2,-3},k2=3;
        System.out.println(subarraySum(arr2, k2));// 8
    }
    static int Brute(int arr[],int k)
    {
        int ctr=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum=sum+arr[j];
                if(sum==k)
                {
                    ctr++;
                }
            }
        }
        return ctr;
    }
    static int subarraySum(int[] nums, int k)
    {
        int s=0,e=0,sum=0,ctr=0;
        while(s<nums.length)
        {
            sum+=nums[e];
            if(sum==k)
            {
                ctr++;
            }
            e++;
            if(e>=nums.length)
            {
                sum=0;
                s++;
                e=s;
            }
        }
        return ctr;
    }
}
*/

//28.pascal's triangel
/* 
import java.util.*;
public class Main 
{
    public static void main(String[] args) {
        int num1=5;
        ArrayList<ArrayList<Integer>>temp1=PascalTriangle1(num1);
        for(int i=0;i<temp1.size();i++)
        {
            ArrayList<Integer>temp2=temp1.get(i);
            for(int j=0;j<temp2.size();j++)
            {
                System.out.print(temp2.get(j)+" ");
            }
            System.out.println();
        }

        int num2=5;
        PascalTriangle2(num2);
    }
    static ArrayList<ArrayList<Integer>> PascalTriangle1(int num)
    {
        ArrayList<ArrayList<Integer>> temp1=new ArrayList<>(); 
        for(int i=0;i<num;i++)
        {
            ArrayList<Integer>temp2=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)
                {
                    temp2.add(1);
                }
                else
                {
                    ArrayList<Integer>temp3=temp1.get(i-1);
                    temp2.add(temp3.get(j)+temp3.get(j-1));
                }
            }
            temp1.add(temp2);
        }
        return  temp1;     
    }
    static void PascalTriangle2(int num)
    {
        for(int i=1;i<=num;i++)
        {
            int temp=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(temp+" ");
                temp=temp*(i-j)/j;
            }
            System.out.println();
        }
    }
}
*/

//29.majority elements(n/3)
/* 
import java.util.*;
public class Main 
{
    public static void main(String[] args) {

        //1.Brute
        int arr1[]={1,1,1,3,3,2,2,2};
       ArrayList<Integer>temp1=Brute(arr1);
       for(Integer i:temp1)
       {
          System.out.print(i+" ");
       }

       System.out.println();

       //2.Better
       int arr2[]={1,1,1,3,3,2,2,2};
       ArrayList<Integer>temp2=Better(arr2);
       for(Integer i:temp2)
       {
          System.out.print(i+" ");
       }
       System.out.println();

       int arr3[]={1,1,1,3,3,2,2,2};
       ArrayList<Integer>temp3=Optimal(arr3);
       for(Integer i:temp3)
       {
          System.out.print(i+" ");
       }
       System.out.println();
    }
    static ArrayList<Integer> Brute(int arr1[])
    {
        ArrayList<Integer>temp=new ArrayList<>();
        for(int i=0;i<arr1.length;i++)
        {
            int ctr=0;
            for(int j=0;j<arr1.length;j++)
            {
                if(arr1[i]==arr1[j])
                {
                    ctr++;
                }
            }
            if(ctr>arr1.length/3)
            {
                if(!temp.contains(arr1[i]))
                {
                    temp.add(arr1[i]);
                }
            }
        }
        return temp;
    }
    static ArrayList<Integer> Better(int arr[])
    {
        Map<Integer,Integer>temp=new HashMap<>();
        ArrayList<Integer>result=new ArrayList<>();
        for(int i:arr)
        {
            temp.put(i, temp.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer,Integer>i:temp.entrySet())
        {
            if(i.getValue()>arr.length/3)
            {
                result.add(i.getKey());
            }
        }
        return result;
    }
    static ArrayList<Integer> Optimal(int arr[])
    {
        ArrayList<Integer>temp=new ArrayList<>();
        int ctr1=0,ctr2=0;
        int element1=0,element2=0;
        for(int i=0;i<arr.length;i++)
        {
            if(ctr1==0)
            {
                ctr1=1;
                element1=arr[i];
            }
            else if(ctr2==0)
            {
                ctr2=1;
                element2=arr[i];
            }
            else if(element1==arr[i])
            {
                ctr1++;
            }
            else if(element2==arr[i])
            {
                ctr2++;
            }
            else 
            {
                ctr1--;
                ctr2--;
            }
        }
        ctr1=0;ctr2=0;
        for(int i=0;i<arr.length;i++)
        {
            if(element1==arr[i])
            {
                ctr1++;
            }
            else if(element2==arr[i])
            {
                ctr2++;
            }
        }
        if(ctr1>arr.length/3)
        {
             temp.add(element1);
        }
        if(ctr2>arr.length/3)
        {
            temp.add(element2);
        }
        return temp;
    }
}
*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//----------------------------------6.Binary Search-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//1.Binary Search to find X in sorted array
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,5,7},target=5;
        System.out.println(BinarySearch(arr,target));
    }
    static int BinarySearch(int arr[],int target)
    {
        int left=0,right=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]<target)
            {
                left=mid+1;
            }
            else if(arr[mid]>target)
            {
                right=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
*/

//2.Implement Floor
/* 
public class Main 
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,9};
        int target=5;
        System.out.println(Floor(arr, target)); //3
    }
    static int Floor(int arr[],int target)
    {
        int left=0,right=arr.length-1,ans=-1;
        while (left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]<=target)
            {
                ans=mid;
                left=mid+1;
            }   
            else if(arr[mid]>target)
            {
                right=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return ans;
    }
}
*/

//3.Implement Ceils
/* 
public class Main 
{   
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,6,7,9};
        int target=5;
        System.out.println(Ceil(arr, target)); //4
    }
    static int Ceil(int arr[],int target)
    {
        int left=0,right=arr.length-1,ans=-1;
        while (left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]<target)
            {
                left=mid+1;
            }   
            else if(arr[mid]>=target)
            {
                ans=mid;
                right=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return ans;
    }
}
*/

//4.Implement LowerBound (arr[0]>=target)
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr[]={3,5,8,15,19};
        int target=9;   
        System.out.println(LowerBound(arr, target)); //3
    }
    static int LowerBound(int arr[],int target)
    {
        int left=0,right=arr.length-1,ans=arr.length;
        while(left<=right)
        {
            int mid=left+(right-left);
            if(arr[mid]>=target)
            {
                ans=mid;
                right=mid-1;
            }
            else 
            {
                left=mid+1;
            }
        }
        return ans;
    }
}
*/

//5.Implement UpperBound (arr[0]>target)
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        //         0 1 2 3  4  5
        int arr[]={3,5,8,8,15,19};
        int target=8;   
        System.out.println(UpperBound(arr, target)); //4
    }
    static int UpperBound(int arr[],int target)
    {
        int left=0,right=arr.length-1,ans=arr.length;
        while(left<=right)
        {
            int mid=left+(right-left);
            if(arr[mid]>target)
            {
                ans=mid;
                right=mid-1;
            }
            else 
            {
                left=mid+1;
            }
        }
        return ans;
    }
}
*/


//6.Search Insert Position I
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        //         0 1 2 3
        int arr[]={1,2,4,7};
        int target=6;
        System.out.println(LowerBound(arr, target)); //3
    }
    static int LowerBound(int arr[],int target)
    {
        int left=0,right=arr.length-1,ans=arr.length;
        while(left<=right)
        {
            int mid=left+(right-left);
            if(arr[mid]>=target)
            {
                ans=mid;
                right=mid-1;
            }
            else 
            {
                left=mid+1;
            }
        }
        return ans;
    }
}
*/

//7.Search Insert Position II
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        //         0 1 2 3 4
        int arr[]={1,2,4,6,7};
        int target=6;
        System.out.println(UpperBound(arr, target)); //4
    }
    static int UpperBound(int arr[],int target)
    {
        int left=0,right=arr.length-1,ans=arr.length;
        while(left<=right)
        {
            int mid=left+(right-left);
            if(arr[mid]>target)
            {
                ans=mid;
                right=mid-1;
            }
            else 
            {
                left=mid+1;
            }
        }
        return ans;
    }
}
*/

//8.First and Last Occurrences in Array
/* 
public class Main 
{
    public static void main(String[] args) {
        //1.Brute
        int arr1[]={2,4,6,8,8,8,11,13};
        int target1=8;
        Brute(arr1, target1); // 3 5

        //2.Better
        int arr2[]={2,4,6,8,8,8,11,13};
        int target2=8;
        Better(arr1, target2);// 3 5



    }
    static void Brute(int arr[],int target)
    {
        int firstIndex=-1,lastIndex=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                if(firstIndex==-1){firstIndex=i;}
                lastIndex=i;
            }
        }
        System.out.println(firstIndex+" "+lastIndex);
        return;
    }
    static void Better(int arr[],int target)
    {
        System.out.println(Bound(arr, target, true)+" "+(Bound(arr, target, false)-1));
    }
    static int Bound(int arr[],int target,boolean LowerOrUpper)
    {
        int left=0,right=arr.length-1,ans=-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(LowerOrUpper)
            {
                if(arr[mid]>=target)
                {
                    ans=mid;
                    right=mid-1;
                }
                else
                {
                    left=mid+1;
                }
            }
            else
            {
                if(arr[mid]>target)
                {
                    ans=mid;
                    right=mid-1;
                }
                else
                {
                    left=mid+1;
                }
            }
        }
        return ans;
    }
}
*/

//9. Search Element in Rotated Sorted Array -I
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr1[]={7,8,9,1,2,3,4,5,6};
        int target1=1;
        System.out.println(Brute(arr1, target1)); //3

        int arr2[]={7,8,9,1,2,3,4,5,6};
        int target2=1;
        System.out.println(Optimal(arr2, target2)); //3
    }
    static int Brute(int arr1[],int target)
    {
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
    static int Optimal(int arr[],int target)
    {
        int left=0,right=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if(arr[left]<=arr[mid])
            {
                if(arr[left]<=target && target<=arr[mid])
                {
                    right=mid-1;
                }
                else
                {
                    left=mid+1;
                }
            }
            else
            {
                if(arr[mid]<=target && target<=arr[right])
                {
                    left=mid+1;
                }
                else
                {
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}
*/

//10.Minimum in Rotated Sorted Array
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr1[]={5,4,6,7,0,1,2};   
        System.out.println(Brute(arr1)); //4

        int arr2[]={5,4,6,7,0,1,2};   
        System.out.println(Optimal(arr2)); //0
    }
    static int Brute(int arr[])
    {
        int min=9999,index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
                index=i;
            }
        }
        return index;
    }
    static int Optimal(int arr[])
    {
        int left=0,right=arr.length-1;
        int ans=99999;
        while (left<=right) 
        {
            int mid=left+(right-left)/2;
            if(arr[left]<=arr[mid])
            {
                ans=Math.min(ans,arr[left]);
                left=mid+1;
            }
            else
            {
                ans=Math.min(ans,arr[mid]);
                right=mid-1;
            }
        }
        return ans;
    }
}
*/

//11.Single Element in Sorted Array
/* 
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        int arr1[]={1,1,2,2,3,3,4,5,5,6,6};
        System.out.println(Brute(arr1)); //4

        int arr2[]={1,1,2,2,3,3,4,5,5,6,6};
        System.out.println(Better(arr2)); //4

        
        int arr3[]={1,1,2,2,3,3,4,5,5,6,6};
        System.out.println(Better(arr3)); //4
    }
    static int Brute(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int ctr=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    ctr++;
                }
            }
            if(ctr==1)
            {
                return arr[i];
            }
        }
        return -1;
    } 

    static int Better(int arr[])
    {
        Map<Integer,Integer>temp=new HashMap<>();
        for(int i:arr)
        {
            temp.put(i, temp.getOrDefault(i, 0)+1);
        }
        for (Map.Entry<Integer, Integer> it : temp.entrySet()) 
        {
            if (it.getValue()==1)
            {
                return it.getKey();
            }
        }
        return -1;
    }
    static int Optimal(int arr[])
    {
        //0 1 2 3 4 5 6 7 8 9 10
        //1 1 2 2 3 3 4 5 5 6 6
        //elimination for mid-1,mid
        //(even,odd) ===> element is on right half, x left
        //(odd,even) ===> element is on left half, x right
        int len=arr.length;
        if(len==1)
        {
            return arr[0];
        }
        if(arr[0]!=arr[1])
        {
            return arr[0];
        }
        if(arr[len-1]!=arr[len-2])
        {
            return arr[len-2];
        }
        int left=1,right=len-2;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1])
            {
                return arr[mid];
            }
            if( ( mid%2==1 && arr[mid]==arr[mid-1] ) || ( mid%2==0 &&arr[mid]==arr[mid+1] )  )
            {
                left=mid+1;
            }
            else
            {
                right=mid+1;
            }
        }
        return -1;

    }
}
*/

//12.find peak element
//arr[]={1,2,3,4,5,6,7,8,5,1} ans=8
//arr[]={1,2,1,3,5,6,4} ans=2,6
//arr[]={1,2,3,4,5} ans=5
//arr[]={5,4,3,2,1} ans=5
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr1[]={1,2,1,3,5,6,4}; //ans=2,6
        System.out.println(Brute(arr1)); //index=1

        int arr2[]={1,2,1,3,5,6,4}; //ans=2,6
        System.out.println(Better(arr2)); //index=5

        int arr3[]={1,2,1,3,5,6,4}; //ans=2,6
        System.out.println(Optimal(arr3)); //index=5
    }
    static int Brute(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if( (i==0 || arr[i-1]<arr[i]) && (i==arr.length-1 || arr[i]>arr[i+1]) )
            {
                return i;
            }
        }
        return -1;
    }
    static int Better(int arr[])
    {
        int start=0,end=arr.length-1;
        while(start<end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
        }
        return start;
    }
    static int Optimal(int arr[])
    {
        int len=arr.length;
        if(len==1){return 0;}
        if(arr[0]>arr[1]){return 0;}
        if(arr[len-1]>arr[len-2]) {return len-1;} 
        int left=1,right=len-2;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(arr[mid]>arr[mid-1])
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return -1;
    }
}
*/

//13. Finding Sqrt of a number using Binary Search by return floor value
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println(Brute(27)); //5
        System.out.println(Better(27)); //5
        System.out.println(Optimal(27)); //5
    }
    static int Brute(int number)
    {
        int ans=1;
        for(int i=1;i<=number;i++)
        {
            if(i*i <=number)
            {
                ans=i;
            }
            else
            {
                break;
            }
        }
        return ans;
    }
    static int Better(int number)
    {
        int ans=1;
        for(int i=number;i>=1;i--)
        {
            if(i*i<=number)
            {
                ans=i;
                break;
            }
        }
        return ans;
    }
    static int Optimal(int number)
    {
        int ans=1;
        int left=0,right=number;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(mid*mid<=number)
            {
                ans=mid;
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return ans;
    }
}
*/

//14.find nth root of M
//N=3 M=27 ans=3 (3*3*3)
//N=4 M=69 ans=-1 (out of the number)
/*
public class Main 
{
    public static void main(String[] args)
    {
        int N1=3,M1=27; 
        System.out.println(Brute(N1, M1)); //3

        int N2=3,M2=27; 
        System.out.println(Brute(N2, M2)); //3
    }
    static int Brute(int N,int M)
    { 
        for(int i=1;i<=M;i++)
        {
            int j=1,pow=1;
            while(j<=N)
            {
                pow=pow*i;
                j++;
            }
            if(pow==M)
            {
                return i;
            }
            else if(pow>M)
            {
                return -1;
            }
        }
        return -1;
    }
    static int Optimal(int N,int M)
    {
        int left=0,right=M;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(Math.pow(mid,N)==M)
            {
                return mid;
            }
            else if(Math.pow(mid,N)<M)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return -1;
    }
}
*/

//15.Koko Eating Bananas 
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int v1[] = {3, 6, 7, 11};
        int h1 = 8;  
        System.out.println(Brute(v1, h1)); //4

        int v2[] = {3, 6, 7, 11};
        int h2 = 8;  
        System.out.println(Optimal(v2, h2)); //4


    }
    static int Brute(int arr[],int h)
    {
        int end=max(arr);
        for(int i=1;i<=end;i++)
        {
            int temp=CalculateTotalHours(arr, i);
            if(temp<=h)
            {
                return i;
            }
        }
        return -1;
    }
    static int max(int arr[])
    {
        int max=0;
        for(int i:arr)
        {
            if(max<i)
            {
                max=i;
            }
        }
        return max;
    }
    static int CalculateTotalHours(int arr[],int hours)
    {
        int total=0;
        for(int i=0;i<arr.length;i++)
        {
            total+=Math.ceil((double)(arr[i])/(double)(hours));
        }
        return total;
    }

    static int Optimal(int arr[],int h)
    {
        int left=1,right=max(arr);
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            int temp=CalculateTotalHours(arr, mid);
            if(temp<=h)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return left;
    }
}
*/

//16.Minimum days to make M bouquets 
//M-No.of Bouquets
//K-adjacent flowers required
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        
        int BloomDay1[]={7,7,7,7,13,11,12,7};
        //12-----------> |,|,|,|, |, |, |,|
        //11-----------> |,|,|,|, X, |, X,|
        //7------------> |,|,|,|, X, X, X,1
        int M1=2,K1=3;
        System.out.println(Brute(BloomDay1, M1, K1));//12

        int BloomDay2[]={7,7,7,7,13,11,12,7};
        int M2=2,K2=3;
        System.out.println(Optimal(BloomDay2, M2, K2));//12

    }
    static int Brute(int BloomDay[],int M1,int K1)
    {
        for(int i=min(BloomDay);i<=max(BloomDay);i++)
        {
            if(FormBouqutesIn_N_Day(BloomDay, i, M1, K1))
            {
                return i;
            }
        }   
        return -1;
    }
    static boolean FormBouqutesIn_N_Day(int arr[],int day,int m,int k)
    {
        int ctr=0,No_oF_Bouquts=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=day)
            {
                ctr++;
            }
            else
            {
                No_oF_Bouquts+=(ctr/k);
                ctr=0;
            }
        }
        No_oF_Bouquts+=(ctr/k);
        return No_oF_Bouquts>=m;
    }
    static int Optimal(int BloomDay[],int M1,int K1)
    {
        int left=min(BloomDay),right=max(BloomDay);
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(FormBouqutesIn_N_Day(BloomDay,mid ,M1, K1))
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return left; 
    }


    static int min(int arr[])
    {
        int min=99999;
        for(int i:arr)
        {
            if(min>i)
            {
                min=i;
            }
        }
        return min;
    }
    static int max(int arr[])
    {
        int max=0;
        for(int i:arr)
        {
            if(max<i)
            {
                max=i;
            }
        }
        return max;
    }
    

}

*/

//17.Find the Smallest Divisor Given a Threshold 
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr1[]={1,2,5,9},threshold1=6;    
        System.out.println(Brute(arr1, threshold1)); //5

     //   int arr2[]={1,2,5,9},threshold2=6;    
        int arr2[]={44,22,33,11,1},threshold=5;
        System.out.println(Optimal(arr2, threshold));//5
    }

    static int max(int arr[])
    {
        int max=0;
        for(int i:arr)
        {
            if(max<i)
            {
                max=i;
            }
        }
        return max;
    }
    
    static int Brute(int arr[],int threshold)
    {
        int max=max(arr);
        for(int i=1;i<=max;i++)
        {
            int sum=0;
            for(int j:arr)
            {
                sum=sum+(int)(Math.ceil( (double)(j)/(double)(i) ));
            }
            if(sum<=threshold)
            {
                return i;
            }
        }
        return -1;
    }
    static int Optimal(int arr[] ,int threshold)
    {
        int left=1,right=max(arr);
        while(left<=right)
        {
            int mid=left+(right-left);
            if(sumOfGivenRange(arr, mid)<=threshold)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return left;
    }
    static int sumOfGivenRange(int arr[],int division)
    {
        int sum=0;
        for(int i:arr)
        {
            sum+=Math.ceil(  (double)(i)/(double)(division)  );
        }
        return sum;
    }
}
*/

//18.Capacity To Ship Packages Within D Days
//Capacity Range between (max - sum of arr)
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int weights1[] = {1,2,3,4,5,6,7,8,9,10},days1=5; 
        System.out.println(Brute(weights1, days1));//15

        int weights2[] = {1,2,3,4,5,6,7,8,9,10},days2=5; 
        System.out.println(Optimal(weights2, days2));//15
    }
    static int Brute(int weights[],int days)
    {
        for(int i=max(weights);i<=sum(weights);i++)
        {
            if(SetCapacity(weights, i)<=days)
            {
                return i;
            }
        }
        return -1;
    }
    static int SetCapacity(int arr[],int Capacity)
    {
        int days=1,ship=0;
        for(int i:arr)
        {
            if(ship+i>Capacity)
            {
                days++;
                ship=i;
            }
            else
            {
                ship+=i;
            }
        }
        return days;
    }

    static int Optimal(int arr[],int Capacity)
    {
        int left=max(arr),right=sum(arr);
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(SetCapacity(arr,mid)<=Capacity)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return left;
    }

    static int sum(int arr[])
    {
        int sum=0;
        for(int i:arr)
        {
            sum+=i;
        }
        return sum;
    }
    static int max(int arr[])
    {
        int max=0;
        for(int i:arr)
        {
            if(max<i)
            {
                max=i;
            }
        }
        return max;

    }

} 
*/

//19.kth missing number
/* 
public class Main 
{
    public static void main(String[] args)
    {
        int arr1[]={2,3,4,7,11},k1=5;
        System.out.println(Brute(arr1, k1)); //9
    }
    static int Brute(int arr[],int k)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=k)
            {
                k++;
            }
            else
            {
                return k;
            }
        }
        return -1;
    }
}
*/

//20.painter's partition
//arr-wall
//k-no.of painters
/*
public class Main 
{
    public static void main(String[] args) {
        int arr1[]={10,20,30,40},k1=2;
        // [10]  [20,30,40]   -- 10,90 ---> 90|
        // [10,20] [30,40]    -- 30,70 ---> 70|--->60
        // [10,20,30] [40]    -- 60,40 ---> 60|
        System.out.println(Brute(arr1, k1)); //60
    }
    static int Brute(int arr[],int painters)
    {
        int min=Integer.MAX_VALUE;
        int sumE=0,sumS=0;
        for(int i:arr)
        {
            sumE+=i;
        }
        for(int i=0;i<arr.length;i++)
        {
            sumS=sumS+arr[i];
            sumE=sumE-arr[i];
            int max=Math.max(sumS, sumE);
            if(min>max)
            {
                min=max;
            }

        }
        return min;
    }
}
*/

//21.Median of 2 sorted arrays
/* 
public class Main 
{
    public static void main(String[] args)
    {
        int nums1[] = {1,3}, nums2[] = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));   //2.0
    }
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int s=0,e=0,arr[]=new int[nums1.length+nums2.length],ctr=0;
        while(s<nums1.length&&e<nums2.length)
        {
            if(nums1[s]<nums2[e])
            {
                arr[ctr++]=nums1[s];
                s++;
            }
            else if(nums1[s]>nums2[e])
            {
                arr[ctr++]=nums2[e];
                e++;
            }
            else
            {
                arr[ctr++]=nums1[e];
                e++;
                s++;
            }
        }
        while(s<nums1.length)
        {
            arr[ctr++]=nums1[s++];
        }
        while(e<nums2.length)
        {
            arr[ctr++]=nums2[e++];
        }
        int len=arr.length;
        if(arr.length%2==0)
        {
            return ((double)(arr[len/2]+arr[len/2-1])/2);
        }
        else
        {
            return ((double)(arr[len/2]));
        }
    }
}
*/
//22.Search in a 2D matrix
/* 
public class Main 
{
    public static void main(String[] args) 
    {
         int arr1[][]=
         {
            {3,4,7,9},
            {12,13,16,18},
            {20,21,23,29}
         };
         int target=23;
         int arr[]=Brute(arr1, target); // 2 2
         System.out.println(arr[0]+" "+arr[1]); // true

         System.out.println(Optimal(arr1, target));
    }
    static int[] Brute(int arr[][],int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static boolean Optimal(int arr[][],int target)
    {
        int left=0,right=arr.length*arr[0].length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            int row=mid/arr[0].length,col=mid%arr[0].length;
            if(arr[row][col]==target)
            {
                return true;
            }
            else if(arr[row][col]<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return false;   
    }
}
*/

//23.Row with maximum number of 1s
/* 
public class Main {

    public static void main(String[] args) 
    {
        int arr[][]=
        {
            {0,0,1,1,1},
            {0,0,0,0,0},
            {0,1,1,1,1},
            {0,0,0,0,0},
            {0,1,1,1,1}
        };
        System.out.println(Brute(arr)); // 2
    }
    static int Brute(int arr[][])
    {
        int max=-1,index=-1;
        for(int i=0;i<arr.length;i++)
        {
            int ctr=0;
            for(int j=0;j<arr[0].length;j++)
            {
                ctr+=arr[i][j];
            }
            if(ctr>max)
            {
                max=ctr;
                index=i;
            }
        }
        return index;
    }
}
*/





///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//----------------------------------7.Stacks And Queues--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//1.stacks FILO LIFO
/* 
import java.util.Stack;
public class Main 
{
    public static void main(String[] args) {
        Stack<Integer> stack1=new Stack<>();
        stack1.push(11);
        stack1.push(12);
        stack1.push(13);
        stack1.push(14);
        System.out.println(stack1.pop()); //14
        for(Integer i:stack1)
        {
            System.out.print(i+" ");//11 12 13
        }
    }
}
*/
//2.Queues FIFO LILO
/* 
import java.util.LinkedList;
import java.util.Queue;
public class Main 
{
    public static void main(String[] args) 
    {
        Queue<Integer>queue=new LinkedList<>();    
        queue.add(11);
        queue.add(12);
        queue.add(13);
        queue.add(14);
        System.out.println(queue.remove()); //11
        for(Integer i:queue)
        {
            System.out.print(i+" "); //12 13 14
        }
    }
}
*/

//3.Dequeues insert and remove both side
/* 
import java.util.ArrayDeque;
import java.util.Deque;
public class Main 
{
    public static void main(String[] args) 
    {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(11);
        deque.addFirst(12);
        deque.addLast(13);
        deque.add(123);
        deque.add(124);
        deque.add(125);

        for(Integer i:deque)
        {
            System.out.print(i+" ");//12 11 13 123 124 125 
        }
        System.out.println();

        System.out.println(deque.remove()); //12
        System.out.println(deque.removeFirst());//11
        System.out.println( deque.removeLast());//126

        for(Integer i:deque)
        {
            System.out.print(i+" ");//13 123 124
        }
        System.out.println();
    }
}
*/

//4.implementation of stack using array (FILO - LIFO)
/*
import java.util.*;
class Stack
{
    public int data[];
    public static final int DEAULT_SIZE=10;
    public  int index=-1;
    public int size=0;
    Stack()
    {
        this.size=DEAULT_SIZE;
        this.data=new int[DEAULT_SIZE];
    }
    public Stack(int Size)
    {
        this.size=Size;
        this.data=new int[Size];
    }
    public void push(int item)
    {
        if(index+1==size)
        {
            System.out.println("----Stack Overflow---");
            return;
        }
        else
        {
            data[++index]=item;
        }
    }
    public int pop()
    {
        if(index>=0)
        {
            return data[index--];
        }
        else
        {
            System.out.println("----Stack is Empty----");
            return -1;
        }
        
    }
    public void Show()
    {
        for(int i=0;i<=index;i++)
        {
            System.out.print(data[i]+" ");
        }
        return;
    }
    public boolean isEmpty()
    {
        if(index==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int Size()
    {
        return index+1;
    }
    public int top()
    {
        return data[index];
    }

}
public class Main 
{
    public static void main(String[] args)
    {
        Stack s1 = new Stack(5);
        s1.push(111);
        s1.push(222);
        s1.push(333);
        s1.push(444);
        s1.push(555);
        System.out.println(s1.top());       //555
        System.out.println(s1.Size());     // 5
        System.out.println(s1.isEmpty()); // false
        s1.push(666);
        s1.push(777);
        s1.push(888);                     //----Stack Overflow-------
        System.out.println(s1.pop());     // 555
        s1.Show();                        //111 222 333 444
        System.out.println();
        System.out.println(s1.pop());     //444
        System.out.println(s1.pop());     // 333
        System.out.println(s1.pop());     // 222
        System.out.println(s1.pop());     // 111
        System.out.println(s1.pop());     //  -1   ----Stack is Empty----

        System.out.println(s1.isEmpty()); // true
        System.out.println(s1.Size());    // 0


    }
}
*/


//5.implementation of Queue using array (FIFO - LILO)
/* 
//1 2 3 4 5 6
class queue
{
    public int arr[];
    public int start=0;
    public int end=-1;
    public int size=0;
    queue()
    {
        this.arr=new int[5];
        this.size=5;
    }
    queue(int size)
    {
        this.arr=new int[size];
        this.size=size;
    }
    public void PUSH(int item)
    {
        if((end+1)==size)
        {
            System.out.println("----Queue is Full-----");
            return;
        }
        else
        {
            arr[++end]=item;
        }
    }
    public int POP()
    {
        if (start<=end)
        {
            return arr[start++];
        }
        else
        {
            System.out.println("----Queue is empty----");
            return -1;
        }
    }
    public int PEEK()
    {
        if(start!=-1)
        {
            return arr[start];
        }
        else
        {
            return -1;
        }
    }
    public int size()
    {
        return end+1;
    }
    public void show()
    {
        if(start!=-1&&end!=-1 && start<=end)
        {
            for(int i=start;i<=end;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }  

    }
}
public class Main
{
    public static void main(String[] args) {
        queue q = new queue();
        q.PUSH(1);
        q.PUSH(2);
        q.PUSH(3);
        q.PUSH(4);
        System.out.println(q.PEEK()); //1
        System.out.println(q.size()); //4
        q.show();                     // 1 2 3 4
        q.PUSH(6);    
        q.PUSH(7);               // ----Queue is Full-----
        q.show();                     //1 2 3 4 6
        q.POP();
        q.POP();
        q.POP();
        q.POP();
        q.POP();
        q.POP();                        //----Queue is empty----
        q.show();                       // 
    }
}
*/

//6.implement stack using Queues
//7.implement Queues using stack

//8.Check for Balanced Paranthesis
/* 
import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
        String str="[]{([])}";
        System.out.println(Optimal(str));
    }
    static boolean Optimal(String str)
    {
        Stack arr = new Stack();
        for(char i:str.toCharArray())
        {
            if(i=='('||i=='{'||i=='[')
            {
                arr.push(i);
            }
            else
            {
                if(arr.isEmpty())
                {
                    return false;
                }
                char ch=(char)arr.pop();
                if( (i=='}'&&ch=='{') || (i==']'&&ch=='[') || (i==')'&&ch=='(') )
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }
        }
        return arr.isEmpty();
    }
}
*/

//9.Next Greater Element (NO CRICULAR)
/* 
import java.util.Stack;
public class Main 
{
    public static void main(String[] args) {
        int arr1[]={3,10,4,2,1,2,6,1,7,2,9};
                  //10 -1 6 6 2 6 7 7 9 9 -1 
        int temp1[]=Brute(arr1);
        for(int i:temp1)
        {
            System.out.print(i+" ");//10 -1 6 6 2 6 7 7 9 9 -1 
        }

        System.out.println();

        int arr2[]={3,10,4,2,1,2,6,1,7,2,9};
        int temp2[]=Optimal(arr2);
        for(int i:temp1)
        {
            System.out.print(i+" ");//10 -1 6 6 2 6 7 7 9 9 -1 
        }

        System.out.println();

        int arr3[]={4,12,5,3,1,2,5,3,1,2,4,6};
        int temp3[]=Optimal(arr3);
        for(int i:temp3)
        {
            System.out.print(i+" ");//12 -1 6 5 2 5 6 4 2 4 6 -1 
        }

    }
    static int[] Brute(int arr[])
    {
        int NGE[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int flag=0;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[i])
                {
                    flag=-111;
                    NGE[i]=arr[j];
                    break;
                }
            }
            if(flag==0)
            {
                NGE[i]=-1;
            }
        }
        return NGE;
    }
    static int[] Optimal(int arr[])
    {
        Stack <Integer> temp1 = new Stack<>();
        int len=arr.length;
        int temp2[] = new int[len];

        for(int i=len-1;i>=0;i--)
        {
            while (temp1.isEmpty()==false&&temp1.peek()<=arr[i])
            {
                temp1.pop();    
            }
            if(temp1.isEmpty()==false)
            {
                temp2[i]=temp1.peek();
            }
            else
            {
                temp2[i]=-1;
            }
            temp1.push(arr[i]);
        }
        return temp2;
    }
}
*/


//10.Next Greater Element (WITH CRICULAR)
/* 
import java.util.Stack;
public class Main 
{
    public static void main(String[] args) 
    {
        int arr3[]={2,10,12,1,11};
        int temp3[]=Optimal(arr3);
        for(int i:temp3)
        {
            System.out.print(i+" ");// 10 12 -1 11 12
        }
    }
    static int[] Optimal(int arr[])
    {
        Stack <Integer> temp1 = new Stack<>();
        int len=arr.length;
        int temp2[] = new int[len];
        // 2,10,12,1,11-2,10,12,1,11
        for(int i=len*2-1;i>=0;i--)
        {
            while (temp1.isEmpty()==false&&temp1.peek()<=arr[i%len])
            {
                temp1.pop();    
            }
            if(i<len)
            {
                if(temp1.isEmpty()==false)
                {
                    temp2[i]=temp1.peek();
                }
                else
                {
                    temp2[i]=-1;
                }
            } 
            temp1.push(arr[i%len]);
        }
        return temp2;
    }
}
*/
//11.trapping Rainwater
/* 
import java.util.ArrayList;
public class Main 
{
    public static void main(String[] args) 
    {
         // time Complexity : O(N)+O(N)+O(N)
         // space Complexity: O(N)
         int arr1[]={0,1,0,2,1,0,1,3,2,1,2,1};
         ArrayList<Integer>temp1=Brute(arr1);
         for(Integer i: temp1)
         {
            System.out.print(i+" ");
         }
         System.out.println();

         int arr2[]={0,1,0,2,1,0,1,3,2,1,2,1};
         System.out.println(Optimal(arr2));

    }
    static ArrayList<Integer> Brute(int arr[])
    {
        int prefix[]=new int[arr.length];
        int suffix[]=new int[arr.length];
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
            prefix[i]=max;
        }
        max=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
            suffix[i]=max;
        }
        ArrayList<Integer>temp=new ArrayList<>();
        for(int i=1;i<arr.length-1;i++)
        {
            int t=Math.min(prefix[i],suffix[i])-arr[i];
            temp.add(t);
        }
        return temp;
    }
    static int Optimal(int[] height) 
    {
        int n = height.length;
        int left = 0, right = n - 1;
        int res = 0;
        int maxLeft = 0, maxRight = 0;
        while (left <= right) 
        {
            if (height[left] <= height[right])
            {
                if (height[left] >= maxLeft) 
                {
                    maxLeft = height[left];
                } else 
                {
                    res += maxLeft - height[left];
                }
                left++;
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    res += maxRight - height[right];
                }
                right--;
            }
        }
        return res;
    }
}
*/

//12.Remove K digts using monotonic stack algorithm
/* 
import java.util.Stack;

public class Main 
{
    public static void main(String[] args) 
    {
        String str="1432219";
        int remove_K_digit=3;
        Stack<Character> stack = new Stack<>();
        int removecount=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(stack.isEmpty())
            {
                stack.add(ch);
            }
            else
            {
                while(removecount<remove_K_digit && !stack.isEmpty() && stack.peek() > ch )
                {
                    stack.pop();
                    removecount++;
                }
                stack.push(ch);
            }
        }
        while(removecount<remove_K_digit && !stack.isEmpty())
        {
            stack.pop();
            removecount++;
        }
        str="";
        while(!stack.isEmpty())
        {
            str=stack.pop()+str;
        }
        int nonzeroIndex=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!='0')
            {
                break;
            }
            nonzeroIndex++;
        }
        String result="";
        for(int i=nonzeroIndex;i<str.length();i++)
        {
            result+=str.charAt(i);
        }
        if(result=="")
        {
            System.out.println("0");
        }
        else
        {
            System.out.println(result);
        }
    }
}
*/

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//----------------------------------8.Greedy Algoithm-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//1.assign cookies
//greed -- N children
//s     -- parent to given cookies to children 
/* 
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        int greed1[]={1,5,3,3,4};
        int s[]={4,2,1,2,1,3};
        System.out.println(assign_cookies1(greed1, s)); //3
        System.out.println(assign_cookies2(greed1, s)); //3
        
    }
    static int assign_cookies1(int greed[],int s[])
    {
        Arrays.sort(greed); // 1 3 3 4 5 --- children
        Arrays.sort(s);     // 1 1 2 2 3 4   --- cookies
        int first_pointer=0,second_pointer=0;
        while(second_pointer<s.length)
        {
            if(greed[first_pointer]<=s[second_pointer])
            {
                first_pointer++;
            }
            second_pointer++;
        }
        return first_pointer;

    }
    static int assign_cookies2(int greed[],int s[])
    {
        Arrays.sort(greed); // 1 3 3 4 5 --- children
        Arrays.sort(s);     // 1 1 2 2 3 4   --- cookies
        int first_pointer=0,second_pointer=0;
        while( first_pointer<greed.length && second_pointer<s.length )
        {
            if(greed[first_pointer]<=s[second_pointer])
            {
                first_pointer++;
                second_pointer++;
            }
            else
            {
                second_pointer++;
            }
        }
        return first_pointer;

    }
}
*/
//2.lemonade change
//At a lemonade stand, each lemonade costs $5.
/* 
public class Main
{
    public static void main(String[] args)
    {
        int bills[]={5,5,5,10,20};
        System.out.println(lemonadeChange(bills)); //true
    }
    static boolean lemonadeChange(int[] bills)
    {
        int five=0,ten=0;
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
            {
                five++;
            }
            else if(bills[i]==10)
            {
                if(five>=1)
                {
                    five--;
                    ten++;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                if(five>=1&&ten>=1)
                {
                    five--;
                    ten--;
                }
                else if(five>=3)
                {
                    five=five-3;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;   
    }
} 
*/

//3.short job first(sjf)
//scheduling policy that select the waiting process with the smallest excution tume to excute next
/* 
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        int bt[]={4,3,7,1,2};
        int len=bt.length;
        System.out.println(SJF(bt, len)); //20
    }
    static int SJF(int arr[],int len)
    {
        //---------------------------
        //   4    3    7    1    2
        //   p4   p3   p5   p1   p2
        //  0------1------3------6-------10-------17
        //     p1     p2    p3      p4       p5
        Arrays.sort(arr); 
        // 1 2 3 4 7
        // 1 3 6 10
        int sum=0,waiting_time=0;
        for(int i=0;i<arr.length-1;i++)
        {
            sum+=arr[i]; // 1 3 6 10  
            waiting_time+=sum;//0+1 1+3 4+6 10+10  
        }
        return waiting_time;
    }
}
*/

//4.jump game
/* 
public class Main 
{
    public static void main(String[] args) {
        int arr1[]={2,3,1,1,4};
        System.out.println(JG1(arr1));// true
        int arr2[]={2,3,1,1,4};
        System.out.println(JG2(arr2));//true
    }
    
    static boolean JG1(int arr[])
    {
        int finalposition=arr.length-1;
        // {2,3,1,1,4};
        //  0 1 2 3 4
        for(int i=arr.length-2;i>=0;i--)
        {
            if(i+arr[i]>=finalposition)   4>=4 2+1>=3 1+3>=2 2+0>=2
            {
                finalposition=i;    fp=4  fp=3  fp=2  fp=2    f=0
            }
        }
        return finalposition==0;
    }
    static boolean JG2(int[] nums)
    {
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>max)
            {
                return false;
            }
            max=Math.max(max,nums[i]+i);
        }
        return true;
    }
}
*/

//5. job sequencing problem
/* 
public class Main 
{
    public static void main(String[] args) 
    {
            //  id       deadline         profit  
            //  6           2               80
            //  3           6               70          
            //  4           6               65
            //  2           5               60
            //  5           4               25
            //  8           2               22
            //  1           4               20
            //  7           2               10

            //  0  1  2  3  4  5   6   deadline
            // -1 -1 -1 -1 -1 -1  -1    arr for id 
            //     6                     2  -  6 
            //                     3     6  -  3
            //                  6        6  -  4
            //               2           5  -  2 
            //            5              4  -  5 
            //        8                  2  -  8
            //  1                        4  -  1
            //                           2  -  7 (space execited)
            //  1 3 8 5 2 6 3

    }
}
*/

//6.Meeting in one room
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int stating_time[]={0,3,1,5,5,8};
        int ending_time []={5,4,2,9,7,9};    
        sort(stating_time, ending_time);
        
        int ctr=1,end_time=ending_time[0];
        for(int i=1;i<ending_time.length;i++)
        {
            if(end_time<stating_time[i])
            {
                ctr++;
                end_time=ending_time[i];
            }
        }
        System.out.println(ctr); //4


    }
    static void sort(int s[],int e[])
    {
        for(int i=0;i<e.length-1;i++)
        {
            for(int j=0;j<e.length-i-1;j++)
            {
                if(e[j]>e[j+1])
                {
                    int temp=e[j];
                    e[j]=e[j+1];
                    e[j+1]=temp;
                    temp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
            }
        }
        return;
    }

}
*/

//7.Non Overlapping intervals
/* 
public class Main 
{
    public static void main(String[] args) {
        int intervals[][]=
        {
            {0,5},
            {3,4},
            {1,2},
            {5,9},
            {5,7},
            {7,9}
        };
        sort(intervals);
        int ctr=1,lasttime=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            if(lasttime<=intervals[i][0])
            {
                ctr++;
                lasttime=intervals[i][1];
                System.out.println(intervals[i][0]+" "+intervals[i][1]);
            }
        }
        System.out.println(ctr); // 4
        System.out.println(intervals.length-ctr); // 2
    }
    static void sort(int arr[][])
    {
        int len=arr.length;
        for(int i=0;i<len-1;i++)
        {
            for(int j=0;j<len-i-1;j++)
            {
                if(arr[j][1]>arr[j+1][1])
                {
                    int temp=arr[j][1];
                    arr[j][1]=arr[j+1][1];
                    arr[j+1][1]=temp;

                    temp=arr[j][0];
                    arr[j][0]=arr[j+1][0];
                    arr[j+1][0]=temp;
                }
            }
        }
    }
}
*/    

//8.minimum pf platform required for a railway
/* 
import java.util.Arrays;

public class Main 
{
    public static void main(String[] args)
    {
        int[] arr ={900,945,955,1100,1500,1800};
		int[] dep={920,1200,1130,1150,1900,2000};
        int len=arr.length;
        System.out.println(countPlatforms(len, arr, dep)); //3
        System.out.println(findPlatform(arr, dep, len));//3  
    }
    static int countPlatforms(int n,int arr[],int dep[])
    {
        int ans=1; //final value
        for(int i=0;i<=n-1;i++)
        {
            int count=1; // count of overlapping interval of only this   iteration
            for(int j=i+1;j<=n-1;j++)
            {
                if((arr[i]>=arr[j] && arr[i]<=dep[j]) || (arr[j]>=arr[i] && arr[j]<=dep[i]))
                {
                    count++;
                }
            }
            ans=Math.max(ans,count); //updating the value
        }
        return ans;
    }
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr); 
        Arrays.sort(dep); 
  
        int plat_needed = 1, result = 1; 
        int i = 1, j = 0; 
  
        while (i < n && j < n) { 
        
            if (arr[i] <= dep[j]) { 
                plat_needed++; 
                i++; 
            } 
  
            else if (arr[i] > dep[j]) { 
                plat_needed--; 
                j++; 
            } 
  
             if (plat_needed > result) 
                result = plat_needed; 
        } 
  
        return result; 
    }
}
*/

//9.valid parenthesis string
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        //Brute
        //time complexity  : O(3^n)
        //space complexity : O(n)
        String str="(*()";    
        System.out.println(Brute(str.toCharArray(), 0, 0));//true
        
        //Optimal
        System.out.println(Optimal(str));
    }   
    static boolean Brute(char str[],int i,int ctr)
    {
        if(ctr<0)
        {
            return false;
        }
        if(i==str.length)
        {
            return ctr==0;
        }
        if(str[i]=='(')
        {
            return Brute(str, i+1, ctr+1);
        }
        else if(str[i]==')')
        {
            return Brute(str, i+1, ctr-1);
        }
        else
        {   //              (            ||          )            ||      empty
            return Brute(str, i+1, ctr+1)||Brute(str, i+1, ctr-1) || Brute(str, i+1, ctr);
        }
    }
    static boolean Optimal(String s)
    {
        int leftMin = 0, leftMax = 0;
        for (char c : s.toCharArray()) 
        {
            if (c == '(')
            {
                leftMin++;
                 leftMax++;
            }
            else if (c == ')')
            {
                leftMin--;
                leftMax--;
            }
            else
            {
                leftMin--;
                leftMax++;
            }
            if (leftMax < 0) return false;
            if (leftMin < 0) leftMin = 0;
        }
        return leftMin == 0;
    }
}
*/


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//----------------------------------9.Bit manipulationa and maths-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//1.minimum bit flips to convert a number
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int num1=10,num2=7;
        // 10 ----> 1 0 1 0
        // 7  ----> 0 1 1 1
        //---------------------
        //          1 1 0 1
        int result=num1^num2;
        //counting set bit
        int ctr=0;
        while (result>0)
        {
            if(result%2==1)
            {
                ctr++;
            }
            result=result/2;
        }
        System.out.println(ctr); //3

        //2.method 2
        result=num1^num2;
        ctr=0;
        while(result>0)
        {
            if( (result&1)==1 )
            {
                ctr++;
            }
            result=result>>1;
        }

        System.out.println(ctr);//3
    }
}
*/

//2.powet set (print all subset)
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int nums[]={ 1, 2, 3};
        //           0  1  2

        //  2    1    0
        // ------------ 
        //  0    0    0      []
        //  0    0    1      [1]
        //  0    1    0      [2]
        //  0    1    1      [1,2]
        //  1    0    0      [3]
        //  1    0    1      [1,3]
        //  1    1    0      [2,3]
        //  1    1    1      [1,2,3]

        int len=nums.length;
        int subset=1<<len;
        
        for(int i=0;i<=subset-1;i++)
        {
            System.out.print("[");
            for(int j=0;j<=len-1;j++)
            {
                if( (i&(1<<j))!=0)
                {
                    System.out.print(nums[j]+" ");
                }
            }  
            System.out.println("]"); 
        }
    }
}
*/

//3.single number I
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr[]={1,2,2,33,33,1,2};
        int result=0;
        for(int i:arr)
        {
            result=result^i;
        }
        System.out.println(result);    //2
    }    
}
*/

//4.single number II
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr[]={1,1,1,2,2,2,77,5,5,5,3,3,3};
        int one=0,two=0;
        for(int i:arr)
        {
            one=(one^i) & ~(two);
            two=(two^i) & ~(one);
        }   
        System.out.println(one);//7
    }
}
*/

//5.xor of Nth number
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        // N=1            1     1
        // N=2           1^2    3
        // N=3                  0
        // N=4                  4
        
        // N=5                  1
        // N=6                  7
        // N=7                  0
        // N=8                  8
        
        // N=9                  1

        int N=9;
        if(N%4==1)
        {
            System.out.println(1);
        }
        else if(N%4==2)
        {
            System.out.println(N+1);
        }
        else if(N%4==3)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(N);
        }

    }
}
*/

//6.divide two integer without using Multiplication and Division Operators
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println(Brute(22, 3));  //7 
    }
    static int Brute(int dividend,int divisor)
    {
        int ans=0,ctr=0;
        while(ans<dividend)
        {
            ans=ans+divisor;
            if(ans>dividend)
            {
                break;
            }
            System.out.print(ans+"-");
            ctr++;
        }
        return ctr;
    }
}
*/
//maths
//7.print prime factor of a number
/* 
public class Main 
{
    public static void main(String[] args) {
        int num=35;// 5*7
        for(int i=1;i<=num;i++)
        {
            System.out.print(isPrime(i)==true && num%i==0 ?i+" ":""); // 5 7
        }
        PrintPrimeFactors(num);// 5 7

    }
    static void PrintPrimeFactors(int num)
    {
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.print(i+" ");
                while (num%i==0)
                {
                     num=num/i;   
                }
            }
        }
        if(num>1){System.out.println(num);}
        return;
    }
}
*/


//8.print divisors of a number
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int num=36;
        //1*36=36
        //2*18=36
        //3*12=36
        //4*9=36
        //6*6=36
        for(int i=1;i*i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.print(i+" ");
                if(num/i!=i)
                {
                    System.out.print(num/i+" ");//1 36 2 18 3 12 4 9 6 
                }
            }
        }
    }
}
*/
//9. Sieve of Eratosthenes given a number N,print all prime number till N
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int num=25;
        Brute(num); //2 3 5 7 11 13 17 19 23  
        System.out.println();

        Sieve_Eratosthenes(num);
    }
    static void Brute(int num)
    {
        for(int i=1;i<=num;i++)
        {
            System.out.print(Prime(i)==true?i+" ":"");
        }
    }
    static boolean Prime(int num)
    {
        if(num<=1){return false;}
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
    static int Sieve_Eratosthenes(int num)
    {
        int arr[]=new int[num],ctr=0;
        for(int i=2;i<num;i++)
        {
            arr[i]=1;
        }
        for(int i=2;i*i<=num;i++)
        {
            if(arr[i]==1)
            {
                for(int j=i*i;j<num;j=j+i)
                {
                    arr[j]=0;
                }
            }
        }
        for(int i=2;i<num;i++)
        {
            if(arr[i]==1)
            {
                System.out.print(i+" ");
                ctr++;
            }
        }
        return ctr;
    }
}
*/

//10.pow(x,e)
/* 
public class Main 
{
    public static void main(String[] args) {
        int x=3,e=3,ans=1;
        pow1(x, e, ans);//27
        pow2(x, e, ans);//27
       double x1 = 2.00000;
       int  n1 = 10;
       myPow(x1, n1);//1024.0
    }
    static void pow1(int x,int e,int ans)
    {
        while(e!=0)
        {
            ans=ans*x;
            e--;
        }
        System.out.println(ans);//100
    }
    static void pow2(int x,int e,int ans)
    {
        while (e>0)
        {
            if(e%2==1)
            {
                ans=ans*x;
                e--;
            }   
            else
            {
                x=x*x;
                e=e/2;
                
            }
        }   
        System.out.println(ans);
    }
    static void myPow(double x, int n) 
    {
        double ans = 1.0;
        long nn = n;
        if (nn < 0) nn = -1 * nn;
        while (nn > 0) 
        {
          if (nn % 2 == 1) 
          {
            ans = ans * x;
            nn = nn - 1;
          } 
          else 
          {
            x = x * x;
            nn = nn / 2;
          }
        }
        if (n < 0) ans = (double)(1.0) / (double)(ans);
        System.out.println(ans);
    }
}
*/

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//----------------------------------10.two pointer slinding window-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//1.maximum points for can obtain from cards (leedoce:1423)
//In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr[]={6,2,3,4,7,2,1,7,1};
        int k=4;
        //   6 2 3 4 -- 0       ==> 15
        //   6 2 3   -- 1       ==> 12
        //   6 2     -- 7 1     ==> 16 ==> max
        //   6       -- 7 1 1   ==> 15
        //   0       -- 2 1 7 1 ==> 11
        System.out.println(maximum(arr, k)); //16
    }
    static int maximum(int arr[],int k)
    {
        int leftsum=0,rightsum=0,maxsum=0;
        for(int i=0;i<k;i++)
        {
            leftsum=leftsum+arr[i];
        }
        maxsum=leftsum;
        int len=arr.length-1;
        for(int i=k-1;i>=0;i--)
        {
            leftsum=leftsum-arr[i];
            rightsum=rightsum+arr[len--];
            maxsum=Math.max(maxsum, leftsum+rightsum);
        }
        return maxsum;
    }
}
*/

//2.longest substring without repeating characters
/* 
import java.util.HashMap;
public class Main 
{
    public static void main(String[] args) 
    {
            String str1="cadbzabcd";
            Brute(str1);//Max String:cadbz Maxlength:5
            System.out.println(Optimal(str1)); //5
    }
    static void Brute(String str)
    {
        String maxstr="";
        int max=0;
        for(int i=0;i<str.length();i++)
        {
            String temp="";
            int arr[]=new int[52];
            for(int j=i;j<str.length();j++)
            {
                char ch=str.charAt(j);
                if(ch>='a'&&ch<='z')
                {
                    if(arr[ch-'a']==0)
                    {
                        temp+=ch;
                    }
                    else
                    {
                        break;
                    }
                    arr[ch-'a']++;
                }
                else
                {
                    if(arr[ch-'a']==0)
                    {
                        temp+=ch;
                    }
                    else
                    {
                        break;
                    }
                    arr[ch-'A'+26]++;
                }
            }
            if(max<temp.length())
            {
                max=temp.length();
                maxstr=temp;
            }
            System.out.println(temp);
        }
        System.out.println("Max String:"+maxstr+" Maxlength:"+max);
    }
    static int Optimal(String s)
    {
        // cadbzabcd
        // lr
        HashMap < Character, Integer > map = new HashMap < Character, Integer > ();
        int left = 0, right = 0;
        int n = s.length();
        int len = 0;
        while (right < n) 
        {
            if (map.containsKey(s.charAt(right))) 
            {
                left = Math.max(map.get(s.charAt(right)) + 1, left);
            }
            map.put(s.charAt(right), right); // key value
            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }
}
*/

//3.max consective ones III (same as longest subarray with at most k zeros)
/* 
public class Main 
{
    public static void main(String[] args)
    {
        int arr1[]={1,1,1,0,0,0,1,1,1,1,0};
        int k1=2;
        System.out.println(Brute(arr1, k1)); //6

        System.out.println(Optimal(arr1, k1));//6

    }
    static int Brute(int arr[],int k)
    {
        int len=arr.length;
        int max=0;
        for(int i=0;i<len;i++)
        {
            int zero=0;
            for(int j=i;j<len;j++)
            {
                if(arr[j]==0){zero++;}
                if(zero<=k)
                {
                    max=Math.max(max, j-i+1);
                }
                else
                {
                    break;
                }
            }
        }
        return max;
    }
    static int Optimal(int arr[],int k)
    {
        int left=0,right=0;
        int ZeroCount=0,Maxlen=0;
        while(right<arr.length)
        {
            if(arr[right]==0)
            {
                ZeroCount++;
            }
            if(ZeroCount<=k)
            {
                Maxlen=Math.max(Maxlen, right-left+1);
            }
            if(ZeroCount>k)
            {
                if(arr[left]==0)
                {
                    ZeroCount--;
                }
                left++;
            }
            right++;
        }
        return Maxlen;
    }
}
*/

//4.fruit into basket
// to store fruit into two basket with unique fruit
/* 
import java.util.*;
public class Main 
{
    public static void main(String[] args) {
        int fruit1[]={3,3,3,1,2,1,1,2,3,3,4};
        System.out.println(Brute(fruit1));//5
    }
    static int Brute(int arr[])
    {
        int max=0;
       for(int i=0;i<arr.length;i++)
       {
         Set<Integer>temp=new HashSet<>();
         for(int j=i;j<arr.length;j++)
         {
            temp.add(arr[j]);
            if(temp.size()<=2)
            {
                max=Math.max(max, j-i+1);
            }
            else
            {
                break;
            }
         }
       }   
       return max;
    }
}
*/

//5.Longest substring with at most k distinct characters
/* 
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        String str="aaabbbccd";
        int k=2;
        System.out.println(Optimal(str,k));   //6
    } 
    static int Optimal(String str,int k)
    {
        Map<Character,Integer>map=new HashMap<>();
        int left=0,right=0;
        int maxcount=0;
        while(right<str.length())
        {
            map.put(str.charAt(right),map.getOrDefault(str.charAt(right),0)+1);
            while (map.size()>k)
            {
                map.put( str.charAt(left),map.get(str.charAt(left))-1 ); 
                if(map.get(str.charAt(left))==0)
                {
                    map.remove(str.charAt(left));
                }  
                left++;
            }
            if(map.size()<=k)
            {
                maxcount=Math.max(maxcount,right-left+1);
            }
            right++;
        }
        return maxcount;
    }
}
*/

//6.Number of Substrings Containing All Three Characters
/* 
public class Main 
{
    public static void main(String[] args) 
    {
         String str="abcabc";  
        //  The substrings containing at least one occurrence of the characters a, b and c are
        //   "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" 
         System.out.println(Brute(str)); //10
    }
    static int Brute(String str)
    {
        int ctr=0;
        int last[]=new int[3];
        for(int i=0;i<3;i++)
        {
            last[i]=-1;
        }
        for(int i=0;i<str.length();i++)
        {
            last[str.charAt(i)-'a']=i;
            if(last[0]!=-1 && last[1]!=-1 && last[2]!=-1)
            {
                ctr=ctr+(1+Math.min(last[0],Math.min(last[1], last[2])));
            }
        }
        return ctr;
    }
}
*/

//7.Binary Subarrays With Sum is less than equal to goal
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr[]={1,0,0,1,1,0},goal=2;
        int left=0,right=0;
        int sum=0,ctr=0;

        while (right<arr.length) 
        {
            sum=sum+arr[right];
            while (sum>goal)
            {
                sum=sum-arr[left];
                left++;    
            }    
            ctr=ctr+(right-left+1);
            System.out.print(right-left+1+" ");//1 2 3 4 4 5 
            right++;
        }
        System.out.println();
        System.out.println(ctr);//19

    }
    
}
*/
//8.Count number of Nice subarrays in odd
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr[]={3,3,2,3,3,},k=3;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i]%2==0?0:1;
        }
        int left=0,right=0;
        int sum=0,ctr=0;

        while (right<arr.length) 
        {
            sum=sum+arr[right];
            while (sum>k)
            {
                sum=sum-arr[left];
                left++;    
            }    
            ctr=ctr+(right-left+1);
            System.out.print(right-left+1+" ");//1 2 3 4 4 
            right++;
        }
        System.out.println();
        System.out.println(ctr);//14
    }
}
*/


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//----------------------------------11.string------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//1.Longest Palindromic Sub-string (LeetCode 5)
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println(Longest_Palindromic("babad"));//bab
    }
    static String Longest_Palindromic(String str)
    {
        if (str.length() <= 1)
        return str;
  
      String LPS = "";
  
      for (int i = 1; i < str.length(); i++) {
  
        // Consider odd length
        int low = i;
        int high = i;
        while(str.charAt(low) == str.charAt(high)) {
          low--;
          high++;
  
          if (low == -1 || high == str.length())
            break;
        }
  
        String palindrome = str.substring(low+1, high);
        if (palindrome.length() > LPS.length()) {
          LPS = palindrome;
        }
  
        // Consider even length
        low = i-1;
        high = i;
        while(str.charAt(low) == str.charAt(high)) {
          low--;
          high++;
  
          if (low == -1 || high == str.length())
            break;
        }
  
        palindrome = str.substring(low+1, high);
        if (palindrome.length() > LPS.length()) {
          LPS = palindrome;
        }
      }
  
      return LPS;
    }
}
*/
//2.First unique character in a String
/*
public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println(function("JAVAJ"));//2
    }
    static int function(String str)
    {
        int arr[]=new int[52];
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='a'&&ch<='z')
            {
                arr[ch-'a']++;
            }
            else
            {
                arr[ch-'A'+26]++;
            }
        }
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='a'&&ch<='z')
            {
                if(arr[ch-'a']==1)
                {
                    return i;
                }
            }
            else
            {
                if(arr[ch-'A'+26]==1)
                {
                    return i;
                }
            }
        }
        return -1;
    }
} 
*/
//3.Determine if two strings/phrases are valid Anagrams 
/*
public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println(fun("listen", "silent")); // true
        System.out.println(fun("anagram", "naragram")); // true
    }
    static boolean fun(String str1,String str2)
    {
        if(str1.length()!=str2.length())
        {
            return false;
        }
        int arr[]=new int[26];
        for(char i:str1.toCharArray())
        {
            arr[i-'a']++;
        }
        for(int i=0;i<str2.length();i++)
        {
            char ch=str2.charAt(i);
            if(arr[ch-'a']<=0)
            {
                return false;
            }
        }
        return true;
    }
}
*/
//4.reverse letter only
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        char ch[]="a-b C = D Rf!".toCharArray();
        fun(ch);
        for(int i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]);//f-R D = C ba!
        }   
    }
    static void fun(char ch[])
    {
        int s=0,e=ch.length-1;
        while (s<=e)
        {
            if(!Character.isLetter(ch[s]))
            {
                s++;
            }
            else if(!Character.isLetter(ch[e]))
            {
                e--;
            }
            else
            {
                char temp=ch[s];
                ch[s]=ch[e];
                ch[e]=temp;
                s++;
                e--;
            }
        }
    }
}
*/
//5.decode ways A-1 ... Z-26 AA-27 .. AZ-52
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println(numDecodings("226"));//3
        //Explanation: "226" could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
    }
    static int numDecodings(String s) 
    {
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
    
        for (int i = 2; i <= n; i++) {
          int oneDigit = Integer.valueOf(s.substring(i - 1, i));
          int twoDigits = Integer.valueOf(s.substring(i - 2, i));
    
          if (oneDigit >= 1)
            dp[i] += dp[i - 1];
    
          if (twoDigits >= 10 && twoDigits <= 26)
            dp[i] += dp[i - 2];
        }
    
        return dp[n];
      }
}
*/


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//----------------------------------12.DP------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//climbing stairs
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int num=4;
        int one=1,two=1;
        for(int i=2;i<=num;i++)
        {
            int temp=one+two;
            one=two;
            two=temp;
        }
        System.out.println(two);
    }
}
*/
//frog jump
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int height[]={30,10,60,10,60,50};
        System.out.println(frog_jump(height));
    }
    static int frog_jump(int height[])
    {
        int n=height.length;
        int prev=0;
       int prev2=0;
       for(int i=1;i<n;i++){
           
           int jumpTwo = Integer.MAX_VALUE;
           int jumpOne= prev + Math.abs(height[i]-height[i-1]);
           if(i>1)
             jumpTwo = prev2 + Math.abs(height[i]-height[i-2]);
         
           int cur_i=Math.min(jumpOne, jumpTwo);
           prev2=prev;
           prev=cur_i;
             
       }
       return prev;
    }
    
}
*/
//maximum sum of non-adjacent element
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr[] = {2, 1, 4, 9};
        int n = arr.length;
        int result = solve(n, arr);
        System.out.println(result);//11
        
    }   
    static int solve(int n, int[] arr) 
    {
        int prev = arr[0];
        int prev2 = 0;
        for (int i = 1; i < n; i++) 
        {
            int pick = arr[i];
            if (i > 1)
                pick += prev2;

            int nonPick = prev;
            int cur_i = Math.max(pick, nonPick);
            prev2 = prev;
            prev = cur_i;
        }
        return prev;
    }
}
*/
//best time to buy and sell stock I
/* 
public class Main 
{
    public static void main(String[] args)
    {
        int arr[]={7,1,5,3,6,4};
        System.out.println(Brute(arr));
    }
    static int Brute(int arr[])
    {
         int min=arr[0],max=0;
         int start=arr[0],end=0;
         for(int i=1;i<arr.length;i++)
         {
            if(arr[i-1]-min>max)
            {
                end=arr[i-1];
                max=arr[i-1]-min;
            }
            if(min>arr[i])
            {
                start=arr[i];
                min=arr[i];
            }
         }
         System.out.println(start+" "+end); // 1 6
         return max;
    }
} 
*/



///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//1.unique paths
/*
public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println(Count(0, 0, 3, 3));//6
    }
    static int Count(int i,int j,int m,int n)
    {
        if(i==(n-1)&&j==(m-1))
        {
            return 1;
        }
        if(i>=n||j>=m)
        {
            return 0;
        }
        return Count(i+1, j, m, n)+Count(i, j+1, m, n);
        
    }
}
*/

//1.unique paths
/* 
public class java
{
    public static void main(String[] args) 
    {
        //Time complexity:exp solution
        System.out.println(unique_path1(0, 0, 3,3)); //6
        System.out.println(unique_path2(2, 3));//3
    }
    static int unique_path1(int i,int j,int r,int c)
    {
        if(i==r-1&&j==c-1)
        {
            return 1;
        }
        if(i>=r||j>=c)
        {
            return 0;
        }
        return unique_path1(i+1, j, r, c)+unique_path1(i, j+1, r, c);
    }
    static int unique_path2(int r,int c)
    {
        // 0 0 0  
        // 0 0 0
        
        // right-->right-->down   3c2-->right    3c1-->down   ans will be a m+n-2cm-1 or m+n-2cn-1
        // down-->right-->right
        // right-->down-->right

        int N=r+c-2;
        int R=c-1;
        int result=1;
        for(int i=1;i<=R;i++) 
        {
            result=result*(N+i-R)/i;
        }

        return result; 
    }
}
*/
//2.next permutation
/* 
public class java 
{
    public static void main(String[] args) 
    {
        // 1 3 5 4 2 ---> 1 4 2 3 5
        // 1.arr[i]<arr[i+1]==(index1=1)
        // 2.arr[len-2]>arr[len-1] == (index2=len-2)
        // 3.swap(arr[index1],arr[index2])
        // 4.reverse(index1,len)
        
        int arr[]={1,3,5,4,2};
        next_permutation(arr);
        for(int i:arr)
        {
            System.out.print(i+" ");//1 4 2 3 5 
        }
        System.out.println();
        next_permutation(arr);
        for(int i:arr)
        {
            System.out.print(i+" ");//1 4 2 5 3
        }

    }
    static void next_permutation(int arr[])
    {
        if(arr.length<=1)
        {
            return;
        }
        int i=arr.length-2;
        while(i>=0&&arr[i]>=arr[i+1])
        {
            i--;
        }
        if(i>=0)
        {
            int j=arr.length-1;
            while (arr[j]<=arr[i])
            {
                j--;     
            }
            swap(arr, i, j);
        }
        reverse(arr, i+1, arr.length-1);
    }
    static void swap(int arr[],int i,int j)
    {
        arr[i]=arr[i]^arr[j];
        arr[j]=arr[i]^arr[j];
        arr[i]=arr[i]^arr[j];
    }
    static void reverse(int arr[],int i,int j)
    {
        while(i<j)
        {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
}

*/
//3.minimum nuber of coins
/* 
public class java 
{
    public static void main(String[] args) 
    {
        // 1 2 5 10 20 50 100 500 1000
        int rs=1588;
        System.out.println(rs/1000); //1
        rs=rs%1000;
        System.out.println(rs);//588
        System.out.println(rs/500);//1
        rs=rs%500;
        System.out.println(rs);//88
        System.out.println(rs/100);//0
        rs=rs%100;
        System.out.println(rs);//88
        System.out.println(rs/50);//1
        rs=rs%50;
        System.out.println(rs);//38
        System.out.println(rs/20);//1
        rs=rs%20;
        System.out.println(rs);//18
        System.out.println(rs/10);//1

        rs=rs%10;
        System.out.println(rs);//8
        System.out.println(rs/5);//1

        rs=rs%5;
        System.out.println(rs);//3
        System.out.println(rs/2);//1

        rs=rs%2;
        System.out.println(rs);//1
        System.out.println(rs/1);//1

        rs=rs%1;
        System.out.println(rs);//0

    }
}
*/
//4.subset sum 
/* 
public class java 
{
    public static void main(String[] args) {
        // [3,1,2]  n=3;
        // {}     ----> 0
        // {3}    ----> 3
        // {1}    ----> 1
        // {2}    ----> 2
        // {3,1}  ----> 4
        // {3,2}  ----> 5
        // {1,2}  ----> 3
        // {3,1,2} ---> 6 
        //use power set in bit munipulations
    }
}
*/

//5.
/*
public class java 
{
    public static void main(String[] args)
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 }; 
        int arr_size = arr.length;
    
        System.out.println("Given array is ");
        printArray(arr, arr_size); 
    
        mergeSort(arr, 0, arr_size - 1); 

        System.out.println("Sorted array is");
        printArray(arr, arr_size); 
    }
    static void merge(int arr[], int l, int m, int r) 
    { 
        int i, j, k; 
        int n1 = m - l + 1; 
        int n2 = r - m; 
        int L[]=new int[n1], R[]=new int[n2]; 
        for (i = 0; i < n1; i++) 
        {
            L[i] = arr[l + i]; 
        }
        for (j = 0; j < n2; j++) 
        {
            R[j] = arr[m + 1 + j]; 
        }
        i = 0; 
        j = 0; 
        k = l; 
        while (i < n1 && j < n2)
        { 
            if (L[i] <= R[j])
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 

    static void mergeSort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            // Same as (l+r)/2, but avoids 
            // overflow for large l and r 
            int m = l + (r - l) / 2; 

            // Sort first and second halves 
            mergeSort(arr, l, m); 
            mergeSort(arr, m + 1, r); 

            merge(arr, l, m, r); 
        } 
    } 
    static void printArray(int A[], int size) 
    { 
        int i; 
        for (i = 0; i < size; i++) 
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    } 
}
*/

//1.
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int num=5;
        int temp1=1;
        int temp2=num-1;
        for(int i=num;i>0;i--)
        {
            for(int j=0;j<i-1;j++)
            {
                System.out.print("   ");
            }
            if(i==num)
            {
                System.out.print(temp1+" ");
            }
            else
            {
                System.out.print(temp1+" ");
                int temp=temp1;
                for(int j=i;j<=num-1;j++)
                {
                    temp=temp-j;
                    System.out.print(temp+" ");
                }
            }
            temp1+=i;
            System.out.println();
        }
    }
}
*/
/* 
import java.util.*;

public class Main {

    public static List<List<Integer>> mergeOverlappingIntervals(int[][] intervals) 
    {
        if (intervals.length == 0) return Collections.emptyList();

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<List<Integer>> merged = new ArrayList<>();

        int[] currentInterval = intervals[0];
        merged.add(Arrays.asList(intervals[0][0], intervals[0][1]));

        for (int[] interval : intervals)
        {
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];
         //  {{1, 3}, {2, 6}, {8, 10}, {15, 18}
            if (currentEnd >= nextStart) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                currentInterval = interval;
                merged.add(Arrays.asList(currentInterval[0], currentInterval[1]));
            }
        }
        return merged;
    }

    public static void main(String[] args) 
    {
        int[][] intervals = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        List<List<Integer>> result = mergeOverlappingIntervals(intervals);
        System.out.println("The merged intervals are: " + result);
    }
}
*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//1.
// 1
// 2  6
// 3  7  10
// 4  8  11 13
// 5  9  12 14 15
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int num=5;
        for(int i=1;i<=num;i++)
        {
            int temp=i;
            for(int j=0;j<i;j++)
            {
                System.out.print(temp+" ");
                temp=temp+(num-1)-j;
            }
            System.out.println();
        }   
    }
}
*/
//2.
//               1
//            2  1
//         3  2  1
//     4   3  2  1
// 5   4   3  2  1
/* 
public class Main 
{
    public static void main(String[] args) {
        int num=5;
        for(int i=1;i<=num;i++)
        {
            for(int j=0;j<num-i;j++)
            {
                System.out.print("- ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
*/
//3.
// 1
// 2 4
// 3 5 7
// 6 8 10 12
// 9 11 13 15 17
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int num=5,temp=1;
        for(int i=1;i<=num;i++)
        {
            temp=i;
            for(int j=0;j<i;j++)
            {
                System.out.print(temp+" ");
                temp+=2;
            }
            System.out.println();
        }    
    }
}
*/
//4.
// 1   5
//  2 4
//   3
//  2 4
// 1   5
/* 
public class Main 
{
    public static void main(String[] args)
    {
        char str[]="12345".toCharArray();
        int len=str.length;
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                if(i==j)
                {
                    System.out.print(str[i]);
                }
                else if(j==len-1-i)
                {
                    System.out.print(str[j]);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
*/
//5.
// 1 2 3 4 5 
// 2 3 4 5 1
// 3 4 5 1 2
// 4 5 1 2 3
// 5 1 2 3 4
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int num=5;
        for(int i=1;i<=num;i++)
        {
            for(int j=0;j<num;j++)
            {
                System.out.print(i+j<=num?i+j+" ":(i+j)%(num)+" ");

            }
            System.out.println();
        }   
    }
}
*/

//6.






//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//1.
//  1 2 3
//  4 5 6
//  7 8 9
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr[][]=
        {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int len=arr.length;
        for(int i=0;i<len/2;i++)
        {
            for(int j=0;j<len;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[len-1-i][j];
                arr[len-1-i][j]=temp;
            }
        }

        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len/2;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[i][len-1-j];
                arr[i][len-1-j]=temp;
            }
        }
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
*/
//2.longest palindromic string
/* 
class Solution {
    public String longestPalindrome(String s)
    {
        return Longest_Palindromic(s);
    }
    static String Longest_Palindromic(String str)
    {
        if (str.length() <= 1)
        return str;
  
      String LPS = "";
  
      for (int i = 1; i < str.length(); i++) {
  
        // Consider odd length
        int low = i;
        int high = i;
        while(str.charAt(low) == str.charAt(high)) {
          low--;
          high++;
  
          if (low == -1 || high == str.length())
            break;
        }
  
        String palindrome = str.substring(low+1, high);
        if (palindrome.length() > LPS.length()) {
          LPS = palindrome;
        }
  
        // Consider even length
        low = i-1;
        high = i;
        while(str.charAt(low) == str.charAt(high)) {
          low--;
          high++;
  
          if (low == -1 || high == str.length())
            break;
        }
  
        palindrome = str.substring(low+1, high);
        if (palindrome.length() > LPS.length()) {
          LPS = palindrome;
        }
      }
  
      return LPS;
    }
}
*/
//3.Given a number, you have to represent this number as sum of minimum number of possible  pseudobinary numbers. A number is said to be  pseudobinary number if its decimal number consists of only two digits (0 and 1). Example: 11,10,101 are all  pseudobinary numbers.
// Examples :- 
 

// Input : 44
// Output : 11 11 11 11

// Explanation : 44 can be represented as sum of 
// minimum 4 pseudobinary numbers as 11+11+11+11  

// Input : 31
// Output : 11 10 10
// Java program to represent a given
// number as sum of minimum possible
// pseudobinary numbers
/*
class GFG
{
	public static void pseudoBinary(int n)
	{
		// Repeat below steps until n > 0
		while (n != 0)
		{
			int temp = n, m = 0, p = 1;
			while(temp != 0)
			{
				int rem = temp % 10;
				temp = temp / 10;

				if (rem != 0)
					m += p;

				p *= 10;
			}

			System.out.print(m + " ");
			
			// subtract m from n
			n = n - m;
		}
		System.out.println("--");
	}

// Driver code
public static void main(String[] args)
	{
		int n = 31;
		pseudoBinary(n);
	}
}
*/
//--------merge inteval
/* 
import java.util.Arrays;

public class Main {

    public static int[][] merge(int[][] intervals) {
        // Sort the intervals by their start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[][] temp = new int[intervals.length][2];
        int index = 0; 

        int st = intervals[0][0], en = intervals[0][1];
        for (int i = 0; i < intervals.length; i++) 
        {
            int thisSt = intervals[i][0], thisEn = intervals[i][1];

            // If the current interval does not overlap with the previous one
            if (thisSt > en) {
                // Add the previous interval to the temp array
                temp[index][0] = st;
                temp[index][1] = en;
                index++;

                // Update the start and end to the current interval
                st = thisSt;
                en = thisEn;
            } else {
                // If the current interval overlaps with the previous one, merge them
                if (thisEn > en) {
                    en = thisEn;
                }
            }
        }

        // Add the last interval to the temp array
        temp[index][0] = st;
        temp[index][1] = en;
        index++;

        // Copy the merged intervals to the result array
        int[][] result = new int[index][2];
        for (int i = 0; i < index; i++) {
            result[i][0] = temp[i][0];
            result[i][1] = temp[i][1];
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 4}, {6, 8}, {9, 11}};
        int[][] result = merge(intervals);
        System.out.print("The merged intervals are: ");
        for (int[] interval : result) {
            System.out.print("[" + interval[0] + ", " + interval[1] + "] ");
        }
    }
}
*/
// Java program for pendulum arrangement of numbers 
/* 
import java.util.Arrays; 

class Test 
{ 
	// Prints pendulum arrangement of arr[] 
	static void pendulumArrangement(int arr[], int n) 
	{ 
		// sorting the elements 
		Arrays.sort(arr); 
	//  6 12 14 19 21
		// Auxiliary array to store output 
		int op[] = new int[n]; 
	
		// calculating the middle index 
		int mid = (n-1)/2; 
		int j = 1, i = 1; 
		op[mid] = arr[0]; 
		for (i = 1; i <= mid; i++) 
		{ 
			op[mid+i] = arr[j++]; 
			op[mid-i] = arr[j++]; 
		} 
	
		// adjustment for when no. of elements is even 
		if (n%2 == 0) 
			op[mid+i] = arr[j]; 
	
	
		// Printing the pendulum arrangement 
		System.out.println("Pendulum arrangement:"); 
		for (i = 0 ; i < n; i++) 
			System.out.print(op[i] + "-"); 
	
		System.out.println(); 
	} 
	
	// Driver method 
	public static void main(String[] args) 
	{ 
		//input Array 
		int arr[] = {14, 6, 19, 21, 12,1}; 
		
		// calling pendulum function 
		pendulumArrangement(arr, arr.length); 
	} 
} 
*/

//------------------------------------------------------------------------------------------------------------------------------------------

/*
//1.
494. Target Sum
Medium
Topics
Companies
You are given an integer array nums and an integer target.
You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums and then concatenate all the integers.
For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression "+2-1".
Return the number of different expressions that you can build, which evaluates to target.

Example 1:

Input: nums = [1,1,1,1,1], target = 3
Output: 5
Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
-1 + 1 + 1 + 1 + 1 = 3
+1 - 1 + 1 + 1 + 1 = 3
+1 + 1 - 1 + 1 + 1 = 3
+1 + 1 + 1 - 1 + 1 = 3
+1 + 1 + 1 + 1 - 1 = 3
Example 2:

Input: nums = [1], target = 1
Output: 1
 

import java.util.*;
class Solution {
    public int findTargetSumWays(int[] nums, int target) 
    {  
        return tways(nums,target,0,new HashMap<String,Integer> ());   
    }
    public int tways(int [] nums,int target,int curr,HashMap<String,Integer> memo)
    {
        if(curr>=nums.length) 
        {
            if(target!=0) return 0;
            else return 1;
        }
        String currkey=Integer.toString(curr)+"_"+Integer.toString(target);
        
        if(memo.containsKey(currkey)) return memo.get(currkey);
        
        int pos=tways(nums,target-nums[curr],curr+1,memo);
        int neg=tways(nums,target+nums[curr],curr+1,memo);
        
        memo.put(currkey,pos+neg);
        
        return memo.get(currkey);
        
    }
}

//2.
1312. Minimum Insertion Steps to Make a String Palindrome
Hard
Topics
Companies
Hint
Given a string s. In one step you can insert any character at any index of the string.
Return the minimum number of steps to make s palindrome.
A Palindrome String is one that reads the same backward as well as forward.
Example 1:
Input: s = "zzazz"
Output: 0
Explanation: The string "zzazz" is already palindrome we do not need any insertions.
Example 2:
Input: s = "mbadm"
Output: 2
Explanation: String can be "mbdadbm" or "mdbabdm".
Example 3:
Input: s = "leetcode"
Output: 5
Explanation: Inserting 5 characters the string becomes "leetcodocteel".
class Solution {
    public int minInsertions(String s) {
        String s2 = new StringBuilder(s).reverse().toString();
        int[][] dp = new int[s.length()+1][s.length()+1];

        for(int i = 1;i<=s.length();i++){
            for(int j = 1;j<=s.length();j++){
                if(s.charAt(i-1) == s2.charAt(j-1))dp[i][j] = 1 + dp[i-1][j-1];
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return s.length()-dp[s.length()][s.length()];
    }
}

//3.
1074. Number of Submatrices That Sum to Target
Hard
Topics
Companies
Hint
Given a matrix and a target, return the number of non-empty submatrices that sum to target.
A submatrix x1, y1, x2, y2 is the set of all cells matrix[x][y] with x1 <= x <= x2 and y1 <= y <= y2.
Two submatrices (x1, y1, x2, y2) and (x1', y1', x2', y2') are different if they have some coordinate that is different: for example, if x1 != x1'.
Example 1:
Input: matrix = [[0,1,0],[1,1,1],[0,1,0]], target = 0
Output: 4
Explanation: The four 1x1 submatrices that only contain 0.
Example 2:
Input: matrix = [[1,-1],[-1,1]], target = 0
Output: 5
Explanation: The two 1x2 submatrices, plus the two 2x1 submatrices, plus the 2x2 submatrix.
Example 3:
Input: matrix = [[904]], target = 0
Output: 0
 
class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        for(int row = 0; row < matrix.length; row++) {
            for(int col = 1; col < matrix[0].length; col++) {
                matrix[row][col] += matrix[row][col - 1];
            }
        }
        int count = 0;

        for(int col = 0; col < matrix[0].length; col++) {
            for(int j = col; j < matrix[0].length; j++) {
                HashMap<Integer,Integer> map = new HashMap<>();
                map.put(0, 1);
                int sum = 0;
                
                for(int row = 0; row < matrix.length; row++) {
                    sum += matrix[row][j] - (col > 0 ? matrix[row][col - 1] : 0);
                    count += map.getOrDefault(sum - target, 0);
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }
        }
        return count;
    }
}
*/
// #include<stdio.h>
// int main()
// {
//    int h,m,s,h1,m1,s1;
//    scanf("%d:%d:%d %d:%d:%d",&h,&m,&s,&h1,&m1,&s1);
//    int t=(h*3600)+(m*60)+s;
//    int t1=(h1*3600)+(m1*60)+s1;
//    int f=t1-t;
//    printf("%02d:%02d:%02d",(f/3600),(f%3600)/60,f%60);
// }


//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//1.
/* 
class Main 
{
    public static void main(String[] args) 
    {
        int n=31;
        while (n > 0)
        {				 
            // calculate m (A number that has same
            // number of digits as n, but has 1 in
            // place of non-zero digits 0 in place
            // of 0 digits)
            int temp = n, m = 0, p = 1;
            while (temp>0)
            {
                int rem = temp % 10;
    
                if (rem != 0)
                {
                    m += p;
                }
                p *= 10;
                temp = temp / 10;
            }
            System.out.println(m);   
            // subtract m from n
            n = n - m;
        }
    }
}
*/
//2.90
/* 
class Main {
    static void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }

    public static void main(String args[]) {
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(arr);
        System.out.println("Rotated Image");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

*/

//3.Longest Palindromic

//brute
/* 
import java.util.Scanner;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String str=scan.nextLine();
        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<str.length();j++)
            {
                if( fun(str.substring(i,j+1)) )
                {
                    System.out.println(  str.substring(i,j+1) );
                }
            }
        }
    }
    static boolean fun(String str)
    {
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
            {
                return false;
            }
        }
        return true;
    }
}
*/

//optimal
/* 
class Solution {
    public String longestPalindrome(String s)
    {
        return Longest_Palindromic(s);
    }
    static String Longest_Palindromic(String str)
    {
        if (str.length() <= 1)
        return str;
  
      String LPS = "";
  
      for (int i = 1; i < str.length(); i++) {
  
        // Consider odd length
        int low = i;
        int high = i;
        while(str.charAt(low) == str.charAt(high)) {
          low--;
          high++;
  
          if (low == -1 || high == str.length())
            break;
        }
  
        String palindrome = str.substring(low+1, high);
        if (palindrome.length() > LPS.length()) {
          LPS = palindrome;
        }
  
        // Consider even length
        low = i-1;
        high = i;
        while(str.charAt(low) == str.charAt(high)) {
          low--;
          high++;
  
          if (low == -1 || high == str.length())
            break;
        }
  
        palindrome = str.substring(low+1, high);
        if (palindrome.length() > LPS.length()) {
          LPS = palindrome;
        }
      }
  
      return LPS;
    }
}
//babad
// */
// class Main
// {
//     public static void main(String[] args) 
//     {
//         System.out.println("babad"); 
//         System.out.print("\n"+longestPalindrome("babad") );
//     }
//     public static String longestPalindrome(String s) {
//         int n=s.length();
//         char[] newStr=new char[2*n+1];
//         int i=0;
//         newStr[i++]='#';
//         for(char c:s.toCharArray()){
//             System.out.print(c);
//             newStr[i++]=c;
//             System.out.print("#");
//             newStr[i++]='#';
//         }
        
//         int p[]=new int[2*n+1];
//         int center=0,right=0;
        
//         int longestLength=0,longestCenter=0;
        
//         for(i=0;i<newStr.length;i++){
            
//             int mirror= 2*center-i;
            
//             if(right>i){
//                 p[i]=Math.min(p[mirror],right-i);
//             }
            
//             int a=i + (p[i]+1);
//             int b=i - (p[i]+1);
            
//             while(b>=0 && a<newStr.length && newStr[a]==newStr[b]){
//                 b--;
//                 a++;
//                 p[i]++;
//             }
            
//             if(p[i]>=longestLength){
//                 longestCenter=i;
//                 longestLength=p[i];
//             }
            
//             if(i+p[i]>right){
//                 center=i;
//                 right=i+p[i];
//             }
//         }
        
//         String st=new String(newStr);
//         return st.substring(longestCenter-longestLength,longestCenter+longestLength).replace("#","");
//     }
// }


//4.insert element
// public class Main {

//     public static int searchInsert(int [] arr, int x) {
//         int n = arr.length; // size of the array
//         int low = 0, high = n - 1;
//         int ans = n;

//         while (low <= high) {
//             int mid = (low + high) / 2;
//             // maybe an answer
//             if (arr[mid] >= x) {
//                 ans = mid;
//                 //look for smaller index on the left
//                 high = mid - 1;
//             } else {
//                 low = mid + 1; // look on the right
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 4, 7};
//         int x = 6;
//         int ind = searchInsert(arr, x);
//         System.out.println("The index is: " + ind);
//     }
// }

// Input : 1   3   2   5   4
// Output :5   3   1   2   4
// Explanation: 

// //merge sort
// public class Main 
// {
//     public static void main(String[] args)
//     {
//         int arr[] = { 12, 11, 13, 5, 6, 7 }; 
//         int arr_size = arr.length;
    
//         System.out.println("Given array is ");
//         printArray(arr, arr_size); 
    
//         mergeSort(arr, 0, arr_size - 1); 

//         System.out.println("Sorted array is");
//         printArray(arr, arr_size); 
//     }
//     static void merge(int arr[], int l, int m, int r) 
//     { 
//         int i, j, k; 
//         int n1 = m - l + 1; 
//         int n2 = r - m; 
//         int L[]=new int[n1], R[]=new int[n2]; 
//         for (i = 0; i < n1; i++) 
//         {
//             L[i] = arr[l + i]; 
//         }
//         for (j = 0; j < n2; j++) 
//         {
//             R[j] = arr[m + 1 + j]; 
//         }
//         i = 0; 
//         j = 0; 
//         k = l; 
//         while (i < n1 && j < n2)
//         { 
//             if (L[i] <= R[j])
//             { 
//                 arr[k] = L[i]; 
//                 i++; 
//             } 
//             else
//             { 
//                 arr[k] = R[j]; 
//                 j++; 
//             } 
//             k++; 
//         } 
//         while (i < n1) 
//         { 
//             arr[k] = L[i]; 
//             i++; 
//             k++; 
//         } 
//         while (j < n2) 
//         { 
//             arr[k] = R[j]; 
//             j++; 
//             k++; 
//         } 
//     } 

//     static void mergeSort(int arr[], int l, int r) 
//     { 
//         if (l < r) 
//         { 
//             // Same as (l+r)/2, but avoids 
//             // overflow for large l and r 
//             int m = l + (r - l) / 2; 

//             // Sort first and second halves 
//             mergeSort(arr, l, m); 
//             mergeSort(arr, m + 1, r); 

//             merge(arr, l, m, r); 
//         } 
//     } 
//     static void printArray(int A[], int size) 
//     { 
//         int i; 
//         for (i = 0; i < size; i++) 
//         {
//             System.out.print(A[i]+" ");
//         }
//         System.out.println();
//     } 
// }

//------interval merge------------------------------



// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// public class Main {

//     public static List<int[]> mergeOverlap(int[][] arr) {
      
//         // Sort intervals based on start values
//         Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

//         List<int[]> res = new ArrayList<>();
//         res.add(arr[0]);

//         for (int i = 1; i < arr.length; i++) {
//             int[] last = res.get(res.size() - 1);
//             int[] curr = arr[i];

//             // If current overlaps with the last merged, merge them
//             if (curr[0] <= last[1]) {
//                 last[1] = Math.max(last[1], curr[1]);
//             } else {
//                 // Add current to the result
//                 res.add(curr);
//             }
//         }

//         return res;
//     }

//     // Driver Code
//     public static void main(String[] args) {
//         int[][] arr = {{6, 8}, {1, 9}, {2, 4}, {4, 7}};
//         List<int[]> res = mergeOverlap(arr);

//         System.out.print("The Merged Intervals are: ");
//         for (int[] interval : res) {
//             System.out.print("[" + interval[0] + ", " + interval[1] + "] ");
//         }
//         System.out.println();
//     }
// }


//dsa-data structure is way of organinzing data in computer so that it is efficient handle the data
//what do mean by efficient? ==> easy store,search and retrieve,modify the data

//time complextity :
// 1.bigo (O(1))
// 2.omege
// 3.theta
// O(1) <  O(log n) < O(n) < O(n log n)  < O(x^2)  < O(X^3)  < O(2^x) < O(n!)


//1.List Implementation using Array()
/*
import java.util.*;
class DynamicArray
{
    int arr[];
    static  int size = 0;
    int INITIAL_CAPACITY = 10; 
    DynamicArray() {
        size = 0;
        arr = new int[INITIAL_CAPACITY]; // Use INITIAL_CAPACITY
    }
    public void add(int num)
    {
        if(size==INITIAL_CAPACITY)
        {
            expandArray();
        }
        arr[size++]=num;
    }
    public void expandArray()
    {
        INITIAL_CAPACITY*=2;
        Arrays.copyOf(arr,INITIAL_CAPACITY);
    }
    public void delete()
    {
        size--;
    }
    public void display()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void insert(int pos,int num)
    {
        if(size==INITIAL_CAPACITY)
        {
            expandArray();
        }
        for(int i=size-1;i>=pos;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[pos]=num;
        size+=1;
    }
    public void deleteAt(int pos,int num)
    {
         //1 7 2 3
        for(int i=pos+1;i<size;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[pos]=num;
        size-=1;
    }
}

public class main1 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DynamicArray linkedlist = new DynamicArray();
        for(int i=0;i<3;i++)
        {
            linkedlist.add(scan.nextInt());
        }
        linkedlist.display();
        linkedlist.insert(1,7);
        linkedlist.display();
        linkedlist.deleteAt(1, 7);
        linkedlist.display();

    }
}
*/
//2.Linkedlist
//-- Node contians data and pointer is called as node data any thick like string ,integer,float...
//-- starting node is head
//-- ending node is tail
//-- ending node pointer should point to null value  

// -Array:A fixed-size, contiguous block of memory with fast indexed access but requires resizing to change its size.
// -Linked List: A dynamic, non-contiguous data structure with each element pointing to the next, allowing efficient insertions and deletions but slower access due to traversal.

//time complexity            Linked List             Array
//1.Insert At Beginning          O(1)                 O(n)
//2.Tranvers                     O(n)                 O(n)
//3.Read/updeate                 O(n)                 O(1)
//4.Insert at Pos                O(n)                 O(n)
//5.delete form pos              O(n)                 O(n)

// //1.
// class linkedlist
// {
//     Node head;
//     class Node
//     {
//         int data;
//         Node next;
//         Node(int data)
//         {
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public linkedlist() 
//     {
//         head=null;
//     }  
//     public void InsertAtBegin(int data)
//     {
//         Node newNode = new Node(data);
//         if(head==null)
//         {
//             head=newNode;
//         }
//         else
//         {
//             newNode.next=head;
//             head=newNode;
//         }
//     }
//     public void display()
//     {
//         Node temp = head;
//         while(temp!=null)
//         {
//             System.out.print(temp.data);
//             temp=temp.next;
//         }
//     }
// }
// public class main1
// {
//     public static void main(String[] args) {
//         linkedlist obj1 = new linkedlist();
//         obj1.InsertAtBegin(3);
//         obj1.InsertAtBegin(33);
//         obj1.InsertAtBegin(333);
//         obj1.InsertAtBegin(3333);
//         obj1.display();
//     }
// }

//1.given a unsorted array to find continues pair largest sum value
//input:0,5,6,0,9,0,1,4
/*
public class zoho {
    public static void main(String[] args) {
        int arr[]={0,5,6,0,9,0,1,4},max=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(max<arr[i]+arr[i+1])
            {
                max=arr[i]+arr[i+1];
            }
        }
        System.out.println(max);
    }
}
*/
//2.print the range form x to y in n array
// N=6 A=4,3,7,11,50,1 
// X=4 Y=10
/* 
public class zoho {
    public static void main(String[] args) {
        int arr[]={4,3,7,11,50,1};
        int x=4,y=10;
        for(int i=0;i<arr.length;i++)
        {
            if(x<arr[i]&&arr[i]<y)
            {
                System.out.println(arr[i]);
                return;
            }
        }
    }
}
*/

//3.given an array find the sum of elements present in specified gap n
//input:arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13},gap=3
//output: 
// 35 => 1+4+7+10+13 
// 26 => 2+5+8+11
// 30 => 3+6+9+12
/* 
public class zoho {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13};
        int gap=3,s=0,e=0,sum=0;
        while(s<gap)
        {
            System.out.print(arr[e]+" ");
            sum+=arr[e];
            e+=gap;
            if(e>=arr.length)
            {
                s++;
                e=s;
                System.out.println(" ==> "+sum);
                sum=0;
            }
        }
    }
}
*/
//4.anagram
//input: s1=anagram s2=nagaram

//5.
// Input:2,3,4,5,1,7,6
// output:1,3,2,5,4,7,6

/* 
import java.util.Arrays;
public class zoho {
    public  static void main(String[] args) {
        int arr[]={2,3,4,5,1,7,6};
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i+=2)
        {
                arr[i]=arr[i]^arr[i+1];
                arr[i+1]=arr[i]^arr[i+1];
                arr[i]=arr[i]^arr[i+1];
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
*/
//6.from a given array of integers print the next bigger number for each number in array
//input:8,4,1,9,6,2
//output:8->9,4->6,1->2,9->,6->8,2->4
/*
public class zoho {
    public static void main(String[] args) {
        int arr[]={8,4,1,9,6,2};
        int s=0,e=0,min=Integer.MAX_VALUE;
        while(s<arr.length)
        {
            if(arr[s]<arr[e])
            {
                if(arr[e]<min)
                {
                    min=arr[e];
                }
            }
            e++;
            if(e>=arr.length)
            {
                if(min!=Integer.MAX_VALUE)
                {
                    System.out.println(arr[s]+" ==> "+min);
                }
                else
                {
                    System.out.println(arr[s]+" ==>");
                }
                min=Integer.MAX_VALUE;
                e=0;
                s++;
            }
        }
    }
}
*/
//7.
// input:3
// output:{},{{}},{{{}}};
/*
public class zoho {
    public static void main(String[] args) {
        int num=3;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("{");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("}");
            }
            System.out.print(" ");
        }
    }
}
*/

/* 
1.Implement strstr
Example 1:
    Input  : s = GeeksForGeeks, x = Fr
    Output : -1
Example 2:
    Input  :  s = GeeksForGeeks, x = For
    Output : 5

public class zoho {
    public static void main(String[] args) {
        char ch1[]="GeeksForGeeks".toCharArray(),ch2[]="Fr".toCharArray(); 
        int index=-1;
        for(int i=0;i<ch1.length;i++)
        {
            if(ch1[i]==ch1[0])
            {
                int l=i,ctr=0;
                for(int j=0;j<ch2.length;j++)
                {
                    if(&&ch1[l++]==ch2[j])
                    {
                        ctr++;
                    }
                    else
                    {
                        break;
                    }
                }
                if(ctr==ch2.length){index=i;break;}
            }
        }
        System.out.println(index);  
    }
}
*/
//2.counting sorting:
// Input:
// N = 5
// S = "edsab"
// Output:
// abdes
/*
public class zoho {
    public static void main(String[] args) {
        String str="edsab";
        System.out.println(countSort(str));    
    }
    static String countSort(String arr)
    {
        int count[]=new int [26];
        for(int i=0;i<arr.length();i++)
        {
            count[arr.charAt(i)-'a']++;
        }
        arr="";
        for(int i=0;i<26;i++)
        {
            for(int j=0;j<count[i];j++)
            {
               arr+=(char)(i+'a'); 
            }
        }
        return arr;
    }
}
*/
//3.Print Matrix in snake Pattern
/*
import java.util.ArrayList;
public class zoho {
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int len=arr[0].length;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<len;j++)
            {
                if(i%2==0)
                {
                    temp.add(arr[i][j]);
                }
                else
                {
                    temp.add(arr[i][len-j-1]);
                }
            }
        }
        for(int i=0;i<temp.size();i++)
        {
            System.out.println(temp.get(i)+" ");
        }
    }
}
*/
// 4.2nd longest elements
/*
public class zoho {
    public static void main(String[] args) {
        int arr[]={1,7,2,3,6,5,22};
        int first_max=-1,second_max=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(first_max<arr[i])
            {
                second_max=first_max;
                first_max=arr[i];
            }
            else if(second_max<arr[i]&&first_max!=arr[i])
            {
                second_max=arr[i];
            }
        }
        System.out.println(second_max);
    }
}
*/
//5.sum digit in string
/* 
public class zoho {
    public static void main(String[] args) {
        String str="1ab40b3s1";
        int sum=0,num=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='0'&&str.charAt(i)<='9')
            {
                num=num*10+(int)(str.charAt(i)-'0');
            }
            else
            {
              sum+=num;
              num=0;   
            }
            if(i==str.length()-1)
            {
                sum+=num;
            }
        }
        System.out.println(sum);
    }
}
*/
//6.remove duplicate number in array
/* 
public class zoho {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,5};
        int i=0,j=0;
        while(i<arr.length-1)
        {
            if(arr[i]!=arr[i+1])
            {
                arr[j++]=arr[i];
            }
            i++;
        }
        i=0;
        while (i<j) 
        {
            System.out.print(arr[i]+" ");
            i++;    
        }
    }
}
*/
//7.remove character for str1 to str2
/*
public class zoho {
    public static void main(String[] args) {
        String str1="occurrence",str2="car";
        int count[]=new int[26];
        for(int i=0;i<str1.length();i++)
        {
            count[(int)str1.charAt(i)-'a']++;
        }
        for(int i=0;i<str2.length();i++)
        {
            count[(int)str2.charAt(i)-'a']=0;
        }
        for(int i=0;i<str1.length();i++)
        {
            if(count[(int)str1.charAt(i)-'a']!=0)
            {
                System.out.print(str1.charAt(i));
            }
        }
    }
}
*/
//8.replace all 0's by 5
/* 
public class zoho {
    public static void main(String[] args) {
        int num=1004,ans=0,num1=num;
        int factor=1;
        while(num>0)
        {
            if(num%10==0)
            {
                ans=ans+(5*factor);//4+50=54 || 55+500=554
            }
            else
            {
                ans=ans+(num%10*factor);//4 || 1000+554=1554
            }
            num/=10;
            factor=factor*10;//1 10 100 1000
        }
        System.out.println(ans);
        ans=0;
        while (num2>0) 
        {
            if(num2%10==0)
            {
                ans=ans*10+5;
            }    
            else
            {
                ans=ans*10+num2%10;
            }
            num2/=10;
        }
        System.out.println(ans);
    }
}
*/
//9.multiply two polynimials
/*
public class zoho {
    public static void main(String[] args) {
        int m=4,n=3;
        int arr1[]={1,0,3,2},arr2[]={2,0,4};
        int result[]=new int[m+n-1];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                result[i+j]+=arr1[i]*arr2[j];
                // 0 0 0 0 0 0 0 0
                // 2 0 4                 i=0
                //   0 0 0               i=1
                //     6 9 12            i=2
                //       4 0 8           i=4
            }
        }

        for(int i=0;i<m+n-1;i++)
        {
            System.out.print(result[i]+" ");
        }

    }
}
*/
//10.geek-anacci number

/* 
import java.util.Scanner;
public class zoho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num=3;
        for(int i=0;i<num;i++)
        {
            int a=scan.nextInt(),b=scan.nextInt(),c=scan.nextInt(),n=scan.nextInt();
            System.out.println(fn(a,b,c,n));
        }
    }
    static int fn(int a,int b,int c,int n)
    {
        int count=3,sum=0;
        while(count<n)
        {
            sum = a+b+c;
            a=b;
            b=c;
            c=sum;
            count++;
        }
        return c;
    }
}
*/

//11.square root of number is <=x
/*
public class zoho {
    public static void main(String[] args) {
        int num=5;
        System.out.println(floorSqrt(num));
    }
    static int floorSqrt(int num)
    {
        int start=1,end=num;
        int floor_ans=0;
        int mid;
        while(start<=end)
        {
            
            mid=(start+end)/2;
            if(mid*mid==num)
            {
                return mid;
            }
            else if(mid<=num/mid)
            {
                start=mid+1;
                floor_ans=mid;
            }
            else
            {
                end=mid-1;
            }
        }
        return floor_ans;
    }
}
*/
//12.anagram
/* 
public class zoho {
    public static void main(String[] args) {
        int arr[]=new int[26];
        String str1="geeksforgeeks",str2="forgeeksgeeks";
        for(int i=0;i<str1.length();i++)
        {
            arr[(int)(str1.charAt(i)-'a')]++;
        }
        for(int i=0;i<str2.length();i++)
        {
            if(arr[(int)(str2.charAt(i)-'a')]>0)
            {
                arr[(int)(str2.charAt(i)-'a')]--;
            }
            else
            {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
*/
//13.Intersection of two arrays
/* 
public class zoho {
    public static void main(String[] args) {
       int  n = 5, m = 3;
       int a[] = {89, 24, 75, 11, 23};
       int b[] = {89, 2, 4};
       System.out.println(NumberofElementsInIntersection(a, b, n, m));
    }
    static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        int i=0,j=0,ctr=0;
        while(i<n)
        {
            if(a[i]==b[j++])
            {
                ctr++;
            }
            if(j>=m)
            {
                j=0;
                i++;
            }
        }
        return ctr;
    }
}
*/
//13.
/*
public class zoho {
    public static void main(String[] args) {
        String str="67542-/+-";
        fn(str, 0);
    }
    static int fn(String str,int ans)
    {
        int o_index=0;
        for(int i=0;i<str.length();i++)
        {
            if((str.charAt(i)<'0'||str.charAt(i)>'9'))
            {
                o_index=i;
                break;
            }
        }
        ans=(int)(str.charAt(0)-'0');
        int j=o_index;
        for(int i=1;i<j;i++)
        {
            if(str.charAt(o_index)=='+')
            {
                ans=ans+(int)(str.charAt(i)-'0');
            }
            else if(str.charAt(o_index)=='-')
            {
                ans=ans-(int)(str.charAt(i)-'0');
            }      
            else if(str.charAt(o_index)=='%')
            {
                ans=ans%(int)(str.charAt(i)-'0');
            }
            else if(str.charAt(o_index)=='/')
            {
                ans=ans/(int)(str.charAt(i)-'0');
            }
            o_index++;      
        }
        System.out.println(ans);
        return 0;
    }
}
*/
//14.
/* 
public class zoho {
 
    public static void main(String[] args) {
        String str="1c0c1c1a0b1";
        // a-and , b-or ,c-xor 
        int ans = (int)(str.charAt(0)-'0');
        for(int i=1;i<str.length();i+=2)
        {
            if(str.charAt(i)=='a')
            {
                ans = ans&(int)(str.charAt(i+1)-'0');
            }
            else if(str.charAt(i)=='b')
            {
                ans=ans|(int)(str.charAt(i+1)-'0');
            }
            else if(str.charAt(i)=='c')
            {
                ans=ans^(int)(str.charAt(i+1)-'0');
            }
        }
        System.out.println(ans);
    }
}
*/
//15.total number of sock in 3 different type of colour
// 1-red
// 2-green
// 3-blue
/* 
public class zoho {
    public static void main(String[] args) {
        int arr[]={2,1,1,2,3,3,1};
        int temp[]=new int[3],result=0;
        for(int i=0;i<arr.length;i++)
        {
            temp[arr[i]-1]++;
        }
        for(int i=0;i<3;i++)
        {
            result+=temp[i]/2;
        }
        System.out.println(result); // 2-2->1 pair && 1-1 && 3-3
    }
}
*/
//16.
//sting mappint in str1 to str2

//input:str1="add",str2="egg" (a-->e && d-->g)
//output:yes

//input:str1="add",str2="edg" (a-->e && r-->g ||~ d-->g)
//output:yes

/* 
public class zoho {
    public static void main(String[] args) {
        String str1="add",str2="edg";
        int arr[]=new int[26];
        for(int i=0;i<str1.length();i++)
        {
            if(arr[(int)str1.charAt(i)-'a']==0)
            {
                arr[(int)str1.charAt(i)-'a']=(int)(str2.charAt(i)-'a');
            }
            else if(arr[(int)str1.charAt(i)-'a']!=(int)(str2.charAt(i)-'a'))
            {
                System.out.print("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
*/

//17.
/* 
public class zoho {
    public static void main(String[] args) {
        String str="abbaccc",result="";
        int ctr=1;
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i-1)!=str.charAt(i))
            {
                result+=str.charAt(i-1)+""+(char)('0'+ctr);
                ctr=1;
            }
            else
            {
                ctr++;
            }
        }
        result+=str.charAt(str.length()-1)+""+(char)('0'+ctr);
        System.out.println(result);
    }
}
*/
//18.first non repeating character:
/* 
public class zoho {
    public static void main(String[] args) {
        String str="hello";
        int len=str.length(),arr[]=new int[26];
        for(int i=0;i<len;i++)
        {
            arr[(int)str.charAt(i)-'a']++;
        }
        for(int i=0;i<len;i++)
        {
            if(arr[(int)str.charAt(i)-'a']==1)
            {
                System.out.println(str.charAt(i));
                return;
            }
        }
    }
}
*/

//19.Given a street of N houses (a row of houses), each house having K amount of money kept inside; now there is a thief who is going to steal this money but he has a constraint/rule that he cannot steal/rob two adjacent houses. Find the maximum money he can rob.
/*
public class zoho {
    public static void main(String[] args) {
        int N=5,K=10;
        System.out.println(maximizeMoney(N, K));   
    }
    static int maximizeMoney(int N , int K) {
        N=(N%2==0)?N/2:N/2+1;
        return N*K;
    }
}
*/

//20.count 0 and 1> and <-1
/* 
public class zoho {
    public static void main(String[] args) {
        int arr[]={1,1,0,-1,-2};
        double ctr_0=0,ctr_1=0,ctr_2=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                ctr_0++;
            }
            else if(arr[i]>0)
            {
                ctr_1++;
            }
            else 
            {
                ctr_2++;
            }
        }
        ctr_0=ctr_0/arr.length;
        ctr_1=ctr_1/arr.length;
        ctr_2=ctr_2/arr.length;
        System.out.printf("%."+arr.length+"f",ctr_0);
        System.out.printf("%."+arr.length+"f",ctr_1);
        System.out.printf("%."+arr.length+"f",ctr_2);
    }
}
*/
//21.isogram is if all character is unique than return true otherwise false

//22.number to word
/* 
public class zoho {

    public static void main(String[] args) {
        long n=77744448l;
        String ans="";
        ans+=numtoword((int)(n/10000000),"crore ");// 7 0's
        ans+=numtoword((int)((n/100000)%100),"lakh "); // 5 0's
        ans+=numtoword((int)((n/1000)%100),"thousand "); // 3 0's
        ans+=numtoword((int)((n/100)%10),"hundred ");   // 2's
        if(n>100 && n%100>0){
            ans+="and ";
        }
        ans+=numtoword((int)(n%100),"");
        System.out.println(ans);
    }
    static String numtoword(long n,String s)
    {
        String one[]={"","one ","two ","three ","four ","five ","six ","seven ","eight ","nine ","ten ","eleven ","twelve ","thirteen ","fourteen ","fifteen ","sixteen ","seventeen ","eighteen ","nineteen "};
        String tens[]={"","","twenty ","thirty ","forty ","fifty ","sixty ","seventy ","eighty ","ninety "};
        String str="";
        if(n>19){
            str+=tens[(int) (n/10)]+one[(int) (n%10)];
        }else{
            str+=one[(int) n];
        }
        if(n!=0){
            str+=s;
        }
        return str;
    }
}
*/
//23.diagonal traverse
// public class zoho {
//     public static void main(String[] args) {
//         int arr[][]={
//             {1,2,3},
//             {4,5,6},
//             {7,8,9}
//         };
        
//     }
// }
//-------------------------------------------------------------------------
//24.pangram checking
// Check whether all english alphabets are present in the given sentence or not
// I/P: abc defGhi JklmnOP QRStuv wxyz
// O/P: True

// I/P: abc defGhi JklmnOP QRStuv
// O/P: False
/*
public class zoho {
    public static void main(String[] args) {
        int arr[]=new int [26];
        String str="abc defGhi JklmnOP QRStuv wxyz";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='a'&&str.charAt(i)<='z')
            {
                arr[(int)str.charAt(i)-'a']++;
            }
            else if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
            {
                arr[(int)str.charAt(i)-'A']++;
            }
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]==0)
            {
                System.out.println("False");
                return ;
            }
        }
        System.out.println("True");
        return;
    }
}
*/
//25.password strength
/* 
public class zoho {
    public static void main(String[] args) {
        String str="Qwertyuiop";
        if(str.length()<6){System.out.println("weak");return;}
        int uc=0,lc=0,d=0,s=0,i=0;
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='a'&&str.charAt(i)<='z')
            {
                lc++;
            }
            else if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
            {
                uc++;
            }
            else if(str.charAt(i)>='0'&&str.charAt(i)<='9')
            {
                d++;
            }
            else
            {
                s++;
            }
        }
        i=0;
        if(uc!=0){i++;}
        if(lc!=0){i++;}
        if(d!=0){i++;}
        if(s!=0){i++;}
        switch(i)
        {
            case 1:
                System.out.println("Weak");
                break;
            case 2:
                System.out.println("Medium");
                break;
            case 3:
                System.out.println("Good");
                break;
            case 4:
                System.out.println("Strong");
                break;
            
        }
    }
}
*/
//26.First Occurrences
// Explanation: The index of P in first string is 7, O is 1, R is 6 and T is 11. The largest range is 1 – 11.
// So print the characters of the first string in this inex range i.e. OHOCORPORAT
/*
public class zoho {
    public static void main(String[] args) {
        String str1="ZOHOCORPORATION",str2="PORT";
        int i=0,j=0,min=99999,max=0;
        while(i<str2.length())
        {
            if(str1.charAt(j++)==str2.charAt(i))
            {
                if(min>(j-1))
                {
                    min=(j-1);
                }
                if(max<(j-1))
                {
                    max=(j-1);
                }
                j=0;
                i++;
            }
            if(j>=str1.length())
            {
                j=0;
                i++;
            }
        }
        System.out.println(min+" "+max);
        for(int k=min;k<=max;k++)
        {
            System.out.print(str1.charAt(k));
        }
        return;
    }
}
*/
//27.
// Matrix Diagonal sum
// Given a matrix print the largest of the sums of the two triangles split by diagonal from top right to bottom left
// I/P:
// 3 3
// 1 2 3
// 4 5 6
// 7 8 9
// O/P: 38
/*
public class zoho {
    public static void main(String[] args) {
        int arr[][]=
        {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        int upper_sum=0,lower_sum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(i<=j)
                {
                    upper_sum+=arr[i][j];
                }
                if(i>=j)
                {
                    lower_sum+=arr[i][j];
                }
            }   
        }
        System.out.print(lower_sum+" "+upper_sum);
    }
}
*/
//28.
// January - 31 days
// February - 28 days in a common year and 29 days in leap years
// March - 31 days
// April - 30 days
// May - 31 days
// June - 30 days
// July - 31 days
// August - 31 days
// September - 30 days
// October - 31 days
// November - 30 days
// December - 31 days


//30.product of each excpect
/* 
public class zoho {
    public static void main(String[] args) {
        int arr[]={1,2,3,4},sum=1;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum*arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(sum/arr[i]+" ");
        }
    }
}
*/
//31.
/* 
public class zoho {
    public static void main(String[] args) {
        int arr[][]=
        {
            {1,2,3,4},
            {4,5,6,5},
            {7,8,9,6},
            {7,8,9,10}
        };
        (0,3)
        (0,2)(1,3)
        (0,1)(1,2)(2,3)
        (0,0)(1,1)(2,2)(3,3)
        (1,0)(2,1)(3,2)
        (2,0)(3,1)
        (3,0)
        int n=3;
        for(int i=0;i<=3;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(arr[j][n+j]+" ");
            }
            n--;
        }
        n=2;
        for(int i=1;i<=3;i++)
        {
            for(int j=0;j<=n;j++)
            {
                System.out.print(arr[i+j][j]+" ");
            }
            n--;
        }
    }
}

*/

/* 
public class zoho
{
    public static void main(String[] args) {
        int ans=0;
        int arr[]={1,1,1,2,2,3};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
*/

/* 
public class zoho {
    public static void main(String[] args) {
        int arr[]=new int[5];
        for(int i=1;i<5;i++){
            arr[i]=(i>>1)+(i&1);
        }
        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
*/

/* 
public class zoho {
    public static void main(String[] args) {
        System.out.println(fn(16));
    }
    static boolean fn(int num)
    {
        if(num==1)
        {
            return true;
        }
        if(num%4!=0)
        {
            return false;
        }
        return !fn(num/4);
    }
}
*/
/* 
public class zoho {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int arr1[]=new int[arr.length*2];
        for(int i=0;i<arr.length;i++)
        {
            arr1[i]=arr1[i+arr.length]=arr[i];
        }
        for(int i=0;i<arr.length*2;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}*/
/* 
public class zoho {
    public static void main(String[] args) {
        int arr[]={1,3,2,5,3};
        int i=0;
        while(i<arr.length)
        {
            int index = arr[i]-1;
            if(arr[i]!=arr[index])
            {
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }
            else
            {
                i++;
            }
        }
        for(i=0;i<arr.length;i++)
        {
            if(i!=arr[i]-1)
            {
                System.out.print(arr[i]+" "+i);
            }
        }
    }
}
*/

//1.linear search
//best case o(1)
//worst case o(n)

//1.
/* 
import java.util.*;
public class MainJava {
    public static void main(String[] args) {
        int arr[][]={
                      {18,12},
                      {9,14},
                      {77,50}
                    },target=12;
        int[] temp=linearSearch(arr, target);
        System.out.println(Arrays.toString(temp));
        System.out.println(Integer.MIN_VALUE+" "+Integer.MMAX _VALUE);
    }
    static int[] linearSearch(int arr[][],int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
              if(arr[i][j]==target)
              {
                   return new int[]{i,j};
              }
            }
        }
        return new int[]{-1,-1};
    }
}
*/
//2.
//1295. Find Numbers with Even Number of Digits (linear search)
/* 
public class MainJava {
    public static void main(String[] args) {
        int arr[]={12,345,2,6,7896,-11,-1222},ctr=0;
        for(int i=0;i<arr.length;i++)
        {
            if(method1(arr[i])%2==0)
            {
                ctr++;
            }
        }
        System.out.println("method1 "+ctr);
        ctr=0;
        for(int i=0;i<arr.length;i++)
        {
            if(method2(arr[i])%2==0)
            {
                ctr++;
            }
        }
        System.out.println("method2 "+ctr);
    }
    static int method1(int num)
    {
        int ctr=0;
        while(num!=0)
        { 
            ctr++;
            num/=10;
        }
        return ctr;
    }
    static int method2(int num)
    {
        if(num<0){num*=-1;}
        return (int)(Math.log10(num))+1;// minus value will not counted
    }
}
*/
//3.
//1672.richest customer wealth (linear search)
/* 
import java.util.Scanner;
public class MainJava 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[][]=
        {
            {1,2,3},
            {3,2,1}
        };
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=0;j<arr[0].length;j++)
            {
                sum+=arr[i][j];
            }
            System.out.print(sum+" ");
        }
    }
}
//output: 6 6
*/
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//2.Binary search
//if the given array is sort use binary search it's more efficient
//best case:o(1)
//worst case:o(log n)
/* 
//1.
public class MainJava {
    public static void main(String[] args) {
        int arr1[]={2,4,6,9,11,12,14,20,36,48},target1=36;
        System.out.println(BinarySearchAscending(arr1, target1));

        int arr2[]={90,75,18,12,6,4,3,1},target2=75 ;
        System.out.println(BinarySearchDescending(arr2, target2));

    }
    static int BinarySearchAscending(int arr[],int target)
    {
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]<target)
            {
                start=mid+1;
            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    static int BinarySearchDescending(int arr[],int target)
    {
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]<target)
            { 
                end=mid-1;
            }
            else if(arr[mid]>target)
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
*/   
//2.
//852. Peak Index in a Mountain Array 
//162. Find Peak Element
/* 
public class MainJava {
    public static void main(String[] args) {
        int arr[]={0,10,5,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr)
    {
        int start=0,end=arr.length-1;
        while(start<end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
        }
        return start;
    }
}
*/
//3.ceiling number (greater or equal to the target elements)
/* 
public class MainJava {
    public static void main(String[] args) {
         int arr[]={2,3,5,9,14,16,18},target=15;
         System.out.println(ceiling(arr, target));//5
         System.out.println(floor(arr, target));//4
    }
    static int ceiling(int arr[],int target)
    {
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else 
            {
                return mid;
            }
        }
        return start;
    }
    static int floor(int arr[],int target)
    {
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else 
            {
                return mid;
            }
        }
        return end;
    }
}
*/
//4.
/* 
744. Find Smallest Letter Greater Than Target
Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.
Example 1:
Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.

Example 2:
Input: letters = ["c","f","j"], target = "c"
Output: "f"
Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.

Example 3:
Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].

public class MainJava {
    public static void main(String[] args) {
        char arr[]={'c','f','j'},target='a';
        System.out.println(nextGreatestLetter(arr, target));//c
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int s=0,e=letters.length-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(letters[mid]>target)
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        return letters[s % letters.length];
    }
}
*/
//5.
//34. Find First and Last Position of Element in Sorted Array
/* 
public class MainJava {
    public static void main(String[] args) {
        int arr[]={5,7,7,7,7,8,8,10},target=7;
        int temp[]=new int[2];
        temp[0]=search(arr, target, true);
        temp[1]=search(arr, target, false);
        System.out.println(temp[0]+" "+temp[1]);// 1 4
    }
    static int search(int arr[],int target,boolean firstindex)
    {
        int ans=-1;
        int start = 0,end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                ans=mid;
                if(firstindex)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
*/
//6.find the peak in moutain array
/*
public class MainJava {
    public static void main(String[] args) {
        int arr[]={3,4,5,6,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start=0,end=arr.length-1;
        while(start<end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else 
            {
                start=mid+1;
            }
        }
        return end; // start and end both are pointing to the answer
    }
}
*/
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//3.bubble sort:
//space complexity:o(1)
//time complexity:o(n^2)
/* 
public class MainJava {
    public static void main(String[] args) {
        int arr[]={3,1,5,4,2};
        sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void sort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    arr[j]=arr[j]*arr[j+1];
                    arr[j+1]=arr[j]/arr[j+1];
                    arr[j]=arr[j]/arr[j+1];
                }
            }
        }
    }
}
*/
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


//1.pattern printing:

//1.
/* 
public class MainJava {
    public static void main(String[] args) 
    {
        int num=5;
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//output:
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * *
 */
//-------------------
//2.
/* 
public class MainJava {
    public static void main(String[] args) 
    {
        int num=5;
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//output:
* 
* *
* * *
* * * *
* * * * *
 */
//-------------------

//3.
/* 
public class MainJava {
    public static void main(String[] args) 
    {
        int num=5;
        for(int i=0;i<num;i++)
        {
            for(int j=1;j<=i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

//output:
1 
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */

//-------------------

//4.
/* 
public class MainJava {
    public static void main(String[] args) 
    {
        int num=5;
        for(int i=1;i<=num;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
//output:
1 
2 2
3 3 3
4 4 4 4
5 5 5 5 5
 */

 //-------------------

//5.
/* 
public class MainJava {
    public static void main(String[] args) 
    {
        int num=5;
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//output:
* * * * * 
* * * *
* * *
* *
*
*/


 //-------------------

//6.

/* 
public class MainJava {
    public static void main(String[] args) 
    {
        int num=5;
        for(int i=0;i<num;i++)
        {
            for(int j=1;j<=num-i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
//output:
1 2 3 4 5 
1 2 3 4
1 2 3
1 2
1
*/

 //-------------------

//7.
/* 
public class MainJava {
    public static void main(String[] args) 
    {
        int num=5;
        for(int i=0;i<num;i++)
        {
            //space
            for(int j=0;j<num-i-1;j++)
            {
                System.out.print("- ");
            }
            //star
            for(int j=0;j<(2*i)+1;j++)
            {
                System.out.print("* ");
            }
            //space
            for(int j=0;j<num-i-1;j++)
            {
                System.out.print("- ");
            }
            System.out.println();
        }
        
    }
}

//output:
- - - - * - - - -   4 1 4
- - - * * * - - -   3 3 3
- - * * * * * - -   2 5 2
- * * * * * * * -   1 7 1
* * * * * * * * *   0 9 0
*/


//-------------------

//8.

/* 
public class MainJava {
    public static void main(String[] args) 
    {
        int num=5;
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("- ");
            }
            for(int j=0;j<(num*2)-(2*i+1);j++)
            {
                System.out.print("* ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print("- ");
            }
            System.out.println();
        }
        
    }
}

//output:
JAVA(ii)\" ; if ($?) { javac MainJava.java } ; if ($?) { java MainJava }
* * * * * * * * *        0  9  0
- * * * * * * * -        1  7  1
- - * * * * * - -        2  5  2
- - - * * * - - -        3  3  3
- - - - * - - - -        4  1  4
*/
//------------------------
//10.
/* 
public class MainJava {
    public static void main(String[] args) {
        int num=5;
        for(int i=0;i<num*2-1;i++)
        {
            int end=i;
            if(i>=num){end=num*2-i-2;}
            for(int j=0;j<=end;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }    
    }
}
//output:


*             1  0
* *           2  1 
* * *         3  2 
* * * *       4  3  
* * * * *     5  4
* * * *       4  5   (10-5-2) 0 to 3
* * *         3  6   (10-6-2) 0 to 2    
* *           2  7   (10-7-2) 0 to 1
*             1  8   (10-8-2) 0 to 0

*/

//----------------------------
//11.

/* 
public class MainJava {
    public static void main(String[] args) {
        int num=5;
        for(int i=0;i<num;i++)
        {
            int start=i%2==0?1:0;
            for(int j=0;j<i+1;j++)
            {
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();
        }
    }
}

//output:
1 
0 1
1 0 1
0 1 0 1
1 0 1 0 1
*/


//----------------------------
//12.

/* 
public class MainJava {
    public static void main(String[] args) {
        int num=5;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            for(int j=1;j<=(num*2)-(2*i);j++)
            {
                System.out.print("- ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

//output: 
1 - - - - - - - - 1     1 8 1
1 2 - - - - - - 2 1     2 6 2
1 2 3 - - - - 3 2 1     3 4 3
1 2 3 4 - - 4 3 2 1     4 2 4
1 2 3 4 5 5 4 3 2 1     5 0 5

*/

//--------------------------------------

//13.
/* 
public class MainJava {
    public static void main(String[] args) {
        int num=5,temp=1;
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print(temp+++" ");
            }
            System.out.println();
        }
    }
}
//output:
1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/


//------------------------------------

//14.
/* 
public class MainJava {
    public static void main(String[] args) {
        int num=5;
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print((char)(65+j)+" ");
            }
            System.out.println();
        }
    }
}
//output:
A 
A B
A B C
A B C D
A B C D E
*/

//----------------------------------------

//15.
/* 
public class MainJava {
    public static void main(String[] args) {
        int num=5;
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num-i;j++)
            {
                System.out.print((char)(65+j)+" ");
            }
            System.out.println();
        }
    }
}
A B C D E 
A B C D
A B C
A B
A
*/

//------------------------------

//16.
/* 

public class MainJava {
    public static void main(String[] args) {
        int num=5;
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)(65+i)+" ");
            }
            System.out.println();
        }
    }
}
A 
B B
C C C
D D D D
E E E E E

*/

//----------------------------------

//17.
/* 
public class MainJava {
    public static void main(String[] args) {
        int num=5;
        
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num-i-1;j++)
            {
                System.out.print("- ");
            }
            char ch='A';
            int breakpoint=(2*i+1)/2;
            for(int j=1;j<=(2*i)+1;j++)
            {
                System.out.print(ch+" ");
                if(j<=breakpoint)
                {
                    ch++;
                }
                else
                {
                    ch--;
                }
            }
            for(int j=0;j<num-i-1;j++)
            {
                System.out.print("- ");
            }
            System.out.println();
        }
    }
}
//output:
- - - - A - - - - 
- - - A B A - - -
- - A B C B A - -
- A B C D C B A -
A B C D E D C B A
*/

//------------------------------------------

//18.
/* 
public class MainJava {
    public static void main(String[] args) {
        int num=5,ch=65+(num-1);
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print((char)(ch+j)+" ");
            }
            ch--;
            System.out.println();
        }
    }
}
//output:
E 
D E
C D E
B C D E
A B C D E
*/

//-------------------------------------------------

//21.
/* 
public class MainJava {
    public static void main(String[] args) {
        int num=5;
        for(int i=0;i<num;i++)
        {
            if(i==0||i==num-1)
            {
                for(int j=0;j<num;j++)
                {
                    System.out.print("* ");
                }
                System.out.println("\n");
            }
            else 
            {
                for(int j=0;j<num;j++)
                {
                    System.out.print(j==0||j==num-1?"* ":"  ");
                }
                System.out.println("\n");
            }

        }
    }
}
//output:
* * * * * 

*       * 

*       * 

*       * 

* * * * *
*/

//-------------------------------------------------

//22.
/* 
public class MainJava {
    public static void main(String[] args) {
        int num=5;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num;j++)
            {
                if(i==j)
                {
                    System.out.print(i);
                }
                else if(j==num-i+1)
                {
                    System.out.print(num-i+1);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
//output:
1   5
 2 4
  3
 2 4
1   5
*/

//--------------------------------------------------
//23.
/* 
public class MainJava {
    public static void main(String[] args) {
        int num=5;
        num=num*2;
        for(int i=0;i<=num;i++)
        {
            for(int j=0;j<=num;j++)
            {
                int temp=Math.min(Math.min(i,j),Math.min(num-i, num-j));
                System.out.print(temp+" ");
            }
            System.out.println();
        }
    }
}
//output:
0 0 0 0 0 0 0 0 0 0 0 
0 1 1 1 1 1 1 1 1 1 0 
0 1 2 2 2 2 2 2 2 1 0 
0 1 2 3 3 3 3 3 2 1 0 
0 1 2 3 4 4 4 3 2 1 0 
0 1 2 3 4 5 4 3 2 1 0 
0 1 2 3 4 4 4 3 2 1 0 
0 1 2 3 3 3 3 3 2 1 0 
0 1 2 2 2 2 2 2 2 1 0 
0 1 1 1 1 1 1 1 1 1 0
*/

//----------------------------------------------------------------------------------------------------------------------------------


//2.basics maths 

//1.count digit:
/* 
public class MainJava {
    public static void main(String[] args)
    {
        int num=1223,ctr=0;
        while(num>0)
        {
            ctr++;
            num/=10;
        }
        System.out.println(ctr);
    }
}
*/
//2.reverse number
/* 
public class MainJava {
    public static void main(String[] args) {
        int num=-123,reverse=0;
        while(num!=0)
        {
            reverse=reverse*10+num%10;
            num/=10;
        }
        System.out.println(reverse);
    }
}
*/
//3.Palindrome Number
/* 
public class MainJava {
    public static void main(String[] args) {
        int num=-121;
        if(num<0)
        {
            System.out.println(false);
            return;
        }
        int reverse=0,N=num;
        while(num!=0)
        {
            reverse=reverse*10+num%10;
            num/=10;
        }
        System.out.println(N==reverse);

    }
}
*/
//4.armstrong number 
/* 
public class MainJava {
    public static void main(String[] args) {
        int num=371,len=(int)(Math.log10(num)+1),sum=0,N=num;
        while(num>0)
        {
            sum=sum+(int)(Math.pow(num%10,len));
            num/=10;
        }
        System.out.println(sum==N?"Yes":"No");//Yes
    }
}
*/
//5.Print all Divisors
/* 
public class MainJava {
    public static void main(String[] args) {
        int num=36;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.print(i+" ");//1 2 3 4 6 9 12 18 36 
            }
        }
    }
}
*/
//6.check for prime
/* 
import java.net.Socket;
class Prime
{
    public int isPrime(int num)
    {
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0){return 0;}
        }
        return 1;
    }
}
public class MainJava {
    public static void main(String[] args) {
        int num=22;
        if(num<=1)
        {
            System.out.print("No a Prime number");
            return;
        }
        Prime obj = new Prime();
        
        System.out.println(obj.isPrime(num)==1?"Prime Number":"Not a Prime Number");
    }
}
*/
//7.GCD (great common Divisor) or HCF Highest common factor
/* 
public class MainJava {
    public static void main(String[] args) {
        int num1=9,num2=12;
        for(int i=Math.min(num1, num2);i>=1;i--)
        {
            if(num1%i==0&&num2%i==0)
            {
                System.out.println(i); // 3
                return;
            }
        }
    }
}
*/

//-----------------------------------------------------------------------------------------------------------------------------------------
//3.recursion-when a function calls itself until a specified condition is met without base condition stack overflow is occur


//1.print name 5 times
/* 
public class MainJava {
    public static void main(String[] args) {
        int num=5;
        function1(num);
    }
    static void function1(int num)
    {
        if(num==0)
        {
            return;
        }
        System.out.print("Hi ");//Hi Hi Hi Hi Hi 
        function1(num-1);//5 4 3 2 1 0
    }
}
*/
//2.print 1 to n
/* 
public class MainJava {
    public static void main(String[] args) {
        function(10, 1);
    }
    static void function(int num,int start)
    {
        if(num<start)
        {
            return;
        }
        System.out.print(start+" ");//1 2 3 4 5 6 7 8 9 10 
        function(num, start+1);
    }
}
*/
//3.print n to 1 and 1 to n
/* 
public class MainJava {
    public static void main(String[] args) {
        int num=5;
        function(num);
    }
    static void function(int num)
    {
        if(num==0)
        {
            return;
        }
        System.out.print(num+" ");// 5 4 3 2 1
        function(num-1); // (5) 4 3 2 1 0
        System.out.print(num+" ");//1 2 3 4 5
    }
}
*/
//4.print 1 to n and  n to 1
/* 
public class MainJava {
    public static void main(String[] args) {
        int num=5;
        function1(1,num);// 1 2 3 4 5
        System.out.println();
        function2(num);// 5 4 3 2 1
    }
    static void function1(int s,int num)
    {
        if(num<s)
        {
            return;
        }
        System.out.print(s+" ");
        function1(s+1, num);
    }
    static void function2(int num)
    {
        if(num==0)
        {
            return;
        }
        System.out.print(num+" ");
        function2(num-1);
    }
}
*/
//5.1 to n using bactracking
/* 
public class MainJava {
    public static void main(String[] args) {
        int num=5;
        function(num);// 1 2 3 4 5
    }
    static void function(int num)
    {
        if(num==0)
        {
            return;
        }
        function(num-1);
        System.out.print(num+" "); 
    }
}
    function(5)   print(5)
        |            |
    function(4)   print(4)
        |            |
    function(3)   print(3)
        |            |
    function(2)   print(2)
        |            |
    function(1)    print(1)
        |            |
        V            |
    function(0) -> (return 0)      
*/
//6. n to 1 using bactracking
/* 
public class MainJava {
    public static void main(String[] args) {
        int num=5;
        function(num);
    }
    static void function(int num)
    {
        if(num==0)
        {
            return;
        }
        System.out.print(num+" ");
        function(num-1);
    }
}
*/
//7.sum of n number
/* 
public class MainJava {
    public static void main(String[] args) {
        int num=5;
        System.out.println(function(num, 0));//15
    }
    static int function(int num,int sum)
    {
        if(num==0)
        {
            return sum;
        }
        //sum=sum+num;  also same
        return function(num-1, sum+num);   
        //             5 0+5
        //             4 5+4
        //             3 9+3
        //             2 12+2
        //             1  14+1
        //             0 (return)
    }
}
*/
//8.sum of n number
/* 
public class MainJava {
    public static void main(String[] args) {
        int num=5;
        System.out.println(function1(num));
    }
    static int function1(int num)
    {
        if(num==0)
        {
            return num;// 0
        }
        return num+function1(num-1);
        // 5+fun(4)                       5+10
        //   4+fun(3)                     4+6
        //      3+fun(2)                  3+3
        //        2+fun(1)                2+1
        //          1+fun(0)-->(return)-->1+0
        //              
    }
}
*/
//9.factorial of n
/* 
public class MainJava {
    public static void main(String[] args) {
        int num=5;
        System.out.println(function1(num));
    }
    static int function1(int num)
    {
        if(num==0)
        {
            return 1;
        }
        return num*function1(num-1);
        // 5+fun(4)                       5*24
        //   4+fun(3)                     4*6
        //      3+fun(2)                  3*2
        //        2+fun(1)                2*1
        //          1+fun(0)-->(return)-->1*1
        //              
    }
}
*/
//10.reverse array
/* 
public class MainJava {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        fun(arr, 0, arr.length-1); // arr 0 6
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void fun(int arr[],int start ,int end)
    {
        if(start>=end)
        {
            return;
        }
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        fun(arr, start+1, end-1);
        // swap(0,6)
        // fun(arr,1,5)
        //          |
        //     swap(1,5)
        //     fun(arr,2,4)
        //            |
        //        swap(2,4)
        //        fun(arr,3,3) --> return 

    }
}
*/
//11.reverse array
/* 
public class MainJava {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        fun(arr, 0); // arr 0 6
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void fun(int arr[],int start)
    {
        if(start>=arr.length/2)
        {
            return;
        }
        int temp=arr[start];
        arr[start]=arr[arr.length-1-start];
        arr[arr.length-1-start]=temp;
        fun(arr, start+1);
    }
}
*/
//12.string palindrome or not
/* 
public class MainJava {
    public static void main(String[] args) {
        String str="malayalam";
        System.out.println(function(str, 0));// true
    }
    static boolean function(String str,int start)
    {
        if(start>=str.length()/2)
        {
            return true;
        }
        if(str.charAt(start)!=str.charAt(str.length()-1-start))
        {
            return false;
        }
        return function(str, start+1);
    }
}
// function("malayalam", 0)
//     |
//     |--- function("malayalam", 1)  // str.charAt(0) == str.charAt(8) ('m' == 'm')
//             |
//             |--- function("malayalam", 2)  // str.charAt(1) == str.charAt(7) ('a' == 'a')
//                     |
//                     |--- function("malayalam", 3)  // str.charAt(2) == str.charAt(6) ('l' == 'l')
//                             |
//                             |--- function("malayalam", 4)  // str.charAt(3) == str.charAt(5) ('a' == 'a')
//                                     |
//                                     |--- function("malayalam", 5)  // start >= str.length()/2 (base case)
//                                             |
//                                             |--- return true
//                                     |
//                                     |--- return true
//                             |
//                             |--- return true
//                     |
//                     |--- return true
//             |
//             |--- return true
//     |
//     |--- return true
*/
//13.multiple recursion calls (fibonacce number)
// 0 1 2 3 4 5 6 
// 0 1 1 2 3 5 8
/* 
public class MainJava {
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
    static int fib(int num)
    {
        if(num<=1)
        {
            return num;
        }
        int last=fib(num-1);
        int slast=fib(num-2);
        return last+slast;
    }
}
*/
//-------------------------------------------------------------------------------------------------------------------------------
//4.Hashing or Mapping

//1.Frequencies of Limited Range Array Elements
/*
// Input:
// N = 5
// arr[] = {2, 3, 2, 3, 5}
// Output:
// 0 2 2 0 1 
public class MainJava {
    public static void main(String[] args) {
        int N=5;
        int arr[]={2,3,2,3,5};
        int temp[]=new int[N+1];
        for(int i=0;i<N;i++)
        {
            temp[arr[i]]++;
        }
        for(int i=1;i<=N;i++)
        {
            System.out.println(i+"-->"+temp[i]);
        }
    }
}
*/

//2. 
// int inside of main size will be a arr[1e6] 1e6 ==> 10^6
// int global declaration is size will be arr[1e7] ==> 10^7
// boolean inside of main size will be a arr[1e7] 1e7 ==> 10^7
// boolena global declaration is size will be arr[1e8] ==> 10^8

//-------------------------------------------------------------------------------------------------------------------------------
//5.sorting
//1.bubble sort
//time complexity:o(n^2)
//space complexity:o(1)
/* 
public class MainJava {
    public static void main(String[] args) 
    {
        int arr[]={13,46,24,52,20,9};
        int len=arr.length;
        bubbleSort1(arr, len);
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void bubbleSort1(int arr[],int len)
    {
        for(int i=len-1;i>=0;i--)
        {
            for(int j=0;j<=i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
*/
//2.selection sorting
//time complexity:o(n^2);
//space complexity:o(1)
/* 
public class MainJava {
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9,0};
        int len=arr.length;
        for(int i=0;i<len;i++)
        {
            int min=i;
            for(int j=i;j<len;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
*/
//3.inselection sort
//time complexity:o(n^2)
//space complexity:o(1)
/* 
public class MainJava {
    public static void main(String[] args) {
        int arr[]={4,5,1,2,3};
        int len=arr.length;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else
                {
                    break;
                }
            }
        }
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
*/
//-------------------------------------------------------------------------------------------------------
//5.arrays
//1.longest second number in  array
/* 
import java.util.*;
public class MainJava {
    public static void main(String[] args) {
        int arr[]={1,23,342,1,12,23};
        System.out.println(longest(arr));
    }
    static int longest(int arr[])
    {
        int f_l=arr[0],s_l=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<f_l)
            {
                s_l=f_l;
                f_l=arr[i];
            }
            else if(arr[i]!=f_l&&arr[i]<s_l)
            {
                s_l=arr[i];
            }
        }
        return s_l;
    }
}
*/
//2.array is sorted or not
/*
public class MainJava {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,1};
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                System.out.println("Array Unsorted");
                return;
            }
        }
        System.out.println("Array is sorted");
    }
}
*/
//3.Left Rotate an array by one place
/* 
public class MainJava 
{
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        int temp=arr[0],i;
        for(i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[i-1]=temp;
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");//2 3 4 5 1 
        }
    }
}
*/
//4.Left rotate an array by D places
/* 
public class MainJava {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9},k=3;
        // 4 5 6 7 8 9 1 2 3
        if(k>=arr.length)
        {
            k=k%arr.length;
        }
        int i=k;
        while(i<arr.length)
        {
            System.out.print(arr[i++]+" ");
        }
        i=0;
        while(i<k)
        {
            System.out.print(arr[i++]+" ");
        }

    }
}
*/
//5.Move Zeros to end
/* 
public class MainJava {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int j=0,z=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0){arr[j++]=arr[i];}
            else{z++;}
        }
        while(j<arr.length)
        {
            arr[j++]=0;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
*/
//6.missing number 
/* 
public class MainJava {
    public static void main(String[] args) {
        int arr[]={3,0,1};
        for(int i=0;i<arr.length;)
        {
            int index=arr[i];
            if(arr[i]<arr.length&&arr[i]!=arr[index])
            {
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }
            else
            {
                i++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=i)
            {
                System.out.println(i);
                return;
            }
        }
        System.out.println(arr.length);
    }
}
//output:2
*/
//7.Maximum Consecutive Ones
/* 
public class MainJava {
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1,0,1,1,1,1,0};
        int ctr=0,max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1){ctr++;}
            else
            {
                if(max<ctr)
                {
                    max=ctr;
                    ctr=0;
                }
            }
            if(i==arr.length-1)
            {
                if(max<ctr)
                {
                    max=ctr;
                }
            }
        }
        System.out.println(max);//4
    }
}

*/
//8.Find the number that appears once, and other numbers twice.
/* 
public class MainJava {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4,5,4,5};
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            temp=temp^arr[i];
        }
        System.out.println(temp); //3
    }
}
*/
//9.longest substring 
/* 
public class MainJava {
    public static void main(String[] args) {
        int A[] = {10, 5, 2, 7, 1, 9};
        int K=15;
        System.out.println(lenOfLongSubarr(A, A.length, K));
    }
    static int lenOfLongSubarr (int A[], int N, int K) {
        int left=0,right=0,max=0;
        long sum=A[0];
        while(right<N)
        {
            while(left<=right&&sum>K)
            {
                sum=sum-A[left];
                left++;
            }
            if(sum==K)
            {
                if(max<right-left+1)
                {
                    max=right-left+1;
                }
            }
            right++;
            if(right<N){sum=sum+A[right];}
        }
        return max;
    }
}
*/
//10.2sum
/* 
import java.util.ArrayList;
import java.util.HashMap;
public class MainJava {
    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        int target=14;
        
        System.out.println(fun(arr, target));// YES

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length-1;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");

    }
    static String fun(int arr[],int target)
    {
        ArrayList <Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            int temp=target-arr[i];
            if(list.contains(temp))
            {
                return "YES";
            }
            list.add(arr[i]);
        }
        return "NO";
    }
}
*/
//11.sorting in 0 1 2
/* 
public class MainJava {
    public static void main(String[] args) {
        int arr[]={0, 2, 1, 2, 0, 1};
        int s=0,i=0,e=arr.length-1;
        while(i<=e)
        {
            if(arr[i]==0)
            {
                int temp=arr[i];
                arr[i]=arr[s];
                arr[s]=temp;
                s++;
                i++;
            }
            else if(arr[i]==2)
            {
                int temp=arr[i];
                arr[i]=arr[e];
                arr[e]=temp;
                e--;
            }
            else if(arr[i]==1)
            {
                i++;
            }
        }
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}
*/
//12.Majority Element n/2
/* 
public class MainJava {
    public static void main(String[] args) {
        int arr[]={2,2,3,3,1,2,2};
        System.out.println(Brute(arr));// 2

        System.out.println(Brute(arr));// 2
    }
    static int Brute(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int ctr=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    ctr++;
                }
            }
            if(ctr>arr.length/2)
            {
                return arr[i];
            }
        }
        return -1;
    }
    static int DryRun(int arr[])
    {
        int element=0,ctr=0;
        for(int i=0;i<arr.length;i++)
        {
            if(ctr==0)
            {
                element=arr[i];
                ctr=1;
            }
            else if(element==arr[i])
            {
                ctr++;
            }
            else
            {
                ctr--;
            }
        }
        return element;
    }

}
*/
//13.Kadane's Algorithm maximum subarray 
/* 
import java.util.*;
public class MainJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        // 4 -1 2 1 ==> 6
        int max=0,sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum>max){max=sum;}
            if(sum<0){sum=0;}
        }
        System.out.println(max);
    }
}
*/
//14.Rearrange Array Elements by Sign positive == negative size
/* 
public class MainJava {
    public static void main(String[] args) {
        int arr[]={3,1,-2,-5,2,-4},e=0,o=1;
        int temp[]=new int[arr.length];
        //  3 -2 1 -5 2 -4
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                temp[e]=arr[i];
                e=e+2;
            }
            else
            {
                temp[o]=arr[i];
                o=o+2;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(temp[i]+" ");
        }
    }
}
*/
//15.Rearrange Array Elements by Sign positive != negative size
/* 
     it's not a posible to do optimal solution so use butte or butter
*/

//16.Leaders in an Array problem
/* 
public class MainJava {
    public static void main(String[] args) {
        int arr[]={10,22,12,3,0,6};
        int max=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(max<arr[i])
            {
                System.out.print(arr[i]+" ");//6 12 22
                max=arr[i];
            }
        }
        //using recursion in java
        System.out.println();
        function(arr, arr.length-1,0);//6 12 22
    }
    static void function(int arr[],int end,int max)
    {
        if(end==-1)
        {
            return;
        }
        if(max<arr[end])
        {
            System.out.print(arr[end]+" ");
            max=arr[end];
        }
        function(arr, end-1, max);
    }
}
*/


//17.Longest Consecutive Sequence
/* 
import java.util.*;
public class MainJava {
    public static void main(String[] args) {
        int arr[]={102,4,100,1,101,3,2,1,1},max=0;
        ArrayList<Integer> array = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!array.contains(arr[i])){array.add(arr[i]);}
        }
        for(int i=0;i<array.size();i++)
        {
            int len=0;
            int element=array.get(i);
            while(array.contains(element))
            {
                len++;
                element++;
            }
            if(max<len){max=len;}
        }
        System.out.println(max);
    }
}
*/

//18.set matrix as zero  
/* 
public class MainJava {
    public static void main(String[] args) {
        int arr[][]=
        {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        setZeroes(arr);
    }
    static void setZeroes(int[][] arr) {
        int col00=1;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==0)
                {
                    //row
                    arr[i][0]=0;
                    //col
                    if(j!=0)
                    {
                        arr[0][j]=0;
                    }
                    else
                    {
                        col00=0;
                    }
                }
            }
        }
        //inside a arr without col1 and row1
        for(int i=1;i<arr.length;i++)
        {
            for(int j=1;j<arr[i].length;j++)
            {
                if(arr[i][0]==0||arr[0][j]==0)
                {
                    arr[i][j]=0;
                }
            }
        }
        if(arr[0][0]==0)
        {
            for(int i=0;i<arr[0].length;i++)
            {
                arr[0][i]=0;
            }
        }
        if(col00==0)
        {
            for(int i=0;i<arr.length;i++)
            {
                arr[i][0]=0;
            }
        }
    }
}
*/
//19.Rotate Image by 90 degree
/* 
public class MainJava {
    public static void main(String[] args) {
        int arr[][]=
        {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int len=arr.length;
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        function(arr);
        System.out.println("----------90-----------");
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        function(arr);
        System.out.println("----------180-----------");
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        function(arr);
        System.out.println("----------270-----------");
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        function(arr);
        System.out.println("----------360-----------");
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void function(int arr[][])
    {
        //transpose
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr[0].length;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        } 
        //reverse
        int len=arr.length;
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len/2;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[i][len-1-j];
                arr[i][len-1-j]=temp;
            }
        }
    }
}
*/
//20.sprial matrix 
/* 
import java.util.ArrayList;
import java.util.List;

public class MainJava {
    public static void main(String[] args) {
        int arr[][]=
        {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
        };
        List<Integer> temp = new ArrayList<Integer>();
        int row_s=0,row_e=arr.length-1,col_s=0,col_e=arr[0].length-1;
        while(row_s<=row_e&&col_s<=col_e)
        {
            for(int i=col_s;i<=col_e;i++)
            {
                temp.add(arr[row_s][i]);
            }
            row_s++;
            for(int i=row_s;i<=row_e;i++)
            {
                temp.add(arr[i][col_e]);
            }
            col_e--;
            if(row_s>row_e||col_s>col_e)
            {
                break;
            }
            for(int i=col_e;i>=col_s;i--)
            {
                temp.add(arr[row_e][i]);
            }
            row_e--;
            for(int i=row_e;i>=row_s;i--)
            {
                temp.add(arr[i][col_s]);
            }
            col_s++;
        }
        for(int i=0;i<temp.size();i++)
        {
            System.out.print(temp.get(i)+" ");
        }
    }
}
*/
//21.pascal triangle
/* 
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> col = new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> row =new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)
                {
                    row.add(1);
                }
                else
                {
                    List<Integer> pre = col.get(i-1);
                    row.add(pre.get(j)+pre.get(j-1));
                }
            }
            col.add(row);
        }
        return col;
        
    }
}
*/
//-------------------------------------------------------------------------------------------------------
//binary search:

//1.binary search in recursion
/* 
public class MainJava {
    public static void main(String[] args) {
        int arr[]={3,4,6,7,9,12,16,17},target=17;
        System.out.println(fun(arr, 0, arr.length-1, target));
    }
    static int fun(int arr[],int start,int end,int target)
    {
        if(start>end)
        {
            return -1;
        }
        int mid=start+(end-start)/2;
        if(target>arr[mid])
        {
            start=mid+1;
            return fun(arr, start, end, target);
        }
        else if(target<arr[mid])
        {
            end=mid-1;
            return fun(arr, start, end, target);
        }
        return mid;
    }
}
*/
//2.Search Insert Position
/* 
public class MainJava {
    public static void main(String[] args) {
        int arr[]={1,3,5,6},target=5;
        int start=0,end=arr.length-1,ans=arr.length;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>=target)
            {
                ans=mid;
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        System.out.println(ans);
    }
}
*/

//3.Search Element in Rotated Sorted Array-I
/* 
public class MainJava {
    public static void main(String[] args)
    {
        int arr[]={7,8,9,1,2,3,4,5,6},target=1;
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start);
            if(arr[mid]==target)
            {
                System.out.println(mid);
                return;
            }
            if(arr[start]<=arr[mid])
            {
                if(arr[start]<=target &&target<=arr[mid])
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            else
            {
                if(arr[mid]<=target &&target<=arr[end])
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
        }
        System.out.println(-1);
    }
}
*/
//4.Minimum in Rotated Sorted Array
/* 
public class MainJava {
    public static void main(String[] args) {
        int arr[]={4,5,1,2,3};
        int start=0,end=arr.length-1;
        int ans=Integer.MAX_VALUE;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[start]<arr[mid])
            {
                ans=Math.min(ans,arr[start]);
                start=mid+1;
            }
            else
            {
                ans=Math.min(ans,arr[mid]);
                end=mid-1;
            }
        }
        System.out.println(ans);
    }
}
*/

//-------------------------------------------------------------------------------------------------------------------------------------
//recursion
//1.Merge sort
/* 
public class MainJava {
    public static void main(String[] args) {
        int arr[] = {38, 27, 43, 3, 9, 82, 10};
        int left = 0, right = arr.length - 1;
        mergesort(arr, left, right);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void mergesort(int arr[], int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergesort(arr, left, mid);
            mergesort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    static void merge(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
*/
//2.pow function 
/* 
public class Main {
    public static void main(String[] args)
    {
        double x=2.00000;
        int n=10;
       System.out.println( myPow(x, n));
    }
    static double myPow(double x, int n)
    {
        double ans = 1.0;
        long nn = n;
        if (nn < 0) nn = -1 * nn;
        while (nn > 0) {
          if (nn % 2 == 1) {
            ans = ans * x;
            nn = nn - 1;
          } else {
            x = x * x;
            nn = nn / 2;
          }
        }
        if (n < 0) ans = (double)(1.0) / (double)(ans);
        return ans;
      }
}
*/
//3.sqrt
/* 
public class Main {
    public static void main(String[] args) {
        int x=4;
        int start=0,end=x;
        int ans=0;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid<=x/mid)
            {
                start=mid+1;
                ans=mid;
            }
            else
            {
                end=mid-1;
            }
        }
        System.out.println(ans);
    }
}
*/

//------------------------------------------------------------------------------------------------------------------------
//bit manipulation in java
//  int x=1 --->            ..000 0001  --->32 bit   
//  long x=1 --->            ..000 0001  --->64 bit           

//1.check if the ith bit is set or not:
/* 
public class Main {
    public static void main(String[] args) {
        int N=13;
        int i=2;
        //left shift
        if( ( N & (1<<2))!=0)
        {
            System.out.println("ith bit is set...." ); 
        }
        else
        {
            System.out.println("ith bit is not set....");
        }
        //right shift
        if( ((N>>2)&1) !=0)
        {
            System.out.println("ith bit is set...." ); 
        }
        else
        {
            System.out.println("ith bit is not set....");
        }
        System.out.println(N); //13
    }
}
*/
//2.get ith bit
/* 
public class Main {
    public static void main(String[] args) {
        int N=13;
        int i=2;
        System.out.println( ((N>>2)&1) );
    }
}
*/
//3.set the ith bit
/* 
public class Main {
    public static void main(String[] args) {
        int N=9;
        int i=2;
        System.out.println( (N|( 1<<i)) );//13
    }
}
*/
//4.clear ith bit 
/* 
public class Main {
    public static void main(String[] args) {
        int N=13;
        int i=2;
        System.out.println( ( N & ~(1<<iv )) );//9
    }
}
*/
//5.toggle the ith bit
/* 
public class Main {
    public static void main(String[] args) {
        int N=13;
        int i=2;
        System.out.println( (N ^ (1<<i)));//7
    }
}
*/
//6.remove the last set bit (right most)
/* 
public class Main {
    public static void main(String[] args) {
        int num=13;
        System.out.println( num&num-1);// 12
    }
}
*/
//7.check if the number is a power 2
/* 
public class Main {
    public static void main(String[] args) {
        int num=15;
        if((num&num-1)==0)
        {
            System.out.println("power 2");
        }
        else
        {
            System.out.println("Not power 2");
        }
    }
}
*/
//8.count set bit in given number
/* 
public class Main {
    public static void main(String[] args) {
        int num=12,ctr=0;
        while(num>0)
        {
            if(num%2==1)
            {
                ctr++;
            }
            num/=2;
        }
        System.out.println(ctr);
        num=12;
        ctr=0;
        while(num>0)
        {
            ctr+=num&1;
            num=num>>1;//num=num/2
        }
        System.out.println(ctr);
        num=12;
        ctr=0;
        while(num!=0)
        {
          num=num&(num-1);
          ctr++;
        }
        System.out.println(ctr);
    }
        //in binary search ---> use (low+high)>>1
}
*/
//9.mininum bit flips to covert the number a to b
/* 
public class Main {
    public static void main(String[] args) {
        int a=10,b=7;
        int ans=a^b;
        //10 --> 1 0 1 0
        //7  --> 0 1 1 1
        //^  --> 1 1 0 1
        int ctr=0;
        while(ans!=0)
        {
            ans=ans&ans-1;
            ctr++;
        } 
        System.out.println(ctr);//3
    }
}
*/
//10.power set (print all subsets)  
/* 
import java.util.*;
pubic class Main {
    public static void main(String[] args) {
        int num = 3;
        int arr[] = {1, 2, 3};
        int subset = 1 << num;
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < subset; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < num; j++) {
                if ((i & (1 << j)) != 0) {
                    temp.add(arr[j]);
                }
            }
            ans.add(temp);
        }

        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
*/ 
//11.single number I
/* 
public class Main {
    public static void main(String[] args) {
        int arr[]={4,1,2,1,2};
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            ans=ans^arr[i];
        }
        System.out.println(ans);//4
    }
}
*/
//12.xor 1 to n
/* 
public class Main {
    public static void main(String[] args) {
        int num=7;
        // num=1    --->       1      ---> 1
        // num=2    --->      1^2     ---> 3   
        // num=3    --->     1^2^3    ---> 0
        // num=4    --->    1^2^3^4   ---> 4
        
        // num=5    --->              ---> 1
        // num=6    --->              ---> 7   
        // num=7    --->              ---> 0
        // num=8    --->              ---> 8
        System.out.println(fun(6));//7
    }
    static int fun(int num)
    {
        if(num%4==1)
        {
            return 1;
        }
        else if(num%4==2)
        {
            return num+1;
        }
        else if(num%4==3)
        {
            return 0;
        }
        else
        {
            return num;
        }
    }
}
*/
//13.xor a to b
/* 
public class Main {
    public static void main(String[] args) {
        int a=4,b=7;
        System.out.println(fun(a-1)^fun(b));//7
    }
    static int fun(int num)
    {
        if(num%4==1)
        {
            return 1;
        }
        else if(num%4==2)
        {
            return num+1;
        }
        else if(num%4==3)
        {
            return 0;
        }
        else
        {
            return num;
        }
    }
}
*/
//divide two integers without using 
/* 
public class Main {
    public static void main(String[] args) {
        int dividend=22,divisor=3;
        int sum=0,ctr=0;
        while(sum+divisor<=dividend)
        {
            ctr++;
            sum+=divisor;
        }
        System.out.println("Div: "+ctr); //7
        System.out.println("Mod: "+(dividend-sum));//1
    }
}
*/
//1.island
/* 
class Solution {
    public int numIslands(char[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    ans+=1;
                    fn(grid,i,j);
                }
            }
        }
        return ans;
    }
    static void fn(char ch[][],int i,int j)
    {
        if(i<0 || i>=ch.length ||j<0||j>=ch[0].length||ch[i][j]=='0')
        {
            return;
        }
        ch[i][j]='0';
        fn(ch,i,j+1);
        fn(ch,i,j-1);
        fn(ch,i+1,j);
        fn(ch,i-1,j);
    }
}
*/
//2.time to buy and sell
/* 
class Solution {
    public int maxProfit(int[] prices) {
        int minsharebuy=prices[0],maxprofit=0;
        for(int i=1;i<prices.length;i++)
        {
            int cost = prices[i]-minsharebuy;
            if(cost>maxprofit)
            {
                maxprofit=cost;
            }
            if(minsharebuy>prices[i])
            {
                minsharebuy=prices[i];
            }
        }
        return maxprofit;
    }
}
*/
//3.jump game
/* 
public class Main {
    public static void main(String[] args) {
        int arr[]={2,3,1,1,4};
        int step=arr[i];
        for(int i=1;i<arr.length;i++)
        {
            step--;
            if(step<0)
            {
                System.out.println("TRUE");
                break;
            }
            if(i==arr.length-1)
            {
                System.out.println("FALSE");
                break;
            }
            if(step<arr[i])
            {
                step=arr[i];
            }
        }
        System.out.println(step);
    }
}
*/
//4.
/* 
class Solution {
    public int romanToInt(String s) {
        Map <Character,Integer> temp = new HashMap<>();
        temp.put('I',1);
        temp.put('V',5);
        temp.put('X',10);
        temp.put('L',50);
        temp.put('C',100);
        temp.put('D',500);
        temp.put('M',1000);
        int i,result=temp.get(s.charAt(s.length()-1));
        for(i=s.length()-2;i>=0;i--)
        {
            if(temp.get(s.charAt(i))<temp.get(s.charAt(i+1)))
            {
                result-=temp.get(s.charAt(i));
            }
            else 
            {
                result+=temp.get(s.charAt(i));
            }
        }
        return result;
     }
}
*/

//---------------------------------------------------------------------------------------------------------------------
//two pointer
//1.constant window
/* 
    longest sub sum in size of k 
    arr[]={-1,2,3,3,4,5,-1};
    k=4;
public class Main {
    public static void main(String[] args) {
        int arr[]={-1,2,3,3,4,5,-1};
        //          -1 2 3 3 => 7
        //             2 3 3 4 => 12
        //               3 3 4 5 => 15
        //                 3 4 5 -1 ==> 11
        int k=4,sum=0,j=0;
        k--;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(i>=k)
            {
                System.out.println(sum);
                sum=sum-arr[j];
                j++;
            }
        }
    }
}
*/
//2.longest subarray/substring sum<=k retur size of max len
/* 
public class Main {
    public static void main(String[] args) {
        int arr[]={2,5,1,7,10},k=14,max=0;
        int sum=0;
        //  2                ==> 1 
        //  2+5=7            ==> 2 
        //  2+5+1=8          ==> 3 
        //  2+5+1+7=15       ==> 4 X
        //    5              ==> 1
        //    5+1            ==> 2
        //    5+1+7=13       ==> 3
        //    5+1+7+10=23    ==> 3 X
        //    1              ==> 1
        //    1+7            ==> 2
        //    1+7+10=18      ==> 3 X
        //    7              ==> 1
        //    7+10           ==> 2 X
        //    10             ==> 1  
        //1.brute
        //tc - o(n^2)
        //sp - o(1)
        for(int i=0;i<arr.length;i++)
        {
            sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum+=arr[j];
                if(sum<=k)
                {
                    max=Math.max(max, j-i+1);
                }
            }
        }
        System.out.println("Brute: "+max);
        //2.better
        // tc - o(2N)
        // sp - o(1)
        int arr1[]={2,5,1,10,10};
        int l=0,r=0;
        sum=0;
        max=0;
        while (r<arr1.length) 
        {
            sum+=arr[r];
            while(sum>k)
            {
                sum=sum-arr[r];
                l++;
            }
            if(sum<=k)
            {
                max=Math.max(max, r-l+1);
            }
            r++;    
        }
        System.out.println("Better: "+max);
        //3.optimal
        int arr2[]={2,5,1,10,10};
        l=0;
        r=0;
        sum=0;
        max=0;
        while(r<arr2.length)
        {
            sum+=arr[r];
            if(sum>k)
            {
                sum=sum-arr[r];
                l++;
            }
            if(sum<=k)
            {
                max=Math.max(max, r-l+1);
            }
            r++;   
        }
        System.out.println("optimal: "+max);
    }
}
*/
//3.maximum points you can obtain form the cards 
/*
public class Main {
    public static void main(String[] args) {
        // time complexity : o(2*k)
        // space complexity: o(1)
        int arr[]={6,2,3,4,7,2,1,7,1},k=4;
        int leftsum=0,rightsum=0;
        int i;
        for(i=0;i<k;i++)
        {
            leftsum+=arr[i];
        }
        int max=leftsum;
        int j=arr.length-1;
        for(i=k-1;i>=0;i--)
        {
            leftsum=leftsum-arr[i];
            // 6+2+3 ==> 11
            // 6+2   ==> 8 
            // 6     ==> 6
            // 0     ==> 0
            rightsum=rightsum+arr[j];
            // 1       ==> 1
            // 1+7     ==> 8
            // 1+7+1   ==> 9
            // 1+7+1+2 ==> 11 
            j=j-1;
            System.out.println(leftsum+rightsum);
            max=Math.max(max,leftsum+rightsum);// 11+1,8+8,6+9,0+11 ==> 12,16,15,11
        }
       System.out.println("Maximum is :"+max);
    }
}
*/
//4.longest substring without repeating characters
/*  
public class Main {
    public static void main(String[] args) {
        String str="cadbzabcd"; 
        //          cadbz
        //           adbz
        //            dbza
        //             bza
        //               zabcd
        //                abcd
        //1.brute
        //time complexity:o(n^2)
        //space complexity:o(256)
        int max=0;
        for(int i=0;i<str.length();i++)
        {
            boolean arr[]=new boolean[256];
            for(int j=i;j<str.length();j++)
            {
                if(arr[str.charAt(j)])
                {
                    break;
                }
                max=Math.max(max,j-i+1);
                arr[str.charAt(j)]=true;
            }
        }
        System.out.println("1.brute: "+max);
        int l=0,r=0;
        max=0;
        int arr[]=new int[256];
        while(r<str.length())
        {
            if(arr[str.charAt(r)]!=0)
            {
                if(arr[str.charAt(r)]>=l)
                {
                    l=arr[str.charAt(r)]+1;
                }

            }
            max=Math.max(max,r-l+1);
            arr[str.charAt(r)]=r;
            r++; 
        }
        System.out.println("1.optimal: "+max);
        
    }
}
*/
//4.Max consecutive ones (longest subarray with at most k zero)
/* 
public class Main {
    public static void main(String[] args) {
        int arr[]={1,1,1,0,0,0,1,1,1,1,0};
        int k=2,max=0;
        //1.brute
        //tc:o(n^2)
        //sc:o(1)
         for(int i=0;i<arr.length;i++)
        {
            int K=k,ctr=0;
            for(int j=i;j<arr.length;j++)
            {
                if(arr[j]==1)
                {
                    ctr++;
                    System.out.print(arr[j]+" ");
                }
                else if(arr[j]==0&&K!=0) 
                {
                    ctr++;
                    K=K-1;
                    System.out.print(arr[j]+" ");
                }
                else
                {
                    if(max<ctr){max=ctr;}
                    break;
                }
            }
            System.out.println();
            // 0 0
            // 0 0 1 1 1 1
            // 0 1 1 1 1 0
            // 1 1 1 1 0
            // 1 1 1 0
            // 1 1 0
            // 1 0
            // 0
            //2.optimal
            
        }
        System.out.println("1.brute:"+max);
        int left=0,right=0,zero=0;
        max=0;
        while(right<arr.length)
        {
            if(arr[right]==0)
            {
                zero++;
            }
            if(zero>k)
            {
                if(arr[left++]==0)
                {
                    zero--;
                }
            }
            if(zero<=k)
            {
                max=Math.max(max,right-left+1);
            }
            right++;
        }
        System.out.println("2.Optimal: "+max);
        
    }
}
*/

//5.Sum of Square Numbers
/* 
Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.
Example 1:
    Input: c = 5
    Output: true
    Explanation: 1 * 1 + 2 * 2 = 5
Example 2:
    Input: c = 3
    Output: false

public class Main {
    public static void main(String[] args) {
        int num=2;
        System.out.println(judgeSquareSum(num));
    }
    static boolean judgeSquareSum(int c) {
        long right=(int)(Math.sqrt(c)),left=0;
        while(left<=right)
        {
            long sum = (left*left)+(right*right);
            if( sum > c)
            {
                right--;
            }
            else if ( sum < c )
            {
                left++;
            }
            else 
            {
                return true;
            }
        }
        return false;
    }
}
*/

//6.Fruit Into Baskets (leetcode:904)
// two basket contains only unique fruits
/* 
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int arr[]={3,3,3,1,2,1,1,2,3,3,4};
        int max=0;
        //1.brute 
        //tc:o(n^2)
        //sc:o(3)
        for(int i=0;i<arr.length;i++)
        {
            Set<Integer>temp=new HashSet<>();
            for(int j=i;j<arr.length;j++)
            {
                temp.add(arr[j]);
                if(temp.size()<=2)
                {
                    max=Math.max(max,j-i+1);
                }
                else
                {
                    break;
                }
            }
        }
        System.out.println(max);
        //2.
    }
}
*/
//7.longest substring with at most k distinct character
/* 
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String str="aabbccd";
        int k=2,max=0;
        //1.brute
        //tc:o(n^2)
        //sc:o(3)
        for(int i=0;i<str.length();i++)
        {
            Set<Character>temp=new HashSet<>();
            for(int j=i;j<str.length();j++)
            {
                temp.add(str.charAt(j));
                if(temp.size()<=k)
                {
                    max=Math.max(max, j-i+1);
                }
                else
                {
                    break;
                }
            }
        }
        System.out.println("1.brute: "+max); 
        int i = 0;
        // aabbccd 
        Map<Character, Integer> map = new HashMap<>();
        for (int j = 0; j < str.length(); j++) 
        {
            char ch = str.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            while (map.size() > k)
            {
                char leftChar = str.charAt(i);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                i++;
            }
            max = Math.max(max, j - i + 1);
        }
        System.out.println(max);
    }
}
*/
//number of substring containing all three character
/* 
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String str="bbacba";
        int k=3,max=0;
        //1.brute
        for(int i=0;i<str.length();i++)
        {
            Set<Character> temp = new HashSet<>();
            for(int j=i;j<str.length();j++)
            {
                temp.add(str.charAt(j));
                if(temp.size()<=k)
                {
                    max=Math.max(max, j-i+1);
                }
                else
                {
                    break;
                }
            }
        }
        System.out.println(max);
        //2.two pointers
        int i = 0;
        // bba 
        Map<Character, Integer> map = new HashMap<>();
        for (int j = 0; j < str.length(); j++) 
        {
            char ch = str.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            while (map.size() > k)
            {
                char leftChar = str.charAt(i);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                i++;
            }
            max = Math.max(max, j - i + 1);
        }
        System.out.println(max);
    }
}
*/
//binary subarray with sum is equal to goal count it
/* 
public class Main {
    public static void main(String[] args) {
        int arr[]={1,0,0,1,1,0};
        int goal=2;
        int l=0,r=0,sum=0,ctr=0;
        while(r<arr.length)
        {
            sum+=arr[r];
            while(sum>goal)
            {
                sum=sum-arr[l];
                l++;
            }
            ctr=ctr+(r-l+1);
            r++;
        }
        System.out.println(ctr);
    }
}
*/
//count the number of nice subarray 
// mean that k the subarraya contains only k odd number
/* 
public class Main {
    public static void main(String[] args) {
        int arr[]={1,1,2,1,1},k=3;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i]%2==1?1:0;
        }
        int l=0,r=0,sum=0,ctr=0;
        while(r<arr.length)
        {    
            sum+=arr[r];
            while(sum>r)
            {
                sum=sum-arr[l];
                l++;
            }
            ctr++;
            r++;
        }
        System.out.println(ctr);
    }
}
*/
//----------------------------------------------------------------------------------------------------------------------------
//greedy algorithm:

//1.assign cookies:
/* 
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        int greed[]={1,5,3,3,4};//children
        int s[]={4,2,1,2,1,3};//cookies
        //assign cookies by the children<=cookies
        Arrays.sort(greed);
        Arrays.sort(s);
        int children=0,cookies=0;
        while(cookies<s.length&&children<greed.length)
        {
            if(s[cookies]>=greed[children])
            {
                children++;
                cookies++;
            }
            else
            {
                cookies++;
            }
        }
        System.out.println(children);
    }
}
*/
//2. 860.Lemonade Change lemon cost ($5)
/* 
public class Main 
{
    public static void main(String[] args) 
    {
        int arr[]={5,5,5,10,20};
        int five=0,ten=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==5)
            {
                five++;
            }
            else if(arr[i]==10)
            {
                ten++;
                if(five>=1)
                {
                    five--;
                }
                else
                {
                    System.out.println("False");
                    return;
                }
            }
            else 
            {
                if(five>=3)
                {
                    five=five-3;
                }
                else if(five>=1&&ten>=1)
                {
                    five--;
                    ten--;
                }
                else
                {
                    System.out.println("False");
                    return;
                }
            }
        }
        System.out.println("True");
    }
}
*/
//3.shortest job first:
/* 
import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        int arr[]={4,3,7,1,2};
        Arrays.sort(arr);
        int waiting_time=0,sum_of_wating_time=0;
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.print(waiting_time+" ");
            waiting_time=waiting_time+arr[i];
            sum_of_wating_time+=waiting_time;
        } 
        System.out.println();
        System.out.println(waiting_time+" "+sum_of_wating_time);
        System.out.println(sum_of_wating_time/arr.length);
    }
}
*/
//1.Reverse Paris leetcode:492

public class Main {
    public static void main(String[] args) {
        int arr[]={40,25,19,12,9,6,2},ctr=0;
        //  2 6 9 12 19 25 40
        brute(arr);
    } 
    static int brute(int arr[])
    {
        int ctr=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>(arr[j]*2))
                {
                    System.out.println(arr[i]+" "+arr[j]);
                    ctr++;
                }
            }
        }
        return ctr;
    }
}




















//-------------------------------------------------------------------------------------------------------
//5.String:

//1.
//1021.remove outer most element:
// Input: s = "(()())(())"
// Output: "()()()"
/* 
public class MainJava {
    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())"));//()()()
    }
    static String removeOuterParentheses(String s) {
        String str="";
        boolean temp=false;
        for(int i=0,ctr=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                ctr++;
            }
            else
            {
                ctr--;
            }
            if(ctr==2&&s.charAt(i)=='(')
            {
                temp=true;
            }
            else if(ctr==0&&s.charAt(i)==')')
            {
                temp=false;
            }
            if(temp)
            {
                str+=s.charAt(i);
            }
        }
        return str;
    }
}
*/
//2.reverse word in recursion:
/* 
public class MainJava {
    public static void main(String[] args) {
        String str[]={"the","End","Of","Year"};
        function(str, 0);
        for(int i=0;i<str.length;i++)
        {
            System.out.print(str[i]+" ");//Year Of End the 
        }
    }
    static void function(String str[],int i)
    {
        if(i>=str.length/2)
        {
            return;
        }
        String temp=str[i];
        str[i]=str[str.length-1-i];
        str[str.length-1-i]=temp;
        function(str, i+1);
    }
}
*/
//3.1903. Largest Odd Number in String
/* 
public class MainJava {
    public static void main(String[] args) {
        int num=1231242322;
        while(num>0)
        {
            if((num&1)==1)
            {
                System.out.print(num);//12312423
                return;
            }
            num/=10;
        }
    }
}
*/
//4.Longest Common Prefix
/* 
public class MainJava {
    public static void main(String[] args) {
        String str[]={"flower","flow","flight"};
        int min=0;
        for(int i=0;i<str.length;i++)
        {
            if(min>str[i].length())
            {
                min=str[i].length();
            }
        }
        String temp1="";
        for(int i=0;i<min;i++)
        {
            String temp2="";
            for(int j=0;j<str.length;j++)
            {
                if(str[i].charAt(0)==str[j].charAt(j))
                {
                    temp2+=str[j].charAt(i);
                }
                else
                {
                    break;
                }
            }
            if(temp2.length()>temp1.length())
            {
                temp1=temp2;
            }
        }
        System.out.println(temp1);;
    }
}
*/

//1.Program to print the diamond shape
/* 
public class javasoho1 
{
    public static void main(String[] args) 
    {
        int num=5;
        diamond_shape1(num);
        diamond_shape2(num);
    }
    static void diamond_shape1(int num)
    {
        for(int i=1;i<=num*2;i++)
        {
            for(int j=1;j<=num;j++)
            {
                if(i<=num)
                {
                    System.out.print(j<=num-i?" ":"* ");
                }
                else
                {
                    System.out.print(j<=(i%(num+1))?" ":"* ");
                }
            }
            System.out.println();
        }
    }
    static void diamond_shape2(int num)
    {
        for(int i=1;i<=num*2;i++)
        {
            for(int j=1;j<=num;j++)
            {
                System.out.print( i<=num ?j<=num-i?" ":"* ":j<=(i%(num+1))?" ":"* ");
            }            
            System.out.println();
        }
    }
}
*/
//2.Make a Distinct Digit Array
// Input: nums = [131, 11, 48]
// Output: 1 3 4 8
/* 
public class javasoho1 
{
    public static void main(String[] args)
    {
        int Array1[]={131,11,48};
        simple1(Array1);
    }
    static void simple1(int arr[])
    {
        int Distinct_Digit_Array[]=new int[10];
        for(int i:arr)
        {
            int number=i;
            while(number>0)
            {
                Distinct_Digit_Array[number%10]++;
                number/=10;
            }
        }
        for(int i=0;i<10;i++)
        {
            System.out.print(Distinct_Digit_Array[i]!=0?i+" ":"");
        }
    }

}
*/
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//1.Pangram Checking
/* 
Check whether all english alphabets are present in the given sentence or not
I/P: abc defGhi JklmnOP QRStuv wxyz
O/P: True
I/P: abc defGhi JklmnOP QRStuv
O/P: False

public class javasoho1 
{
    public static void main(String[] args) 
    {
        String str="abc defGhi JklmnOP QRStuv wxyz";
        int arr[]=new int[26];
        for(char i:str.toCharArray())
        {
            if(i>='a'&&i<='z')
            {
                arr[i-'a']++;
            }
            else if(i>='A'&&i<='Z')
            {
                arr[i-'A']++;
            }
        }
        for(int i=0;i<13;i++)
        {
            if(arr[i]==0||arr[25-i]==0)
            {
                System.out.println("False");
                return;
            }
        }
        System.out.println("True"); //True
    }
}
*/

//2. First Occurrences
/* 
    Given two strings, find the first occurrence of all characters of second string in the first string and
    print the characters between the least and the highest index
    I/P: ZOHOCORPORATION PORT
    O/P: OHOCORPORAT

public class javasoho1 
{
    public static void main(String[] args) 
    {
        char str1[]="ZOHOCORPORATION".toCharArray(),str2[]="PORT".toCharArray();
        //O(m*n)
        Brute(str1, str2); //1 11
        //O(m+n)
        Optimal(str1, str2);//1 11
    }
    static void Brute(char[] str1,char[] str2)
    {
        int len=str1.length-1;
        int left=0,right=0,min=9999,max=0;
        while(right<str2.length)
        {
            if(str1[left]==str2[right])
            {
                max=Math.max(max, left);
                min=Math.min(min, left);
                right++;
                left=0;
            }
            left++;
        }
        System.out.println(min+" "+max);
    }
    static void Optimal(char[] str1,char[] str2)
    {
        int arr[]=new int[26],min=9999,max=0;
        for(int i=0;i<str1.length;i++)
        {
            if(arr[str1[i]-'A']==0)
            {
                arr[str1[i]-'A']=-1*i;
            }
        }
        for(int i=0;i<str2.length;i++)
        {
            if(arr[str2[i]-'A']<0)
            {
                max=Math.max(max, -1*arr[str2[i]-'A']);
                min=Math.min(min, -1*arr[str2[i]-'A']);
            }
        }
        System.out.println(min+" "+max);
    }
}
*/

//3.Matrix diagonal sum
/* 
public class javasoho1 
{
    public static void main(String[] args) 
    {
        int arr[][]=
        {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        upper_lower(arr); // 1+2+3+5+6+9=
    }
    static void upper_lower(int arr[][])
    {
        int upper_sum=0;
        int lower_sum=0;
        int i=0,j=0;
        while (i<arr.length) 
        {
            if(i<=j)
            {
                lower_sum+=arr[i][j];
            }
            if(i>=j)
            {
                upper_sum+=arr[i][j];
            }
            j++;
            i=j>=arr.length?++i:i;
            j=j>=arr.length?0:j;
        }
        System.out.println(upper_sum+" "+lower_sum);
    }
}
*/
/* 
public class javasoho1 
{
    public static void main(String[] args) 
    {
        int i=0,j=0;
        int arr[]={1,2,23,23,1,234234,-11};
        BubbleSort(arr);
        for(int temp:arr)
        {
            System.out.print(temp+" ");
        }
        System.out.println();
        BubbleSort2(arr);
        for(int temp:arr)
        {
            System.out.print(temp+" ");
        }
        System.out.println();
        

    }
    static void BubbleSort(int arr[])
    {
        int i=0,j=0;
        int len=arr.length;
        while (i<(len-1))
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            j++;
            if(j>=len-i-1)
            {
                j=0;
                i++;
            }
        }
    }
    static void BubbleSort2(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
*/

//5. Matrix Addition
/* 
        Given n integer arrays of different size, find the addititon of numbers represented by the arrays
        I/P: 4
        3 5 4 2
        2 4 5
        4 5 6 7 8
        4 9 2 1
        1 2
        O/P: 50856

import java.util.Scanner;
public class javasoho1 
{
    public static void main(String[] args) 
    {
        int num=4;    
        System.out.println(Brute(num));
    }
    static int Brute(int num)
    {
        Scanner scan = new Scanner(System.in);
        int sum=0;
        for(int i=0;i<num;i++)
        {
            String str=scan.nextLine();
            int temp=0;
            for(char ch:str.toCharArray())
            {
                if(ch>='0'&&ch<='9')
                {
                    temp=temp*10+(int)(ch-'0');
                }
            }
            System.out.println(temp+" ");
            sum+=temp;
        }
        return sum;
    }
}
*/


//5. Cricket Scores
/* 
    Given a timeline of scores, find the individual scores of player 1 and player 2 and Extras
    W – Wide N – No Ball . – Dot Ball
    Consider the game starts from player 1
    I/P:
    1 . 2 . 4 3 6 W 1 . N . 2 1
    O/P:
    P1 – 8
    P2 – 12
    Extras – 2

public class sohomain
 {
    public static void main(String[] args) {
        String input = "1 . 2 . 4 3 6 W 1 . N . 2 1";
        String[] timeline = input.split(" ");
        int p1Score = 0, p2Score = 0, extras = 0;
        boolean isPlayer1 = true;
        for (String event : timeline) {
            switch (event) {
                case ".":
                    break;
                case "W":
                    extras++;
                    break;
                case "N":
                    extras++;
                    break;
                default:
                    int runs = Integer.parseInt(event);
                    if (isPlayer1) {
                        p1Score += runs;
                    } else {
                        p2Score += runs;
                    }
                    if (runs % 2 != 0) {
                        isPlayer1 = !isPlayer1;
                    }
                    break;
            }
        }

        System.out.println("P1 - " + p1Score);
        System.out.println("P2 - " + p2Score);
        System.out.println("Extras - " + extras);
    }
}
*/

//6.shuffle an array
/* 
import java.util.*;
public class sohomain 
{
    public static void main(String[] args)
    {
         int num=3;
         Scanner scan = new Scanner(System.in);
         for(int i=0;i<num;i++)
         {
            int s=scan.nextInt(),e=scan.nextInt();
            int arr[]=new int[e-s+1];
            for(int j=s;j<=e;j++)
            {
                arr[j-s]=j;
            }
            shuffleArray(arr);
            for(int temp:arr)
            {
                System.out.print(temp+" ");
            }
            System.out.println();
         }
    }
    static void shuffleArray(int[] arr) 
    {
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1); // Random index from 0 to i
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
*/
//-------------------------------------------------------------------------------------------------------

//7.
/* 
public class Main {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4, 6},
            {5, 3, 8, 1, 2},
            {4, 6, 7, 5, 5},
            {2, 4, 8, 9, 4}
        };
        
        int x1 = 2, y1 = 0; // Top-left corner index
        int x2 = 3, y2 = 4; // Bottom-right corner index
        
        printSubmatrix(mat, x1, y1, x2, y2);
    }
    
    static void printSubmatrix(int[][] mat, int x1, int y1, int x2, int y2) {
        // Check if indices are valid
        if (x1 < 0 || x1 >= mat.length || y1 < 0 || y1 >= mat[0].length ||
            x2 < 0 || x2 >= mat.length || y2 < 0 || y2 >= mat[0].length) {
            System.out.println("Invalid indices.");
            return;
        }
        
        // Swap indices if necessary to ensure x1 <= x2 and y1 <= y2
        if (x1 > x2) {
            int temp = x1;
            x1 = x2;
            x2 = temp;
        }
        if (y1 > y2) {
            int temp = y1;
            y1 = y2;
            y2 = temp;
        }
        
        // Print the submatrix
        System.out.println("Rectangle");
        int sum = 0;
        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                System.out.print(mat[i][j] + " ");
                sum += mat[i][j];
            }
            System.out.println();
        }
        System.out.println("sum " + sum);
    }
}
*/

//-----------------------------------------------------------------------------------------------
//8.
/* 
public class DateDifference {

    static int[] monthDays = {31, 28, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};

    static boolean isLeap(int year) {
        // If a year is multiple of 400 or (multiple of 4 and not multiple of 100), it's a leap year
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }


    static int countDays(int d, int m, int y) {
        int days = y * 365 + d;

        for (int i = 0; i < m - 1; i++) {
            days += monthDays[i];
        }

        for (int i = 1; i < y; i++) {
            if (isLeap(i)) {
                days++;
            }
        }

        return days;
    }

    // Function to calculate difference in days between two dates
    static int getDifference(int d1, int m1, int y1, int d2, int m2, int y2) {
        // Get total days from 01-Jan to both dates
        int days1 = countDays(d1, m1, y1);
        int days2 = countDays(d2, m2, y2);

        // Return the absolute difference
        return Math.abs(days2 - days1);
    }

    // Main method to test the functions
    public static void main(String[] args) {
        // Example dates
        int d1 = 1, m1 = 2, y1 = 2004; // 01-Feb-2000
        int d2 = 6, m2 = 2, y2 = 2004; // 01-Feb-2004

        // Calculate and print the difference in days
        System.out.println("Difference between two dates is " +
                getDifference(d1, m1, y1, d2, m2, y2));
    }
}
*/
//------------
//9.Print longest sequence between same character
/* 
    Ex I/p abcccccbba
    O/p 8 (from a to a)
    I/p aaaaaaaa
    O/p 6

public class ZOHO
{
    public static void main(String[] args)
    {
        System.out.println(longestSequenceBetweenSameCharacters("abcccccbba")); // 8  a to a 
    }
    static int longestSequenceBetweenSameCharacters(String str) 
    {
        int maxLength = 0;
        int len = str.length();

        // Iterate through each character in the string
        for (int i = 0; i < len; i++) {
            char currentChar = str.charAt(i);

            // Find the last occurrence of the current character
            int lastIndex = str.lastIndexOf(currentChar);

            // Calculate the length of the sequence between the first and last occurrence
            if (lastIndex != i) {
                int sequenceLength = lastIndex - i + 1;
                maxLength = Math.max(maxLength, sequenceLength);
            }
        }

        return maxLength;
    }   
}
*/

//------------
//10.sort the array odd numbers in ascending and even numbers in descending.
// I/p 5 8 11 6 2 1 7
// O/p 1 5 7 11 8 6 2
/* 
import java.util.*;
public class ZOHO
{
    public static void main(String[] args) {
        int arr[]={5,8,11,6,2,1,7},odd=0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i]%2==1?arr[i]:-1*arr[i];
            if(arr[i]%2==1){odd++;}
        }  
        Arrays.sort(arr);
        for(int i=odd-1;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length-odd;i++)
        {
            System.out.print(-1*arr[i]+" ");
        }
    }
}
*/

//---------------
//11.
/* 
public class ZOHO 
{
    public static void main(String[] args) 
    {
        String str[]={"catch", "got", "tiger", "mat", "eat", "pat", "tap", "tea"};
        String word="ate"; 
        functions(str, word);
    }
    static void functions(String str[],String word)
    {
        int arr[]=new int[26];
        for(int i=0;i<word.length();i++)
        {
            arr[word.charAt(i)-'a']++;
        }
        for(int i=0;i<str.length;i++)
        {
            if(word.length()==str[i].length())
            {
                int temp[]=new int[26];
                char ch1[]=str[i].toCharArray();
                for(char j:ch1)
                {
                    temp[j-'a']++;
                }
                for(int j=0;j<26;j++)
                {
                    if(arr[j]!=temp[j])
                    {
                        temp[0]=-123;
                        break;
                    }
                }
                if(temp[0]!=-123)
                {
                    System.out.println(str[i]+" ");
                }
            }
        }
    }
}
*/

//---------------
//12.4.array of numbers were given to find a number which has same sum of numbers in it’s either side.
// I/p 1, 2, 3, 7, 6
// O/p 7(has 1+ 2+3 in left 6 in right)
/* 
public class ZOHO 
{
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,7,6};
        int totalsum=0;
        for(int i:arr)
        {
            totalsum+=i;
        }
        int leftsum=0;
        for(int i:arr)
        {
            totalsum=totalsum-i;
            if(totalsum==leftsum)
            {
                System.out.println(i);
                return;
            }
            leftsum+=i;
        }    
    }
}
*/

//---------------
//13.1) To find the odd numbers in between the range.
// Input:
// 2
// 15
// Output:
// 3,5,7,9,11,13
/* 
public class ZOHO 
{
    public static void main(String[] args) 
    {
        int s=2,o=15;
        s=s%2==0?s+1:s;
        o=s%2==0?o-1:o;  
        functions(s, o); 
    }
    static void functions(int s,int e)
    {
        if(s>=e)
        {
            return;
        }
        System.out.print(s+" ");
        functions(s+2, e);
    }
}
*/
//-------------------------------------------------------------------------------
//14.Sort even-placed elements in increasing and odd-placed in decreasing order
// Let given array: arr[] = {0, 1, 2, 3, 4, 5, 6, 7}
// Array after multiplying by -1 to even placed elements: arr[] = {0, 1, -2, 3, -4, 5, -6, 7}
// Array after sorting: arr[] = {-6, -4, -2, 0, 1, 3, 5, 7}
// Array after reverting negative values: arr[] = {6, 4, 2, 0, 1, 3, 5, 7}
// After reversing the first half of array: arr[] = {0, 2, 4, 6, 1, 3, 5, 7}
// After reversing the second half of array: arr[] = {0, 2, 4, 6, 7, 5, 3, 1}



//---------------------------------------------------------------------------------
//15.To find the factors of the numbers given in an array and to sort the numbers in descending order according to the factors present in it.
// Input:
// Given array : 8, 2, 3, 12, 16
// Output:
// 12, 16, 8, 2, 3
/* 
public class ZOHO 
{
    public static void main(String[] args) 
    {
        int arr[]={8,2,3,12,16};
        int temp[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            temp[i]=factorsCount(arr[i]);
        }
        for(int i=0;i<temp.length-1;i++)
        {
            for(int j=0;j<temp.length-1-i;j++)
            {
                if(temp[j]>temp[j+1])
                {
                    int t=temp[j];
                    temp[j]=temp[j+1];
                    temp[j+1]=t;
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    static int factorsCount(int num)
    {
        int ctr=0;
        for(int i=1;i*i<=num;i++)
        {
            if(num%i==0)
            {
                ctr++;
             //  System.out.print(i+" ");
                if(num/i!=i)
                {
                    ctr++;
                 //  System.out.print(num/i+" ");
                }
            }   
        }
        return ctr;
    }
}

*/
//----------------------------------
//16.number to word
/* 
public class NumberToWords 
{
    private static final String[] belowTwenty = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", 
        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private static final String[] thousands = {"", "Thousand", "Million"};

    public static void main(String[] args) {
        int num = 2342222;
        System.out.println(numberToWords(num));
    }

    public static String numberToWords(int num) {
        if (num == 0) return "Zero";
        int i = 0;
        String words = "";
        
        while (num > 0) 
        {
            if (num % 1000 != 0) {
                words = helper(num % 1000) + thousands[i] + " " + words;
            }
            num /= 1000;
            i++;
        }
        return words.trim();
    }

    private static String helper(int num) {
        if (num == 0) {
            return "";
        } else if (num < 20) {
            return belowTwenty[num] + " ";
        } else if (num < 100) {
            return tens[num / 10] + " " + helper(num % 10);
        } else {
            return belowTwenty[num / 100] + " Hundred " + (num % 100 == 0 ? "" : "and ") + helper(num % 100);
        }
    }
}
*/
//-------------------------
//17. Print the given pattern:
// Input:
// N= 3, M=3
// Output:
// X X X
// X 0 X
// X X X
/* 
public class ZOHO
{
    public static void main(String[] args)
    {
        int r=10,c=7;
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                int temp=Math.min(Math.min(i,j),Math.min(r-i+1,c-j+1));
                System.out.print(temp%2==1?"X ":"O ");
            }
            System.out.println();
        }    
    }
}
*/
//----------------------------
//18.adding a digit to all the digits of a number eg digit=4, number = 2875, o/p= 612119
/* 
public class ZOHO 
{
    public static void main(String[] args) 
    {
        int number=reverse(2875);
        System.out.println(number);//5782
        while(number>0)
        {
            System.out.print((number%10)+4);
            number=number/10;
        }
    }
    static int reverse(int num)
    {
        int temp=0;
        while(num>0)
        {
            temp=temp*10+num%10;
            num/=10;
        }
        return temp;
    }
}
*/
//--------------------------------------
//19.
/* 
public class ZOHO 
{
    public static void main(String[] args) {
        String[] arr = {"Harit", "Girish", "Gritav", "Lovenish", "Nikhil", "Harman","Arun","ArunKumar"};

        // Sort the array in lexicographical order
        sortLexicographically(arr);

        // Print the sorted array
        System.out.println("Sorted array in lexicographical order:");
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void sortLexicographically(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent strings and swap if they are in the wrong order
                if (compareStrings(arr[j], arr[j + 1]) > 0) {
                    // Swap arr[j] and arr[j+1]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Custom function to compare two strings lexicographically
    public static int compareStrings(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int minLen = Math.min(len1, len2);

        for (int i = 0; i < minLen; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 != c2) {
                return c1 - c2;
            }
        }

        // If one string is prefix of other, shorter string is smaller
        return len1 - len2;
    }
}
*/

//---------------------
//20.find the extra elements in a index
/* 
public class ZOHO 
{
    public static void main(String[] args) 
    {
        int arr1[]={10,20,30,12,5},arr2[]={10,20,30,12};
        int tsum=0;
        for(int i=0;i<arr1.length;i++)
        {
            tsum+=arr1[i];
        }    
        for(int i:arr2)
        {
            tsum=tsum-i;
        }
        System.out.println(tsum);//5
    }
}
*/
//---------------------
//21.Print true if second string is a substring of first string, else print false.
// Note : * symbol can replace n number of characters
// Input : Spoon  Sp*n  Output : TRUE
//     Zoho     *o*o  Output : TRUE
//     Man       n*     Output : FALSE
//     Subline  line   Output : TRUE
/* 
public class ZOHO 
{
    public static void main(String[] args) 
    {
        String str1="spoon",str2="n*";
        int i=0,j=0;
        while(j<str2.length()-1)
        {
            if(str1.charAt(i)==str2.charAt(j))
            {
                i++;
                j++;
            }
            else if(str1.charAt(i)!=str2.charAt(j) && str2.charAt(j)=='*')
            {
                i++;
            }
            else
            {
                System.out.println("Flase");
                return;
            }
            if(str1.charAt(i)==str2.charAt(j+1))
            {
                j++;
            }
        }    
        System.out.println("True");
    }
}
*/
//--------------------
//22. Given an array, find the minimum of all the greater numbers for each element in the array.  

// Sample: 
// Array : {2, 3, 7, ­1, 8, 5, 11} 
// Output: 
// {2­>3, 3­>5, 7­>8, ­1­>2, 8­>11, 5­>7, 11­>} 
/* 
import java.util.*;
public class ZOHO 
{
    public static void main(String[] args)
    {
        int arr1[]={2,3,7,1,8,5,11};
        for(int i=0;i<arr1.length;i++)
        {
            int min=9999;
            for(int j=0;j<arr1.length;j++)
            {
                if(arr1[i]<arr1[j])
                {
                    min=Math.min(min,arr1[j]);
                }
            }
            System.out.println(arr1[i]+"-->"+(min!=9999?min:""));
        }
    }
}
*/
//---------------------------------------
// 23. Given a string, we have to reverse the string without changing the position of punctuations and spaces.
// Sample:   house no : 123@ cbe 
// Output:    ebc32 1o :  nes@ uoh 
/* 
public class ZOHO 
{
    public static void main(String[] args) 
    {
        char str[]="house no : 123@ cbe".toCharArray();
        int l=0,r=str.length-1;
        while(l<=r)
        {
            if(!isAlphanumeric(str[l]))
            {
                l++;
            }
            else if(!isAlphanumeric(str[r]))
            {
                r--;
            }
            else 
            {
                char ch=str[l];
                str[l]=str[r];
                str[r]=ch;
                l++;
                r--;
            }
        }    
        for(char ch:str)
        {
            System.out.print(ch);
        }
    }  
    static boolean isAlphanumeric(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
    }  
}
*/
//--------------------------------------
//24.word serach 
/* 
class Solution {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || word == null || word.length() == 0) {
            return false;
        }
        
        int m = board.length;
        int n = board[0].length;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, 0, i, j)) {
                    return true;
                }
            }
        }
        
        return false;
    }

    private boolean dfs(char[][] board, String word, int index, int i, int j) {
        if (index == word.length()) {
            return true;
        }
        
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }
        
        char temp = board[i][j];
        board[i][j] = '#'; // Mark as visited
        
        boolean found = dfs(board, word, index + 1, i + 1, j) ||
                        dfs(board, word, index + 1, i - 1, j) ||
                        dfs(board, word, index + 1, i, j + 1) ||
                        dfs(board, word, index + 1, i, j - 1);
        
        board[i][j] = temp; // Restore the original value
        return found;
    }
}
*/
/* 
public class Solution {
    public static void main(String[] args) {
        char[][] board = {
            {'a', 'z', 'o', 'l'},
            {'n', 'x', 'h', 'o'},
            {'v', 'y', 'i', 'v'},
            {'o', 'r', 's', 'e'}
        };

        String[] dictionary = {"van", "zoho", "love", "are", "is"};
        
        for (String word : dictionary) {
            if (exist(board, word)) {
                System.out.println(word);
            }
        }
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || word == null || word.length() == 0) {
            return false;
        }
        
        int m = board.length;
        int n = board[0].length;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, 0, i, j)) {
                    return true;
                }
            }
        }
        
        return false;
    }

    private static boolean dfs(char[][] board, String word, int index, int i, int j) {
        if (index == word.length()) {
            return true;
        }
        
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }
        
        char temp = board[i][j];
        board[i][j] = '#'; // Mark as visited
        
        // Only search right and down
        boolean found = dfs(board, word, index + 1, i + 1, j) || 
                        dfs(board, word, index + 1, i, j + 1);
        
        board[i][j] = temp; // Restore the original value
        return found;
    }
}
*/
///----------------------------
//25) Find the largest sum contiguous subarray which should not have negative numbers. We have to print the sum and the corresponding array elements which brought up the sum.
/* 
public class Solution 
{
    public static void main(String[] args) 
    {
        int arr[]={2,7,5,1,3,2,9,7};
        int sum=14;
        int s=0,e=0,total=0;
        int last=0;
        while(e<arr.length)
        {
            if(total<sum)
            {
                total+=arr[e];
            }
            else if(total>sum)
            {
                total=total-arr[s++];
            }
            if(total==sum)
            {
                last=e;
            }
            e++;
        }    
        System.out.println(s+" "+e);
    }
}
*/
//--------------------------------
//26.
/* 
public class Solution 
{
    public static void main(String[] args) 
    {
        String str[]={"one","two","three"}; 
        reverse(str, 0);

    }
    static void reverse(String str[],int i)
    {
        if(i==str.length)
        {
            return;
        }
        System.out.print(str[i]+" ");
        reverse(str, i+1);
        System.out.print(str[i]+" ");
    }
}
*/
//--------------------------
//27.
// 1  
// 3 2
// 6 5 4
// 10 9 8 7
/* 
public class SOHO
{
    public static void main(String[] args) 
    {
        int num=5,temp=1;
        for(int i=1;i<=num;i++)
        {
            int c=temp;
            for(int j=0;j<i;j++)
            {
                System.out.print(c-j+" ");
            }
            temp+=i+1;`
            System.out.println();
        }    
    }
}
*/
//-------------
//28.Replace every element with the greatest element on right side
/* 
public class SOHO   
{
    public static void main(String[] args) {
        int arr[]={16,17,4,3,5,2},max=arr[arr.length-1];
        arr[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--)
        {
            int temp=arr[i];
            arr[i]=max;
            max=max<temp?temp:max;
        }
        for(int i:arr)
        {
            System.out.print(i+" ");
        }

    }
}
*/
//----------
//29.2. Given a Boolean matrix mat[M][N] of size M X N, modify it such that if a matrix cell mat[i][j] is 1 then make its adjacent cells as 0.
/* 
public class SOHO 
{
    public static void main(String[] args) 
    {
        int arr[][]=
        {
            {1,2,0,3,0},
            {1,2,3,0,1},
            {2,3,4,2,2},
            {2,3,4,1,1}
        };
        for(int i=0;i<arr.length;i++)
        {
            for(int j=arr[i].length-1;j>0;j--)
            {
                if(arr[i][j-1]==0)
                {
                    arr[i][j]=0;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
*/
//-------------------
//30. Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes. For example, in an array A:
// Example :
// Input: A[] = {-7, 1, 5, 2, -4, 3, 0}
// Output: 3
// 3 is an equilibrium index, because:
// A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
// Input: A[] = {1, 2, 3}
// Output: -1
/* 
public class SOHO {
    public static void main(String[] args) {
        int arr[] = {-7, 1, 5, 2, -4, 3, 0};
        int left_sum = 0;
        int right_sum = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            right_sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) 
        {
            right_sum -= arr[i];
            if (left_sum == right_sum) 
            {
                System.out.println("Equilibrium index found at: " + i);
                return;
            }
            left_sum += arr[i];
        }
        System.out.println("No equilibrium index found.");
    }
}
*/
//----------------------------
//31.
/* 
public class DiagonalPrint {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        for (int k = 0; k < m; k++) {
            int i = k;
            int j = 0;
            while (i >= 0) {
                System.out.print(matrix[i][j] + " ");
                i--;
                j++;
            }
        }
        
        for (int k = 1; k < n; k++) {
            int i = m - 1;
            int j = k;
            while (j < n) {
                System.out.print(matrix[i][j] + " ");
                i--;
                j++;
            }
        }
    }
}
//1 4 2 7 5 3 8 6 9     
*/
/* 
public class DiagonalPrint {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[] result = new int[m * n];
        int index = 0;
        
        // Traverse each diagonal starting from the top-left to bottom-right
        for (int diagonalSum = 0; diagonalSum <= m + n - 2; diagonalSum++) {
            int startRow = Math.min(diagonalSum, m - 1);
            int startCol = Math.max(0, diagonalSum - (m - 1));
            
            int endRow = Math.max(0, diagonalSum - (n - 1));
            int endCol = Math.min(diagonalSum, n - 1);
            
            if (diagonalSum % 2 == 0) {
                for (int i = startRow, j = startCol; i >= endRow && j <= endCol; i--, j++) {
                    result[index++] = matrix[i][j];
                }
            } else {
                for (int i = endRow, j = endCol; i <= startRow && j >= startCol; i++, j--) {
                    result[index++] = matrix[i][j];
                }
            }
        }
        
        // Print the result array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
//1 2 4 7 5 3 6 8 9 
*/

///--------------------------------------------------------------------------------
/* 
    1.Using Recursion reverse the string such as
    Eg 1: Input: one two three
    Output: three two one
    Eg 2: Input: I love india
    Output: india love I

    public class ZOHO
    {
        public static void main(String[] args) 
        {
            String str[]={"one","two","three"};    
            reverse(str, 0);//three two one 
        }
        static void reverse(String str[],int i)
        {
            if(i==str.length)
            {
                return;
            }
            reverse(str, i+1);
            System.out.print(str[i]+" ");
        }
    }
*/
//---------------------------
/*
    2.Given two sorted arrays, merge them such that the elements are not repeated
    Eg 1: Input:
    Array 1: 2,4,5,6,7,9,10,13
    Array 2: 2,3,4,5,6,7,8,9,11,15
    Output:
    Merged array: 2,3,4,5,6,7,8,9,10,11,13,15

    public class ZOHO 
    {
        public static void main(String[] args) 
        {
            int arr1[]={2,4,5,6,7,9,10,13};
            int arr2[]={2,3,4,5,6,7,8,9,11,15};
            int len1=arr1.length,len2=arr2.length;
            int arr3[]= merge(arr1, arr2);
            for(int i:arr3)
            {
                if(i==0){break;}
                System.out.print(i+" "); //2 3 4 5 6 7 8 9 10 11 13 15 
            }
        }
        static int[] merge(int arr1[],int arr2[])
        {
            int arr3[]=new int[arr1.length+arr2.length];
            int s=0,e=0;
            int index=0;
            while( s<arr1.length && e<arr2.length )
            {
                if(arr1[s]>arr2[e])
                {
                    arr3[index++]=arr2[e++];
                }
                else if(arr1[s]<arr2[e])
                {
                    arr3[index++]=arr1[s++];
                }
                else 
                {
                    arr3[index++]=arr1[s++];
                    e++;
                }
            }
            while(s<arr1.length) 
            {    
                arr3[index++]=arr1[s++];
            }
            while(e<arr2.length)
            {
                arr3[index++]=arr2[e++];
            }
            return arr3;
        }
    }
*/
//-------------------------
/*
    3.Find if a String2 is substring of String1. If it is, return the index of the first occurrence. 
    else return -1.
    Eg 1:Input:
    String 1: test123string
    String 2: 123
    Output: 4
    Eg 2: Input:
    String 1: testing12
    String 2: 1234
    Output: -1
    
    public class ZOHO 
    {
        public static void main(String[] args)
        {
            String str1="test123string";
            String str2="123"; 

            if(indexOf(str1, str2)!=-1)
            {
                System.out.println(indexOf(str1, str2)-str2.length()+1);//4
                System.out.println(indexOf(str1, str2));//6
            }
            else
            {
                System.out.println(-1);
            }
        }
        static int indexOf(String str1,String str2)
        {
            int l=0,r=0,ctr=0;
            while(l<str1.length())
            {
                if(str1.charAt(l)==str2.charAt(r))
                {
                    r++;
                    ctr++;
                    if(ctr==str2.length())
                    {
                        return l;
                    }
                }
                else
                {
                    ctr=0;
                    r=0;
                }
                l++;
            }
            return -1;
        }
    }
*/
//------------------------
/* 
    4.Write a program to print the following output for the given input. You can assume the string is of
      odd length
        Eg 1: Input: 12345
        Output:
        1 5
        2 4
        3
        2 4
        1 5

        public class ZOHO 
        {
            public static void main(String[] args) 
            {
                String str="12345";   
                function(str); 
                function2(str);
            }
            static void function(String str)
            {
                int i=0,j=0;
                for(i=0;i<str.length();i++)
                {
                    for(j=0;j<str.length();j++)
                    {
                        if(i==j)
                        {
                            System.out.print(str.charAt(j));
                        }
                        else if(j==str.length()-i-1)
                        {
                            System.out.print(str.charAt(j));
                        }
                        else
                        {
                            System.out.print("-");
                        }
                    }
                    System.out.println();
                }
            }
            static void function2(String str)
            {
                int i=0,j=0;
                for(i=0;i<str.length();)
                {
                    System.out.print( i==j||j==str.length()-i-1?str.charAt(j):'-');
                    j++;
                    if(j>=str.length()){j=0;i++;System.out.println();}
                }
            }
        }
*/
//------------------------------

/*
    5.
    Write a program to give the following output for the given input
    Eg 1: Input: a1b10
    Output: abbbbbbbbbb
    Eg: 2: Input: b3c6d15
    Output: bbbccccccddddddddddddddd
    The number varies from 1 to 99.
 
    public class ZOHO 
    {
        public static void main(String[] args) 
        {
            char str[] = "a1b12c1".toCharArray();
            char alpha = 0;
            int num = 0;

            for (int i = 0; i < str.length; i++) 
            {
                if (str[i] >= 'a' && str[i] <= 'z')
                {
                    // If there's a previous character to print, print it
                    if (alpha != 0) {
                        for (int j = 0; j < num; j++) {
                            System.out.print(alpha);
                        }
                        num = 0; // Reset num for the next character
                    }
                    alpha = str[i];
                } else if (str[i] >= '0' && str[i] <= '9') {
                    num = num * 10 + (str[i] - '0');
                }
            }
            // Print the last character sequence
            for (int j = 0; j < num; j++) {
                System.out.print(alpha);
            }
        }
    }
*/
//------------------------
/*
    6.Form a number system with only 3 and 4. Find the nth number of the number system.
    Eg.) The numbers are: 3, 4, 33, 34, 43, 44, 333, 334, 343, 344, 433, 434, 443, 444, 3333, 3334,
    3343, 3344, 3433, 3434, 3443, 3444 ....
    

    public class CustomNumberSystem
    {
        public static void main(String[] args) 
        {
            int n = 10; // Example input for nth number
            for(int i=0;i<=20;i++)
            {
                System.out.println(findNthNumber(i));
            }
        }

        static String findNthNumber(int n) 
        {
            String result = "";
            while (n > 0) {
                // Find remainder when n is divided by 2 (as we have two digits in our system)
                int remainder = (n - 1) % 2;
                // Convert remainder to '3' or '4' and prepend to result
                result = (remainder == 0 ? '0' : '1') + result;
                // Update n for the next iteration
                n = (n - 1) / 2;
            }
            return result;
        }
}

*/
//-----------------------
/*
    7.Replace every element with the greatest element on right side
      Given an array of integers, replace every element with the next greatest element 
      (greatest element on the right side) in the array. Since there is no element next to 
      the last element, replace it with -1. For example, if the array is {16, 17, 4, 3, 5, 2},
      then it should be modified to {17, 5, 5, 5, 2, -1}.
 
        public class ZOHO
        {
            public static void main(String[] args)
            {
                int arr[]={16,17,4,3,5,2};
                int max=arr[arr.length-1];
                arr[arr.length-1]=-1;
                for(int i=arr.length-2;i>=0;i--)
                {
                    int temp=arr[i];
                    arr[i]=max;
                    if(max<temp)
                    {
                        max=temp;
                    }
                } 
                for(int i:arr)
                {
                    System.out.print(i+" ");
                }
            }
        }
*/
//-------------------------
/*
     8.Given a Boolean matrix mat[M][N] of size M X N, modify it such that if a matrix 
     cell mat[i][j] is 1 then make its adjacent cells as 0.     

    public class ZOHO 
    {
        public static void main(String[] args) 
        {
            int arr[][]=
            {
                {1,2,0,1},
                {0,1,0,1},
                {2,3,2,1},
                {1,0,1,1},
            };
            for(int i=0;i<arr.length;i++)
            {
                for(int j=arr[0].length-1;j>0;j--)
                {
                    if(arr[i][j]!=0&&arr[i][j-1]==0)
                    {
                        arr[i][j]=0;
                    }
                }
            }
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[0].length;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
    1 2 0 0 
    0 0 0 0 
    2 3 2 1 
    1 0 0 1 
*/
//----------------------
/*
     9.3. Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes. For example, in an array A:
     Example :
    Input: A[] = {-7, 1, 5, 2, -4, 3, 0}
    Output: 3
    3 is an equilibrium index, because:
    A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
    Input: A[] = {1, 2, 3}
    Output: -1

    public class ZOHO 
    {
        public static void main(String[] args) 
        {
            int arr[]={-7,1,5,2,-4,3,0};
            int left_sum=0,right_sum=0;
            for(int i:arr)
            {
                right_sum+=i;
            }    
            for(int i=0;i<arr.length;i++)
            {
                right_sum=right_sum-arr[i];
                if(left_sum==right_sum)
                {
                    System.out.println(arr[i]);
                    return;
                }
                left_sum=left_sum+arr[i];
            }
        }
    }
    //2
*/
//---------------
/*
     10. Given a matrix of 2D array of n rows and m coloumns.
         Print this matrix in ZIG-ZAG fashion as shown in figure.
 

        public class ZOHO
        {
            public static void main(String[] args) 
            {
                int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
                };
                
                int m = matrix.length;
                int n = matrix[0].length;
                
                int[] result = new int[m * n];
                int index = 0;
                
                // Traverse each diagonal starting from the top-left to bottom-right
                for (int diagonalSum = 0; diagonalSum <= m + n - 2; diagonalSum++) 
                {
                    int startRow = Math.min(diagonalSum, m - 1);
                    int startCol = Math.max(0, diagonalSum - (m - 1));
                    
                    int endRow = Math.max(0, diagonalSum - (n - 1));
                    int endCol = Math.min(diagonalSum, n - 1);
                    
                    if (diagonalSum % 2 == 0)
                    {
                        for (int i = startRow, j = startCol; i >= endRow && j <= endCol; i--, j++)
                        {
                            result[index++] = matrix[i][j];
                        }
                    }
                    else 
                    {
                        for (int i = endRow, j = endCol; i <= startRow && j >= startCol; i++, j--) {
                            result[index++] = matrix[i][j];
                        }
                    }
               }
               for (int num : result) 
               {
                   System.out.print(num + " ");
               }
            }
        }
*/
//---------------------
/*
    11.Print all possible subsets of the given array whose sum equal to given N.
    example: Input: {1, 2, 3, 4, 5} N=6 Output: {1, 2, 3}, {1, 5}, {2, 4}

        public class ZOHO 
        {
            public static void main(String[] args) 
            {
                int[] array = {1, 2, 3, 4, 5};
                printAllSubsets(array);
            }

            static void printAllSubsets(int[] array) 
            {
                int[] subset = new int[array.length];
                generateSubsets(array, subset, 0);
            }

            static void generateSubsets(int[] array, int[] subset, int index) 
            {
                if (index == array.length)
                {
                    printSubset(subset, index);
                } 
                else
                {
                    subset[index] = 0;
                    generateSubsets(array, subset, index + 1);

                    subset[index] = array[index];
                    generateSubsets(array, subset, index + 1);
                }
            }

            private static void printSubset(int[] subset, int size) {
                System.out.print("{ ");
                for (int i = 0; i < size; i++) {
                    if (subset[i] != 0) {
                        System.out.print(subset[i] + " ");
                    }
                }
                System.out.println("}");
            }
        }
*/
//-----------------
/*
     12.island
 
public class ZOHO 
{
    public static void main(String[] args) 
    {
        char ch[][]=
        {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
        };
        System.out.println(numIslands(ch));
    }
    static int numIslands(char[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    ans+=1;
                    fn(grid,i,j);
                }
            }
        }
        return ans;
    }
    static void fn(char ch[][],int i,int j)
    {
        if(i<0 || i>=ch.length ||j<0||j>=ch[0].length||ch[i][j]=='0')
        {
            return;
        }
        ch[i][j]='0';
        fn(ch,i,j+1);
        fn(ch,i,j-1);
        fn(ch,i+1,j);
        fn(ch,i-1,j);
    }
}
*/
//------------
/* 
  //  13.print all Permutations
//   ABC
// ACB
// BAC
// BCA
// CBA
// CAB
 
public class ZOHO
{
    public static void main(String[] args) {
        String str = "ABC";
        findPermutations(str, 0, str.length() - 1);
    }

    static void findPermutations(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                findPermutations(str, left + 1, right);
                str = swap(str, left, i); // backtrack
            }
        }
    }

    static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
*/
//--------------
//Given a number, print all the code that can be formed with z={a=1, .., z=26}.1123
/* 
public class ZOHO {
    public static void main(String[] args) {
        String number = "111";
        printCodes(number, 0, "");
        System.out.println(count);
    }
    static int count=0;
    static void printCodes(String number, int index, String result) {
        // If the entire number has been processed, print the result
        if (index == number.length())
        {
            System.out.println(result);
            count++;
            return;
        }

        // Take one digit
        int oneDigit = number.charAt(index) - '0';
        if (oneDigit >= 1 && oneDigit <= 9)
        {
            printCodes(number, index + 1, result + (char) ('a' + oneDigit - 1));
        }

        // Take two digits
        if (index + 1 < number.length())
        {
            int twoDigits = (number.charAt(index) - '0') * 10 + (number.charAt(index + 1) - '0');
            if (twoDigits >= 10 && twoDigits <= 26)
            {
                printCodes(number, index + 2, result + (char) ('a' + twoDigits - 1));
            }
        }
    }
}
//---------------
*/