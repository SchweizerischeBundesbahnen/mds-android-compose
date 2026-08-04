package ch.sbb.compose_mds.example.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import ch.sbb.compose_mds.composables.picker.DateTimePicker
import ch.sbb.compose_mds.composables.picker.SBBDatePicker
import ch.sbb.compose_mds.composables.picker.now
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.SBBTheme

@Composable
fun DatePickerPage() {
    val today = DateTimePicker.now
    var date by remember { mutableStateOf(today.date) }
    Column(
        modifier =
            Modifier
                .fillMaxSize()
                .padding(horizontal = SBBSpacing.Small)
                .verticalScroll(rememberScrollState()),
        verticalArrangement =
            Arrangement.spacedBy(
                SBBSpacing.Large,
                alignment = Alignment.CenterVertically,
            ),
    ) {
        SBBDatePicker(selectedDate = date, onDateChange = { date = it })
        SBBDatePicker.Boxed(selectedDate = date, onDateChange = { date = it })
    }
}

@PreviewLightDark
@Composable
fun Preview_DatePickerPage() {
    SBBTheme(includeSurface = true) {
        DatePickerPage()
    }
}
