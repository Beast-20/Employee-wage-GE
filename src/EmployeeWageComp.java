class Employee{
     private int wage_rate = 20;
     private int fulltime_hrs = 8;
     private int parttime_hrs = 4;
     private int workingdays = 20;
     String type;

     public Employee(String type){
        this.type = type;
     }

     //UC1(To check the attendance)
     public boolean attendance_check(){
        double rand = Math.random();
        if(rand>0.5){
            return true;
        }
        return false;
     }

     //UC2(To check daily employee wage)

    public void getFulltimewage(){
        if(this.type!="FULL"){
            System.out.println("Sorry! But this employee is not full time");
        }
        else{
            int dailywage = wage_rate*fulltime_hrs;
            System.out.println("The daily wage of this "+this.type+" employee is:- "+dailywage);
        }
    }

    //UC3(To check part time employee wage)
    public void getPartTimewage(){
        if(this.type!="PART"){
            System.out.println("Sorry! But this employee is not part time");
        }
        else{
            int dailywage = wage_rate*parttime_hrs;
            System.out.println("The daily wage of this "+this.type+" employee is:- "+dailywage);
        }
    }

    //UC4(Getting wage by swithcase)
    public void getEmployeewage(){
        switch (type) {
            case "FULL":
                System.out.println("The daily wage of this "+this.type+" employee is:- "+ wage_rate*fulltime_hrs);
                break;
        
            case "PART":
            System.out.println("The daily wage of this "+this.type + "employee is:- "+wage_rate*parttime_hrs);
                break;
        }
    }

    //UC5(Getting monthly wages of employee)
    public void getMonthlywage(){
        int totalhrs;
        if(this.type=="FULL"){
            totalhrs = workingdays*fulltime_hrs;
        }
        else{
            totalhrs = workingdays*parttime_hrs;
        }
        int monthly_wage = totalhrs*wage_rate;
        System.out.println("Monthly wage of this "+this.type+" employee is:- "+monthly_wage);


    }

    //UC6(Getting total wage till a condition is reached)
    public void getTotalwage(){
        int working_hrs = 0;
        int number_of_days = 0;

        for(int i =1;i<=30;i++){
            if(this.attendance_check()==true){
                if(this.type=="FULL"){
                    working_hrs += fulltime_hrs;
                }
                else{
                    working_hrs+=parttime_hrs;
                }
                number_of_days++;
            }
            if(number_of_days==20 || working_hrs>=100){
                System.out.println("The total wage of this "+this.type+" employee is:- "+working_hrs*wage_rate);
                break;
            }
        }
    }
       
}
public class EmployeeWageComp{
    public static void main(String[] args) {
        System.out.println("Hello! Welcome to Employee Wage Computation Program");

        //employee1
        Employee e1 = new Employee("FULL");
        //employee2
        Employee e2 = new Employee("PART");

        //Getting attendance
        System.out.println(e1.attendance_check());
        System.out.println(e2.attendance_check());

        //Getting Full time daily wage
        e1.getFulltimewage();

        //Getting Part time daily wage
        e2.getPartTimewage();

        //Getting wage with the use of switch case
        e1.getEmployeewage();
        e2.getEmployeewage();

        //Getting total monthly wage
        e1.getMonthlywage();
        e2.getMonthlywage();
    }
}
 
