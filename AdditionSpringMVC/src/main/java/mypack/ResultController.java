package mypack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResultController {
	
	
	
	@RequestMapping("result")
	public ModelAndView check(HttpServletRequest req,HttpServletResponse res)
	{
		String x=req.getParameter("no1");
		String y=req.getParameter("no2");
		String rd=req.getParameter("gp");
		
		
		
		
		
		if(x == null || x.isEmpty() || y == null || y.isEmpty())
		{
			return new ModelAndView("errorpage","msg","Fill detail");
		}
		int n1=Integer.parseInt(req.getParameter("no1"));
		int n2= Integer.parseInt(req.getParameter("no2"));
		int resl=0;
		
			switch (rd) {
			case "add": resl=n1+n2;
					    System.out.println("add is="+resl);
						break;
			case "sub": resl=n1-n2;
						System.out.println("sub is="+resl);
						break;
			case "mul":resl=n1*n2;
						System.out.println("mul is="+resl);
						break;
			case "div":resl=n1/n2;
					   System.out.println("mul is="+resl);	
					   break;
			case "mod":resl=n1%n2;
						System.out.println("mod is="+resl);
						break;

			default:
					return new ModelAndView("errorpage", "msg", "Wrong choice...");
					//System.out.println("worng choice...");
					// break;
			}
				return new ModelAndView("result", "msg","Arith is="+resl);
		
			
	}

}
