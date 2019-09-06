package com.ani.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {
//@RequestMapping("/")
//public String display1()  
//{  
//    return "index";  
//}  
@RequestMapping("/hello")
public String redirect()  
{  
    return "viewpage";  
}     
@RequestMapping("/helloagain")  
public String display()  
{  
return "final";  
}  
}
