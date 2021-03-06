package k.bs.designpatternsp.creational.abstractfactory

import k.bs.designpatternsp.creational.abstractfactory.kt.OrangePlant
import k.bs.designpatternsp.creational.abstractfactory.kt.PlantFactory
import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Test

class AbstractFactoryTest {

    @Test
    fun `Abstract Factory`() {
        val plantFactory = PlantFactory.createFactory<OrangePlant>()
        val plant = plantFactory.makePlant()
        println("Created plant: $plant")

        Assert.assertThat(plant,CoreMatchers.instanceOf(OrangePlant::class.java))
    }
}