# auctiongui-api 
![GitHub release](https://img.shields.io/github/release/brcdev-minecraft/auctiongui-api)
![GitHub](https://img.shields.io/github/license/brcdev-minecraft/auctiongui-api)
![GitHub last commit](https://img.shields.io/github/last-commit/brcdev-minecraft/auctiongui-api)

This repository provides an open source library containing basic API for [AuctionGUI+](https://www.spigotmc.org/resources/auctiongui-1-7-1-14.19015/) spigot plugin.

## How to use
1. Add Maven/Gradle dependency to your project (code snippets are available in the section below)
2. Add `AuctionGUIPlus` to `depend` or `softdepend` section of `plugin.yml` in your plugin project
3. You can start adding desired implementation to your plugin

Tips:
* You can get AuctionGUI+'s main class with `AuctionGuiPlusApi#getPlugin` static method
* The API is still very basic and incomplete - we're open for ideas as well as pull requests

## Version compatibility matrix
When using this API, make sure you use valid version corresponding to AuctionGUI+'s version your plugin is going to be used with.

| AuctionGUI+ version | API version |
|---------------------|-------------|
| 1.27.0 - ...        | 2.0.0       |
| 1.5.0 - 1.26.0      | 1.0.0       |


## Dependencies
_Note: It's not recommended to use the `latest` version tag. Use fixed version from [Releases](../releases) instead._ 
### Maven
```
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```
```
	<dependency>
	    <groupId>com.github.brcdev-minecraft</groupId>
	    <artifactId>auctiongui-api</artifactId>
	    <version>latest</version>
	</dependency>
```

### Gradle
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
```
	dependencies {
	        implementation 'com.github.brcdev-minecraft:auctiongui-api:latest'
	}
```

## Contact
You can contact the maintainers at our Discord server - http://discord.brcdev.net/
