public class Loops {
    public static void main(String[] args) {
        // Arrays -> are used to store multiple values in a single variable
        int []numbers = new int[3];

        // We can store values inside the indexes of the array
        numbers[0] = 10;
        numbers[1] = 43;
        numbers[2] = 67;
        // in above array [ 10 | 43 | 67 ] , starting index = 0, size = 3, ending index = 2

        // To iterate through an array we can use a looping method


        // 01. for loop
        System.out.println("----------For Loop----------");
        for(int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 02. while loop
        System.out.println("----------While loop----------");
        int counter1 = 0;
        while (counter1 < numbers.length){
            System.out.println(numbers[counter1]);
            counter1++;
        }

        // 03. Do while loop
        System.out.println("----------Do While Loop----------");
        int counter2 = 0;
        do{
            System.out.println(numbers[counter2]);
            counter2++;
        }while (counter2 < numbers.length);

        // 04. for each loop
        // short way of looping through a array
        System.out.println("----------foreach loop----------");
        for (int number : numbers) {
            System.out.println(number);
        }

        /*
        Coding Challenge -> Start patterns

        Question 01.
         *
         * *
         * * *
         * * * *
         * * * * *

        Question 02.
            *
           * *
          * * *
         * * * *

         */
    }
}
