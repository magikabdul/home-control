package devices.model;

import devices.model.constant.Battery;

public class Switcher implements EatonDevice {

    private String name;
    private int batteryStatus;
    private int deviceType;
    private boolean isOn = false;

    public Switcher(String name, int batteryStatus, int deviceType) {
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
    public void setBatteryStatus(int batteryStatus) {
        this.batteryStatus = batteryStatus;
    }

    @Override
    public int getBatteryStatus() {
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
