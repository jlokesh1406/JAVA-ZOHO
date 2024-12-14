

//--------------------------------------------------------------------------------------------------------------------------------
/*
        linear search:
            time complexity:
                best case: o(1)
                worst case: o(n)
            space complexity:
                O(1)->linear search does not require any additional space apart from a few variables for iteration and comparison
*/
/*
import java.util.Arrays;
import java.util.Scanner;
public class java1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt(),arr[]=new int[size];
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.println(min(arr,Integer.MAX_VALUE));
        System.out.println(max(arr,Integer.MIN_VALUE));
        System.out.println(find(arr,777,-1));
        
        int arr2[][]=
        {
            {12,3,4,5},
            {123,423,435,52,},
            {1235,5,2,67,8}
        };
       int temp[]=d2arr(arr2, 435);
       System.out.println(Arrays.toString(temp));
    }
    static int min(int arr[],int mini)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(mini>arr[i])
            {
                mini=arr[i];
            }
        }
        return mini;
    }
    static int max(int arr[],int maxi)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(maxi<arr[i])
            {
                maxi=arr[i];
            }
        }
        return maxi;
    }
    static int find(int arr[],int target,int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(target==arr[i])
            {
                key=i;
                break;
            }
        }
        return key;
    }
    static int[] d2arr(int arr[][],int target)
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

}
*/
//------------------------------------------------------------------------------------------------------
/*
        binary search:
            binary search should be a sort array.
            time complexity:
                o(log n)
            space complexity:
*/
//1.
/* 
public class sohomain {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7};
        int s1=0,e1=arr1.length-1,target1=2;
        System.out.println(ass(arr1, s1, e1, target1));

        int arr2[]={7,8,5,4,3,2,1};
        int s2=0,e2=arr2.length-1,target2=5;
        System.out.println(des(arr2, s2, e2, target2));
    }
    static int ass(int arr[],int s,int e,int target)
    {
        while (s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]>target)
            {
                e=mid-1;
            }    
            else if(arr[mid]<target)
            { 
                s=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    static int des(int arr[],int s,int e,int target)
    {
        while (s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]>target)
            {
                s=mid+1;
            }    
            else if(arr[mid]<target)
            { 
                e=mid-1;
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
//leedcode 162,852
//-----------------------------------------------------------------------------------------------------------
//bubble sort:
/*
     space complexity : o(1)
     time complexity  :
          best case   : o(n^2) 
          worst case  : o(n^2)
 
public class sohomain {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,2,3,1};
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
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
*/

//-----------------------------------------------------------------------------------------------
//selection sorting:
/*
     space complexity : o(1)
     time complexity  :
          best case   : o(n^2) 
          worst case  : o(n^2)
 
public class sohomain {
    public static void main(String[] args) {
        int arr[]={1,2,1,1,2,312,23,1};
        for(int i=0;i<arr.length;i++)
        {
            int lastindex=arr.length-1-i;
            int max=0;
            for(int j=0;j<=lastindex;j++)
            {
                if(arr[max]<arr[j])
                {
                    max=j;
                }
            }
            int temp=arr[max];
            arr[max]=arr[lastindex];
            arr[lastindex]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
*/
//-----------------------------------------------------------------------------------------------
//inselection sorting:
/*
     space complexity : o(1)
     time complexity  :
          best case   : o(n^2) 
          worst case  : o(n^2)

public class sohomain {
    public static void main(String[] args) {
        int arr[]={4,5,1,2,3};
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
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
*/
//------------------------------------------------------------------------------------------------
//cycle sort:
/*
     only for 0 to n numbers
 */
//1.
/*
public class sohomain {
    public static void main(String[] args) {
        int arr[]={1,4,2,5,3};
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
            System.out.print(arr[i]+" ");
        }
    }
}

//2.find missing number in 0 to n
public class sohomain {
    public static void main(String[] args) {
        int arr[]={4,1,0,3,5,6,2,8};
        int i=0;
        while(i<arr.length)
        {
            int index=arr[i];
            if(arr[i]<arr.length&&arr[index]!=arr[i])
            {
                int temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
            }
            else
            {
                i++;
            }
        }
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]!=i)
            {
                System.out.print(i);
                return;
            }
        }
        System.out.print(arr.length);
    }
}
*/
//-----------------------------------------------------------------------------------------------
//Merge Sort
/*
     space complexity : o(n)
     time complexity  :
          best case   : O(n log n) 
          worst case  : O(n log n) Guaranteed O(n log n) performance, good for large datasets and Stable
*/
//Merge Sort-->divide and merge
/* 
public class sohomain {
    public static void main(String[] args) {
        int arr[] = {9, 7, 5, 2, 14, 3};
        sort(arr, 0, arr.length - 1);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void sort(int arr[], int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            sort(arr, l, mid);
            sort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    static void merge(int arr[], int l, int mid, int r) {
        int L = mid - l + 1;
        int R = r - mid;

        int Leftarr[] = new int[L];
        int Rightarr[] = new int[R];

        for (int i = 0; i < L; i++) {
            Leftarr[i] = arr[l + i];
        }
        for (int j = 0; j < R; j++) {
            Rightarr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = l;
        while (i < L && j < R) {
            if (Leftarr[i] <= Rightarr[j]) {
                arr[k] = Leftarr[i];
                i++;
            } else {
                arr[k] = Rightarr[j];
                j++;
            }
            k++;
        }

        while (i < L) {
            arr[k] = Leftarr[i];
            i++;
            k++;
        }

        while (j < R) {
            arr[k] = Rightarr[j];
            j++;
            k++;
        }
    }
}
*/
//---------------------------------------Recursion---------------------------------------------------------------------

