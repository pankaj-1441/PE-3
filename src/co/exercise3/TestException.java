package co.exercise3;

public class TestException {
    public static void main(String[] args) {
        try{
            throw new MyException("My new exception");
        }
        catch (MyException e){
            System.out.println(e);
        }
            finally{
            System.out.println("Inside finally");
        }
    }

    public static class MyException extends Exception {

        public MyException(String message) {
            super(message);
        }
    }
}
