    
// class and objects
// class is template of object (logical construct)
// object is instances of class (physical reality)
// student std1 =  new student();
// compile time =  runtime 
/*
public class oops {
    public static void main(String[] args) {

        student lokesh = new student();
        System.out.println(lokesh.rno);
        System.out.println(lokesh.name);
        System.out.println(lokesh.marks);
        lokesh.rno=12;
        lokesh.name="lokesh jayseelan";
        lokesh.marks=7.54f;
            System.out.println(lokesh.rno);
            System.out.println(lokesh.name);
            System.out.println(lokesh.marks);
    }
}
class student
{
    int rno=2111103;  //defualt
    String name;
    float marks;
}
*/ 

// constructors:
/* 
public class oops {
    public static void main(String[] args) {
        System.out.println("created object");
        student lokesh = new student();
        System.out.println(lokesh.rno);
        System.out.println(lokesh.name);
        System.out.println(lokesh.marks);

        System.out.println("created object with sum greeting");
        student arun = new student();
        arun.greeting();

        System.out.println("created object with name change");
        student urun = new student();
        urun.changename("arun");
        urun.greeting();

        System.out.println("created object to change the data by constructor");
        student hukum = new student(12,"kk",12);
        System.out.println(hukum.rno);
        System.out.println(hukum.name);
        System.out.println(hukum.marks);

        System.out.println("copoy hukkum to hukum2");
        student hukum2 = new student(hukum);
        System.out.println(hukum2.rno);
        System.out.println(hukum2.name);
        System.out.println(hukum2.marks);

        System.out.println("every thing is charge");
        student hukum3 = new student();
        System.out.println(hukum3.rno);
        System.out.println(hukum3.name);
        System.out.println(hukum3.marks);

        System.out.println("pointing to the both references variable same object");
        student hukum4 = new student();
        student hukum5=hukum4;
        System.out.println(hukum5.rno);
        System.out.println(hukum5.name);
        System.out.println(hukum5.marks);

        System.out.println("changes in name");
        hukum4.name="loosu";
        System.out.println(hukum5.rno);
        System.out.println(hukum5.name);
        System.out.println(hukum5.marks);
    }
}
class student
{
    int rno=2111103;  
    String name;
    float marks;

    void greeting()
    {
        System.out.println("hii "+name);
    }
    void changename(String str)
    {
        name=str;
    }
    student()
    {
        this.rno=2112;
        this.name="lokesh";
        this.marks=12.3f;
    }
    student(int rno,String str,int marks)
    {
        this.rno=rno;
        this.name=str;
        this.marks=marks;
    }
    student(student other)
    {
        this.rno=other.rno;
        this.name=other.name;
        this.marks=other.marks;
    }

}

public class oops {

    public static void main(String[] args) {
        int a=12;
        int b=2;
        swap1(a, b);
        System.out.println(a+" "+b); // because of they are primitve only passing to function by value so that swap opration is not occur .swaping inside function only

        Integer A=12;
        Integer B=2;
        swap2(A, B);
        System.out.println(A+" "+B);  // because of Integer class declaured as final keyword on a backend

        //final reference var is not change:
        // final always intialize while declaring
        final int num=2;
        System.out.println(num);

        final TED_TALKS hukkum = new TED_TALKS("lokesh");
        hukkum.str = "lokesh jayaseelan";

        // when a non primitive is final, you cannot reassing it
        // hukkum = new A("lokesh");

    }
    static void swap1(int a,int b)
    {
        int temp = a;
        a=b;
        b=a;
    }
    static void swap2(Integer a,Integer b)
    {
        int Integer = a;
        a=b;
        b=a;
    }
}
class TED_TALKS
{
    final int num=10;
    String str;
    TED_TALKS(String str)
    {
        this.str=str;
    }
}
*/

// packages: 

/*
import java.util.ArrayList;
import java.util.Scanner;

import packeage0.package1.add_number;
import packeage0.package1.multi_number;
//import packeage0.package1.*

public class oops {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList lisyt= new ArrayList();

        add_number obj1 = new add_number();
        System.out.println(obj1.add(1,2));

        multi_number obj2 = new multi_number();
        System.out.println(obj2.multi(1,2));

        
    }
}
*/
/* 
import packeage0.package1.student_bio;

public class oops {

    public static void main(String[] args) {
        student_bio obj1 = new student_bio(211103, "LOKESH", 7.55f);
        student_bio obj2 = new student_bio(211104, "lokesh", 7.5f);
        System.out.println(obj1.rno);
        System.out.println(obj2.name);
        System.out.println(obj2.ctr);


        fun1();

    }
    // this not dependent on objects
    static void fun1()
    {
        oops obj1 = new oops(); // it requires an instances
        // but the function does not depenend on instances 
        obj1.greeting();
    }

    void greeting()
    {
        System.out.println("hi......");
    }
}
*/

/*
public class oops {

    static int a=5;
    static int b=0;
    public static void main(String[] args) {
        System.out.println(a+b);
        System.out.println(oops.b);
    }
    static 
    {
        b=a*2;
    }
}

*/

/* 
public class oops {

    static class TED_TALKS
    {
        int a,b;
        public TED_TALKS(int a1,int b1)   // constuctor
        {
            this.a=a1*2;
            this.b=b1*2;
        }
    }
    public static void main(String[] args) {
        TED_TALKS obj1 = new TED_TALKS(1, 2);
        System.out.println(obj1.a);
        System.out.println(obj1.b);

        fn obj2 = new fn();
        System.out.println(obj2.add(1, 3));
         // println-methods
         // out - variable
         //System class
    }
}
class fn 
{
    public int add(int a,int b)
    {
        return a+b;
    }
}
*/


//inheritance:

/*
                        parents
                           ||
                        children


    .child class  having base and it's class
 */
/* 

 public class oops {
    public static void main(String[] args) {
        Box obj1 = new Box();
        System.out.println(obj1.l+" "+obj1.h+" "+ obj1.w);
        
        Box obj2 = new Box(3);
        System.out.println(obj2.l+" "+obj2.h+" "+ obj2.w);

        Box obj3 = new Box(1,3,4);
        System.out.println(obj3.l+" "+obj3.h+" "+ obj3.w);

        Box obj4 = new Box(obj3);
        System.out.println(obj4.l+" "+obj4.h+" "+ obj4.w);

        Box_weight obj5 = new Box_weight();
        System.out.println(obj5.h+" "+obj5.weight);

        Box_weight obj6 = new Box_weight(1.2f,2,3,34.4f);
        System.out.println(obj6.l+" "+obj6.h+" "+obj6.w+" "+obj6.weight);

        Box obj7 = new Box_weight(obj6);
        System.out.println(obj7.l);

        BoxPrice obj8 =new BoxPrice();
        System.out.println(obj8.cost+" "+obj8.h+" "+obj8.l+" "+obj8.w+" "+obj8.weight);
    }
 }

class Box {             
    double l;
    double h;
    double w;

    Box()
    {
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }
    Box(double side)
    {
        this.l=side;
        this.h=side;
        this.w=side;
    }
    Box(double l,double h,double w)
    {
        this.l=l;
        this.h=h;
        this.w=w;   
    }
    Box(Box new_Box)
    {
        this.l=new_Box.l;
        this.h=new_Box.h;
        this.w=new_Box.w; 
    }
 }
 class  Box_weight extends Box
 {
    double weight;
    public Box_weight()
    {
        super();
        this.weight=-22;
    }
    Box_weight (Box_weight temp)
    {
        super(temp);
        this.weight = temp.weight;
    }
    public Box_weight(double l, double h, double w,double weight)
    {
        super(l,h,w); // what is that? = call the parent class constructor
        this.weight=weight;
    }
 }
 class BoxPrice extends Box_weight
 {

    double cost;
    BoxPrice()
    {
        super();
        this.cost=-333;
    }
    BoxPrice(BoxPrice temp)
    {
        super(temp);
        this.cost = temp.cost;
    }
    public BoxPrice(double l, double h, double w,double weight,double cost)
    {
        super(l,h,w,weight); // what is that? = call the parent class constructor
        this.cost=cost;
    }
 }
*/

/*
poly morphism:
    poly=>many
    morphism=>way to represention

*/
/*
public class oops {
    public static void main(String[] args) {
        class1 obj1 = new class1(7);
        System.out.println(obj1);// if the passing obj to class they consider null value and converting tosting() methods.this perfomns happen by the backend code of jdk 

        ///to overtaking tosting() methods
        class2 obj2 = new class2(7);
        System.out.println(obj2);
    }
}
class class1
{
    int num;
    public class1(int num)
    {
        this.num=num;
    }
}
class class2
{
    int num;
    public class2(int num)
    {
        this.num=num;
    }
    @override
    public String toString()
    {
        return "obj is printed as a backend jdk "+num;
    }
}

*/

/*
public class oops {

    public static void main(String[] args) {
        
        shapes obj1 =new shapes();
        obj1.area();
        circle obj2 =new circle();
        obj2.area();
        rectangle obj3 = new rectangle();
        obj3.area();
        shapes obj4 = new rectangle();
        obj4.area();

        // in this parent class smae as the child so that using override
        shapes obj11 =new shapes();
        obj11.area();
        shapes obj22 =new circle();
        obj22.area();
        shapes obj33 = new rectangle();
        obj33.area();
        shapes obj44 = new rectangle();
        obj44.area();

    }
}
class shapes
{
   
    void area()
    {
        System.out.println("i am in shapes");
    }
}
class circle extends shapes
{
    @Override
    void area()
    {
        System.out.println("i am in circle");
    }
}
class rectangle extends shapes
{
    @Override
    void area()
    {
        System.out.println("i am in rectangle");
    }
}
*/

// method overlogding:
/*
public class oops {

    public static void main(String[] args) {
        System.out.println(fn(2));
        System.out.println(fn("Lokesh"));
        System.out.println(fn(1,2));
        System.out.println(fn("LOKESH",1,2));
    }
    
    static int fn(int a)
    {
        return a*2;
    }
    static String fn(String s)
    {
        return s.concat(" Jayaseelan");
    }
    static int fn(int a,int b)
    {
        return a+b;
    }
    static int fn(String a,int b,int c)
    {
        return b+c;
    }
}
*/

//
/*  
    Encapsulation:
        wrapping up the implementation of the data member & methods in class
    
    Abstrction:
        hinding unnessary details &  and showing valuable information

 */

 //access control:

 /*
public class oops {

    public static void main(String[] args) {
        A obj1= new A(211103, "lokesh",9.0f);
        System.out.println(obj1. num);
        System.out.println(obj1.name2);
        System.out.println(obj1.marks);

    }
}

class A{
    public int num;
    private String name1;
    String name2;
    protected float marks; 
        A(int num,String name1,float marks)
        {
            this.num=num;
            this.name1=name1;
            this.name2=this.name1;
            this.marks=marks;
        }
}
*/


/*
        public means access any where
        private means access with class only or only access with a file
        protected means  class same class can be assces

        ____________________________________________________________________________________________________
        ||Access control||   class   || package  ||subclass(same pkg)||subclass(different package)||world||
        ----------------------------------------------------------------------------------------------------
        ||public        ||    yes    || yes      ||     yes          ||   yes                     ||  yes ||
        ||protected     ||    yes    || yes      ||     yes          ||   yes                     ||  no  ||
        ||no modifier   ||    yes    ||  yes     ||     yes          ||   no                      ||  no  ||
        ||private       ||    yes    ||  no      ||      no          ||   no                      ||  no  ||
        ----------------------------------------------------------------------------------------------------
*/
//protected class same class can be assces:
/*
public class oops {

    public static void main(String[] args) {
        Access_Same_Class obj1= new Access_Same_Class(2);
        System.out.println(obj1.GETNUM(3)); 
    }
}
class Access_Same_Class
{
    protected int num;
    public int GETNUM(int num)
    {
        System.out.println(this.num);
        this.num=num*2;
        return num;
    }  
    public Access_Same_Class(int num)
    {
        this.num=num;
    } 
}
*/
/*
    packages is two type:
    1.user defined
    2.in-build

    in-build:
    -> lang 
    -> io
    -> util contains (collection and framework)
    -> applet 
    -> awt
    -> net
*/

// object class:
/*
public class oops {

    public static void main(String[] args) {

        obj obj1 = new obj(3);
        obj obj2 = obj1;
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        System.out.println(obj2 instanceof obj);
        System.out.println(obj2.getClass());
        System.out.println(obj2.getClass().getName());
    } 
}
class obj{

    int num;
    public obj(int num)
    {
        this.num=num;
    }
    @Override
    public int hashCode()
    {
        return num*100;
    }

    @Override
    public String toString()
    {
        return super.toString();
    }

    @Override
    public void finalize() throws Throwable
    {
        super.finalize();
    }

    @Override
    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }
}-
*/
//abstract classes interfaces annotations

/* 
public class oops {

    public static void main(String[] args) {
        abtract_son obj = new abtract_son(2);
        obj.career("lokesh jayaseelan");
        obj.path("software Engi.",23);
        obj.normal();
        // abstract_parent obj2 = new abstract_parent(2); can't creat obj on a abtract class and also constructure can't be create  
        abstract_parent.details();
        //abstrac can't support obj cretion so tha mutiple inhretance is not support in java
    }
     
}
// abstract class Parent {
//     abstract void career(String name);
//     abstract void path(String aim,int age);
// }
// abstract class Son extends Parent {
//      @override
//      void career(String name)
//      {
//         System.out.println("my self "+name);
//      }
//      @override
//      void path(String name,int age)
//      {
//         System.out.println("my aim is "+name+" at zoho in age of "+age);
//      }
// }
 */



 //interface
 /*
 public class oops {
 
    public static void main(String[] args) {
        System.out.println("--------car1  details------------");
        car1 obj1 = new car1();
        obj1.acc();
        obj1.breaK();
        obj1.stop();
        obj1.start();
        media obj2 = new car1();
        obj2.stop();
        System.out.println("--------- car2 details-----------");
        car2 obj3 = new car2();
        obj3.acc();
        obj3.breaK();
        obj3.stop();
        obj3.start();
        media obj4 = new car2();
        obj4.stop();
        obj4.music();
    }
 }
interface Engine {

    static int price = 12323;

    void start();
    void stop();
    void acc();
 }
interface Brake {
    void breaK();
}
interface media {
    void stop();
    default void music()
    {
        System.out.println("++++HUKUM+++++");
    }
}
class car1 implements Engine,Brake,media
{
    @Override
    public void breaK()
    {
        System.out.println("------BREAK speed 14-----");
    }
    @Override
    public void start()
    {
        System.out.println("------start 14-----");
    }
    @Override
    public void stop()
    {
        System.out.println("------stop 14-----");
    }
    @Override
    public void acc()
    {
        System.out.println("------acc 14-----");
    }
}
class car2 implements Engine,Brake,media
{
    @Override
    public void breaK()
    {
        System.out.println("------BREAK speed 10-----");
    }
    @Override
    public void start()
    {
        System.out.println("------start 10-----");
    }
    @Override
    public void stop()
    {
        System.out.println("------stop 10-----");
    }
    @Override
    public void acc()
    {
        System.out.println("------acc 10-----");
    }
}
*/

//--------------------------------------------------------------------------


/*
    oops
    1.classes and objects
    2.Access Modifiers
    3.Inheritance and protected Access
    4.Encapsulation
    5.Abstract classes
    6.Interface
    7.multiple inheritance using interface
    8.ATM-project
    9.calculator-project
 */

 /*
        1.classes and objects
            .class is an blue print of a object
            .method use get ,set for good understanding and good programmer 

  
  public class oops {
  
    public static void main(String[] args) {
        
        student obj1 = new student("LOKESH", 13, "SHOLINGHUR");
        System.out.println(obj1.toString());

        // student is a instances
        student obj2 = new student("VIGNESH", 13, "VELLORE");
        System.out.println(obj2.toString());

        System.out.println(obj2.name);
        System.out.println(obj2.age);
        System.out.println(obj2.Address);
    }
  }
class student { 

    String name;
    int age;
    String Address;

    student(String name,int age,String address)  // consutor
    {
        // name=name java will confues
        this.name=name;
        this.age=age;
        this.Address=address;
    }

    //methods
    void setName(String NAME)
    {
        this.name=NAME;
    }
    
    //methods
    void setAge(int AGE)
    {
        this.age=AGE;
    }
    
    //methods
    void setAddress(String ADDRESS)
    {
        this.Address=ADDRESS;
    }
    
    //methods
    String getName()
    {
        return this.name; 
    }
    
    //methods
    int getAge()
    {
        return this.age; 
    }
    
    //methods
    String getAddress()
    {
        return this.Address; 
    }
    
    //methods by overrideing
    @Override
    public String toString()
    {
      return("STUDENTS DETAILS IS "+this.getName()+" "+this.getAge()+" "+getAddress());
    }
  }

  */


//-----------------Methods-------------------------------
  /*
      Methods:
        .function = methods
        .outside the class than it's called as function
        .inside  the class than it's called as methods
        .java can't contains any function but contains only a methods

public class oops {

    public static void main(String[] args) {
        int a=-2,b=12;
        // function calling
        //functionName(ARGUMENTS)
        swap1(a, b); // a & b as ARGUMENTS.
        swap2(a, b);
    }

    // function defined
    // accessmodifier-returntype-functionNaem(PARAMETER)
    static void swap1(int a,int b) // a and b are the PARAMETERS
    {
        a=a^b; //3
        b=b^a; //1
        a=a^b; //
        System.out.println(a+" "+b);
    }
    static void swap2(int a,int b)
    {
        a=a+b; //14
        b=a-b; //2
        a=a-b; //12
        System.out.println(a+" "+b);
    }
}
*/
//--------------------------------------------------------------------------

//------------RECURSION------------
/*
public class oops {

    public static void main(String[] args) {
        num(5);
    }
    static void num(int s)
    {
        if(s==0)   // base case
        {
            return;
        }
        num(s-1);  // recursive case
        System.out.println(s+" ");
    }
}
*/
//--------------------------------------------------------------------------

//--------class and object-----------  
/*
    example:
        .form is class and form contains name,age,dob this are the object
        .object is a instances of class
        .genral application form is example of class
        .i went full the form which is help of object
 */
/*
public class oops 
{
    public static void main(String[] args) 
    {
        // assces member class by object.member class or methods 
        form obj1 = new form(); // copy of class
        obj1.name="LOKESH";
        obj1.age=20;
        obj1.dob="14/06/2004";
        obj1.display();  


        form obj2 = new form(); //object creaction  
        obj2.name="LOKESH";
        obj2.age=20;
        obj2.dob="14/06/2004";
        obj2.display();  

        form obj3 = new form();
        obj3.setDetatils("LCU", 20, "12/12/2004");
        obj3.display();
    }   
}
// within class is known as member class 
class form
{

    String name;//member class 
    int age; //member class 
    String dob;//member class 
    void display()
    {
        System.out.println(name+" "+age+" "+dob);
    }
    void setDetatils(String name ,int age,String dob)
    {
       // name=name  system will confused so that using this keyword for butter understading
        this.name=name;
        this.age=age;
        this.dob=dob;
    }
}
*/


//--------------------------------------------------------------------------

//constructors A constructor in Java is a special method that is used to initialize objects. 

/*

// default_Constructors
public class oops {
    public static void main(String[] args) {
        
        //class_name obj = new constructor();
        defaultConstructors1 obj1 = new defaultConstructors1();
        System.out.println("default_Constructors1");
        System.out.println(obj1.name);
        System.out.println(obj1.age);
        System.out.println(obj1.height);

        defaultConstructors2 obj2 = new defaultConstructors2();
        System.out.println(obj2.name);
        System.out.println(obj2.age);
        System.out.println(obj2.height);

        System.out.println("default_Constructors3");
        // parameterized constructor
        defaultConstructors3 obj3 = new defaultConstructors3("LOKESH",12);

        
        what is different int methods and constructor
            1.methods                   
            class and method name will be different  and also with any return type
            2.constructor 
            class and method name will be same  and also without any return type 
        

        System.out.println("diff b/w methods and class");
        default_Constructors4 obj4 = new default_Constructors4();
        System.out.println(obj4.changename("JAYASEELAN"));

    }    
}
class defaultConstructors1
{
    String name;
    int age;
    float height;
}

class defaultConstructors2 {
    String name;
    int age;
    float height;
     
        meaning for defaultConstructors
        defaultConstructors()
        {
            you can set the default value all so
        }
    
    defaultConstructors2()
    {
        System.out.println("defaultConstructors2");
        name="LOKESH";
        age=12;
        height=12.0f;
    }
}

class defaultConstructors3
{
    String name;
    int age;
    float height;

    // parameterized constructor
    defaultConstructors3(String name,int age)
    {
        this.name=name;
        this.age=age;
        System.out.println(this.name+" "+this.age);
    }
}

class default_Constructors4
{
    String name;
    default_Constructors4()
    {
        this.name="LOKESH ";
    }
    String changename(String name)
    {
        this.name=this.name+name;
        return this.name;
    }
}

*/

//--------------------------------------------------------------------------
// Encapsulation 

/*
Encapsulation is a single class contains member_class and constructor,function  
 
 class Encapsulation
 {
    String name;
    Encapsulation()
    {
        name="LOKESH";
    }
    String function()
    {
        return this.name;
    }
 }
 public class oops {
    public static void main(String[] args) {
        Encapsulation obj1 = new Encapsulation();
        System.out.println(obj1.function());
    }
 }
*/

//--------------------------------------------------------------------------
/*
    Abstraction:
        Abstraction in Java refers to the process of hiding implementation details and
        showing only essential features of an object. It allows for the creation of 
        abstract classes and methods that define a common interface for a group of
        related objects, enabling code reusability and promoting modularity.
 

 class Abstraction
 {
    String username="jlokesh1406";
    private int password =1414;

 }

 public class oops {
    public static void main(String[] args) {

        Abstraction obj = new Abstraction();
        System.out.println(obj.username);
        // System.out.println(obj.password); password hiding form others
    }
 }
 */
