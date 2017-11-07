package fix

import scalafix._
import scala.meta._

final case class Thwart_v1_0(index: SemanticdbIndex)
    extends SemanticRule(index, "Thwart_v1_0") {

  override def fix(ctx: RuleCtx): Patch = {
    ctx.debugIndex()
    println(s"Tree.syntax: " + ctx.tree.syntax)
    println(s"Tree.structure: " + ctx.tree.structure)
    Patch.empty
  }

}
