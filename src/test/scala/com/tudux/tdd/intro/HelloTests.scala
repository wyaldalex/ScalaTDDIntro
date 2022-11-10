package com.tudux.tdd.intro

import org.scalatest.FunSuite
import com.tudux.tdd.intro.Hello

class HelloTests extends FunSuite{

  test("displaySalutation returns 'Hello World'") {
    assert(Hello.displaySalutation == "Hello World")
  }
}
