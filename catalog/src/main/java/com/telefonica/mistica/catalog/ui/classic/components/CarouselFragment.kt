package com.telefonica.mistica.catalog.ui.classic.components

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.DrawableRes
import com.telefonica.mistica.button.Button
import androidx.fragment.app.Fragment
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.catalog.R.drawable.card_image_sample
import com.telefonica.mistica.catalog.databinding.CarouselFragmentCatalogBinding
import com.telefonica.mistica.card.mediacard.MediaCardView

class CarouselFragment : Fragment() {

    private lateinit var binding: CarouselFragmentCatalogBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = CarouselFragmentCatalogBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.carouselView
            .setContent(getMediaCardsForCaroussel())
            .setPagerIndicatorView(binding.carouselPageIndicatorView)
            .setItemCount(MEDIA_CARDS_CAROUSEL_SIZE)
    }

    private fun getMediaCardsForCaroussel(): List<MediaCardView> {
        val mediaCards = mutableListOf<MediaCardView>()
        for (i in 1..MEDIA_CARDS_CAROUSEL_SIZE) {
            mediaCards.add(MediaCardView(context!!).apply {
                setTag("HEADLINE")
                setCardImage(card_image_sample)
                setTitle("Page$i")
                setSubtitle("(position ${i - 1})")
                setDescription("Description")
                setPrimaryButtonText("Primary")
                setLinkButtonText("Link")
                setPrimaryButtonOnClick { Toast.makeText(context, "primaryButton$i", Toast.LENGTH_SHORT).show() }
                setLinkButtonOnClick { Toast.makeText(context, "linkButton$i", Toast.LENGTH_SHORT).show() }
                setCardAdditionalContent(null)
            })
        }
        return mediaCards
    }

    private companion object {
        const val MEDIA_CARDS_CAROUSEL_SIZE = 6
    }

}

