
public class Main {
    static Employee[] employees = new Employee[10];

    public void printEmployee() {
        System.out.print("список всех сотрудников:");
        System.out.println();
        for (Employee i : employees) {
            System.out.println(i);
        }
    }

    public int sumSalary() {
        int sum = 0;
        for (Employee employees : employees) {
            if (employees != null) {
                sum += employees.getSalary();
            }
        }
        return sum;
    }

    public Employee minSalary() {
        Employee min = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < min.getSalary()) {
                min = employees[i];
            }
        }
        return min;
    }

    public Employee maxSalary() {
        Employee max = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > max.getSalary()) {
                max = employees[i];
            }
        }
        return max;
    }

    public double midSalary() {
        double mid = 0;
        double sum = 0;
        for (Employee employees : employees) {
            if (employees != null) {
                sum += employees.getSalary();
            }
        }
        mid = sum / employees.length;
        return mid;
    }

    public void printName() {
        System.out.print("Имена всех сотрудников:");
        System.out.println();
        for (Employee i : employees) {
            System.out.println(i.getName());
        }
    }

    public void indexSalary(Employee employee[], double index) {
        for (Employee e : employees) {
            if (employees != null) {
                e.setSalary(e.getSalary() + e.getSalary() * index / 100);
            }
        }
    }

    public static Employee employeeWithMinSalary(Employee employees[], int department) {
        Employee employeeWithMinSalary = null;
        for (Employee e : employees) {
            if (e.getDepartment() == department && (employeeWithMinSalary == null || e.getSalary() < employeeWithMinSalary.getSalary())) {
                employeeWithMinSalary = e;
            }
        }
        return employeeWithMinSalary;
    }

    public static Employee employeeWithMaxSalary(Employee[] employees, int department) {
        Employee employeeWithMaxSalary = null;
        for (Employee e : employees) {
            if (e.getDepartment() == department
                    && (employeeWithMaxSalary == null || e.getSalary() > employeeWithMaxSalary.getSalary())) {
                employeeWithMaxSalary = e;
            }
        }
        return employeeWithMaxSalary;
    }


    public static double sumSalaryInDepartment(int department) {
        double sum = 0;
        for (Employee e : employees) {
            if (e.getDepartment() == department) {
                sum += e.getSalary();
            }
        }
        return sum;
    }

    public static double midSalaryInDepartment(int department) {
        double sum = 0;
        int quantity = 0;
        for (Employee e : employees) {
            if (e.getDepartment() == department) {
                sum += e.getSalary();
                quantity++;
            }
        }
        return sum / quantity;
    }

    public static void indexSalaryInDepartment(Employee[] employees, int department, double percent) {
        for (Employee e : employees) {
            if (e.getDepartment() == department) {
                e.setSalary(e.getSalary() + e.getSalary() * percent / 100);
            }
        }
    }

    public static void printNameInDepartment(int department) {
        System.out.println("Сотрудники отдела" + department + ":");
        for (Employee e : employees) {
            if (e.getDepartment() == department) {
                System.out.println(e.getName() + " " + e.getSalary() + " " + e.getId());
            }
        }
    }

    public static void salaryMinThanIt(int salary) {
        for (Employee e : employees) {
            if (e.getSalary() < salary) {
                System.out.println("id = " + e.getId() + " name = " + e.getName() + " salary = " + e.getSalary());
            }
        }
    }

    public static void salaryMaxThanIt(int salary) {
        for (Employee e : employees) {
            if (e.getSalary() >= salary) {
                System.out.println("id = " + e.getId() + " name = " + e.getName() + " salary = " + e.getSalary());
            }
        }
    }


    public static void main(String[] args) {
        employees[0] = new Employee("Анисимов Сергей Иванович", 1, 15_000);
        employees[1] = new Employee("Боровикин Александр Петрович", 1, 17_000);
        employees[2] = new Employee("Венский Михаил Игнатьевич", 2, 19_000);
        employees[3] = new Employee("Гроздьев Виктор Петрович", 2, 22_000);
        employees[4] = new Employee("Добровольский Виталий Николаевич", 3, 24_000);
        employees[5] = new Employee("Елкин Василий Ильич", 3, 24_000);
        employees[6] = new Employee("Железняк Андрей Александрович", 4, 31_000);
        employees[7] = new Employee("Зотов Юрий Сергеевич", 4, 30_000);
        employees[8] = new Employee("Игнатов Лев Романович", 5, 27_000);
        employees[9] = new Employee("Калинин Евгений Денисович", 5, 28_000);

        System.out.println();
        printEmployee();
        System.out.println("sumSalary() = " + sumSalary());
        System.out.println("minSalary() = " + minSalary());
        System.out.println("maxSalary() = " + maxSalary());
        System.out.println("midSalary() = " + midSalary());
        printName();
        indexSalary(employees, 50);
        printEmployee();
        System.out.println(employeeWithMinSalary(employees, 4));
        System.out.println(employeeWithMaxSalary(employees, 2));
        System.out.println("sumSalaryInDepartment(3) = " + sumSalaryInDepartment(3));
        System.out.println("midSalaryInDepartment(5) = " + midSalaryInDepartment(5));
        System.out.println();
        indexSalaryInDepartment(employees, 1, 10);
        printEmployee();
        printNameInDepartment(1);
        salaryMinThanIt(30000);
        salaryMaxThanIt(40000);
    }
}