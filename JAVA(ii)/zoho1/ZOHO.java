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