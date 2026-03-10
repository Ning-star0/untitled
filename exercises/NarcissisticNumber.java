package exercises;

// 自定义异常类（构造方法无返回值，正确）
class NotThreeDigitException extends Exception {
    public NotThreeDigitException(String message) {
        super(message);
    }
}

public class NarcissisticNumber {
    // 判断方法声明boolean返回值类型，正确
    public static boolean isNarcissistic(int num) throws NotThreeDigitException {
        if (num < 100 || num > 999) {
            throw new NotThreeDigitException("输入的数字" + num + "不是3位数！");
        }
        int hundreds = num / 100;
        int tens = (num / 10) % 10;
        int units = num % 10;
        int sum = (int) (Math.pow(hundreds, 3) + Math.pow(tens, 3) + Math.pow(units, 3));
        return sum == num;
    }

    public static void main(String[] args) {
        int testNum = 153;
        try {
            boolean result = isNarcissistic(testNum);
            System.out.println(testNum + (result ? "是水仙花数" : "不是水仙花数"));
        } catch (NotThreeDigitException e) {
            System.out.println("异常：" + e.getMessage());
        }
    }
}