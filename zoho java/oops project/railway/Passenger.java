public class Passenger {
    static int id=1;
    String name;
    int age;
    String gender;
    String berthPerferenes;
    int passengerId=id++;
    String alloted;
    int seatNumber;
    public Passenger(String name,int age,String gender,String berthperferences)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.berthPerferenes=berthperferences;
        alloted=" ";
        seatNumber=-1;
    }
}
