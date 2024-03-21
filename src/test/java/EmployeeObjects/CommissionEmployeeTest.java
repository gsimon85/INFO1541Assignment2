package EmployeeObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommissionEmployeeTest {
    CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);
    @Test
    void increaseSalesTest() {
        emp.increaseSales(10);
        assertEquals(10, emp.getSales());
    }
    @Test
    void increaseSalesTest2() {
        emp.increaseSales(-10);
        assertEquals(-10, emp.getSales());
    }

    @Test
    void holidayBonusTest() {
        emp.holidayBonus();
        assertEquals(0, emp.getSales());
    }
    @Test
    void annualRaiseTest() {
        emp.annualRaise();
        emp.annualRaise();
        assertEquals(0.0305, emp.getRate());
    }

}