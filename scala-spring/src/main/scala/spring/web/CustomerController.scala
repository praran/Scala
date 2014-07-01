package spring.web

import org.springframework.stereotype.Controller
import org.hibernate.SessionFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMethod, PathVariable, RequestMapping, ModelAttribute}
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.servlet.ModelAndView
import spring.data.Customer


/**
 * Created with IntelliJ IDEA.
 * User: u0166888
 * Date: 05/02/13
 * Time: 13:50
 * To change this template use File | Settings | File Templates.
 */
@Controller
class CustomerController {

  implicit def sessionFactoryToSession(sf:SessionFactory) = sf.getCurrentSession

  @Autowired
  var sessionFactory:SessionFactory = null

  @ModelAttribute("command")
  def createCustomerForFormBinding = {new Customer}

  @RequestMapping(value = Array("/customers/new"),method = Array(RequestMethod.GET))
  def showNewCustomerForm()= { "newCustomer"}

  @Transactional
  @RequestMapping(value = Array("/customers/new"), method = Array(RequestMethod.POST))
  def createNewCustomer(@ModelAttribute("command") customer: Customer) = {
    println("******* Creating new Customer")
    "redirect:/customers/" + sessionFactory.save(customer) + ".html"
  }


  @Transactional(readOnly = true)
  @RequestMapping(
    value = Array("/customers/{customerId}"), method = Array(RequestMethod.GET))
  def viewCustomer(@PathVariable customerId: Long) ={
    new ModelAndView("customer", "customer",sessionFactory.get(classOf[Customer], customerId))
  }


}
