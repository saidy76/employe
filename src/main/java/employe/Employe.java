package employe;

public class Employe {
    private String name;
    private int id;
    private double salary;
    private String designation;
 
   public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    
    public int getid(){
        return id;
    }
    public void setid(int id){
        this.id=id;
        
    }
    public double getsalary(){
        return salary;
    }
    public void setsalary(double salary){
        this.salary=salary;
    }
      public String getdesignation(){
        return designation;
    }
    public void setdesignation(String designation){
        this.designation=designation;
    }
    

    public static void main(String[] args) {
        Employe man1 = new Employe();
        man1.setname("Akash");
        man1.setid(101);
        man1.setdesignation("CEO");
        man1.setsalary(50000.00);
        
        Employe man2 = new Employe();
        man2.setname("Abir");
        man2.setid(102);
        man2.setdesignation("MD");
        man2.setsalary(45000.00);
        
            Employe man3 = new Employe();
        man3.setname("Arif");
        man3.setid(103);
        man3.setdesignation("worker");
        man3.setsalary(30000.00);
        
         System.out.println("Employee 1:");
       System.out.println("Name " +man1.getname());
        System.out.println("id: " +man1.getid());
         System.out.println("designation: " +man1.getdesignation());
          System.out.println("Salary: " +man1.getsalary());
          
          System.out.println("Employee 2:");
       System.out.println("Name " +man2.getname());
        System.out.println("id: " +man2.getid());
         System.out.println("designation: " +man2.getdesignation());
          System.out.println("Salary: " +man2.getsalary());
          
         System.out.println("Employee 3:");
       System.out.println("Name " +man3.getname());
        System.out.println("id: " +man3.getid());
         System.out.println("designation: " +man3.getdesignation());
          System.out.println("Salary: " +man3.getsalary());
          
    }
}
