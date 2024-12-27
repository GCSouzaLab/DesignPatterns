package com.design.patterns.template_method;

import java.math.BigDecimal;

public class EmployeeCLT extends Employee {

    public EmployeeCLT(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    BigDecimal calculateDiscounts() {
        return this.salary.multiply(new BigDecimal("0.27"));
    }

    @Override
    BigDecimal calculateHealthPlan() {
        return this.salary.multiply(new BigDecimal("0.06"));
    }

    @Override
    BigDecimal calculateOtherDiscounts() {
        return this.salary.multiply(new BigDecimal("0.10"));
    }
}