//1.fibo
/*
public class sohomain {
    public static void main(String[] args) 
    {
        System.out.println(fibo(4));
    }  
    static int fibo(int num)
    {
        if(num<2)
        {
            return num;
        }
        return fibo(num-1)+fibo(num- 2);
    }
}
*/
//2.binary search
/*
public class sohomain {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,12};
        int s=0,e=arr.length,target=2;
        System.out.print(binarysearch(arr,target,s,e));
    }
    static int binarysearch(int arr[],int target,int s,int e)
    {
        if(s>e)
        {
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]<target)
        {
            return binarysearch(arr, target, mid+1, e);
        }
        else if(arr[mid]==target)
        {
            return mid;
        }
           return binarysearch(arr, target, s, mid-1);
    }
}
*/
//3.sorted or not
/*
    public class sohomain {
        public static void main(String[] args) {
            int arr[]={1,2,3,4,5,6,7};
            System.out.println(sorted(arr, 0));
        }
        static boolean sorted(int arr[],int index)
        {
            if(index==arr.length-1)
            {
                return true;
            }
            return arr[index]<arr[index+1] &&sorted(arr, index+1);
        }
    }
*/
//4.find index of target element:
/* 
    public class sohomain {
        public static void main(String[] args)
        {
            int arr[]={1,2,3,4,5,6,7};
            System.out.println(find(arr, 0,77));
        }
        static boolean find(int arr[],int index,int target)
        {
            if(index==arr.length)
            {
                return false;
            }
            return arr[index]==target || find(arr, index+1, target);
        }
    }
*/
//5.n to 1 and 1 to n
/*
    public class sohomain {
        public static void main(String[] args) {
            fn1(5);

            System.out.println();

            String str[]={"lokesh","loki","ted"};
            fn2(str, 0);
        }
        static void fn1(int num)
        {
            if(num<0)
            {
                return;
            }
            System.out.print(num+" ");
            fn1(num-1);
            System.out.print(num+" ");
        }
        static void fn2(String str[],int s)
        {
            if(s==str.length)
            {
                return;
            }
            System.out.print(str[s]+" ");
            fn2(str, s+1);
            System.out.print(str[s]+" ");
        }
        
    }
*/
//6.factorial  &  sum of digit & product of a digit
/*
public class sohomain {
    public static void main(String[] args) {

        //1.factorial
        System.out.println("1.factorial "+fn1(5));

        //2.sum of digit
        System.out.println("2.sum of digit "+fn2(1234));

        //3.product of a digit
        System.out.println("3.product of a digit "+fn3(1234));

        //4.reverse a number
        fn4(1234);
        System.out.println("4.reverse a number "+sum);

    }
    static int fn1(int num)
    {
        if(num<=1)
        {
            return num;
        }
        return num+fn1(num-1);
    }
    static int fn2(int num)
    {
        if(num==0)
        {
            return 0;
        }
        return (num%10)+fn2(num/10);
    }
    static int fn3(int num)
    {
        if(num==0)
        {
            return 1;
        }
        return (num%10)*fn3(num/10);
    }
    
    static int sum=0;
    static void fn4(int num)
    {
        if(num==0)
        {
            return;
        }
        sum=sum*10+num%10;
        fn4(num/10);
    }


}

*/
//--------------------------------------------------pattern------------------------------------------------------------------
//1.
/*
public class sohomain {
    public static void main(String[] args) {
        int num=5;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
//2.
/* 
public class sohomain {
    public static void main(String[] args) {
        int num=5;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
//3.
/*
public class sohomain {
    public static void main(String[] args) {
        int num=5;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
*/
//4.
/* 
public class sohomain {
    public static void main(String[] args) {
        int num=5;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
*/
//5.
/*
public class sohomain {
    public static void main(String[] args) {
        int num=5;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
//6.
/* 
public class sohomain {
    public static void main(String[] args) {
        int num=5;
        for(int i=0;i<5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
*/
//7.
/*
public class sohomain {
    public static void main(String[] args) {
        int num=5;
        for(int i=0;i<5;i++)
        {
            //space
            for(int j=0;j<num-1-i;j++)
            {
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
            }
            // space
            for(int j=0;j<num-1-i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
*/
//8.
/*
public class sohomain {
    public static void main(String[] args) {
        int num=5;
        for(int i=0;i<5;i++)
        {
            //space
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            //star
            for(int j=0;j<(2*num)-(2*i+1);j++)
            {
                System.out.print("*");
            }
            // space
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
*/
//10.
/*
public class sohomain {
    public static void main(String[] args) {
        int num=5;
        for(int i=1;i<=2*num-1;i++)
        {
            int end=i;
            if(i>num){end=(2*num)-i;}
            for(int j=1;j<=end;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
//11.
/*
public class sohomain {
    public static void main(String[] args) {
        int num=5,start=0;
        for(int i=0;i<num;i++)
        {
            if(i%2==0){start=1;}
            else{start=0;}
            for(int j=0;j<=i;j++)
            {
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
}
*/
//12.
/* 
public class sohomain {

    public static void main(String[] args) {
        int num=4;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int j=i+1;j<=num*2-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
} 
*/

//13.
/* 
public class sohomain {

    public static void main(String[] args) {
        int num=5,temp=1;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(temp+++" ");
            }
            System.out.println();
        }
    }
} 
*/
//14.
/* 
public class sohomain {
    public static void main(String[] args) {
        int num=5;
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)(j+'A')+" ");
            }
            System.out.println();
        }
    }
}
*/
//15.
/* 
public class sohomain {
    public static void main(String[] args) {
        int num=5;
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num-i;j++)
            {
                System.out.print((char)(j+'A')+" ");
            }
            System.out.println();
        }
    }
}
*/
//16.
/* 
public class sohomain {
    public static void main(String[] args) {
        int num=5;
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)(i+'A')+" ");
            }
            System.out.println();
        }
    }
}
*/
//17.
/*
public class sohomain {
    public static void main(String[] args) {
        int num=5;
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num-i-1;j++)
            {
                System.out.print("-");
            }
            char ch='A';
            int breakpoint=(2*i+1)/2;
            for(int j=1;j<=(2*i+1);j++)
            {
                System.out.print(ch);
                if(j<=breakpoint){ch++;}
                else{ch--;}
            }
            System.out.println();
        }
    }
}
*/
//22.

