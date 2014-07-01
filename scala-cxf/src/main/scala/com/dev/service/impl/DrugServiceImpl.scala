package com.dev.service.impl

import com.dev.service.DrugService
import javax.jws.{WebService, WebMethod, WebResult, WebParam}
import scala.Predef._
import javax.xml.ws.{ResponseWrapper, RequestWrapper}

/**
 * Created with IntelliJ IDEA.
 * User: u0166888
 * Date: 04/02/13
 * Time: 16:01
 * To change this template use File | Settings | File Templates.
 */
@WebService//(endpointInterface = "com.dev.service.impl.DrugServiceImpl")
class DrugServiceImpl extends DrugService{
  override def stringConcatenation (
  @WebParam(name = "s1", targetNamespace = "") s1: String,
  @WebParam(name = "s2", targetNamespace = "") s2: String): String = {
    val s:String = s1 + s2
    s
  }

  @WebResult(name = "i", targetNamespace = "")
  @RequestWrapper(localName = "numberConcatenation", targetNamespace = "http://www.example.org/sample/", className = "org.example.sample.NumberConcatenation")
  @ResponseWrapper(localName = "numberConcatenationResponse", targetNamespace = "http://www.example.org/sample/", className = "org.example.sample.NumberConcatenationResponse")
  @WebMethod(action = "http://www.example.org/sample/numberConcatenation")
  def numberConcatenation(
                           @WebParam(name = "i1", targetNamespace = "") i1: Int,
                           @WebParam(name = "i2", targetNamespace = "") i2: Int): Int = {
    println("I am number concatenation from scala");
    val i: Int = i1 + i2
    i
  }

}
