package ch.vardanega.simplyracing.subscription;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SubscriptionController {
    
    @GetMapping("hello")
    public String sayHello() {
        return "Hello subscription";
    }
}
