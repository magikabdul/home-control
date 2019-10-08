package pl.cholewa.homecontrol.devices.model;

public interface EatonDevice {

    void setName(String name);
    String getName();

    boolean hasBattery();
    void setBatteryStatus(String  batteryStatus);
    String  getBatteryStatus();


    void setDeviceType(int deviceType);
    int getDeviceType();

    void setStatus(int deviceStatus);
    int getStatus();
}
