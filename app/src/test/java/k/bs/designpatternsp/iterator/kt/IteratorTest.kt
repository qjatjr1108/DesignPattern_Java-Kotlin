package k.bs.designpatternsp.iterator.kt

import k.bs.designpatternsp.pattern.iterator.kt.Fruit
import k.bs.designpatternsp.pattern.iterator.kt.Fruits
import k.bs.designpatternsp.pattern.iterator.kt.iterator
import org.hamcrest.CoreMatchers
import org.junit.Assert.assertThat
import org.junit.Test

class IteratorTest {

    @Test
    fun givenAggregateWithIterator_whenTraverseAggregateInForLoop_thenReturnAggregateComponentValues() {
        // Given
        val fruits = Fruits("apple", "banana", "orange").iterator()

        // When
        val values: MutableList<Fruit> = mutableListOf()
        for (fruit in fruits) values.add(fruit)

        // Then
        val expectedValues = listOf<Fruit>("apple", "banana", "orange")
        assertThat(values, CoreMatchers.equalTo(expectedValues))
    }
}