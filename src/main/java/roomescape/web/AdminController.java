package roomescape.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin")
@Controller
public class AdminController {

    @GetMapping
    public String getAdminPage() {
        return "admin/index";
    }

    @GetMapping("/reservation")
    public String getReservationPage() {
        return "admin/reservation-legacy";
    }
}