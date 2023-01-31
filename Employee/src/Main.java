import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        System.out.println(manager.nhanViens);
        System.out.println("----------------------------------");
        System.out.println("Trung bình lương tất cả nhân viên công ty là : " + manager.averageSalary());
        System.out.println("----------------------------------");
        System.out.println("Danh sách nhân viên Fulltime lương thấp hơn trung bình: ");
        manager.checkSalaryFulltime();
        System.out.println("----------------------------------");
        System.out.println("Số tiền phải trả cho nhân viên parttime là: " + manager.totalSalaryParttime());
        System.out.println("----------------------------------");
        System.out.println("Xếp lương nhân viên fulltime theo thứ tự từ thấp đến cao: ");
        manager.sortSalary();

    }
}