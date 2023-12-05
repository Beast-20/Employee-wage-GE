import java.util.ArrayList;

class Company {
    String name;
    int wage_rate;
    int fulltime_hrs;
    int parttime_hrs;
    int workingdays;
    ArrayList<Employee> list_of_employees;

    public Company(String name, int wage_rate, int fulltime_hrs, int parttime_hrs, int workingdays){
        this.name = name;
        this.wage_rate = wage_rate;
        this.fulltime_hrs = fulltime_hrs;
        this.parttime_hrs = parttime_hrs;
        this.workingdays = workingdays;
        this.list_of_employees = new ArrayList<>();
    }
}
