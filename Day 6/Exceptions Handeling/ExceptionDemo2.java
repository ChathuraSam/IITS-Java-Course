public class ExceptionDemo2 {
    public static void main(String[] args) {

        try{
            // Arithmetic Exception
            System.out.println(5/0);

            // Nullpointer exception
            String name = null;
            System.out.println(name.length());

            // ArrayOutofBound Exception
            int [] arr = new int[3];
            arr[3] = 23;

        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (NullPointerException e){
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }catch (Exception e) {
            System.out.println("Exception in the code!");
        }

        System.out.println("Rest of the code is running!");
    }
}
