import java.util.Objects;

public class Employees {
    private String firstName;
    private String surname;
    private String lastName;
    private int department;
    private double salary;

    private final long id = count;
    private static long count = 1L;

    public Employees(String surname, String firstName, String lastName, int department, int salary) {
        this.surname = surname;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        count++;
    }

    public String toString() {
        return "ФИО " + surname + " " + firstName + " " + lastName + " Отдел " + department + " Зарплата " + salary + " сотрудник номер " + id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return id == employees.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
