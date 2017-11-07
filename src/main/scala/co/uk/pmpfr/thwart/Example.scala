package co.uk.pmpfr.thwart

object Example {

  def calculate(i: Int): Seq[Int] = Seq.tabulate(i)(_ * 42)

  def e1(): Int = {
    calculate(7) // no compiler warning; NonUnitStatements warning
    7
  }

  def e2(): Unit = {
    calculate(7) // no compiler warning; NonUnitStatements warning
    ()
  }

  def e3(): Unit =
    calculate(7) // compiler warning; NonUnitStatements warning

  val e4: Unit =
    calculate(7) // compiler warning; NonUnitStatements warning
}
