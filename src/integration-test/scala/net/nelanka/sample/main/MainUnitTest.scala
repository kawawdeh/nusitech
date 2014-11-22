package net.nelanka.sample.main

import org.scalatest.{FlatSpec, Matchers}

class MainUnitTest extends FlatSpec with Matchers {
    behavior of "Main"

    it should "exist" in {
        1 === 1
    }
}
