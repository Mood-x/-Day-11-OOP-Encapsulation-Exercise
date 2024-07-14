public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name ){
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }

    public int credit(int amount){
        balance+= amount;
        return balance;
    }

    public int debit(int amount){
        if(balance < amount ){
            System.out.println("ERROR: Insufficient Balance. Please recharge your account to continue");
        }else {
            balance -= amount;
            System.out.println("Successfully debited " + amount + " from the account " + id);
        }
        return balance;
    }

    public int transferTo(Account account_anothor, int amount){
        if (balance < amount){
            System.out.println("ERROR: Insufficient Balance. Please recharge your account to continue");
        }else {
            balance -= amount;
            account_anothor.setBalance(account_anothor.getBalance() + amount);
            System.out.println("Transfer successful " + amount + " to the account " + account_anothor.getId());
        }
        return balance;
    }

    public String toString(){
        return "Account [ ID: " + id + " ] [ Name: " + name + " ] [ Balance: " + balance + " ]";
    }
}
