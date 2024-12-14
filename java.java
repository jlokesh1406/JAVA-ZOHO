// import java.util.Scanner;
// public class java {
//     public static void main(String args[])
//     {
//         Scanner scan = new Scanner(System.in);
//         int num=scan.nextInt();
//         System.out.printf("%03f",num);
//     }
// }


// import java.util.Scanner;
// public class java {
//     public static void main(String args[])
//     {
        //literals  assign the value to the variable
            // int num=0b1101;
            // System.out.print(num);

        //---------------------------------------//

        //type conversion and casting 
            //  int to long
            //  float to double
            //  float to int
            //  int to float
            //  int to double
        //  int a=10;
        //  long b=20;
        //  long c=(long)a+b;
        //  System.out.print((double)c);

        //  int A=125;
        //  byte B=(byte)A;
        //  System.out.println(B);

        //  int C=257;     
        //  byte D=(byte)C;  //byte sholud be range -128 to 127 if it's greater than modulus operation on number
        //  //257%127=1
        //  System.out.println(D);


         //---------------------------------------//

        //  assignment oprators (=):
        //  ex:
        //  a=b;
        // += (addition assignment)
        // -= (subtraction assignment)
        // *= (multiplication assignment)
        // /= (division assignment)
        // %= (remainder assignment)
        // int a=1;
        // a++;
        // System.out.println(a);
        // System.out.println(a++);
        // System.out.println(a);
        // int b=a++;
        // System.out.println(b);

        //Relational operation: "==","!=",">","<",">=","<="
        //logical operation: "&&","||","!"
        
        
           //do_while
//         int aa=0;
//         do
//         {
//             System.out.println(aa);
//             aa++;
//         }
//         while(aa!=3);
//     }
// }

//enhanced for loop
/* 
import java.util.Scanner;
public class java {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt(),arr[]=new int [size];
        for(int i=0;i<size;i++){arr[i]=scan.nextInt();}
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
} 
*/

// Data Type	Size (bits)	Range	Format Specifier (printf)
// byte	8	-128 to 127	%d (or %c for unsigned)
// short	16	-32,768 to 32,767	%d
// int	32	-2,147,483,648 to 2,147,483,647	%d
// long	64	-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807	%d or %ld
// float	32	IEEE 754 single-precision floating-point	%f
// double	64	IEEE 754 double-precision floating-point	%f or %lf
// char	16	0 to 65,535 (unsigned)	%c
// boolean	Not precisely defined (typically implementation-dependent)	true or false


//------------------------------------Methods----------------------------------------//
/* 
class computer
{
    public void playmusic()
    {
        System.out.print("Music playing..");
    }
    public String getmepen()
    {
        return "pen";
    }
    public String getmepenprice(int cost)
    { 
        if(cost==10)
        {
            return "gold pen";
        }
        return "black pen";
    }
}
public class java {
    public static void main(String args[])
    {
        computer obj = new computer();
        System.out.println(obj.getmepen());
        System.out.println(obj.getmepenprice(10));

    }
}
*/
//------------------------------------Methods overloading ----------------------------------------//
/* 
class calculator
{
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
    public int add(int a,int b)
    {
        return a+b;
    }
    public int add(int a)
    {
        return a++;
    }
}
public class java {
    public static void main(String args[])
    {
        calculator obj = new calculator();
        System.out.println(obj.add(1,1,1));
        System.out.println(obj.add(1,1));
        System.out.println(obj.add(1));
    }
}
*/

//-----------------------------------------arrays---------------------------------------------------------//

/*
import java.util.Scanner;
public class java {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int size=2;
        String arr[]=new String[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=scan.next();
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
} 
*/
//multi dimensional array generate random numbers
/* 
import java.util.*;
public class java {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt(),arr[][]=new int[size][size];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(i==0){arr[i][j]=(int)(Math.random()*100);}// Math.random is return float value so that mulltiple 100 if 100 increse 10 time than number digit is increse";
                else {arr[i][j]=(int)(Math.random()*1000);}

            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
*/

