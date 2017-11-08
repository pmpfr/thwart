/*
rule = "class:fix.Thwart_v1_0"
*/
package fix

object Thwart_v1_0_Test {

  case class Foo(i: Int) // assert: Thwart_v1_0

  def calculate(i: Int): Seq[Int] = Seq.tabulate(i)(_ * 42)

  def e1(): Int = {
    calculate(7) // axxert: Discard.any
    7
  }
}
