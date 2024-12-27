package com.design.patterns.template_method;

import java.math.BigDecimal;

public class EmployeePJ extends Employee {

    public EmployeePJ(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    BigDecimal calculateDiscounts() {
        return this.salary.multiply(new BigDecimal("0.125"));
    }

    @Override
    BigDecimal calculateHealthPlan() {
        return this.salary.multiply(new BigDecimal("0.15"));
    }

    @Override
    BigDecimal calculateOtherDiscounts() {
        return this.salary.multiply(new BigDecimal("0.10"));
    }
}
