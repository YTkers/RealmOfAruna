@echo off
echo Building RealmOfAruna.apk...
where gradle >nul 2>nul
if errorlevel 1 (
  echo Gradle was not found. Open this project in Android Studio first, or install Gradle.
  pause
  exit /b 1
)
call gradle :app:assembleDebug --no-daemon
if errorlevel 1 (
  echo Build failed.
  pause
  exit /b 1
)
copy /Y app\build\outputs\apk\debug\app-debug.apk RealmOfAruna.apk >nul
echo.
echo DONE: RealmOfAruna.apk
pause
