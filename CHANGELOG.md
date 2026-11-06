# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [0.2.0] - 2026-11-06

This major release aims to bring a modern and flexible API to all SBB components. Each component is
stylable on component or
theme level and supports a slot API (e.g. `label` composable and `labelText` string).

### Added

- Added `tool/sbb-icons` generator to update `SBBIcons` from icons.app.sbb.ch

### Changed

- Migrated `SBBStatus` to new API
- Updated `SBBIcons` to icon version 1.8.37 (all small, medium and large icons)
- Flattened the icon API from `SBBIcons.Small.AdultKidsSmall` to `SBBIcons.AdultKidsSmall`

### Removed

- Removed `SBBConsts` and `defaultPadding`. Use `SBBSpacing` instead.
- Removed `PrimitiveColors`: Use `SBBColors` instead
- Removed `ThemeContext` colors like `OffBrandThemeContext`: Use `SBBColorScheme` instead

## [0.1.20] - 2026-06-26

### Changed

- Moved `SBBListItem` out of beta state
- Moved `SBBSegmentedButton` out of beta state
- Moved `SBBRadio` out of beta state
- Moved `SBBRadioItem` out of beta state
- Moved `SBBCheckbox` out of beta state
- Moved `SBBCheckboxItem` out of beta state
- Moved `SBBChip` out of beta state
- `minSdk` reduced from 29 to 24 for better compatibility.

## [0.1.10] - 2026-01-08

### Added

- `SBBTextarea`: added component
- `SBBDropdown`: added component

### Changed

- `SBBHeaderBox`: reduced margin to fit design specs
- `SBBTextInput`: renamed from `SBBTextField`
- `SBBTextInput`: refactored API and component
- `SBBModalView`: renamed to SBBBottomSheet
- `SBBBottomSheet`: finished component, added isClosable and full-screen mode
- `SBBListItem`: added textStyle property and made trailingIcon optional
- `SBBTheme`: added dark variants of functional and additional colors
- `SBBNotificationBox`: added onClick, maxLines and hasIcon. Renamed OnCloseCallback to OnClose.
- `SBBNotificationBox`: improved colors, spacings to fit design spec

### Fixed

- `SBBTheme`: add correct color for background and onBackground

## [0.1.9] - 2026-11-07

### Added

- `SBBContentBox`: added component which replaces `SBBGroup`
- `SBBMessage:` added component
- `SBBHeaderBox:` added component
- `SBBRadioButton:` added component

### Changed

- `SBBPrimaryButton`: finished component and out of beta state
- `SBBSecondaryButton`: finished component and out of beta state
- `SBBTertiaryButton`: finished component and out of beta state
- `SBBSwitch`: finished component and out of beta state

## [0.1.8] - 2025-08-21

### Fixed

- Fonts can be overridden

## [0.1.7] - 2025-08-18

### Changed

- `SBBNotificationBox`: adjust colors
- `SBBSpacing`: const for spacings

## [0.1.6] - 2025-08-04

### Added

- Introduce `SBBTypography` and new text styles

## [0.1.5] - 2025-07-24

### Added

- **Context Theming:** Introduced a robust `ThemeContext` mechanism, allowing the design system to provide distinct color schemes and other theme properties based on the active application context (e.g., default, safety-relevant, off-brand).
- **Screenshot Testing (Roborazzi):** Introduced Roborazzi for automated golden file screenshot testing to prevent visual regressions.
- **Golden Files:** Added initial documentation for generating and verifying golden files in
  `README.md` and a dedicated `doc/wyh-roborazzi.md` explaining the choice of Roborazzi.

### Changed

- Enabled Git LFS to manage golden image files and added an initial set of golden files for existing
  components.
- **Color Primitives:** Replaced existing color definitions with `SBBColors.kt` for clearer and more
  consistent naming, aligning with design system terminology.
- **Golden Files:** Updated golden files to reflect changes introduced by the new context theming.

## [0.1.4] - 2025-07-17

### Added

- Added `SBBLoadingIndicator`
- Added `SBBTabBar`

### Changed

- Updated `SBBSwitch` style

## [0.1.3] - 2024-11-22

### Changed

- Using sbb icons v1.0.10

## [0.1.2] - 2024-10-17

### Changed

- `SBBNotificationBox` can now be modified (No title, Closeable, Interaction Icon)

## [0.1.1] - 2024-09-13

### Fixed

- Fixed the artifact name for usage in other projects

## [0.1.0] - 2024-09-13

### Added

- `SBBTheme`: Initializing an App with all the SBB Styles and the SBB Color scheme. **Please note:
  The fonts are not included!**
- `SBBColors`: The SBB Color scheme
- `SBBIcons`: The SBB Icons as a set of ImageVector, imported from the SBB Icons cdn.
- `SBBCheckbox`: added component
- `SBBHeader`: added component
- `SBBStatus`: added component
- `SBBPrimaryButton`, `SBBSecondaryButton`, `SBBTertiaryButton`: added component in early state
- `SBBGroup`: added component in early state
- `SBBListHeader`, `SBBListItem`: added component in early state
- `SBBModalView`: added component in early state
- `SBBNotificationBox`: added component in early state
- `SBBSegmentedButton`: added component in early state
- `SBBSlider`: added component in early state
- `SBBSwitch`: added component in early state
- `SBBTextField`: added component in early state

[0.2.0]: https://github.com/SchweizerischeBundesbahnen/mds-android-compose/compare/0.1.20...0.2.0

[0.1.20]: https://github.com/SchweizerischeBundesbahnen/mds-android-compose/compare/0.1.10...0.1.20

[0.1.10]: https://github.com/SchweizerischeBundesbahnen/mds-android-compose/compare/0.1.9...0.1.10

[0.1.9]: https://github.com/SchweizerischeBundesbahnen/mds-android-compose/compare/0.1.8...0.1.9

[0.1.8]: https://github.com/SchweizerischeBundesbahnen/mds-android-compose/compare/0.1.7...0.1.8

[0.1.7]: https://github.com/SchweizerischeBundesbahnen/mds-android-compose/compare/0.1.6...0.1.7

[0.1.6]: https://github.com/SchweizerischeBundesbahnen/mds-android-compose/compare/0.1.5...0.1.6

[0.1.5]: https://github.com/SchweizerischeBundesbahnen/mds-android-compose/compare/0.1.4...0.1.5

[0.1.4]: https://github.com/SchweizerischeBundesbahnen/mds-android-compose/compare/0.1.3...0.1.4

[0.1.3]: https://github.com/SchweizerischeBundesbahnen/mds-android-compose/compare/0.1.2...0.1.3

[0.1.2]: https://github.com/SchweizerischeBundesbahnen/mds-android-compose/compare/0.1.1...0.1.2

[0.1.1]: https://github.com/SchweizerischeBundesbahnen/mds-android-compose/compare/0.1.0...0.1.1

[0.1.0]: https://github.com/SchweizerischeBundesbahnen/mds-android-compose/releases/tag/0.1.0
