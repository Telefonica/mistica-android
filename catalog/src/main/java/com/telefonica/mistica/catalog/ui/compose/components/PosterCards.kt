package com.telefonica.mistica.catalog.ui.compose.components

import androidx.annotation.AttrRes
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Checkbox
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.compose.card.postercard.PosterCard
import com.telefonica.mistica.compose.card.postercard.PosterCardAspectRatio
import com.telefonica.mistica.compose.card.postercard.PosterCardBackgroundType
import com.telefonica.mistica.compose.card.postercard.TopActionData
import com.telefonica.mistica.compose.input.DropDownInput
import com.telefonica.mistica.compose.tag.Tag
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.tag.TagView
import com.telefonica.mistica.tag.TagView.Companion.TYPE_PROMO

@Composable
fun PosterCards() {

    var tag: String by remember { mutableStateOf("Headline") }
    var tagType: Int by remember { mutableIntStateOf(TYPE_PROMO) }

    var aspectRatioType: PosterCardAspectRatio by remember { mutableStateOf(PosterCardAspectRatio.AR_AUTO) }

    var inverseDisplay: Boolean by remember { mutableStateOf(true) }
    var backgroundType: BackgroundType by remember { mutableStateOf(BackgroundType.IMAGE) }

    var topActionsType: TopActionsType by remember { mutableStateOf(TopActionsType.TWO_ACTIONS) }

    var preTitle: String by remember { mutableStateOf("Pretitle") }
    var title: String by remember { mutableStateOf("Title") }
    var subtitle: String by remember { mutableStateOf("Subtitle") }
    var description: String by remember { mutableStateOf("Description") }

    var withAdditionalContent: Boolean by remember { mutableStateOf(false) }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        DropDownInput(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 4.dp),
            items = PosterCardAspectRatio.entries.map { aspectRatioLabelsMaps[it].orEmpty() },
            currentItemIndex = PosterCardAspectRatio.entries.indexOf(aspectRatioType),
            onItemSelected = { index -> aspectRatioType = PosterCardAspectRatio.entries.toTypedArray()[index] },
            hint = "Aspect Ratio",
        )

        DropDownInput(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 4.dp),
            items = BackgroundType.entries.map { backgroundTypeLabelsMap[it].orEmpty() },
            currentItemIndex = BackgroundType.entries.indexOf(backgroundType),
            onItemSelected = { index -> backgroundType = BackgroundType.entries.toTypedArray()[index] },
            hint = "Background type",
        )

        if (backgroundType != BackgroundType.IMAGE) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("Inverse display")
                Checkbox(checked = inverseDisplay, onCheckedChange = {
                    inverseDisplay = !inverseDisplay
                    backgroundType.backgroundValue.inverseDisplay = inverseDisplay
                })
            }
        }

        DropDownInput(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 4.dp),
            items = TopActionsType.entries.map { topActionsTypeLabelsMap[it].orEmpty() },
            currentItemIndex = TopActionsType.entries.indexOf(topActionsType),
            onItemSelected = { index -> topActionsType = TopActionsType.entries.toTypedArray()[index] },
            hint = "Top actions",
        )

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = tag,
            onValueChange = { tag = it }, label = { Text("Tag label") }
        )

        DropDownInput(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 4.dp),
            items = TagColorsValues.entries.map { it.name },
            currentItemIndex = tagType,
            onItemSelected = { index -> tagType = index },
            hint = "Tag style",
        )

        OutlinedTextField(modifier = Modifier.fillMaxWidth(), value = preTitle, onValueChange = { preTitle = it }, label = { Text("Pretitle") })
        OutlinedTextField(modifier = Modifier.fillMaxWidth(), value = title, onValueChange = { title = it }, label = { Text("Title") })
        OutlinedTextField(modifier = Modifier.fillMaxWidth(), value = subtitle, onValueChange = { subtitle = it }, label = { Text("Subtitle") })
        OutlinedTextField(modifier = Modifier.fillMaxWidth(), value = description, onValueChange = { description = it }, label = { Text("Description") })

        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("With additional content")
            Checkbox(checked = withAdditionalContent, onCheckedChange = { withAdditionalContent = !withAdditionalContent })
        }

        PosterCard(
            modifier = Modifier.fillMaxWidth(),
            aspectRatio = aspectRatioType,
            backgroundType = backgroundType.backgroundValue,
            headline = if (tag.isNotEmpty()) Tag(tag).withStyle(tagType) else null,
            preTitle = preTitle.getOrNullIfEmpty(),
            title = title.getOrNullIfEmpty(),
            subtitle = subtitle.getOrNullIfEmpty(),
            description = description.getOrNullIfEmpty(),
            firstTopAction = topActionsType.info?.firstTopAction,
            secondTopAction = topActionsType.info?.secondTopAction,
            customContent = {
                if (withAdditionalContent) {
                    AdditionalContent()
                }
            }
        )
    }
}

