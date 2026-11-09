public class Manager extends Employee {
    private double bonusMultiplier;

    @Override
    public double calculateSalary() {
        return baseSalary * bonusMultiplier;
    }

    public double getBonusMultiplier() {
        return bonusMultiplier;
    }

    public void setBonusMultiplier(double bonusMultiplier) {
        if (bonusMultiplier < 1) {
            throw new IllegalArgumentException("Bonus multiplier must be at least 1.");
        }
        this.bonusMultiplier = bonusMultiplier;
    }
}
