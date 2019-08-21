# Autodoc mobile app test task
* Tests 'https://play.google.com/store/apps/details?id=de.autodoc.gmbh' app

## Steps to run test suite

### Install dependencies

* Download [maven](https://maven.apache.org/download.cgi)
* [Install maven](https://maven.apache.org/install.html)
* Download and install last version of [jdk](https://www.oracle.com/technetwork/java/javase/downloads/index.html)
* Download and install [Android Studio](https://developer.android.com/studio/index.html)
* Download and install [Appium](http://appium.io/)
* Update env variable 'Path'
* Create and run android emulator device (see dependencies in test class)

### Clone project and run tests

* `git clone git@github.com:valeriy-mayboroda/appium-web-test.git`
* `cd ./appium-web-test`
* mvn clean test