package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.NotificationService;

@RestController
public class PageController {

    @Value("${myconfig.secret}")
    private String pageControllerMsg;

    @Autowired
    private NotificationService notificationService;

    @RequestMapping("/test")
    public String home() {
        return pageControllerMsg.toString();
    }
}
