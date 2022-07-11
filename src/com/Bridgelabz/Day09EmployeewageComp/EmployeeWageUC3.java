package com.Bridgelabz.Day09EmployeewageComp;

public class EmployeeWageUC3 {
    static int WagePerHour = 20;
    static int FullDayHour = 8;
    static int PartTimeHour = 4;

    public static void main(String[] args) {
                                                                /*
                                                                 * generating random number 0, 1, 2
                                                                 * if o then Employee is Absent
                                                                 * if 1 then Employee Present and claculating wages
                                                                 * if 2 then Employee is doing Half day and calculating wages
                                                                 */

        System.out.println("Welcome to Employee Wage Problem::");
        int dailyWages = 0;
        int attendance = (int) Math.floor(Math.random() * 10) % 3;
        if (attendance == 0)
            System.out.println("Emloyee is absent");
        else if (attendance == 1) {
            System.out.println("Employee is present");
            dailyWages = WagePerHour * FullDayHour;
            System.out.println("Wages of the day is  " + dailyWages);
        } else {
            System.out.println("Employee is present for the Half day");
            dailyWages = WagePerHour * PartTimeHour;
            System.out.println("Wages of the day for part time " + dailyWages);
        }
    }
}
