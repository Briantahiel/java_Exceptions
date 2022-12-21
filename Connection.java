public class Connection implements AutoCloseable{
    public Connection() {
        System.out.println("Connection opening");
    }

    public void readData() {
        System.out.println("Receiving data");
        throw new IllegalStateException();
    }
    @Override
    public void close() throws Exception{
        System.out.println("Connection closed");
    }
}
