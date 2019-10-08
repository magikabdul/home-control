package pl.cholewa.homecontrol.devices.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.cholewa.homecontrol.devices.controller.HomeController;
import pl.cholewa.homecontrol.devices.model.Switcher;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
//@CrossOrigin
public class HomeApi {

    private HomeController home;

    @Autowired
    public HomeApi(HomeController home) {
        this.home = home;
    }

    @GetMapping()
    public ResponseEntity<List<Switcher>> getAll() {
        return new ResponseEntity<>(home.getEatonDevices(), HttpStatus.OK);
    }
}
