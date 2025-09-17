public class Account {

    private double balance;

    public Account(){
    }

    public Account(double b){
         this.setBalance(b);
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double b) {
        this.balance = b;
    }

    public void lodge(double amount){
        if(amount < 0){
            System.out.println("Please enter a postive amount");
        } else {
            System.out.println("Lodging" + amount);
            this.balance += amount;
        }
    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Please enter a postive amount");
        } else {
            System.out.println("Withdrawing" + amount);
            this.balance -= amount;
        }
    }


}
