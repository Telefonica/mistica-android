package com.telefonica.mistica.catalog.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.StyleRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState
import com.telefonica.mistica.catalog.R.drawable.carousel_card_image_sample
import com.telefonica.mistica.catalog.databinding.CarouselFragmentCatalogBinding
import com.telefonica.mistica.compose.card.Action
import com.telefonica.mistica.compose.card.mediacard.MediaCard
import com.telefonica.mistica.compose.card.mediacard.MediaCardImage
import com.telefonica.mistica.compose.carousel.CarouselState
import com.telefonica.mistica.compose.tag.Tag
import com.telefonica.mistica.tag.TagView.Companion.TYPE_PROMO

class CarouselFragment() : Fragment() {

    private lateinit var binding: CarouselFragmentCatalogBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = CarouselFragmentCatalogBinding.inflate(layoutInflater)
        return binding.root
    }

    @OptIn(ExperimentalPagerApi::class)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val carouselState = CarouselState(PagerState(0))
        val pages = 6
        binding.carouselView
            .setContent { page -> CarouselItem(page) }
            .setState(carouselState)
            .setItemCount(pages)

        binding.carouselPageIndicatorView
            .setState(carouselState)
            .setPageCount(pages)
    }
}

@Composable
private fun CarouselItem(page: Int) {
    MediaCard(
        modifier = Modifier
            .height(500.dp)
            .fillMaxWidth(),
        image = MediaCardImage.MediaCardImageResource(carousel_card_image_sample),
        tag = Tag("HEADLINE").withStyle(TYPE_PROMO),
        title = "Page ${page + 1} ",
        subtitle = "(position ${page})",
        description = "Description",
        primaryButton = Action("Primary") {},
        linkButton = Action("Link") {}
    )
}

