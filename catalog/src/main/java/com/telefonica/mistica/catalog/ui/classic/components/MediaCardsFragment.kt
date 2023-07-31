package com.telefonica.mistica.catalog.ui.classic.components

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.telefonica.mistica.button.Button
import com.telefonica.mistica.card.mediacard.MediaCardView
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.catalog.ui.classic.components.MediaCardAdapter.Companion.MEDIA_CARDS_CAROUSEL_SIZE
import com.telefonica.mistica.input.CheckBoxInput
import com.telefonica.mistica.input.TextInput


class MediaCardsFragment : Fragment() {

    private lateinit var mediaCardRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.media_card_fragment_catalog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.media_card_button_update)
            .setOnClickListener { setMediaCardsCarousel(view) }
        mediaCardRecyclerView = view.findViewById(R.id.media_cards_carousel)
        setMediaCardsCarousel(view)
    }

    private fun setMediaCardsCarousel(view: View) {
        val cardData = MediaCardData(
            tag = view.findViewById<TextInput>(R.id.input_tag).text.toString(),
            title = view.findViewById<TextInput>(R.id.input_title).text.toString(),
            subtitle = view.findViewById<TextInput>(R.id.input_subtitle).text.toString(),
            description = view.findViewById<TextInput>(R.id.input_description).text.toString(),
            primaryButton = view.findViewById<TextInput>(R.id.input_primary_button).text.toString(),
            linkButton = view.findViewById<TextInput>(R.id.input_link_button).text.toString(),
            hasCustomContent = view.findViewById<CheckBoxInput>(R.id.additional_content_checkbox)
                .isChecked()
        )
        val mediaCards = mutableListOf<MediaCardData>()
        for (a in 1..MEDIA_CARDS_CAROUSEL_SIZE) {
            mediaCards.add(cardData)
        }
        mediaCardRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        mediaCardRecyclerView.adapter = MediaCardAdapter(mediaCards)
    }
}

data class MediaCardData(
    val tag: String?,
    val title: String?,
    val subtitle: String?,
    val description: String?,
    val primaryButton: String?,
    val linkButton: String?,
    val hasCustomContent: Boolean = false
)

class MediaCardAdapter(private val mediaCards: List<MediaCardData>) :
    RecyclerView.Adapter<MediaCardAdapter.CardViewHolder>() {

    class CardViewHolder(val cardView: MediaCardView) : RecyclerView.ViewHolder(cardView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val mediaCardView = inflater.inflate(
            R.layout.media_card_carousel_item, parent, false
        ) as MediaCardView
        return CardViewHolder(mediaCardView)
    }

    override fun getItemCount(): Int = MEDIA_CARDS_CAROUSEL_SIZE

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val cardData = mediaCards[position]
        with(holder.cardView) {
            setCardImage(R.drawable.media_card_sample_image)
            setTag(cardData.tag)
            setPretitle(cardData.subtitle)
            setTitle(cardData.title)
            setDescription(cardData.description)
            setPrimaryButtonText(cardData.primaryButton)
            setLinkButtonText(cardData.linkButton)
            setCustomCardContent(cardData)
            setClickListeners(this)
        }
    }

    private fun MediaCardView.setCustomCardContent(cardData: MediaCardData) {
        if (cardData.hasCustomContent) {
            val customContent = LayoutInflater.from(context).inflate(
                R.layout.card_custom_sample_content,
                this,
                false
            )
            setCardAdditionalContent(customContent)
        } else {
            setCardAdditionalContent(null)
        }
    }

    private fun MediaCardView.setClickListeners(view: View) {
        setPrimaryButtonOnClick(View.OnClickListener {
            Toast.makeText(
                view.context,
                "Primary button clicked!",
                Toast.LENGTH_SHORT
            ).show()
        })
        setLinkButtonOnClick(View.OnClickListener {
            Toast.makeText(
                view.context,
                "Secondary button clicked!",
                Toast.LENGTH_SHORT
            ).show()
        })
        setOnClickListener {
            Toast.makeText(
                view.context,
                "Media card clicked!",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    companion object {
        const val MEDIA_CARDS_CAROUSEL_SIZE = 10
    }

}
