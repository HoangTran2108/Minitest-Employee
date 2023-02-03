package Controller;

import model.Employee;
import model.EmployeeFullTime;
import model.EmployeePartTime;

import java.util.*;

public class Manager {
    public List<Employee> employees;

    public Manager(List<Employee> employees) {
        this.employees = employees;
    }
    public Manager() {
        employees = new ArrayList<>();
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void display() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    int index;
    Scanner input = new Scanner(System.in);
    public void editEmployee(Employee employee) {
        System.out.print("Nhập vị trí muốn sửa: ");
        index = input.nextInt();
        for (int i = 0; i < employees.size(); i++) {
            if (i == index) {
                employees.set(i, employee);
            }
        }
    }

    public void removeEmployee() {
        System.out.print("Nhập vị trí muốn xóa: ");
        index = input.nextInt();
        for (int i = 0; i < employees.size(); i++) {
            if (i == index) {
                employees.remove(i);
            }
        }
    }

    public double averageSalary() {
        double totalSalary = 0;
        double averageSalary = 0;
        for (Employee employee : employees) {
            if (employee instanceof EmployeePartTime) {
                totalSalary += ((EmployeePartTime) employee).salaryPartTime();
            }
            if (employee instanceof EmployeeFullTime) {
                totalSalary += ((EmployeeFullTime) employee).salaryFullTime();
            }
        }
        return averageSalary = totalSalary / employees.size();
    }

    public String checkSalaryFullTime() {
        StringBuilder nameEmployeeFullTimes = new StringBuilder();
        for (Employee employee : employees) {
            if (employee instanceof EmployeeFullTime) {
                if (((EmployeeFullTime) employee).salaryFullTime() < averageSalary()) {
                    nameEmployeeFullTimes.append("\t").append(employee.getName()).append("\n");
                }
            }
        } return nameEmployeeFullTimes.toString();
    }

    public double totalSalaryPartTime() {
        double totalSalaryParttime = 0;
        for (Employee employee : employees) {
            if (employee instanceof EmployeePartTime) {
                totalSalaryParttime += ((EmployeePartTime) employee).salaryPartTime();
            }
        }
        return totalSalaryParttime;
    }
    public List<EmployeeFullTime> sortSalary(){
        List<EmployeeFullTime> employeeFullTimes = new ArrayList<>();
        for (Employee staff: employees) {
            if (staff instanceof EmployeeFullTime) {
                employeeFullTimes.add((EmployeeFullTime) staff);
            }
        }
        Collections.sort(employeeFullTimes);
        return employeeFullTimes;
    }
}