//------------------------------------------basics math----------------------------------------------------------------------------------- 

//1.reverse integer
/*
class Solution {
    public int reverse(int x) {
        int sum=0;
        while(x!=0)
        {
            if(sum>Integer.MAX_VALUE/10||sum<Integer.MIN_VALUE/10)
            {
                return 0;
            }
            sum=sum*10+x%10;
            x=x/10;
        }
        return sum;
    }
}
*/
//2.Palindrome Number
/* 
class Solution {
    public boolean isPalindrome(int x) {
        int sum=0,num=x;
        if(x<0)
        {
            return false;
        }
        while(num>0)
        {
            sum=(sum*10)+(num%10);
            num/=10;
        }
        return (x==sum);
    }
}
*/
//3.largest element in a array
/*
class Compute {
    
    public int largest(int arr[], int n)
    {
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max){max=arr[i];}
        }
        return max;
    }
}
*/
//4.second largest element in array
/*
class Solution {
    int print2largest(int arr[], int n) {
        int max1=max(arr);
        for(int i=0;i<n;i++)
        {
            if(max1==arr[i])
            {
                arr[i]=0;
            }
        }
        max1=max(arr);
        return max1;
    }
    static int max(int arr[])
    {
        int max=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i]&&arr[i]!=0)
            {
                max=arr[i];
            }
        }
        return max;
    }
}
*/
//5.Remove Duplicates from Sorted Array
// Input: nums = [0,0,1,1,1,2,2,3,3,4]
// Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
/*
class Solution {
    public int removeDuplicates(int[] arr) {
        return fn(arr,0,0);
    }
    static int fn(int arr[],int s,int j)
    {
        if(arr.length==s)
        {
            return j;
        }
        if(s==arr.length-1)
        {
            arr[j++]=arr[s];
        }
        else if(arr[s]!=arr[s+1])
        {
            arr[j++]=arr[s];
        }
        return fn(arr,s+1,j);
    }
}
*/
//6.Left Rotate an array by one place
//time complixity:o(n)
//space complisity:o(1)
/* 
public class sohomain {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int temp=arr[0],i=0;
        while(i<=arr.length-2)
        {
            arr[i]=arr[i+1];
            i++;
        }
        arr[arr.length-1]=temp;
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
*/
//7. Rotate Array
//input:1,2,3,4,5,6,7,R=3
//output:4,5,6,7,1,2,3
/* 
    public class sohomain {
        public static void main(String[] args) {
            int arr[]={1,2,3,4,5,6,7},R=3,len=arr.length;
            R=R%len;
            int temp[]=new int[R],i=0,j=0;
            while(i<R) // 0 1 2
            {
                temp[i]=arr[i++];
            }
            while(i<len)
            {
                arr[i-R]=arr[i++];
            }
            i=len-R;j=0;
            while(j<R)
            {
                arr[i++]=temp[j++];
            }
            for(i=0;i<len;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
*/
//8.Move Zeroes
// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
/*
public class sohomain {
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12,0},i=0,j=0;
        for(i=0;i<arr.length;i++) // o(n)
        {
            if(arr[i]!=0)
            {
                arr[j++]=arr[i];
            }
        }
        for(i=j;i<arr.length;i++)//o(n-x)
        {
            arr[i]=0;
        }
        for(i=0;i<arr.length;i++)//o(n)
        {
            System.out.print(arr[i]+" ");
        }
        //o(n)+o(n-x)+o(n)=0(3n-x)
    }
}
*/
//
//9.linear search using recursion: time complexity:o(n)
/* 
class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        return fn(arr,0,K)==true?1:-1;
    }
    static boolean fn(int arr[],int s,int target)
    {
        if(s==arr.length)
        {
            return false;
        }
        return arr[s]==target||fn(arr,s+1,target);
    }
}
*/
//10.binary search using recursion: time complexity:o(log n)
// N = 5, K = 6
// arr[] = {1,2,3,4,6}
/* 
class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        int i=0,mid=0;
        N=N-1;
        while(i<=N)
        {
             mid=i+(N-i)/2;
            if(arr[mid]<K)
            {
                i=mid+1;
            }
            else if(arr[mid]>K)
            {
                N=mid-1;
            }
            else
            {
                break;
            }
        }
        return arr[mid]==K?1:-1;
    }
}
*/
//11.union of two sorted arrays
/* 
import java.util.ArrayList;
public class sohomain 
{
    public static void main(String[] args) {
        int arr1[]={2,2,3,4,5},arr2[]={1,1,2,3,4},n=5,m=5;
        ArrayList <Integer> arr=new ArrayList<>();
        arr = findUnion(arr1, arr2, n, m);
        for(int i=0;i<arr.size();i++)
        {
            System.out.printf(arr.get(i)+" ");
        }
    }
    static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer>arr=new ArrayList<Integer>();
        n=remove(arr1,0);
        m=remove(arr2,0);
        int i=0,j=0;
        while(i<n&&j<m)
        {
            if(arr1[i]<arr2[j])
            {
                arr.add(arr1[i++]);
            }
            else if(arr1[i]>arr2[j])
            {
                arr.add(arr2[j++]);
            }
            else
            {
                arr.add(arr1[i]);
                i++;
                j++;
            }
        }
        while(i<n)
        {
            arr.add(arr1[i++]);
        }
        while(j<m)
        {
            arr.add(arr2[j++]);
        }
        return arr;
    }
    static int remove(int arr[],int j)
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
        return j;
    }
}
*/
//12.missing number in 0 to n
/* 
public class sohomain {
    public static void main(String[] args) 
    {
        int arr[]={9,6,4,2,3,5,7,0,1};
        for(int i=0;i<arr.length;)
        {
            int index=arr[i];
            if(index<arr.length&&arr[i]!=arr[index]) // o(n)
            {
                arr[i]=arr[i]^arr[index]; //a = a^b
                arr[index]=arr[i]^arr[index]; //b = a^b
                arr[i]=arr[i]^arr[index]; // a = a^b
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
                System.out.print(i+" ");
            }
        }
    }
}
*/
//13. Max Consecutive Ones
/* 
public class sohomain {
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1},max=0,ctr=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                ctr++;
                if(max<ctr){max=ctr;}
            }
            else
            {
                ctr=0;
            }
        }
        System.out.print(max);
    }
}
*/
//14.Single Number
/* 
    class Solution {
        public int singleNumber(int[] arr) {
            int r=0,i=0;
            while(i<arr.length)
            {
                r=r^arr[i++];
            }
            return r;
        }
    }
*/
//15.Longest subarray with given sum K(positives)
//subarray is contingous part of the array
/* 
public class sohomain {
    public static void main(String[] args) {
        int arr[]={10,5,2,7,1,9},k=15;
        System.out.println(lenOfLongSubarr(arr, arr.length, k));//o(n^2)

        System.out.println(longestsubarray(arr, arr.length, k));//o(2n)

    }
    static int lenOfLongSubarr(int A[], int N, int K) {
        int max=0;
        for(int i=0;i<N;i++)
        {
            int sum=0;
            for(int j=i;j<N;j++)
            {
                sum+=A[j];
                if(sum==K)
                {
                    if(max<(j-i+1))
                    {
                        max=j-i+1;
                    }
                }
            }
        }
        return max;
    }
    static int longestsubarray(int A[],int N,int K )
    {
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
                if(max<(right-left+1))
                {
                    max=(right-left+1);
                }
            }
            right++;
            if(right<N){sum=sum+A[right];}
        }
        return max;
    }
}
*/
//16.2Sum Problem
/* 
import java.util.Arrays;

public class sohomain {
    public static void main(String[] args) {
        int arr[]= {2,7,11,15,1},target=9;
        Arrays.sort(arr);
        fn(arr, target);
    }
    static void fn(int arr[],int target)
    {
        int left=0,right=arr.length-1;
        while(left<right)
        {
            if(arr[left]+arr[right]==target)
            {
                System.out.println(left+" "+right);
                return;
            }
            else if(arr[left]+arr[right]>target)
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        return;
    }
}
*/
//
//17. Sort Colors 0 1 2
//leetcode:75
// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
/*
public class sohomain {
    public static void main(String[] args) {
        int arr[]={2,0,2,1,1,0};
        fn1o2n(arr);
        for(int i=0;i<arr.length;i++)
        {
            // o(2n)
            //o(1)
            System.out.print(arr[i]+" ");
        }
    }
    static void fn1o2n(int arr[])
    {
        int ctr_0=0,ctr_1=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                ctr_0++;
            }
            else if(arr[i]==1){
                ctr_1++;
            }
        }
        for(int i=0;i<ctr_0;i++)
        {
            arr[i]=0;
        }
        for(int i=ctr_0;i<ctr_0+ctr_1;i++)
        {
            arr[i]=1;
        }
        for(int i=ctr_0+ctr_1;i<arr.length;i++)
        {
            arr[i]=2;
        }
        return;
    }
}
*/
//18.The majority element is the element that appears more than ⌊n / 2⌋ times. 
//leetcode 169:
// Input: nums = [2,2,1,1,1,2,2]
// Output: 2
/* 
class Solution {
    public int majorityElement(int[] nums) {
        //method 1:
        // Arrays.sort(nums);
        // return (nums[nums.length/2]);
        //method 2:
        int num=0,ctr=0;
        for(int i=0;i<nums.length;i++)
        {
            if(ctr==0)
            {
                num=nums[i];
                ctr=1;
            }
            else if(num==nums[i])
            {
                ctr++;
            }
            else 
            {
                ctr--;
            }
        }
        ctr=0;
        for(int i=0;i<nums.length;i++)
        {
            if(num==nums[i]){ctr++;}
        }
        if(ctr>nums.length/2)
        {
            return num;
        }
        return -1;
    }
}
*/
//19.Maximum Subarray in the subarray with the largest sum, and return its sum.
//leedcode:53:
// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
/*
public class sohomain {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int sum=0,max=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(sum<0)
            {
                sum=0;
            }
            sum+=arr[i];
            if(sum>max)
            {
                max=sum;
            }
        }
        System.out.print(max);
    }
}
*/

