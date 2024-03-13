package lesson_14

abstract class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val isLandable: Boolean
)

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isLandable: Boolean,
    val satellites: MutableList<Satellite> = mutableListOf()
) : CelestialBody(name, hasAtmosphere, isLandable)

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    isLandable: Boolean
) : CelestialBody(name, hasAtmosphere, isLandable)

fun main() {
    val planet = Planet(
        "KEKW", true, true,
        mutableListOf(
            Satellite("KW1", false, true),
            Satellite("KW2", false, false),
        )
    )

    println(planet.name)

    val planetSatellites = mutableListOf<String>()
    for (satellite in planet.satellites) planetSatellites.add(satellite.name)
    println(planetSatellites.joinToString())
}
