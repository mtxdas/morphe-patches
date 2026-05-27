plugins {
    `kotlin-dsl`
    id("app.mryoutube.patches") version "1.0.0" // এখানে আপনার সংস্করণ নম্বর দিতে পারেন
}

repositories {
    mavenCentral()
    google()
    maven {
        url = uri("https://maven.pkg.github.com/MrYouTube/packages")
        credentials {
            username = System.getenv("GITHUB_ACTOR")
            password = System.getenv("GITHUB_TOKEN")
        }
    }
}

// আপনার অন্যান্য কনফিগারেশন এখানে আসবে
defaultNamespace = "app.mryoutube.extension"
