import java.util.*;

public class GznuString {

    public String addString(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String1");
        String str2 = sc.nextLine();
        String result = str + " " + str2;
        System.out.println(result);
        return result;
    }

    public String deleteString(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String2");
        String str2 = sc.nextLine();
        if (str.contains(str2)) {
            String result = str.replace(str2, "");
            System.out.println(result);
            return result;
        } else {
            System.out.println("string is not exist");
            return str;
        }
    }


    public void findString(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String3");
        String str2 = sc.nextLine();
        if (str.contains(str2)) {
            System.out.println("find string is exist");
        } else {
            System.out.println("string is not exist");
        }
    }


    public String replaceString(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the old string:");
        String oldStr = sc.nextLine();
        System.out.println("enter the new string:");
        String newStr = sc.nextLine();

        if (str.contains(oldStr)) {
            String result = str.replace(oldStr, newStr);
            System.out.println(result);
            return result;
        } else {
            System.out.println("string is not exist");
            return str;
        }
    }


    public void countString(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String to count:");
        String target = sc.nextLine();

        int count = 0;
        int index = 0;
        while ((index = str.indexOf(target, index)) != -1) {
            count++;
            index += target.length();
        }
        System.out.println("'" + target + "' appears " + count + " times");
    }


    public String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String result = new String(chars);
        System.out.println("Sorted: " + result);
        return result;
    }

    public static void main(String[] args) {
        String str = "Welcome to Guizhou Normal University";
        Scanner sc = new Scanner(System.in);
        GznuString gznuString = new GznuString();

        System.out.println("原始字符串: " + str);
        System.out.println("1:添加字符串");
        System.out.println("2:删除字符串");
        System.out.println("3:查询字符串");
        System.out.println("4:替换字符串");
        System.out.println("5:统计字符串数量");
        System.out.println("6:对字符串排序");
        System.out.println("0:退出程序");
        //System.out.println("0:请选择操作:");

        int num;
        do {
            num = sc.nextInt();
            sc.nextLine(); // 消耗换行符

            switch (num) {
                case 1:
                    str = gznuString.addString(str); // 重要：接收返回值
                    break;
                case 2:
                    str = gznuString.deleteString(str);
                    break;
                case 3:
                    gznuString.findString(str);
                    break;
                case 4:
                    str = gznuString.replaceString(str);
                    break;
                case 5:
                    gznuString.countString(str);
                    break;
                case 6:
                    str = gznuString.sortString(str);
                    break;
                case 0:
                    System.out.println("程序退出");
                    return;
                default:
                    System.out.println("无效选择");
            }

            System.out.println("当前字符串: " + str);
            System.out.println("请选择操作 (0退出):");

        } while (num != 0);
    }
}