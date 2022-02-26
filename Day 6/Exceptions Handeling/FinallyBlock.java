public class FinallyBlock {

    public static void main(String[] args) {

        try{
            System.out.println(1/0);
        }catch (ArithmeticException e) {
            System.out.println(e);
        }
        finally {
            // always executing
            System.out.println("finally block executed");
        }
    }
}
