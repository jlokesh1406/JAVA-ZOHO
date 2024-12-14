package packeage0.package1;


public class student_bio
{
    public int rno=2111103;  
    public String name;
    public float marks;
    public static int ctr;
        public student_bio(int rno,String str,float d)
        {
            this.rno=rno;
            this.name=str;
            this.marks=d;
            student_bio.ctr+=1;  // also work this.ctr+=1;
            //class.variable name
        }
}

