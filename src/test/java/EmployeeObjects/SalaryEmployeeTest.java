package EmployeeObjects;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SalaryEmployeeTest {
    SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);

    @Test
    void weeklySalaryTest() {
        emp.calculateWeeklyPay();
        assertEquals(1237.02, Math.round((emp.getSalary()/52 * 100) / 100.0));
    }

    @Test
    void bonusSalaryTest() {
        emp.holidayBonus();
        assertEquals(2164.54, Math.round((emp.getSalary()*0.03365 * 100) / 100.0));
    }
}