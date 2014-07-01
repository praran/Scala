package spring.data

import reflect.BeanProperty
import javax.persistence.{GeneratedValue, Id, Entity}

/**
 * Created with IntelliJ IDEA.
 * User: u0166888
 * Date: 05/02/13
 * Time: 13:48
 * To change this template use File | Settings | File Templates.
 */
@Entity
class Customer {

  @Id @GeneratedValue
  var id:Long =0

  @BeanProperty
  var name:String=null

}
