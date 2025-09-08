package lab1;

public class Multiples {

    public static void main(String[] args) {
        int count = multiples(1000, 3, 5);
        System.out.println(count);
    }

    static int multiples(int range, int a, int b) {

        int nums = 0;

        for (int i = 1; i <= range; i++) {

            boolean divisibleByA = i % a == 0;
            boolean divisibleByB = i % b == 0;

            if (divisibleByA || divisibleByB) {

                nums++;

            }

        }

        return nums;

    }

}
