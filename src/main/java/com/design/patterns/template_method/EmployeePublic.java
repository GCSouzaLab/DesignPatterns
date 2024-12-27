package com.design.patterns.template_method;

import java.math.BigDecimal;

public class EmployeePublic extends Employee {

    public EmployeePublic(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public BigDecimal calculateDiscounts() {
        return this.salary.multiply(new BigDecimal("0.15"));
    }

    @Override
    public BigDecimal calculateHealthPlan() {
        return this.salary.multiply(new BigDecimal("0.08"));
    }

    @Override
    public BigDecimal calculateOtherDiscounts() {
        return this.salary.multiply(new BigDecimal("0.145"));
    }
}
