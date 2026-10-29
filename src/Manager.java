public class Manager extends Employee {
    private double bonus;

    @Override
    public int calculateSalary() {
        // Ajustado para refletir o Salário Base + o Bônus calculado (Ex: 1200 base * 1.50 multiplicador = 1800)
        return (int) (this.baseSalary * this.bonus);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
