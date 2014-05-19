package org.j2eedev.algorithmicpuzzles.scala

object Main {
  /**
   * http://j2eedev.org
   */
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }

    println("pascal(0,1)-->" + pascal(0, 1))
    println("pascal(0,1)-->" + pascal(0, 1))
    println("pascal(0,1)-->" + pascal(0, 1))
  }

  /**
   * @author Umashankar
   * pascal triangle
   * http://j2eedev.org
   */
  def pascal(c: Int, r: Int): Int = if (c == r || c == 0) 1 else pascal(c - 1, r - 1) + pascal(c, r - 1)

}