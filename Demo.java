class Employee{
    protected String name;
    protected double salary;
    protected int id;
    public Employee(String name,double salary,int id){
        this.name=name;
        this.salary=salary;
        this.id=id;
    }
    public void displayDetails(){
        System.out.println("name is:"+name);
        System.out.println("salary is $"+salary);
        System.out.println("id is $"+id);
    }
}
public class Demo {
    public static void main(String[] args) {
        
   DevopsEngineer d1=new DevopsEngineer("John",60000,1,50000);
    
    System.out.println("Devops Engineer Details");
    d1.displayDetails();
    }

}