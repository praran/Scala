package spring.web

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created with IntelliJ IDEA.
 * User: u0166888
 * Date: 05/02/13
 * Time: 11:57
 * To change this template use File | Settings | File Templates.
 */
@Controller
class HelloWorldController {

  @RequestMapping(Array("/hello.html"))
  def sayHello{
    println("****** inside controller ********")
    "Hello"
  }

}