//------------------------String---------------------------------------
/* 
public class java { 
    public static void main(String args[])
    {
        String name = new String("lokesh");
        System.out.println(name);
        System.out.println(name.charAt(3));
        System.out.println(name.length());
        System.out.println(name.concat(" jayaseelan"));

        String s1="SS",s2="SS";
        System.out.println(s1==s2);
    }
}
*/
//stringbuffer abd stringbulider in java

/* 
public class java { 
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer("lokesh");
        sb.append("_jayaseelan");
        System.out.println(sb);

        sb.delete(1, 3);
        System.out.println(sb);

        sb.deleteCharAt(5);
        System.out.println(sb);

        sb.insert(5, "j");
        System.out.println(sb);

       // String str=sb.toString(); // for converting stringbuffer to string

    }
}
*/
/* 
import java.util.Date;
public class java { 
    public static void main(String args[])
    {
        Date tday = new Date();
        System.out.println(tday); 


        //swap two variable without three variable
        //mehtod 1
        int a=10,b=2;
        a=a^b;
        b=b^a;
        a=a^b;
        System.out.println(a+" "+b);
        //method 2
        int A=10,B=2;
        A=A+B; //A=12
        B=A-B; //B=10
        A=A-B; //A=2
        System.out.println(A+" "+B);

        if(System.out.println("HII"))
    }
}
*/

            /*------------------Encapsulation-----------------*/ 
/*  
class Human
{
    int age;
    String name;
    static String company;
}
public class java { 
    public static void main(String args[])
    {
        Human obj = new Human();
        obj.age=19;
        obj.name="Lokesh";
        obj.company="zoho";
        System.out.println(obj.age);
        System.out.println(obj.name);
        System.out.println(obj.company);

        obj.age=18;
        obj.name="Lokesh j";
        System.out.println(obj.age);
        System.out.println(obj.name);
        System.out.println(obj.company);

    }
}
*/
// in decluared private class only use with class by the way of methods 
// class Human
// {
//     private int age = 11;
//     private String name = "Lokesh";
//     public int getAge()
//     {
//         return age;
//     } 
//     public String getString()
//     {
//         return name;
//     }
//     public void SetAge(int AGE)
//     {
//         age=AGE; //this.age=AGE; 
//     }
//     public void SetName(String NAME)
//     {
//         name=NAME;
//     }
// }
// public class java { 
//     public static void main(String args[])
//     {
//         Human obj = new Human();

//         System.out.println(obj.getAge());
//         System.out.println(obj.getString());

//         obj.SetAge(22);
//         obj.SetName("lll");
//         System.out.println(obj.getAge());
//         System.out.println(obj.getString());
//     }
// }




// public class java{
//     public static void main(String args[])
//     {
    
// 		// byte ascii[] = { 71, 70, 71,87,75,56};

// 		// String firstString = new String(ascii);
// 		// System.out.println(firstString);

// 		// String secondString = new String(ascii, 1, 5);
// 		// System.out.println(secondString);


//         // String s = "LearnShareLearn";
//         // int output = s.indexOf("ea",6);
//         // System.out.println(output);

//         // String ss = "Learn Share Learn";
//         // int num = ss.lastIndexOf("ar"); 
//         // System.out.println(num);

//         // String str1 = "geeksforgeeks";
//         // String str2 = new String("geeksforgeeks");
//         // String str3 = new String("astha");
 

//         // System.out.println(str1.compareTo(str2)); //s1==s2 ==>0
//         // System.out.println(str1.compareTo(str3)); // s1-s3 
//         // System.out.println(str3.compareTo(str1));  //s3-s1

//         // String s1="geeksforgeeks";
//         // String s2="eks";
//         // System.out.println(s1.endsWith(s2));

//         StringBuffer sb1 = new StringBuffer("Hello ");
//         sb1.insert(1, "Java");
//         System.out.println(sb1);
       
