plugins {
    application
}

application {
    mainClass = "org.example.app.App"
}

dependencies {
    implementation(project(":dogs"))
}