//--------------------------------------------------------------------------
/*
    Inheritance:

class parent
{
    String name="JAYASEELAN";
    int age=54;
    public void Parent_details()
    {
        System.out.println("parent name:"+" "+name);
        System.out.println("parent age:"+age);
    }
    public void eilgible_for_voting(int age)
    {
        if(age>=18)
        {
            System.out.println("EILGIBLE FOR VOTING");
        }
        else
        {
            System.out.println("NOT EILGIBLE FOR VOTING");
        }
    }
}
class child extends parent
{
    static String name=" LOKESH";
    static int age=16;
    // below code replace of extends using in the class(eilgible_for_voting)
    static void Child_details()
    {
        System.out.println("parent name:"+" "+name);
        System.out.println("parent age:"+age);
    }
}
public class oops { 
    public static void main(String[] args) {
        parent obj1 = new parent();
        obj1.Parent_details();
        obj1.eilgible_for_voting(54);

        child obj2 = new child();
        obj2.Child_details();
        obj1.eilgible_for_voting(14);

    }
}
*/
//--------------------------------------------------------------------------
// polymorphism ( many + forms)
/* 
    polymorphism is method having in many form without same data type 😊.polymorphism contains (method overloading)
    Polymorphism in Java refers to the ability of objects to take on multiple forms.
    It allows methods to be overridden in subclasses, enabling them to provide their
    own implementation while still maintaining a common interface with the superclass. Polymorphism facilitates code reuse, flexibility, and abstraction in object-oriented programming.

class Math
{
    public int min(int a,int b)
    {
        if(a<b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    public int min(int a,int b,int c)
    {
        if(a<b&&a<c)
        {
            return a;
        }
        else if(b<c&&b<a)
        {
            return b;
        }
        else
        {
            return c;
        }
    } 
    public int min(int arr[])
    {
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        return min;
    }  
}
public class oops {
    public static void main(String[] args) {
        Math obj1 = new Math();
        System.out.println(obj1.min(1, 2));
        System.out.println(obj1.min(222, 22, 12)); 

        int arr[]={111,2,3,4,6,7,34,2,2,3};
        System.out.println(obj1.min(arr));
    }   
}
*/
//--------------------------------------------------------------------------
// Method Overrinding
/*
class fun1
{
    int age1=14;
    public void fn() // member methods
    {
        System.out.println(age1);
    }
}
class fun2 extends fun1
{
    int age1=1;
    // Method Overrinding
    public void fn() // member methods
    {
        System.out.println(age1);
    }
}
public class oops {
    public static void main(String[] args) {
        fun2 obj1 = new fun2();
        obj1.fn();
    }
}
*/
//--------------------------------------------------------------------------
// TYPES OF INHERITANCE
/*
    Types of Inheritance
        1.Single Inheritance  (parent->child)
        2. Multi Inheritance   (parent1,parent->) Java supports multiple inheritance of interfaces through interface inheritance.
        2.Multi-level Inheritance  (grandfather->parent->child)
        3.Hierarchical Inheritance  (parent->multi childs)
        4.Hybrid Inheritance  (combation of single,multi,Hierarchical Inheritance)
 */

//Single Inheritance
/* 

               father
                 |
                 V
               child



class father
{
    String name ="JAYSEELAN ";
    public void fn()
    {
        System.out.println("-----------Welcome to Ted Talks World--------------");
    }
}
class child extends father
{
    String name = "LOKESH ";
}
public class oops {
    public static void main(String[] args) {
        child obj = new child();
        obj.fn();
        System.out.println(obj.name);
    }
}
*/
//2.Multi-level Inheritance 
/* 
            grandmother         
                 |
                 V  
               father
                 |
                 V
               child

class grandmother
{
    String name="?";
    public void fn()
    {
        System.out.println("-----------Welcome to Ted Talks World--------------");
    }
}
class father extends grandmother
{
    String name ="JAYSEELAN "; // overrinding

}
class child extends father
{
    String name = "LOKESH "; // overrinding
}
public class oops {
    public static void main(String[] args) {
        child obj = new child();
        obj.fn();
        System.out.println(obj.name);
    }
}
*/

//3.Hierarchical Inheritance
/* 

              father
                 |
        ---------------------
        |                   |
      (child1)           (child2)


class father
{
    String name ="JAYSEELAN "; // overrinding
    public void fn()
    {
        System.out.println("-----------Welcome to Ted Talks World--------------");
    }
}
class child1 extends father
{
    String name = "DINESH"; // overrinding
}
class child2 extends father
{
    String name = "LOKESH"; // overrinding
}
public class oops {
    public static void main(String[] args) {
        child1 obj1= new child1();
        obj1.fn();
        System.out.println(obj1.name);

        child2 obj2 = new child2();
        obj2.fn();
        System.out.println(obj2.name);
    }
}
*/

//4.Hybrid Inheritance:
/*
              father
                 |
        ---------------------
        |                   |
      (child1)           (child2)
                            |
                        ------------
                        |          |
                      (son1)     (son2)

 
class father
{
    String name ="JAYSEELAN "; // overrinding
    public void fn()
    {
        System.out.println("-----------Welcome to Ted Talks World--------------");
    }
}
class child1 extends father
{
    String name = "DINESH"; // overrinding
}
class child2 extends father
{
    String name = "LOKESH"; // overrinding
    public void fn1()
    {
        System.out.println("I THE SON OF CHILD2");
    }
}
class son1 extends child2
{
    String name="SON1";
}
class son2 extends child2
{
    String name="SON2";
}
public class oops {
    public static void main(String[] args) {
        son1 obj1= new son1();
        obj1.fn1();
        System.out.println(obj1.name);

        son2 obj2 = new son2();
        obj2.fn1();
        System.out.println(obj2.name);
    }
}

*/


//--------------------------------------------------------------------------
// Abstract 
// 
/*
    *abstract class can't create the object**
    *abstract method declaration should defintion the method definition**
    *abstract class support method definition and method declaration

abstract class Computer
{
    abstract void turnOff();  //method declaration
    void turnOn()
    {
        System.out.println("Turning ON");
    }   
}
class HP extends Computer
{
    @Override
    void turnOff()   //method definition
    {
        System.out.println("HP-Turning Off");
    }
}
class LENOVO extends Computer
{
    @Override
    void turnOff()
    {
        System.out.println("LENOVO-Turning Off");
    }
}
public class oops {

    public static void main(String[] args) {
        // abstract  class can't create the object in main function
        HP obj1 = new HP();
        obj1.turnOn();
        obj1.turnOff();

        LENOVO obj2 = new LENOVO();
        obj2.turnOn();
        obj2.turnOff();
    }
}

*/

//--------------------------------------------------------------------------
//Interfaces & Multiple Inheritance:-
/*
    Interfaces & Multiple Inheritance 
       -> abstract class support method definition and method declaration 
          but abstract class support method definition and method declaration
       -> Java supports multiple inheritance of interfaces through interface inheritance.

interface father 
{
    abstract void Name();
    abstract void Age();
}
interface Mother 
{
    abstract void Name();
    abstract void Age();
}
class son implements father,Mother
{
    public void Name()
    {
        System.out.println("NAME:");
    }
    public void Age()
    {
        System.out.println("Age");
    }
}
public class oops {
    public static void main(String[] args) {
        son obj1 = new son();
        obj1.Name();
        obj1.Age();

        // abstract  class can't create the object in main function
        // father obj2 = new father();
        // obj2.Name();
        // obj2.Age();
    }
}

*/

//--------------------------------------------------------------------------
//static is without creating object can asscess the member class 
// final can't be possible to modifined the value and override methods
/* 
class fn
{
    static int max1;
    final int max2=12;
    public static int min(int a,int b)
    {
        return ((a<b)?a:b);
    }
}
public class oops {
    public static void main(String[] args) {
        
        // static
        fn.max1=12;
        System.out.println(fn.max1);

        System.out.println(fn.min(1, 2));

        //final
        // final can't be possible to modifined the value
        // fn.max2=12;
        // System.out.println(fn.max2);
    }
}
*/
//--------------------------------------------------------------------------
//super
/* 
class father 
{
    int age=54;
    void fun()
    {
        System.out.println("FUN!!");
    }
}
class child1 extends father
{
    int age=25;

    void fun1()
    {
        System.out.println("CHILD1");
        System.out.println(super.age);
    }
}
class child2 extends father
{
    int age=20;
    void fun2()
    {
        System.out.println("CHILD1");
        System.out.println(super.age);
    }
}

public class oops {
    public static void main(String[] args) {
        child1 obj1 = new child1();
        obj1.fun1();

        child2 obj2 = new child2();
        obj2.fun2();
    }
}
*/
//--------------------------------------------------------------------------
//this
/*
class details
{
    String str;
    int age;
    details (String str,int age)
    {
        // system will confused so that using keyword as a (this.member class)
        // str=str;
        // age=age;

        this.age=age;
        this.str=str;
    }
    public void display()  // member methods
    {
        System.out.println(this.age+" "+this.str);       
    }
}
public class oops {
    public static void main(String[] args) {
        details obj = new details("LOKESH", 20);
        obj.display();
    }
}
*/
/*
import java.util.Scanner;

public class oops {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
    // class_name object = new constructor(System.in);
    // constructor(System.in=>input from the user keyboard pass the value to this constructor)
    //nextInt()=>// member methods
        int a=obj.nextInt();
    }
}

*/

//--------------------------------------------------------------------------

/*
public class oops {
    public static void main(String[] args) {
        int a=12;
        int b=0;
        try
        {
            System.out.println(a/b); //  throw error to catch. catch will catch the throw problem(ArithmeticException)
        }
        catch (ArithmeticException E) // it not known about what error will occur so put as (Exception E)
        {
            System.out.println("B is 0");
        }
        catch (Exception E) 
        {
            System.out.println("  B is 0");
        }
        finally
        {
            System.out.println("FINALLY BLOCK EXCUTED");
        }
    }
}
*/
// manualy message throw
/*
public class oops {

    static void check(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("NOT EILGIBLE FOR VOTING");
        }
    }
    public static void main(String[] args) {
        int age = 12;
        try
        {
            check(age);
        }
        catch(ArithmeticException ErRoR)
        {
            System.out.println(ErRoR);
            System.out.println(ErRoR.getMessage());
        } 
    }
}
*/
// user E xception

/*
class UserDefined extends Exception
{
    UserDefined(String str)
    {
        super(str);
    }
}
public class oops {
    static void check(int age) throws UserDefined,ArithmeticException
    {
        if(age<18)
        {
            throw new UserDefined("NOT EILGIBLE FOR VOTING");
        }
        else
        {
            throw new ArithmeticException("AGE VALID..");
        }
    }
    public static void main(String[] args) {
        int age = 14;
        try
        {
            check(age);
        }
        catch(UserDefined ErRoR)
        {
            System.out.println(ErRoR);
            System.out.println(ErRoR.getMessage());
        } 
        catch(ArithmeticException ErRoR)
        {
            System.out.println(ErRoR);
            System.out.println(ErRoR.getMessage());
        }
    }
}
*/

//------------------------------------------------------------------------------------------------
// Reading from a File


/* 
import java.io.File;
import java.util.Scanner;

public class oops {
    public static void main(String[] args) {
        
        try
        {
            File file1 = new File("Exception_Example_1.txt");
            Scanner scan = new Scanner(file1);
            while(scan.hasNextLine())
            {
                System.out.print(scan.nextLine());
            }
            scan.close();
        }
        catch(Exception error)
        {
            System.out.print(error+"-");
        }
    }
}
*/
//------------------------------------------------------------------------------------------------
// Writeing from a File
/*
import java.io.File;
import java.io.FileWriter;

public class oops {
    public static void main(String[] args) {
        
        try
        {
            File file1 = new File("Exception_Example_1.txt");
            FileWriter writer = new FileWriter(file1);
            writer.write("TED TALKS ");
            writer.write(32);
            writer.close();
        }
        catch(Exception error)
        {
            System.out.print(error+"-");
        }
    }
}
*/
//enum
/*
public class oops{
    public static void main(String[] args) {
        weeks temp;
        temp=weeks.tue;
        for(weeks temp1:weeks.values())
        {
            System.out.print(temp1+" ");
        }
        System.out.println();

        System.out.println(temp);

        System.out.println(temp.ordinal());

        System.out.println(weeks.valueOf("thu"));

    }
    static enum weeks
    {
        // these are enum constants,public,static,final
        mon,tue,wed,thu,fri,sat;
        weeks()
        {
            System.out.println("gm---->"+this);
        }
    }
}
*/

// generics:
//1.custom arraylist


//------------------------------------------------------------------------------------------------
// collection and framework helps in storing and processing of data efficiently

/*
        1.collection class
        2.list interface
        3.arraylist 
        4.vector
        5.stack
        6.linkedlist

        7.queue interface
        8.priorityqueue 
        9.deque interface
        10.arraydeque

        11.set
        12.hashset
        13.linkedhashset
        14.sortedset
        15.navigableset
        16.treeset

        17.map
        18.hashmap
        19.hashtable
        20.linkedhashmap
        21.sortedmap
        22.treemap

 */

//colletions 
//indexOf("ed");,put,get,Collection.sort(arr2);
/* 
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collection;


public class oops {
    public static void main(String[] args) {

        Collection <String> arr1 = new ArrayList<>();
        System.out.println(".add()");
        arr1.add("Apple");
        arr1.add("Banana");
        arr1.add("Apple");
        arr1.add("Banana");
        arr1.add("carrot");
        System.out.println(arr1);

        System.out.println(".size()");
        int size = arr1.size();
        System.out.println(size);


        System.out.println(".remove()");
        arr1.remove("Banana");
        System.out.println(arr1);

        System.out.println(".contains()");
        boolean a=arr1.contains("Ap");
        System.out.println(a);

        System.out.println(".isEmpty()");
        boolean b=arr1.isEmpty();
        System.out.println(b);

        System.out.println(".equals()");
        boolean c="LOKESH".equals("LOKESH");
        System.err.println(c);

        System.out.println(".getClass()");
        System.out.println(arr1.getClass());

        System.out.println(".forEach()");
        arr1.forEach((temp)->
        {
            System.out.println(temp);
        }
        );

        System.out.println("print using for loop");
        for(String str:arr1)
        {
            System.out.println(str+" ");
        }

        System.out.println("using Iterator to print:");
        Iterator <String> i = arr1.iterator();
        while (i.hasNext()) {
            System.out.println(i.next()+" ");
        }

        Collection <Integer> arr2 = new ArrayList<Integer>();
        arr2.add(12);
        arr2.add(22);
        arr2.add(322);
        arr2.add(22);
        arr2.add(232);
        Collection <Integer> arr3 = new ArrayList<>();
        arr3.add(2);
        arr3.add(5);
        arr3.add(232);

        System.out.println(".addAll()");
        arr2.addAll(arr3);
        arr2.forEach((temp)->
        {
            System.out.print(temp+" ");
        }
        );
        System.out.println();

        System.out.println(".removeAll()");
        arr2.removeAll(arr3);
        arr2.forEach((temp)->
        {
            System.out.print(temp+" ");
        }
        );
        System.out.println();

        System.out.println(".equals()");
        boolean d=arr2.equals(arr3);
        System.out.println(d);

        System.out.println(".containsAll()");
        boolean e=arr2.containsAll(arr3);
        System.out.println(e);

        Collection <Integer> arr4 = new ArrayList<Integer>();
        arr4.add(12);
        arr4.add(22);
        arr4.add(322);
        arr4.add(2);
        arr4.add(21);

        Collection <Integer> arr5 = new ArrayList<Integer>();
        arr5.add(12);
        arr5.add(22);
        arr5.add(322);

        System.out.println("retainAll()-Retaining only the elements that are common to both arr1 and arr2");
        arr4.retainAll(arr5);
        arr4.forEach((temp)->
        {
            System.out.print(temp+" ");
        }
        );
        System.out.println();


        System.out.println("Creating a parallel stream for arr4");
        arr4.parallelStream().forEach(System.out::println);

        System.out.println(".removeIf()");
        arr4.removeIf(num -> num>20);
        arr4.forEach((temp)->
        {
            System.out.print(temp+" ");
        }
        );
        System.out.println();

        Collection <Integer> arr6 = new ArrayList<Integer>();
        arr6.add(12);
        arr6.add(22);
        arr6.add(322);

        System.out.println("Elements in arr1 using Spliterator:");
        Spliterator<Integer> spliterator = arr6.spliterator();
        spliterator.forEachRemaining(System.out::println);

        System.out.println("Elements in arr1 using Stream:");
        Stream<Integer> stream = arr6.stream();
        stream.forEach(System.out::println);

        System.out.println("coveting arr6 to array");
        Object[] array = arr6.toArray();
        for(Object I:array)
        {
            System.out.println(I+" ");
        }
        System.out.println();
    }
 }
 
*/
//------------------------------------------------------------------------------------------------

