package example

import org.scalatest._

class CalcSpec extends FlatSpec {
  
 "10 percent tip rate" should "increase total by 0.1" in {
    val c = new Calc()
    assert(c.total(1, 10) === 1.1)
  }
} 
