package EmployeeObjects;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import EmployeeBlueprints.Employee;

import static org.junit.jupiter.api.Assertions.*;

class HourlyEmployeeTest {
    HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
    @Test
    void increaseHoursTest() {
        emp.increaseHours(16);
        assertEquals(16, emp.getHoursWorked());
        emp.increaseHours(-10);
        assertEquals(-10, emp.getHoursWorked());
    }
    @Test
    void raiseHoursTest(){
        emp.annualRaise();
        assertEquals(32.50, emp.getWage());
    }
    @Test
    void calculateWeeklyPay35(){
        emp.resetWeek();
        emp.increaseHours(35);
        assertEquals(35, emp.calculateWeeklyPay());
    }

    @Test
    void calculateWeeklyPay45(){
        emp.resetWeek();
        emp.increaseHours(45);
        assertEquals(45, emp.calculateWeeklyPay());
    }
}