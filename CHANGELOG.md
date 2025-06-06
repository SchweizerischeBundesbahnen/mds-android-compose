# Changelog

All notable changes to this project will be documented in this file. See [standard-version](https://github.com/conventional-changelog/standard-version) for commit guidelines.

# Unreleased

### Features
* Added SBBLoadingIndicator

# 0.1.3: Update Icons

### Features
* Using sbb icons v1.0.10

# 0.1.2: Modifiable Notification Box

### Features
* Notification Box can now be modified (No title, Closeable, Interaction Icon)

# 0.1.1: Fix artifact naming

### Bugfix
* Fixed the artifact name for usage in other projects

# 0.1.0: Project setup, first components for early adopters (13.09.2024) 

### Features
* **[SBB Theme][theme-class]** Initializing an App with all the SBB Styles and the SBB Color scheme. **Please note: The fonts are not included!**
* **[SBB Colors][color-class]** The [SBB Color scheme][color-design]
* **[SBB Icons][icon-class]** The [SBB Icons][icon-design] as a set of [ImageVector][image-vector-class], imported from the [SBB Icons cdn][cdn-link].
* **Implementation of Composables**:
  - [SBBCheckbox][checkbox-class] ([Figma][checkbox-design])
  - [SBBHeader][header-class] ([Figma][header-design])
  - [SBBStatus][status-class] ([Figma][status-design])
* **Implementation of [Composables in early stage][early-stage-package]** :
  - button: `SBBPrimaryButton`, `SBBSecondaryButton`, `SBBTertiaryButton`
  - container: `SBBGroup`
  - list: `SBBListHeader`, `SBBListItem`
  - modal: `SBBModalView`
  - notificationBox: `SBBNotificationBox`
  - segmentedButton: `SBBSegmentedButton`
  - slider: `SBBSlider`
  - switch: `SBBSwitch`
  - text: `SBBTextField`

[theme-class]: compose-mds/src/main/java/ch/sbb/compose_mds/theme/SBBTheme.kt
[color-class]: compose-mds/src/main/java/ch/sbb/compose_mds/theme/SBBColors.kt
[icon-class]: compose-mds/src/main/java/ch/sbb/compose_mds/sbbicons/__SBBIcons.kt
[checkbox-class]: compose-mds/src/main/java/ch/sbb/compose_mds/composables/checkbox
[header-class]: compose-mds/src/main/java/ch/sbb/compose_mds/composables/header
[status-class]: compose-mds/src/main/java/ch/sbb/compose_mds/composables/status
[early-stage-package]: compose-mds/src/main/java/ch/sbb/compose_mds/beta

[color-design]: https://www.figma.com/design/5j2eZ2D0sHYFKkRSmFdBPJ/SBB-Colors?node-id=0-1&node-type=canvas&t=RsI5bFCfRWHjjDaX-0
[icon-design]: https://www.figma.com/design/UQBd7cHKav0hr9oXYp7opJ/SBB-Icons?node-id=372-0&node-type=canvas&t=FXNIL9meafolULrl-0
[image-vector-class]: https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/vector/ImageVector
[cdn-link]: https://icons.app.sbb.ch/
[checkbox-design]: https://www.figma.com/design/WOtLIam1xwrqcgnAITsEhV/Design-System-Mobile?node-id=32-2729&node-type=canvas&t=l6RyUAOuq4ikiP5J-0
[header-design]: https://www.figma.com/design/WOtLIam1xwrqcgnAITsEhV/Design-System-Mobile?node-id=10-281&node-type=canvas&t=l6RyUAOuq4ikiP5J-0
[status-design]: https://www.figma.com/design/WOtLIam1xwrqcgnAITsEhV/Design-System-Mobile?node-id=7255-10285&node-type=canvas&t=l6RyUAOuq4ikiP5J-0
