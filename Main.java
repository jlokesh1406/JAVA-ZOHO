

//-----------------------methods------------------------------------



// 1 seperated method add two number
/* 
import java.util.Scanner;
class A
{
    public int add(int a,int b)
    {
        return a+b;
    }
}
public class Main
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int num1=scan.nextInt(),num2=scan.nextInt();
        A obj = new A();
        System.out.println(obj.add(num1, num2));
    }
}
*/

// 2 static method add a two number

/* 
import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int num1=scan.nextInt(),num2=scan.nextInt();
        System.out.println(sum(num1, num2));
    }
    static int sum(int x,int y)
    {
        return x+y;
    }
}
*/ 

//3  no argument  no return type;
/* 
public class Main
{
    public static void main(String args[])
    {
        greeting();
    }
    static void greeting()
    {
        System.out.println("HIIIIIIIIIIII");
    }
}
*/
//4  no argument  with return type;
/* 
public class Main
{
    public static void main(String args[])
    {
        System.out.println(sum());
    }
    static int sum()
    {
        int a=12,b=32;
        return a+b;
    }
}
*/
//5  with argument  without return type;
/* 
public class Main
{
    public static void main(String args[])
    {
        int a=12,b=32;
        sum(a,b);
    }
    static void sum(int x,int y)
    {
        System.out.println(x+y);
    }
}
*/

//6  with argument  with return type;
/*
public class Main
{
    public static void main(String args[])
    {
        int a=12,b=32;
        System.out.println(sum(a, b));
    }
    static int sum(int x,int y)
    {
        return x+y;
    }
}
*/

//7
/* 
public class Main
{
    public static void main(String args[])
    {
        int a=2,b=12;
        swap(a,b);
        System.out.println(a+" "+b); // 2 12

        String str = "LOKESH JAYASEELAN";
        change(str);
        System.out.println(str);   // LOKESH JAYASEELAN

        int arr[]={1,2,3,4};
        EVEN(arr);      // arr is act as pointer  by the passing starting addres
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
    static void swap(int a,int b)
    {
        int temp = a;
        a=b;
        b=temp;
    }
    static void change(String str)
    {
        str="LOKESH";
    }
    static void EVEN(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                arr[i]=0;
            }
            else
            {
                arr[i]=1;
            }
        }
    }
}
*/


/*
//8
import java.util.Arrays;
public class java{
    public static void main(String args[])
    {
        int a=10;
        int b=21;
        {
            // int a=12; error will across because already decalured
            a=78; // value will be change
            // int c=43; values will initialised in this block,will remains same and use will block
        }
        System.out.println(a);
        // System.out.println(c); // error will across because declared part only use with in block

    }
}
*/

// public class Main{
//      static int num=10;
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



//------------------------------------------------------DSA---------------------------------------
 //----------------------------------------------ARRAY AND ARRAYLIST------------------------------

 
// import java.util.ArrayList;
// import java.util.Arrays;

// public class Main{
//     public static void main(String args[])
//     {
//         int arr[]={12,32,3,43,1};   
//         System.out.println(Arrays.toString(arr)); //ARRAY
//         ArrayList <Integer> list_arr = new ArrayList<Integer>();
//         list_arr.add(15);
//         list_arr.add(212);
//         list_arr.add(1212);
//         list_arr.add(21);
//         list_arr.add(143);
//         list_arr.add(2134);
//         list_arr.add(1431);
//         list_arr.add(221);

//         for(int i=0;i<list_arr.size();i++)
//         {
//             System.out.print(list_arr.get(i)+" ");
//         }
//         System.out.println();
        

//         System.out.println(list_arr); //ARRAYLIST

//         System.out.println(list_arr.contains(23)); //ARRAYLIST

//         list_arr.set(0,143);
//         System.out.println(list_arr); 

//         list_arr.remove(0); 
//         System.out.println(list_arr); 

//         System.out.println(list_arr.get(0)); 

//         list_arr.add(0,7);
//         System.out.println(list_arr);

//         for (Integer number : list_arr) { 
//             System.out.print(number+" "); 
//         } 
//         System.out.println();