//         StringBuffer sb2 = new StringBuffer("Hello");
// 		sb2.replace(1, 4, "Java");
// 		System.out.println(sb2);

//         StringBuffer sb3 = new StringBuffer("Hello");
//         sb3.delete(1, 3);
//         System.out.println(sb3);

//         StringBuffer sb5 = new StringBuffer("Hello");
// 		sb5.reverse();
// 		System.out.println(sb5);

// 	}

// }
//
// public class java{
//     public static void main(String args[])
//     {
//         Scanner scan = new Scanner (System.in);
//         int num=scan=scan.nextInt();
//         String str[]=new int[num];
//     }
// }



 //--------------------------------------------METHODS------------------------------

// import java.util.Arrays;

// public class java{
//     public static void main(String args[])
//     {
//         System.out.println(add1(3,4)); 
//         add2(3,4);
//         str();

//         // System.out.println(CEO("LOKESH"));  error will be so because function can't return any data type
//         int arr[]={1,2,3,1,1};
//         System.out.println(arr);
//         change(arr);
//         System.out.println(Arrays.toString(arr));


//     }
//     static int add1(int a,int b)
//     {
//         return a+b;
//     }
//     static void add2(int a,int b)
//     { 
//         System.out.println(add1(a,b));
//     }
//     static void str()
//     {
//         System.out.println("HII MY SELF LOKESH CEO OF..TED_TALKS.. IF YOU ARE WORK SO HARD IN A COMPANY YOUR THE NEXT CEO");
//     }
//     static void CEO(String str)
//     {
//         str="ARUN";
//     }
//     static void change(int arr[])
//     {
//         arr[0]=100;
//     }    
// }

 

// public class java{
//     static int num=10;
//     public static void main(String args[]) 
//     {
//         System.out.println(num);
//         int num=100; //this part of decluration only use in this block 
//         System.out.println(num);
//         fun();
//     }
//     static void fun()
//     {
//         System.out.println(num);
//     }
// }

// import java.util.Arrays;
// public class java{
//     public static void main(String args[])
//     {
//         fun(1,2,4,6,7,7,4,2,32);

//         mfun(1,2,"lokesh ","jayaseelan ","dinesh ");
//     }
//     static void fun(int ...num)
//     {
//         System.out.println(Arrays.toString(num));
//     }
//     static void mfun(int a,int b, String ...str)
//     {
//         System.out.printf("Two values are %d %d\n",a,b);
//         System.out.println(Arrays.toString(str));
//     }
// }
//method overloading
// public class java{
//     public static void main(String args[])
//     {
//         System.out.println(add(1,1));
//         System.out.println(add(1,1,1,1));
//     }
//     static int add(int a,int b)
//     {
//         return a+b;
//     }
//     static int add(int a,int b,int c,int d)
//     {
//         return a+b+c+d;
//     }
// }


//----------------------------------------------------DSA---------------------------------------------------
 //--------------------------------------------ARRAY AND ARRAYLIST------------------------------

 /* 
import java.util.ArrayList;
import java.util.Arrays;

public class java{
    public static void main(String args[])
    {
        int arr[]={12,32,3,43,1};   
        ArrayList <Integer> list_arr = new ArrayList<Integer>();
        list_arr.add(15);
        list_arr.add(212);
        list_arr.add(1212);
        list_arr.add(21);
        list_arr.add(143);
        list_arr.add(2134);
        list_arr.add(1431);
        list_arr.add(221);
        System.out.println(Arrays.toString(arr)); //ARRAY

        System.out.println(list_arr); //ARRAYLIST

        System.out.println(list_arr.contains(23)); //ARRAYLIST

        list_arr.set(0,143);
        System.out.println(list_arr); 

        list_arr.remove(0);
        System.out.println(list_arr); 

        System.out.println(list_arr.get(0)); 


    }
}

*/
// public class java{
//     public static void main(String args[])
//     {
//         int arr[]={2,3,5,9,14,15,16,18};
//         int target=2;
//         int s=0,e=arr.length-1;
//         while (s<e) {
//             int mid=s+(e-s)/2;
//             if(arr[mid]>target)
//             {
//                 e=mid;
//             }
//             else
//             {
//                 s=mid+1;
//             }
//         }
//         System.out.println(arr[s]);
//     }
// }


