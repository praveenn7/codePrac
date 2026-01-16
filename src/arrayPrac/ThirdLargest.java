package arrayPrac;

public class ThirdLargest {

    public static int getThirdLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > first) {
                third = second;
                second = first;
                first = i;
            }
            else if (i > second) {
                third = second;
                second = i;
            }
            else if (i > third) {
                third = i;
            }
        }
        return third;
    }

    public static void main(String[] args) {
        int[] arr = {1, 14, 2, 16, 10, 20};
        System.out.println(getThirdLargest(arr));
    }

}
