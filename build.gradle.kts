plugins {
    kotlin("jvm") version "1.8.0"
    id("org.openstreetmap.josm").version("0.8.2")
    application
}

group = "org.openstreetmap.josm.plugins.streetcompleteoverlay.StreetCompleteOverlay"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}

josm {
    pluginName = "StreetCompleteOverlay"
    // debugPort = 1729 // choose a random port for your project (to avoid clashes with other projects)
    josmCompileVersion = "18678"
    manifest {
        description = "The description of my awesome plugin"
        mainClass = "org.openstreetmap.josm.plugins.streetcompleteoverlay.StreetCompleteOverlay"
        minJosmVersion = "18678"
        author = "Jay Turner"
        // canLoadAtRuntime = true
        // iconPath = "path/to/my/icon.svg"
        // loadEarly = false
        // loadPriority = 50
        // pluginDependencies += setOf("apache-commons", "apache-http")
        // website = java.net.URL("https://example.org")
        // oldVersionDownloadLink(123, "v1.2.0", java.net.URL("https://example.org/download/v1.2.0/MyAwesomePlugin.jar"))
        // oldVersionDownloadLink( 42, "v1.0.0", java.net.URL("https://example.org/download/v1.0.0/MyAwesomePlugin.jar"))

        // to populate the 'Class-Path' attribute in the JOSM plugin manifest invoke
        // the function 'classpath', i.e.
        //   classpath "foo.jar"
        //   classpath "sub/dir/bar.jar"
        // This results in 'Class-Path: foo.jar sub/dir/bar.jar' in the
        // manifest file. Added class path entries must not contain blanks.
    }
    // i18n {
    //   bugReportEmail = "me@example.com"
    //   copyrightHolder = "John Doe"
    // }
}
