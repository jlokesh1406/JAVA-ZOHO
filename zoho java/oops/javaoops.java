//1.
/*
   .class is name group propreties and function or method and start with captial letter
   .creating own primitive data type
   .class is template of object (logical construct) car.blueprint
   .object is instances of class (physical reality) tesla,bmw,mg evey object contains different specifation
   .object occupied space in memory 
   .object contains three properties 
          1.state of object(value and it's datatype) 
          2.indentity of object(one object is different form other) 
          3.behavial of the object
   .object store in heap memory
   .references variable store in stack memory
 
class javaoops {
    public static void main(String[] args) {

        //datatype variable
        Student0 std1  = new Student0();
        // std1 -> std reference variable store in stack memory
        // new  -> creating object in heap at runtime
        // std1 is pointing to object on the heap memoery
        // compile time = dynamically memory allcation at runtime return a reference variable and reference store in std1
        // .dot as a separe
        // all the variable inside of object this are the instances
        System.out.println(std1.fname); // defult value
        System.out.println(std1.lname);
        System.out.println(std1.Age); 
        System.out.println(std1.gpa);

        Student0 std2  = new Student0();
        std2.fname="lokesh";
        std2.lname='j';
        std2.Age=19;
        std2.gpa=7.52f;
        System.out.println(std2.fname); // defult value
        System.out.println(std2.lname);
        System.out.println(std2.Age); 
        System.out.println(std2.gpa);

        // Student1 std3  = new Student1();
        //.by effcient way to passing the value by the using constructor
        //.creating object that time passing the value by the constructor  
        //.constructor basically defined as what happens we a object will created
        //.A constructor is a special method in a class that is called when an instance (object) of that class is created. 
        //.Its main purpose is to initialize the object's attributes. 
        // Definition
        // Name: It has the same name as the class (in languages like C++ and Java) or a special name (e.g., __init__ in Python).
        // Purpose: Initialize the object's state.
        // No return type: Constructors do not have a return type, not even void.
         Student1 std3  = new Student1("lokesh",'j',19,7.54f);
         System.out.println(std3.fname);
         System.out.println(std3.lname);
         System.out.println(std3.Age);
         System.out.println(std3.gpa);
        // new Student1("lokes",'j',19,7.54f); is special type of function
         std3.greeting();

         Student1 std4  = new Student1(std3);
         std4.greeting();

         Student1 std5  = new Student1();
         std5.greeting();
    }
} 
//create a class
class Student0
{
  String fname; // --> String is class becuase of starting form captial letter
  char lname;
  int Age;
  float gpa=9.0f;
}
class Student1
{
    String fname; // --> String is class becuase of starting form captial letter
    char lname;
    int Age;
    float gpa=9.0f;
   
    // 1.default constructor 
    Student1() 
    {
        // this.fname="lokesh";
        // this.lname='j';
        // this.Age=19;
        // this.gpa=8.8f;
        //this is a constructor call form another construcor
        this("lok",'j',10,0.1f);
    }

    //2.parametic constructor
    Student1(String str,char ch,int age,float gpa) 
    {
      // we need one word to access every object that is (this keyword)
      // this replace of std3
      this.fname=str;
      this.lname=ch;
      this.Age=age;
      this.gpa=gpa;
    }
    void greeting()
    {
      System.out.println("hi! "+this.fname+" welcome ted home ");
    }
    //3.(copy constructor) by passing other std in constructor
    Student1(Student1 other) 
    {
      // we need one word to access every object that is (this keyword)
      // this replace of std3
      this.fname=other.fname;
      this.lname=other.lname;
      this.Age=other.Age;
      this.gpa=other.gpa;
    }
}
*/
//-------------------------------------------------------------------------------------------------------------
//2.
/*
public class javaoops {
  public static void main(String[] args) {
  
        1.data type:
             .Data Type: Also known as primitive data types, these are the
                 basic types of data built into a programming language. 
             .Examples include int, char, float, etc.
             .Data Type: Directly stores the value.
             .value will passing only value.call by value not a reference
             
        2.Wrapper class
            .A Wrapper class in Java is a class whose object wraps or contains primitive data types.
               When we create an object to a wrapper class, 
            .Wrapper Class: Stores the value as an object, providing methods to
               manipulate the data and allowing it to be used in collections like ArrayList, HashMap, etc.
            .value will passing by a reference
  
    //1.primitive data types
    int a=10;
    int b=1;
    swap1(a, b);
    System.out.println(a+" "+b);

    //2.Wrapper Class:
    Integer A=10;
    Integer B=1;
    swap2(A, B);
    System.out.println(A+" "+B);// value will not swap because of Integer class as a final
  }
  static void swap1(int a,int b)
  {
    int temp=a;
    a=b;
    b=temp;
  }
  static void swap2(Integer a,Integer b)
  {
    Integer temp=a;
    a=b;
    b=temp;
  }
}
*/
//---------------------------------------------------------------------------
//3.final value will not be modified (cannot assign a value to final variable
//  only for primitive data type not a wrapper class  
/*
public class javaoops {
  public static void main(String[] args) {
    final int a=1; 
    // a++;
    System.out.println(a);
  }
}
*/
//---------------------------------------------------------------------
//4.
/*
    
    In Java, the static keyword is used to indicate that a member (variable or method) belongs to the class itself,
    rather than to any specific instance of the class. This means that the static member is shared among all instances of the class.
    Static Variables
    Definition: A variable declared with the static keyword.
    Usage: It is shared across all instances of the class.
*/
//override
/*
public class javaoops {
  public static void main(String[] args) {
     function fun = new function();
     System.out.println(fun.toString());
  }
}
class function
{
    String name="lokesh";
     @Override
     public String toString()
     {
      return name;
     }
}  
*/
//--------------------------------------------------------------------------------
//5.oops properties:
/* 
      i)  inheritance 
      ii) polymorisum
      iii)encapsulation
      iv) abstration
*/
//
/*
      Definition:
      .Inheritance is a fundamental concept in Java that allows one class (the subclass or derived class) to inherit
       the fields and methods of another class (the superclass or base class).
       This promotes code reuse and establishes a natural hierarchy between classes. 
      .child class is inheritance properties from the base class
      .using inheritance by the keyword as a extends 
*/
//--------------------------------------------------------------------------------------
//6.types of inheritance
    //  i) single inheritance
    //  ii) multilevel inheritance
    //  iii) multiple inheritance (multiple parent class inheritance with single child class)(but not support in java can we use in interface)
    //  iv) hierarical inheritance (parent class inheritance with many chlid class)
    //  v)  hybrid inheritance (combination of single inheritance and multiple inheritance)(but not support in java can we use in interface)