//20.Best Time to Buy and Sell Stock
// Input: prices = [7,1,5,3,6,4]
// Output: 5
/*
public class sohomain {
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        System.out.println(maxProfit(price));
    }
    static int maxProfit(int[] prices)
     {
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
//21.Rearrange Array Elements by Sign equal number of positive and negative integers.
//leedcode:2149
// Input: nums = [3,1,-2,-5,2,-4]
// Output: [3,-2,1,-5,2,-4]
/*
public class sohomain {
    public static void main(String[] args) {
        int arr[]={3,1,-2,-5,2,-4};
        arr=fn(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static int[] fn(int nums[])
    {
        int positive_index=0,negetive_index=1,arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)
            {
                arr[positive_index]=nums[i];
                positive_index+=2;
            }
            else
            {
                arr[negetive_index]=nums[i];
                negetive_index+=2;
            }
        }
        return arr;
    }
}
*/

//22.Leaders in an array
// A[] = {16,17,4,3,5,2}
// Output: 17 5 2
/* 
public class sohomain {
    public static void main(String[] args) {
        int arr[]={17,16,17,4,3,5,2},maxindex=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]>=maxindex)
            {
                maxindex=arr[i];
            }
            else
            {
                arr[i]=-777;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]==-777?"":arr[i]+" ");
        }
    }
}
*/
//23.longest consective sequence
//input:100,102,100,101,101,4,3,2,3,2,1,1,1,2
//output:4
/* 
import java.util.Arrays;
public class sohomain {

    public static void main(String[] args) {
        int arr[]={100,102,100,101,101,4,3,2,3,2,1,1,1,2};
        Arrays.sort(arr);// use merage sort
        int count_current=0,last_smaller=Integer.MIN_VALUE,longest=1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]-1==last_smaller)
            {
                count_current++;
                last_smaller=arr[i];
            }
            else if(last_smaller!=arr[i])
            {
                count_current=1;
                last_smaller=arr[i];
            }
            if(longest<count_current)
            {
                longest=count_current;
            }
        }
        System.out.println(longest);
    }
}
*/
//24.
/*
public class sohomain {
    public static void main(String[] args) {
        int arr[][]=
                {
                  {1,1,1,1},
                  {1,0,1,1},
                  {1,1,0,1},
                  {0,1,1,1}
                };
        int col00=1;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==0)
                {
                    arr[i][0]=0; //row
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
        //inside of matric
        for(int i=1;i<arr.length;i++)
        {
            for(int j=1;j<arr[i].length;j++)
            {
                if(arr[i][j]!=0)
                {
                    if(arr[i][0]==0||arr[0][j]==0)
                    {
                        arr[i][j]=0;
                    }
                }
            }
        }
        //col
        if(arr[0][0]==0)
        {
            for(int i=0;i<arr[0].length;i++)
            {
                arr[0][i]=0;   
            }
        }
        //row
        if(col00==0)
        {
            for(int i=0;i<arr.length;i++)
            {
                arr[i][0]=0;
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
*/
//25.Rotate Image
//leecode:48
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [[7,4,1],[8,5,2],[9,6,3]]
/* 
public class sohomain {
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
            for(int j=i;j<len;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<len;i++)
        {
            int s=0,e=len-1;
            while(s<=e)
            {
                int temp=arr[i][s];
                arr[i][s]=arr[i][e];
                arr[i][e]=temp;
                s++;
                e--;
            }
        }
    }
}
*/
//26.Spiral Matrix
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [1,2,3,6,9,8,7,4,5]
/* 
public class sohomain {
    public static void main(String[] args) {
        int arr[][]=
        {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int temp[]=new int[3*3],ctr=0;
        int row_s=0,row_e=arr.length-1,col_s=0,col_e=arr[0].length-1;
        while(row_s<=row_e&&col_s<=col_e)
        {
            for(int i=col_s;i<=col_e;i++)
            {
                temp[ctr++]=arr[row_s][i];
            }
            row_s++;
            for(int i=row_s;i<=row_e;i++)
            {
                temp[ctr++]=arr[i][col_e];
            }
            col_e--;
            if(row_s>row_e||col_s>col_e)
            {
                break;
            }
            for(int i=col_e;i>=col_s;i--)
            {
                temp[ctr++]=arr[row_e][i];
            }
            row_e--;
            for(int i=row_e;i>=row_s;i--)
            {
                temp[ctr++]=arr[i][col_s];
            }
            col_s++;
        }
        for(int i=0;i<9;i++)
        {
            System.out.print(temp[i]+" ");
        }
    }
}
*/

