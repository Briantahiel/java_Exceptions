public class ConnectionTest {
    public static void main(String[] args) throws Exception{
        try(Connection conn = new Connection()){
            conn.readData();
        } catch(IllegalStateException exception){
            exception.printStackTrace();
        }
        // With no AutoCloseable
        // Connection conn = new Connection();
        // try {
        //     conn.readData();
        // } catch (IllegalStateException exception) {
        //     System.out.println("Receiving exception");
        //     exception.printStackTrace();
        // } finally {
        //     conn.close();
        // }
    }
}

