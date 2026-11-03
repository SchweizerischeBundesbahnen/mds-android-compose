package ch.sbb.compose_mds.example.pages

import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.test.junit4.v2.createAndroidComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import ch.sbb.compose_mds.example.MainActivity
import ch.sbb.compose_mds.theme.SBBTheme
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureScreenRoboImage
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@OptIn(ExperimentalRoborazziApi::class, ExperimentalMaterial3Api::class)
@RunWith(AndroidJUnit4::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(
    sdk = [35],
    qualifiers = RobolectricDeviceQualifiers.Pixel7Pro,
)
class BottomSheetTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

  @Test
  fun testDefaultBottomSheet() {
      composeTestRule.activity.setContent {
      SBBTheme(includeSurface = true) {
        DefaultBottomSheet(onDismiss = {})
      }
    }
    composeTestRule.waitForIdle()
    captureScreenRoboImage()
  }

  @Test
  fun testDefaultBottomSheetDark() {
      composeTestRule.activity.setContent {
      SBBTheme(includeSurface = true, darkTheme = true) {
        DefaultBottomSheet(onDismiss = {})
      }
    }
    composeTestRule.waitForIdle()
    captureScreenRoboImage()
  }

  @Test
  fun testScrollableBottomSheet() {
      composeTestRule.activity.setContent {
      SBBTheme(includeSurface = true) {
        ScrollableBottomSheet(onDismiss = {})
      }
    }
    composeTestRule.waitForIdle()
    captureScreenRoboImage()
  }

  @Test
  fun testScrollableBottomSheetDark() {
      composeTestRule.activity.setContent {
      SBBTheme(includeSurface = true, darkTheme = true) {
        ScrollableBottomSheet(onDismiss = {})
      }
    }
    composeTestRule.waitForIdle()
    captureScreenRoboImage()
  }

  @Test
  fun testFullScreenBottomSheet() {
      composeTestRule.activity.setContent {
      SBBTheme(includeSurface = true) {
        FullScreenBottomSheet(onDismiss = {})
      }
    }
    composeTestRule.waitForIdle()
    captureScreenRoboImage()
  }

  @Test
  fun testFullScreenBottomSheetDark() {
      composeTestRule.activity.setContent {
      SBBTheme(includeSurface = true, darkTheme = true) {
        FullScreenBottomSheet(onDismiss = {})
      }
    }
    composeTestRule.waitForIdle()
    captureScreenRoboImage()
  }
}
