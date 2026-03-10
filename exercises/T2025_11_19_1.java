package exercises;

import java.nio.file.FileStore;

public class T2025_11_19_1 {
    abstract class ElectronicDevice {
        String brand;
        double price;
        boolean isOn = false;

        public ElectronicDevice(String brand, double price) {
            this.brand = brand;
            this.price = price;
        }

        abstract boolean powerOn();

        abstract boolean powerOff();

        abstract void use();

        void getDeviceInfo() {
            System.out.println(this.brand + " " + this.price + " " + this.isOn);
        }
    }

    class Smartphone extends ElectronicDevice {
        Smartphone(String brand, double price) {
            super(brand, price);
        }

        @Override
        boolean powerOn() {
            isOn = true;
            System.out.println(this.brand + " open");
            return isOn;
        }

        @Override
        boolean powerOff() {
            isOn = false;
            System.out.println(this.brand + " close");
            return isOn;
        }

        @Override
        void use() {
            if (isOn == true) {
                System.out.println(this.brand + " messages");
            } else {
                System.out.println(this.brand + " please open");
            }
        }
    }

    class Laptop extends ElectronicDevice {
        Laptop(String brand, double price) {
            super(brand, price);
        }

        @Override
        boolean powerOn() {
            isOn = true;
            System.out.println(this.brand + " open");
            return isOn;
        }

        @Override
        boolean powerOff() {
            isOn = false;
            System.out.println(this.brand + " close");
            return isOn;
        }

        @Override
        void use() {
            if (isOn == true) {
                System.out.println(this.brand + " messages");
            } else {
                System.out.println(this.brand + " please open");
            }
        }
    }

    class SmartWatch extends ElectronicDevice {
        SmartWatch(String brand, double price) {
            super(brand, price);
        }

        @Override
        boolean powerOn() {
            isOn = true;
            System.out.println(this.brand + " open");
            return isOn;
        }

        @Override
        boolean powerOff() {
            isOn = false;
            System.out.println(this.brand + " close");
            return isOn;
        }

        @Override
        void use() {
            if (isOn == true) {
                System.out.println(this.brand + " messages");
            } else {
                System.out.println(this.brand + " please open");
            }
        }
    }

    public void operateDevice(ElectronicDevice device) {
        device.powerOn();
        device.use();
        device.powerOff();
    }

    public static void main(String[] args) {
        T2025_11_19_1 obj = new T2025_11_19_1();
        ElectronicDevice[] electronicDevices = new ElectronicDevice[3];

        electronicDevices[0] = obj.new Smartphone("iphone", 8999);
        electronicDevices[1] = obj.new Laptop("macbook", 8999);
        electronicDevices[2] = obj.new SmartWatch("iwatch", 2999);
        for (ElectronicDevice device : electronicDevices) {
            obj.operateDevice(device);
        }
    }
}