//         ArrayList <Integer> list_arr2 = new ArrayList<Integer>();
//         list_arr2.addAll(list_arr);
//         for(Integer x: list_arr2)
//         {
//             x=x+1;
//             System.out.print(x+" ");
//         }
//         System.out.println(" ");

//         list_arr.clear();
//         System.out.println(list_arr);

//         list_arr2.forEach((n) -> System.out.print(n+"-"));
//         System.out.println();

//         list_arr2.add(2,121);
//         list_arr2.add(5,121);
//         System.out.println(list_arr2.indexOf(121));
//         System.out.println(list_arr2.lastIndexOf(121));

//         System.out.println(list_arr2.isEmpty());




//     }
// }
/*
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String args[])
    {
        ArrayList <Integer> arr1 = new ArrayList<Integer>();
        arr1.add(1);
        arr1.add(5);
        arr1.add(3);
        arr1.add(4);
        arr1.add(1);
        arr1.add(4);
        arr1.add(1);
        ArrayList <Integer> arr2 = new ArrayList<Integer>();
        arr2.add(1);
        arr2.add(3);
        arr2.add(1);
        

        System.out.println(arr1.equals(arr2));

        arr1.removeAll(arr2);
        System.out.println(arr1);

        arr1.removeIf(temp->(temp%2==0));
        System.out.println(arr1);

        ArrayList <Integer> list_arr = new ArrayList<Integer>();
        list_arr.add(15);
        list_arr.add(212);
        list_arr.add(1212);
        list_arr.add(21);
        list_arr.add(143);
        list_arr.add(2134);
        list_arr.add(1431);
        list_arr.add(221);

        Collections.reverse(list_arr);
        System.out.println("rev ArrayList: " + list_arr);

        Collections.sort(list_arr);
        System.out.println("Sorted ArrayList: " + list_arr);
        
        Collections.reverse(list_arr);
        System.out.println("rev ArrayList: " + list_arr);



        ArrayList<String> students = new ArrayList<String>(); 
        students.add("Ram"); 
        students.add("Mohan"); 
        students.add("Sohan"); 
        students.add("Rabi"); 
        students.add("Shabbir"); 

        Collections.sort(students);
        System.out.println("Sorted ArrayList: " + students);

        Collections.reverse(students);
        System.out.println("Sorted ArrayList: " + students);


        students.removeIf(n -> (n.charAt(0) == 'S')); 
        for (String str : students) { 
            System.out.println(str); 
        } 


        ArrayList<String> bags = new ArrayList<String>();
        bags.add("pen");
        bags.add("pencil");
        bags.add("paper");
        ArrayList<String> boxes = new ArrayList<String>();
        boxes.add("pen");   
        boxes.add("paper");
        boxes.add("books");
        boxes.add("rubber");

        boxes.retainAll(bags);
        System.out.println("Bags Contains :" + bags);
        System.out.println("Boxes Contains :" + boxes);


        ArrayList<Integer> arr = new ArrayList<Integer>(9); 
        arr.add(2); 
        arr.add(4); 
        arr.add(5); 
        arr.add(6); 
        arr.add(11); 
        System.out.println(arr);
        for (Integer number : arr) { 
            System.out.println("Number = " + number); 
        } 

        arr.trimToSize(); 
        System.out.println("The List elements are:"); 
        for (Integer number : arr) { 
            System.out.println("Number = " + number); 
        } 
    }
}
 */

