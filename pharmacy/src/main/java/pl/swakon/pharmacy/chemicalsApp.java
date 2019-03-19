package pl.swakon.pharmacy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class chemicalsApp {

    @GetMapping("/status")
    public String  getStatus(){

        return "App dziala";
    }

}
