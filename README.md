# Sketchbook

## Getting Started
Check out the Discussion right... [here](https://github.com/schnow265/Sketchbook/discussions/2).

## Documentation
* [GitHub Wiki](https://github.com/schnow265/sketchbook/wiki)

## The Licence
MIT Licence.

## Adding Ideas
If you have *any* Ideas:
1. Go to Issues
2. Make a new Issue on the "Feature Request"-Template

## Maven Repos
You might notice that there are *two* packages, the only difference is the TLD. The most recent packages have the ID **at.schnow265**. The net.schnow265 packages are the legacy Packages.

## Build from Source
To build this mod from Source, you need to:
1. Install Java 17 JDK (Best from [Temurin](https://adoptium.net/de/temurin/releases/?package=jdk))
2. Use [IntelliJ](https://www.jetbrains.com/idea/) or [install Gradle](https://gradle.org/install/).
3. Copy **all** Files from the "Files for Build" directory to the root. You need to replace the build.gradle File.
4. Execute ```gradle genSources``` to generate the required Files for Build.
5. Run ```gradle build``` to, well... *build* the mod.
