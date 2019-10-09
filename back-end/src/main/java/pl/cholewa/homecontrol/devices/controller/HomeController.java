package pl.cholewa.homecontrol.devices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pl.cholewa.homecontrol.devices.model.Switcher;
import pl.cholewa.homecontrol.devices.model.constant.Battery;
import pl.cholewa.homecontrol.devices.model.constant.DeviceType;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    private List<Switcher> eatonDevices;

    @Autowired
    public HomeController() {
        eatonDevices = new ArrayList<>();

        eatonDevices.add(new Switcher("Ceiling", Battery.MAINS_POWER, DeviceType.SWITCHER));
        eatonDevices.add(new Switcher("Desk", Battery.EMPTY, DeviceType.SWITCHER));
        eatonDevices.add(new Switcher("Standing", Battery.NEW, DeviceType.SWITCHER));
    }

    public List<Switcher> getEatonDevices() {
        return eatonDevices;
    }

    public Switcher getEatonDevice(int id) {
        return eatonDevices.get(id);
    }
}
