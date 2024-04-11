![[Java CI]](https://github.com/MineKing9534/MathUtils.kt/actions/workflows/check.yml/badge.svg)
![[Latest Version]](https://maven.mineking.dev/api/badge/latest/releases/de/mineking/MathUtils.kt?prefix=v&name=Latest%20Version&color=0374b5)

# Installation

MathUtils.kt is hosted on a custom repository at [https://maven.mineking.dev](https://maven.mineking.dev/#/releases/de/mineking/MathUtils.kt). Replace VERSION with the lastest version (without the `v` prefix).
Alternatively, you can download the artifacts from jitpack (not recommended).

### Gradle

```groovy
repositories {
    maven { url "https://maven.mineking.dev/releases" }
}

dependencies {
    implementation "de.mineking:MathUtils.kt:VERSION"
}
```

### Maven

```xml

<repositories>
    <repository>
        <id>mineking</id>
        <url>https://maven.mineking.dev/releases</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>de.mineking</groupId>
        <artifactId>MathUtils.kt</artifactId>
        <version>VERSION</version>
    </dependency>
</dependencies>
```

# Usage
This extension library simplifies handling `Node` operations. 

```kotlin
val a: Node = Constant.ONE
val b: Node = Constant.TWO
var c = Sum.create(a, b)
```
becomes
```kotlin
val a: Node = Constant.ONE
val b: Node = Constant.TWO
var c = a + b
```

The operators `-`, `*` and `/` will also work as expected