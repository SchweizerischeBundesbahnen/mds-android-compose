package ch.sbb.compose_mds.composables.checkbox

import androidx.compose.ui.state.ToggleableState

internal object SBBCheckboxUtils {
    val Boolean?.asToggleableState get() = this?.let { ToggleableState(it) } ?: ToggleableState.Indeterminate

    val ToggleableState.asBoolean get() =
        when (this) {
            ToggleableState.On -> true
            ToggleableState.Off -> false
            ToggleableState.Indeterminate -> null
        }

    fun ToggleableState.nextState(triStateEnabled: Boolean) =
        when (this) {
            ToggleableState.On -> if (triStateEnabled) ToggleableState.Indeterminate else ToggleableState.Off
            ToggleableState.Indeterminate -> ToggleableState.Off
            ToggleableState.Off -> ToggleableState.On
        }
}
