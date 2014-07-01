package com.dev.runner

import com.dev.generated.cxf.{Concatenation, Sample, Concatenation_SampleSOAP_Client}
import javax.xml.namespace.QName
import java.net.URL

/**
 * Created with IntelliJ IDEA.
 * User: u0166888
 * Date: 04/02/13
 * Time: 17:57
 * To change this template use File | Settings | File Templates.
 */
object SoapClient {

  private final val SERVICE_NAME: QName = new QName("http://www.example.org/sample/", "sample")
  private final val wsdlURL = Sample.WSDL_LOCATION

   def main(args:Array[String]){
     try{
     val port: Concatenation = new Sample(wsdlURL,SERVICE_NAME).getSampleSOAP
     val res:String = port.stringConcatenation("hello","world")
     println(" Got result --------> " + res)
     }catch {
       case ex:Exception => ex.printStackTrace()
     }
   }

}
