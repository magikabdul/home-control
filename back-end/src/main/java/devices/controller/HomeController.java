package devices.controller;

import devices.model.Switcher;
import devices.model.constant.Battery;
import devices.model.constant.DeviceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
