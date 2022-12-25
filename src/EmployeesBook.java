public class EmployeesBook {

    private static Employees[] employees = new Employees[10];

    {
        employees[0] = new Employees("Иванов", "Иван", "Иванович", 1, 10000);
        employees[1] = new Employees("Алексеев", "Алексей", "Алексеевич", 2, 20000);
        employees[2] = new Employees("Викторов", "Виктор", "Викторович", 3, 30000);
        employees[3] = new Employees("Денисов", "Денис", "Денисович", 4, 40000);
        employees[4] = new Employees("Андреев", "Андрей", "Андреевич", 5, 50000);
        employees[5] = new Employees("Александров", "Александр", "Александрович", 1, 60000);
        employees[6] = new Employees("Георгиев", "Георгий", "Георгиевич", 2, 70000);
        employees[7] = new Employees("Максимов", "Максим", "Максимович", 3, 80000);
        employees[8] = new Employees("Петров", "Петр", "Петрович", 4, 90000);
        employees[9] = new Employees("Ярославов", "Ярослав", "Ярославович", 5, 100000);
    }


    public void printAllEmployees() {
        for (Employees employees : employees) {
            System.out.println(employees);
        }
    }

    public double sumSalary() {
        double sum = 0d;
        for (Employees employees : employees) {
            if (employees != null) {
                sum += employees.getSalary();
            }
        }
        return sum;
    }

    public void printSumSalary() {
        System.out.println(sumSalary());
    }

    public double avgSalary() {
        double avg = 0d;
        for (Employees employees : employees) {
            if (employees != null) {
                avg += employees.getSalary() / 10;
            }
        }
        return avg;
    }

    public void printAvgSalary() {
        System.out.println(avgSalary());
    }

    public int getFirstNotNullIndex() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                return i;
            }
        }
        throw new RuntimeException("Нет ни одного работника!");
    }

    public Employees getMinSalary() {
        Employees employeeWithMinSalary = employees[getFirstNotNullIndex()];
        for (int i = getFirstNotNullIndex() + 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employees[i];
            }
        }
        return employeeWithMinSalary;
    }

    public void printMinSalary() {
        System.out.println(getMinSalary());
    }

    public Employees getMaxSalary() {
        Employees employeeWithMaxSalary = employees[getFirstNotNullIndex()];
        for (int i = getFirstNotNullIndex() + 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employees[i];
            }
        }
        return employeeWithMaxSalary;
    }

    public void printMaxSalary(){
        System.out.println(getMaxSalary());
    }
}







