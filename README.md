# ServerInfoPlus (LabyMod 4 Addon) — Build & Install

Was ist hier:
- Vollständiges Gradle‑Java‑Projekt zum Erzeugen einer `.labyaddon`-Datei.
- Kompatibilität: Minecraft 1.21.8+, Java 17.

Build‑Schritte:
1. Java 17 installieren (JDK).
2. Gradle installieren (oder selbst Gradle-Wrapper hinzufügen).
3. Im Projektordner ausführen:
   - gradle labyaddon
   - Oder: gradle buildAll
4. Ergebnis: `build/distributions/serverinfoplus-1.0.0.labyaddon`

Addon hochladen:
- Melde dich bei https://www.labymod.net/ an.
- Gehe zum Addons-Bereich und lade die `.labyaddon` hoch.
- Fülle Beschreibung/Kategorie etc. aus wie in `labymod-addon.json`.
- Für das Dev‑Badge: verlinke das Addon auf dein Profil und befolge die Dev‑Badge‑Anforderungen von LabyMod.

Anpassen:
- `assets/icon.png` ersetzen durch ein 128×128 PNG.
- Version, Beschreibung in `labymod-addon.json` anpassen.
- Wenn du den Gradle‑Wrapper möchtest, führe `gradle wrapper` lokal aus, dann kannst du `./gradlew labyaddon` nutzen.

Hinweis:
- Das Projekt enthält kleine Compile‑Stubs der LabyMod‑API, damit es lokal gebaut werden kann. Zur Laufzeit liefert LabyMod die echten Implementierungen.