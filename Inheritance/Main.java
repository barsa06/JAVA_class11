class Student{
    int grade = 10;
    public void Study(){
        
    }
}
class features extends Student{
int id = 1;
String name = "Barsha";
String hobby = "listening music";
}
public class Main{
    public static void main(String args[]){
        features f = new features();
        System.out.println("id: " + f.id);
        System.out.println("class: " + f.grade);
        System.out.println("name: " + f.name);
        System.out.println("hobby: " + f.hobby);
    }
}