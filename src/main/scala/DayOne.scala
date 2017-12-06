import scala.io.Source

object DayOne extends App {

  val filename = "src/main/resources/input"
  val input = Source.fromFile(s"${filename}").getLines.next()

  println(s"Part 1: ${sumDigits(getAdjacentList(input))}")
  println(s"Part 2: ${sumDigits(getOppositeList(input))}")

  def sumDigits(numList: List[List[Int]]): Int = {
    numList
      .filter({case(y) => y.head == y.last})
      .map(x => x.head)
      .sum
  }

  def loopedListVal(numString: String) = List(List(numString.last.asDigit, numString.head.asDigit))

  def getAdjacentList(numString:String) = {
    numString
      .map(_.asDigit)
      .sliding(2)
      .toList
      .map(x => x.toList) ++ loopedListVal(numString)
  }

  def getOppositeList(numString:String) = {
    val halfLength = numString.length / 2
    val numbers = numString.map(_.asDigit).zipWithIndex
    def getOpposite(index: Int) = if(index < halfLength) numbers(index+halfLength)._1 else numbers(index-halfLength)._1

    numbers.map(x => List(x._1, getOpposite(x._2))).toList
  }
}
