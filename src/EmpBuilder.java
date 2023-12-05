import java.util.ArrayList;
import java.util.HashMap;

public class EmpBuilder implements BuilderInterface {
    HashMap<String, Company> companies;

    public EmpBuilder(){
        this.companies = new HashMap<String, Company>();
    }

    public void add_company(String name, int wage_rate, int fulltime_hrs, int parttime_hrs, int workingdays){
        Company c = new Company(name,wage_rate,fulltime_hrs,parttime_hrs,workingdays);
        companies.put(name,c);
    }

    public Company get_company(String name){
        if(companies.containsKey(name)==true){
            return companies.get(name);
        }
        return null;
    }

    public void get_monthly_company_wage(String name){
        if(this.companies.containsKey(name)==false){
            System.out.println("No company found of this name!");
            return;
        }
        ArrayList<Employee> employees = this.companies.get(name).list_of_employees;
        int total_monthly_wage = 0;
        for(int i = 0;i<employees.size();i++){
            total_monthly_wage+=employees.get(i).getMonthlywage();
        }
        System.out.println("Monthly wage of "+name+" company is "+total_monthly_wage);
    }

    public void get_daily_company_wage(String name){
        if(this.companies.containsKey(name)==false){
            System.out.println("No company found of this name!");
            return;
        }
        int total_daily_wage = 0;
        ArrayList<Employee> employees = this.companies.get(name).list_of_employees;
        for(int i = 0;i<employees.size();i++){
            total_daily_wage+=employees.get(i).getEmployeewage();
        }
        System.out.println("Daily wage of "+name+" company is "+total_daily_wage);
    }

}
