package lecture.ticket

abstract class Tree {
  def value: Double
  def valueEquals(x: Double): Boolean = ???
}

case class Leaf(n: Int) extends Tree {
  def value = n.toString
  override def toString = ???
}

case class Node(op: String, left: Tree, right: Tree) extends Tree {
  def value = op match {
    case "+" => left.value + right.value
    case "-" => left.value - right.value
    case "*" => left.value * right.value
    case "/" => left.value / right.value
  }

  override def toString = ???

}

object Ticket {

  val ops = Seq("+", "-", "*", "/")

  def genTrees2(x1: Int, x2: Int): Seq[Tree] = ???

  def genTrees3(x1: Int, x2: Int, x3: Int): Seq[Tree] = ???

  def genTrees4(x1: Int, x2: Int, x3: Int, x4: Int): Seq[Tree] = ???

  def findSolutions4(x1: Int, x2: Int, x3: Int, x4: Int, a: Int): Seq[Tree] = ???

  def countAllYesInstances(a: Int): Int = ???

  def genTrees(xs: Seq[Int]): Seq[Tree] = ???

  def enumDifficult(a: Int): Seq[Seq[Int]] = ???

  def main(args: Array[String]): Unit = {
    val e0 = Node("/", Leaf(8), Node("-", Leaf(1), Node("/", Leaf(1), Leaf(5))))
    val e1 = Node("-", Node("*", Leaf(7), Leaf(5)), Node("*", Leaf(5), Leaf(5)))

    println(s"$e0 = ${e0.value}")
    println(s"$e1 = ${e1.value}")
  }
  
}