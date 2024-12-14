//---------------------1.pattern-------------------------------------------------------- 

//1.
// * * *
// * * *
// * * *

// import java.util.*;
// public class java1 
// {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int num=scan.nextInt();
//         String str="";
//         for(int i=0;i<num;i++)
//         {
//             str+="* ";
//         }
//         for(int i=0;i<num;i++)
//         {
//             System.out.print(str+"\n");
//         }
//     }
// }

//2.
// * 
// * * 
// * * * 
// * * * * 
// import java.util.*;
// public class java1 
// {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int num=scan.nextInt();
//         for(int i=0;i<num;i++)
//         {
//             for(int j=0;j<=i;j++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


//3.
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// import java.util.*;
// public class java1 
// {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int num=scan.nextInt();
//         for(int i=1;i<=num;i++)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }


//4.
// 1 
// 2 2 
// 3 3 3 
// 4 4 4 4 
// import java.util.*;
// public class java1 
// {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int num=scan.nextInt();
//         for(int i=1;i<=num;i++)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }

//5.
// * * * * 
// * * * 
// * * 
// * 
// import java.util.*;
// public class java1 
// {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int num=scan.nextInt();
//         for(int i=num;i>=1;i--)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

//6.
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 
// import java.util.*;
// public class java1 
// {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int num=scan.nextInt();
//         for(int i=num;i>=1;i--)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }

//7.
//     *  
//    *** 
//   *****  
// import java.util.*;
// public class java1 
// {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int num=scan.nextInt();
//         for(int i=1;i<=num;i++)
//         {
//             for(int j=1;j<num+i;j++)
//             {
//                 System.out.print((j<=num-i)?"  ":"* ");
//             }
//             System.out.println();
//         }
//     }
// }

//8.
// * * * * * * * * *
//   * * * * * * *
//     * * * * *
//       * * *
//         *
// import java.util.*;
// public class java1 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scan = new Scanner(System.in);
//         int num=scan.nextInt();
//         for(int i=0;i<num;i++)
//         {
//             for(int j=0;j<num+num-i-1;j++)
//             {
//                 System.out.print(i==0?"* ":(j<i)?"  ":"* ");
//             }
//             System.out.println();
//         }
//     }
// }

//9.
//         *
//       * * *
//     * * * * *
//   * * * * * * *
// * * * * * * * * * 
// * * * * * * * * *
//   * * * * * * *
//     * * * * *
//       * * *
//         *
// import java.util.*;
// public class java1 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scan = new Scanner(System.in);
//         int num=scan.nextInt();
//         String s1="",s;
//         for(int i=0;i<num;i++)
//         {
//             s="";
//             for(int j=0;j<num+i;j++)
//             {
//                 System.out.print(j<num-1-i?"  ":"* ");
//                 s+=j<num-1-i?"  ":"* ";
//             }
//             s1=s+"\n"+s1;
//             System.out.println();
//         }
//         System.out.print(s1);
//     }
// }

//10.
// *
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *
// import java.util.*;
// public class java1 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scan = new Scanner(System.in);
//         int num=scan.nextInt();
//         for(int i=0;i<(num*2)-1;i++)
//         {
//             int t=(i<num)?i:num-(i%num)-2;
//             for(int j=0;j<=t;j++)
//             {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

//11.
// 1
// 0 1
// 0 1 0
// 1 0 1 0
// 1 0 1 0 1
// 0 1 0 1 0 1
// import java.util.*;
// public class java1 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scan = new Scanner(System.in);
//         int num=scan.nextInt(),n=1;
//         for(int i=0;i<num;i++)
//         {
//             for(int j=0;j<=i;j++)
//             {
//                 System.out.print(n+" ");
//                 n=1-n;
//             }
//             System.out.println();
//         }
//     }
// }

//12.
// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321
// import java.util.*;
// public class java1 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scan = new Scanner(System.in);
//         int num=scan.nextInt();String str="";
//         for(int i=1;i<=num;i++)
//         {
//             str="";
//             for(int j=1;j<=num;j++)
//             {
//                 System.out.print(j<=i?j:" ");
//                 str=(j<=i?j:" ")+str;
//             }
//             System.out.println(str);
//         }
//     }
// }

//13.
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
// import java.util.*;
// public class java1 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scan = new Scanner(System.in);
//         int num=scan.nextInt(),n=1;
//         for(int i=1;i<=num;i++)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print((n++)+" ");
//             }
//             System.out.println();
//         }
//     }
// }

//14.
// A
// A B
// A B C
// A B C D
// A B C D E
// import java.util.*;
// public class java1 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scan = new Scanner(System.in);
//         int num=scan.nextInt();
//         for(int i=0;i<num;i++)
//         {
//             for(int j=0;j<=i;j++)
//             {
//                 System.out.print((char)('A'+j)+" ");
//             }
//             System.out.println();
//         }
//     }
// }


//15.
// A B C D E 
// A B C D
// A B C
// A B
// A
// import java.util.*;
// public class java1 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scan = new Scanner(System.in);
//         int num=scan.nextInt();
//         for(int i=num-1;i>=0;i--)
//         {
//             for(int j=0;j<=i;j++)
//             {
//                 System.out.print((char)('A'+j)+" ");
//             }
//             System.out.println();
//         }
//     }
// }

//16.
// A
// B B
// C C C 
// D D D D
// E E E E E
// import java.util.*;
// public class java1 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scan = new Scanner(System.in);
//         int num=scan.nextInt();
//         for(int i=0;i<num;i++)
//         {
//             for(int j=0;j<=i;j++)
//             {
//                 System.out.print((char)('A'+i)+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// //17.
// 1
// 121
// 12321
// 1234321
// 123454321
// import java.util.*;
// public class java1 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scan = new Scanner(System.in);
//         int num=scan.nextInt();
//         for(int i=0;i<num;i++)
//         {
//             int t=0;
//             for(int j=0;j<num+i;j++)
//             {
//                 if(j>=num-1-i)
//                 {
//                     t=j>num-1?--t:++t;
//                 }
//                 System.out.print(j<num-1-i?" ":(char)(t+64));
  
//             }
//             System.out.println();
//         }
//     }
// }


//18.
// E
// DE
// CDE
// BCDE
// ABCDE
// import java.util.*;
// public class java1 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scan = new Scanner(System.in);
//         int num=scan.nextInt();
//         for(int i=0;i<num;i++)
//         {
//             for(int j=0;j<=i;j++)
//             {
//                 System.out.print((char)(('E'-i)+j));
//             }
//             System.out.println();
//         }
//     }
// }

//19.
// import java.util.*;
// public class java1 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scan = new Scanner(System.in);
//         int num=scan.nextInt();
//         for(int i=0;i<num;i++)
//         {
//             for(int j=0;j<=i;j++)
//             {
//                 System.out.print((char)(('E'-i)+j));
//             }
//             System.out.println();
//         }
//     }
// }
