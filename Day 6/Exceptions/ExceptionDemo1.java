import sun.reflect.annotation.EnumConstantNotPresentExceptionProxy;

public class ExceptionDemo1 {

    public static void main(String[] args) {

//         System.out.println(10/0); // this will give an Arithmetic Exception

        try {
            System.out.println(10/0); // by placing the code which gives the exception inside the try block can handle in catch
        } catch (ArithmeticException e) {
            // System.out.println(e); // e = the technical error
            System.out.println("Cannot Divide By Zero!");
        }
        System.out.println("rest of the code..... is running");
    }


}
