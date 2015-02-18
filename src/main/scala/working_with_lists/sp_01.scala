/**
 * scala problem 01 of set s-99
 * http://aperiodic.net/phil/scala/s-99/
 *
 * P01 (*) Find the last element of a list.
 *   Example:
 *
 *   scala> last(List(1, 1, 2, 3, 5, 8))
 *   res0: Int = 8
 *
 * feb'15 david holiday
 *
 */

import org.slf4j.LoggerFactory

class sp_01 {
  val logger = LoggerFactory.getLogger(this.getClass.getSimpleName)
  val testList = List(1, 1, 2, 3, 5, 8)

  def solution(): Unit = {
    val answerI = testList.last
    assert(answerI == 8)
  }

}