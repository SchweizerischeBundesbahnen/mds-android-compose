package ch.sbb.compose_mds.composables.status.theme

import androidx.compose.runtime.staticCompositionLocalOf

class SBBStatusThemeData(
    val alert: SBBStatusStyle,
    val warning: SBBStatusStyle,
    val information: SBBStatusStyle,
    val success: SBBStatusStyle,
) {
    fun merge(other: SBBStatusThemeData?): SBBStatusThemeData {
        if (other == null) return this

        return SBBStatusThemeData(
            alert = alert.merge(other.alert),
            warning = warning.merge(other.alert),
            information = information.merge(other.alert),
            success = success.merge(other.alert),
        )
    }
}

val LocalSBBStatusThemeData = staticCompositionLocalOf<SBBStatusThemeData> { null!! }