//27.Count subarrays with given sum
//leetcode:560
// Input: nums = [1,1,1], k = 2
// Output: 2
/* 
public class sohomain {
    public static void main(String[] args) {
        int nums[]={1,1,1},k=2;
        System.out.println(fn(nums, k));
    }
    static int fn(int arr[],int k)
    {
        int s=0,e=0,sum=0,ctr=0;
        while(s<arr.length)
        {
            sum+=arr[e];
            if(sum==k)
            {
                ctr++;
            }
            e++;
            if(e>=arr.length)
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

//28.pascal's triangle:
//Input: numRows = 5
// Output: [
        //     [1],
        //    [1,1],
        //   [1,2,1],
        //  [1,3,3,1],
        // [1,4,6,4,1]
        // ]
/* 
import java.util.*;
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
//29.ith is set or not using bit munipulation
/* 
public class sohomain {
    public static void main(String[] args) {
        int num=13,i=2;
        //left shift
        if((num&(1<<i))!=0)
        {
            System.out.println("given number is ith position is set");
        }
        else
        {
            System.out.println("given number is ith position is not set");
        }
        num=13;
        //right shift
        if(((num>>i)&i)!=0)
        {
            System.out.println("given number is ith position is set");
        }
        else
        {
            System.out.println("given number is ith position is not set");
        }

    }
}
*/
//30.given number set ith bit 
/*
public class sohomain {
    public static void main(String[] args) {
        int num=9,i=2;
        num=num|(1<<i);
        System.out.println(num);      
    }
}
*/ 
//31.given number set clear ith bit
/* 
public class sohomain {
    public static void main(String[] args) {
        int num=9,i=2;
        num=num&(~(1<<i));
        System.out.println(num);      
    }
}
*/
//32.given number toggle the ith bit 
/* 
public class sohomain {
    public static void main(String[] args) {
        int num=9,i=2;
        num=num^((1<<i));
        System.out.println(num);      
    }
}
*/
//33.remove last set bit
/*
public class sohomain {
    public static void main(String[] args) {
        int num=13;
        num=num&(num-1);
        System.out.println(num);
    }
}
*/
//34.check if number is power of 2
/*
public class sohomain {
    public static void main(String[] args) {
        int num=16;
        if((num&(num-1))==0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
*/
//35.count the set bit
/* 
public class sohomain {
    public static void main(String[] args) {
        int num1=13,num2=13,num3=13;
        int ctr=0;
        while(num1>0)
        {
            ctr+=num1&1;
            num1=num1>>1;
        }
        System.out.println(ctr);

        ctr=0;
        while(num2>0)
        {
            if(num2%2==1)
            {
                ctr++;
            }
            num2=num2/2;
        }
        System.out.println(ctr);

        ctr=0;
        while(num3>0)
        {
            num3=num&num-1;
            ctr++;
        }
        System.out.print(ctr);
    }
}
*/
//36.covert x to y how many bit are required
/* 
public class sohomain {

    public static void main(String[] args) {
        int x=10,y=7;
        int ans=x^y;
        int ctr=0;
        while(ans>0)
        {
            ctr+=ans&1;
            ans=ans>>1;
        }
        System.out.println(ctr);

    }
}
*/
//37.print all subset
//input:[1,2,3]
/* 
import java.util.*;
public class sohomain {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int num=3;
        int subset=1<<num;//2^3=8
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<=subset-1;i++)
        {
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<=num-1;j++)
            {
                if((i&(1<<j))!=0)
                {
                    temp.add(arr[j]);
                }
            }
            list.add(temp);
        }
        for(List<Integer> row : list)
        {
            for (Integer element : row)
            {
                System.out.print(element+" ");
            }
            System.out.println();
        }
        System.out.println(1<<num);
    }
}
*/
//38.single number 
//input:4,1,2,1,2
/*
public class sohomain {
    public static void main(String[] args) {
        int arr[]={4,1,2,1,2};
        int result=0;
        for(int i=0;i<arr.length;i++)
        {
            result=result^arr[i];
        }
        System.out.println(result+" ");
    }
}
*/
//39.the  given number power two
/*
    import java.util.*;
    public class sohomain {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int num=scan.nextInt();
            System.out.println(isPowerOfTwo(num));
        }
        static boolean isPowerOfTwo(int n)
        {
            return n>0 && (n&(n-1))==0;
        }
    } 
*/
//40.the given number print 1 to n xor opreation:
/* 
public class sohomain {
    public static void main(String[] args) {
        int num=6;
        System.out.println(xor(num));
    }
    static int xor(int num)
    {
        if(num%4==1)
        {
            return 1;
        }
        else if(num%4==2)
        {
            return num+1;
        }
        else if(num%4==0)
        {
            return 0;
        }
        return num;
    }
}
*/
//40.get ith bit and set ith bit cleat ith bit
/*
public class sohomain {
    public static void main(String[] args) {
        int num=70,i=3;
        i--;
        System.out.print(get(num,i)+" "+set(num,i)+" "+clear(num,i));
    }
    static int get(int num,int i)
    {
        return (1&(num>>i));
    }
    static int set(int num,int i)
    {
        return (num|(1<<i));
    }
    static int clear(int num,int i)
    {
        return (num&(~(1<<i)));
    }
}
*/
//41.print divisons of number
// input:36 
/* 
import java.util.*;
public class sohomain {
    public static void main(String[] args) {
        int num=64;
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=1;i*i<=num;i++) // i*i<=num  ====> i<=sqrt(num)
        {
            if(num%i==0)
            {
                arr.add(i);
                if(num/i!=i)
                {
                    arr.add(num/i);
                }
            }
        }
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" ");
        }
    }
}
*/
//42.check is a number is prime or not
/*
public class sohomain {
    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }
    static String isPrime(int num)
    {
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)
            {
                return "the number is not a prime number";
            }
        }
        return "the number is prime number";
    }
}
*/
//43.pow(x,n)
/*
public class sohomain {
    public static void main(String[] args) {
        int x=2,n=3,temp=0;
        if(n<0)
        {
            temp=1/(pow(x, -n));
        }
        else
        {
            temp=pow(x, n);
        }
        System.out.println(temp);
    }
    static int pow(int x,int n)
    {
        int ans=1;
        while(n>0)
        {
            if(n%2==1)
            {
                ans=ans*x;
                n=n-1;
            }
            else
            {
                x=x*x;
                n=n/2;
            }
        }
        return ans; 
    }
}
*/
//44.sieve of eratosthenes (for  prime number)
/* 
public class sohomain {
    public static void main(String[] args) {
        int num=31;
        int prime_arr[]=new int[num+1];//default all the element will be 0 in java and c  will be old compiler is garbage  value
        for(int i=2;i*i<=num;i++)
        {
            if(prime_arr[i]==0)
            {
                for(int j=i*i;j<=num;j+=i)
                {
                    prime_arr[j]=1;
                }
            }
        }
        for(int i=2;i<num+1;i++)
        {
            if(prime_arr[i]==0)
            {
            System.out.print(i+" ");
            }
        }
    }
}
*/
//--------------------------sliding window and two pointer----------------------------------------------------------
//45.maximum points you can obtain from cards.card take only form the (last or first)(last and first)
/*
public class sohomain {
    public static void main(String[] args) {
        int arr[]={6,2,3,4,7,2,1,7,1},k_cards=4;
        int left_sum=0,rigth_sum=0,max=0;
        for(int i=0;i<k_cards;i++)
        {
            left_sum+=arr[i];
        }
        if(max<left_sum){max=left_sum;}
        int last_index=arr.length-1;
        for(int i=k_cards-1;i>=0;i--)
        {
            left_sum=left_sum-arr[i];
            rigth_sum=rigth_sum+arr[last_index];
            last_index--;
            if(max<(left_sum+rigth_sum))
            {
                max=left_sum+rigth_sum;
            }
        }
        System.out.println(max);
    }
}
*/
//46.longest substring without repeating character
//input:cadbzabcd
//output:5
/*
public class sohomain {
    public static void main(String[] args) {
        char ch[]="cadbzabcd".toCharArray();
        int l=0,r=0,max=0;
        int hash[]=new int[256];
        while(r<ch.length)
        {
            if(hash[ch[r]]!=0)
            {
                if(hash[ch[r]]>=l)
                {
                    l=hash[ch[r]]+1;
                }
            }
            if(max<r-l+1)
            {
                max=r-l+1;
            }
            hash[ch[r]]=r;
            r++;
        }
        System.out.println(max);
    }
}
*/
//47.
// Input:
// N = 7
// Arr = {1, 2, 3, 5, 4, 7, 10}
// Output:
// 7 5 3 1 2 4 10
/* 
import java.util.*;
public class sohomain {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,4,7,10};
        Arrays.sort(arr);
        int arr1[]=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]%2==1)
            {
                arr1[j++]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                arr1[j++]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}
*/
//------------------------------------------------------
//48.
// Input : 800
// Output : Currency  Count 
//          500 : 1
//          200 : 1
//          100 : 1