//-----------------------------i)single inheritance-------------------------------------------
/*
class Box
{
  int l,h,w;
  //1.defalut constructor
  Box()
  {
    this.l=1;
    this.h=1;
    this.w=1;
    System.out.println("defalut constructor");
  }
  //2.paramaric constructor
  Box(int num1,int num2,int num3)
  {
    this.l=num1;
    this.h=num2;
    this.w=num3;
    System.out.println("paramaric constructor");
  }
  //3.copy constructor
  Box(Box temp)
  {
    this.l=temp.l;
    this.h=temp.h;
    this.w=temp.w;
    System.out.println("copy constructor");
  }
  public void display()
  {
    System.out.println(this.l+" "+this.h+" "+this.w);    
  }
}
class Boxweight extends Box
{
  int weight;
  Boxweight()
  {
      this.weight=123;
  }
  Boxweight(int l,int h,int w)
  {
    // super keyword is use for call the parent class constructor
    // used to initialise values present in parent class
    super(l,h,w);
    this.weight=w;
  }  
  Boxweight(Box temp)
  {
    // super keyword is use for call the parent class constructor
    // used to initialise values present in parent class
    super(temp);
    this.weight=w;
  }
}
public class javaoops {
  public static void main(String[] args) {

    System.out.println("parent class");
    Box obj1 = new Box();
    System.out.println(obj1.h+" "+obj1.l+" "+obj1.w);

    Box obj2 = new Box(1,2,3);
    System.out.println(obj2.h+" "+obj2.l+" "+obj2.w);

    Box obj3 = new Box(obj2);
    System.out.println(obj3.h+" "+obj3.l+" "+obj3.w);

    System.out.println("child class");
    Boxweight obj4 = new Boxweight();
    System.out.println(obj4.h+" "+obj4.l+" "+obj4.w+" "+obj4.weight);


  }
}
*/
//-----------------------------------------------------------------------------------------------------
//polymorphism:
// Polymorphism in Java allows one method or object to take many forms, enabling the
// same operation to behave differently on different classes through method overloading and overriding.
// Key Points:
// Method Overloading: Multiple methods with the same name but different parameters within the same class.in  compile time
// Method Overriding: A subclass provides a specific implementation of a method that is already defined in its superclass.

//hiracical
// class Shapes 
// {
//    void area()
//    {
//      System.out.println("i am Shapes");
//    }
// }
// class Circle extends Shapes
// {
//   void area()
//   {
//     System.out.println("i am Circle pi*r*r");
//   }
// }
// class Triangle extends Shapes
// {
//   void area()
//   {
//     System.out.println("i am 0.5*h*b ");
//   }  
// }
// class Square extends Shapes
// {
//   void area()
//   {
//     System.out.println("i am Square of side");
//   }  
// }
// public class javaoops {
//   public static void main(String[] args) {
//     Shapes obj1 = new Shapes();
//     Circle obj2 = new Circle();
//     Shapes obj3 = new Square();
//     obj3.area();
//   }
// }
//-----------Method Overloading (compile time or static polymorphism)----------
/* 
class Box
{
  int l,h,w;
  //1.defalut constructor
  Box()
  {
    this.l=1;
    this.h=1;
    this.w=1;
    System.out.println("defalut constructor");
  }
  //2.paramaric constructor
  Box(int num1,int num2,int num3)
  {
    this.l=num1;
    this.h=num2;
    this.w=num3;
    System.out.println("paramaric constructor");
  }
  //3.copy constructor
  Box(Box temp)
  {
    this.l=temp.l;
    this.h=temp.h;
    this.w=temp.w;
    System.out.println("copy constructor");
  }
  public void display()
  {
    System.out.println(this.l+" "+this.h+" "+this.w);    
  }
}
public class javaoops {
  public static void main(String[] args) {
    Box obj1 = new Box();
    System.out.println(obj1.h+" "+obj1.l+" "+obj1.w);

    Box obj2 = new Box(1,2,3);
    System.out.println(obj2.h+" "+obj2.l+" "+obj2.w);

    Box obj3 = new Box(obj2);
    System.out.println(obj3.h+" "+obj3.l+" "+obj3.w);
  }
}
*/
//-----------Method Override (run time or dyanamic polymorphism)----------
/*
class Shapes
{
  void area()
  {
    System.out.println("hi am shape");
  }
}
class Circle extends Shapes
{
  @Override
  void area()
  {
    System.out.println("hi am shape");
  }
}
public class javaoops {
  public static void main(String[] args) {
    Circle obj = new Circle();
    obj.area();
  }
}
*/

//--------------------------------------------------------------------------------