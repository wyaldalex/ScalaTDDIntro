package com.tudux.tdd.intro.converter

import com.tudux.tdd.intro.converter.packt.{Binary, Decimal}
import org.scalatest.prop.TableDrivenPropertyChecks

class DecimalToBinaryTableSpec extends UnitSpec with TableDrivenPropertyChecks {
  it should "convert decimal to binary" in {
    val validCombos = Table(
      ("binary", "decimal"),
      ("100100111101", "2365"),
      ("11110001111110111", "123895"),
      ("100000000000001110000001", "8389505"),
      ("1011110101011101001101", "3102541")
    )
    forAll(validCombos) {
      (binString: String, decString: String) =>
        var binary = BaseConversion.decimalToBinary(Decimal(decString))
        binary.number shouldBe binString
    }
  }
}