//linear search
/* 
public class java{
    public static void main(String args[])
    {
        int arr[]={23,23,4,3,3451,1245135,1345,1435,13451};
        int target=23,flag=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
             System.out.println("target element present in the array");
            
        }
        else
        {
           System.out.print("target element is not present in the array");
        }
    }
}
*/
//binary search
/*
public class java{
    public static void main(String args[])
    {
        int arr[]={23,43,65,67,67,67,245,350,360};
        // int arr[]={360,350,245,67,67,67,65,43,23};
        int target=67,start=0,end=arr.length-1;
        int flag=0;
        if(arr[0]<arr[arr.length-1])
        {
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                if(arr[mid]>target)
                {
                    end=mid-1;
                }
                else if(arr[mid]<target)
                {
                    start=mid+1;
                }
                else
                {
                    if(arr[mid]==target)
                    {
                        flag=1;
                        break;
                    }
                }
            }
            System.out.println((flag==1)?"PRESENT":"NOT_PRESENT");
       }
       else
       {
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
                    if(arr[mid]==target)
                    {
                        flag=1;
                        break;
                    }
                }
            }
            System.out.println((flag==1)?"PRESENT":"NOT_PRESENT");
       }
    }
}
*/



///bubble sort
/* 
public class java{
    public static void main(String args[])
    {
        int arr[]={2,3,32,32,144,1,16,18};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
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

//selection sort;
/*
public class java{
    public static void main(String args[])
    {
        int arr[]={2,3,32,32,144,1,16,18};
        for(int i=0;i<arr.length;i++)
        {
            int lastindex=arr.length-1-i;
            int maxindex=max(arr,0,lastindex);
            swap(arr,maxindex,lastindex);
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static int max(int arr[],int findex,int lindex)
    {
        int max=findex;
        for(int j=findex;j<=lindex;j++)
        {
            if(arr[max]>arr[j])
            {
                max=j;
            }
            
        }
        return max;
    }
    static void swap(int arr[],int s,int e)
    {
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
}
*/

//insertion sorting
/* 
public class java
{
    public static void main(String args[])
    {
        int arr[]={12,323,2,2425,-24,2442,4};
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr, j, j-1); 
                }
                else
                {
                    break;
                }
            }
            for(int k=0;k<=i+1;k++)
            {
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int arr[],int s,int e)
    {
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
}
*/


//cycle sort
/*
public class java
{
    public static void main(String args[])
    {
        int num[]={3,5,2,1,4};
        int size=5;
        for(int i=0;i<size;)
        {
            int index=num[i]-1; // if number is start with 0 so did't put a -1 beacuse 0 start from the index 0
            if(num[i]!=num[index])
            {
                swap(num,i,index);
            }
            else
            {
                i++;
            }
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(num[i]+" ");
        }
    }
    static void swap(int arr[],int s,int e)
    {
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
}
*/

//String and StringBuffer
/*
    1.mutable seq. of charractors
    2.efficient
    3.thread safe
 */
