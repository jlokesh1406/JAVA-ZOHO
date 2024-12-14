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