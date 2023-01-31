import java.util.Objects;

public class NhanVien{
    private String employeeCode;
    private String name;
    private int age;
    private String phone;
    private String email;

    public NhanVien(String employeeCode, String name, int age, String phone, String email) {
        this.employeeCode = employeeCode;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
