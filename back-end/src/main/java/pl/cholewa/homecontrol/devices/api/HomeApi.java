package pl.cholewa.homecontrol.devices.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.cholewa.homecontrol.devices.controller.HomeController;
import pl.cholewa.homecontrol.devices.model.Switcher;

import java.util.List;

@RestController
@RequestMapping(value = "/eaton")
@CrossOrigin
public class HomeApi {

    private HomeController home;

    @Autowired
    public HomeApi(HomeController home) {
        this.home = home;
    }

    @GetMapping("/devices")
    public ResponseEntity<List<Switcher>> getAll() {
        return new ResponseEntity<>(home.getEatonDevices(), HttpStatus.OK);
    }

    @GetMapping("/device/{id}")
    public ResponseEntity<Switcher> getDeviceById(@PathVariable int id) {
        return new ResponseEntity<>(home.getEatonDevice(0), HttpStatus.OK);
    }
}
