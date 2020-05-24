package Ass01

object q2 {
  def main(args: Array[String]) {
    var value = volume(5)
    println("Volume of sphere = " + value)

  }
  def volume(r: Int): Double = {
    (40 / 3) * math.Pi * r * r * r
  }
}
