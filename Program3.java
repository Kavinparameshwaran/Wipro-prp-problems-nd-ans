package kavin;
import java.util.*;
public class Program3 {
    public static int findPassword(int input1, int input2, int input3, int input4, int input5) {
        int[] arr = {input1, input2, input3, input4, input5};
        int[] fre = new int[10];
        int stableCount = 0;
        int unstableCount = 0;
        for (int x : arr) {
            Arrays.fill(fre, 0);
            while (x != 0) {
                int d = x % 10;
                fre[d] = fre[d] + 1;
                x /= 10;
            }
            int flag = 1;
            for (int i = 0; i < 10; i++) {
                if (fre[i] != 0) {
                    for (int j = i + 1; j < 10; j++) {
                        if (fre[j] > 0) {
                            if (fre[i] != fre[j]) {
                                flag = 0;
                                break;
                            }
                        }
                    }
                    break;
                }
            }
            if (flag == 1) {
                stableCount++;
            } else {
                unstableCount++;
            }
        }
        return (stableCount * 10) + unstableCount;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int input4 = sc.nextInt();
        int input5 = sc.nextInt();
        int p = findPassword(input1, input2, input3, input4, input5);
        System.out.println(p);
    }
}
