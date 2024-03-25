package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class BfcCont {
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	@GetMapping("/order")
  public String order(HttpServletRequest req,Model model) {
	  int legsqty=Integer.parseInt(req.getParameter("legsqty"));
	    int wingsqty=Integer.parseInt(req.getParameter("wingsqty"));
	    int stripsqty=Integer.parseInt(req.getParameter("stripsqty"));
	    int popcornqty=Integer.parseInt(req.getParameter("popcornqty"));
	    int Crispy_legs_price=140;
	    int wings_price=99;
	    int strips_price=120;
	    int popcorn_price=100;
	    int bill=0;
	    String err=null;
	    String bil=null;
	    if(((legsqty!=0)||(wingsqty!=0))||((stripsqty!=0)||(popcornqty!=0))){
	 
	 bill=  (legsqty*Crispy_legs_price)+(wingsqty*wings_price)+
			 (stripsqty*strips_price)+(popcornqty*popcorn_price);
	   
	
	    }
	    else {
	    	 err="please choose and oreder item";
	    	  model.addAttribute("err", err);
	    }
	    String l="order of legs is "+legsqty+" is "+(legsqty*Crispy_legs_price);
	    String w ="order of wings "+wingsqty+" is "+(wingsqty*wings_price);
	     String s="order of strips "+stripsqty+" is "+(stripsqty*strips_price);
	  String p=   "order of popcorn "+popcornqty+" is "+(popcornqty*popcorn_price);
	  
	   if(stripsqty!=0)
	    model.addAttribute("s", s);
	   if(legsqty!=0)
	    model.addAttribute("l", l);
	   if(popcornqty!=0)
	    model.addAttribute("p", p);
	   if(wingsqty!=0)
	    model.addAttribute("w", w);
	   if(((legsqty!=0)||(wingsqty!=0))||((stripsqty!=0)||(popcornqty!=0))) {
		   bil="total bill is "+bill+" ";
		   model.addAttribute("billing", bil);
	   }
	   
	  
return "home2";
	  
  
}

}
