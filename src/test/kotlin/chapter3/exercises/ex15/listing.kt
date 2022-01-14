package chapter3.exercises.ex15

import chapter3.Cons
import chapter3.List
import chapter3.foldRightL
import io.kotlintest.shouldBe
import io.kotlintest.specs.WordSpec

// tag::init[]
fun increment(xs: List<Int>): List<Int> =
//    when (xs) {
//        is Nil -> xs
//        is Cons -> Cons(xs.head + 1, increment(xs.tail))
//    }
    foldRightL(xs, List.empty(), { x, l -> Cons(x + 1, l) })
// end::init[]

class Exercise15 : WordSpec({
    "list increment" should {
        "add 1 to every element" {
            increment(List.of(1, 2, 3, 4, 5)) shouldBe
                List.of(2, 3, 4, 5, 6)
        }
    }
})
