package exercises;

class Polygon1 {
    public void display() {
        System.out.println("在 Polygon1 类内部");
    }
}
interface USB {
    void connect();
}

class Mouse implements USB {
    public void connect() {
        System.out.println("Mouse connected via USB");
    }
}

class Keyboard implements USB {
    public void connect() {
        System.out.println("Keyboard connected via USB");
    }
}

class Polygon {
    public static void main(String[] args) {
        AnonymousDemo an = new AnonymousDemo();
        Mouse m = new Mouse();
        Keyboard k = new Keyboard();
        m.connect();
        k.connect();
        an.createClass();
    }
}