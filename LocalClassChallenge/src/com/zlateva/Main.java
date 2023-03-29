package com.zlateva;

import com.zlateva.domain.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("John", "Smith", "01/05/2013");
        Employee e2 = new Employee("Eddy", "Mad", "04/12/2012");
        Employee e3 = new Employee("Phil", "Path", "09/05/2000");
        Employee e4 = new Employee("John", "Ralph", "01/05/2013");
        Employee e5 = new Employee("Sam", "Duf", "27/06/2011");

        List<Employee> list = new ArrayList<>(Arrays.asList(e1, e2, e3, e4, e5));
        printOrderedList(list, "name");
        System.out.println("-------");
        printOrderedList(list, "year");
    }


    public static void printOrderedList(List<Employee> eList, String sortField) {

        int currentYear = LocalDate.now().getYear();

        class MyEmployee {
            Employee containedEmployee;
            int yearsWorked;
            String fullName;

            public MyEmployee(Employee containedEmployee) {
                this.containedEmployee = containedEmployee;
                try {
                    yearsWorked = currentYear - Integer.parseInt(
                            containedEmployee.hireDate().split("/")[2]);
                } catch (NumberFormatException nf) {
                    System.out.println("Year initialization was failure " + nf + "was inserted");
                }

                fullName = String.join(" ", containedEmployee.fName(), containedEmployee.lName());
            }

            @Override
            public String toString() {
                return String.format("%s has been an employee for %d years", fullName, yearsWorked);
            }
        }

        List<MyEmployee> list1 = new ArrayList<>();
        for (Employee employee : eList) {
            list1.add(new MyEmployee(employee));
        }
        var comparator = new Comparator<MyEmployee>() {

            @Override
            public int compare(MyEmployee o1, MyEmployee o2) {
                if (sortField.equals("name")) {
                    return o1.fullName.compareTo(o2.fullName);
                }
                return o1.yearsWorked - o2.yearsWorked;
            }
        };

        list1.sort(comparator);
        for (MyEmployee myEmployee : list1) {
            System.out.println(myEmployee);
        }
    }
}