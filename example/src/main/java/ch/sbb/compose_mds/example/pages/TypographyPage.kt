package ch.sbb.compose_mds.example.pages

import SBBTheme
import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.beta.container.SBBGroup
import ch.sbb.compose_mds.beta.list.SBBListHeader
import ch.sbb.compose_mds.theme.SBBConst
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.SBBTypography

private const val DEFAULT_TEXT = "The quick brown fox jumps over the lazy dog"

@Composable
fun TypographyPage() {
    Column(
        modifier =
            Modifier
                .verticalScroll(rememberScrollState())
                .padding(vertical = SBBSpacing.XSmall),
    ) {
        MaterialTypography()
        SBBTypographySection()
    }
}

@Composable
private fun MaterialTypography() {
    TextStylePreview(name = "Display Large", MaterialTheme.typography.displayLarge)
    TextStylePreview(name = "Display Medium", MaterialTheme.typography.displayMedium)
    TextStylePreview(name = "Display Small", MaterialTheme.typography.displaySmall)

    TextStylePreview(name = "Headline Large", MaterialTheme.typography.headlineLarge)
    TextStylePreview(name = "Headline Medium", MaterialTheme.typography.headlineMedium)
    TextStylePreview(name = "Headline Small", MaterialTheme.typography.headlineSmall)

    TextStylePreview(name = "Title Large", MaterialTheme.typography.titleLarge)
    TextStylePreview(name = "Title Medium", MaterialTheme.typography.titleMedium)
    TextStylePreview(name = "Title Small", MaterialTheme.typography.titleSmall)

    TextStylePreview(name = "Body Large", MaterialTheme.typography.bodyLarge)
    TextStylePreview(name = "Body Medium", MaterialTheme.typography.bodyMedium)
    TextStylePreview(name = "Body Small", MaterialTheme.typography.bodySmall)

    TextStylePreview(name = "Label Large", MaterialTheme.typography.labelLarge)
    TextStylePreview(name = "Label Medium", MaterialTheme.typography.labelMedium)
    TextStylePreview(name = "Label Small", MaterialTheme.typography.labelSmall)
}

@Composable
private fun SBBTypographySection() {
    TextStylePreview(name = "XXLargeLight", SBBTheme.sbbTypography.XXLargeLight)
    TextStylePreview(name = "XXLargeBold", SBBTheme.sbbTypography.XXLargeBold)
    TextStylePreview(name = "XLargeLight", SBBTheme.sbbTypography.XLargeLight)
    TextStylePreview(name = "XLargeBold", SBBTheme.sbbTypography.XLargeBold)
    TextStylePreview(name = "LargeLight", SBBTheme.sbbTypography.largeLight)
    TextStylePreview(name = "LargeBold", SBBTheme.sbbTypography.largeBold)

    TextStylePreview(name = "MediumLight", SBBTheme.sbbTypography.mediumLight)
    TextStylePreview(name = "MediumBold", SBBTheme.sbbTypography.mediumBold)

    TextStylePreview(name = "SmallLight", SBBTheme.sbbTypography.smallLight)
    TextStylePreview(name = "SmallBold", SBBTheme.sbbTypography.smallBold)
    TextStylePreview(name = "XSmallLight", SBBTheme.sbbTypography.XSmallLight)
    TextStylePreview(name = "XSmallBold", SBBTheme.sbbTypography.XSmallBold)
    TextStylePreview(name = "XXSmallLight", SBBTheme.sbbTypography.XXSmallLight)
    TextStylePreview(name = "XXSmallBold", SBBTheme.sbbTypography.XXSmallBold)


}

@OptIn(ExperimentalSBBComponent::class)
@Composable
private fun TextStylePreview(
    name: String,
    style: TextStyle,
) {
    SBBListHeader(text = name)
    SBBGroup(modifier = Modifier.padding(horizontal = SBBConst.DEFAULT_HORIZONTAL_PADDING)) {
        Text(
            text = DEFAULT_TEXT,
            style = style,
            modifier = Modifier.padding(all = SBBSpacing.XSmall),
        )
        HorizontalDivider()
        TextStyleInfos(style = style)
    }
}

@Composable
private fun TextStyleInfos(style: TextStyle) {
    Text(
        text = "fontWeight: ${style.fontWeight}\n" + "fontSize: ${style.fontSize}\n" + "lineHeight: ${style.lineHeight}",
        style = MaterialTheme.typography.bodyMedium,
        modifier = Modifier.padding(all = SBBSpacing.XSmall),
    )
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun Preview_TypographyPage() {
    SBBTheme {
        Surface {
            TypographyPage()
        }
    }
}
