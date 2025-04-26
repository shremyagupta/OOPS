public class constuctor{
    public static void main(String args[]){
        Students s1 = new Students("Shremya");
        System.out.println(s1.name);
    }
}
class Students{
    String name ;
    int rollno;
    Students(String name){
        this.name = name;
    }
}