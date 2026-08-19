# Realm of Aruna — Android Project

Project Android siap-build untuk prototype game 2D top-down.

## Build APK
Persyaratan:
- Android Studio terbaru
- JDK yang didukung Android Studio
- Android SDK Platform 35

Langkah:
1. Buka folder project ini di Android Studio.
2. Tunggu Gradle Sync selesai.
3. Pilih Build > Build APK(s).
4. APK debug biasanya berada di:
   app/build/outputs/apk/debug/app-debug.apk

Game berjalan offline melalui WebView dan memuat `app/src/main/assets/index.html`.

Catatan:
- Versi ini belum multiplayer online.
- Belum menggunakan server/database.
- Package: com.aruna.realmofaruna
- Version: 1.0
