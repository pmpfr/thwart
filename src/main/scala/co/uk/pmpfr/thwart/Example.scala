package co.uk.pmpfr.thwart

object Example {

  def calculate(i: Int): Seq[Int] = Seq.tabulate(i)(_ * 42)

  def e1(): Unit = {
    val i = { calculate(7); 7}
    i
  }

  def e2(): Unit = {
    calculate(7)
  }

  def e3(): Unit = {
    val i: Unit = calculate(7)
  }
}
