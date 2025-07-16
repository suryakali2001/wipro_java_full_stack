public class FirstHalfString {
    public static String getFirstHalfIfEven(String input) {
        if (input.length() % 2 == 0) {
            return input.substring(0, input.length() / 2);
        } else {
            return "String length is not even.";
        }
    }

    public static void main(String[] args) {
        String test1 = "HelloWorld"; 
        String test2 = "HelloJava";  

        System.out.println(getFirstHalfIfEven(test1)); 
        System.out.println(getFirstHalfIfEven(test2));
    }
}
