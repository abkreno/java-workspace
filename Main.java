public class Main {
    public static void main(String[] args) {
        // Starting Point
        System.out.println("Hello Yossef!");

        // Data Types
        // Integer/Long -2^32 => +2^32 (0, -100000, 1000, 299993, 2939328) 
        // Modulus
        // 1 % 2 = 1
        // 3 % 2 = 1
        // 5 % 2 = 1
        // 7 % 2 = 1
        // 9 % 5 = 4
        // 4 % 2 = 0
        // 8 % 2 = 0
        // Rule any even number % 2 == 0
        // 3 * 3 = 9
        // 3 + 3 = 6
        // 3 - 3 = 0
        // 3 / 3 = 1
        // (3 + 3) * 3 = 18
        // 3 + 3 * 3 = 12

        // Double/Float -2.0^32 => +2.0^32 (0.0, -100000.5, 1000.9, 299993.5, 2939328.1) 
        // 3.0 * 3.5 = 10.5
        // 3 + 3.5 = 6.5
        // 3 - 3.5 = -0.5
        // 3 / 3.5 = 0.6666
        // (3 + 3) * 3.5 = 21.0
        // 3 + 3 * 3 = 12.0

        // Boolean (true/false)
        // true & true = true
        // true & false = false
        // false & false = false
        // false & true = false
        // true | true = true
        // true | false = true
        // false | true = true
        // false | false = false
        // true ^ false = true
        // true ^ true = false
        // false ^ false = false
        // false ^ true = true 

        int x = ((int) Math.pow(2, 32)) - 200000000;
        System.out.println(x);

        double y = 10.0 / 3;
        System.out.println(y);

    }
}