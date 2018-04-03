package com.sampleMaven.Test;

import com.sampleMaven.CalculateEmpsalary;
import com.sampleMaven.Employee_Demo;

import junit.framework.TestCase;
public class TestEmployee_Demo extends TestCase
{
    CalculateEmpsalary empSal = new CalculateEmpsalary();
    Employee_Demo empnew = new Employee_Demo();

    //@Test
    public void testcalculateYearlySalary()
    {
        empnew.setName("abc");
        empnew.setMonthly_salary(5000);
    
        double salary = empSal.calculateYearlySalary(empnew);
        assertEquals(60000.0, salary);
    }
    
}
