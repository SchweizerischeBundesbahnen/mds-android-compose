# Guidelines for Releases

Releases within this project are exclusively overseen by designated code owners.

## Versioning

The library version is version controlled in `gradle.properties` (`version=...`) and follows
[Semantic Versioning](https://semver.org/spec/v2.0.0.html). Do not edit it manually.

## Release process

1. Make sure all changes are documented in the `[Unreleased]` section of `CHANGELOG.md`.
2. Run the [make_release_pr](.github/workflows/make-release-pr.yml) workflow and choose `patch`,
   `minor` or `major`. It creates a PR (label `autorelease`) that:
    * moves the `[Unreleased]` changelog entries to the new version,
    * updates `version` in `gradle.properties`,
    * bumps `versionCode` of the example app.
3. Review and merge the PR. The [release](.github/workflows/github_release.yml) workflow then
   creates the
   git tag and GitHub release with the changelog notes. JitPack builds the artifact from the tag.
