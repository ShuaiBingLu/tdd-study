package com.thoughtwoks;

public class FizzBuzz {


    public static String FIZZ = "Fizz";

    public static String BUZZ = "Buzz";

    public static String WHIZZ = "Whizz";

    private static Integer NUM_3 = 3;

    private static Integer NUM_5 = 5;

    private static Integer NUM_7 = 7;


    private static String ifFizz(Integer num) {
        return num % NUM_3 == 0 ? FIZZ : "";
    }

    private static String ifBuzz(Integer num) {
        return num % NUM_5 == 0 ? BUZZ : "";
    }

    private static String ifWhizz(Integer num) {
        return num % NUM_7 == 0 ? WHIZZ : "";
    }

    public static String write(Integer num) {
        String numStr = String.valueOf(num);
        if (numStr.contains(String.valueOf(NUM_7)) && !numStr.contains(String.valueOf(NUM_5))) {
            return ifFizz(num) + ifWhizz(num);
        }
        if (numStr.contains(String.valueOf(NUM_5)) && !numStr.contains(String.valueOf(NUM_3))) {
            return ifBuzz(num) + ifWhizz(num);
        }
        if (numStr.contains(String.valueOf(NUM_3)) && !numStr.contains(String.valueOf(NUM_5))) {
            return FIZZ;
        }
        String result = ifFizz(num) + ifBuzz(num) + ifWhizz(num);
        return result.isEmpty() ? String.valueOf(num) : result;
    }
}
