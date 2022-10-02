package homework.dz_2_7;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("А-ков", "А-ей", "А-ович", 1, 20_000);
        employees[1] = new Employee("Б-ков", "Б-ей", "Б-ович", 2, 21_000);
        employees[2] = new Employee("В-ков", "В-ей", "В-ович", 3, 22_000);
//                employees[3] = new Employee("Г-ков", "Г-ей", "Г-ович", 4, 23_000);
//                employees[4] = new Employee("Д-ков", "Д-ей", "Д-ович", 5, 24_000);
//                employees[5] = new Employee("Е-ков", "Е-ей", "Е-ович", 4, 25_000);
//                employees[6] = new Employee("Ж-ков", "Ж-ей", "Ж-ович", 3, 26_000);
//                employees[7] = new Employee("З-ков", "З-ей", "З-ович", 2, 27_000);
//                employees[8] = new Employee("И-нов", "И-ей", "И-нович", 3, 28_000);

        employeeBook.printEmployeesByDepartment();
        employeeBook.printAllEmployees();
        double totalSalaries = employeeBook.totalSalaries();
        System.out.printf("Сумма ЗП всех сотрудников за месяц = %.2f%n рублей." + totalSalaries);
        Employee employeeWithMinSalary = employeeBook.findEmployeeWithMinSalary();
        System.out.println("Сотрудник с минимальной ЗП - " + employeeWithMinSalary);
        Employee employeeWithMaxSalary = employeeBook.findEmployeeWithMaxSalary();
        System.out.println("Сотрудник с максимальной ЗП - " + employeeWithMaxSalary);
        double averageSalary = employeeBook.averageSalary();
        System.out.println("Средняя ЗП всех сотрудников за месяц = %.2f%n рублей.", averageSalary);

        employeeBook.indexSalaries(10);
        System.out.println("После индексации");
        employeeBook.printAllEmployees();
        System.out.printf("Сотрудник с минимальной ЗП из %d отдела %s%n", 1, employeeBook.findEmployeeWithMinSalaryFromDepartment(1));
        System.out.printf("Сотрудник с максимальной ЗП из %d отдела %s%n", 2, employeeBook.findEmployeeWithMaxSalaryFromDepartment(2));
        System.out.println("Сумма ЗП всех сотрудников за месяц из %d отдела = %.2f%n рублей.", 3, employeeBook.totalSalariesForDepartment(3));
        System.out.println("Средняя ЗП всех сотрудников за месяц из %d отдела = %.2f%n рублей.", 4, employeeBook.averageSalaryForDepartment(4));

        employeeBook.indexSalariesForDepartment(5, 1);
        System.out.println("После индексации для отдела " + 1);
        employeeBook.printAllEmployeesFromDepartment(1);
        employeeBook.printEmployeesWithSalaryLessThan(21_000);
        employeeBook.printEmployeesWithSalaryGreaterOrEqualThan(21_000);
    }
}
