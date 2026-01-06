plugins {
    java
}

group = "de.azuredawnch"
version = "1.0.0"
java.sourceCompatibility = JavaVersion.VERSION_17
java.targetCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

tasks {
    withType<JavaCompile> {
        options.encoding = "UTF-8"
        options.release.set(17)
    }

    // Erzeugt die eigentliche Jar
    val jar by getting(Jar::class) {
        archiveBaseName.set("serverinfoplus")
        manifest {
            attributes["Implementation-Title"] = "ServerInfoPlus"
            attributes["Implementation-Version"] = project.version
            attributes["Main-Class"] = "de.azuredawnch.serverinfoplus.ServerInfoPlusAddon"
        }
    }

    // Packt alles in eine .labyaddon (zip mit spezieller Endung)
    register<Zip>("labyaddon") {
        dependsOn("jar")
        archiveBaseName.set("serverinfoplus-${project.version}")
        archiveExtension.set("labyaddon")
        destinationDirectory.set(layout.buildDirectory.dir("distributions"))
        from(jar.map { zipTree(it) }) // Klassen in Jar
        from("labymod-addon.json")
        from("assets") {
            into("assets")
        }
    }
}

// Shortcut task
tasks.register("buildAll") {
    dependsOn("labyaddon")
}