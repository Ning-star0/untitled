public class AnimalD {
    static class Animal{
        protected String name;
        Animal(String name){
            this.name = name;
        }
        protected void move(){

        }
        protected void cry(){

        }
    }
    static class Dog extends Animal{
        Dog(String name){
            super(name);
        }
        @Override
        protected void move(){
            System.out.println("dog can run");
        }
        @Override
        protected void cry(){
            System.out.println("dog can cry");
        }
    }
    static class Cat extends Animal{
        Cat(String name){
            super(name);
        }
        @Override
        protected void move(){
            System.out.println("cat can run");
        }
        @Override
        protected void cry(){
            System.out.println("cat can cry");
        }
    }
    static class Bird extends Animal{
        Bird(String name){
            super(name);
        }
        @Override
        protected void move(){
            System.out.println("bird can run");
        }
        @Override
        protected void cry(){
            System.out.println("bird can cry");
        }
    }
    static public void Test1(){
        Dog dog=new Dog("dog007");
        Cat cat=new Cat("cat007");
        Bird bird=new Bird("bird007");
        System.out.println(dog.name);
        dog.move();
        dog.cry();
        System.out.println(cat.name);
        cat.move();
        cat.cry();
        System.out.println(bird.name);
        bird.move();
        bird.cry();
    }
    static class Shape{
        final double PI=3.14;
        protected String color;
        protected double areaShape;
        protected double perimeterShape;
        protected Shape(double areaShape, double perimeterShape, String color){
            this.areaShape=areaShape;
            this.perimeterShape=perimeterShape;
            this.color=color;
        }
        protected void area(){}
        protected void perimeter(){}
        protected void setColor(String color){
            this.color=color;
        }
        protected String getColor(){
            return color;
        }
    }
    static class Circle extends Shape{
        protected double radius;
        Circle(double radius,String color){
            super( 0,0,color);
            this.radius=radius;
        }
        @Override
        protected void area(){
            this.areaShape=3.14 * radius * radius;
            System.out.println("areaCircle="+this.areaShape);
        }
        @Override
        protected void perimeter(){
            this.perimeterShape=3.14 * radius * 2;
            System.out.println("perimeterCircle="+this.perimeterShape);
        }
        protected void showColor(){
            System.out.println("colorCircle="+color);
        }
    }
    static class Rectangle extends Shape{
        protected double length;
        protected double width;
        public Rectangle(double length,double width,String color){
            super(0,0,color);
            this.length=length;
            this.width=width;
        }
        @Override
        protected void area(){
            this.areaShape=length*width;
            System.out.println("areaRectangle="+this.areaShape);
        }
        @Override
        protected void perimeter(){
            this.perimeterShape=(length+width)*2;
            System.out.println("perimeterRectangle="+this.perimeterShape);
        }
        protected  void showColor(){
            System.out.println("colorRectangle="+color);
        }
    }
    static class Triangle  extends Shape{
        protected double a;
        protected double b;
        protected double c;
        protected Triangle(double a,double b,double c,String color){
            super(0,0,color);
            this.a=a;
            this.b=b;
            this.c=c;
        }
        @Override
        protected void area(){
            double p=(a+b+c)/2;
            this.areaShape=Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("areaTriangle="+this.areaShape);
        }
        @Override
        protected void perimeter(){
            this.perimeterShape=a+b+c;
            System.out.println("perimeterTriangle="+this.perimeterShape);
        }
        protected  void showColor(){
            System.out.println("colorTriangle="+color);
        }
    }
    static public void test2(){
        Circle circle=new Circle(3,"red");
        Rectangle rectangle = new Rectangle(1,2,"blue");
        Triangle triangle=new Triangle(3,4,5,"blue");
        circle.showColor();
        circle.area();
        circle.perimeter();

        rectangle.showColor();
        rectangle.area();
        rectangle.perimeter();

        triangle.showColor();
        triangle.area();
        triangle.perimeter();
    }
    static class Student{
        protected String name;
        protected double score;
        protected Student(String name,double score){
            this.name=name;
            this.score=score;
        }
        protected void showName(){
            System.out.println("name="+name);
        }
        protected void showScore(){
            System.out.println("score="+score);
        }
        protected void isGrauate(){

        }
    }
    class Undergraduate  extends Student{
        protected  Undergraduate(String name,double score){
            super(name,score);
        }
        @Override
        protected void showName(){
            System.out.println("Underguaduate name="+name);
        }
        @Override
        protected void showScore(){
            System.out.println("Underguaduate score="+score);
        }
        @Override
        protected void isGrauate(){
            if(score>=600){
                System.out.println("Can graduate"+name);
            }else{
                System.out.println("Can not graduate"+name);
            }
        }
    }
    class Graduate extends Student{
        protected  Graduate(String name,double score){
            super(name,score);
        }
        @Override
        protected void showName(){
            System.out.println("Graduate name="+name);
        }
        @Override
        protected void showScore(){
            System.out.println("Graduate score="+score);
        }
        @Override
        protected void isGrauate(){
            if(score>=80){
                System.out.println("Can graduate"+name);
            }else{
                System.out.println("Can not graduate"+name);
            }
        }
    }
    class StudentDemo{
        Undergraduate undergraduate=new Undergraduate("zhangsan0",50.0);
        Graduate graduate=new Graduate("lisis",90.0);
        void undergraduate(){
            undergraduate.showName();
            undergraduate.isGrauate();
        }
        void graduate(){
            graduate.showName();
            graduate.isGrauate();
        }
    }
    public static void main(String[] args) {
        //test2();
        StudentDemo s1=new AnimalD().new StudentDemo();
        s1.undergraduate();
        s1.graduate();

    }
}
