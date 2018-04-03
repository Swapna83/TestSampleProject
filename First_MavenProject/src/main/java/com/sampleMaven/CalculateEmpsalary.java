package com.sampleMaven;

public class CalculateEmpsalary
{
    public int calculateYearlySalary(Employee_Demo emp)
    {
        int yearlySalary = 0;
        yearlySalary = (int) (emp.getMonthly_salary() * 12);
        return yearlySalary;
    }
}
