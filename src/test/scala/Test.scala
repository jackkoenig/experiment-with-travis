
import org.scalatest._

class TestSpec extends FlatSpec with Matchers {
  val list: List[Long] = List.tabulate(10000000) { i => i.toLong }
  val sum: Long = list.size * (list.size - 1L) / 2L

  "list.sum" should "be correct" in {
    list.sum should be (sum)
  }

  "list.foldLeft" should "work" in {
    list.foldLeft(0L)((s, x) => s + x) should be (sum)
  }

  "list.foldRight" should "work" in {
    list.foldRight(0L)((x, s) => s + x) should be (sum)
  }
}

