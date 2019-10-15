package uk.co.logiccache.hello

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

@Controller("/hello")
class HelloController {

    @Get("/")
    @Produces(MediaType.TEXT_PLAIN)
    fun index(): String {
        logger.info { "Hello World" }
        return "Hello World"
    }
}