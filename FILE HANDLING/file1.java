// 1. Folder Creation
    // import java.io.File;
    // public class file1 
    // {
    //     public static void main(String args[])
    //     {
    //         File file = new File("D:\\VSC IMPORTANT FILE\\LANG\\JAVA 1\\JAVA(i)\\java files\\FILE HANDLING\\TEMP1");
    //         if(file.exists())
    //         {
    //             System.out.print("File exists");
    //         }
    //         else
    //         {
    //             System.out.print("creted");
    //             file.mkdir();
    //         }
    //     }
    // }


//2.Sub Folder Creation
    // import java.io.File;
    // public class file1 
    // {
    //     public static void main(String args[])
    //     {
    //         File file = new File("D:\\VSC IMPORTANT FILE\\LANG\\JAVA 1\\JAVA(i)\\java files\\FILE HANDLING\\TEMP1\\TEMP2\\TEMP3");
    //         if(file.exists())
    //         {
    //             System.out.print("File exists");
    //         }
    //         else
    //         {
    //             System.out.print("creted");
    //             file.mkdirs();
    //         }
    //     }
    // }


//3.File Creation
    // import java.io.File;
    // public class file1 
    // {
    //     public static void main(String args[])
    //     {
    //         File file = new File("D:\\VSC IMPORTANT FILE\\LANG\\JAVA 1\\JAVA(i)\\java files\\FILE HANDLING\\TEMP1\\text1.txt");
    //         if(file.exists())
    //         {
    //             System.out.print("File exists");
    //         }
    //         else
    //         {
    //             try 
    //             {
    //                 file.createNewFile();
    //                 System.out.println("creted");    
    //             } 
    //             catch (Exception e) 
    //             {
    //                 e.printStackTrace();
    //             }
    //             finally
    //             {
    //                 System.out.println("pp");
    //             }
    //         }
    //     }
    // }

//4.File Deletion
    // import java.io.File;
    // public class file1 
    // {
    //     public static void main(String args[])
    //     {
    //         File file = new File("D:\\VSC IMPORTANT FILE\\LANG\\JAVA 1\\JAVA(i)\\java files\\FILE HANDLING\\TEMP1\\text1.txt");
    //         file.delete();
    //     }
    // }


// 5. Renaming File text1 to TEXT1.txt
    // import java.io.File;
    // public class file1 
    // {
    //     public static void main(String args[])
    //     {
    //         File file = new File("D:\\VSC IMPORTANT FILE\\LANG\\JAVA 1\\JAVA(i)\\java files\\FILE HANDLING\\TEMP1\\text1.txt");
    //         File NewFile = new File("D:\\VSC IMPORTANT FILE\\LANG\\JAVA 1\\JAVA(i)\\java files\\FILE HANDLING\\TEMP1\\TEXT1.txt");
    //         file.renameTo(NewFile);
    //     }
    // }

// 6. Printing File Name
// import java.io.File;
// public class file1 
// {
//     public static void main(String args[])
//     {
//         File file = new File("D:\\VSC IMPORTANT FILE\\LANG\\JAVA 1\\JAVA(i)\\java files\\FILE HANDLING\\TEMP1\\TEXT1.txt");
//         System.out.println(file.getName());
//         System.out.println(file.canExecute());
//         System.out.println(file.canRead());
//         System.out.println(file.canWrite());
//     }
// }

//7. Listing all files and folders in a Directory 
// import java.io.File;
// public class file1 
// {
//     public static void main(String args[])
//     {
//         File file = new File("D:\\");
//         String str[]=file.list();
//         for(String i:str)
//         {
//             System.out.println(i+" ");
//         }
//     }
// }

// 8. Listing only files in a Directory 
    // import java.io.File;
    // public class file1 
    // {
    //     public static void main(String args[])
    //     {
    //         File file = new File("D:\\VSC IMPORTANT FILE");
    //         File str[]=file.listFiles();
    //         for(File i:str)
    //         {
    //             if(i.isFile())
    //             {
    //                 System.out.print(i+" ");
    //             }
    //         }
    //     }
    // }

// 9. Listing only folder in a Directory 
    // import java.io.File;
    // public class file1 
    // {
    //     public static void main(String args[])
    //     {
    //         File file = new File("D:\\VSC IMPORTANT FILE");
    //         File str[]=file.listFiles();
    //         for(File i:str)
    //         {
    //             if(i.isDirectory())
    //             {
    //                 System.out.println(i+" ");
    //             }
    //         }
    //     }
    // }

