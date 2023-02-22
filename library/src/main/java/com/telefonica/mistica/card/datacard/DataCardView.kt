package com.telefonica.mistica.card.datacard

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.annotation.IntDef
import androidx.annotation.StringRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import com.telefonica.mistica.R
import com.telefonica.mistica.card.CardView
import com.telefonica.mistica.card.datacard.DataCardView.IconType.Companion.TYPE_CIRCULAR_ICON
import com.telefonica.mistica.card.datacard.DataCardView.IconType.Companion.TYPE_ICON

@BindingMethods(
    BindingMethod(
        type = DataCardView::class,
        attribute = "cardIcon",
        method = "setIcon"
    ),
    BindingMethod(
        type = DataCardView::class,
        attribute = "cardIconType",
        method = "setIconType"
    ),
    BindingMethod(
        type = DataCardView::class,
        attribute = "cardSubtitle",
        method = "setSubtitle"
    )
)
class DataCardView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : CardView(context, attrs, defStyleAttr) {

    @Retention(AnnotationRetention.SOURCE)
    @IntDef(
        TYPE_ICON,
        TYPE_CIRCULAR_ICON,
    )
    annotation class IconType {
        companion object {
            const val TYPE_ICON = 0
            const val TYPE_CIRCULAR_ICON = 1
        }
    }

    private lateinit var imageLayout: FrameLayout
    private lateinit var assetCircularImageView: ImageView
    private lateinit var iconImageView: ImageView
    private var iconType: Int = TYPE_CIRCULAR_ICON

    override fun handleAttrsAndInflateLayout(
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int,
    ): View {

        val rootView = LayoutInflater.from(context).inflate(R.layout.data_card_view, this, true)
        imageLayout = findViewById(R.id.data_card_image_layout)
        assetCircularImageView = findViewById(R.id.data_card_circular_icon)
        iconImageView = findViewById(R.id.data_card_icon)

        if (attrs != null) {
            val styledAttrs =
                context.theme.obtainStyledAttributes(
                    attrs,
                    R.styleable.DataCardView,
                    defStyleAttr,
                    0
                )
            setSubtitle(styledAttrs.getText(R.styleable.DataCardView_cardSubtitle))
            setIconType(
                styledAttrs.getInt(
                    R.styleable.DataCardView_cardIconType,
                    TYPE_CIRCULAR_ICON
                )
            )
            styledAttrs.getResourceId(R.styleable.DataCardView_cardIcon, TypedValue.TYPE_NULL)
                .takeIf { it != TypedValue.TYPE_NULL }
                ?.let { AppCompatResources.getDrawable(context, it) }
                ?.let { setIcon(it) }
            styledAttrs.recycle()
        }
        return rootView
    }

    fun setIcon(icon: Drawable) {
        if (iconType == TYPE_CIRCULAR_ICON) {
            assetCircularImageView.setImageDrawable(icon)
            assetCircularImageView.visibility = View.VISIBLE
            iconImageView.visibility = View.GONE
        } else {
            iconImageView.setImageDrawable(icon)
            assetCircularImageView.visibility = View.GONE
            iconImageView.visibility = View.VISIBLE
        }

        imageLayout.visibility = View.VISIBLE
    }

    fun setIcon(@DrawableRes iconRes: Int) {
        AppCompatResources.getDrawable(context, iconRes)?.let {
            setIcon(it)
        }
    }

    fun setIconType(@IconType type: Int) {
        iconType = type
    }

    fun removeIcon() {
        imageLayout.visibility = View.GONE
    }

    fun setSubtitle(text: CharSequence?) {
        text?.let { setSubtitle(it.toString()) }
    }

    fun setSubtitle(@StringRes textRes: Int?) {
        textRes?.let { setSubtitle(context.getString(it)) }
    }
}
