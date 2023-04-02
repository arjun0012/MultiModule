import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
class TestCases extends AnyFlatSpec with should.Matchers{
  val arith = Arithmetic()

  "addition" should "add 5 and 6" in {
    arith.addition(5,6) should be (11)
  }

}
