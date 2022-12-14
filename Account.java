public abstract class Account {
    protected double balance;
    private int agency;
    private int number;
    private Client owner = new Client();

    private static int total;

    public Account(int agency, int number){
        if(agency <= 0){
            System.out.println("Error value");
            this.agency = 1;
        }
        else{
            this.agency = agency;
        }
        total = total + 1;
        System.out.println("Accounts created: " + total);
    }
    
    // This method does not return a value.
     public abstract void deposit(double value);
    //{
    //     this.balance += value;
    // }
     // This method does return a value.
    public boolean withdrawal(double value){
        if(this.balance >= value){
            this.balance -= value;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean transfer(double value, Account account){
       if(this.balance >= value){
        this.balance -= value;
        account.deposit(value);
        return true;
       }
        return false;
    }
    public double getBalance(){
        return this.balance;
    }
    // this way I protect agency assigning it a value by default
    // public void setAgency(int agency){
    //     if(agency > 0){
    //        this.agency = agency; 
    //     } 
    //     else{
    //         System.out.println("Negative values are not allowed!");
    //     }
    // }
    public int getAgency(){
        return this.agency;
    }
    public int getNumero(){
        return this.number;
    }

    public void setNumber(int number){
        this.number = number;
    }
    public void setOwner(Client owner) {
        this.owner = owner;
    }
    public Client getOwner(){
        return this.owner;
    }
    public static int getTotal(){
        return Account.total;
    }
}
