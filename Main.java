import java.util.ArrayList;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        ArrayList<Expenses> expensesList;
        expensesList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int choice;
         do {
            System.out.println("==== Student Expense Manager ====");
            System.out.println("1. Add Expense");
            System.out.println("2. Add Discounted Expense");
            System.out.println("3. View All Expenses");
            System.out.println("4. Show Total Spending");
            System.out.println("5. Show Highest Expense");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Expense Title: ");
                    input.nextLine(); 
                    String title = input.nextLine();
                    System.out.print("Enter Expense Amount: ");
                    double amount = input.nextDouble();
                    Expenses expense = new Expenses(title, amount);
                    expensesList.add(expense);
                    System.out.println("Expense added successfully!");
                }
                case 2 -> {
                    System.out.print("Enter Discounted Expense Title: ");
                    input.nextLine(); 
                    String dTitle = input.nextLine();
                    System.out.print("Enter Discounted Expense Amount: ");
                    double dAmount = input.nextDouble();
                    System.out.print("Enter Discount Percentage: ");
                    double discount = input.nextDouble();
                    DiscountedExpense dExpense = new DiscountedExpense(dTitle, dAmount, discount);
                    expensesList.add(dExpense);
                    System.out.println("Discounted Expense added successfully!");
                }
                case 3 -> {
                    System.out.println("All Expenses:");
                    for (Expenses exp : expensesList) {
                        exp.showInfo();
                    }
                }
                case 4 -> {
                    double total = 0;
                    for (Expenses exp : expensesList) {
                        total += exp.getFinalAmount();
                    }
                    System.out.println("Total Spending: £" + total);
                }
                case 5 -> {
                    if (expensesList.isEmpty()) {
                        System.out.println("No expenses recorded.");
                        break;
                    }
                    Expenses highest = expensesList.get(0);
                    for (Expenses exp : expensesList) {
                        if (exp.getFinalAmount() > highest.getFinalAmount()) {
                            highest = exp;
                        }
                    }
                    System.out.println("Highest Expense:");
                    highest.showInfo();
                }
                case 6 -> System.out.println("Exiting the program. Goodbye!");
                default -> System.out.println("Invalid choice. Please try again.");
         }
        } while (choice != 6);
    }
}