// List:
/*
        The List interface in Java provides a way to store the ordered collection.
        It is a child interface of Collection. It is an ordered collection of objects in which
        duplicate values can be stored. Since List preserves the insertion order, it allows positional 
        access and insertion of elements. 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class oops {
    public static void main(String[] args) {

        List<String> arr1 = new ArrayList<String>();
        arr1.add("LOKESH");
        arr1.add("APPLE");
        arr1.add(null);

        System.out.println(".size()");
        int a=arr1.size();
        System.out.println(a);

        System.out.println(".add() Adding an element at a specific index");
        arr1.add(3,"LOKESH");
        System.out.println(arr1);

        List<String> arr2 = new ArrayList<String>();
        arr2.add("AL");
        arr2.add("LA");
        arr2.add("LA");
        arr2.add("AL");

        System.out.println(".addAll");
        arr1.addAll(arr2);
        System.out.println(arr1);

        System.out.println("------.contains()-------");
        boolean b = arr1.contains("A");
        System.out.println(b);

        System.out.println("------.containsAll()-------");
        boolean c = arr1.containsAll(arr2);
        System.out.println(c);

        System.out.println("List elements using iterator: ");
        Iterator <String> i = arr1.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + "-");
        }
        System.out.println();

        System.out.println("------isEmpty()--------");
        boolean d = arr2.isEmpty();
        System.out.println(d);

        System.out.println("-------.equals()--------");
        boolean e = arr1.equals(arr2);
        System.out.println(e);

        System.out.println("List elements using forEach: ");
        arr1.forEach(item -> System.out.print(item + "-"));
        System.out.println();

        System.out.println("Class of the list: " + arr1.getClass().getName());

        System.out.println("Hash code of the list: " + arr1.hashCode());

        System.out.println("------.indexOf()--------");
        int f=arr2.indexOf("AL");
        System.out.println(f);
        
        System.out.println("------.LastIndexOf()--------");
        System.out.println(arr2);
        int g=arr2.lastIndexOf("LA");
        System.out.println(g);

        ListIterator<String> j = arr2.listIterator();
        System.out.println("List elements using list iterator: ");
        while (j.hasNext()) {
            System.out.print(j.next() + " ");
        }
        System.out.println();

        System.out.println("List elements using parallel stream: ");
        arr2.parallelStream().forEach(item -> System.out.print(item + " "));
        System.out.println();


        List<String> arr3 = new ArrayList<String>();
        arr3.add("Apple");
        arr3.add("ApplE");
        arr3.add("red");
        arr3.add("green");

        List<String> arr4 = new ArrayList<String>();
        arr4.add("Apple");
        arr4.add("appLE");
        arr4.add("red");

        System.out.println("------.remove()------");
        arr3.remove("Apple");
        System.out.println(arr3);
    
        System.out.println("---.addAll()------");
        arr3.addAll(arr4);
        System.out.println(arr3);

        System.out.println("---.removeAll()----");
        arr3.removeAll(arr4);
        System.out.println(arr3);


        List<String> arr5 = new ArrayList<String>();
        arr5.add("Apple");
        arr5.add("ApplE");
        arr5.add("red");
        arr5.add("green");

        System.out.println("---startWith()-----");
        arr5.removeIf(k -> k.startsWith("A"));
        System.out.println(arr5);

        System.out.println("---toUpperCase()----");
        arr5.replaceAll(m -> m.toUpperCase());
        System.out.println(arr5);


        List<String> arr6 = new ArrayList<String>();
        arr6.add("Apple");
        arr6.add("ApplE");
        arr6.add("red");
        arr6.add("green");
        arr6.add("green");
        arr6.add("Yellow");

        List<String> arr7 = new ArrayList<String>();
        arr7.add("Apple");
        arr7.add("ApplE");
        arr7.add("red");
        arr7.add("green");

        System.out.println("----retails the common to lists");
        arr6.retainAll(arr7);
        System.out.println(arr6);

        System.out.println("---set()----");
        arr6.set(0, "BLACK");
        System.out.println(arr6);

        System.out.println();

        System.out.println("Elements in the list using Spliterator: ");
        arr6.spliterator().forEachRemaining(xx -> System.out.print(xx + " "));
        System.out.println();

        System.out.println();

        System.out.println("List elements using stream: ");
        arr6.stream().forEach(yy -> System.out.print(yy + " "));
        System.out.println();

        System.out.println();

        List<String> subList = arr6.subList(0, 3);
        System.out.println("Sublist elements: ");
        subList.forEach(item -> System.out.print(item + " "));
        System.out.println();

        System.out.println();

        Object[] arr = arr6.toArray();
        System.out.println("List elements in an array: ");
        for (Object item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println();

        System.out.println("String representation of the list: " + arr6.toString());

        List<String> arr8 = new ArrayList<String>();
        arr8.add("AL");
        arr8.add("LA");
        arr8.add("LA");
        arr8.add("AL");

        System.out.println("inesxOf()");
        System.out.println(arr8.indexOf("AL"));
        System.out.println(arr8.lastIndexOf("AL"));

    }
}
*/
//--------------------------------------------------------------------------------
//abstractList
/*
    The set() method of java.util.AbstractList class is used to replace 
    any particular element in the abstract list created using the AbstractList
     class with another element. This can be done by specifying the position of
      the element to be replaced and the new element in the parameter of the set() method.
 
      Here's a breakdown of which methods from the `Collections` class are supported by each of the given classes/interfaces:

        1. `Collection` class:
        - A. `addAll`
        - D. `disjoint`
        - E. `emptyList`
        - `Collections.frequency`
        - `Collections.nCopies`
        - `Collections.replaceAll`
        - `Collections.reverse`
        - `Collections.shuffle`
        - `Collections.singletonList`
        - `Collections.sort`
        - `Collections.unmodifiableList`
        - `Collections.fill`

        2. `List` interface:
        - A. `addAll`
        - B. `binarySearch`
        - C. `copy`
        - D. `disjoint`
        - E. `emptyList`
        - `Collections.frequency`
        - `Collections.indexOfSubList`
        - `Collections.max`
        - `Collections.min`
        - `Collections.nCopies`
        - `Collections.replaceAll`
        - `Collections.reverse`
        - `Collections.shuffle`
        - `Collections.singletonList`
        - `Collections.sort`
        - `Collections.swap`
        - `Collections.unmodifiableList`
        - `Collections.fill`

        3. `ArrayList`:
        - All methods are supported since `ArrayList` implements the `List` interface.

        4. `Vector`:
        - All methods are supported since `Vector` extends `AbstractList`, which implements the `List` interface.

        5. `Stack`:
        - All methods are supported since `Stack` extends `Vector`.

        6. `LinkedList`:
        - All methods are supported since `LinkedList` implements the `List` interface.

        7. `Queue` interface:
        - None of the methods are directly supported by the `Queue` interface.

        8. `PriorityQueue`:
        - None of the methods are directly supported by the `PriorityQueue` class.

        9. `Deque` interface:
        - None of the methods are directly supported by the `Deque` interface.

        10. `ArrayDeque`:
        - None of the methods are directly supported by the `ArrayDeque` class.

        11. `Set`:
        - None of the methods are directly supported by the `Set` interface.

        12. `HashSet`:
        - None of the methods are directly supported by the `HashSet` class.

        13. `LinkedHashSet`:
        - None of the methods are directly supported by the `LinkedHashSet` class.

        14. `SortedSet`:
        - None of the methods are directly supported by the `SortedSet` interface.

        15. `NavigableSet`:
        - None of the methods are directly supported by the `NavigableSet` interface.

        16. `TreeSet`:
        - None of the methods are directly supported by the `TreeSet` class.

        17. `Map`:
        - None of the methods are directly supported by the `Map` interface.

        18. `HashMap`:
        - None of the methods are directly supported by the `HashMap` class.

        19. `Hashtable`:
        - None of the methods are directly supported by the `Hashtable` class.

        20. `LinkedHashMap`:
        - None of the methods are directly supported by the `LinkedHashMap` class.

        21. `SortedMap`:
        - None of the methods are directly supported by the `SortedMap` interface.

        22. `TreeMap`:
        - None of the methods are directly supported by the `TreeMap` class.
*/
/*

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;

public class oops {
    public static void main(String[] args) {
        AbstractList <Integer> arr1= new LinkedList<>();
        arr1.add(11);
        arr1.add(0,22);


        System.out.println("1.add:"+arr1);

        arr1.addAll(2,arr1);
        System.out.println("2.addAll:"+arr1);

        arr1.addAll(arr1);
        System.out.println("3.addAll:"+arr1);

        boolean a=arr1.contains(1);
        System.out.println("4.contains:"+a);

        AbstractList <Integer> arr2= new LinkedList<>();
        arr2.add(1);
        arr2.add(2);
        
        boolean b=arr1.containsAll(arr2);
        System.out.println("5.containsAll:"+b);


       boolean c = arr1.equals(arr2);
       System.out.println("6.equals:"+c);

       System.out.print("7.forEach:");
       arr1.forEach((temp)->System.out.print(temp+" "));
       System.out.println();

       int d=arr1.get(2);
       System.out.println("8.get:"+d);

       System.out.println("9.getclass:"+arr1.getClass());

       System.out.println("10.isempty:"+arr1.isEmpty());

       System.out.println("11.hashCode: "+arr1.hashCode());

       System.out.println("12.indexOf:"+arr1.indexOf(12));

       System.out.println("13.LastIndexOf:"+arr1.lastIndexOf(1));

       System.out.println("13.size: "+arr1.size());

       arr1.remove(1);
       System.out.println("14.remove index"+arr1);

       arr1.remove((Integer)11);
       System.out.println("15.remove first occurrenc value :"+arr1);

       

       AbstractList <Integer> arr3= new LinkedList<>();
       arr3.add(1);
       arr3.add(2);
       arr3.add(3);
       arr3.add(4);
       arr3.add(5);
       arr3.add(6);
       arr3.add(7);
       arr3.add(8);
       arr3.add(9);
       arr3.add(10);

       System.out.print("16.parallelstream: ");
       arr3.parallelStream().forEach(System.out::print);
       System.out.println();

       arr3.removeIf(element -> element%2==0);
       System.out.println("17.Array after removing even elements: " + arr3);

       arr3.replaceAll(element -> element * 2);
       System.out.println("18.Array after replacing all elements with double values: " + arr3);



       arr3.set(0, 777);
       System.out.println("19.Array after setting element 50 at index 0: " + arr3);



       System.out.print("20.stream: ");
       arr3.stream().forEach(System.out::print);
       System.out.println();

        List<Integer> subList = arr3.subList(0, 3);
        System.out.println("21.Sublist from index 0 to 3: " + subList);


        System.out.print("22.toArray: ");
        Integer[] array = arr3.toArray(new Integer[arr3.size()]);
        for(Integer i:array)
        {
            System.out.print(i+" ");
        }
        System.out.println();

        Object[] objArray = arr3.toArray();
        System.out.println("23.Array converted to array (without specifying type): " + Arrays.toString(objArray));
       
       System.out.print("24.spliterator: ");
       Spliterator<Integer> spliterator = arr3.spliterator();
       spliterator.forEachRemaining((temp)->System.out.print(temp+" "));
       System.out.println();


       System.out.print("25.sort:");
       arr3.sort(Comparator.naturalOrder());
       System.out.println(arr3);

       System.out.print("26.reverse:");
       arr3.sort(Comparator.reverseOrder());
       System.out.println(arr3);

       System.out.print("27. Iterating over elements: ");
       Iterator<Integer> iterator = arr3.iterator();
       while (iterator.hasNext()) {
           System.out.print(iterator.next() + "-");
       }
       System.out.println();

        Collections.replaceAll(arr3, 10, 100);
        System.out.println("28. Array after replacing all occurrences of 80 with 100: " + arr3);

      
        arr3.retainAll(Arrays.asList(18, 40));
        System.out.println("29.Array after retaining elements 20 and 40: " + arr3);

    }
}
*/
//--------------------------------------------------------------------------------
//collections
/*

import java.util.*;

public class oops {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        // A. addAll
        Collections.addAll(list, 40, 50, 60);
        System.out.println("1.After adding all: " + list);

        // B. binarySearch
        int index = Collections.binarySearch(list, 30);
        System.out.println("2.Index of 30: " + index);

        // C. copy
        List<Integer> destList = new ArrayList<>(Arrays.asList(new Integer[list.size()]));
        Collections.copy(destList, list);
        System.out.println("3.Copied list: " + destList);

        // D. disjoint
        boolean disjoint = Collections.disjoint(list, Arrays.asList(10, 80, 90));
        System.out.println("4.Disjoint with [10, 80, 90]: " + disjoint);

        
        // E. emptyList
        List<Integer> emptyList = Collections.emptyList();
        System.out.println("5.Empty list: " + emptyList);


        int frequency = Collections.frequency(list, 10);
        System.out.println("6.Frequency of 0: " + frequency);

        index = Collections.indexOfSubList(list, Arrays.asList(20, 30));
        System.out.println("7.Index of sublist [20, 30]: " + index);

        // I. max
        int max = Collections.max(list);
        System.out.println("9.Max value: " + max);

        // J. min
        int min = Collections.min(list);
        System.out.println("10.Min value: " + min);

        // K. nCopies
        List<Integer> nCopiesList = Collections.nCopies(3, 100);
        System.out.println("11.List with 3 copies of 100: " + nCopiesList);


        // L. replaceAll
        Collections.replaceAll(list, 10, 99);
        System.out.println("12.After replacing all 0s with 99: " + list);

        // M. reverse
        Collections.reverse(list);
        System.out.println("13.After reversing: " + list);

        // N. shuffle
        Collections.shuffle(list);
        System.out.println("14.After shuffling: " + list);

        // O. singleton
        List<Integer> singletonList = Collections.singletonList(200);
        System.out.println("15.Singleton list: " + singletonList);

        Collections.sort(list);
        System.out.println("16.After sorting: " + list);

        // Q. swap
        Collections.swap(list, 0, 1);
        System.out.println("17.After swapping: " + list);

        // R. unmodifiableList
        List<Integer> unmodifiableList = Collections.unmodifiableList(list);
        System.out.println("18.Unmodifiable list: " + unmodifiableList);
        //unmodifiableList.set(1, 2); error will occuur

        Collections.fill(list, 0);
        System.out.println("6.After filling with 0: " + list);


        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        System.out.println();



    }
}


//--------------------------------------------------------------------------------
/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class oops {

    public static void main(String[] args) {
        ArrayList <Integer> temp = new ArrayList<>();
        temp.add(12);
        temp.add(1);
        temp.add(121);
        temp.add(54);
        temp.add(13);
        ArrayList<Integer> clonedList = (ArrayList<Integer>) temp.clone();
        System.out.println("Cloned ArrayList: " + clonedList);

        // Reversing the elements of the ArrayList
        Collections.reverse(temp);
        System.out.println("Reversed ArrayList: " + temp);

        Collections.sort(temp);
        System.out.println("Sorted ArrayList: " + temp);

        // Shuffling the elements of the ArrayList
        Collections.shuffle(temp);
        System.out.println("Shuffled ArrayList: " + temp);


        ArrayList <Integer> temp2 = new ArrayList<>();
        temp2.add(1);
        temp2.add(2);
        temp2.add(3);
        temp2.add(4);
        temp2.add(5);
        temp2.add(6);
        temp2.add(7);
        temp2.add(8);
        temp2.add(9);
        temp2.add(10);
        Collections.rotate(temp2, 2);
        System.out.println("Rotated ArrayList: " + temp2);



        temp2.trimToSize();
        System.out.println("ArrayList after trimming to its current size: " + temp2);


        int key = 3;
        int index = Collections.binarySearch(temp2, key);
        System.out.println("Index of " + key + " in the sorted list: " + index);

        Integer max = Collections.max(temp2);
        System.out.println("Maximum element in the list: " + max);

        // Finding the minimum element in the list
        Integer min = Collections.min(temp2);
        System.out.println("Minimum element in the list: " + min);

        // Synchronizing the list
        List<Integer> synchronizedList = Collections.synchronizedList(temp2);
        synchronizedList.forEach((i)->
        {
            System.out.print(i+" ");
        }
        );
        System.out.println();

        // Creating an unmodifiable view of the list
        List<Integer> unmodifiableList = Collections.unmodifiableList(temp2);
        unmodifiableList.forEach((j)->
        {
            System.out.print(j+" ");
        }
        );
        System.out.println();


        ArrayList <Integer> temp3 = new ArrayList<>();
        temp3.add(1);
        temp3.add(2);
        temp3.add(3);
        temp3.add(7);
        temp3.add(8);
        temp3.add(9);
        temp3.add(10);
        temp3.add(10);
        temp3.add(10);



        System.out.println("---------Copying elements from one list to another-----------");
        List<Integer> destList = new ArrayList<>(Collections.nCopies(temp3.size(), 0));
        Collections.copy(destList, temp3);
        System.out.println("Copied list: " + destList);

        System.out.println("-----Checking if two lists are disjoint----------");
        List<Integer> anotherList = new ArrayList<>();
        anotherList.add(4);
        anotherList.add(5);
        anotherList.add(6);

        boolean disjoint = Collections.disjoint(temp3, anotherList);
        System.out.println("Are the two lists disjoint? " + disjoint);

        System.out.println("-----Counting the frequency of an element in the list----");
        int frequency = Collections.frequency(temp3, 10);
        System.out.println("Frequency of " + key + " in the list: " + frequency);

        System.out.println("--- Adding multiple elements to the list-----");
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3);
        System.out.println("List after adding elements: " + list);

        System.out.println("---Replacing all occurrences of one element with another---");
        Collections.replaceAll(list, 2, 10);
        System.out.println("List after replacing elements: " + list);



        System.out.println("----Creating a synchronized (thread-safe) collection backed by the specified collection----");
        List<Integer> synchronizedList2 = Collections.synchronizedList(list);
        synchronizedList2.forEach((k)->
        {
            System.out.print(k+" ");
        });
        System.out.println();
        
        System.out.println("--Creating an immutable list consisting of n copies of the specified object----");
        List<Integer> immutableList = Collections.nCopies(5, 10);
        System.out.println("Immutable list: " + immutableList);

        System.out.println("---Creating an empty list (immutable)------");
        List<Integer> emptyList = Collections.emptyList();
        System.out.println("Empty list: " + emptyList);     
        

        List<Integer> temp4 = new ArrayList<>();
        temp4.add(6);
        temp4.add(4);
        temp4.add(5);
        temp4.add(1);
        temp4.add(2);
        temp4.add(3);
        temp4.add(42);
        temp4.add(22);
        temp4.add(232);

        System.out.println("--- Swapping elements at the specified positions---");
        Collections.swap(temp4, 0, 2);
        System.out.println("List after swapping: " + temp4);

        Collections.fill(temp2, 0);
        System.out.println("ArrayList after filling with 0: " + temp2);

        temp2.clear();
        System.out.println(temp2);

    }
}
*/

//---------------------------------------------------------------------------------------------
//linkedlist

/*       size(),.clear(),.removeLast(),.add(),.removeFirst(),
        .add(,),.addAll(),.addFirst(),.addLast(null),..contains()
        .containsAll(),..descendingIterator(),.element(),
        equals(),.forEach(),.get(),.getClass(),.getFirst()

        .getLast(),..hashCode(),.indexOf(list1),.isEmpty(),
        .iterator(),.lastIndexOf(),.listIterator(),.offer()
        ..parallelStream(),.peek(),.peekFirst(),.peekLast()
        .poll(),.pollFirst(),.pollLast(),.pop(),.push(),

        .remove(),.removeAll(),.removeFirstOccurrence(),
        .removeIf(),.removeLastOccurrence(),.replaceAll(),
        .retainAll(),.set(0,1),.sort(),.spliterator(),.stream()
        .subList(0, 0),.toArray(),.toString(), 
 */
/* 
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class oops {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("1");
        list1.add("11");
        list1.add("23");
        list1.add("123");
        list1.add("2324");
        list1.add("234");
        list1.add("75");

        System.out.println("------.size()----");
        int size=list1.size();
        System.out.println(size);


        System.out.println("-----collections sort--");
        Collections.sort(list1);
        System.out.println(list1);

        System.out.println("-----remove()-----");
        list1.remove("123");
        System.out.println(list1);

        System.out.println("-----remove()-----");
        list1.remove();
        System.out.println(list1);


        System.out.println("-----removeLast()-----");
        list1.removeLast();
        System.out.println(list1);

        System.out.println("-----removeFirst-------");
        list1.removeFirst();
        System.out.println(list1);

        System.out.println("-----addFirst-------");
        list1.addFirst("7");
        System.out.println(list1);

        System.out.println("------addLast--------");
        list1.addLast("7");
        System.out.println(list1);

        System.out.println("------contains------");
        boolean a=list1.contains("7");
        System.out.println(a);


        LinkedList<String> list2 = new LinkedList<>();
        list2.add("1");
        list2.add("23");
        list2.add("123");
        list2.add("4");
        list2.add("123");
        list2.add("4");
        list2.add(1, "777777777777");

        System.out.println("---containsAll-----");
        boolean b=list1.containsAll(list2);
        System.out.println(b);


        System.out.println("------get------");
        String str1=list2.get(1);
        System.out.println(str1);


        System.out.println("------getFirst------");
        String str2=list2.getFirst();
        System.out.println(str2);
        System.out.println(list2);


        System.out.println("------getLast------");
        String str3=list2.getLast();
        System.out.println(str3);


        System.out.println("------getClass------");
        System.out.println(list2.getClass());


        System.out.println("----forEach-----");
        list2.forEach(element -> System.out.print(element + " "));


        System.out.println("-----hashcode-----");
        System.out.println(list2.hashCode());


        System.out.println("-----indexOf()---");
        int index1=list2.indexOf("55");
        System.out.println(index1);

        System.err.println("---lastIndexOf()----");
        int index2=list2.lastIndexOf("4");
        System.out.println(index2);

        System.out.println("---isEmpty----");
        boolean c=list2.isEmpty();
        System.out.println(c);


        Iterator<String> i = list2.iterator();
        System.out.println("LinkedList elements using iterator: ");
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println();


        System.out.println("Offer an element to the LinkedList (adds at the end)");
        list2.offer("777");
        System.out.println(list2);


        System.out.println("Perform operations in parallel using parallelStream()");
        list2.parallelStream().forEach(temp->System.out.print(temp+" "));
        System.out.println();



        System.out.println("----peek--Peek at the last element without removing it");
        String d=list2.peek();
        System.out.println(d);

        System.out.println("----peekFirst----");
        String e=list2.peekFirst();
        System.out.println(e);
        

        System.out.println("----peekLast----");
        String f=list2.peekLast();
        System.out.println(f);


        System.out.println("---poll--// Poll the first element and remove it");
        list2.poll();
        System.out.println(list2);

        
        System.out.println("---poll--// Poll the first element and remove it");
        list2.pollFirst();
        System.out.println(list2);

        
        System.out.println("---poll--// Poll the Last element and remove it");
        list2.pollLast();
        System.out.println(list2);



        System.out.println("----clear---");
        list2.clear();
        System.out.println(list2);


        LinkedList<String> list3 = new LinkedList<>();
        list3.add("1");
        list3.add("23");
        list3.add("123");
        list3.add("4");
        list3.add("123");
        list3.add("4");
        list3.add(1, "777777777777");

        System.out.println("----pop-----");
        list3.pop();
        System.out.println(list3);

        System.out.println("---push----");
        list3.push("LOKESH");
        System.out.println(list3);


        
        LinkedList<Integer> list4 = new LinkedList<>();
        list4.add(1);
        list4.add(23);
        list4.add(123);
        list4.add(4);
        list4.add(123);
        list4.add(4);
        list4.add(0, 22);

        System.out.println("LinkedList elements using descendingIterator: ");
        Iterator<Integer> j1 = list4.descendingIterator();
        while (j1.hasNext()) {
            System.out.print(j1.next() + " ");
        }
        System.out.println();

        ListIterator<Integer> j2 = list4.listIterator();
        System.out.println("LinkedList elements using listIterator: ");
        while (j2.hasNext()) {
            System.out.print(j2.next() + " ");
        }
        System.out.println();

        System.out.println("Traversing backward using ListIterator: ");
        while (j2.hasPrevious()) {
            System.out.print(j2.previous() + " ");
        }
        System.out.println();

        System.out.println("Get the first element of the LinkedList without removing it");
        System.out.println("First element of LinkedList: " + list4.element());

        System.out.println("---equals-----");
        System.out.println(list4.equals(list3));



        LinkedList<Integer> list5 = new LinkedList<>();
        list5.add(1);
        list5.add(1);
        list5.add(3);
        list5.add(1);
        list5.add(4);
        list5.add(1);
        list5.add(5);

        System.out.println("---removeFirstOccurrence----");
        list5.removeFirstOccurrence(1);
        System.out.println(list5);

        System.out.println("---removeLastOccurrence----");
        list5.removeLastOccurrence(1);
        System.out.println(list5);


        System.out.println("---removeIf------");
        list5.removeIf(num-> num%2==0);
        System.out.println(list5);

        System.out.println("----set---");
        list5.set(1,777);
        System.out.println(list5);

   

        LinkedList<Integer> list6 = new LinkedList<>();
        list6.add(1);
        list6.add(1);
        list6.add(3);
        list6.add(1);
        list6.add(4);
        list6.add(1);
        list6.add(5);

        LinkedList<Integer> list7 = new LinkedList<>();
        list7.add(1);
        list7.add(1);
        list7.add(3);



        System.out.println("--retailsAll---");
        list6.retainAll(list7);
        System.out.println(list6);


        System.out.println("Sort the LinkedList");
        list6.sort(Integer::compareTo);
        System.out.println("LinkedList after sorting: " + list6);


        System.out.print("Elements of LinkedList using Spliterator: ");
        Spliterator<Integer> spliterator = list6.spliterator();
        spliterator.forEachRemaining(System.out::print);
        System.out.println();

        System.out.println("Elements of LinkedList using stream: ");
        list6.stream().forEach(element -> System.out.print(element + " "));
        System.out.println();System.out.print("Elements of LinkedList using Spliterator: ");


        System.out.println("-----sublist-----");
        List<Integer> subList = list6.subList(0, 2);
        System.out.println("Sublist from index 0 to 0: " + subList);

        System.out.print("LinkedList converted to array: ");
        Integer[] array = list6.toArray(new Integer[0]);
       
        for (Integer element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("Convert LinkedList to a string");
        String linkedListString = list6.toString();
        System.out.println("LinkedList converted to string: " + linkedListString);

        System.out.println("--replaceAll---");
        list6.replaceAll((nums)->nums%2==0?0:1);
        System.out.println(list6);
 

        System.out.println("---removeAll---");
        list5.removeAll(list4);
        System.out.println(list5);






    }
}

*/


//-----------------------------------------------------------------------------------
// vector


/*
import java.util.Vector;
import java.util.Enumeration;

public class oops {
    public static void main(String[] args) {
        

        Vector<Integer> vector = new Vector<>();
        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);
        vector.addElement(5);

        // Remove element at index 2
        vector.removeElementAt(2);
        System.out.println("Vector after removing element at index 2: " + vector);

        // Remove element 'arr1' if exists
        vector.removeElement(3);
        System.out.println("Vector after removing element 'arr1': " + vector);

        // Set the size of the Vector to 0
        vector.setSize(0);
        System.out.println("Vector after setting size to 0: " + vector);

        // Add elements back to the Vector
        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);
        vector.addElement(5);

        // Get an Enumeration of the elements in the Vector
        Enumeration<Integer> enumeration = vector.elements();
        System.out.print("Elements of Vector using Enumeration: ");
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }
        System.out.println();

        // Add a null element to the Vector
        vector.addElement(null);
        System.out.println("Vector after adding null element: " + vector);

        // Get the capacity of the Vector
        System.out.println("Capacity of Vector: " + vector.capacity());

        // Get the element at index 0
        System.out.println("Element at index 0: " + vector.elementAt(0));

        // Copy elements into an array
        Integer[] copyArray = new Integer[vector.size()];
        vector.copyInto(copyArray);
        System.out.print("Vector elements copied into array: ");
        for (Integer element : copyArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Get the first element of the Vector
        System.out.println("First element of Vector: " + vector.firstElement());

        // Insert a null element at index 0
        vector.insertElementAt(null, 0);
        System.out.println("Vector after inserting null element at index 0: " + vector);

        // Remove all elements from the Vector
        vector.removeAllElements();
        System.out.println("Vector after removing all elements: " + vector);
    }
}
*/
//--------------------------------------------------------------------------------\
//stack

        /*  arr1.pop() arr1.push(null) arr1.peek(),empty(),.add(null)
,.add(0, null).addAll(arr1),.addElement(),.capacity(),.clear(),.clone(),.contains(),
.containsAll(arr1),.copyInto(args),.elementAt(0),.elements(),.ensureCapacity(0);

.equals(arr1),.firstElement(),forEach(null),get(0),.getClass(),.hashCode()
.indexOf(),.indexOf(arr1, 0),.insertElementAt(null, 0),.isEmpty(),.iterator()
.lastElement(),.lastIndexOf(),lastIndexOf(ar1, 0),listIterator(),.parallelStream(),
remove(0),.removeAll(arr1),.removeAllElements(),.removeElement(),.removeElementAt(0);
.removeIf(null),.replaceAll(null),.retainAll(arr1),.search(),.set(0, null),
setElementAt(null, 0);.setSize(0),.sort(null),.spliterator(),.stream(),
.subList(0, 0),.toArray(),.toString(),.trimToSize();
        */

