package devices.api;

import devices.controller.HomeController;
import devices.model.Switcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/api")
@CrossOrigin
public class HomeApi {

    private HomeController home;

    @Autowired
    public HomeApi(HomeController home) {
        this.home = home;
    }

    @GetMapping("/device")
    public List<Switcher> getAll() {
        return home.getEatonDevices();
    }
}