private enum class TagColorsValues(@AttrRes val tagStyle: Int) {
    PROMO(TYPE_PROMO),
    ACTIVE(TagView.TYPE_ACTIVE),
    INACTIVE(TagView.TYPE_INACTIVE),
    SUCCESS(TagView.TYPE_SUCCESS),
    WARNING(TagView.TYPE_WARNING),
    ERROR(TagView.TYPE_ERROR),
    INVERSE(TagView.TYPE_INVERSE),
}

private val aspectRatioLabelsMaps = mapOf(
    PosterCardAspectRatio.AR_AUTO to "Auto",
    PosterCardAspectRatio.AR_1_1 to "1:1",
    PosterCardAspectRatio.AR_7_10 to "7:10",
    PosterCardAspectRatio.AR_9_10 to "9:10",
    PosterCardAspectRatio.AR_16_9 to "16:9"
)

private val backgroundTypeLabelsMap = mapOf(
    BackgroundType.SOLID_COLOR to "Solid color",
    BackgroundType.GRADIENT_COLOR to "Gradient color",
    BackgroundType.IMAGE to "Image"
)

private val topActionsTypeLabelsMap = mapOf(
    TopActionsType.NONE to "None",
    TopActionsType.ONE_ACTION_DISMISS to "One action (Dismiss)",
    TopActionsType.TWO_ACTIONS to "Two actions (View + Dismiss)"
)

private enum class BackgroundType(val backgroundValue: PosterCardBackgroundType) {
    IMAGE(PosterCardBackgroundType.Image(imageResource = R.drawable.sample_background, contentDescription = "Mística PosterCard")),
    SOLID_COLOR(PosterCardBackgroundType.Color(brush = SolidColor(Color.Red))),
    GRADIENT_COLOR(PosterCardBackgroundType.Color(brush = Brush.verticalGradient(colors = listOf(Color.Blue, Color.Cyan)))),
}

private enum class TopActionsType(val info: PosterCardTopActionInfo? = null) {
    NONE,
    ONE_ACTION_DISMISS(
        info = PosterCardTopActionInfo(
            firstTopAction = TopActionData(iconRes = R.drawable.ic_close_regular)
        )
    ),
    TWO_ACTIONS(
        info = PosterCardTopActionInfo(
            firstTopAction = TopActionData(
                iconRes = R.drawable.icn_visibility,
                contentDescription = "PosterCard Visible top action"
            ),
            secondTopAction = TopActionData(
                iconRes = R.drawable.ic_close_regular,
                contentDescription = "PosterCard Close top action"
            )
        )
    )
}

private data class PosterCardTopActionInfo(
    val firstTopAction: TopActionData? = null,
    val secondTopAction: TopActionData? = null
)

@Composable
internal fun AdditionalContent() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .size(150.dp)
            .background(color = MisticaTheme.colors.successHighInverse.copy(alpha = 0.5f))
            .border(width = 1.dp, color = MisticaTheme.colors.success),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Additional content",
            style = MisticaTheme.typography.preset2,
            color = MisticaTheme.colors.textPrimaryInverse
        )
    }
}

private fun String.getOrNullIfEmpty(): String? = this.ifEmpty { null }