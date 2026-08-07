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
import ch.sbb.compose_mds.composables.picker.SBBDateTimePicker
import ch.sbb.compose_mds.composables.picker.now
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.SBBTheme
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.LocalTime
import kotlinx.datetime.Month

@Composable
fun DateTimePickerPage() {
    var dateTime by remember {
        mutableStateOf(
            LocalDateTime(
                date = LocalDate(year = 2025, month = Month.JANUARY, day = 10),
                time = LocalTime(hour = 10, minute = 40),
            ),
        )
    }
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
        SBBDateTimePicker.Default(selectedDateTime = dateTime, onDateTimeChange = { dateTime = it })
        SBBDateTimePicker.Boxed(selectedDateTime = dateTime, onDateTimeChange = { dateTime = it })
    }
}

@PreviewLightDark
@Composable
fun Preview_DateTimePickerPage() {
    SBBTheme(includeSurface = true) {
        DateTimePickerPage()
    }
}
