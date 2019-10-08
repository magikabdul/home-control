package pl.cholewa.homecontrol.devices.model;

public interface EatonDevice {

    boolean hasBattery();
    void setBatteryStatus(int batteryStatus);
    int getBatteryStatus();


    void setDeviceType(int deviceType);
    int getDeviceType();

    void setStatus(int deviceStatus);
    int getStatus();
}
