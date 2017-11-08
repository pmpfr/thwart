package fix

object Thwart_v1_0_Test {

  case class Foo(i: Int)

  def calculate(i: Int): Seq[Int] = Seq.tabulate(i)(_ * 42)

  def e1(): Int = {
    calculate(7) // axxert: Discard.any
    7
  }
}
