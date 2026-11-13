# SBB Icons generator

Generates the Compose `SBBIcons` (`compose-mds/src/main/java/ch/sbb/compose_mds/icons`) from the
latest `vX.Y.Z` tag of the official SBB icon library at
[sbb-design-systems/sbb-icons](https://github.com/sbb-design-systems/sbb-icons).

The [`nightly-update-icons`](../../.github/workflows/nightly-update-icons.yml) workflow runs the
tool every night in CI. Usually, it should not be run locally except for development of the tool
itself.

Compose has no icon-font support comparable to Flutter's `IconData`, so the icons are generated as
type-safe, lazily built `ImageVector`s using
[DevSrSouza/svg-to-compose](https://github.com/DevSrSouza/svg-to-compose).

## Usage

Run from the repository root:

```shell
./gradlew -p tool/sbb-icons run
```

The tool

1. finds the highest `vX.Y.Z` tag and compares it with [`icons.version`](icons.version),
2. stops if the local icons are up to date,
3. otherwise downloads the tag's archive and generates all `small`, `medium` and `large` icons,
4. regenerates the whole `icons` package (icons removed upstream are removed as well),
5. writes the new version to `icons.version`.

Set `GITHUB_TOKEN` to avoid the rate limit of anonymous GitHub API requests.

Options (pass via `--args="..."`):

| Option                  | Description                                                       |
|-------------------------|-------------------------------------------------------------------|
| `-f`, `--force`         | Regenerate the latest tag even if the local version is up to date |
| `--source-root <dir>`   | Kotlin source root (default `compose-mds/src/main/java`)          |
| `--version-file <file>` | Version file (default `tool/sbb-icons/icons.version`)             |

### Checks

The update fails with an `UpdateFailure`, without changing the `icons` package or `icons.version`, if

* a download fails after retries or returns a non-200 response,
* the archive's `icons/index.json` is missing, has another version than the tag or lists a sized
  icon without SVG,
* the generated icons do not match the unique sized icons in `index.json` one to one.

The failed checks are listed in the exception message.

### Tests

```shell
./gradlew -p tool/sbb-icons test
```

After an update, verify the build and golden files, e.g.
`./gradlew :compose-mds:compileDebugKotlin :example:verifyRoborazziDebug`, and record new golden
files if icons changed visually.

The workflow opens an issue labeled `icon-lib-update` for a new icon version and a pull request
closing it. When generated icons change, it also records the golden files on macOS and includes them
in the pull request for visual review. A failed update is reported in a comment on the issue.

> Do not edit the generated files in `icons` manually; they are overwritten on the next update.
