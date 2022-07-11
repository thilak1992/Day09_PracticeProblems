package com.Bridgelabz.Day09EmployeewageComp;

public class EmployeeWageUC1 {
    public static void main(String[] args) {
                                                    /*
                                                     * generating random number 0, 1, 2
                                                     * if o then Employee is Absent
                                                     * if 1 then present
                                                     * if 2 then Employee is doing Half day
                                                     */
        System.out.println("Welcome to Employee Wage Problem");
        int attendance = (int) Math.floor(Math.random() * 10) % 3;
        if (attendance == 0)
            System.out.println("Emloyee is absent");
        else if (attendance == 1)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is present for the Half day");
    }
}