/*
import java.util.ArrayList;
import java.util.*;
public class Main{
    public static void main(String args[])
    {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(1);
        arr1.add(2);
        System.out.println(arr1.toString()); 
        System.out.println(arr1); 

        arr1.replaceAll(temp -> temp*0+1);
        System.out.println(arr1);
        
        arr1.replaceAll(temp -> temp=2);
        System.out.println(arr1);

        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        arr2.add(20);
        arr2.add(22);
        arr2.add(21);
        arr2.add(19);

        arr1.addAll(2,arr2);
        System.out.println(arr1+"ARR2");

        arr1.add(1,4);
        System.out.println(arr1+"arr2");

        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        arr3.add(20);
        arr3.add(22);
        arr3.add(20);
        arr3.add(21);
        System.out.println(arr2.containsAll(arr3));

        arr2.removeAll(arr3);
        System.out.println(arr2);

        arr3.set(0,7);
        System.out.println(arr3);

        System.out.println(arr3.subList(1,3));

    }
}

*/

 


 //---------------------------------String------------------------------------

 
 /* 
 public class Main {
 
    public static void main(String args[])
    {
        String str0="123";
        System.out.println("0 "+Integer.valueOf(str0));
        System.out.println("0 "+Float.valueOf(str0));
         

        String str1="LOKESH ";
        str1 = str1 + " Jayaseelan";
        System.out.println("1 "+str1);

        str1 = str1.concat(" (CEO OF TED TALKS)");
        System.out.println("2 "+str1);

        byte ascii[]={97,98,99,100};
        String value1 = new String(ascii);
        System.out.println("3 "+value1);
        String value2 = new String(ascii,1,3);
        System.out.println("4 "+value2);

        char ch1[]={'a','b','b','c'};
        String str2 = new String(ch1);
        String str3 = new String(ch1,1,2);
        System.out.println("5 "+str2);
        System.out.println("6 "+str3);

        String str4="LOKESH";
        System.out.println("7 "+ str4.length());
        System.out.println("8 "+str4.charAt(1));
        System.out.println("9 "+ str4.substring(3));
        System.out.println("10 "+ str4.substring(3,5));

        String str5 ="LOKESH JAYASEELAN (CEO OF TED TALKS..)";
        System.out.println("11 "+str5.indexOf("JAYASEELAN"));

        String str6 = "Learn Share Learn";
        System.out.println("12 "+str6.indexOf("ea",3));
        System.out.println("13 "+ str6.lastIndexOf("r"));


        String str7="LOKESH";
        System.out.println("14 "+str7.equals("lokesh"));
        System.out.println("15 "+str7.equalsIgnoreCase("lokesh"));
        System.out.println("16 "+str7.equals("LOKESH"));
        System.out.println("17 "+str7.equalsIgnoreCase("LOKESH"));


        // only for equal no.of strlen
        String str8="lokesh" ,str9="lokesh8";
        String str10="lokesh" ,str11="Lokesh";
        System.out.println("18 "+str8.compareTo(str9));
        System.out.println("19 "+str10.compareToIgnoreCase(str11));

        String str12="Hello";
        System.out.println("20 "+str12.toLowerCase());
        System.out.println(str12);
        System.out.println("21 "+str12.toUpperCase());

        String str13="       LOKESH             JAYASEELAN CEO OF TED TALKS";
        System.out.println("22 "+ str13.trim());  // only remove the starting whitespaces

        String str14 = "LOKESH",str15="lokesh";
        System.out.println("23 "+str14+122);
        System.out.println("24 4"+str14==str15);

        String str16 = "Lokesh J";
        System.out.println("25 "+str16.replace('L','l'));
        System.out.println("26 "+str16.replace("Lokesh","LOKESH "));

        String str17 = "Lokesh J";
        System.out.println("27 "+str17.contains("Lok"));
        System.out.println("28 "+str17.contains("K"));

        String str18 = "LOKESH";
        char ch[]=str18.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            System.out.println(ch[i]+" ");
        }
        System.out.println();

        String str19 = "LOKESH JAYASEELAN";
        System.out.println("29 "+str19.startsWith("LOK"));
        System.out.println("30 "+str19.endsWith("LAN"));

        String str20 = "LOKESH ABCDEIOUZ";
        System.out.println("31 "+str20.replaceAll("[aeiouAEIOU]", "-"));

        String str21="A B C D E F GH IJ KMN";
        String str22[]=str21.split(" ");
        for(String temp:str22)
        {
            System.out.print(temp+" ");
        }
        System.out.println();

        String str23="1 2 3 4 A";
        boolean temp1=str23.matches("[123456789,+,-,*,#,a-z]");
        System.out.println("32 " +temp1);

        String str24="ABLOKESH";
        System.out.println(str24.codePointAt(0));
        System.out.println(str24.codePointBefore(2));
        System.out.println(str24.codePointCount(0,str24.length()));

        String decimalStr = "42";
        String binaryStr = "101010";
        String octalStr = "52";
        String hexStr = "2A";
        int decimalInt = Integer.parseInt(decimalStr);
        int binaryInt = Integer.parseInt(binaryStr, 2);
        int octalInt = Integer.parseInt(octalStr, 8);
        int hexInt = Integer.parseInt(hexStr, 16);
        System.out.println("Decimal: " + decimalInt);
        System.out.println("Binary: " + binaryInt);
        System.out.println("Octal: " + octalInt);
        System.out.println("Hexadecimal: " + hexInt);

        String floatStr = "3.14";
        String doubleStr = "2.71828";
        float parsedFloat = Float.parseFloat(floatStr);
        double parsedDouble = Double.parseDouble(doubleStr);
        System.out.println("Parsed Float: " + parsedFloat);
        System.out.println("Parsed Double: " + parsedDouble);

        String decimalStr1 = "42";
        // Integer to Binary String
        String binaryString = Integer.toBinaryString(Integer.parseInt(decimalStr1));
        // Integer to Octal String
        String octalString = Integer.toOctalString(Integer.parseInt(decimalStr1));
        // Integer to Hexadecimal String
        String hexString = Integer.toHexString(Integer.parseInt(decimalStr1));
        System.out.println("Binary: " + binaryString);
        System.out.println("Octal: " + octalString);
        System.out.println("Hexadecimal: " + hexString);

    }
 }
 */