// Input : 2456
// Output : Currency  Count
//          2000 : 1
//          200 : 2
//          50 : 1
//          5 : 1
//          1 : 1
/* 
public class sohomain {
    public static void main(String[] args) {
        int num=2456;
        System.out.println("2000:"+num/2000);
        // num=num/2000;//1
        // num=num%2000//456
        num=num/2000!=0?num%500:num;

        System.out.println("500:"+num/500);
        num=num/500!=0?num%500:num;

        System.out.println("200:"+num/200);
        num=num/200!=0?num%200:num;
        
        System.out.println("100:"+num/100);
        num=num/100!=0?num%100:num;

        System.out.println("50:"+num/50);
        num=num/50!=0?num%50:num;

        System.out.println("20:"+num/20);
        num=num/20!=0?num%20:num;
        
        System.out.println("10:"+num/10);
        num=num/10!=0?num%10:num;

        System.out.println("5:"+num/5);
        num=num/5!=0?num%5:num;

        System.out.println("1:"+num/1);
        num=num/1!=0?num%1:num;

    }
}
*/
//-----------------------------------------------------------------
//49.
/* 
public class sohomain {
    public static void main(String[] args) {
        String str[]={"loke","loeks"};
        int i=0;
        try
        {
            while(str[i]!=null)
            {
                System.out.println(str[i]+" ");
                i++;
            }
        }
        catch(Exception e)
        {

        }

    }
}
*/
//-----------------------
//50.
//Single Number II
/* 
class Solution {
    public int singleNumber(int[] nums) {
        int one=0,two=0;
        for(int i=0;i<nums.length;i++)
        {
            one = ((one^nums[i])&(~two));
            two = ((two^nums[i])&(~one));
        }
        return one;
    }
}
*/
//----------------------
//51.
/* 
public class sohomain {
    public static void main(String[] args) {
        int arr[][]=
              {
                {3,3,1,1},
                {1,2,3,4},
                {1,2,3,4}
              };
    }
    static int diagonalSum(int[][] mat) {
        int sum=0;
        int j=mat.length-1;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
            if(i!=j){
                sum+=mat[i][j];
            }
            j--;
        }
        return sum;
    }
}
*/

