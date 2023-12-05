public interface BuilderInterface {
    
    public void add_company(String name, int wage_rate, int fulltime_hrs, int parttime_hrs, int workingdays);

    public void get_monthly_company_wage(String name);

    public void get_daily_company_wage(String name);
}
