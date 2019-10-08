package pl.cholewa.homecontrol.devices.model;

import pl.cholewa.homecontrol.devices.model.constant.Battery;

public class Switcher implements EatonDevice {

    private String name;
    private String  batteryStatus;
    private int deviceType;
    private boolean isOn = false;

    public Switcher(String name, String  batteryStatus, int deviceType) {
        this.name = name;
        this.batteryStatus = batteryStatus;
        this.deviceType = deviceType;
    }

    public void setOn() {
        isOn = true;
    }

    public void setOff() {
        isOn = false;
    }

    @Override
    public boolean hasBattery() {
        return batteryStatus != Battery.MAINS_POWER;
    }

    @Override
    public void setBatteryStatus(String  batteryStatus) {
        this.batteryStatus = batteryStatus;
    }

    @Override
    public String getBatteryStatus() {
        return batteryStatus;
    }

    @Override
    public void setDeviceType(int deviceType) {
        this.deviceType = deviceType;
    }

    @Override
    public int getDeviceType() {
        return deviceType;
    }

    @Override
    public void setStatus(int deviceStatus) {

    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getStatus() {
        return 0;
    }

    @Override
    public String toString() {
        return "Switcher{" +
                "name='" + name + '\'' +
                ", batteryStatus=" + batteryStatus +
                ", deviceType=" + deviceType +
                '}';
    }
}
