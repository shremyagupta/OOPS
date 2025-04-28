public class constuctor{
    public static void main(String args[]){
        Students s1 = new Students();
        s1.name =  "Shremya";
        s1.rollno = 434;
        s1.password ="abc";
        s1.marks[0]= 100;
        s1.marks[1]= 90;
        s1.marks[2]=56;


        Students s2= new Students(s1);//copy
        s2.password="xyz";
        for(int i =0 ; i<3 ; i++){
            System.out.println(s2.marks[i]);
        }

        
        //Students s2 = new Students("Shremya");
       // Students s3 = new Students("34");
       // System.out.println(s1.name);
    }
}
class Students{
    String name ;
    int rollno;
    String password;
    int marks[];

    //shallow copy contructor
    //Students(Students s1){
      //  marks = new int[3];
        //this.name= s1.name;
        //this.rollno = s1.rollno;
        //this.marks = s1.marks; 

   // }
   //deep copy constructor
    Students (Students s1){
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        for(int i=0; i<marks.length; i++)
       //System.out.println("Constructor is called...");
    }
    Students(String name){
        marks = new int[3];
        this.name = name;
    }
    Students(int roll){
        marks = new int[3];
        this.rollno = rollno;
        System.out.println("65");
    }
}