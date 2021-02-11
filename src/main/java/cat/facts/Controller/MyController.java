package cat.facts.Controller;

import cat.facts.Services.Services;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;


@Controller
public class MyController {

    @GetMapping("/")
    @ResponseBody
    public String welcome(){
        return " Welcome to Cat Facts! ";
    }

    @GetMapping("/getSingle")
    @ResponseBody
    public String getSingle() throws IOException {
        Services obj = new Services();
        //obj.getFact();
    return "" + obj.getFact();
    }
}
