public class MyMethods {

    public static void main(String[] args) {

        add(4,5);

        System.out.println("The result is " + add2(3,3));

        System.out.println("The result is " + add2(3,2,1));

        System.out.println("Password is "+ passwordValidation("1234"));

        char resultChar = findChar(100);
        System.out.println("The character is "+ resultChar);

        System.out.println(addNumbers(1,2,3,4));

    }

    /*
    methods == functions
    void means -> no return type
    return types can be int, char, boolean
    * */

    // this method is not returning anything
    public static void add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(" Sum = "+sum);
    }

    // this method is returning an int. Can take 2 parameters
    public static int add2(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    // this method is returning an int. Can take 3 parameters
    public static int add2(int num1, int num2, int num3){
        int sum = num1 + num2 + num3;
        return sum;
    }

    // this method is returning a boolean
    public static boolean passwordValidation(String password) {
        if(password.length()>=8){
            return true;
        }
        return false;
    }

    // This method is returning a char
    public static char findChar(int charValue) {
        return (char) charValue;
    }

    // special -- var args
    public static int addNumbers(int...num) {
        int sum = 0;
        for(int i=0; i<num.length; i++) {
            sum = sum + num[i];
        }
        return sum;
    }
}
