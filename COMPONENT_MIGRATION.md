# Component migration

As the new compose Style API is currently reworked and not ready, it will not be used in the DSM at
the
moment and migrated later. The design tokens are provided by Style and ThemeData data classes.

> **Flutter Design System**
>
> This structure is based on
> the [Flutter DSM](https://github.com/SchweizerischeBundesbahnen/design_system_flutter).
> Check the Flutter implementation for namings of components, attributes, default styling values or
> even API doc comments.
> Validate with the Figma
> and [SBB Mobile Component Specifications](https://digital.sbb.ch/de/design-system/mobile/overview/).

## Structure

Use the already migrated `SBBStatus` as the reference for the new component API.
This is just a base structure and can be adapted if needed in other components.

```text
status/
  SBBStatus.kt                   # Base composable + named variants
  SBBStatusState.kt              # Supported states
  Preview_SBBStatus.kt           # Previews
  theme/
    SBBStatusStyle.kt            # Appearance properties + merge/copyWith
    SBBStatusThemeData.kt        # Styles per state + CompositionLocal
    SBBStatusThemeDefaults.kt    # Defaults from typography, colors and dark mode
```

Keep rendering in the base composable. Named variants are composable extensions on
`object SBBStatus`

## Slot API

Offer a convenience value and a composable slot: example `labelText` / `label` or
`iconData` / `icon`. Use one of each pair. The convenience value creates the
standard content; the slot allows custom content. If both are supplied, the
custom slot takes precedence.

```kotlin
SBBStatus.Success(labelText = "Ready")
SBBStatus.Success(label = { Text("Custom label") })
```

Apply the resolved foreground color and text style to slots with
`applyForegroundStyle`, so custom content inherits the component styling.

## Theming

**Component level:** accept a nullable `style`. Style properties are nullable
overrides; merge them into the current state's theme style, preserving defaults
for unspecified properties.

```kotlin
SBBStatus.Success(
    labelText = "Ready",
    style = SBBStatusStyle(borderColor = Color.Blue),
)
// Inside the component:
// val effectiveStyle = stateStyle.merge(style)
```

**Theme level:** register complete defaults in `SBBTheme`, provide them through
the component's CompositionLocal, and expose them as `SBBTheme.status`.
`SBBTheme(statusThemeData = ...)` merges theme overrides into those defaults.
For example, set the foreground color for all statuses in a subtree:

```kotlin
val statusStyle = SBBStatusStyle(foregroundColor = Color.Blue)
SBBTheme(
    statusThemeData = SBBStatusThemeData(
        alert = statusStyle,
        warning = statusStyle,
        information = statusStyle,
        success = statusStyle,
    ),
) {
    SBBStatus.Success(labelText = "Ready")
}
```

Precedence: **defaults < theme overrides < component style**.
