package com.thorugoh

import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/currency_types") {
            call.respond(CurrencyTypesResult(values = commonCurrencies))
        }

        get("/exchange_rate/{from}/{to}") {
            val from = call.parameters["from"]?.uppercase() ?: return@get call.respondText(
                status = HttpStatusCode.BadRequest,
                text = "Unable to get acronym from the current currency"
            )

            val to = call.parameters["from"]?.uppercase() ?: return@get call.respondText(
                status = HttpStatusCode.BadRequest,
                text = "Unable to get acronym from the target currency"
            )
        }
    }
}
