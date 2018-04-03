package com.sampleMaven;

public class Employee_Demo
{
    String name;
    int monthly_salary;
    int emp_id;
    static String company_name = "IBM";
    static int counter = 0;
    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
        this.emp_id = set_Id();
    }
    static int set_Id()
    {
        counter++;
        return counter;
    }
    /**
     * @return the monthly_salary
     */
    public double getMonthly_salary()
    {
        return monthly_salary;
    }
    /**
     * @param monthly_salary the monthly_salary to set
     */
    public void setMonthly_salary(int monthly_salary)
    {
        this.monthly_salary = monthly_salary;
    }
    void print()
    {
        System.out.println(" Emp_name : " + this.name + " Emp_id : " + this.emp_id );
        System.out.println(" Company Name : " + Employee_Demo.company_name);
    }

}
