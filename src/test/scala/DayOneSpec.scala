import org.scalatest.{FlatSpec, Matchers}

class DayOneSpec extends FlatSpec with Matchers {


  it should "add ones together" in {
    DayOne.sumDigits("11") shouldBe 2
    DayOne.sumDigits("111") shouldBe 3
    DayOne.sumDigits("1111") shouldBe 4
  }

  it should "add other digits together when the digits are the same" in {
    DayOne.sumDigits("22") shouldBe 4
    DayOne.sumDigits("333") shouldBe 9
    DayOne.sumDigits("4444") shouldBe 16
  }

  it should "add the given example strings" in {
    DayOne.sumDigits("1122") shouldBe 3
    DayOne.sumDigits("1234") shouldBe 0
    DayOne.sumDigits("91212129") shouldBe 9
  }


}
