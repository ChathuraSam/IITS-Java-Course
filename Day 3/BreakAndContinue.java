public class BreakAndContinue {

    public static void main(String[] args) {

        // break and continue
        for (int i=0; i< 10; i++){
            if(i==5) {
                continue; // break
            }
            System.out.println(i);
        }
        System.out.println("Outside from the loop");

        /*
        Bitwise	bitwise AND	    --> &
        bitwise exclusive OR    -->	^
        bitwise inclusive OR    -->	|
        Logical	logical AND     -->	&&
        logical OR	            --> ||
        */

        /*
        example:
        0110(6) & 0101(5) = 0100(4)
        6 & 5 = 4
        */
        System.out.println(6 & 5);
    }


}
