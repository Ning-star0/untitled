package exercises;

class AnonymousDemo {
    public void createClass() {

        // 创建的匿名类继承了 Polygon1 类
        Polygon1 p1 = new Polygon1() {
            public void display() {
                System.out.println("在匿名类内部。");
            }
        };
        p1.display();
    }
}
