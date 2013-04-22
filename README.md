# Re:publica Android app

This is a fork of the [Fosdem for Android](https://github.com/rkallensee/fosdem-android/) app adapted for use at [Re:publica 13](http://re-publica.de/en).

This is a native Android app for using the Re:publica schedule offline. It will soon be available in the Google Play Store.

## Features

* View the different sessions by day and tracks
* Room plans
* Favorites and notifications
* Search
* Share a session with your social network

### Features this fork intends to add

* View different sessions by room
* View speaker/presenter information
* Parsing of Re:pulica's slightly different xml format

## License

[GPL](http://www.gnu.org/licenses/gpl.html)

## Development

* This application uses [ActionBarSherlock](http://actionbarsherlock.com) to provide the action bar for older Android versions. 

* Another dependency is the library [StickyListHeaders](https://github.com/emilsjolander/StickyListHeaders) which helps adding nice list headers.

* The project needs the android-support-v4.jar to build. If your Eclipse doesn't find it on its own, you have to specify its path (it resides in your Android SDK folder as extras/android/support/v4/android-support-v4.jar) in the project settings > Java Build Path > Libraries (via "Add External JARs").

ActionBarSherlock and StickyListHeaders are added as git submodules. To fetch their content after cloning the repository, just execute:

```
git pull && git submodule init && git submodule update && git submodule status
```

## To-Do

* Implementation with Fragments and Tablet UI

## To-Do for Re:public fork

* Send applicable changes upstream

## Changelog

### 2.0.0

* Completely revised Holo-ified UI and new FOSDEM logo
* Fixed to work with new HTTPS URL
* Added fallback room images from 2012 because the room image download is currently not available.

### 1.0.3

* Minor updates and points towards 2011 edition

### 1.0.2

* Issue with notifications/background service solved. Thx to Christopher Orr.

## Contributors

### Original creators

* Michaël Uyttersprot
* Pieter Iserbyt
* Christophe Vandeplas

### Contributors

* Christopher Orr
* Raphael Kallensee

### Re:publica fork

* Chris Kühl

## Links

* [Official website](http://sourceforge.net/projects/fosdem-android/)
* [App in the Google Play store](https://play.google.com/store/apps/details?id=org.fosdem)
* [Announcement blog post](http://labs.emich.be/2010/01/29/fosdem-android-application/)