// public class java
// {
//     public static void main(String args[])
//     {
        // StringBuffer sb = new StringBuffer();
        // String str="LOKESH";
        // sb.append(str);
        // String temp = sb.reverse().toString();
        // System.out.println(temp);

        // StringBuffer sb1 = new StringBuffer();
        // StringBuffer sb2 = new StringBuffer("LOKESH");
        // StringBuffer sb3 = new StringBuffer(2);
        // sb3.append("LOKESH Jddd ddddd dd");
        // System.out.println(sb3);

        // StringBuffer sb4 = new StringBuffer();
        // System.out.println(sb4.capacity());
        // sb4.append("LOKESH ");
        // System.out.println(sb4);

        // sb4.insert(6," Jayaseelan");
        // System.out.println(sb4);

        // sb4.replace(6, 17," JAYASEELAN");
        // System.out.println(sb4);

        // sb4.delete(6, 17);
        // System.out.println(sb4);

        // sb4.reverse();
        // System.out.println(sb4);

        // System.out.println(sb4.replaceAll("",""));

//     }
// }
 
// import java.util.*;
// public class java
// {
//     public static void main(String args[])
//     {
//         Scanner scan = new Scanner(System.in);
//         int n=scan.nextInt();
//         scan.nextLine();
//         for(int i=0;i<n;i++)
//         {
//             int sum=0;
//             while(scan.hasNextLine())
//             {
//                 sum=sum*10+scan.nextInt();
//             }
//             System.out.println(sum);
//         }
//     }
// }



// import java.util.Arrays;
// import java.util.Scanner;

// public class oops {
//     public static void main (String agrs[])
//     {
        // If str1 is lexicographically less than str2, the result is a negative integer.
        // If str1 is lexicographically greater than str2, the result is a positive integer.
        // If both strings are equal, the result is 0.
        // String str1 = "apple";
        // String str2 = "kkkkk";
        // int result = str1.compareTo(str2);
        // System.out.println("Comparison result: " + result);


        // String sentence = "Java is powerful and Java is popular";
        // String replaced = sentence.replaceFirst("Java", "Python");
        // System.out.println("After replacing first occurrence: " + replaced);

        // String sentence = "Java123 is fun456!";
        // String replaced = sentence.replaceAll("\\d", "");
        // System.out.println("After removing digits: " + replaced);

//         String[] words = {"Java", "is", "fun"};
// String sentence = String.join("-", words);
// System.out.println("Joined sentence: " + sentence);

// String fileName = "document.txt";
// boolean startsWithDoc = fileName.toLowerCase().startsWith("joc");
// boolean endsWithTxt = fileName.toLowerCase().endsWith(".txt");
// System.out.println("Starts with 'doc' (case-insensitive): " + startsWithDoc);
// System.out.println("Ends with '.txt' (case-insensitive): " + endsWithTxt);


// String emptyOrWhitespace = "   ";
// boolean isBlank = emptyOrWhitespace.isBlank();
// System.out.println("Is the string blank? " + isBlank);

// String text = "Hello";
// int codePoint = text.codePointAt(1);
// System.out.println("Code point at index 1: " + codePoint);

// String text = "Hello";
// int codePoints = text.codePointCount(2, text.length());
// System.out.println("Number of code points: " + codePoints);


// String paddedString = "   Hello, World!   ";
// String strippedString = paddedString.strip();
// System.out.println("Stripped string: " + strippedString);


// String paddedString = "   Hello, World!   ";
// String strippedLeading = paddedString.stripLeading();
// String strippedTrailing = paddedString.stripTrailing();
// System.out.println("Stripped leading: " + strippedLeading);
// System.out.println("Stripped trailing: " + strippedTrailing);


// String indentedText = "Hello\nWorld";
// String indented = indentedText.indent(4);
// System.out.println("Indented text:\n" + indented);

// String str4 = "789";
// Scanner scanner = new Scanner(str4);
// int num4 = scanner.nextInt();
// System.out.println("Converted int: " + num4);

// int[] array = new int[5];
// Arrays.fill(array, 7);
// System.out.println(Arrays.toString(array));

// }}

