public class EmployeeWageComp{
    public static void main(String[] args ) {
        System.out.println("Hello! Welcome to Employee Wage Computation Program");

        EmpBuilder builder = new EmpBuilder();
         
        builder.add_company("GE Digital", 50, 8, 5, 25);
        builder.add_company("BridgeLabz", 40, 8, 4, 20);

        Employee e1 = new Employee("E1", "FULL", builder.get_company("GE Digital"));
        Employee e2 = new Employee("E2", "PART", builder.get_company("BridgeLabz"));
        
        System.out.println("Full time wage of "+e1.name+" is"+ e1.getFulltimewage());
        System.out.println("Full time wage of "+e2.name+" is"+ e2.getPartTimewage());

        builder.get_daily_company_wage("GE Digital");
        builder.get_daily_company_wage("BridgeLabz");
        builder.get_monthly_company_wage("GE Digital");
        builder.get_monthly_company_wage("BridgeLabz");
        Employee e3 = new Employee("E2", "FULL", builder.get_company("BridgeLabz"));
        builder.get_monthly_company_wage("BridgeLabz");
        
        


        
}
}
 