/* 
public class Main
{
    
    public static void main(String[] args) {
        //1
        String myStr1 = "PREPINSTA PRIME";
        String myStr2 = "prepinsta prime";
        System.out.println(myStr1.compareToIgnoreCase(myStr2));

        String myStr = "Hello PrepInsta ";
        System.out.println(myStr.contentEquals("Hello PrepInsta "));

        String formattedString2 = String.format("My String is %.6f",14.140);
        System.out.println(formattedString2); 
        System.out.printf("%.6f \n",12.3);

        String str = "Hello World!";
        byte[] bytes = str.getBytes();
        for (byte b : bytes) {
            System.out.print(b + " ");
        }
        System.out.println();

        String str1="";
        System.out.println(str1.isEmpty());

        String[] words = {"Hello", "World", "Welcome", "to", "Java"};
        String sentence = String.join(" ", words);
        System.out.println(sentence);
 
        String date = String.join ("/", "14", "02", "2023");
        System.out.println(date);

        String str2 = "PrepInsta123or456PrepInsta Prime";
        System.out.println(str2.replaceAll("\\d+"," "));
        System.out.println(str2.replace("P", "j"));
    }
}
*/

/* 
 public class Main {
    public static void main(String[] args) {
        // Test the functions with some characters
        char ch = 'y';

        // 1. isLetter(char ch)
        System.out.println("1. isLetter: " + Character.isLetter(ch));

        // 2. isDigit(char ch)
        System.out.println("2. isDigit: " + Character.isDigit(ch));

        // 3. isWhitespace(char ch)
        System.out.println("3. isWhitespace: " + Character.isWhitespace(ch));

        // 4. isUpperCase(char ch)
        System.out.println("4. isUpperCase: " + Character.isUpperCase(ch));

        // 5. isLowerCase(char ch)
        System.out.println("5. isLowerCase: " + Character.isLowerCase(ch));

        // 6. toUpperCase(char ch)
        System.out.println("6. toUpperCase: " + Character.toUpperCase(ch));

        // 7. toLowerCase(char ch)
        System.out.println("7. toLowerCase: " + Character.toLowerCase(ch));

        // 8. getNumericValue(char ch)
        System.out.println("8. getNumericValue: " + Character.getNumericValue(ch));

        // 9. isAlphabetic(char ch)
        System.out.println("9. isAlphabetic: " + Character.isAlphabetic(ch));

        // 51. isLetterOrDigit(char ch)
        System.out.println("51. isLetterOrDigit: " + Character.isLetterOrDigit(ch));

    }
}
*/

 
//StringBuffer , StringBulider is a class in Java that represents a mutable sequence of characters.  
//The string is a sequence of characters. In Java, objects of String are immutable which means a constant and cannot be changed once created.


