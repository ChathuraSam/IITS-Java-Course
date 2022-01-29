public class ControlStructures {

    public static void main(String[] args) {
        /*
        Less than                   : a < b
        Less than or equal to       : a <= b
        Greater than                : a > b
        Greater than or equal to    : a >= b
        Equal to                    : a == b
        Not Equal to                : a != b
        * */

        // Selection / Decision
        int num = -5;
        if(num>0){
            System.out.println(num+" is greater than 0");
        }
        else if(num==0) {
            System.out.println(num+" is equal to 0");
        }
        else{
            System.out.println(num+" is less than 0");
        }

        // HW.1 Marks -> result A, B, C challenge

        // nested if
        int marks = 100;
        if(marks>0) {
            if(marks>35) {
                System.out.println("S");
            }
            else if(marks>55) {
                System.out.println("C");
            }else{
                System.out.println("A");
            }
        } else{
            System.out.println("invalid mark");
        }

        // Logical Operators
        // && -> AND
        // || -> OR
        // !  -> NOT

        if(marks>0 && marks<=35 ) { // greater than 0 AND less than 35
            System.out.println("Resit");
        }else if(marks != 0) { // not
            System.out.println("Passed");
        }

        if(marks != 0){ //
            // non zeros
        }else{
            System.out.println("you are fail"); // zero
        }
    }


}
