package exercises;

public class T2025_11_19 {

    public interface Animal {
        void makeSound();
        void eat();
        void move();
    }

    abstract static class AbstractAnimal implements Animal {
        protected final String name;
        protected final int age;

        protected AbstractAnimal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getInfo() {
            return String.format("%s (age: %d)", name, age);
        }
    }

    static class Dog extends AbstractAnimal {
        Dog(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " barks!");
        }

        @Override
        public void eat() {
            System.out.println(name + " eats dog food.");
        }

        @Override
        public void move() {
            System.out.println(name + " runs on four legs.");
        }
    }

    static class Cat extends AbstractAnimal {
        Cat(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " meows!");
        }

        @Override
        public void eat() {
            System.out.println(name + " eats fish.");
        }

        @Override
        public void move() {
            System.out.println(name + " walks gracefully.");
        }
    }

    static class Bird extends AbstractAnimal {
        Bird(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " chirps!");
        }

        @Override
        public void eat() {
            System.out.println(name + " pecks at seeds.");
        }

        @Override
        public void move() {
            System.out.println(name + " flies in the sky.");
        }
    }

    static class Tiger extends AbstractAnimal {
        Tiger(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " roars!");
        }

        @Override
        public void eat() {
            System.out.println(name + " hunts and eats meat.");
        }

        @Override
        public void move() {
            System.out.println(name + " prowls silently.");
        }
    }

    public void showAnimalBehavior(Animal animal) {
        if (animal instanceof AbstractAnimal a) {
            System.out.println("Animal: " + a.getInfo());
        }
        animal.makeSound();
        animal.eat();
        animal.move();
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        T2025_11_19 obj = new T2025_11_19();

        Animal[] animals = {
                new Dog("Buddy", 3),
                new Cat("Whiskers", 5),
                new Bird("Tweety", 2),
                new Tiger("Sher Khan", 8)
        };

        for (Animal animal : animals) {
            obj.showAnimalBehavior(animal);
        }
    }
}