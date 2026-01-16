package arrayPrac;

public class SecondLargest {

    public static int getSecondLargest(int[] arr) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > first) {
                second = first;
                first = i;
            }
            else if (i > second && i < first) {
                second = i;
            }
        }

        if (second == Integer.MIN_VALUE)
            return -1;
        else
            return second;

    }

    public static void main(String[] args) {
        int[] arr = {1, 14, 2, 16, 10, 20};
        System.out.println(getSecondLargest(arr));
    }

}
