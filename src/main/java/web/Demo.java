package web;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
class Demo {
	@RequestMapping("/welcome")
	String showWelcome() {
		return "/sample.jsp";
	}
}
