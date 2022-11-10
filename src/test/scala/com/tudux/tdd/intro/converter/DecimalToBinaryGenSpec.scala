package com.tudux.tdd.intro.converter

import com.tudux.tdd.intro.converter.packt.Decimal
import org.scalacheck.Gen
import org.scalatest.prop.GeneratorDrivenPropertyChecks
/*
Book version of scala check produces error:
https://stackoverflow.com/questions/35312410/java-lang-incompatibleclasschangeerror-implementing-class-with-scalacheck-and-s
 */
class DecimalToBinaryGenSpec extends UnitSpec with
  GeneratorDrivenPropertyChecks {
  it should "convert decimal to binary and back to decimal" in {
    val decimals = (for {
      c1 <- Gen.chooseNum(2,100000)
    } yield c1.toString).suchThat(_ != "")
    forAll(decimals){ (decimalStr:String) =>
      var binary = BaseConversion.decimalToBinary(Decimal(decimalStr))
      var decimal = BaseConversion.binaryToDecimal(binary)
      decimal.number shouldBe decimalStr
    }
  }
}
