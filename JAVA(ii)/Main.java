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

import java.util.Arrays;

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