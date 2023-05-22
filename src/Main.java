
public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.add("Анисимов Сергей Иванович", 1, 15_000);
        employeeBook.add("Боровикин Александр Петрович", 1, 17_000);
        employeeBook.add("Венский Михаил Игнатьевич", 2, 19_000);
        employeeBook.add("Гроздьев Виктор Петрович", 2, 22_000);
        employeeBook.add("Добровольский Виталий Николаевич", 3, 24_000);
        employeeBook.add("Елкин Василий Ильич", 3, 24_000);
        employeeBook.add("Железняк Андрей Александрович", 4, 31_000);
        employeeBook.add("Зотов Юрий Сергеевич", 4, 30_000);
        employeeBook.add("Игнатов Лев Романович", 5, 27_000);
        employeeBook.add("Калинин Евгений Денисович", 5, 28_000);

        employeeBook.printEmployee();
        System.out.println();
        employeeBook.deleteName("Боровикин Александр Петрович");
        employeeBook.printEmployee();
        System.out.println();
        employeeBook.deleteId(5);
        employeeBook.printEmployee();
        System.out.println();
        employeeBook.changeSalaryName("Елкин Василий Ильич", 27_000);
        employeeBook.printEmployee();
        System.out.println();
        employeeBook.changeIdName("Калинин Евгений Денисович", 1);
        employeeBook.printEmployee();
        System.out.println();
        employeeBook.printNameAndDepartment();

    }
}