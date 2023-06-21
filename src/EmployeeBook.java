public class EmployeeBook {
    private Employee[] employees = new Employee[10];

    public void add(String name, int department, double salary) {
        Employee newEmployee = new Employee(name, department, salary);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                return;
            }
        }
    }

    public void deleteName(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getName() == name) {
                employees[i] = null;
            }
        }
    }

    public void deleteId(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
            }
        }
    }

    public void changeSalaryName(String name, double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getName() == name) {
                employees[i].setSalary(salary);
            }
        }
    }

    public void changeIdName(String name, int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getName() == name) {
                employees[i].setDepartment(department);
            }
        }
    }

    public void printNameAndDepartment() {
        int department = 5;
        for (int i = 1; i <= department; i++) {
            System.out.println("Отдел №" + i);
            for (Employee e : employees) {
                if (e != null && e.getDepartment() == i) {
                    System.out.println(e.getName());
                }
            }
        }
    }

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

    public Employee employeeWithMinSalary(Employee employees[], int department) {
        Employee employeeWithMinSalary = null;
        for (Employee e : employees) {
            if (e.getDepartment() == department && (employeeWithMinSalary == null || e.getSalary() < employeeWithMinSalary.getSalary())) {
                employeeWithMinSalary = e;
            }
        }
        return employeeWithMinSalary;
    }

    public Employee employeeWithMaxSalary(Employee[] employees, int department) {
        Employee employeeWithMaxSalary = null;
        for (Employee e : employees) {
            if (e.getDepartment() == department
                    && (employeeWithMaxSalary == null || e.getSalary() > employeeWithMaxSalary.getSalary())) {
                employeeWithMaxSalary = e;
            }
        }
        return employeeWithMaxSalary;
    }


    public double sumSalaryInDepartment(int department) {
        double sum = 0;
        for (Employee e : employees) {
            if (e.getDepartment() == department) {
                sum += e.getSalary();
            }
        }
        return sum;
    }

    public double midSalaryInDepartment(int department) {
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

    public void indexSalaryInDepartment(Employee[] employees, int department, double percent) {
        for (Employee e : employees) {
            if (e.getDepartment() == department) {
                e.setSalary(e.getSalary() + e.getSalary() * percent / 100);
            }
        }
    }

    public void printNameInDepartment(int department) {
        System.out.println("Сотрудники отдела" + department + ":");
        for (Employee e : employees) {
            if (e.getDepartment() == department) {
                System.out.println(e.getName() + " " + e.getSalary() + " " + e.getId());
            }
        }
    }

    public void salaryMinThanIt(int salary) {
        for (Employee e : employees) {
            if (e.getSalary() < salary) {
                System.out.println("id = " + e.getId() + " name = " + e.getName() + " salary = " + e.getSalary());
            }
        }
    }

    public void salaryMaxThanIt(int salary) {
        for (Employee e : employees) {
            if (e.getSalary() >= salary) {
                System.out.println("id = " + e.getId() + " name = " + e.getName() + " salary = " + e.getSalary());
            }
        }
    }

}
