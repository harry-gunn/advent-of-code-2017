import scala.io.Source

object DayOne extends App {

  val filename = "src/main/resources/input"
  val longInput = Source.fromFile(filename).getLines.next()

  println(sumDigits(longInput))

  def sumDigits(numString: String): Int = {
    getSeparatedList(numString)
      .filter({case(y) => y.head == y.last})
      .map(x => x.head)
      .sum
  }

  def loopedListVal(numString: String) = List(List(numString.last.asDigit, numString.head.asDigit))

  def getSeparatedList(numString:String) = {
    numString
      .map(_.asDigit)
      .sliding(2)
      .toList
      .map(x => x.toList) ++ loopedListVal(numString)
  }

}
