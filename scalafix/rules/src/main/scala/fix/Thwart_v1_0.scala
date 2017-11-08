package fix

import scalafix._

import scala.meta._
import contrib._

final case class Thwart_v1_0(index: SemanticdbIndex)
    extends SemanticRule(index, "Thwart_v1_0") {

  val error = LintCategory.error(
    "sdfkl"
  )
  override def check(ctx: RuleCtx): List[LintMessage] = ctx.tree collect {
    case cls: Defn.Class if cls.hasMod(mod"case") && !cls.hasMod(mod"final") =>
      error.at("whatever", cls.name.pos)
  }

//  override def fix(ctx: RuleCtx): Patch = {
//    val error = LintCategory.error("on no!")
//    ctx.debugIndex()
//    println(s"Tree.syntax: " + ctx.tree.syntax)
//    println(s"Tree.structure: " + ctx.tree.structure)
//    val p: Patch = ???
//    Patch.empty
//  }

}