//----------------
//52.
/* 
static String isSquare(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4)
{
       if(x1 == x2 && x3 == x4 && y1 == y2 && y3 == y4)
       { 
         return "No";
       }
       if(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1) ) == ((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3))) 
       {
          return "Yes";
       }
       return "No";
}
*/
//---------------
//53.
// Input:
// n = 5
// arr[] = {1,2,3,4,5}
// Output: 2 1 4 3 5
// Explanation: Array elements after 
// sorting it in wave form are 
// 2 1 4 3 5.
// Example 2:

// Input:
// n = 6
// arr[] = {2,4,7,8,9,10}
// Output: 4 2 8 7 10 9
// Explanation: Array elements after 
// sorting it in wave form are 
// 4 2 8 7 10 9.

/* 
class Solution {
    public static void convertToWave(int n, int[] a) {
        int len=a.length%2==0?a.length-1:a.length-2;
        for(int i=len;i>0;i-=2)
        {
            a[i]=a[i]^a[i-1];
            a[i-1]=a[i]^a[i-1];
            a[i]=a[i]^a[i-1];
        }
    }
}
*/
//---------------------
//54.
// Example 1:
// Input:
// N = 7, X = 2
// Arr[] = {1, 1, 2, 2, 2, 2, 3}
// Output: 4
// Explanation: 2 occurs 4 times in the
// given array.
// Example 2:

