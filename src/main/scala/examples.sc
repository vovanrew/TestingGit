def sqrt_newton(x: Double): Double = {
  def iterate(guess: Double): Double = {
    if(is_good_enough(guess)) guess
    else iterate((guess + x/guess)/2)
  }

  def abs(x: Double): Double = {
    if(x < 0) -x
    else x
  }

  def is_good_enough(guess: Double): Boolean =
    if (abs(guess * guess - x) <= 0.001) true
    else false

  iterate(1)
}

sqrt_newton(4)