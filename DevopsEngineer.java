class DevopsEngineer extends Employee{
    private double bonus;
public DevopsEngineer(String name,double salary,int id,double bonus){
    super(name,salary,id);
    this.bonus=bonus;
}
public double CalculateTotalSalary(){
    return salary+bonus;
}
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Bonus:$"+bonus);
        System.out.println("total salary:$"+CalculateTotalSalary());
    }
}
