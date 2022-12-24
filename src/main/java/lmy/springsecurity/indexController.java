package lmy.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {

    @GetMapping("/")
    public String index() {
        System.out.println("hi");

        return "hi";
    }

    @GetMapping("/loginPage")
    public String loginPage() {
        return "loginPage";
    }
}
