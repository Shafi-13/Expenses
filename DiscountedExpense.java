public class DiscountedExpense extends Expenses {
    private double discountPercentage;

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    public double getDiscountPercentage() {
        return discountPercentage;
    }
    public DiscountedExpense(String title, double amount, double discountPercentage) {
        super(title, amount);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getFinalAmount() {
        double originalAmount = super.getFinalAmount();
        double discountAmount = originalAmount * (discountPercentage / 100);
        return originalAmount - discountAmount;
    }

    @Override
    public void showInfo() {
        System.out.println("Title: " + this.getTitle() + ", Amount: £" + this.getFinalAmount());
    }


}