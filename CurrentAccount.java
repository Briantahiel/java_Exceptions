public class CurrentAccount extends Account{
    public CurrentAccount(int agency, int number) {
        super(agency, number);
    }
    @Override
    public boolean withdrawal(double value) {
        double commission = 0.2;
        return super.withdrawal(value + commission);
    }
    @Override
    public void deposit(double value) {
        
    }
}
