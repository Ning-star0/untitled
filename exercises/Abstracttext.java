package exercises;

public class Abstracttext {
    abstract class Shape{
        abstract void area();
    }
    class Circle extends Shape{
        double rad;
        Circle(double r){
            rad = r;
        }
        @Override
        void area() {
            double result = Math.PI * Math.pow(rad, 2);
            System.out.println("宁校宽 "+result);
        }
    }
    class Triangle extends Shape{
        double a;
        double b;
        double c;
        double p;
        Triangle(double a,double b,double c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        @Override
        void area() {
            double p = (a+b+c)/2;
            double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("Triangle area = "+area);
        }
    }
    class rectangle extends Shape{
        double a;
        double b;
        rectangle(double a,double b){
            this.a = a;
            this.b = b;
        }
        @Override
        void area() {
            double area=a*b;
            System.out.println("rectangle area = "+area);
        }
    }
    public static void main(String[] args) {
        Abstracttext ab=new Abstracttext();
        Circle c = ab.new Circle(5);
        Triangle t = ab.new Triangle(3,4,5);
        rectangle r = ab.new rectangle(3,4);
        c.area();
        t.area();
        r.area();
    }
}
