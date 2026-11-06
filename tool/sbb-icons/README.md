# SBB Icons generator

Generates the Compose `SBBIcons` (`compose-mds/src/main/java/ch/sbb/compose_mds/icons`) from the
official SBB icon library at [icons.app.sbb.ch](https://icons.app.sbb.ch).

Compose has no icon-font support comparable to Flutter's `IconData`, so the icons are generated as
type-safe, lazily built `ImageVector`s using
[DevSrSouza/svg-to-compose](https://github.com/DevSrSouza/svg-to-compose).

## Usage

Run from the repository root:

```shell
./gradlew -p tool/sbb-icons run
```

The tool

1. fetches `index.json` and compares its version with [`icons.version`](icons.version),
2. stops if the local icons are up to date,
3. otherwise downloads all `small`, `medium` and `large` SVGs,
4. regenerates the whole `icons` package (icons removed upstream are removed as well),
5. writes the new version to `icons.version`.

Options (pass via `--args="..."`):

| Option                  | Description                                              |
|-------------------------|----------------------------------------------------------|
| `-f`, `--force`         | Regenerate even if the local version is up to date       |
| `--source-root <dir>`   | Kotlin source root (default `compose-mds/src/main/java`) |
| `--version-file <file>` | Version file (default `tool/sbb-icons/icons.version`)    |

After an update, verify the build and golden files, e.g.
`./gradlew :compose-mds:compileDebugKotlin :example:verifyRoborazziDebug`, and record new golden
files if icons changed visually.

The [`nightly-update-icons`](../../.github/workflows/nightly-update-icons.yml) workflow runs the
tool
nightly and opens a pull request when a new icon version is available. When generated icons change,
it also records the golden files on macOS and includes them in the pull request for visual review.

> Do not edit the generated files in `icons` manually; they are overwritten on the next update.
