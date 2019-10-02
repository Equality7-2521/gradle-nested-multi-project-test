package foobarbaz.server

import foobarbaz.service.one.impl.OneService
import foobarbaz.service.two.impl.TwoService

fun main() {
    println("Hello from foorbarbaz.server.MainKt")
    OneService.doSomething()
    TwoService.doSomething()
}
