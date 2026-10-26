# Folio Design System (Android Views)

This Android library contains Folio's XML/View design tokens and reusable component layouts. The `:design-system-demo` application is a visual catalog for those components and their light/dark and interaction states.

## Use from Folio

```kotlin
dependencies {
    implementation(project(":design-system"))
}
```

This repository is included in Folio as the `design-system` Git submodule. Clone Folio with `--recurse-submodules`, or run `git submodule update --init --recursive` after cloning.

Use `Theme.Folio.DesignSystem` as the base of an application's theme. Applications can override the `folioColor*` and `folioFontFamily` theme attributes to supply their own brand colors and font while keeping the component styles.

The initial library includes button styles, card and form styles, and reusable XML layouts for cash-flow cards, filter chips, form fields, transaction rows, bottom navigation, and content states. The demo also includes picker/dialog patterns and component-specific state previews.

## Demo

Run the `design-system-demo` application configuration. Each component page has its own light/dark switch and a state selector. Its theme choice is saved locally in the demo application.
