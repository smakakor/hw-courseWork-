public class Main {

    private static final Employee[] employees = new Employee[10];


    public static void main(String[] args) {
        employees [0] = new Employee("Иванов Иван Иванович", 5, 13);
        employees [1] = new Employee("Шакиров Амир Ильдарович", 3, 0);
        employees [2] = new Employee("Галямов Дамир Дамирович", 2, 0);
        employees [3] = new Employee("Байбеков Сергей Александрович", 1, 0);
        employees [4] = new Employee("Емельянов Георгий Борисович", 4, 1);
        printEmployeeAll();
        System.out.println();
        printEmployee();
        System.out.println();
        System.out.println("Общая сумма ЗП: " + sumSalary());
        System.out.println("Максимальная ЗП у: \n" + maxSalary());
        System.out.println("Минимальная ЗП у: \n" + minSalary());
        System.out.println("Средния ЗП: " + meanSalary());

    }

    private static int sumSalary(){
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }


    private static Employee maxSalary (){
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        for (Employee employee: employees) {
            if (employee != null && employee.getSalary()>max) {
                max = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }
    private static Employee minSalary(){
        int min = Integer.MAX_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary()<min) {
                min = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }
    private static float meanSalary(){
        int totalEmployee = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalEmployee++;

            }
        }
        float meanSalary = (float) sumSalary() / totalEmployee;
        return meanSalary;
    }

    private static void printEmployeeAll() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
    private static void printEmployee() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}