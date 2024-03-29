# UltimateTextView
[![API](https://img.shields.io/badge/API-19%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=19) [![](https://www.jitpack.io/v/debojyoti452/UltimateTextView.svg)](https://www.jitpack.io/#debojyoti452/UltimateTextView) [![Codacy Badge](https://api.codacy.com/project/badge/Grade/9b87c18857bb49a3822841893215e4f0)](https://www.codacy.com/manual/debojyoti452/UltimateTextView?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=debojyoti452/UltimateTextView&amp;utm_campaign=Badge_Grade)

## Version
#### Tag = 1.0
## Sample
<p align="center"> 
<img src="images/screencapture-1568048103006.gif">
</p>

## Description
<b>You can now fit your textview automatically and even by using these library you can directly customize your font through XML implementation. You can check sample folder for futher explanation.</b>

## Requirement
* Must use AndroidX
* Kotlin Supported

## Installation
#### Project Level Gradle
```java
allprojects {
		repositories {
			maven { url 'https://www.jitpack.io' }
		}
	}
```
#### App Level Gradle
```java
dependencies {
	    implementation 'com.github.debojyoti452:UltimateTextView:Tag'
	}
```

## Code Sample
#### XML Implementation
```xml
<com.dev452.ultimatetextview.UltimateTextView
            android:id="@+id/textViewDemo"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_centerInParent="true"
            android:text="@string/app_name"
            android:textSize="22sp"
            android:maxLines="3"
            app:UTVAutoFitEnabled="true"
            app:UTVFonts="@string/exo_semibold"
            app:UTVMinTextSize="12sp"
            app:UTVSingleLine="false" />
```

## Future Development
* Fade In Animation
* Bold, Italic, Strike Features

## License
>GNU General Public License v3.0
Permissions of this strong copyleft license are conditioned on making available complete source code of licensed works and modifications, which include larger works using a licensed work, under the same license. Copyright and license notices must be preserved. Contributors provide an express grant of patent rights.

## Contribution
Feel free to pull request.

Find this library useful? ❤️
Support it by joining stargazers for this repository. ⭐️
