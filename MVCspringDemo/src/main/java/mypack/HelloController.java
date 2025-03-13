package mypack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;

@Controller
public class HelloController {

	@RequestMapping("hello")
	public String homepage()
	{
		return "viewpage";
	}
	
	@RequestMapping("bye")
	public String finalpage()
	{
		return "final";
	}
	
	
}
