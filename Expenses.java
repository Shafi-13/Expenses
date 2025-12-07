public class Expenses {
    private String title;
    private double amount;
    public Expenses(String title, double amount) {
        this.title = title;
        this.amount = amount;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getFinalAmount() {
        return amount;
    }
    public void showInfo() {
        System.out.println("Title: " + this.getTitle() + ", Amount: £" + this.getFinalAmount());
    }
}