/*
        import java.util.Stack;
        import java.util.Arrays;
        import java.util.Collections;
        
        public class oops {
            private static Integer set;

            public static void main(String[] args) {
                // Create a Stack
                Stack<Integer> stack = new Stack<>();
        
                // 1. pop(): Removes and returns the top element of the stack.
                stack.push(10);
                System.out.println("1.Popped element: " + stack.pop());
        
                // 2. push(null): Pushes a null element onto the top of the stack.
                stack.push(null);
                System.out.println("2.Stack after pushing null: " + stack);
        
                // 3. peek(): Returns the top element of the stack without removing it.
                System.out.println("3.Peeked element: " + stack.peek());
        
                // 4. empty(): Checks if the stack is empty.
                System.out.println("4.Is stack empty? " + stack.empty());
        
                // 5. .add(null): Adds a null element to the end of the stack.
                stack.add(null);
                System.out.println("5.Stack after adding null: " + stack);
        
                // 6. .add(0, null): Adds a null element at the specified index in the stack.
                stack.add(0, null);
                System.out.println("6.Stack after adding null at index 0: " + stack);
        
                // 7. .addAll(arr1): Adds all elements from another collection arr1 to the stack.
                Stack<Integer> arr1 = new Stack<>();
                arr1.addAll(Arrays.asList(1, 2, 3));
                stack.addAll(arr1);
                System.out.println("7. Stack after adding all elements from arr1: " + stack);
        
                // 8. .addElement(): Adds an element to the end of the stack (same as .add()).
                stack.addElement(100);
                System.out.println("8. Stack after adding element using addElement(): " + stack);
        
                // 9. .capacity(): Returns the current capacity of the stack.
                System.out.println("9. Stack capacity: " + stack.capacity());
        
                // 10. .clear(): Removes all elements from the stack.
                stack.clear();
                System.out.println("10.Stack after clearing: " + stack);
        
                // 11. .clone(): Creates a shallow copy of the stack.
                Stack<Integer> cloneStack = (Stack<Integer>) stack.clone();
                System.out.println("11.Cloned stack: " + cloneStack);
        
                // 12. .contains(): Checks if the stack contains a specified element.
                stack.addAll(Arrays.asList(1, 2, 3));
                System.out.println("12.Does stack contain 2? " + stack.contains(2));
        
                // 13. .containsAll(arr1): Checks if the stack contains all elements from collection arr1.
                System.out.println("13.Does stack contain all elements from arr1? " + stack.containsAll(arr1));
        
                // 14. .copyInto(args): Copies the elements of the stack into the array args.
                Integer[] array = new Integer[stack.size()];
                stack.copyInto(array);
                System.out.println("14.Array copied from stack: " + Arrays.toString(array));
        
                // 15. .elementAt(0): Returns the element at the specified index in the stack.
                System.out.println("15.Element at index 0: " + stack.elementAt(0));
        
                // 16. .elements(): Returns an enumeration of the elements in the stack.
                System.out.println("16.Enumeration of elements in stack:");
                Collections.list(stack.elements()).forEach(System.out::println);
        
                // 17. .ensureCapacity(0): Ensures that the stack has at least the specified capacity.
                stack.ensureCapacity(10);
                System.out.println("17.Stack after ensuring capacity: " + stack);
        
                // 18. .equals(arr1): Checks if the stack is equal to collection arr1.
                System.out.println("18.Is stack equal to arr1? " + stack.equals(arr1));
        
                // 19. .firstElement(): Returns the first element of the stack.
                System.out.println("19.First element of stack: " + stack.firstElement());
        
                // 20. forEach(null): Applies the given action to each element of the stack (null here indicates the action).
                stack.forEach(System.out::println);
        
                // 21. .get(0): Returns the element at the specified index in the stack.
                System.out.println("21.Element at index 0: " + stack.get(0));
        
                // 22. .getClass(): Returns the class of the stack.
                System.out.println("22.Stack class: " + stack.getClass());
        
                // 23. .hashCode(): Returns the hash code value for the stack.
                System.out.println("23.Stack hash code: " + stack.hashCode());
        
                // 24. .indexOf(): Returns the index of the first occurrence of the specified element in the stack.
                System.out.println("24.Index of element 2: " + stack.indexOf(2));
        
                // 25. .indexOf(arr1, 0): Returns the index of the first occurrence of the specified element in
                // 25. .indexOf(arr1, 0): Returns the index of the first occurrence of the specified element in the stack, starting the search at the specified index.
                System.out.println("25.Index of element 2 starting from index 0: " + stack.indexOf(2, 0));

                // 26. .insertElementAt(null, 0): Inserts the specified element at the specified position in the stack.
                stack.insertElementAt(null, 0);
                System.out.println("26.Stack after inserting null at index 0: " + stack);

                // 27. .isEmpty(): Checks if the stack is empty.
                System.out.println("27.Is stack empty? " + stack.isEmpty());

                // 28. .iterator(): Returns an iterator over the elements in the stack.
                System.out.println("28.Iterator over elements in stack:");
                stack.iterator().forEachRemaining(System.out::println);

                // 29. .lastElement(): Returns the last element of the stack.
                System.out.println("29.Last element of stack: " + stack.lastElement());

                // 30. .lastIndexOf(): Returns the index of the last occurrence of the specified element in the stack.
                System.out.println("30.Last index of element 2: " + stack.lastIndexOf(2));

                // 31. .lastIndexOf(arr1, 0): Returns the index of the last occurrence of the specified element in the stack, starting the search at the specified index.
                System.out.println("31.Last index of element 2 starting from index 0: " + stack.lastIndexOf(2, 0));

                // 32. .listIterator(): Returns a list iterator over the elements in the stack.
                System.out.println("32.List iterator over elements in stack:");
                stack.listIterator().forEachRemaining(System.out::println);

                // 33. .parallelStream(): Returns a parallel stream of the elements in the stack.
                System.out.println("33.Parallel stream of elements in stack:");
                stack.parallelStream().forEach(System.out::println);

                // 34. .remove(0): Removes the element at the specified index in the stack.
                stack.remove(0);
                System.out.println("34.Stack after removing element at index 0: " + stack);

                // 35. .removeAll(arr1): Removes all occurrences of the elements in collection arr1 from the stack.
                stack.addAll(Arrays.asList(1, 2, 3, 4, 5));
                stack.removeAll(arr1);
                System.out.println("35.Stack after removing all elements in arr1: " + stack);

                // 36. .removeAllElements(): Removes all elements from the stack.
                stack.removeAllElements();
                System.out.println("36.Stack after removing all elements: " + stack);

                // 37. .removeElement(): Removes the first occurrence of the specified element from the stack.
                stack.addAll(Arrays.asList(1, 2, 3, 4, 5));
                stack.removeElement(2);
                System.out.println("37.Stack after removing first occurrence of element 2: " + stack);

                // 38. .removeElementAt(0): Removes the element at the specified index in the stack.
                stack.removeElementAt(0);
                System.out.println("38.Stack after removing element at index 0: " + stack);

                // 39. .removeIf(null): Removes all elements of the stack that satisfy the given predicate (null here indicates the predicate).
                stack.removeIf(e -> e % 2 == 0);
                System.out.println("39.Stack after removing even elements: " + stack);

                // 40. .replaceAll(null): Replaces each element of the stack with the result of applying the given operator (null here indicates the operator).
                stack.replaceAll(e -> e * 10);
                System.out.println("40.Stack after multiplying each element by 10: " + stack);

                // 41. .retainAll(arr1): Retains only the elements in the stack that are contained in collection arr1.
                stack.addAll(Arrays.asList(10, 20, 30, 40, 50));
                stack.retainAll(arr1);
                System.out.println("41.Stack after retaining only elements in arr1: " + stack);

                // 42. .search(): Searches for the specified object in the stack and returns its position.
                System.out.println("42.Position of element 30: " + stack.search(30));



                Stack<Integer> stack1 = new Stack<>();
                stack1.add(143);
                stack1.add(3);
                stack1.add(13);
                stack1.add(13);
                stack1.add(143);

                // 43. .set(0, null): Replaces the element at the specified position in the stack with the specified element (null here indicates the element).
                stack1.set(0, 1);
                System.out.println("43.Stack after setting element at index 0 to null: " + stack1);

                // 44. .setElementAt(null, 0): Sets the element at the specified index in the stack to be the specified element (null here indicates the element).
                stack1.setElementAt(5, 0);
                System.out.println("44.Stack after setting element at index 0 to null: " + stack1);



                // 46. .sort(null): Sorts the elements of the stack using the specified
                
                // Sorting the stack (Ascending Order)
                Collections.sort(stack1);
                System.out.println("46.Stack after sorting in ascending order: " + stack1);
        
                // 47. .spliterator(): Creates a late-binding and fail-fast spliterator over the elements in the stack.
                System.out.println("47.Spliterator characteristics: " + stack1.spliterator().characteristics());
        
                // 48. .stream(): Returns a sequential stream of the elements in the stack.
                System.out.println("48.Sequential stream of elements in stack:");
                stack1.stream().forEach(System.out::println);
        
                // 49. .subList(0, 0): Returns a view of the portion of the stack between the specified fromIndex, inclusive, and toIndex, exclusive.
                System.out.println("49.Sublist of stack from index 0 to 0: " + stack1.subList(0, 0));
        
                // 50. .toArray(): Returns an array containing all of the elements in the stack in proper sequence.
                Integer[] arrayFromStack = stack1.toArray(new Integer[0]);
                System.out.println("50.Array created from stack: " + Arrays.toString(arrayFromStack));
        
                // 51. .toString(): Returns a string representation of the stack.
                System.out.println("51.String representation of stack: " + stack1.toString());
        
                // 52. .trimToSize(): Trims the capacity of the stack to be the stack's current size.
                stack1.trimToSize();
                System.out.println("52.Stack after trimming to size: " + stack1);

                // 45. .setSize(0): Sets the size of the stack to the specified size.
                stack1.setSize(0);
                 System.out.println("45.Stack after setting size to 0: " + stack1);
        }
    }
    
*/
//---------------------------------------------------------------------------------------------------------------------
//deque
/* 
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
public class oops {
    public static void main(String[] args) {
        Deque <Integer> arr1 = new ArrayDeque<>();
        // Adding elements
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);

        // 1. addFirst(element)
        arr1.addFirst(0);
        System.out.println("1."+arr1);

        // 2. addLast(element)
        arr1.addLast(4);
        System.out.println("2."+arr1);

        // // 3. clear()
        // arr1.clear();

        // 4. clone()
        Deque<Integer> arr2 = ((ArrayDeque<Integer>) arr1).clone();
        System.out.println("4."+arr2);

        // 5. contains(element)
        boolean contains = arr1.contains(3);
        System.out.println("5."+contains);


        // 6. descendingIterator()
        Iterator<Integer> descendingIterator = arr1.descendingIterator();
        descendingIterator.forEachRemaining(temp1->System.out.print(temp1+" "));
        System.out.println();

        // 7. element()
        Integer first = arr1.element();
        System.out.println("7. "+first);

        // 8. getFirst()
        Integer firstElement = arr1.getFirst();
        System.out.println("8. "+firstElement);

        // 9. getLast()
        Integer lastElement = arr1.getLast();
        System.out.println("9. "+lastElement);


        // 10. isEmpty()
        boolean isEmpty = arr1.isEmpty();
        System.out.println("10. "+isEmpty);

        // 11. iterator()
        System.out.print("11. ");
        Iterator<Integer> iterator = arr1.iterator();
        iterator.forEachRemaining((temp2)->System.out.print(temp2+" "));
        System.out.println();

        // 12. offer(element)
        boolean offerResult = arr1.offer(5);// Will return ture because the deque is notfull
        System.out.println("12. "+offerResult);


        // offerFirstResult will be true if the element -1 was successfully added to the front of the deque, otherwise it will be false.
        // offerLastResult will be true if the element 6 was successfully added to the end of the deque, otherwise it will be false. 

        // 13. offerFirst(element)
        boolean offerFirstResult = arr1.offerFirst(-1);
        System.out.println("13. "+offerFirstResult);

        // 14. offerLast(element)
        boolean offerLastResult = arr1.offerLast(6);
        System.out.println("14. "+offerLastResult);


        Deque <Integer> arr3= new ArrayDeque<>();
        // Adding elements
        arr3.add(1);
        arr3.add(2);
        arr3.add(3);
        arr3.add(21);
        arr3.add(22);
        arr3.add(23);
        // 15. peek()
        Integer peekedElement = arr3.peek();
        System.out.println("15. "+peekedElement);

        // 16. peekFirst()
        Integer peekedFirst = arr3.peekFirst();
        System.out.println("16. "+peekedFirst);

        // 17. peekLast()
        Integer peekedLast = arr3.peekLast();
        System.out.println("17. "+peekedLast);
        System.out.println(arr3);

        // 18. poll()
        Integer polledElement = arr3.poll();
        System.out.println("18. "+polledElement);

        // 19. pollFirst()
        Integer polledFirst = arr3.pollFirst();
        System.out.println("19. "+polledFirst);

        // 20. pollLast()
        Integer polledLast = arr3.pollLast();
        System.out.println("20. "+polledLast);
        System.out.println(arr3);

        // 21. pop()
        Integer poppedElement = arr3.pop();
        System.out.println("21. "+poppedElement);
        System.out.println(arr3);

        // 22. push(element)
        arr3.push(7);
        System.out.println("22. "+arr3);


        Deque <Integer> arr4= new ArrayDeque<>();
        // Adding elements
        arr4.add(1);
        arr4.add(2);
        arr4.add(3);
        arr4.add(21);
        arr4.add(22);
        arr4.add(23);


        // 23. remove()
        Integer removedElement = arr4.remove();
        System.out.println("23. "+removedElement);
        System.out.println(arr4);

        // 24. remove(element)
        boolean removeResult = arr4.remove(3);
        System.out.println("24. "+removeResult);
        System.out.println(arr4);


        // 25. removeFirst()
        Integer removedFirst = arr4.removeFirst();
        System.out.println("25. "+removedFirst);
        System.out.println(arr4);

        // 26. removeFirstOccurrence(element)
        boolean removeFirstOccurrenceResult = arr4.removeFirstOccurrence(2);
        System.out.println("26. "+removeFirstOccurrenceResult);
        System.out.println(arr4);

        // 27. removeLast()
        Integer removedLast = arr4.removeLast();
        System.out.println("27. "+removedLast);
        System.out.println(arr4);

        // 28. removeLastOccurrence(element)
        boolean removeLastOccurrenceResult = arr4.removeLastOccurrence(1);
        System.out.println("28. "+removeLastOccurrenceResult);
        System.out.println(arr4);


        Deque <Integer> arr5= new ArrayDeque<>();
        // Adding elements
        arr5.add(1);
        arr5.add(2);
        arr5.add(3);
        arr5.add(21);
        arr5.add(22);
        arr5.add(23);
        arr5.add(26);
        arr5.add(27);
        arr5.add(223);

        Deque <Integer> arr6= new ArrayDeque<>();
        // Adding elements
        arr6.add(1);
        arr6.add(2);
        arr6.add(3);
        arr6.add(2123);

        // 29. removeIf(predicate)
        arr5.removeIf(e -> e > 5);
        System.out.println("29. "+arr5);


        // 31. retainAll(collection)
        arr5.retainAll(arr6);
        System.out.println("31. "+arr5);

        // 32. size()
        int size = arr5.size();
        System.out.println("32. "+size);

        // 33. spliterator()
        arr5.spliterator();
        System.out.println("33. "+arr5);

        // 34. stream()
        System.out.print("34. ");
        arr5.stream().forEach((temp)->System.out.print(temp+" "));
        System.out.println();

        // 35. toArray()
        System.out.print("35. ");
        Object[] array = arr5.toArray();
        for(Object temp:array)
        {
            System.out.print(temp+" ");
        }
        System.out.println();

        // 36. toArray(array)
        System.out.print("36. ");
        Integer[] newArray = arr5.toArray(new Integer[arr5.size()]);
        for(Integer temp:newArray)
        {
            System.out.print(temp+" ");
        }
        System.out.println();


        // 37. toString()
        String str = arr5.toString();
        System.out.println("37."+str);

        // 38. descendingSet()
        System.out.print("38. ");
        Iterator<Integer> d = arr5.descendingIterator();
        while (d.hasNext()) {
            Integer element = d.next();
            System.out.print(element + " ");
        }
        System.out.println();
        


        // 39. forEach(action)
        System.out.print("39. ");
        arr5.forEach(System.out::print);
        System.out.println();

        // 40. hashCode()
        System.out.print("40. ");
        int hashCode = arr5.hashCode();
        System.out.println(hashCode);

        // 41. equals(other)
        System.out.print("41.");
        boolean isEqual = arr1.equals(arr2);
        System.out.println(isEqual);

        // 42. containsAll(collection)
        System.out.print("42.");
        boolean containsAll = arr1.containsAll(arr2);
        System.out.println(containsAll);
        

        // 43. toArray(generator)
        System.out.print("43.");
        Integer[] generatedArray = arr5.toArray(Integer[]::new);
        for(int i=0;i<generatedArray.length;i++)
        {
            System.out.print(generatedArray[i]+" ");            
        }
        System.out.println();

        // 44. iterator()
        System.out.print("44.");
        Iterator<Integer> iterator1 = arr5.iterator();
        iterator1.forEachRemaining((temp)->System.out.print(temp+" "));
        System.out.println();


        // 45. size()
        System.out.print("45.");
        int size1 = arr1.size();
        System.out.println(size1);

        // 46. isEmpty()
        System.out.print("46.");
        boolean isEmpty1 = arr1.isEmpty();
        System.out.println(isEmpty1);

        // 47. iterator()
        System.out.print("47.");
        Iterator<Integer> iterator2 = arr1.iterator();
        iterator2.forEachRemaining((lokesh)->System.out.print(lokesh+" "));
        System.out.println();

        // 48. descendingIterator()
        System.out.print("48.");
        Iterator<Integer> descendingIterator1 = arr5.descendingIterator();
        descendingIterator1.forEachRemaining((ted)->System.out.print(ted+" "));
        System.out.println();

        // 49. removeFirstOccurrence(element)
        System.out.print("49.");
        boolean removeFirstOccurrenceResult1 = arr5.removeFirstOccurrence(2);
        System.out.println(removeFirstOccurrenceResult1);
        System.out.println(arr5);

        // 50. removeLastOccurrence(element)
        System.out.print("50.");
        boolean removeLastOccurrenceResult1 = arr5.removeLastOccurrence(1);
        System.out.println(removeLastOccurrenceResult1);
        System.out.println(arr5); 

    }
}
*/
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//arraydeque

