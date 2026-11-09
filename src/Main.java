public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.setName("Edric");
        manager.setBaseSalary(1200.00);
        manager.setBonusMultiplier(1.50);

        Employee employee = manager;

        System.out.println("Employee: " + employee.getName());
        System.out.printf("Total salary: R$ %.2f%n", employee.calculateSalary());
    }
}