/*
 public class Main
 {
    public static void main(String args[])
    {
        String str1 = "LOKESH";
        StringBuffer sb1 = new StringBuffer(str1);
        sb1.append(6+" JAYASEELAN");
        System.out.println(sb1+" .1");

        String str2="LOKESH";
        StringBuffer sb2 = new StringBuffer(str2);
        sb2.replace(1, 3," HII ");
        System.out.println(sb2+" .2");

        
        String str3="LOKESH";
        StringBuffer sb3 = new StringBuffer(str3);
        System.out.println(sb3.delete(1, 3)+".3");
        System.out.println(sb3.deleteCharAt(0));
        
        String str4="School";
        StringBuffer sb4 = new StringBuffer(str4);
        System.out.println(sb4.reverse()+".4");
        sb4.reverse();
        System.out.println(sb4+".4");




        String str5="LOKI";
        StringBuffer sb5 = new StringBuffer();
        System.out.println(sb5.capacity());  //default will be a 16

        sb5.append(str5);
        System.out.println(sb5.capacity());

        sb5.append(str5);
        System.out.println(sb5.capacity()); // if nextstring a length compare to current string then ((oldcapacity*2)+2)

        sb5.append("SRGSGSRFG");
        System.out.println(sb5.capacity());

        sb5.append("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(sb5.capacity());
        
    }
 }*/


 //StringBulider
 
 /*
 public class Main {

    public static void main(String args[])
    {
        // Create a StringBuilder object
        // using StringBuilder() constructor
        StringBuilder sb1 = new StringBuilder();
        sb1.append("LOKESH ");
        System.out.println(sb1);
        System.out.println(sb1.toString());

        StringBuilder sb2 = new StringBuilder();
        sb2.append("LOKESH");
        System.out.println(sb2.reverse()+"   3");
        System.out.println(sb2+"    4");

        System.out.println(sb2.appendCodePoint(65));

        sb2.insert(3, "beautiful ");
        System.out.println(sb2.toString()); 

    }
 }
*/

/* 

import java.util.StringTokenizer;

public class Main {

    public static void main(String args[])
    {
        StringTokenizer st2 = new StringTokenizer("JAVA : Code : String", " :");
        while (st2.hasMoreTokens())
            System.out.println(st2.nextToken());
        
        // int count = st2.countTokens();
        // for(int i=0;i<count;i++)
        // {
        //     System.out.print(i+" "+st2.nextToken()+" ");
        // }
        // System.out.println();
    }
}

*/



/* 
import java.util.Arrays;

public class Main {

    public static void main(String args[])
    {
         int[] numbers = {5, 2, 8, 1, 7, 3, 6, 4};

         Arrays.sort(numbers);
         System.out.println("1. Sorted Array: " + Arrays.toString(numbers));

         int[] copyOfNumbers = Arrays.copyOf(numbers, 6);
        System.out.println("2. Copied Array: " + Arrays.toString(copyOfNumbers));

        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 42);
        System.out.println("3. Filled Array: " + Arrays.toString(filledArray));

        int[] anotherArray = {5, 2, 8, 1, 7, 3, 6, 4};
        boolean areEqual = Arrays.equals(numbers, anotherArray);
        System.out.println("4. Arrays Equal: " + areEqual);

        String arrayAsString = Arrays.toString(numbers);
        System.out.println("6. Array as String: " + arrayAsString);


        int[] numbers1 = {5, 2, 8, 1, 7, 3, 6, 4};
        int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8};

        int minValue = Arrays.stream(numbers1).min().orElse(0);
        int maxValue = Arrays.stream(numbers1).max().orElse(0);
        System.out.println("8. Min Value: " + minValue + ", Max Value: " + maxValue);

    }
}

*/

// pattern qn

