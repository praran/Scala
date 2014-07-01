package com.dev.runner

import com.dev.service.impl.DrugServiceImpl
import javax.xml.ws.Endpoint

/**
 * Created with IntelliJ IDEA.
 * User: u0166888
 * Date: 04/02/13
 * Time: 16:48
 * To change this template use File | Settings | File Templates.
 */
object SoapServer {
  def main(args:Array[String]){
     println("Starting server ................")
        val implemented:Object = new DrugServiceImpl()
        val address:String = "http://localhost:9090/cxf/services/drug"
        Endpoint.publish(address,implemented)

       println("Server ready : http://localhost:9090/cxf/services/drug....")

    Thread.sleep(5 * 60 * 1000)
    System.out.println("Server exiting")
    System.exit(0)

  }


}
