public class Employee {
    private final String fullName;
    private int dapartment;
    private int salary;
    private final int id;
    private static int counter = 0;


    public Employee(String fullName, int dapartment, int salary){
        this.fullName = fullName;
        this.dapartment = dapartment;
        this.salary = salary;
        this.id = counter++;
    }


    public String getFullName() {
        return this.fullName;
    }

    public int getDapartment() {
        return this.dapartment;
    }
    public void setDapartment(int dapartment) {
        this.dapartment = dapartment;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Сотрудник: " + fullName + "; Отдел: " + dapartment + "; Заплата: " + salary;
    }

}