/*
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class oops {
    public static void main(String[] args) {
        ArrayDeque<Integer> arr1 = new ArrayDeque<>();

        // Adding elements
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);

        // 1. add(element)
        arr1.add(4);
        System.out.println("1.Added element: " + arr1);

        // 2. addFirst(element)
        arr1.addFirst(0);
        System.out.println("2.Added element at first position: " + arr1);

        // 3. addLast(element)
        arr1.addLast(5);
        System.out.println("3.Added element at last position: " + arr1);

        // // 4. clear()
        // arr1.clear();
        // System.out.println("Cleared ArrayDeque: " + arr1);

        // 5. clone()
        ArrayDeque<Integer> arr2 = arr1.clone();
        System.out.println("5.Cloned ArrayDeque: " + arr2);

        // 6. contains(element)
        boolean contains = arr1.contains(3);
        System.out.println("6.Does ArrayDeque contain element 3? " + contains);

        // 7. descendingIterator()
        System.out.println("7.Descending Iterator:");
        Iterator<Integer> descendingIterator = arr1.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.print(descendingIterator.next() + " ");
        }
        System.out.println();

        // 8. element()
        System.out.print("8.");
        try {
            Integer firstElement = arr1.element();
            System.out.println("First element: " + firstElement);
        } catch (Exception e) {
            System.out.println("ArrayDeque is empty.");
        }

        // 9. getFirst()
        System.out.print("9.");
        try {
            Integer first = arr1.getFirst();
            System.out.println("First element: " + first);
        } catch (Exception e) {
            System.out.println("ArrayDeque is empty.");
        }

        // 10. getLast()
        System.out.print("10.");
        try {
            Integer last = arr1.getLast();
            System.out.println("Last element: " + last);
        } catch (Exception e) {
            System.out.println("ArrayDeque is empty.");
        }

        // 11. isEmpty()
        System.out.print("11.");
        boolean isEmpty = arr1.isEmpty();
        System.out.println("Is ArrayDeque empty? " + isEmpty);

        // 12. iterator()
        System.out.print("12.Iterator:");
        Iterator<Integer> iterator = arr1.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 13. offer(element)
        System.out.print("13.");
        boolean offerResult = arr1.offer(6);
        System.out.println(offerResult);
        System.out.println("Offered element: " + arr1);

        // 14. offerFirst(element),
        System.out.print("14.");
        boolean offerFirstResult = arr1.offerFirst(-1);
        System.out.println(offerFirstResult);
        System.out.println("Offered element at first position: " + arr1);


        // 15. offerLast(element)
        System.out.print("15.");
        boolean offerLastResult = arr1.offerLast(7);
        System.out.println(offerLastResult);
        System.out.println("Offered element at last position: " + arr1);

        
        // 16. peek()
        System.out.print("16.");
        Integer peekedElement = arr1.peek();
        System.out.println(peekedElement);
        System.out.println("Peeked element: " + arr1);

        // 17. peekFirst()
        System.out.print("17.");
        Integer peekedFirst = arr1.peekFirst();
        System.out.println(peekedFirst);
        System.out.println("Peeked first element: " + peekedFirst);

        // 18. peekLast()
        System.out.print("18,");
        Integer peekedLast = arr1.peekLast();
        System.out.println(peekedLast);
        System.out.println("Peeked last element: " + peekedLast);

        // 19. poll()
        System.out.print("19.");
        Integer polledElement = arr1.poll();
        System.out.println("Polled element: " + polledElement);
        System.out.println(arr1);

        // 20. pollFirst()
        System.out.print("20.");
        Integer polledFirst = arr1.pollFirst();
        System.out.println("Polled first element: " + polledFirst);
        System.out.println(arr1);

        // 21. pollLast()
        System.out.print("21.");
        Integer polledLast = arr1.pollLast();
        System.out.println("Polled last element: " + polledLast);
        System.out.println(arr1);

        // 22. pop()
        System.out.print("22.");
        try {
            Integer poppedElement = arr1.pop();
            System.out.println("Popped element: " + poppedElement);
        } catch (Exception e) {
            System.out.println("ArrayDeque is empty.");
        }
        System.out.println(arr1);

        // 23. push(element)
        System.out.print("23.");
        arr1.push(8);
        System.out.println("Pushed element: " + arr1);

        // 24. remove()
        System.out.print("24.");
        try {
            Integer removedElement = arr1.remove();
            System.out.println("Removed element: " + removedElement);
        } catch (Exception e) {
            System.out.println("ArrayDeque is empty.");
        }

        // 25. remove(element)
        System.out.print("25.");
        boolean removeResult = arr1.remove(3);
        System.out.println(removeResult);
        System.out.println("Removed element 3: " + arr1);

        // 26. removeFirst()
        System.out.print("26.");
        try {
            Integer removedFirst = arr1.removeFirst();
            System.out.println("Removed first element: " + removedFirst);
        } catch (Exception e) {
            System.out.println("ArrayDeque is empty.");
        }
        System.out.println(arr1);

        // 27. removeFirstOccurrence(element)
        System.out.print("27.");
        boolean removeFirstOccurrenceResult = arr1.removeFirstOccurrence(2);
        System.out.println(removeFirstOccurrenceResult);
        System.out.println("Removed first occurrence of element 2: " + arr1);

        // 28. removeLast()
        System.out.print("28.");
        try {
            Integer removedLast = arr1.removeLast();
            System.out.println("Removed last element: " + removedLast);
        } catch (Exception e) {
            System.out.println("ArrayDeque is empty.");
        }
        System.out.println(arr1);


        ArrayDeque<Integer> arr3 = new ArrayDeque<>();

        // Adding elements
        arr3.add(1);
        arr3.add(2);
        arr3.add(3);
        arr3.add(11);
        arr3.add(1);
        arr3.add(222);
        arr3.add(3333);

        ArrayDeque<Integer> arr4 = new ArrayDeque<>();

        // Adding elements
        arr4.add(1);
        arr4.add(222);
        arr4.add(3333);


        // 29. removeLastOccurrence(element)
        System.out.print("29.");
        boolean removeLastOccurrenceResult = arr3.removeLastOccurrence(1);
        System.out.println(removeLastOccurrenceResult);
        System.out.println("Removed last occurrence of element 1: " + arr3);

        // 30. removeIf(predicate)
        System.out.print("30.");
        arr3.removeIf(e -> e <= 5);
        System.out.println("it removes all elements greater than or equal to 5 from the collection: " + arr3);

        // 31. retainAll(collection)
        System.out.print("31.");
        arr3.retainAll(arr4);
        System.out.println("Retained elements present in arr2: " + arr3);


        // 33. size()
        System.out.print("33.");
        int size = arr3.size();
        System.out.println("Size of ArrayDeque: " + size);


        ArrayDeque<Integer> arr5 = new ArrayDeque<>();
        // Adding elements
        arr5.add(1);
        arr5.add(2);
        arr5.add(3);
        arr5.add(11);
        arr5.add(1);
        arr5.add(222);
        arr5.add(3333);

        // 34. spliterator()
        System.out.print("34.");
        arr5.spliterator().forEachRemaining((temp)->System.out.print(temp+"-"));
        System.out.println();

        // 35. stream()
        System.out.print("35.");
        System.out.print("Stream of ArrayDeque: ");
        arr5.stream().forEach(System.out::print);
        System.out.println();

        // 36. toArray()
        System.out.print("36.");
        Object[] array = arr5.toArray();
        for(Object temp:array)
        {
            System.out.print(temp+"_");
        }
        System.out.println();

        // 37. toArray(array)
        System.out.print("37.");
        System.out.println("New array representation of ArrayDeque: " + arr5.toString());

        // 38. toString
        System.out.print("38.");
        String str = arr5.toString();
        System.out.println("String representation of ArrayDeque: " + str);

        // 39. descendingSet()
        System.out.print("39.");
        Integer descendingSet = arr5.descendingIterator().next();
        System.out.println(descendingSet);

        
        // 40. forEach(action)
        System.out.print("40.");
        arr5.forEach(System.out::print);
        System.out.println();

        // 41. hashCode()
        System.out.print("41.");
        int hashCode = arr5.hashCode();
        System.out.println("Hash code of ArrayDeque: " + hashCode);

        // 42. equals(other)
        System.out.print("42.");
        boolean isEqual = arr5.equals(arr4);
        System.out.println("Are the two ArrayDeques equal? " + isEqual);

        // 43. containsAll(collection)
        System.out.print("43.");
        boolean containsAll = arr5.containsAll(arr4);
        System.out.println("Does arr1 contain all elements of arr2? " + containsAll);

        // 44. toArray(generator)
        System.out.print("44.");
        Integer[] generatedArray = arr5.toArray(Integer[]::new);

        for(Integer temp:generatedArray)
        {
            System.out.print(temp+" ");
        }
        System.out.println();

        // 45. iterator()
        System.out.print("45.");
        Iterator<Integer> iterator1 = arr5.iterator();
        System.out.print("Iterator:");
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }
        System.out.println();

        // 46. size()
        System.out.print("46.");
        int size1 = arr5.size();
        System.out.println("Size of ArrayDeque: " + size1);

        // 47. isEmpty()
        System.out.print("47.");
        boolean isEmpty1 = arr5.isEmpty();
        System.out.println("Is ArrayDeque empty? " + isEmpty1);

        // 48. iterator()
        System.out.print("48.");
        System.out.print("Iterator:");
        Iterator<Integer> iterator2 = arr5.iterator();
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + " ");
        }
        System.out.println();

        // 49. descendingIterator()
        System.out.print("49.");
        System.out.print("Descending Iterator:");
        Iterator<Integer> descendingIterator1 = arr5.descendingIterator();
        while (descendingIterator1.hasNext()) {
            System.out.print(descendingIterator1.next() + " ");
        }
        System.out.println();

        // 50. removeFirstOccurrence(element)
        System.out.print("50.");
        boolean removeFirstOccurrenceResult1 = arr5.removeFirstOccurrence(2);
        System.out.println("Removed first occurrence of element 2: " + arr5);

        // 51. removeLastOccurrence(element)
        System.out.print("51.");
        boolean removeLastOccurrenceResult1 = arr5.removeLastOccurrence(333);
        System.out.println("Removed last occurrence of element 1: " + arr5);


        // 32. removeAll(collection)
        System.out.print("52.");
        arr5.removeAll(arr4);
        System.out.println("Removed all elements of arr2: " + arr5);
    }
}
*/
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//queue
/*
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.AbstractList;
import java.util.Iterator;

public class oops {
    public static void main(String[] args) {
        Queue<Integer> arr1 = new LinkedList<>();

        // Adding elements
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);

        // 1. add(element)
        System.out.print("1.");
        arr1.add(4);
        System.out.println("Added element: " + arr1);

        // 2. addAll(collection)
        System.out.print("2.");
        LinkedList<Integer> collection = new LinkedList<>();
        collection.add(2);
        collection.add(3);
        arr1.addAll(collection);
        System.out.println("Added collection: " + arr1);

        // 3. clear()
        System.out.print("3.");
        // arr1.clear();
        System.out.println("Cleared LinkedList: " + arr1);

        // 4. contains(element)
        System.out.print("4.");
        boolean contains = arr1.contains(3);
        System.out.println("Does LinkedList contain element 3? " + contains);

        // 5. element()
        System.out.print("5.");
        try {
            Integer firstElement = arr1.element();
            System.out.println("First element: " + firstElement);
        } catch (Exception e) {
            System.out.println("LinkedList is empty.");
        }

        // 6. forEach(action)
        // Note: null action here to demonstrate method signature, typically an action is provided
        System.out.print("6.");
        arr1.forEach((temp)-> System.out.print(temp+"*"));
        System.out.println();

        // 7. isEmpty()
        System.out.print("7.");
        boolean isEmpty = arr1.isEmpty();
        System.out.println("Is LinkedList empty? " + isEmpty);

        // 8. iterator()
        System.out.print("8.");
        System.out.print("Iterator:");
        Iterator<Integer> iterator = arr1.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 9. offer(element)
        System.out.print("9.");
        boolean offerResult = arr1.offer(7);
        System.out.print(offerResult+" ");
        System.out.println("Offered element: " + arr1);

        // 10. peek()
        System.out.print("10.");
        Integer peekedElement = arr1.peek();
        System.out.println("Peeked element: " + peekedElement);
        System.out.println(arr1);

        // 11. poll()
        System.out.print("11.");
        Integer polledElement = arr1.poll();
        System.out.println("Polled element: " + polledElement);
        System.out.println(arr1);

        // 12. remove()
        System.out.print("12.");
        try {
            Integer removedElement = arr1.remove();
            System.out.println("Removed element: " + removedElement);
        } catch (Exception e) {
            System.out.println("LinkedList is empty.");
        }
        System.out.println(arr1);

        // 13. remove(element)
        System.out.print("13.");
        boolean removeResult = arr1.remove(3);
        System.out.println("Removed element 3: " + arr1);
        System.out.println(removeResult);

        // 14. size()
        System.out.print("14.");
        int size = arr1.size();
        System.out.println("Size of LinkedList: " + size);

        // 15. toArray()
        System.out.print("12.");
        Object[] array = arr1.toArray();
        for(Object temp:array)
        {
            System.out.print(temp+"_");
        }
        System.out.println();

        // 16. toString()
        System.out.print("16.");
        String str = arr1.toString();
        System.out.println("String representation of LinkedList: " + str);

        // 17. getFirst()
        // is not work in getfirst
        System.out.print("17.");
        try {
            Integer first = ((LinkedList<Integer>) arr1).getFirst();
            System.out.println("First element: " + first);
        } catch (Exception e) {
            System.out.println("LinkedList is empty.");
        }
        System.out.println(arr1);

        // 18. getLast()
        // is not work in getLast
        System.out.print("18.");
        try {
            Integer last = ((LinkedList<Integer>) arr1).getLast();
            System.out.println("Last element: " + last);
        } catch (Exception e) {
            System.out.println("LinkedList is empty.");
        }
        System.out.println(arr1);

        // 19. removeFirst()
        //not works in queue
        System.out.print("19.");
        try {
            Integer removedFirst = ((LinkedList<Integer>) arr1).removeFirst();
            System.out.println("Removed first element: " + removedFirst);
        } catch (Exception e) {
            System.out.println("LinkedList is empty.");
        }
        System.out.println(arr1);

        // 20. removeLast()
        System.out.print("20.");
        try {
            Integer removedLast = ((LinkedList<Integer>) arr1).removeLast();
            System.out.println("Removed last element: " + removedLast);
        } catch (Exception e) {
            System.out.println("LinkedList is empty.");
        }
        System.out.println(arr1);

        // 21. addFirst(element)
        //not works in queue
        System.out.print("21.");
        ((LinkedList<Integer>) arr1).addFirst(0);
        System.out.println("Added element at first position: " + arr1);

        // 22. addLast(element)
        //not works in queue
        System.out.print("21.");
        ((LinkedList<Integer>) arr1).addLast(8);
        System.out.println("Added element at last position: " + arr1);

        // 23. descendingIterator()
        //not works in queue
        System.out.print("23.");
        System.out.print("Descending Iterator:");
        Iterator<Integer> descendingIterator = ((LinkedList<Integer>) arr1).descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.print(descendingIterator.next() + "-");
        }
        System.out.println();

        // 24. get(index)
        //not works in queue
        System.out.print("24.");
        try {
            Integer elementAtIndex = ((LinkedList<Integer>) arr1).get(2);
            System.out.println("Element at index 2: " + elementAtIndex);
        } catch (Exception e) {
            System.out.println("Index out of bounds.");
        }
        System.out.println(arr1);

        // 25. indexOf(element)
        //not works in queue
        System.out.print("25.");
        int indexOfElement = ((LinkedList<Integer>) arr1).indexOf(8);
        System.out.println("Index of element 2: " + indexOfElement);
        System.out.println(arr1);

        // 26. lastIndexOf(element)
        //not works in queue
        System.out.print("26.");
        int lastIndexOfElement = ((LinkedList<Integer>) arr1).lastIndexOf(2);
        System.out.println("Last index of element 2: " + lastIndexOfElement);
        System.out.println(arr1);

        // 27. listIterator(index)
        //not works in queue
        System.out.print("27");
        Iterator<Integer> listIterator = ((LinkedList<Integer>) arr1).listIterator(1);
        System.out.println("List Iterator starting from index 1:");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

        // 28. offerFirst(element)
        System.out.print("28.");
        boolean offerFirstResult = arr1.offer(-1);
        System.out.println(offerFirstResult);
        System.out.println("Offered element at first position: " + arr1);
       

        // 29. offerLast(element)
        System.out.print("29.");
        boolean offerLastResult = arr1.offer(6);
        System.out.println("Offered element at last position: " + offerLastResult);
        System.out.println(arr1);

        // 30. peekFirst()
        //not works in queue
        System.out.print("30.");
        Integer peekedFirst = ((LinkedList<Integer>) arr1).peekFirst();
        System.out.println("Peeked first element: " + peekedFirst);
        System.out.println(arr1);



        Queue<Integer> arr2 = new LinkedList<>();
        // Adding elements
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr2.add(4);
        arr2.add(5);
        arr2.add(6);
        arr2.add(7);
        arr2.add(8);
        arr2.add(9);

        // 31. peekLast()
         //not works in queue
        System.out.print("31.");       
        Integer peekedLast = ((LinkedList<Integer>) arr2).peekLast();
        System.out.println("Peeked last element: " + peekedLast);
        System.out.println(arr2);

        // 32. pollFirst()
        //not works in queue
        System.out.print("32.");
        Integer polledFirst = ((LinkedList<Integer>) arr2).pollFirst();
        System.out.println("Polled first element: " + polledFirst);
        System.out.println(arr2);

        // 33. pollLast()
        //not works in queue
        System.out.print("33.");
        Integer polledLast = ((LinkedList<Integer>) arr2).pollLast();
        System.out.println("Polled last element: " + polledLast);
        System.out.println(arr2);

        // 34. push(element)
        //not works in queue
        System.out.print("34.");
        ((LinkedList<Integer>) arr2).push(9);
        System.out.println("Pushed element: " + arr2);

        // 35. removeFirstOccurrence(element)
        //not works in queue
        System.out.print("35.");
        boolean removeFirstOccurrenceResult = ((LinkedList<Integer>) arr2).removeFirstOccurrence(2);
        System.out.println("Removed first occurrence of element 2: " + removeFirstOccurrenceResult);
        System.out.println(arr2);

        // 36. removeLastOccurrence(element)
        //not works in queue
        System.out.print("36.");
        boolean removeLastOccurrenceResult = ((LinkedList<Integer>) arr2).removeLastOccurrence(3);
        System.out.println("Removed last occurrence of element 3: " + removeLastOccurrenceResult);
        System.out.println(arr2);

        // 37. removeFirst()
        //not works in queue
        System.out.print("37.");
        Integer removedFirst = ((LinkedList<Integer>) arr2).removeFirst();
        System.out.println("Removed first element: " + removedFirst);
        System.out.println(arr2);

        // 38. removeLast()
        //not works in queue
        System.out.print("38.");
        Integer removedLast = ((LinkedList<Integer>) arr2).removeLast();
        System.out.println("Removed last element: " + removedLast);
        System.out.println(arr2);

        // 39. removeIf(predicate)
        System.out.print("39.");
        arr1.removeIf(e -> e < 5);
        System.out.println("Removed elements less than 5: " + arr2);

        // 40. replaceAll(unaryOperator)
        //not works in queue
        System.out.print("40.");
        ((List<Integer>) arr2).replaceAll(e -> e * 2);
        System.out.println("Doubled all elements: " + arr2);
        

        // 41. size()
        System.out.print("41.");
        int sizeAfterOperations = arr2.size();
        System.out.println("Size after operations: " + sizeAfterOperations);

        // 42. sort(comparator)
        //not works in queue

        // 43. spliterator()
        System.out.print("43.");
        arr2.spliterator().forEachRemaining((temp)->System.out.println(temp+" "));

        // 44. subList(fromIndex, toIndex)
        //not works in queue
        System.out.print("44.");
        LinkedList<Integer> subList = new LinkedList<>(((AbstractList<Integer>) arr2).subList(1, 3));
        System.out.println("Sublist from index 1 to 3: " + subList);

        // 45. toArray()
        System.out.print("45.");
        Object[] toArray = arr2.toArray();
        System.out.println("Array representation: " + toArray.toString());

        // 46. toArray(array)
        System.out.print("46.");
        Integer[] toArrayWithArgument = arr2.toArray(new Integer[arr2.size()]);
        for(Integer temp:toArrayWithArgument)
        {
            System.out.print(temp+"-");
        }
        System.out.println();

        // 47. forEach(consumer)
        System.out.print("47.");
        arr2.forEach(System.out::print);
        System.out.println();

        // 48. hashCode()
        System.out.print("48.");
        int hashCode = arr2.hashCode();
        System.out.println("Hash code of LinkedList: " + hashCode);

        // 49. equals(other)
        System.out.print("49.");
        boolean isEqual = arr2.equals(subList);
        System.out.println("Is LinkedList equal to sublist? " + isEqual);

        // 51. iterator()
        //not works in queue
        System.out.print("51.");
        Iterator<Integer> iterator2 = arr1.iterator();
        System.out.println("Iterator:");
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + " ");
        }
        System.out.println();

        // 52. descendingIterator()
        //not works in queue
        System.out.print("52.");
        Iterator<Integer> descendingIterator2 = ((LinkedList<Integer>) arr1).descendingIterator();
        System.out.println("Descending Iterator:");
        while (descendingIterator2.hasNext()) {
            System.out.print(descendingIterator2.next() + " ");
        }
    }
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//PriorityQueue:
/* 
import java.util.PriorityQueue;
import java.util.Iterator;

public class oops {
    public static void main(String[] args) {
        PriorityQueue<Integer> arr1 = new PriorityQueue<>();
        arr1.add(1);
        arr1.add(12);
        arr1.add(11);
        arr1.add(22);
        arr1.add(122);
        arr1.add(21);
        arr1.add(32);
        arr1.add(142);
        System.out.println("* "+arr1);

        System.out.print("* ");
        while (!arr1.isEmpty()) {
            System.out.print(arr1.poll() + " ");
        }
        System.out.println();

        PriorityQueue<Integer> arr2 = new PriorityQueue<>();
        arr2.add(121);
        arr2.add(360);
        arr2.add(1);
        arr2.add(12);
        arr2.add(11);
        arr2.add(12);
        arr2.add(11);
        arr2.add(22);

        System.out.println("* "+arr2); // because of dulicate number so can't sort

        System.out.print("* ");
        while (!arr2.isEmpty()) {
            System.out.print(arr2.poll() + " ");
        }
        System.out.println();

        

        PriorityQueue<Integer> arr3 = new PriorityQueue<>();
        arr3.add(121);
        arr3.add(360);
        arr3.add(1);
        arr3.add(12);
        arr3.add(11);
        arr3.add(12);
        arr3.add(11);
        arr3.add(22);
        // 2. addAll(collection)
        PriorityQueue<Integer> collection = new PriorityQueue<>();
        collection.add(5);
        collection.add(6);
        arr3.addAll(collection);
        System.out.println("2. Added collection: " + arr3);
        while (!arr3.isEmpty()) {
            System.out.print(arr3.poll() + " ");
        }
        System.out.println();

        // // 3. clear()
        // arr1.clear();
        // System.out.println("3. Cleared PriorityQueue: " + arr1);

        PriorityQueue<Integer> arr4 = new PriorityQueue<>();
        arr4.add(121);
        arr4.add(360);
        arr4.add(1);
        arr4.add(12);
        arr4.add(11);
        arr4.add(12);
        arr4.add(11);
        arr4.add(22);
        // 4. contains(element)
        boolean contains = arr4.contains(11);
        System.out.println("4. Does PriorityQueue contain element 3? " + contains);

        // // 5. isEmpty()
        // boolean isEmpty = arr1.isEmpty();
        // System.out.println("5. Is PriorityQueue empty? " + isEmpty);

        // // 6. iterator()
        // Iterator<Integer> iterator = arr1.iterator();
        // System.out.print("6. Iterator: ");
        // while (iterator.hasNext()) {
        //     System.out.print(iterator.next() + " ");
        // }
        // System.out.println();

        // // 7. offer(element)
        // boolean offerResult = arr1.offer(7);
        // System.out.println("7. Offered element: " + arr1);

        // // 8. peek()
        // Integer peekedElement = arr1.peek();
        // System.out.println("8. Peeked element: " + peekedElement);

        // // 9. poll()
        // Integer polledElement = arr1.poll();
        // System.out.println("9. Polled element: " + polledElement);

        // // 10. remove(element)
        // boolean removeResult = arr1.remove(3);
        // System.out.println("10. Removed element 3: " + arr1);

        // // 11. size()
        // int size = arr1.size();
        // System.out.println("11. Size of PriorityQueue: " + size);

        // // 12. toArray()
        // Object[] array = arr1.toArray();
        // for(Object temp:array)
        // {
        //     System.out.println(temp+" ");
        // }

        // // 13. toString()
        // String str = arr1.toString();
        // System.out.println("13. String representation of PriorityQueue: " + str);

        // // 14. element()
        // try {
        //     Integer firstElement = arr1.element();
        //     System.out.println("14. First element: " + firstElement);
        // } catch (Exception e) {
        //     System.out.println("14. PriorityQueue is empty.");
        // }

        // // 15. remove()
        // try {
        //     Integer removedElement = arr1.remove();
        //     System.out.println("15. Removed element: " + removedElement);
        // } catch (Exception e) {
        //     System.out.println("15. PriorityQueue is empty.");
        // }

        // // 16. peek()
        // peekedElement = arr1.peek();
        // System.out.println("16. Peeked element: " + peekedElement);

        // // 17. poll()
        // polledElement = arr1.poll();
        // System.out.println("17. Polled element: " + polledElement);

        // // 18. toArray(T[])
        // Integer[] arr = arr1.toArray(new Integer[arr1.size()]);
        // System.out.println("18. Converted array: " + java.util.Arrays.toString(arr));

        // // 19. clear()
        // arr1.clear();
        // System.out.println("19. Cleared PriorityQueue: " + arr1);

        // // 20. addAll(collection)
        // arr1.addAll(collection);
        // System.out.println("20. Added collection: " + arr1);

        // // 21. containsAll(collection)
        // boolean containsAll = arr1.containsAll(collection);
        // System.out.println("21. Does PriorityQueue contain all elements of collection? " + containsAll);

        // // 22. removeAll(collection)
        // boolean removeAllResult = arr1.removeAll(collection);
        // System.out.println("22. Removed all elements of collection: " + arr1);

        // // 23. retainAll(collection)
        // arr1.add(1);
        // arr1.add(2);
        // boolean retainAllResult = arr1.retainAll(collection);
        // System.out.println("23. Retained all elements of collection: " + arr1);

        // // 24. removeIf(predicate)
        // boolean removeIfResult = arr1.removeIf(e -> e < 5);
        // System.out.println("24. Removed elements less than 5: " + arr1);

        // // 25. forEach(action)
        // // Note: null action here to demonstrate method signature, typically an action is provided
        // arr1.forEach(null);
        // System.out.println("25. ForEach loop completed.");

        // // 26. iterator()
        // iterator = arr1.iterator();
        // System.out.print("26. Iterator: ");
        // while (iterator.hasNext()) {
        //     System.out.print(iterator.next() + " ");
        // }
        // System.out.println();

        // // 27. offer(element)
        // offerResult = arr1.offer(7);
        // System.out.println("27. Offered element: " + arr1);

        // // 28. peek()
        // peekedElement = arr1.peek();
        // System.out.println("28. Peeked element: " + peekedElement);

        // // 29. poll()
        // polledElement = arr1.poll();
        // System.out.println("29. Polled element: " + polledElement);

        // // 30. remove(element)
        // removeResult = arr1.remove(3);
        // System.out.println("30. Removed element 3: " + arr1);

    }
}

*/
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// set
/*
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class oops {
    public static void main(String[] args) {
        Set<Integer> arr = new HashSet<>();
        arr.add(12);
        arr.add(12);
        arr.add(231);
        arr.add(2);
        arr.add(0);
        ś

        System.out.println("1."+arr);
        System.err.println("2."+arr.size());
        System.out.println("3."+arr.contains(6));
        System.err.println("4."+arr.isEmpty());

        Set<Integer> arr2 = new HashSet<>();
        arr2.add(12);
        arr2.add(12);
        arr2.add(234);
        arr2.add(2);
        arr2.add(0);

        arr.addAll(arr2);
        System.out.println("5."+arr);

        System.out.println("6."+arr.containsAll(arr2));

        System.out.println("7."+arr.equals(arr2));

        arr.forEach((temp)->System.out.print(temp+"-"));
        System.out.println();

        System.out.println("8."+arr.getClass());
        System.out.println("9."+arr.hashCode());
    
        System.out.println("10."+arr.remove(2));
        System.out.println(arr);

        
        arr.retainAll(arr2);
        System.out.println("11."+arr);


        String str=arr.toString();
        System.out.println("12" + str);

        
        Object[] array = arr.toArray();
        for(Object temp:array)
        {
            System.out.print(temp+" ");
        }
        System.out.println();

        System.out.println("13. Stream of elements: ");
        arr.stream().forEach(System.out::print);
        System.out.println();

        System.out.println("14. Spliterator: ");
        arr.spliterator().forEachRemaining(System.out::print);
        System.out.println();

        // 5. parallelStream()
        System.out.println("15. Parallel stream: ");
        arr.parallelStream().forEach(System.out::print);
        System.out.println();

        Iterator<Integer> iterator = arr.iterator();
        System.out.print("16. Iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();


        Set<Integer> arr3 = new HashSet<>();
        arr3.add(12);
        arr3.add(1221);
        arr3.add(234);
        arr3.add(2);
        arr3.add(0);
        Set<Integer> arr4 = new HashSet<>();
        arr4.add(12);
        arr4.add(12);
        arr4.add(234);
        arr4.add(2);
        arr4.add(0);

        arr3.removeIf(r->r%2==0);
        System.out.println(arr3);

    }
}
*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//HashSet
/* 
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class oops {

    public static void main(String[] args) {
        HashSet<Integer> arr1=new HashSet<>();
        arr1.add(9);
        arr1.add(21);
        arr1.add(8);
        arr1.add(7);
        arr1.add(21);
        arr1.add(2);
        arr1.add(21);
        arr1.add(6);
        arr1.add(2);
        arr1.add(5);
        arr1.add(3);
        arr1.add(4);
        arr1.add(2);
        arr1.add(2);

        HashSet<Integer> arr2=new HashSet<>();
        arr2.add(99);
        arr2.add(210);
        arr2.add(80);
        arr2.add(79);
        arr2.add(214);


        System.out.println("1."+arr1);
        System.out.println("2."+arr1.contains(1));

        arr1.addAll(arr2);
        System.out.println("4."+arr1);

        System.out.println("5."+arr1.containsAll(arr2));

        System.out.println("6."+arr1.equals(arr2));

        System.out.print("7.");
        Set<String> clonedSet = (HashSet<String>) arr1.clone();
        System.out.println(clonedSet);


        System.out.print("8.");
        arr1.forEach((temp)->System.out.print(temp+" "));
        System.out.println();

        System.out.println("9."+arr1.hashCode());

        System.out.println("10."+arr1.getClass());

        
        arr1.remove(214);
        System.out.println("11."+arr1);

        arr1.removeIf(num->num%2==1);
        System.out.println("12."+arr1);



        HashSet<Integer> arr3=new HashSet<>();
        arr3.add(9);
        arr3.add(6);
        arr3.add(2);
        arr3.add(5);
        arr3.add(3);
        arr3.add(4);
        arr3.add(2);
        arr3.add(2);


        arr1.retainAll(arr2);
        System.out.println("13."+arr1);

        arr1.removeAll(arr3);
        System.out.println("14."+arr1);


        HashSet<Integer> arr4=new HashSet<>();
        arr4.add(9);
        arr4.add(6);
        arr4.add(2);
        arr4.add(5);
        arr4.add(3);
        arr4.add(4);
        arr4.add(2);
        arr4.add(2);


        System.out.print("15. Parallel stream: ");
        arr4.parallelStream().forEach(System.out::print);
        System.out.println();

        System.out.print("16. Iterator: ");
        Iterator<Integer> iterator = arr4.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.print("17. Stream of elements: ");
        arr4.stream().forEach(System.out::print);
        System.out.println();

        System.out.print("18. Spliterator: ");
        arr4.spliterator().forEachRemaining(System.out::print);
        System.out.println();

        String str=arr4.toString();
        System.out.println("19."+str);

        System.out.print("20.");
        Object[] num=arr4.toArray();
        for(Object temp:num)
        {
            System.out.print(temp+" ");
        }

        }
    }


*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//LinkedSet
/* 
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Iterator;

public class oops {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedset = new LinkedHashSet<>();

        // Adding elements
        linkedset.add("apple");
        linkedset.add("banana");
        linkedset.add("cherry");


        // 1. add(element)
        linkedset.add("date");
        System.out.println("1. Added element: " + linkedset);

        // // 2. clear()
        // linkedset.clear();
        // System.out.println("2. Cleared LinkedHashSet: " + linkedset);

        // 3. contains(element)
        boolean contains = linkedset.contains("apple");
        System.out.println("3. Does LinkedHashSet contain 'apple'? " + contains);

        // 4. isEmpty()
        boolean isEmpty = linkedset.isEmpty();
        System.out.println("4. Is LinkedHashSet empty? " + isEmpty);

        // 5. iterator()
        Iterator<String> iterator = linkedset.iterator();
        System.out.print("5. Iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 6. remove(element)
        boolean removeResult = linkedset.remove("banana");
        System.out.println("6. Removed 'banana': " + linkedset);

        // 7. size()
        int size = linkedset.size();
        System.out.println("7. Size of LinkedHashSet: " + size);

        // 8. toArray()
        System.out.print("8.");
        Object[] array = linkedset.toArray();
        for(Object temp:array)
        {
            System.out.print(temp+" ");
        }
        System.out.println();

        // 9. toString()
        String str = linkedset.toString();
        System.out.println("9. String representation of LinkedHashSet: " + str);

        // 10. equals(anotherSet)
        Set<String> anotherSet = new LinkedHashSet<>(linkedset);
        boolean equals = linkedset.equals(anotherSet);
        System.out.println("10. Is LinkedHashSet equal to anotherSet? " + equals);

        // 11. hashCode()
        int hashCode = linkedset.hashCode();
        System.out.println("11. Hash code of LinkedHashSet: " + hashCode);

        // 12. containsAll(collection)
        Set<String> collection = new LinkedHashSet<>();
        collection.add("apple");
        collection.add("date");
        boolean containsAll = linkedset.containsAll(collection);
        System.out.println("12. Does LinkedHashSet contain all elements of collection? " + containsAll);

        // 13. removeAll(collection)
        boolean removeAllResult = linkedset.removeAll(collection);
        System.out.println("13. Removed all elements of collection: " + linkedset);

        // 14. retainAll(collection)
        linkedset.add("apple");
        linkedset.add("banana");
        linkedset.add("cherry");
        boolean retainAllResult = linkedset.retainAll(collection);
        System.out.println("14. Retained all elements of collection: " + linkedset);

        // 15. removeIf(predicate)
        boolean removeIfResult = linkedset.removeIf(e -> e.startsWith("a"));
        System.out.println("15. Removed elements starting with 'a': " + linkedset);

        // 16. forEach(action)
        // Note: null action here to demonstrate method signature, typically an action is provided
        linkedset.forEach(temp->System.out.print(temp+" "));
        System.out.println("16. ForEach loop completed.");

        // 17. stream()
        System.out.println("17. Stream of elements: ");
        linkedset.stream().forEach(System.out::println);

        // 18. spliterator()
        System.out.println("18. Spliterator: ");
        linkedset.spliterator().forEachRemaining(System.out::println);

        // 19. addAll(collection)
        Set<String> newCollection = new LinkedHashSet<>();
        newCollection.add("grape");
        newCollection.add("kiwi");
        linkedset.addAll(newCollection);
        System.out.println("19. Added collection: " + linkedset);

        // 20. removeAll(collection)
        boolean removeAllResult2 = linkedset.removeAll(newCollection);
        System.out.println("20. Removed all elements of collection: " + linkedset);

        // 21. retainAll(collection)
        linkedset.add("apple");
        linkedset.add("banana");
        linkedset.add("cherry");
        boolean retainAllResult2 = linkedset.retainAll(newCollection);
        System.out.println("21. Retained all elements of collection: " + linkedset);

        // 22. containsAll(collection)
        boolean containsAll2 = linkedset.containsAll(newCollection);
        System.out.println("22. Contains all elements of collection? " + containsAll2);



        // 24. addIfAbsent(element)
        boolean addIfAbsentResult = linkedset.add("apple");
        System.out.println("24. Added element if absent: " + addIfAbsentResult);

        // 25. removeIf(predicate)
        boolean removeIfPredicateResult = linkedset.removeIf(e -> e.length() > 5);
        System.out.println("25. Removed elements with length > 5: " + linkedset);

        // // 26. replaceAll(operator)
        // ((Object) linkedset).replaceAll(e -> e.toUpperCase());
        // System.out.println("26. Replaced all elements with uppercase: " + linkedset);

        // // 27. forEachOrdered(action)
        // System.out.println("27. ForEachOrdered: ");
        // linkedset.forEachOrdered(System.out::println);

        // 28. toArray(generator)
        String[] newArray2 = linkedset.toArray(new String[linkedset.size()]);
        for(String temp:newArray2)
        {
            System.out.print(temp+" ");
        }
        System.out.println();

        // 29. parallelStream()
        System.out.println("29. Parallel stream: ");
        linkedset.parallelStream().forEach(System.out::println);

        // 30. hashCode()
        int hashCode2 = linkedset.hashCode();
        System.out.println("30. Hash code of LinkedHashSet: " + hashCode2);

        // Add more methods here as needed...

    }
}

*/
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// sortedset:
/* 
import java.util.Arrays;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class oops {
    public static void main(String[] args) {
        
        SortedSet<Integer> arr1 = new TreeSet<Integer>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        System.out.println("1.add: "+arr1);

        SortedSet<Integer> arr2 = new TreeSet<Integer>();
        arr2.add(22);
        arr2.add(33);
        arr2.add(44);
        arr2.add(11);


        arr1.addAll(arr2);
        System.out.println("2.addAll: "+arr1);

       System.out.println("3.contains: "+ arr1.contains(2));

       System.out.println("4.contains: "+arr1.containsAll(arr2));
      
       System.out.println("5.equals: "+arr1.equals(arr2));

       System.out.println(arr1);
       System.out.println("6.get first: "+arr1.first());
       System.out.println(arr1);

       System.out.println("7.get last: "+arr1.last());
       System.out.println(arr1);

       System.out.print("8.forEach: ");
       arr1.forEach((temp)->System.out.print(temp+"-"));
       System.out.println();

       System.out.println("9.getclass: "+arr1.getClass());
       System.out.println("10.gethashcode:"+arr1.hashCode());
      
       SortedSet<Integer> subset = arr1.headSet(22);
       System.out.println("11.Subset with elements less than 40: " + subset);

       boolean a=arr1.add(1);
       System.out.println("12.added or not 😊:"+a);

       System.out.println(arr1);
       arr1.remove(1);
       System.out.println("13.remove "+arr1);
       arr1.remove((Integer)3);
       System.out.println("14.remove "+arr1);

       SortedSet<Integer> arr3 = new TreeSet<Integer>();
       arr3.add(22);
       arr3.add(33);
       arr3.add(44);
       arr3.add(11);
       arr3.add(227);
       arr3.add(34);
       arr3.add(45);
       arr3.add(11);


       arr3.retainAll(arr1);
       System.out.println("15.retainAll: "+arr3);
       
       arr3.removeIf(temp->temp%2==0);
       System.out.println("16.removeif: "+arr3);

       System.out.println("17.size: "+arr3.size());

       System.out.println("17.isEmpty: "+arr3.isEmpty());


       System.out.println(arr1);
       SortedSet<Integer> t = arr1.subSet(22, 50);
       System.out.println("18. Subset of the set: " + t);


        boolean containsAll = arr1.containsAll(Arrays.asList(20, 30,22));
        System.out.println("19. Does set contain all elements from collection? " + containsAll);

        arr1.removeAll(Arrays.asList(20, 30,22));
        System.out.println("20. Set after removing elements present in collection: " + arr1);

        // 17. Getting subset with elements less than or equal to a given element
        SortedSet<Integer> headSet = arr1.headSet(40);
        System.out.println("21. Subset with elements less than or equal to 40: " + headSet);

        // 18. Getting subset with elements greater than a given element
        SortedSet<Integer> tailSet = arr1.tailSet(40);
        System.out.println("22. Subset with elements greater than or equal to 40: " + tailSet);

        // 21. Getting the first element less than a given element
        Integer lower = ((TreeSet<Integer>) arr1).lower(40);
        System.out.println("21. First element less than 40: " + lower);

        // 22. Getting the first element greater than a given element
        Integer higher = ((TreeSet<Integer>) arr1).higher(40);
        System.out.println("22. First element greater than 40: " + higher);

        // 23. Removing the first element
        Integer first = ((TreeSet<Integer>) arr1).pollFirst();
        System.out.println("23. Removed first element: " + first);

        // 24. Removing the last element
        Integer last = ((TreeSet<Integer>) arr1).pollLast();
        System.out.println("24. Removed last element: " + last);
       
        Integer[] arr = arr1.toArray(new Integer[0]);
        System.out.println("23. Set converted to array: " + Arrays.toString(arr));

        // 20. Iterating through the set
        System.out.print("24. Set elements: ");
        for (Integer num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();

         // 25. Checking equality with another set
         SortedSet<Integer> anotherSet = new TreeSet<>(Arrays.asList(30, 40, 50));
         boolean isEqual = arr1.equals(anotherSet);
         System.out.println("25. Is set equal to another set? " + isEqual);
 
         // 26. Getting the subset between two elements
         SortedSet<Integer> subSet = arr1.subSet(20, 40);
         System.out.println("26. Subset between 20 (inclusive) and 40 (inclusive): " + subSet);

         SortedSet<String> s = new TreeSet<>(); 
  
         // Adding Element to SortedSet 
         s.add("Geeks"); 
         s.add("For"); 
         s.add("Geeks"); 
         s.add("Code"); 
         s.add("It"); 
   
         // Returning the set with elements 
         // ranging between the passed value 
         System.out.print("27.Elements between C and G in set is : "
                          + s.subSet("C", "G")); 

        System.out.println();                 
        arr3.removeAll(arr1);
        System.out.println("17.removeAll: "+arr3);
        

    }
}


*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//NavigableSet:
/* 
import java.util.Arrays;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class oops {
    public static void main(String[] args) {
          NavigableSet<Integer> arr1 = new TreeSet<>();
          arr1.add(1);
          arr1.add(11);
          arr1.add(1);
          arr1.add(2);
          arr1.add(3);
          arr1.add(4);
          arr1.add(5);
          arr1.add(6);
          arr1.add(77);
          System.out.println("1.add"+arr1);

          NavigableSet<Integer> arr2 = new TreeSet<>();
          arr2.add(1);
          arr2.add(11);
          arr2.add(1);
          arr2.addAll(arr1);
          System.out.println("2.addall:"+arr2);

        // 2. Getting size
        int size = arr1.size();
        System.out.println("3. Size of the set: " + size);

        // 3. Checking if empty
        boolean isEmpty = arr1.isEmpty();
        System.out.println("4. Is set empty? " + isEmpty);

        // 4. Checking if contains an element
        boolean contains = arr1.contains(20);
        System.out.println("5. Does set contain 20? " + contains);

        int first = arr1.first();
        System.out.println("6. First element of the set: " + first);

        // 6. Getting last element
        int last = arr1.last();
        System.out.println("7. Last element of the set: " + last);

        // 7. Removing element
        boolean removed1 = arr1.remove(20);
        System.out.println("8. Set after removing element 20: " + arr1);

        boolean removed2 = arr1.remove((Integer)2);
        System.out.println("9. Set after removing element 20: " + arr1);

        int floor = arr1.floor(55);
        System.out.println("10. Floor of 55: " + floor);

        // 11. Getting the ceiling of a given element
        int ceiling = arr1.ceiling(55);
        System.out.println("11. Ceiling of 55: " + ceiling);

        SortedSet<Integer> subSet = arr1.subSet(4, false, 77, true);
        System.out.println("12. Subset of elements between 40 and 60 (inclusive): " + subSet);

        Iterator<Integer> descendingIterator = arr1.descendingIterator();
        System.out.print("13. Descending elements of the set: ");
        while (descendingIterator.hasNext()) {
            System.out.print(descendingIterator.next() + " ");
        }
        System.out.println();

        NavigableSet<Integer> descendingSet = arr1.descendingSet();
        System.out.println("14. Descending set: " + descendingSet);


        // 16. Getting the highest element less than the given element
        int lower = arr1.lower(10);
        System.out.println("15. Highest element less than 55: " + lower);

        // 17. Getting the lowest element greater than the given element
        int higher = arr1.higher(10);
        System.out.println("16. Lowest element greater than 55: " + higher);

        // 21. Getting the subset of elements less than a given element
        SortedSet<Integer> headSet = arr1.headSet(5);
        System.out.println("17. Subset of elements less than 55: " + headSet);

        // 22. Getting the subset of elements greater than or equal to a given element
        SortedSet<Integer> tailSet = arr1.tailSet(5,false);
        System.out.println("18. Subset of elements greater than or equal to 55: " + tailSet);

        // 27. Getting the descending iterator for a subset
        Iterator<Integer> descendingSubsetIterator = arr1.headSet(55, true).descendingIterator();
        System.out.print("19. Descending elements of subset less than or equal to 55: ");
        while (descendingSubsetIterator.hasNext()) {
            System.out.print(descendingSubsetIterator.next() + " ");
        }
        System.out.println();


        System.out.println("20.pollFirst(): " + arr1.pollFirst()); 
        System.out.println("21.Navigable Set:  " + arr1); 
  
        System.out.println("22.pollLast(): " + arr1.pollLast()); 
        System.out.println("23.Navigable Set:  " + arr1); 

        // 8. Checking if the set is changed after retaining elements from another collection
        arr1.retainAll(Arrays.asList(50, 60, 70));
        System.out.println("24. Is the set changed after retaining elements from collection? " + arr1);


    }
}
*/
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//treset
/*
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.TreeSet;
import java.util.stream.Stream;

public class oops {
    public static void main(String[] args) {
        TreeSet<String> arr1 = new TreeSet<String>(); 
        arr1.add("Welcome"); 
        arr1.add("To"); 
        System.out.println("1.add: " + arr1); 

        TreeSet<String> arr2 = new TreeSet<String>(); 
        arr2.add("Ted"); 
        arr2.add("Talks..");
        
        arr1.addAll(arr2);
        System.out.println("2.addall"+arr1);

        TreeSet<Integer> arr3 = new TreeSet<Integer>(); 
        arr3.add(20); 
        arr3.add(30); 
        arr3.add(40); 
        arr3.add(10); 

        System.out.println("3.add: " + arr3); 

        // getting ceiling value for 25 
        // using ceiling() method 
        int value = arr3.ceiling(25); 
        System.out.println("4.Ceiling value for 25: "+ value); 

        TreeSet cloned_set = new TreeSet(); 
        cloned_set = (TreeSet)arr3.clone(); 
        System.out.println("5.The cloned TreeSet: " + cloned_set); 


        TreeSet<Integer> arr4 = new TreeSet<Integer>(); 
        arr4.add(20); 
        arr4.add(30); 
        arr4.add(40); 
        arr4.add(10);
        arr4.add(70); 
        arr4.add(80); 
        arr4.add(90); 

        System.out.println("6.contatins: "+arr3.contains(2));
        System.out.println("7.containsAll"+arr3.containsAll(arr4));

        System.out.print("7.descendingIterator:");
        Iterator<Integer>iterator = arr4.descendingIterator();
        for (Integer integer : arr4) {
            System.out.print(integer+" ");
        }
        System.out.print("8.iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();


        System.out.println("9.descendingSet");
         NavigableSet<Integer>treereverse = arr4.descendingSet();
         for (Integer integer : treereverse) {
            System.out.print(integer+" ");
         }
         System.out.println();

         System.out.println("10.The first element is: " + arr4.first()); 

         System.out.println("11.The first element is: " + arr4.last()); 

         System.out.println("12."+arr4.floor(44));

        System.out.println("13."+arr4.ceiling(44));

        // Getting the subset of elements less than a given element
        System.out.println(arr4);
        SortedSet<Integer> headSet = arr4.headSet(30,true);
        System.out.println("14.Subset of elements less than 30: " + headSet);

        // Getting the element higher than a given element
        Integer higher = arr4.higher(30);
        System.out.println("15.Element higher than 30: " + higher);

        // Getting the element lower than a given element
        Integer lower = arr4.lower(30);
        System.out.println("16.Element lower than 30: " + lower);

        // Removing and returning the first element
        Integer first = arr4.pollFirst();
        System.out.println("17.First element removed: " + first);

        // Removing and returning the last element
        Integer last = arr4.pollLast();
        System.out.println("18.Last element removed: " + last);

        // Converting the set to an array
        Object[] array = arr4.toArray();
        System.out.println("19.Array representation of the set: " + Arrays.toString(array));

        // Getting the string representation of the set
        String stringRepresentation = arr4.toString();
        System.out.println("20.String representation of the set: " + stringRepresentation);

        Spliterator<Integer> spliterator = arr4.spliterator();
        System.out.print("21. ");
        spliterator.forEachRemaining(temp->System.out.print(temp+" "));
        System.out.println();

        // Getting a sequential Stream over the elements in the set
        Stream<Integer> stream = arr4.stream();
        stream.forEach(temp->System.out.print(temp+" "));
        System.out.println();

        // Getting the subset of elements within a range
        SortedSet<Integer> subSet = arr4.subSet(20, 40);
        System.out.println("22.Subset of elements between 20 (inclusive) and 40 (exclusive): " + subSet);


        // Removing all elements from the set that are contained in another set
        Set<Integer> clonedSet = new HashSet<>(Arrays.asList(20, 30));
        arr4.removeAll(clonedSet);
        System.out.println("23.Set after removing all elements contained in cloned set: " + arr4);

        // Getting the subset of elements greater than or equal to a given element
        SortedSet<Integer> tailSet = arr4.tailSet(30,true);
        System.out.println("24.Subset of elements greater than or equal to 30: " + tailSet);

        // Removing elements from the set that satisfy a predicate
        arr4.removeIf(element -> element > 40);
        System.out.println("25.Set after removing elements greater than 40: " + arr4);
        
    }
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//map
/*
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class oops {
    public static void main(String[] args) {
      

        // map1.entrySet();
        // map1.get();
        // map1.values()
        // map1.size(),
        // map1.keySet(),
        // map1.clear();
        // map1.compute(, );
        // map1.computeIfAbsent(, );
        // map1.computeIfPresent(, );
        // map1.containsKey()
        // map1.containsValue();
        // map1.equals()
        // map1.forEach();
        // map1.getClass();
        // map1.getOrDefault(, );
        // map1.hashCode()
        // map1.isEmpty()
        // map1.merge(, , )
        // map1.put(, );
        // map1.putAll();
        // map1.putIfAbsent(,);
        // map1.remove()
        // map1.remove(, );
        // map1.replace(, )
       // map1.replace(, , )
    //    map1.replaceAll();
    //    map1.size();
    //    map1.toString();
    //    map1.values();

    Map<String, Integer> map1 = new HashMap<>();
    map1.put("LOKESH", 3);
    map1.put("ARUN", 6);
    map1.put("apple", 1);
    map1.put("banana", 4);
    map1.put("orange", 30);

    System.out.println("1.entryset"+map1.entrySet());

    Integer a = map1.get("LOKESH");
    System.out.println("2.Value for key 'LOKESH': " + a);



      // 4. Size
    int size = map1.size();
    System.out.println("3.Size: " + size);


    // value
    Collection<Integer> values = map1.values();
    System.out.println("4.Values: " + values);

    // 5. Key Set
    Set<String> keySet = map1.keySet();
    System.out.println("5.Key Set: " + keySet);

    map1.compute("apple", (k, v) -> v == null ? 1 : v + 1);
    System.out.println("6.Map after compute: " + map1);

    // 8. Compute If Absent
    map1.computeIfAbsent("banana", k -> 2);
    System.out.println("7.Map after computeIfAbsent: " + map1);

    // 9. Compute If Present
    map1.computeIfPresent("orange", (k, v) -> v * 2);
    System.out.println("8.Map after computeIfPresent: " + map1);

    // 10. Contains Key
    boolean containsKey = map1.containsKey("apple");
    System.out.println("Contains Key 'apple': " + containsKey);

    // 11. Contains Value
    boolean containsValue = map1.containsValue(2);
    System.out.println("Contains Value '2': " + containsValue);

    // 12. Equals
    Map<String, Integer> map2 = new HashMap<>(map1);
    boolean equals = map1.equals(map2);
    System.out.println("Map1 equals Map2: " + equals);

    // 13. For Each
    map1.forEach((k, v) -> System.out.println(k + ": " + v));

     // 15. Get or Default
     Integer defaultValue = map1.getOrDefault("apple", -1);
     System.out.println("Default Value for 'apple': " + defaultValue);

     // 16. Hash Code
     int hashCode = map1.hashCode();
     System.out.println("Hash Code: " + hashCode);

     // 17. Is Empty
     boolean isEmpty = map1.isEmpty();
     System.out.println("Is Empty: " + isEmpty);

        // 18. Merge
        map1.merge("apple", 100, Integer::sum);
        System.out.println("Map after merge: " + map1);

        // 19. Put
        map1.put("banana", 200);
        System.out.println("Map after put: " + map1);

        // 20. Put All
        Map<String, Integer> map3 = new HashMap<>();
        map3.put("grape", 40);
        map3.put("mango", 50);
        map1.putAll(map3);
        System.out.println("Map after putAll: " + map1);

        // 21. Put If Absent
        map1.putIfAbsent("cherry", 60);
        System.out.println("Map after putIfAbsent: " + map1);

        // 22. Remove
        map1.remove("apple");
        System.out.println("Map after remove: " + map1);

        // 23. Remove with Value
        map1.remove("banana", 200);
        System.out.println("Map after remove with value: " + map1);

        // 24. Replace
        map1.replace("grape", 40);
        System.out.println("Map after replace: " + map1);

        // 25. Replace with New Value
        map1.replace("mango", 50, 500);
        System.out.println("Map after replace with new value: " + map1);

        // 26. Replace All
        map1.replaceAll((k, v) -> v * 10);
        System.out.println("Map after replaceAll: " + map1);

        // 27. Size
        int size2 = map1.size();
        System.out.println("Size: " + size2);

        // 28. To String
        String str = map1.toString();
        System.out.println("To String: " + str);

        // 29. Values
        Collection<Integer> values2 = map1.values();
        System.out.println("Values: " + values2);

    }
}
*/
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//hashmap:
/*
import java.util.*;

public class oops {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();

        // Adding some key-value pairs
        map1.put("apple", 10);
        map1.put("banana", 20);
        map1.put("orange", 30);

        // 1. Entry Set
        Set<Map.Entry<String, Integer>> entrySet = map1.entrySet();
        System.out.println("Entry Set: " + entrySet);

        // 2. Get Value by Key
        Integer value = map1.get("apple");
        System.out.println("Value for key 'apple': " + value);

        // 3. Values
        Collection<Integer> values = map1.values();
        System.out.println("Values: " + values);

        // 4. Size
        int size = map1.size();
        System.out.println("Size: " + size);

        // 5. Key Set
        Set<String> keySet = map1.keySet();
        System.out.println("Key Set: " + keySet);

        // // 6. Clear
        // map1.clear();
        // System.out.println("Map after clearing: " + map1);

        // 7. Compute
        map1.compute("apple", (k, v) -> v == null ? 1 : v + 1);
        System.out.println("Map after compute: " + map1);

        // 8. Compute If Absent
        map1.computeIfAbsent("banana", k -> 2);
        System.out.println("Map after computeIfAbsent: " + map1);

        // 9. Compute If Present
        map1.computeIfPresent("orange", (k, v) -> v * 2);
        System.out.println("Map after computeIfPresent: " + map1);

        // 10. Contains Key
        boolean containsKey = map1.containsKey("apple");
        System.out.println("Contains Key 'apple': " + containsKey);

        // 11. Contains Value
        boolean containsValue = map1.containsValue(2);
        System.out.println("Contains Value '2': " + containsValue);

        // 12. Equals
        HashMap<String, Integer> map2 = new HashMap<>(map1);
        boolean equals = map1.equals(map2);
        System.out.println("Map1 equals Map2: " + equals);

        // 13. For Each
        map1.forEach((k, v) -> System.out.println(k + ": " + v));

        // 14. Get Class
        Class<? extends HashMap> clazz = map1.getClass();
        System.out.println("Class: " + clazz);

        // 15. Get or Default
        Integer defaultValue = map1.getOrDefault("apple", -1);
        System.out.println("Default Value for 'apple': " + defaultValue);

        // 16. Hash Code
        int hashCode = map1.hashCode();
        System.out.println("Hash Code: " + hashCode);

        // 17. Is Empty
        boolean isEmpty = map1.isEmpty();
        System.out.println("Is Empty: " + isEmpty);

        // 18. Merge
        map1.merge("apple", 100, Integer::sum);
        System.out.println("Map after merge: " + map1);

        // 19. Put
        map1.put("banana", 200);
        System.out.println("Map after put: " + map1);

        // 20. Put All
        HashMap<String, Integer> map3 = new HashMap<>();
        map3.put("grape", 40);
        map3.put("mango", 50);
        map1.putAll(map3);
        System.out.println("Map after putAll: " + map1);

        // 21. Put If Absent
        map1.putIfAbsent("cherry", 60);
        System.out.println("Map after putIfAbsent: " + map1);

        // 22. Remove
        map1.remove("apple");
        System.out.println("Map after remove: " + map1);

        // 23. Remove with Value
        map1.remove("banana", 200);
        System.out.println("Map after remove with value: " + map1);

        // 24. Replace
        map1.replace("grape", 40);
        System.out.println("Map after replace: " + map1);

        // 25. Replace with New Value
        map1.replace("mango", 50, 500);
        System.out.println("Map after replace with new value: " + map1);

        // 26. Replace All
        map1.replaceAll((k, v) -> v * 10);
        System.out.println("Map after replaceAll: " + map1);

        // 27. Size
        int size2 = map1.size();
        System.out.println("Size: " + size2);

        // 28. To String
        String str = map1.toString();
        System.out.println("To String: " + str);

        // 29. Values
        Collection<Integer> values2 = map1.values();
        System.out.println("Values: " + values2);

        // Add more methods here...
    }
}
*/
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
/* 
import java.util.Hashtable;

import java.util.*;

public class oops {
    public static void main(String[] args) {
        Hashtable<String, Integer> map1 = new Hashtable<>();

        // Adding some key-value pairs
        map1.put("apple", 10);
        map1.put("banana", 20);
        map1.put("orange", 30);

        // 1. Entry Set
        Set<Map.Entry<String, Integer>> entrySet = map1.entrySet();
        System.out.println("Entry Set: " + entrySet);

        // 2. Get Value by Key
        Integer value = map1.get("apple");
        System.out.println("Value for key 'apple': " + value);

        // 3. Values
        Collection<Integer> values = map1.values();
        System.out.println("Values: " + values);

        // 4. Size
        int size = map1.size();
        System.out.println("Size: " + size);

        // 5. Key Set
        Set<String> keySet = map1.keySet();
        System.out.println("Key Set: " + keySet);

        // 6. Clear
        // map1.clear();
        // System.out.println("Map after clearing: " + map1);

        // 7. Compute (Not supported in Hashtable)

        // 8. Compute If Absent (Not supported in Hashtable)

        // 9. Compute If Present (Not supported in Hashtable)

        // 10. Contains Key
        boolean containsKey = map1.containsKey("apple");
        System.out.println("Contains Key 'apple': " + containsKey);

        // 11. Contains Value
        boolean containsValue = map1.containsValue(20);
        System.out.println("Contains Value '20': " + containsValue);

        // 12. Equals
        Hashtable<String, Integer> map2 = new Hashtable<>(map1);
        boolean equals = map1.equals(map2);
        System.out.println("Map1 equals Map2: " + equals);

        // 13. For Each (Not supported in Hashtable)

        // 14. Get Class
        Class<? extends Hashtable> clazz = map1.getClass();
        System.out.println("Class: " + clazz);

        // 15. Get or Default
        Integer defaultValue = map1.getOrDefault("apple", -1);
        System.out.println("Default Value for 'apple': " + defaultValue);

        // 16. Hash Code
        int hashCode = map1.hashCode();
        System.out.println("Hash Code: " + hashCode);

        // 17. Is Empty
        boolean isEmpty = map1.isEmpty();
        System.out.println("Is Empty: " + isEmpty);

        // 18. Merge (Not supported in Hashtable)

        // 19. Put
        map1.put("banana", 20);
        System.out.println("Map after put: " + map1);

        // 20. Put All
        Hashtable<String, Integer> map3 = new Hashtable<>();
        map3.put("grape", 40);
        map3.put("mango", 50);
        map1.putAll(map3);
        System.out.println("Map after putAll: " + map1);

        // 21. Put If Absent (Not supported in Hashtable)

        // 22. Remove
        map1.remove("apple");
        System.out.println("Map after remove: " + map1);

        // 23. Remove with Value (Not supported in Hashtable)

        // 24. Replace (Not supported in Hashtable)

        // 25. Replace with New Value (Not supported in Hashtable)

        // 26. Replace All (Not supported in Hashtable)

        // 27. Size
        int size2 = map1.size();
        System.out.println("Size: " + size2);

        // 28. To String
        String str = map1.toString();
        System.out.println("To String: " + str);

        // 29. Values
        Collection<Integer> values2 = map1.values();
        System.out.println("Values: " + values2);

    }
}
*/
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  
// LinkedHashMapExample 

