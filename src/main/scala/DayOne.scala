import scala.io.Source

object DayOne extends App {

  val filename = "src/main/resources/input"
  val input = Source.fromFile(s"$filename").getLines.next()

  println(s"Part 1: ${sumDigits(getAdjacentList(input))}")
  println(s"Part 2: ${sumDigits(getOppositeList(input))}")

  def sumDigits(numList: List[List[Int]]): Int = {
    numList
      .filter({case(y) => y.head == y.last})
      .map(x => x.head)
      .sum
  }

  def getAdjacentList(numString:String): List[List[Int]] = {
    val firstAndLastDigits = List(List(numString.last.asDigit, numString.head.asDigit))

    numString
      .map(_.asDigit)
      .sliding(2)
      .toList
      .map(_.toList) ::: firstAndLastDigits
  }

  def getOppositeList(numString:String): List[List[Int]] = {
    val halfLength = numString.length / 2
    val numbers = numString.map(_.asDigit).zipWithIndex
    def getOppositeValue(index: Int) = if(index < halfLength) numbers(index+halfLength)._1 else numbers(index-halfLength)._1

    numbers.map(numberWithIndex => List(numberWithIndex._1, getOppositeValue(numberWithIndex._2))).toList
  }
}