/*

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class java {
    public static void main(String[] args) {
         int[] arr = {5, 2, 8, 10, 1};
        
        // 1. Printing the array
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        // 2. Sorting the array
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        
        // 3. Binary search in the array
        int index = Arrays.binarySearch(arr, 8);
        System.out.println("Index of 8: " + index);
        
        // 4. Filling the array with a specific value
        Arrays.fill(arr, 0);
        System.out.println("Filled Array: " + Arrays.toString(arr));
        
        // 5. Copying the array
        int[] copyArr = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied Array: " + Arrays.toString(copyArr));
        
        // 6. Checking equality of arrays
        boolean isEqual = Arrays.equals(arr, copyArr);
        System.out.println("Arrays are equal: " + isEqual);
        
        // 7. Finding maximum value in the array
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Maximum value: " + max);
        
        // 8. Finding minimum value in the array
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("Minimum value: " + min);

          // 9. Checking if array contains a specific value
          boolean containsValue = Arrays.stream(arr).anyMatch(x -> x == 8);
          System.out.println("Array contains 8: " + containsValue);
          
          // 10. Getting the sum of all elements in the array
          int sum = Arrays.stream(arr).sum();
          System.out.println("Sum of elements: " + sum);
          
          // 11. Calculating the average of all elements in the array
          double average = Arrays.stream(arr).average().getAsDouble();
          System.out.println("Average of elements: " + average);
          
          // 12. Checking if the array is empty
          boolean isEmpty = arr.length == 0;
          System.out.println("Array is empty: " + isEmpty);
          
          // 13. Reversing the array
          for (int i = 0; i < arr.length / 2; i++) {
              int temp = arr[i];
              arr[i] = arr[arr.length - 1 - i];
              arr[arr.length - 1 - i] = temp;
          }
          System.out.println("Reversed Array: " + Arrays.toString(arr));
          
          // 14. Finding the index of the first occurrence of a specific value
          int firstIndex = Arrays.asList(arr).indexOf(8);
          System.out.println("First occurrence of 8: " + firstIndex);
          
          // 15. Finding the index of the last occurrence of a specific value
          int lastIndex = Arrays.asList(arr).lastIndexOf(8);
          System.out.println("Last occurrence of 8: " + lastIndex);

           // 16. Converting array to a string representation
        String arrString = Arrays.toString(arr);
        System.out.println("Array as String: " + arrString);
        
        // 17. Checking if two arrays are equal (element-wise)
        int[] anotherArr = {5, 2, 8, 10, 1};
        boolean areEqual = Arrays.equals(arr, anotherArr);
        System.out.println("Arrays are equal: " + areEqual);
        
        // 18. Converting array to a list
        List<Integer> list = Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new));
        System.out.println("Array as List: " + list);
        
        // 19. Removing specific value from array
        int[] newArr = Arrays.stream(arr).filter(x -> x != 8).toArray();
        System.out.println("Array after removing 8: " + Arrays.toString(newArr));
        
        // 20. Shuffling the array
        Collections.shuffle(Arrays.asList(arr));
        System.out.println("Shuffled Array: " + Arrays.toString(arr));


             // 21. Checking if array contains only a specific value
             boolean containsOnly = Arrays.stream(arr).allMatch(x -> x == 8);
             System.out.println("Array contains only 8: " + containsOnly);
             
             // 22. Checking if array contains any value matching a predicate
             boolean containsAny = Arrays.stream(arr).anyMatch(x -> x == 8);
             System.out.println("Array contains any 8: " + containsAny);
             
             // 23. Finding the number of occurrences of a specific value in the array
             long count = Arrays.stream(arr).filter(x -> x == 8).count();
             System.out.println("Number of occurrences of 8: " + count);
             
             // 24. Converting array to lowercase (assuming elements are strings)
             String[] stringArr = {"Hello", "World"};
             String[] lowerArr = Arrays.stream(stringArr).map(String::toLowerCase).toArray(String[]::new);
             System.out.println("Lowercase Array: " + Arrays.toString(lowerArr));
             
             // 25. Finding the distinct elements in the array
             int[] duplicateArr = {1, 2, 3, 2, 4, 1, 5};
             int[] distinctArr = Arrays.stream(duplicateArr).distinct().toArray();
             System.out.println("Distinct Array: " + Arrays.toString(distinctArr));


             // 26. Sorting array in reverse order
            Arrays.sort(arr, Collections.reverseOrder());
            System.out.println("Reverse Sorted Array: " + Arrays.toString(arr));

            // 27. Checking if array is sorted in ascending order
            boolean isSortedAsc = Arrays.stream(arr).sorted().equals(Arrays.asList(arr));
            System.out.println("Array is sorted in ascending order: " + isSortedAsc);

            // 28. Checking if array is sorted in descending order
            boolean isSortedDesc = Arrays.stream(arr).sorted(Collections.reverseOrder()).equals(Arrays.asList(arr));
            System.out.println("Array is sorted in descending order: " + isSortedDesc);

            // 29. Rotating array by a specific distance
            Collections.rotate(Arrays.asList(arr), 2);
            System.out.println("Rotated Array: " + Arrays.toString(arr));

            // 30. Swapping elements at given indices
            Collections.swap(Arrays.asList(arr), 0, 4);
            System.out.println("Array after swapping: " + Arrays.toString(arr));

            // 31. Reversing elements in a portion of the array
            Collections.reverse(Arrays.asList(arr).subList(0, 3));
            System.out.println("Array after partial reversal: " + Arrays.toString(arr));

            // 32. Filling a portion of the array with a specific value
            Arrays.fill(arr, 1, 3, 99);
            System.out.println("Array after filling: " + Arrays.toString(arr));

            // 33. Shuffling elements in the array
            List<int[]> list = Arrays.asList(arr);
            Collections.shuffle(list);
            System.out.println("Shuffled Array: " + list);

            // 34. Rotating array left by a specific distance
            Collections.rotate(list, -2);
            System.out.println("Left-rotated Array: " + list);

            // 35. Swapping elements between two arrays
            Integer[] anotherArr = {6, 7, 8};
            Collections.swap(Arrays.asList(arr), 1, 1);
            Collections.copy(Arrays.asList(arr), Arrays.asList(anotherArr));
            System.out.println("Swapped Array: " + Arrays.toString(arr));

            
            // 36. Finding the index of the maximum element in the array
            int maxIndex = Arrays.asList(arr).indexOf(Collections.max(Arrays.asList(arr)));
            System.out.println("Index of maximum element: " + maxIndex);

            // 37. Finding the index of the minimum element in the array
            int minIndex = Arrays.asList(arr).indexOf(Collections.min(Arrays.asList(arr)));
            System.out.println("Index of minimum element: " + minIndex);

            // 38. Checking if array contains only unique elements
            boolean allUnique = Arrays.stream(arr).distinct().count() == arr.length;
            System.out.println("Array contains only unique elements: " + allUnique);

            // 39. Checking if array contains a subsequence
            Integer[] subsequence = {8, 10};
            boolean containsSubsequence = Collections.indexOfSubList(Arrays.asList(arr), Arrays.asList(subsequence)) != -1;
            System.out.println("Array contains subsequence [8, 10]: " + containsSubsequence);

            // 40. Counting occurrences of each element in the array
            List<int[]> list = Arrays.asList(arr);
            for (Integer elem : list) {
                int count = Collections.frequency(list, elem);
                System.out.println("Element " + elem + " occurs " + count + " times.");
            }

            // 41. Removing all occurrences of a specific element from the array
            list.removeAll(Arrays.asList(8));
            System.out.println("Array after removing all occurrences of 8: " + list);

            // 42. Removing duplicates from the array
            list = Arrays.asList(arr);
            list.stream().distinct().forEach(System.out::println);

            // 43. Finding the median of the array
            Arrays.sort(arr);
            double median;
            if (arr.length % 2 == 0)
                median = (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2.0;
            else
                median = arr[arr.length / 2];
            System.out.println("Median of the array: " + median);
            
        
    }
 }

 */

 