/* 
import java.util.*;

public class oops {
    public static void main(String[] args) {
        Hashtable<String, Integer> map1 = new Hashtable<>();

        // Adding some key-value pairs
        map1.put("apple", 10);
        map1.put("banana", 20);
        map1.put("orange", 30);

        // 1. Entry Set
        Set<Map.Entry<String, Integer>> entrySet = map1.entrySet();
        System.out.println("Entry Set: " + entrySet);

        // 2. Get Value by Key
        Integer value = map1.get("apple");
        System.out.println("Value for key 'apple': " + value);

        // 3. Values
        Collection<Integer> values = map1.values();
        System.out.println("Values: " + values);

        // 4. Size
        int size = map1.size();
        System.out.println("Size: " + size);

        // 5. Key Set
        Set<String> keySet = map1.keySet();
        System.out.println("Key Set: " + keySet);

        // // 6. Clear
        // map1.clear();
        // System.out.println("Map after clearing: " + map1);

        // 7. Compute (Not supported in Hashtable)

        // 8. Compute If Absent (Not supported in Hashtable)

        // 9. Compute If Present (Not supported in Hashtable)

        // 10. Contains Key
        boolean containsKey = map1.containsKey("apple");
        System.out.println("Contains Key 'apple': " + containsKey);

        // 11. Contains Value
        boolean containsValue = map1.containsValue(20);
        System.out.println("Contains Value '20': " + containsValue);

        // 12. Equals
        Hashtable<String, Integer> map2 = new Hashtable<>(map1);
        boolean equals = map1.equals(map2);
        System.out.println("Map1 equals Map2: " + equals);

        // 13. For Each (Not supported in Hashtable)

        // 14. Get Class
        Class<? extends Hashtable> clazz = map1.getClass();
        System.out.println("Class: " + clazz);

        // 15. Get or Default
        Integer defaultValue = map1.getOrDefault("apple", -1);
        System.out.println("Default Value for 'apple': " + defaultValue);

        // 16. Hash Code
        int hashCode = map1.hashCode();
        System.out.println("Hash Code: " + hashCode);

        // 17. Is Empty
        boolean isEmpty = map1.isEmpty();
        System.out.println("Is Empty: " + isEmpty);

        // 18. Merge (Not supported in Hashtable)

        // 19. Put
        map1.put("banana", 20);
        System.out.println("Map after put: " + map1);

        // 20. Put All
        Hashtable<String, Integer> map3 = new Hashtable<>();
        map3.put("grape", 40);
        map3.put("mango", 50);
        map1.putAll(map3);
        System.out.println("Map after putAll: " + map1);

        // 21. Put If Absent (Not supported in Hashtable)

        // 22. Remove
        map1.remove("apple");
        System.out.println("Map after remove: " + map1);

        // 23. Remove with Value (Not supported in Hashtable)

        // 24. Replace (Not supported in Hashtable)

        // 25. Replace with New Value (Not supported in Hashtable)

        // 26. Replace All (Not supported in Hashtable)

        // 27. Size
        int size2 = map1.size();
        System.out.println("Size: " + size2);

        // 28. To String
        String str = map1.toString();
        System.out.println("To String: " + str);

        // 29. Values
        Collection<Integer> values2 = map1.values();
        System.out.println("Values: " + values2);

        // Add more methods here...
    }
}
*/





