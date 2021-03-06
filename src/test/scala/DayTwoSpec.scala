import org.scalatest.{FlatSpec, Matchers}

class DayTwoSpec extends FlatSpec with Matchers {

  behavior of "calculateTotalOfDivisibleValues"

  it should "calculate the total of evenly divisible values" in {
    DayTwo.calculateTotalOfDivisibleValues(List(List(5, 9, 2, 8), List(9, 4, 7, 3), List(3, 8, 6, 5))) shouldBe 9
  }

  behavior of "calculateEvenlyDivisibleValues"

  it should "calculate the evenly divisible values" in {
    DayTwo.findEvenlyDivisibleValues(List(5, 9, 2, 8)) shouldBe (8, 2)
    DayTwo.findEvenlyDivisibleValues(List(9, 4, 7, 3)) shouldBe (9, 3)
    DayTwo.findEvenlyDivisibleValues(List(3, 8, 6, 5)) shouldBe (6, 3)

  }

  behavior of "calculateChecksum"

  it should "calculate the total checksum" in {

    DayTwo.calculateChecksum(List(List(5, 1, 9, 5), List(7, 5, 3), List(2, 4, 6, 8))) shouldBe 18
  }

  behavior of "findMinAndMax"

  it should "find the smallest and the largest numbers in a list" in {

    DayTwo.findMinAndMax(List(1, 2, 3, 4)) shouldBe (1, 4)
    DayTwo.findMinAndMax(List(4, 3, 2, 1)) shouldBe (1, 4)
    DayTwo.findMinAndMax(List(1, 1, 1, 1)) shouldBe (1, 1)
    DayTwo.findMinAndMax(List(1, 10, 100, 1000)) shouldBe (1, 1000)
    DayTwo.findMinAndMax(List(1000, 3324, 1221, 2)) shouldBe (2, 3324)
  }


  behavior of "findDifference"

  it should "find the difference between two numbers" in {

    DayTwo.findDifference((1, 2)) shouldBe 1
    DayTwo.findDifference((2, 1)) shouldBe 1
    DayTwo.findDifference((1, 1)) shouldBe 0
    DayTwo.findDifference((1, 10)) shouldBe 9
    DayTwo.findDifference((100000, 1)) shouldBe 99999

  }


}
