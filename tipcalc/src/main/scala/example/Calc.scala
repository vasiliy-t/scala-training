package example 

class Calc {
  def total(amount: Double = 0, tip: Double = 0): Double = {
    (amount * tip) / 100 + amount
  }
}
