public class CartaoDePagamento {
    public static void main(String[] args) {
        PaymentCard paulCard = new PaymentCard(20);
        PaymentCard mattCard = new PaymentCard(30);

        paulCard.eatHeartily();
        mattCard.eatAffordably();
        System.out.println("Paul: " + paulCard);
        System.out.println("Matt: " + mattCard);
        paulCard.addMoney(20);
        mattCard.eatHeartily();
        System.out.println("Paul: " + paulCard);
        System.out.println("Matt: " + mattCard);
        paulCard.eatAffordably();
        paulCard.eatAffordably();
        mattCard.addMoney(50);
        System.out.println("Paul: " + paulCard);
        System.out.println("Matt: " + mattCard);
    }
}

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "O cartão tem saldo de " + this.balance + " euros";
    }

    public void eatAffordably() {
        if (this.balance >= 2.60) {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        if (this.balance >= 4.60) {
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        if (this.balance + amount > 150) {
            this.balance = 150;
        } else if (amount < 0) {
            this.balance = this.balance;
        } else {
            this.balance += amount;
        }
    }
}
