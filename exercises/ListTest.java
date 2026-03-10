package exercises;

import java.util.*;
public class ListTest {
    public static void main() {
        List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Date"));
        Iterator<String> it = fruits.iterator();
        System.out.println("遍历所有元素:");
        while(it.hasNext()) {
            String fruit =it.next();
            System.out.println(fruit);
        }
        System.out.println("---");
        System.out.println("删除包含 'a' 的水果:");
        while (it.hasNext()) {
            String fruit = it.next();
            // 注意：必须先调用 next() 再调用 remove()
            if (fruit.toLowerCase().contains("a")) {
                System.out.println("正在删除: " + fruit);
                it.remove(); // 删除当前元素
            }
        }
        System.out.println("删除后的列表: " + fruits);

        System.out.println("---");

        // 4. 使用 Java 8 的 forEachRemaining (需要新的迭代器)
        it = fruits.iterator();
        System.out.println("使用 forEachRemaining 打印剩余元素:");
        it.forEachRemaining(System.out::println); // Lambda 表达式简化输出
        System.out.println("---");
        it.forEachRemaining(item -> System.out.println(item)); // Lambda 表达式简化输出
    }
}
