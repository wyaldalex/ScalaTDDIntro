package com.tudux.tdd.intro.converter

import com.tudux.tdd.intro.converter.packt.{Decimal, Hexadecimal}

class DecimalHexadecimalSpec extends UnitSpec {

  "base conversion utility " should "convert a number 1243 into a hexadecimal number 4DB" in {
    var hex: Hexadecimal = BaseConversion.decimalToHexadecimal(Decimal("1243"))
    assert(hex.number == "4DB")
  }

  it should "convert a number 11111122 into hexadecimal number A98AD2" in {
    var hex: Hexadecimal = BaseConversion.decimalToHexadecimal(Decimal("11111122"))
    assert(hex.number == "A98AD2")
  }

}
