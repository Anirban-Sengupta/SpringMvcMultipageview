package com.ani.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {
//@RequestMapping("/")
//public String display1()  
//{  
//    return "index";  
//}  
@RequestMapping("/a")
public String redirect()  
{  
    return "viewpage";  
}     
@RequestMapping("/a1")  
public String display()  
{  
return "final";  
}  
}
