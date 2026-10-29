public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.setName("EDRIC");
        manager.setBaseSalary(1200);
        manager.setBonus(1.50);


        int managerSalary = manager.calculateSalary();

        System.out.println("Employee Name: " + manager.getName());
        System.out.println("Total Salary with Bonus: $" + managerSalary);
    }
}
