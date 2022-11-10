package com.tudux.tdd.intro.converter

import com.tudux.tdd.intro.converter.packt.{Binary, Decimal, Hexadecimal}
import org.scalatest.FlatSpec

class BeanSpec extends UnitSpec {

  "Decimal" should "throw error when initialised with a nun numeric string" in {
    try {
      Decimal("xyz")
    }
    catch {
      case e: IllegalArgumentException =>
        assert(e.getMessage == "requirement failed: Unable to convert string to number")
      case _ => fail
    }
  }

  "Binary" should "throw error when initialised with a nun numeric string" in {
    intercept[IllegalArgumentException] {
      Binary("xyz")
    }
  }

  "Hexadecimal" should "throw error when initialised with a nun numeric string" in {
    intercept[IllegalArgumentException] {
      Hexadecimal("XYZ")
    }
  }

}
