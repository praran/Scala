package com.dev.service

import javax.jws.{WebParam, WebMethod, WebResult}
import javax.xml.ws.{ResponseWrapper, RequestWrapper}
import javax.jws.WebService

/**
 * Created with IntelliJ IDEA.
 * User: u0166888
 * Date: 04/02/13
 * Time: 16:00
 * To change this template use File | Settings | File Templates.
 */
@WebService(targetNamespace = "http://www.example.org/sample/", name = "Drug")
//@XmlSeeAlso({ObjectFactory.class})
trait DrugService {

  @WebResult(name = "s", targetNamespace = "")
  @RequestWrapper(localName = "stringConcatenation", targetNamespace = "http://www.example.org/sample/", className = "org.example.sample.StringConcatenation")
  @ResponseWrapper(localName = "stringConcatenationResponse", targetNamespace = "http://www.example.org/sample/", className = "org.example.sample.StringConcatenationResponse")
  @WebMethod(action = "http://www.example.org/sample/stringConcatenation")
  def stringConcatenation(
                           @WebParam(name = "s1", targetNamespace = "") s1: String,
                           @WebParam(name = "s2", targetNamespace = "") s2: String): String /*= {
    val s:String = s1 + s2
    s
  }*/

  /* (non-Javadoc)
   * @see org.example.sample.Concatenation#numberConcatenation(int, int)
   */
  @WebResult(name = "i", targetNamespace = "")
  @RequestWrapper(localName = "numberConcatenation", targetNamespace = "http://www.example.org/sample/", className = "org.example.sample.NumberConcatenation")
  @ResponseWrapper(localName = "numberConcatenationResponse", targetNamespace = "http://www.example.org/sample/", className = "org.example.sample.NumberConcatenationResponse")
  @WebMethod(action = "http://www.example.org/sample/numberConcatenation")
  //public int numberConcatenation(
  def numberConcatenation(
                           @WebParam(name = "i1", targetNamespace = "") i1: Int,
                           @WebParam(name = "i2", targetNamespace = "") i2: Int): Int /*= {
    println("I am number concatenation from scala");
    val i: Int = i1 + i2
    i
  }*/

}
