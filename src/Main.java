
public class Main {
    static Employee[] employees = new Employee[10];

    static void printEmployee() {
        System.out.print("список всех сотрудников:");
        System.out.println();
        for (Employee i : employees) {
            System.out.println(i);
        }
        }
        static int sumSalary () {
            int sum = 0;
            for (Employee employees : employees) {
                if (employees != null) {
                    sum += employees.getSalary();
                }
                }
            return sum;
            }

    static Employee minSalary() {
        Employee min = employees[0];
        for (int i = 1; i < employees.length ; i++) {
            if (employees[i] != null && employees[i].getSalary() < min.getSalary()) {
                min = employees[i];
            }
        }
        return min;
    }
    static Employee maxSalary() {
        Employee max = employees[0];
        for (int i = 1; i < employees.length ; i++) {
            if (employees[i] != null && employees[i].getSalary() > max.getSalary()) {
                max = employees[i];
            }
        }
        return max;
    }

    static double midSalary() {
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

    static void printName() {
        System.out.print("Имена всех сотрудников:");
        System.out.println();
        for (Employee i : employees) {
            System.out.println(i.getName());
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
    }
}