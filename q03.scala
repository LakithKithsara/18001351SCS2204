package Ass01
object q03 {
  def main(args: Array[String]) {
    var wholesaleCost: Double = totalCost(60)
    println(f"Wholesale cost = $wholesaleCost%.2f")
  }
  def covercost(n: Int): Double = {
    n * 24.95 * 600 / 100
  }
  def shipping(n: Int): Double = {
    3 + (n - 50) * 0.75
  }
  def totalCost(n: Int): Double = {
    covercost(n) + shipping(n)
  }
}
