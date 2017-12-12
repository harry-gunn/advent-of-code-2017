import org.scalatest.{FlatSpec, Matchers}

class DayThreeSpec  extends FlatSpec with Matchers {

  behavior of "calculateManhattanDistance"

  it should "calculate the complete manhattan distance" in {
    DayThree.calculateManhattanDistance(1) shouldBe 0
    DayThree.calculateManhattanDistance(12) shouldBe 3
    DayThree.calculateManhattanDistance(23) shouldBe 2
    DayThree.calculateManhattanDistance(1024) shouldBe 31
  }

  behavior of "calculateDistanceAlongSide"

  it should "return the distance from the number to the centre of the side it resides on" in {
    DayThree.calculateDistanceAlongSide(1, 1) shouldBe 0
    DayThree.calculateDistanceAlongSide(23, 25) shouldBe 0
    DayThree.calculateDistanceAlongSide(12, 25) shouldBe 1
    DayThree.calculateDistanceAlongSide(80, 81) shouldBe 3
  }

  behavior of "calculateRingRadius"

  it should "return the distance from the current 'ring' to the centre" in {
    DayThree.calculateRingRadius(1) shouldBe 0
    DayThree.calculateRingRadius(25) shouldBe 2
    DayThree.calculateRingRadius(121) shouldBe 5
  }

  behavior of "calculateNearestWholeSquareRoot"

  it should "return the sqrt of the next square number when given int input" in {
    DayThree.calculateNextOddSquareNumber(2) shouldBe 9
    DayThree.calculateNextOddSquareNumber(10) shouldBe 25
    DayThree.calculateNextOddSquareNumber(47) shouldBe 49
    DayThree.calculateNextOddSquareNumber(100) shouldBe 121
    DayThree.calculateNextOddSquareNumber(1) shouldBe 1
  }

}
