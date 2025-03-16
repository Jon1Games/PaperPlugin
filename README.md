# PaperPlugin

Template for an paper plugin with basic structure.

## Setup

- Remove github/worklows if not needed
- Change Projekt name in settings.gradle
- Change name in paper-plugin.yml
- Check Paper Version
- Check Java Version
- Change the Authors in paper-plugin.yml
- chaneg the api version in paper-plugin.yml

## Package and path

1. Change the folder path to yout wisches
2. Change the name of Main if nessesary
3. Chaneg the package path of Main.java and PaperPluginLoader.java
4. Change the main and loader path in paper-plugin.yml

### Build Gralde wrapper

Run the gradle-wrapper.sh, it will aktivate the wrapper, commit it to github and then do the correct permissions for it.
If you are on Windows you can run the sh with thew git shell, windows subsystem linux or the commands in an windows command line.

## Versioning

For new release push on an new tag

```bash
git tag vx.x.x
git push origin tag vx.x.x
```