//10.Listing only txt files in a Directory
    // import java.io.File;
    // public class file1 
    // {
    //     public static void main(String args[])
    //     {
    //         File file = new File("D:\\VSC IMPORTANT FILE");
    //         File str[]=file.listFiles();
    //         for(File i:str)
    //         {
    //             if(i.isFile() && (i.getName()).contains(".txt") )
    //             {
    //                 System.out.println(i+" ");
    //             }
    //         }
    //     }
    // }

//11. Listing files based on their size in a Directory
//1kb -- > 8000bit
    // import java.io.File;
    // public class file1 
    // {
    //     public static void main(String args[])
    //     {
    //         File file = new File("D:\\VSC IMPORTANT FILE");
    //         File str[]=file.listFiles();
    //         for(File i:str)
    //         {
    //             if(i.isFile() && i.length() >30 )
    //             {
    //                 System.out.println(i+" ");
    //             }
    //         }
    //     }
    // }



    
// 12. Listing files based on their size in a Directory delete
// 1kb -- > 8000bit
    // import java.io.File;
    // public class file1 
    // {
    //     public static void main(String args[])
    //     {
    //         File file = new File("D:\\VSC IMPORTANT FILE");
    //         File str[]=file.listFiles();
    //         for(File i:str)
    //         {
    //             if(i.isFile() && i.length() >30 )
    //             {
    //                 i.delete();
    //             }
    //         }
    //     }
    // }


// 13. File Writer and File Writer

// import java.io.File;
// import java.io.FileReader;
// import java.io.FileWriter;
//     public class file1 
//     {
//         public static void main(String args[])
//         {

//             // file creations
//             File file = new File("D:\\VSC IMPORTANT FILE\\LANG\\JAVA 1\\JAVA(i)\\java files\\FILE HANDLING\\text.txt");
//                 try 
//                 {
//                     file.createNewFile();
//                     FileWriter writer = new FileWriter(file,false);
//                     writer.write("LOKESH ");
//                     writer.write(97);  //a
//                     writer.flush();
//                     writer.close();

//                     FileReader reader = new FileReader(file);
//                     int op = reader.read();
//                     while(op!=-1)
//                     {
//                         System.out.print((char)(op));
//                         op=reader.read();
//                     }

//                     System.out.println();
//                     //char length
//                     char ch[]=new char[(int)(file.length())];
//                     System.out.println(ch.length);

//                 } 
//                 catch (Exception e) 
//                 {
//                     e.printStackTrace();
//                 }

//         }
//     }


//14.BufferedWriter, BufferedReader 
// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.File;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException; // Import IOException for handling file-related exceptions

// public class file1 {
//     public static void main(String args[]) {

//         // File creation
//         File file = new File("D:\\VSC IMPORTANT FILE\\LANG\\JAVA 1\\JAVA(i)\\java files\\FILE HANDLING\\text.txt");
        
//         try 
//         {
//             // Initialize FileWriter and BufferedWriter
//             FileWriter fWriter = new FileWriter(file);
//             BufferedWriter Bwriter = new BufferedWriter(fWriter);
//             Bwriter.write("Tamil1");
//             Bwriter.newLine();
//             Bwriter.write("Tamil2");
//             Bwriter.newLine();
//             Bwriter.flush();
//             Bwriter.close();
            
//             FileReader fReader = new FileReader(file);
//             BufferedReader bReader = new BufferedReader(fReader);
//             String line = bReader.readLine();
//             int linecount=0;
//             while(line!=null)
//             {
//                 System.out.println(line);
//                 linecount++;
//                 line=bReader.readLine();
//             }
//             System.out.println(linecount);


//             System.out.println("File written successfully.");
//         } 
//         catch (IOException e) {
//             // Handle IOException
//             System.out.println("An error occurred while writing to the file: " + e.getMessage());
//         }
//     }
// }

//15.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class file1 {
    public static void main(String args[]) 
    {
        try 
        {
            InputStream input = new FileInputStream("D:\\VSC IMPORTANT FILE\\LANG\\JAVA 1\\JAVA(i)\\java files\\FILE HANDLING\\NEC1.jpg");
            OutputStream output = new FileOutputStream("D:\\VSC IMPORTANT FILE\\LANG\\JAVA 1\\JAVA(i)\\java files\\FILE HANDLING\\NEC2.jpg");
            int content = input.read();
            while(content!=-1)
            {
                output.write(content);
                content=input.read();
            }

        } 
        catch (Exception e)
        {

        }
    }
}

