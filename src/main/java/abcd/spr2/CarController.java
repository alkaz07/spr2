package abcd.spr2;

import abcd.spr2.car.Car;
import abcd.spr2.car.CarConfig2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {

    @GetMapping("/car")
    String car(Model md){
        CarConfig2 config = new CarConfig2();
        Car supercar = config.car4();
        md.addAttribute("carstring", supercar.toString());
        return "car";
    }
}