// import java.util.Scanner;

// public class Main 
// {

//     public static void main(String[] args) 
//     {
//         int num=4;
//         num=2*num;
//         for(int i=0;i<=num;i++)
//         {
//             for(int j=0;j<=num;j++)
//             {
//                 int temp = Math.min(Math.min(i,j),Math.min(num-i,num-j));  // i-left j-top num-i-right num-j-buttom
//                 System.out.print(temp+" ");
//             }
//             System.out.println();
//         }
//     }
// }

//------------------------bitwise operator-----------------------------

// public class Main
// {
//     public static void main(String[] args) {
        
//         System.out.println(5<<1); 
//         System.out.println(2<<1);
//         //a*2^b;
//         System.out.println(5>>2);
//         System.out.println(10>>1);


//         int num=12;
//         if((num&1)==1)
//         {
//             System.out.println("ODD");
//         }
//         else
//         {
//             System.out.println("EVEN");
//         }    

//         int arr[]={2,3,3,4,2,6,4,4,4,4,9};
//         int sum=0;
//         for(int i:arr)
//         {
//             sum^=i;
//         }
//         System.out.println(sum);
//     }
// }



















// public class FloatPrecisionExample {
//     public static void main(String[] args) {
//         float number = 123.456789f;
//         int n = 3; // Number of digits after the decimal point

//         String formattedNumber = String.format("%." + n + "f", number);
//         System.out.println(formattedNumber);
//     }
// }

// #include <stdio.h>

// int main() {
//     float number = 123.456789f;
//     int n = 3; // Number of digits after the decimal point

//     printf("%.*f\n", n, number);

//     return 0;
// }




// public class Main 
// {

//     public static void main(String[] args) 
//     {
//         float num=5.99999f;int a=2;
//         String temp="%."+a+"f";
//         // System.out.printf("%.04f",a,num);
//         // System.out.printf("%."+a+"f",num);
//         System.out.printf(temp,num);
//     }
// }




//---------------------------------------------------Math function-------------------------------------------------------------------------------------------


/*
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        // System.out.println(Math.abs(-1));
        // System.out.println((int)(Math.log10(1221)+1));
        // System.out.println(Math.min(1, 2));
        // System.out.println(Math.max(22, 32));

        // System.out.println(Math.sqrt(25));

        // System.out.println(Math.round(5.47));
        // System.out.println(Math.round(5.57));

        // System.out.println(Math.ceil(5.47));
        // System.out.println(Math.ceil(5.57));

        // System.out.println(Math.floor(5.47));
        // System.out.println(Math.floor(5.57));


        int x=2,y=3;
        int result1 = Math.multiplyExact(x, y);
        System.out.println(result1); // prints 20000

        long a = 100;
        long result = Math.negateExact(a);
        System.out.println(result); // prints -100

        System.out.println(Math.subtractExact(50, 100));

        System.out.println( Math.addExact(2,32));

        System.out.println(Math.copySign(23, -202));


        System.out.println(Math.decrementExact(399));
        System.out.println(Math.incrementExact(399));


        System.out.println(Math.pow(2,3));

    
        // int max = 10;
        // int min = 1;
        // int range = max - min + 1;
 
        // // generate random numbers within 1 to 10
        // for (int i = 0; i < 10; i++) {
        //     int rand = (int)(Math.random() * range) + min;
           
        //     // Output is different everytime this code is executed
        //     System.out.println(rand);
        // }
    }
}
*/

//-------------------------------------------------------------------------------------
// //goto statement

// //method 1
// Lakshit:

// for (int i = 1; i <= 5; i++) {
//     for (int j = 1; j <= 5; j++) {
//         if (j == 2)

//             // break statement for the label
//             break Lakshit;
//         System.out.println("PrepInsta " + j);
//     }
// }  

// //method 2
// Lakshit:

// for (int i = 1; i <= 5; i++) {
//     for (int j = 1; j <= 5; j++) {
//         if (j == 2)

//             // Continue Statement
//             continue Lakshit;
//         System.out.println("PrepInsta " + j);
//     }
// }   




