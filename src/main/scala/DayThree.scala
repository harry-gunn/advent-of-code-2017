import utils.FileReader

import scala.math.{abs, pow, sqrt}

object DayThree extends App {

  val filename = "DayThreeInput"
  val input = FileReader.getInput(filename).head.toInt

  println(calculateManhattanDistance(input))


  def calculateDistanceFromCorner(number: Int, square: Int): Int = {
    if(square - number == 0) 0
    else {
      calculateDistanceFromPoint(number, createValueList(number, square, true))
    }
  }

  private def calculateDistanceFromPoint(number: Int, numList: List[Int]): Int = {
    abs(numList.minBy(v => abs(v - number)) - number)
  }

  private def createValueList(number: Int, square: Int, isCorner: Boolean = false): List[Int] = {
    val radius = calculateRingRadius(square)
    val sideLength = 2*radius+1

    List.range(square - {if(isCorner) 0 else radius}, pow(sideLength - 2, 2).toInt, -2 * radius)
  }

  def calculateManhattanDistance(number: Int) = {
    val square = calculateNextOddSquareNumber(number)
    calculateRingRadius(square) + calculateDistanceAlongSide(number, square)
  }

  def calculateDistanceAlongSide(number: Int, square: Int): Int = {
    if(square - number == 0) 0
    else calculateDistanceFromPoint(number, createValueList(number, square))
  }

  def calculateRingRadius(square: Int): Int = (sqrt(square).toInt - 1) / 2

  def calculateNextOddSquareNumber(number: Int): Int = Iterator.iterate(number)(_ + 1).find(sqrt(_) % 2 == 1).get

}
