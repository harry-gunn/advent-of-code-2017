import org.scalatest.{FlatSpec, Matchers}

class DayOneSpec extends FlatSpec with Matchers {

  behavior of "getAdjacentList"

  it should "get separated lists of adjacent digits" in {
    DayOne.getAdjacentList("11") shouldBe List(List(1, 1), List(1, 1))
    DayOne.getAdjacentList("222") shouldBe List(List(2, 2), List(2, 2), List(2, 2))
    DayOne.getAdjacentList("3333") shouldBe List(List(3, 3), List(3, 3), List(3, 3), List(3, 3))
    DayOne.getAdjacentList("1122") shouldBe List(List(1, 1), List(1, 2), List(2, 2), List(2, 1))
    DayOne.getAdjacentList("1234") shouldBe List(List(1, 2), List(2, 3), List(3, 4), List(4, 1))
    DayOne.getAdjacentList("91212129") shouldBe List(List(9, 1), List(1, 2), List(2, 1), List(1, 2), List(2, 1), List(1, 2), List(2, 9), List(9, 9))
  }

  behavior of "getOppositeList"

  it should "get seperated lists of opposite digits" in {
    DayOne.getOppositeList("1212") shouldBe List(List(1,1), List(2,2), List(1,1), List(2,2))
    DayOne.getOppositeList("1221") shouldBe List(List(1, 2), List(2, 1), List(2, 1), List(1, 2))
    DayOne.getOppositeList("123425") shouldBe List(List(1, 4), List(2, 2), List(3, 5), List(4, 1), List(2, 2), List(5, 3))
    DayOne.getOppositeList("123123") shouldBe List(List(1, 1), List(2, 2), List(3, 3), List(1, 1), List(2, 2), List(3, 3))
    DayOne.getOppositeList("12131415") shouldBe List(List(1, 1), List(2, 4), List(1, 1), List(3, 5), List(1, 1), List(4, 2), List(1, 1), List(5, 3))
  }

  behavior of "sumDigits"

  it should "add the same digits together" in {
    DayOne.sumDigits(List(List(1, 1), List(1, 1))) shouldBe 2
    DayOne.sumDigits(List(List(2, 2), List(2, 2), List(2, 2))) shouldBe 6
    DayOne.sumDigits(List(List(3, 3), List(3, 3), List(3, 3), List(3, 3))) shouldBe 12
  }

  it should "add the given example strings from part 1" in {
    DayOne.sumDigits(List(List(1, 1), List(1, 2), List(2, 2), List(2, 1))) shouldBe 3
    DayOne.sumDigits(List(List(1, 2), List(2, 3), List(3, 4), List(4, 1))) shouldBe 0
    DayOne.sumDigits(List(List(9, 1), List(1, 2), List(2, 1), List(1, 2),
            List(2, 1), List(1, 2), List(2, 9), List(9, 9))) shouldBe 9
  }

  it should "add the given example strings from part 2" in {
    DayOne.sumDigits(List(List(1,1), List(2,2), List(1,1), List(2,2))) shouldBe 6
    DayOne.sumDigits(List(List(1, 2), List(2, 1), List(2, 1), List(1, 2)))  shouldBe 0
    DayOne.sumDigits(List(List(1, 4), List(2, 2), List(3, 5), List(4, 1), List(2, 2), List(5, 3)))  shouldBe 4
    DayOne.sumDigits(List(List(1, 1), List(2, 2), List(3, 3), List(1, 1), List(2, 2), List(3, 3)))  shouldBe 12
    DayOne.sumDigits(List(List(1, 1), List(2, 4), List(1, 1), List(3, 5), List(1, 1), List(4, 2), List(1, 1), List(5, 3)))  shouldBe 4
  }
}
