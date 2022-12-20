public class Flow {
    public static void main(String[] args) {
        System.out.println("Start main");
        method1();
        System.out.println("End main");
    }

    private static void method1() {
        System.out.println("Start method1");
        method2();
        try{
           method3(); 
        }catch(MyException myException){
            myException.printStackTrace();
        }
        
        System.out.println("End method1");
    }

    private static void method2(){
        System.out.println("Start method2");
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
            try{  
                int num = 0;
                int result = i/num;
                System.out.println(result);
            }catch(ArithmeticException exception){
                System.out.println(exception.getMessage());
                exception.printStackTrace();;
            }
        }
        System.out.println("End method2");
    }
    private static void method3(){
        System.out.println("Start method2");
        // ArithmeticException exception = new ArithmeticException();
        // throw new ArithmeticException("Something went wrong!");
        throw new MyException("Something went wrong");
        // System.out.println("End method2");
        // System.out.println(exception);
    }
    
}