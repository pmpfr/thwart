package co.uk.pmpfr.thwart

object Example {

  def calculate(i: Int): Seq[Int] = Seq.tabulate(i)(_ * 42)

  def e1(): Int = {
    calculate(7) // no compiler warning
    7
  }

  def e2(): Unit = {
    calculate(7) // no compiler warning
    ()
  }

  def e3(): Unit =
    calculate(7) // compiler warning

  val e4: Unit =
    calculate(7) // compiler warning
}
