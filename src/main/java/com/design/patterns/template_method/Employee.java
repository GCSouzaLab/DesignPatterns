package com.design.patterns.template_method;

import java.math.BigDecimal;

public abstract class Employee {

    BigDecimal salary;

    abstract BigDecimal calculateDiscounts();

    abstract BigDecimal calculateHealthPlan();

    abstract BigDecimal calculateOtherDiscounts();

    BigDecimal calculateSalary() {
        BigDecimal baseDiscounts = calculateDiscounts();
        BigDecimal healthPlan = calculateHealthPlan();
        BigDecimal otherDiscounts = calculateOtherDiscounts();
        return this.salary.subtract(baseDiscounts).subtract(healthPlan).subtract(otherDiscounts);
    }
}
