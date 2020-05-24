package Ass01

object q1 {
  def main(args: Array[String]) {
    var cel = far(35)
    println(cel)
  }
  def far(c: Double) = {
    val x = 1.8000
    val y = 32.00
    (c * x) + y
  }
}
