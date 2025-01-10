package com.design.patterns.behavioral.template_method;

import java.math.BigDecimal;

public class TemplateMethodApplication {
    public static void main(String[] args) {
        System.out.println("Template Method Pattern");

        EmployeeCLT clt = new EmployeeCLT(BigDecimal.valueOf(1500));
        BigDecimal salaryCLTEmployee = clt.calculateSalary();
        System.out.println("CLT Employee Salary: " + salaryCLTEmployee);

        EmployeePJ pj = new EmployeePJ(BigDecimal.valueOf(3200));
        BigDecimal salaryPJEmployee = pj.calculateSalary();
        System.out.println("PJ Employee Salary: " + salaryPJEmployee);

        EmployeePublic publicEmployee = new EmployeePublic(BigDecimal.valueOf(4000));
        BigDecimal salaryPublicEmployee = publicEmployee.calculateSalary();
        System.out.println("Public Employee Salary: " + salaryPublicEmployee);
    }
}
