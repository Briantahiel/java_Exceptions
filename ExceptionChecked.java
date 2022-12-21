public class ExceptionChecked {
    public static void main(String[] args){
        MyAccount account = new MyAccount();
        try {
            account.deposit();
        } catch (MyException e) {
            e.printStackTrace();
        }
        
        
    }
}
