package examples.records

import java.time.LocalDate

class KtPerson(val firstName: String, val lastName: String, val dateOfBirth: LocalDate)

fun main() {
    val person = Person("Scott", "Coleman", LocalDate.of(1980, 3,2))

    print(person)
}
