public class Main {

    private static final Employee[] employees = new Employee[10];


    public static void main(String[] args) {
        employees [0] = new Employee("Иванов Иван Иванович", 5, 500);
        employees [1] = new Employee("Шакиров Амир Ильдарович", 3, 1100);
        employees [2] = new Employee("Галямов Дамир Дамирович", 2, 3300);
        employees [3] = new Employee("Байбеков Сергей Александрович", 1, 4400);
        employees [4] = new Employee("Емельянов Георгий Борисович", 4, 2200);

        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
        System.out.println("Общая сумма ЗП: " + sumSalary());
        System.out.println("Максимальная ЗП у: \n" + maxSalary());
        System.out.println("Минимальная ЗП у: \n" + minSalary());
        System.out.println("Средния ЗП: "+meanSalary());

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
    private  static Employee minSalary(){
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
    private static int meanSalary(){
        int totalEmployee = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalEmployee++;

            }
        }
        int meanSalary = sumSalary() / totalEmployee;
        return meanSalary;
    }
}