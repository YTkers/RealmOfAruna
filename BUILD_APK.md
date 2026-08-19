# Membuat RealmOfAruna.apk

## Cara termudah: Android Studio
1. Buka project `RealmOfAruna`.
2. Tunggu Gradle Sync.
3. Pilih **Build > Generate App Bundles or APKs > Generate APKs** (atau **Build APK(s)** tergantung versi Android Studio).
4. APK debug asli akan dibuat sebagai:
   `app/build/outputs/apk/debug/app-debug.apk`
5. Salin/rename menjadi:
   `RealmOfAruna.apk`

## Build otomatis dari GitHub
Project ini juga sudah punya workflow:
`.github/workflows/build-apk.yml`

Upload project ke GitHub, buka tab **Actions**, pilih **Build RealmOfAruna APK**, lalu jalankan workflow. Hasil `RealmOfAruna.apk` akan tersedia sebagai artifact.

## Catatan
APK yang dibuat adalah **debug APK**, cocok untuk dipasang dan diuji di HP Android. Untuk APK release yang ditandatangani, diperlukan keystore/signing configuration.