//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//SortedMap Interface in Java


/* 
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

import java.util.*;

public class oops {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> arr = new TreeMap<>();

        // Adding some key-value pairs
        arr.put(1, 10);
        arr.put(2, 20);
        arr.put(3, 30);

        // 1. First Key
        Integer firstKey = arr.firstKey();
        System.out.println("First Key: " + firstKey);

        // 2. Last Key
        Integer lastKey = arr.lastKey();
        System.out.println("Last Key: " + lastKey);

        // 3. Comparator
        Comparator<? super Integer> comparator = arr.comparator();
        System.out.println("Comparator: " + comparator);

        // 4. Head Map
        SortedMap<Integer, Integer> headMap = arr.headMap(2);
        System.out.println("Head Map: " + headMap);

        // 5. Sub Map
        SortedMap<Integer, Integer> subMap = arr.subMap(1, 3);
        System.out.println("Sub Map: " + subMap);

        // 6. Tail Map
        SortedMap<Integer, Integer> tailMap = arr.tailMap(2);
        System.out.println("Tail Map: " + tailMap);

        // 7. Entry Set
        Set<Map.Entry<Integer, Integer>> entrySet = arr.entrySet();
        System.out.println("Entry Set: " + entrySet);

        // 8. Get Value by Key
        Integer value = arr.get(1);
        System.out.println("Value for key '1': " + value);

        // 9. Values
        Collection<Integer> values = arr.values();
        System.out.println("Values: " + values);

        // 10. Size
        int size = arr.size();
        System.out.println("Size: " + size);

        // 11. Key Set
        Set<Integer> keySet = arr.keySet();
        System.out.println("Key Set: " + keySet);

        // 12. Clear
        arr.clear();
        System.out.println("Map after clearing: " + arr);

        // 13. Compute (Not supported in SortedMap)

        // 14. Compute If Absent (Not supported in SortedMap)

        // 15. Compute If Present (Not supported in SortedMap)

        // 16. Contains Key
        boolean containsKey = arr.containsKey(1);
        System.out.println("Contains Key '1': " + containsKey);

        // 17. Contains Value
        boolean containsValue = arr.containsValue(20);
        System.out.println("Contains Value '20': " + containsValue);

        // 18. Equals
        TreeMap<Integer, Integer> arr2 = new TreeMap<>();
        arr2.put(1, 10);
        arr2.put(2, 20);
        arr2.put(3, 30);
        boolean equals = arr.equals(arr2);
        System.out.println("Map equals Map2: " + equals);

        // 19. For Each (Not supported in SortedMap)

        // 20. Get Class
        Class<? extends TreeMap> clazz = arr.getClass();
        System.out.println("Class: " + clazz);

        // 21. Get or Default
        Integer defaultValue = arr.getOrDefault(1, -1);
        System.out.println("Default Value for '1': " + defaultValue);

        // 22. Hash Code
        int hashCode = arr.hashCode();
        System.out.println("Hash Code: " + hashCode);

        // 23. Is Empty
        boolean isEmpty = arr.isEmpty();
        System.out.println("Is Empty: " + isEmpty);

        // 24. Merge (Not supported in SortedMap)

        // 25. Put
        arr.put(1, 10);
        System.out.println("Map after put: " + arr);

        // 26. Put All
        TreeMap<Integer, Integer> arr3 = new TreeMap<>();
        arr3.put(4, 40);
        arr3.put(5, 50);
        arr.putAll(arr3);
        System.out.println("Map after putAll: " + arr);

        // 27. Put If Absent (Not supported in SortedMap)

        // 28. Remove
        arr.remove(1);
        System.out.println("Map after remove: " + arr);

        // 29. Remove with Value (Not supported in SortedMap)

        // 30. Replace (Not supported in SortedMap)

        // 31. Replace with New Value (Not supported in SortedMap)

        // 32. Replace All (Not supported in SortedMap)

        // 33. Size
        int size2 = arr.size();
        System.out.println("Size: " + size2);

        // 34. To String
        String str = arr.toString();
        System.out.println("To String: " + str);

        // 35. Values
        Collection<Integer> values2 = arr.values();
        System.out.println("Values: " + values2);

        // Add more methods here...
    }
}
*/


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*

import java.util.*;

public class oops {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Adding some key-value pairs
        treeMap.put("apple", 10);
        treeMap.put("banana", 20);
        treeMap.put("orange", 30);

        // 1. First Key
        String firstKey = treeMap.firstKey();
        System.out.println("First Key: " + firstKey);

        // 2. Last Key
        String lastKey = treeMap.lastKey();
        System.out.println("Last Key: " + lastKey);

        // 3. Comparator
        Comparator<? super String> comparator = treeMap.comparator();
        System.out.println("Comparator: " + comparator);

        // 4. Head Map
        SortedMap<String, Integer> headMap = treeMap.headMap("banana");
        System.out.println("Head Map: " + headMap);

        // 5. Sub Map
        SortedMap<String, Integer> subMap = treeMap.subMap("apple", "orange");
        System.out.println("Sub Map: " + subMap);

        // 6. Tail Map
        SortedMap<String, Integer> tailMap = treeMap.tailMap("banana");
        System.out.println("Tail Map: " + tailMap);

        // 7. Entry Set
        Set<Map.Entry<String, Integer>> entrySet = treeMap.entrySet();
        System.out.println("Entry Set: " + entrySet);

        // 8. Get Value by Key
        Integer value = treeMap.get("apple");
        System.out.println("Value for key 'apple': " + value);

        // 9. Values
        Collection<Integer> values = treeMap.values();
        System.out.println("Values: " + values);

        // 10. Size
        int size = treeMap.size();
        System.out.println("Size: " + size);

        // 11. Key Set
        Set<String> keySet = treeMap.keySet();
        System.out.println("Key Set: " + keySet);

        // 12. Clear
        treeMap.clear();
        System.out.println("Map after clearing: " + treeMap);

        // 13. Compute (Not supported in SortedMap)

        // 14. Compute If Absent (Not supported in SortedMap)

        // 15. Compute If Present (Not supported in SortedMap)

        // 16. Contains Key
        boolean containsKey = treeMap.containsKey("apple");
        System.out.println("Contains Key 'apple': " + containsKey);

        // 17. Contains Value
        boolean containsValue = treeMap.containsValue(20);
        System.out.println("Contains Value '20': " + containsValue);

        // 18. Equals
        TreeMap<String, Integer> treeMap2 = new TreeMap<>();
        treeMap2.put("apple", 10);
        treeMap2.put("banana", 20);
        treeMap2.put("orange", 30);
        boolean equals = treeMap.equals(treeMap2);
        System.out.println("Map equals Map2: " + equals);

        // 19. For Each (Not supported in SortedMap)

        // 20. Get Class
        Class<? extends TreeMap> clazz = treeMap.getClass();
        System.out.println("Class: " + clazz);

        // 21. Get or Default
        Integer defaultValue = treeMap.getOrDefault("apple", -1);
        System.out.println("Default Value for 'apple': " + defaultValue);

        // 22. Hash Code
        int hashCode = treeMap.hashCode();
        System.out.println("Hash Code: " + hashCode);

        // 23. Is Empty
        boolean isEmpty = treeMap.isEmpty();
        System.out.println("Is Empty: " + isEmpty);

        // 24. Merge (Not supported in SortedMap)

        // 25. Put
        treeMap.put("apple", 10);
        System.out.println("Map after put: " + treeMap);

        // 26. Put All
        TreeMap<String, Integer> treeMap3 = new TreeMap<>();
        treeMap3.put("grape", 40);
        treeMap3.put("mango", 50);
        treeMap.putAll(treeMap3);
        System.out.println("Map after putAll: " + treeMap);

        // 27. Put If Absent (Not supported in SortedMap)

        // 28. Remove
        treeMap.remove("apple");
        System.out.println("Map after remove: " + treeMap);

        // 29. Remove with Value (Not supported in SortedMap)

        // 30. Replace (Not supported in SortedMap)

        // 31. Replace with New Value (Not supported in SortedMap)

        // 32. Replace All (Not supported in SortedMap)

        // 33. Size
        int size2 = treeMap.size();
        System.out.println("Size: " + size2);

        // 34. To String
        String str = treeMap.toString();
        System.out.println("To String: " + str);

        // 35. Values
        Collection<Integer> values2 = treeMap.values();
        System.out.println("Values: " + values2);

        // Add more methods here...
    }
}
*/
// hashmap and hashtable:seaching elements in o(1)
/* 
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class oops {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap <Integer ,Integer> arr = new HashMap<>();
        for(int i=0;i<6;i++)
        {
            int num=scan.nextInt();
            if(arr.containsKey(num))
            {
                arr.put(num,arr.get(num)+1);
            }
            else
            {
                arr.put(num,arr.getOrDefault(num,1));
            }
        }
        System.out.println(arr.get(1));
        System.out.println(arr.get(11));

        System.out.println("method 1");
        Set<HashMap.Entry<Integer,Integer>> arr2 = arr.entrySet();
        for(HashMap.Entry<Integer,Integer> i:arr2)
        {
            System.out.println(i.getKey()+" "+i.getValue()+" "+i.getClass());
        }

        System.out.println("method 2");
        Set<Integer> arr3 = arr.keySet();
        for(Integer i:arr3)
        {
            System.out.println(i+" "+arr.get(i));
        }
        
    }
    
}
*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//mulit-threading: is two  type process and thread
/*
     concurrency:
            .Computer users take it for granted that their systems can do more than one thing or process at a time.
            .They assume that they can continue to work in a word processor, while other applications download files, manage the print queue, and stream audio.
            .Software that can do such things is known as concurrent software.
            .The Java platform is designed from the ground up to support concurrent programming, with basic concurrency support in the Java programming language and the Java class libraries. Since version 5.0, the Java platform has also included high-level concurrency APIs. 
             This lesson introduces the platform's basic concurrency support and summarizes some of the high-level APIs in the java.util.concurrent packages.
            .APIs->collection n no.of classes
            .concurrent programming there are two basic unit exuction like processes and threads

    multitasking:
        muliple processes
            doing many tasks at smae time
        single processes:
            jvm is a single process and concurrency
            doing many things at same time inside a single processes
        
     processes and thread:
            In concurrent programming, there are two basic units of execution: processes and threads. In the Java programming language, concurrent programming is mostly concerned with threads. However, processes are also important.
    
     processes:
          A process has a self-contained execution environment. A process generally has a complete, private set of basic run-time resources; in particular, each process has its own memory space. 

     thread
        .java is multi threading lang
        .Threads are sometimes called lightweight processes. Both processes and threads provide an execution environment, but creating a new thread requires fewer resources than creating a new process
        .Threads exist within a process — every process has at least one. Threads share the process's resources, including memory and open files. This makes for efficient, but potentially problematic, communication.
        .Multithreaded execution is an essential feature of the Java platform. Every application has at least one thread — or several, if you count "system" threads that do things like memory management and signal handling. But from the application programmer's point of view, you start with just one thread, called the main thread. This thread has the ability to create additional threads      
        .java program excution in a strack first in first out
        .Each thread is associated with an instance of the class Thread.
        .usage of thread video gaming,web servers.
         
 */
