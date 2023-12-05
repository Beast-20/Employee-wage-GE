class Employee{
    String name;
    String type;

    Company company;

     public Employee(String name, String type, Company company){
       this.name = name;
       this.type = type;
       this.company = company;
       company.list_of_employees.add(this);
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

   public int getFulltimewage(){
       if(this.type!="FULL"){
           System.out.println("Sorry! But this employee is not full time");
           return -1;
       }
       else{
           int dailywage = company.wage_rate*company.fulltime_hrs;
           return dailywage;
       }
   }

   //UC3(To check part time employee wage)
   public int getPartTimewage(){
       if(this.type!="PART"){
           System.out.println("Sorry! But this employee is not part time");
           return -1;
       }
       else{
           int dailywage = company.wage_rate*company.parttime_hrs;
           return dailywage;
       }
   }

   //UC4(Getting wage by swithcase)
   public int getEmployeewage(){
       switch (type) {
           case "FULL":
              
               return company.wage_rate*company.fulltime_hrs;
               //break;
       
           case "PART":
   
               return company.wage_rate*company.parttime_hrs;
       }
       return -1;

   }

   //UC5(Getting monthly wages of employee)
   public int getMonthlywage(){
       int totalhrs;
       if(this.type=="FULL"){
           totalhrs = company.workingdays*company.fulltime_hrs;
       }
       else{
           totalhrs = company.workingdays*company.parttime_hrs;
       }
       int monthly_wage = totalhrs*company.wage_rate;
       return monthly_wage;

   }

   //UC6(Getting total wage till a condition is reached)
   public int getTotalwage() {
       int working_hrs = 0;
       int number_of_days = 0;
       for (int i = 1; i <= 30; i++) {
           if (this.attendance_check()) {
               if (this.type.equals("FULL")) {
                   working_hrs += company.fulltime_hrs;
               } else {
                   working_hrs += company.parttime_hrs;
               }
               number_of_days++;
           }
           if (number_of_days == company.workingdays || working_hrs >= 100) {
               break;
           }
       }
       return working_hrs*company.wage_rate;

   }
   
      
}