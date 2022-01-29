import java.util.Scanner;

public class Scopes {

    // 4th
    // number variable has a Class level scope
    public static int number = 10;

    public static void main(String[] args) {
        /*

        Scope of Variables In Java
            1. Member Variables (Class Level Scope) - must be declared inside class (outside any function).

            2. Local Variables (Method Level Scope)

            3. Loop Variables (Block Scope) { inside a block }
        * */

        // 1st

        firstYearBatch();

        secondYearBatch();
    }

    public static void firstYearBatch() {

        // batchNumber variable has a method level scope
        int batchNumber = 34;
        if(number > 0){
            System.out.println("I know the number");
        }

    }

    public static void secondYearBatch() {

        // i has a block level scope
        for(int i=0; i<10; i++) {
            System.out.println(i);
        }

        //System.out.println(i);
    }
}
