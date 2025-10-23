package ch.sbb.compose_mds.example.pages

import SBBTheme
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.PreviewLightDark
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.headerBox.SBBHeaderBox
import ch.sbb.compose_mds.beta.headerBox.SBBHeaderBoxFlap
import ch.sbb.compose_mds.beta.list.SBBListHeader
import ch.sbb.compose_mds.example.composeable.Placeholder
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.CircleInformationSmall
import ch.sbb.compose_mds.sbbicons.small.SignExclamationPointSmall
import ch.sbb.compose_mds.sbbicons.small.UnicornSmall

@OptIn(ExperimentalSBBComponent::class)
@Composable
fun HeaderBoxPage() {
    val currentContext = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(
                state = rememberScrollState(),
            )
    ) {
        SBBListHeader(text = "Default:")
        SBBHeaderBox.Default(
            icon = SBBIcons.Small.UnicornSmall,
            title = "Title",
            subtext = "Subtext",
        )

        SBBListHeader(text = "Simple:")
        SBBHeaderBox.Default(
            title = "Title",
        )

        SBBListHeader(text = "With button:")
        SBBHeaderBox.WithButton(
            icon = SBBIcons.Small.UnicornSmall,
            title = "Title",
            subtext = "Subtext",
            actionIcon = SBBIcons.Small.UnicornSmall,
            actionLabel = "Action",
            onClickAction = {
                Toast.makeText(currentContext, "Action executed.", Toast.LENGTH_LONG).show()
            }
        )

        SBBListHeader(text = "With flap:")
        SBBHeaderBox.Default(
            icon = SBBIcons.Small.UnicornSmall,
            title = "Title",
            subtext = "Subtext",
            headerBoxFlap = SBBHeaderBoxFlap.Default(
                leadingIcon = SBBIcons.Small.SignExclamationPointSmall,
                text = "Flap Text",
                trailingIcon = SBBIcons.Small.CircleInformationSmall,
                onClickTrailingIcon = {
                    Toast.makeText(currentContext, "Flap clicked.", Toast.LENGTH_LONG).show()
                }
            )
        )

        SBBListHeader(text = "Custom:")
        SBBHeaderBox.Custom(
            headerBoxFlap = SBBHeaderBoxFlap.Custom {
                Placeholder(modifier = Modifier.fillMaxWidth())
            }
        ) {
            Placeholder(modifier = Modifier.fillMaxWidth())
        }
    }
}

@PreviewLightDark
@Composable
fun HeaderBoxPagePreview() {
    SBBTheme(includeSurface = true) {
        HeaderBoxPage()
    }
}