package uk.co.logiccache.hello

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("uk.co.logiccache.hello")
                .mainClass(Application.javaClass)
                .start()
    }
}