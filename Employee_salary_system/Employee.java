import java.util.Scanner;
public class Employee{
    public String name;
    public double basicSalary;

    public Employee(String name,double basicSalary){
        this.name=name;
        this.basicSalary=basicSalary;
    }
    void getEmployeeSalary(){
         double bonus;
         if(basicSalary>30000){
           bonus =basicSalary*0.1;
            System.out.println("your bonus is " + bonus);
         }
         else{
            bonus =basicSalary*0.05;
            System.out.println("your bonus is " + bonus);
         }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name:");
        String name= input.next();

        System.out.println("Basic salary:" );
        double salary = input.nextDouble(); 
        Employee myEmployee = new Employee(name, salary);

      
        
        myEmployee.getEmployeeSalary();
    }
}