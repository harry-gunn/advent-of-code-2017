import utils.FileReader

import scala.math.{abs, pow, sqrt}

object DayThree extends App {

  val filename = "DayThreeInput"
  val input = FileReader.getInput(filename).head.toInt

  println(calculateManhattanDistance(input))



  def calculateManhattanDistance(number: Int) = {
    val square = calculateNextOddSquareNumber(number)
    calculateRingRadius(square) + calculateDistanceAlongSide(number, square)
  }

  def calculateDistanceAlongSide(number: Int, square: Int): Int = {
    val radius = calculateRingRadius(square)
    val sideLength = 2*radius +1

    def getListOfMiddleValues = List.range(square - radius, pow(sideLength - 2, 2).toInt, -2 * radius)
    def getDistanceFromNearestMiddleValue(numList: List[Int]) = abs(numList.minBy(v => abs(v - number)) - number)

    if(square - number == 0) 0
    else getDistanceFromNearestMiddleValue(getListOfMiddleValues)
  }

  def calculateRingRadius(square: Int): Int = (sqrt(square).toInt - 1) / 2

  def calculateNextOddSquareNumber(number: Int): Int = Iterator.iterate(number)(_ + 1).find(sqrt(_) % 2 == 1).get


}
