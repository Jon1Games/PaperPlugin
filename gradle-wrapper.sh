gradle wrapper
git add gradlew
git add gradlew.bat
git add gradle/*
git commit -m "generate gradlew files and wrapper"
git update-index --chmod=+x ./gradlew
git update-index --chmod=+x ./gradlew.bat
git commit -m "update gradlew permissions"