package exercises;

public class SmartDeviceAdapter implements  SmartDevice {
    @Override
    public void turnOn(){
        System.out.println("Turning on");
    }
    @Override
    public void turnOff(){
        System.out.println("Turning off");
    }
    @Override
    public void adjustBrightness(int level){
        System.out.println("The current device does not support adjusting brightness");
    }
    @Override
    public void setTemperature(int temp){
        System.out.println("The current device does not support set temperature");
    }
    @Override
    public void setTimer(int minutes){
        System.out.println("The current device does not support set timer");
    }
}