// Input:
// N = 7, X = 4
// Arr[] = {1, 1, 2, 2, 2, 2, 3}
// Output: 0
// Explanation: 4 is not present in the
// given array.
/* 
class Solution {
    int count(int[] arr, int n, int x) {
        int ctr=0;
        for(int i=0;i<n/2;i++)
        {
            if(arr[i]==x)
            {
                ctr++;
            }
            if(arr[n-i-1]==x)
            {
                ctr++;
            }
        }
        if(n%2==1&&arr[n/2]==x){ctr++;}
        return ctr;
    }
}
*/
//-------------------------------
//55.second longest
/* 
public class sohomain {
    public static void main(String[] args) {
        int arr[]={1,2,34,351,1,1223,42342};
        int f=0,s=0;
        for(int i=0;i<arr.length;i++)
        {
            if(s<arr[i])
            {
                s=f;
                f=arr[i];
            }
            else if(s<arr[i]&&f!=arr[i])
            {
                s=arr[i];
            }
        }
        System.out.println(f+" "+s);
    }
}
*/
//--------------------------------
//56.
// class Solution {
//     public int climbStairs(int n) {
//         if (n == 0 || n == 1) {
//             return 1;
//         }
//         return climbStairs(n-1) + climbStairs(n-2);
//     }
// }
//--------------------------------
//57.
/* 
public class sohomain {

    public static void main(String[] args) {
        int arr[][]=
                   {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9},
                   };
        ninetyDegree(arr);
        System.out.println("90 degeree");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        ninetyDegree(arr);
        System.out.println("180 degeree");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        ninetyDegree(arr);
        System.out.println("270 degeree");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        ninetyDegree(arr);
        System.out.println("360 degeree");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void ninetyDegree(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length/2;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[i][arr.length-1-j];
                arr[i][arr.length-1-j]=temp;
            }
        }
    }
}
*/
//--------------------------------------------------
//1.
/* 
public class sohomain 
{
    public static void main(String[] args) {
        String str[]={"one","two","three"};
        fn(str, 0);
    }
    static void fn(String str[],int i)
    {
        if(i>=str.length)
        {
            return;
        }
        System.out.print(str[i]+" ");
        fn(str,i+1);
        System.out.print(str[i]+" ");
    }
}
*/
//-----------------------------------------
//2.
/* 
public class sohomain {
    public static void main(String[] args) {
        int arr1[]={2,3,4,5,6,7,9,10,13},arr2[]={2,3,4,5,6,7,8,11,15};
        int arr3[]=new int[arr1.length+arr2.length];
        int i=0,j=0,ctr=0;
        int m=remove(arr1, 0),n=remove(arr2, 0);
        while(i<m&&j<n)
        {
            if(arr1[i]<arr2[j])
            {
                arr3[ctr++]=arr1[i];
                i++;
            }
            else if(arr1[i]>arr2[j])
            {
                arr3[ctr++]=arr2[j];
                j++;
            }
            else
            {
                arr3[ctr++]=arr1[i];
                i++;
                j++;
            }
        }
        while(i<m)
        {
            arr3[ctr++]=arr1[i];
            i++;
        }
        while(j<n)
        {
            arr3[ctr++]=arr2[j++];
        }
        for(i=0;i<ctr;i++)
        {
            System.out.print(arr3[i]+" ");
        }
    }
    static int remove(int arr[],int i)
    {
        for(int j=0;j<arr.length;j++)
        {
            if(j==arr.length-1)
            {
                arr[i++]=arr[j];
            }
            else if(arr[j]!=arr[j+1])
            {
                arr[i++]=arr[j];
            }
        }
        return i;
    }
}
*/
//--------------------------
//3.
/* 
public class sohomain {
    public static void main(String[] args) {
        String str="12345";
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<str.length();j++)
            {
                if(i==j||j==str.length()-1-i)
                {
                    System.out.print(str.charAt(j)+" ");
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
//---------
//4.
/* 
import java.util.Arrays;
public class sohomain {
    public static void main(String[] args)
    {
        String str="b3c6d15";
        char ch;
        for(int i=0;i<str.length();i+=2)
        {
            int n=(int)(str.charAt(i+1)-'0');
            ch=str.charAt(i);
            if(i+2<str.length()&&str.charAt(i+2)>='0'&&str.charAt(i+2)<='9')
            {
                n=n*10+(int)(str.charAt(i+2)-'0');
                i++;
            }
            for(int j=0;j<n;j++)
            {
                System.out.print(ch+" ");
            }
        }
    }
}
*/
//-----------------
//1.Pangram Checking
/* 
public class sohomain {
    public static void main(String[] args) {
        String str="abc defGhi JklmnOP QRStuv wxz";
        int arr[]=new int[26];
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='a'&&str.charAt(i)<='z')
            {
                arr[(int)(str.charAt(i)-'a')]++;
            }
            else if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
            {
                arr[(int)(str.charAt(i)-'A')]++;
            }
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]==0)
            {
                System.out.println("False");
                return;
            }   
        }
        System.out.println("True");
    }
}
*/
//------------------------
//2. Password Strength
/* 
public class sohomain {
    public static void main(String[] args) {
        String str="QwertY123";
        int i=0,u=0,l=0,d=0,s=0;
        if(str.length()<=7){System.out.println("Weak");return;}
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
            {
                u++;
            }
            else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
            {
                l++;
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
        if(u!=0){i++;}
        if(l!=0){i++;}
        if(d!=0){i++;}
        if(s!=0){i++;}
        System.out.println(
                           i==4?"Strong":
                           i==3?"Good":
                           i==2?"Medium":"Weak"
                         );
    }
}
*/
//----------------------------
//3. First Occurrences
/* 
public class sohomain {
    public static void main(String[] args) {
        String str1="ZOHOCORPORATION",str2="PORT";
        int min=99999,max=0;
        for(int i=0;i<str2.length();i++)
        {
            for(int j=0;j<str1.length();j++)
            {
                if(str2.charAt(i)==str1.charAt(j))
                {
                    if(min>j){min=j;}
                    if(max<j){max=j;}
                    break;
                }
            }
        }
        for(int i=min;i<=max;i++)
        {
            System.out.print(str1.charAt(i)+" ");
        }
    }
}
*/
//---------------
//4. Matrix Diagonal sum
//sum of upper layer and lower layer
/* 
public class sohomain {
    public static void main(String[] args) {
        int arr[][]=
        {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int u=0,l=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i<=j)
                {
                    u+=arr[i][j];
                }
                if(i>=j)
                {
                    l+=arr[i][j];
                }
            }
        }
        System.out.println(u+" "+l);     
    }
}
//output:26 34
*/
//------------------------------
/* 
5. Cricket Scores
Given a timeline of scores, find the individual scores of player 1 and player 2 and Extras
W – Wide N – No Ball . – Dot Ball
Consider the game starts from player 1
I/P:
1 . 2 . 4 3 6 W 1 . N . 2 1
O/P:
P1 – 8
P2 – 12
Extras – 2
public class sohomain {
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
//------------
//6.in c language
//7.
/* 
public class sohomain {
    public static void main(String[] args) {
        int arr[][]=
        {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int m=arr.length,n=arr[0].length;
        int temp[]=new int[m*n];
        int row=0,col=0;
        int ctr=0;
        boolean up = true;
        while(row<m&&col<n)
        {
            if(up)
            {
                while(row>0&&col<n-1)
                {
                    temp[ctr++]=arr[row][col];
                    row--;
                    col++;
                }
                temp[ctr++]=arr[row][col];
                if(col==n-1)
                {
                    row++;
                }
                else
                {
                    col++;
                }
            }
            else
            {
                while(col>0&&row<n-1)
                {
                    temp[ctr++]=arr[row][col];
                    row++;
                    col--;
                }
                temp[ctr++]=arr[row][col];
                if(row==n-1)
                {
                    col++;
                }
                else
                {
                    row++;
                }   
            }
            up=!up;

        }
        for(int i=0;i<ctr;i++)
        {
            System.out.print(temp[i]+" ");
        }
    }
}
*/