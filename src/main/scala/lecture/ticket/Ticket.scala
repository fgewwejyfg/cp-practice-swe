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
    case "+" => ???
    case "-" => ???
    case "*" => ???
    case "/" => ???
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
    // 自分のお試しコードをここに書く
  }
  
}