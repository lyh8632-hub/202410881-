package ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null;
        // intArray[0] = 10;  // NullPointerException 발생

        String str = null;
        // System.out.println("총 문자수: " + str.length()); // NullPointerException 발생
    }
}

