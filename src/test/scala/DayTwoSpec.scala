import org.scalatest.{FlatSpec, Matchers}

class DayTwoSpec extends FlatSpec with Matchers {

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
