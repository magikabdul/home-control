package pl.cholewa.homecontrol.devices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.cholewa.homecontrol.devices.model.Switcher;
import pl.cholewa.homecontrol.devices.model.constant.Battery;
import pl.cholewa.homecontrol.devices.model.constant.DeviceType;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeController {

    private List<Switcher> eatonDevices = new ArrayList<>();

    @Autowired
    public HomeController(List<Switcher> eatonDevices) {
        this.eatonDevices = eatonDevices;

        eatonDevices.add(new Switcher("Ceiling", Battery.MAINS_POWER, DeviceType.SWITCHER));
        eatonDevices.add(new Switcher("Desk", Battery.MAINS_POWER, DeviceType.SWITCHER));
        eatonDevices.add(new Switcher("Standing", Battery.MAINS_POWER, DeviceType.SWITCHER));
    }

    public List<Switcher> getEatonDevices() {
        return eatonDevices;
    }
}
