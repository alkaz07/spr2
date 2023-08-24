package abcd.spr2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalcController {
    @GetMapping("/calc")
    String calc(@RequestParam(name="a", required=false, defaultValue="0") int a,
                @RequestParam(name="b", required=false, defaultValue="0") int b,
                Model md){
        int c = a+b;
        md.addAttribute("result", c);
        md.addAttribute("a", a);
        md.addAttribute("b", b);
        return "trivial_calculator";
    }

}
