public class StarPatterns {
    public static void main(String[] args) {

        /*

         *
         * *
         * * *
         * * * *
         * * * * *

         * */

        int noOfLinesReq=20;
        for (int line = 1; line <= noOfLinesReq; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("* ");
            }
            System.out.println("");
        }



        /*

         ----*
         ---* *
         --* * *
         -* * * *
         * * * * *

         * */

        for (int line = 1; line <=noOfLinesReq; line++) {
            for (int dash = noOfLinesReq; dash - line >= 0; dash--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= line; star++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
