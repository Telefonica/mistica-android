package com.telefonica.mistica.catalog.ui.classic.components

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.accompanist.pager.PagerState
import com.telefonica.mistica.card.mediacard.MediaCardView
import com.telefonica.mistica.catalog.R.drawable.card_image_sample
import com.telefonica.mistica.catalog.databinding.CarouselFragmentCatalogBinding
import com.telefonica.mistica.compose.carousel.CarouselState

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
        val carouselState = CarouselState(PagerState(0))
        binding.carouselView
            .setContent(getMediaCardsForCarousel())
            .setState(carouselState)
            .setItemCount(MEDIA_CARDS_CAROUSEL_SIZE)

        binding.carouselPageIndicatorView
            .setState(carouselState)
            .setPageCount(MEDIA_CARDS_CAROUSEL_SIZE)
    }

    private fun getMediaCardsForCarousel(): List<MediaCardView> {
        val mediaCards = mutableListOf<MediaCardView>()
        for (i in 1..MEDIA_CARDS_CAROUSEL_SIZE) {
            mediaCards.add(MediaCardView(requireContext()).apply {
                setTag("HEADLINE")
                setCardImage(card_image_sample)
                setTitle("Page$i")
                setSubtitleText("(position ${i - 1})")
                setDescription("Description")
                setPrimaryButtonText("Primary")
                setLinkButtonText("Link")
                setPrimaryButtonOnClick { Toast.makeText(requireContext(), "primaryButton$i", Toast.LENGTH_SHORT).show() }
                setLinkButtonOnClick { Toast.makeText(requireContext(), "linkButton$i", Toast.LENGTH_SHORT).show() }
                setCardAdditionalContent(null)
            })
        }
        return mediaCards
    }

    private companion object {
        const val MEDIA_CARDS_CAROUSEL_SIZE = 6
    }

}

