public class Exercise1 {


    public static void main(String[] args) {
        int[] sequence = generateSequence(6);

        for (int num : sequence) {
            System.out.print(num + " ");
        }
    }

    public static int[] generateSequence(int n) {
        int[] sequence = new int[n];
        int sign = 1;
        int num = 1;

        for (int i = 0; i < n; i++) {
            sequence[i] = num * sign;
            sign *= -1;
            num++;
        }

        return sequence;
    }

}
