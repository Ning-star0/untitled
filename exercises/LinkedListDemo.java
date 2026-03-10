package exercises;
import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        List<Double> scores = new ArrayList<>();

        System.out.println("=== 成绩录入系统（输入 -1 结束）===");

        while (true) {
            System.out.print("请输入成绩（0-100），输入 -1 退出: ");
            double score = input.nextDouble();

            if (score == -1) {
                break;
            }

            if (score < 0 || score > 100) {
                throw new IllegalArgumentException("成绩必须在 0 到 100 之间，当前输入: " + score);
            }

            scores.add(score);
            System.out.println("成绩有效: " + score);
        }

        // 计算平均分
        if (scores.isEmpty()) {
            System.out.println("未录入任何成绩。");
        } else {
            double sum = 0;
            for (double s : scores) {
                sum += s;
            }
            double average = sum / scores.size();
            System.out.printf("共录入 %d 个成绩，平均分为: %.2f\n", scores.size(), average);
        }

        input.close();
    }
}
