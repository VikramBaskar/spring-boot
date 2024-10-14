package JPAPractice_1.group.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import JPAPractice_1.group.dao.UserDAO;
import JPAPractice_1.group.model.Home;
/*
@Controller
public class HomeController {
    
	@Autowired
	UserDAO userdao;
	
	@GetMapping("/home")
	public String home() {
		return "home.jsp";
	}
	@PostMapping("/addUser")
	public String adduser(Home user) {
		userdao.save(user);
		return "redirect:/home";
	}
	@GetMapping("/getUser")
	public ModelAndView getUser(@RequestParam int id) {
		ModelAndView mav = new ModelAndView("/getUser.jsp");
		Home user = userdao.findById(id).orElse(new Home());
		mav.addObject("user",user);
		return mav;
		
		
	}
}*/

@Controller
public class HomeController {

    @Autowired
   private UserDAO userdao;

    @GetMapping("/home")
    public String home() {
        // Return view name without ".jsp"
        return "home";  // This will map to /WEB-INF/views/home.jsp
    }

    @PostMapping("/addUser")
    public String adduser(@ModelAttribute Home user) {
        userdao.save(user);
        return "redirect:/home";
    }

    @GetMapping("/getUser")
    public ModelAndView getUser(@RequestParam int id) {
        ModelAndView mav = new ModelAndView("/getUser");  // Map to /WEB-INF/views/getUser.jsp
        Home user = userdao.findById(id).orElse(new Home());
        mav.addObject("user", user);
        return mav;
    }
}