/*multithread is implent by two way  1.extending thread class 2. implementing interface
thead is predefined class 
    thread methods
    1.run();
    2.start();

class class1 extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<4;i++)
        {
            System.out.println("method1 " +i);
            try
            {
                Thread.sleep(2000); //delay 
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
class class2 extends Thread
{
     @Override
    public void run()
    {   
        for(int i=0;i<4;i++)
        {
            System.out.println("method2"); 
        }
    }
}
public  class oops {
    public static void main(String[] args) throws Exception {// main thread
        class1 obj1 = new class1();
        class2 obj2 = new class2();
        
        obj1.start();
        obj2.start();
        obj2.join();
        System.out.println("----------");
    }
}
*/
/*
   multitasking 
    multitasking allows several activities to occur concurrently on the computer
    1.process-based multitasking
        allows process to run concurrently on the computer
        eg:running the ms paint while also working with the word processor or application
    2.thread-based multitasking
        allows parts of the same program to run concurrently on the coputer
        eg:ms word is printing and formatting text at the same time

    threads and process:


 */
/*
 public class oops {

    public static void main(String[] args) {
        System.out.println("--multithreading---");

        thread obj1 = new thread();
        obj1.run();
        System.out.println("------");
        obj1.run();
    }
 }
 class thread extends Thread
 {
    public void run()
    {
        String str="BYE";
        for(int i=0;i<3;i++)
        {
            System.out.println(str);
            str+=str;
        }
    } 
 }*/
 /*
    multithreading:
        eg: cake preparasation
            .every single cake making process is thread 
            .making cake in n no.of cake making is parallel processing
            .parallel processing is delivery the n no.of cake in faster way
            .in a computer core is thread
            .parallel processing example is if have working in word and also listing a music in spotify then its a parallel processing. word and spotify having separate having thread

  */
  //1.thread interface:(Multi_inhertence is not supported)
  /* 
  class Cake extends Thread
  {
    @Override
    public void run() // run should be a void because of Thread is class run is method in thread is defined as a void method in run so we can't change
    {
        try
        {
            System.out.println("------lorem----- "+Cake.currentThread().getId());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            System.out.println("------mixing----- "+Cake.currentThread().getId());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            System.out.println("------baking----- "+Cake.currentThread().getId());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
  }
  public class oops {

    public static void main(String[] args) {
       
        System.out.println("using run()->serial it's not mutlithread");
        Cake obj1 = new Cake();
        obj1.run();

        System.out.println("-----------------------------");

        System.out.println("using start()->parallel prossing");
        for(int i=0;i<3;i++)
        {
            Cake obj2 = new Cake();
            obj2.start();
        }
    }
  } */
  // runnable  interface:(Multi_inhertence is supported)
/*   
class Cake implements Runnable
  {
     public void run()
     {
        System.out.println("------lorem1----- "+Thread.currentThread().getId());
        System.out.println("------lorem2----- "+Thread.currentThread().getId());
        System.out.println("------lorem3----- "+Thread.currentThread().getId());
     }
  }
      
  public class oops {
    public static void main(String[] args) {
        Cake cake = new Cake();
        Thread thread = new Thread(cake); 
        thread.start();
    } 
  }
  */
  //Synchronized Keyword in Java ||ex making cake counter for two teams
/* 
class CakeCounter
  {
    int count=0;
    public synchronized void incre()
    {
        count++;
    }
  }
  class Team implements Runnable
  {
    CakeCounter counter;

    Team(CakeCounter counter)
    {
        this.counter=counter;
    }
    public void run()
    {
        for(int i=0;i<1000;i++)
        {
            counter.incre();
        }
    }
  }
  public class oops {
    public static void main(String[] args) {
        
        CakeCounter counter = new CakeCounter();

        Thread team1 = new  Thread(new Team(counter));
        Thread team2 = new  Thread(new Team(counter));
        team1.start();
        team2.start();
        try
        {
            team1.join();;
            team2.join();
            System.out.println(counter.count);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
  }
  */
  // method in thread
  /* 
public class oops extends Thread {
  public static void main(String[] args) {

        for(int i=0;i<6;i++)
        {
            if(i==1)
            {
                try
                {
                    oops.sleep(1000);
                    System.out.println("HELLO! 1");
                }
                catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
            }
            else
            {
                System.out.println("Hello! "+i);
                

            }
            if(i==2)
            {
                System.out.println(10/0);System.out.println(10/0); 
            }
        }   
   }
}

class setname_for_getId extends Thread
{
  public void run()
  {
    try
    {
      System.out.println("hii "+setname_for_getId.currentThread().getName());
      System.out.println("hii "+setname_for_getId.currentThread().getName());
      System.out.println("hii "+setname_for_getId.currentThread().getName());

    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
  }
}
public class oops {

    public static void main(String[] args) throws Exception  {
        setname_for_getId obj1 = new setname_for_getId();
        obj1.setName("SUMA "+1);
        obj1.start();

        obj1.join();
        System.out.println("isAlive "+obj1.isAlive());

        //MIN_PRIORITY-1
        //NORM_PRIORITY-5
        //MAX_PRIORITY-10
        obj1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("MAX_PRIORITY "+obj1.getPriority());
    }
}*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
























/* 


     int a=10;
     int b=8;

     System.out.println(b<<2);



             String d="23";
        String a="12";
        Integer x=new Integer(d);
        Integer y=new Integer(a);
        int c=x+y;
        System.out.print(c);

 */

 /*
  import java.io.*;
class FileBufferedReadWrite{
    static void filewrite() throws IOException
    {
        File f=new File("sdk1.txt");
		boolean b=f.createNewFile();
		System.out.println(b);
		FileWriter fw=new FileWriter(f);
			fw.write("Hi Its sdk");
			fw.close();
    }
    static void fileread() throws IOException
    {
        File f=new File("sdk1.txt");
		FileReader fr=new FileReader(f);
		char arr[]=new char[100];
		fr.read(arr);
		System.out.println(arr);
    }
    static void bufferwrite() throws IOException
    {
        FileWriter fr=new FileWriter("dk.txt");
		BufferedWriter br=new BufferedWriter(fr);
		br.write("Deepak");
		br.close();
    }
     static void bufferread() throws IOException
    {
        FileReader fr=new FileReader("dk.txt");
		BufferedReader br=new BufferedReader(fr);
	    int i=0;
	    while((i=br.read())!=-1)
	    {
	        System.out.print((char)i);
	    }
	    br.close();
    }
	public static void main(String args[]) throws IOException
	{ 
	   filewrite();
	   fileread();
	   bufferwrite();
	   bufferread();
	}
}
  */


/*


    time compxity
    time complexity != time taken
*/
 

  /*

User


     byte b=10;
     byte c=20;
     System.out.println(b!=c);

     Arrays.equals(a,b)

     		Object c=a.remove(5);              // remove
		System.out.println(a);
		
		a.remove("Deepak");                // remove(Object o)
		System.out.println(a);


        Object[] arr=a.toArray();       // toArray
		System.out.println("Elements in separate order ");
		for(int i=0;i<k;i++)
		{
		    System.out.println(arr[i]);
		}



import java.util.*;
public class ArrDelete
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array size :");
		int s=sc.nextInt();
		int a[]=new int [s];
		System.out.print("Enter Array elements :");
		for(int i=0;i<s;i++)
		{
		    a[i]=sc.nextInt();
		}
		System.out.print("Enter the location :");
		int n=sc.nextInt();
		for(int i=n;i<s-1;i++)
		{
		    a[i]=a[i+1];
		}
		s--;
		for(int i=0;i<s;i++)
		{
		    System.out.println(a[i]);
		}
	}
}
*/

//multitasking
/*
    multitasking allows several activities to occur concurently on the computer
        process based multitasking
        thread based multitasking
        
 */
/*
    thread creation:
    1.implementing the java.lang.runnable interface
    2.extending the java.lang.thread class
    
 */

// import java.util.ArrayList;
// import java.util.Scanner;

// public class oops {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         ArrayList<Integer> arr = new ArrayList<Integer>();
     
//     }
// }


/*---------------------------------------------------------------*/
/*
    .java regulat expressions is create by the structure of perl programing lang
    .java.util.rege -API -->package
    .class:
        Matcher
        pattern
        patternSyntaxException
    application:
        chatbot
        form
 */

// import java.util.InputMismatchException;
// import java.util.Scanner;
// import java.util.StringTokenizer;
// import java.util.regex.Matcher;
// import java.util.regex.Pattern;
/*
public class oops
{
    public static void main(String[] args) {
        String str="time is gold for engineering gold life";
        Pattern p = Pattern.compile("gol");
        Matcher m = p.matcher(str);
        int ctr=0;
        while(m.find())
        {
            ctr++;
            System.out.println(m.group()+" "+m.start()+" "+m.end());
        }
        System.out.println("count "+ctr) ; 
    }
}

public class oops
{
    public static void main(String[] args) {
        String str1="time is gold for rngineering gold life";
        Pattern p1 = Pattern.compile("^tim");
        Matcher m1 = p1.matcher(str1);
        while(m1.find())
        {
            System.out.println("YES time is starting word in sentences");
        }


        String str2="time is gold for engineering gold life";
        Pattern p2 = Pattern.compile("life$");
        Matcher m2 = p2.matcher(str2);
        while(m2.find())
        {
            System.out.println("YES life is ending word in sentences");
        }

        String str3="time is gold for engineering gold life";
        Pattern p3 = Pattern.compile("t|e|r");
        Matcher m3 = p3.matcher(str3);
        while(m3.find())
        {
            System.out.println(m3.group()+" "+m3.start());
        }
       
       
    }
}

//1.[abc]=a|b|c
//2.[^abc] expect a b c 
public class oops
{
    public static void main(String[] args) {

        System.out.println("[abc]");

        String str1="abcdddertwetgthbh";
        Pattern p1 = Pattern.compile("[abc]");
        Matcher m1 = p1.matcher(str1);
        while(m1.find())
        {
            System.out.print(m1.group()+" "+m1.start()+"- ");
        }
        System.out.println();

        System.out.println("[^abc]");
        String str2="abcdddertwetgthbh";
        Pattern p2 = Pattern.compile("[^abc]");
        Matcher m2 = p2.matcher(str2);
        while(m2.find())
        {
            System.out.print(m2.group()+" "+m2.start()+"- ");
        }


        System.out.println();

        System.out.println("[e-sE-S0-9$%^@]");
        String str3="abcdddertwetgthbhE@S12";
        Pattern p3 = Pattern.compile("[e-sE-S0-9$%^@]");
        Matcher m3 = p3.matcher(str3);
        while(m3.find())
        {
            System.out.print(m3.group()+" "+m3.start()+"- ");
        }

        System.out.println();

        System.out.println("[^e-sE-S0-9]");
        String str4="abcdddertwetgthbhE@S12!&";
        Pattern p4 = Pattern.compile("[^e-sE-S0-9]");
        Matcher m4 = p4.matcher(str4);
        while(m4.find())
        {
            System.out.print(m4.group()+" "+m4.start()+"- ");
        }

    }
}
*/
//predefined class
/* 
public class oops {
    public static void main(String[] args) {

        System.out.println("\\s space only");
        String str1="time is  gold";
        Pattern p1= Pattern.compile("\\s");
        Matcher m1 = p1.matcher(str1);
        while(m1.find())
        {
            System.out.print(m1.group()+" "+m1.start()+" - ");
        }

        System.out.println();

        System.out.println("\\s space without space");
        String str2="time is  gold";
        Pattern p2= Pattern.compile("\\S");
        Matcher m2 = p2.matcher(str2);
        while(m2.find())
        {
            System.out.print(m2.group()+" "+m2.start()+" - ");
        }

        System.out.println();

        System.out.println("\\d only numbers");
        String str3="time is  gold 143";
        Pattern p3= Pattern.compile("\\d");
        Matcher m3 = p3.matcher(str3);
        while(m3.find())
        {
            System.out.print(m3.group()+" "+m3.start()+" - ");
        }

        System.out.println();

        System.out.println("\\D without numbers");
        String str4="time is  gold 143";
        Pattern p4= Pattern.compile("\\D");
        Matcher m4 = p4.matcher(str4);
        while(m4.find())
        {
            System.out.print(m4.group()+" "+m4.start()+" - ");
        }

        System.out.println();

        System.out.println("\\w without special character");
        String str5="time is  gold 143n!!#@";
        Pattern p5= Pattern.compile("\\w");
        Matcher m5 = p5.matcher(str5);
        while(m5.find())
        {
            System.out.print(m5.group()+" "+m5.start()+" - ");
        }

        System.out.println();

        System.out.println("\\W  only special character");
        String str6="time is  gold 143n!!#@";
        Pattern p6= Pattern.compile("\\W");
        Matcher m6 = p6.matcher(str6);
        while(m6.find())
        {
            System.out.print(m6.group()+" "+m6.start()+" - ");
        }

        System.out.println();

        System.out.println("\\b bounre words");
        String str7="gold time is  goldgold 143n gold !!#@";
        Pattern p7= Pattern.compile("\\bgold");
        Matcher m7 = p7.matcher(str7);
        while(m7.find())
        {
            System.out.print(m7.group()+" "+m7.start()+" - ");
        }


        System.out.println();

        System.out.println("\\b boundary words");
        String str8="gold time is  goldgold 143n gold !!#@";
        Pattern p8= Pattern.compile("\\bgold\\b");
        Matcher m8 = p8.matcher(str8);
        while(m8.find())
        {
            System.out.print(m8.group()+" "+m8.start()+" - ");
        }

        System.out.println();

        System.out.println("\\B boundary without ending words");
        String str9="gold time is  goldtamil 143n gold !!#@";
        Pattern p9= Pattern.compile("gold\\B");
        Matcher m9 = p9.matcher(str9);
        while(m9.find())
        {
            System.out.print(m9.group()+" "+m9.start()+" - ");
        }
        System.out.println();

        // System.out.println("\\G continues words");
        // String str10="gold timetimes timetime is  goldtamil 143n gold !!#@";
        // Pattern p10= Pattern.compile("\\Gtime");
        // Matcher m10 = p10.matcher(str10);
        // while(m10.find())
        // {
        //     System.out.print(m10.group()+" "+m10.start()+" - ");
        // }


        System.out.println();

        System.out.println(". all character including special charcter");
        String str11="gold time is  goldtamil 143n gold !!#@";
        Pattern p11= Pattern.compile(".");
        Matcher m11 = p11.matcher(str11);
        while(m11.find())
        {
            System.out.print(m11.group()+" "+m11.start()+" - ");
        }
        System.out.println();


    }
}

//quantifiers
public class oops {
    public static void main(String[] args) {
        String str1="abbbbbaaacccc";
        Pattern p1 = Pattern.compile("a");
        Matcher m1 = p1.matcher(str1);
        while(m1.find())
        {
            System.out.print(m1.group()+"-"+m1.start()+" ");
        }

        System.out.println();

        System.out.println("+ at one match");
        String str2="abbbbbaaaccaabcc";
        Pattern p2 = Pattern.compile("ab+");
        Matcher m2 = p2.matcher(str2);
        while(m2.find())
        {
            System.out.print(m2.group()+"-"+m2.start()+" ");
        }

        System.out.println();

        System.out.println("* any number of match including zero number");
        String str3="abbbbbaaaccaabcc";
        Pattern p3 = Pattern.compile("ab*");
        Matcher m3 = p3.matcher(str3);
        while(m3.find())
        {
            System.out.print(m3.group()+"-"+m3.start()+" ");
        }

        
        System.out.println();

        System.out.println("? at most one");
        String str4="abbbbbaaaccaabcc";
        Pattern p4 = Pattern.compile("ab?");
        Matcher m4 = p4.matcher(str4);
        while(m4.find())
        {
            System.out.print(m4.group()+"-"+m4.start()+" ");
        }


        System.out.println();

        System.out.println("? at most one");
        String str5="abbbbbaaaccaabcc";
        Pattern p5 = Pattern.compile("a{2,3}");
        Matcher m5 = p5.matcher(str5);
        while(m5.find())
        {
            System.out.print(m5.group()+"-"+m5.start()+" ");
        }
    }
}

//split
public class oops {
    public static void main(String[] args) {
        String str1="HERG RG ERGE ZOHO";
        Pattern p1 = Pattern.compile("\\s");
        String str_arr[]=p1.split(str1);
        for(String str:str_arr)
        {
            System.out.print(str+"-");
        }
    }
}

// stringTokenizer class
public class oops {
    public static void main(String[] args) {
        String str1 ="https:\\www.zoho.com";
        StringTokenizer str_arr1 = new StringTokenizer(str1,".",true);
        while(str_arr1.hasMoreTokens())
        {
            System.out.println(str_arr1.nextToken()+" ");
        }

        System.out.println();
        String str_arr2[]=str1.split("\\:|\\\\|\\.");
        for(String temp:str_arr2)
        {
            System.out.println(temp+" ");
        }
    }
}
*/
/*---------------------------------------------------------------*/
// exception handling by runtime->whenever exception occur,the corresponding excepion object will be thrown
// error -> is comple time occur because of stack is overflow
// exceptin -> is runtime occur 
/*
public class oops {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        try
        {
            System.out.println(5/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage()+" "+e.getClass());
        }
        try
        {
            int a=scan.nextInt();
            System.out.println(a);
        }
        catch(InputMismatchException IM)
        {
            System.out.println(IM.getMessage()+" "+IM.getClass());
        }
        try
        {
            int a=scan.nextInt();
            System.out.println(a);
        }
        catch(Exception IM)
        {
            System.out.println(IM.getMessage()+" "+IM.getClass());
        }
    }
}
*/
//-------------------------------------------java 8----------------------------------------------------------------------------------------
/*
    - Java 8 Lambda Expressions
    - Java 8 Functional Interfaces
    - Java 8 Method References
    - Java 8 Stream API
    - Java 8 Optional Class
    - Java 8 Collectors Class
    - Java 8 Static and Default Methods in Interface
 */



/* - Java 8 Lambda Expressions
lambda expressions were introduced in java 8
lambda expressons is an anonymous function it'a function without name and does not belongs to any class
lambda expression is mainly used to implement functional interface
   .funcitonal interface were introduced in java 8 
   .an interface that contains exactly one abstract mehod is known as a functional interface
   .functional interface can hava any number of defalut,static methods but can contain only one abstract methods
lambda vs method
    method is always belongs to class or object in java where as lambda does not belongs to any class or object
    -as lambda is an anoymous function so no need to have a name 
    -parameter list
    -body-this is main part of the function
    -no return type in lambda function
    -int sum = (int a,int b)-> (a+b);
                parameter       body
                 list
    -lambda input parameters()_arrow->_lambda body{}
*/

// without parameters
/* 
//polymorshim
interface shapes
{
    void draw();
}
// class Rectangle implements shapes
// {
//     public void draw()
//     {
//         System.out.println("Rectangle class: draw() method");
//     }
// }
// class circle implements shapes
// {
//     public void draw()
//     {
//         System.out.println("circle class: draw() method");
//     }
// }
// class square implements shapes
// {
//     public void draw()
//     {
//         System.out.println("square class: draw() method");
//     }
// }
public class oops {
    public static void main(String[] args) {
         
        shapes Rectangle = () -> {System.out.println("Rectangle class: draw() method");};
        shapes Circle = () -> System.out.println("circle class: draw() method");
        shapes square = () -> System.out.println("square class: draw() method");
        Rectangle.draw();
        Circle.draw();
        square.draw();

        print(Rectangle);
        print(square);
        print(Circle);

        print(() -> System.out.println("Rectangle class: draw() method"));
        print(() -> System.out.println("circle class: draw() method"));
        print(() -> System.out.println("square class: draw() method"));

    }
    private static void print(shapes s)
    {
        s.draw();
    }
}

// with parameters
interface sum
{
    int add(int a,int b);
}
// class additional implements sum
// {
//     @Override
//     public int add(int a,int b)
//     {
//         return a+b;
//     }
// }
public class oops {
    public static void main(String[] args) {
        sum ADD1 = (a,b)->a+b;
        System.out.println(ADD1.add(10, 100));

        sum ADD2 = (int a,int b)->a+b;
        System.out.println(ADD2.add(10, 100));
    }
}


//runnable lamdaexpression:
 class threadclass implements Runnable
 {
    public void run()
    {
        System.out.println("run method.......");
    }
 }
 public class oops {
    public static void main(String[] args) {
        Thread thread = new Thread(new threadclass());
        thread.start();

        Runnable runnable = ()-> System.out.println("run method usinf labmda....");

        Thread thread2 = new Thread(runnable);
        thread2.start(); 
    }
 }
 */
//-------------------------------------------java networking----------------------------------------------------------------------------------------
/*
    HOSTS:
        .hosts are any device which sends or receive traffic
        .anything that sends or receive traffic over a network
        ex:computer,laptop,phone,printers,servers

    hosts are any device which sends or receive traffic
          like
           1.client and severs
                client initiate request 
           2.servers 
                server is respond the client request
                server are simply computers with software installed which responds to specific requests
               
            [ ]   --------->      [ ]
             ^                     ^
           client(user)          server(www.zoho.com)

    IP ADDRESS:
        An IP Address is the identity of each host
//-------------------------------------------------------------------------
                     pokets
            [ ]   -------------->     [ ]
             ^                         ^
           client(user)           server(www.zoho.com)
            100.0.0.0                  10.0.0.0
//-------------------------------------------------------------------------

            [ ]   -------------->    [ ]
             ^    <--------------     ^    
                                      
           client(user)           server(www.zoho.com)
            100.0.0.0                  10.0.0.0

            --------------> src 100.0.0.0 & dst 10.0.0.0 (pockets)
            <-------------- src 10.0.0.0 & dst 100.0.0.0 (pockets)
        
        .ip addresses are 32 bits
        .bit is 1 or 0
        .represented as four octets
        .each octet can be 0-255

         ---- ---- . ---- ----- . ---- ---- . ---- -----
          [255-0]      [255-0]     [255-0]      [255-0]
//------------------------------------------------------------------------- 

// event driven program: event is user and ui interaction is event.
        awt -library file(abstract window toolkit) for gui
        compent-bottton,txt box,label,text field
 */

/**
 * oops
 */
public class oops {

    public static void main(String[] args) {
     //System.out.println("hh");
    }
}