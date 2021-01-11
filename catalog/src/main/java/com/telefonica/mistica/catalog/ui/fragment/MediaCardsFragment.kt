package com.telefonica.mistica.catalog.ui.fragment

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.catalog.ui.fragment.MediaCardAdapter.Companion.MEDIA_CARDS_CAROUSEL_SIZE
import com.telefonica.mistica.input.CheckBoxInput
import com.telefonica.mistica.input.TextInput
import com.telefonica.mistica.mediacard.MediaCardView


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
            hasAdditionalContent = view.findViewById<CheckBoxInput>(R.id.additional_content_checkbox)
                .isChecked(),
            internetVideoResource = view.findViewById<CheckBoxInput>(R.id.video_internet_content_checkbox)
                .isChecked(),
            localVideoResource = view.findViewById<CheckBoxInput>(R.id.video_local_content_checkbox)
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
    val hasAdditionalContent: Boolean = false,
    val internetVideoResource: Boolean = false,
    val localVideoResource: Boolean = false
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
            setMultimedia(cardData)
            setTag(cardData.tag)
            setTitle(cardData.title)
            setSubtitle(cardData.subtitle)
            setDescription(cardData.description)
            setPrimaryButtonText(cardData.primaryButton)
            setLinkButtonText(cardData.linkButton)
            setAdditionalCardContent(cardData)
            setClickListeners(this)
        }
    }

    private fun MediaCardView.setAdditionalCardContent(cardData: MediaCardData) {
        if (cardData.hasAdditionalContent) {
            val additionalContent = LayoutInflater.from(context).inflate(
                R.layout.card_additional_sample_content,
                this,
                false
            )
            setMediaCardAdditionalContent(additionalContent)
        } else {
            setMediaCardAdditionalContent(null)
        }
    }

    private fun MediaCardView.setMultimedia(cardData: MediaCardData) {
        if (cardData.internetVideoResource || cardData.localVideoResource) {
            if (cardData.localVideoResource) {
                loadVideoFromLocal()
            } else {
                loadVideoFromInternet()
            }
        } else {
            setCardImage(R.drawable.media_card_sample_image)
        }
    }

    private fun MediaCardView.loadVideoFromInternet() {
        setVideo(
            Uri.parse(VIDEO_SAMPLE_INTERNET_FILE),
            R.drawable.media_card_internet_video_thumbnail
        )
    }

    private fun MediaCardView.loadVideoFromLocal() {
        setVideo(
            Uri.parse("android.resource://${context.packageName}/raw/$LOCAL_VIDEO_FILE_NAME"),
            R.drawable.media_card_local_video_thumbnail
        )
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
        private const val LOCAL_VIDEO_FILE_NAME = "media_card_video"
        private const val VIDEO_SAMPLE_INTERNET_FILE =
            "https://fr-es.mytelco.io/2hi3ruaA-rsLprXrhwHf-5LEpifOh4JAiDa0ZJWbj4w__PUAFIk5h5A"
    }

}