import utils.FileReader

import math.abs

object DayTwo extends App {

  val filename = "DayTwoInput"
  val input: List[List[Int]] = FileReader.getInput(filename).map(x => x.split("\\t").map(_.toInt).toList)

  println(s"Part 1: ${calculateChecksum(input)}")
  println(s"Part 2: ${calculateTotalOfDivisibleValues(input)}")

  def calculateTotalOfDivisibleValues(rows: List[List[Int]]): Int = {
    val divisiblePair = rows.map(x => findEvenlyDivisibleValues(x))
    divisiblePair.map(x => x._1 / x._2).sum
  }

  def findEvenlyDivisibleValues(numbers: List[Int]): (Int, Int) = {
    val divValues = for {
      i <- numbers
      j <- numbers
      if i != j
      if i % j == 0
    } yield List(i, j)
    (divValues.head.max, divValues.head.min)
  }

  def calculateChecksum(rows: List[List[Int]]): Int = rows.map(x => findDifference(findMinAndMax(x))).sum

  def findDifference(numbers: (Int, Int)): Int = abs(numbers._1 - numbers._2)

  def findMinAndMax(numberList: List[Int]): (Int, Int) = (numberList.min, numberList.max)
}
