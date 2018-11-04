# No Quick Settings Carrier

Hides the carrier from the quick settings header.

It was designed with stock Android in mind. It may work with a OEM ROM, but I don't guarantee anything.

If anything doesn't works, you're welcome to file an issue.

## Links

[Xposed Module Repository](http://repo.xposed.info/module/me.charlesmilette.noquicksettingscarrier)

[XDA Developers Forum Thread](TODO)

## Compiling

First, you need to setup a compiling environment:
```
git clone https://github.com/charlesmilette/noquicksettingscarrier.git
cd noquicksettingscarrier
gradlew
```

If everything runs fine, you should see a prompt like this:
```
> Task :help

Welcome to Gradle 4.6.

To run a build, run gradlew <task> ...

To see a list of available tasks, run gradlew tasks

To see a list of command-line options, run gradlew --help

To see more detail about a task, run gradlew help --task <task>

For troubleshooting, visit https://help.gradle.org


BUILD SUCCESSFUL in 3s
1 actionable task: 1 executed
```
If you don't see that, you'll be able to fix the errors that occured by following instructions in the text printed.

To compile a usable `.apk` file, run `gradlew assembleRelease`

If you want to sign the `.apk`, use the solution described [here](http://stackoverflow.com/a/21020469/2884575).

The `.apk` will be in `<repo>\app\build\outputs\apk\app-release.apk`

## Installing

Note: If you already had a version from the Xposed Repo installed, you'll have to uninstall it first. If not, Android will refuse to install your custom compilation.

If you have `adb` usable, you can use `adb install -r <apk>`

If not, you need to enable sideloading by checking `Settings > Security > Device administration > Unknown sources`. Use your favorite way of sending a file to your Android device. Then, from a file explorer, open the file.

If you only want to use the module and not build it, you can install it [here](http://repo.xposed.info/module/me.charlesmilette.noquicksettingscarrier).

## Uninstalling

*stabbing intensifies*
