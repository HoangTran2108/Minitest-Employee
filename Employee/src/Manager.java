import java.util.*;

public class Manager {
    public ArrayList<NhanVien> nhanViens;

    public Manager() {
        nhanViens = new ArrayList<>();
        nhanViens.add(new NhanVienFulltime("f1", "Nam", 26, "023456789", "Nam@gmail.com", 100, 100, 2000000));
        nhanViens.add(new NhanVienFulltime("f2", "Nam1", 25, "0230456789", "Nam1@gmail.com", 1000, 100, 8000000));
        nhanViens.add(new NhanVienFulltime("f3", "Nam2", 24, "0213456789", "Nam2@gmail.com", 800, 100, 4000000));
        nhanViens.add(new NhanVienParttime("p1", "Lực", 26, "0345600789", "Luc@gmail.com", 30));
        nhanViens.add(new NhanVienParttime("p2", "Lực1", 25, "0903456789", "Luc1@gmail.com", 60));
        nhanViens.add(new NhanVienParttime("p3", "Lực2", 22, "097456789", "Luc2@gmail.com", 50));
    }

    public double averageSalary() {
        double totalSalary = 0;
        double averageSalary = 0;
        for (NhanVien nhanVien : nhanViens) {
            if (nhanVien instanceof NhanVienParttime) {
                totalSalary += ((NhanVienParttime) nhanVien).salaryPartTime();
            }
            if (nhanVien instanceof NhanVienFulltime) {
                totalSalary += ((NhanVienFulltime) nhanVien).salaryFullTime();
            }
        }
        return averageSalary = totalSalary / nhanViens.size();
    }

    public void checkSalaryFulltime() {
        for (NhanVien nhanVien : nhanViens) {
            if (nhanVien instanceof NhanVienFulltime) {
                if (((NhanVienFulltime) nhanVien).salaryFullTime() < averageSalary()) {
                    System.out.println(nhanVien.getName() + " : " + ((NhanVienFulltime) nhanVien).salaryFullTime());
                }
            }
        }
    }

    public double totalSalaryParttime() {
        double totalSalaryParttime = 0;
        for (NhanVien nhanVien : nhanViens) {
            if (nhanVien instanceof NhanVienParttime) {
                totalSalaryParttime += ((NhanVienParttime) nhanVien).salaryPartTime();
            }
        }
        return totalSalaryParttime;
    }
    public void sortSalary(){
        List<NhanVienFulltime> nhanVienFulltimes = new ArrayList<>();
        for (NhanVien nhanvien: nhanViens) {
            if (nhanvien instanceof NhanVienFulltime) {
                nhanVienFulltimes.add((NhanVienFulltime) nhanvien);
            }
        }
        Collections.sort(nhanVienFulltimes);
        System.out.println(nhanVienFulltimes);
    }
}

