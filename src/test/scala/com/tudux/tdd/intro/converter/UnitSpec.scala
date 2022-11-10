package com.tudux.tdd.intro.converter

import org.scalatest.{FlatSpec, Inside, Inspectors, Matchers, OptionValues}

abstract class UnitSpec extends FlatSpec
  with Matchers
  with OptionValues
  with Inside
  with Inspectors


