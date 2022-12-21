public class CurrentAccount extends Account{
    public CurrentAccount(int agency, int number) {
        super(agency, number);
    }
    @Override
    public void withdrawal(double value) throws NoBalanceException{
        double commission = 0.2;
        super.withdrawal(value + commission);
    }
    @Override
    public void deposit(double value) {
        
    }
}
