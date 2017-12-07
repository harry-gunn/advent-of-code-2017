import utils.FileReader

import math.abs

object DayTwo extends App {

  val filename = "DayTwoInput"
  val input: List[List[Int]] = FileReader.getInput(filename).map(x => x.split("\\t").map(_.toInt).toList)

  println(s"Part 1: ${calculateChecksum(input)}")

  def calculateChecksum(rows: List[List[Int]]): Int = rows.map(x => findDifference(findMinAndMax(x))).sum

  def findDifference(numbers: (Int, Int)): Int = abs(numbers._1 - numbers._2)

  def findMinAndMax(numberList: List[Int]): (Int, Int) = (numberList.min, numberList.max)
}
