package abcd.spr2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name="name", required=false, defaultValue="World") String name,
                        Map<String, Object> map){

        map.put("num", 75);
        map.put("color", "green");
        return "hello";
    }

}
