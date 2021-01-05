package com.telefonica.mistica.mediacard

import android.content.Context
import android.graphics.drawable.Drawable
import android.media.MediaPlayer
import android.net.Uri
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.VideoView
import androidx.annotation.DrawableRes
import androidx.constraintlayout.widget.ConstraintLayout
import com.telefonica.mistica.R
import com.telefonica.mistica.util.hide
import com.telefonica.mistica.util.show


class MediaCardVideoView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    val thumbnail: ImageView
    val videoView: VideoView

    init {
        LayoutInflater.from(getContext()).inflate(R.layout.media_card_video_view, this, true)

        thumbnail = findViewById(R.id.media_card_video_thumbnail)
        videoView = findViewById(R.id.media_card_video)
    }

    override fun onVisibilityChanged(changedView: View, visibility: Int) {
        super.onVisibilityChanged(changedView, visibility)
        if (visibility != VISIBLE) {
            thumbnail.show()
            videoView.stopPlayback()
        }
    }

    fun setVideo(videoUri: Uri, @DrawableRes imageRes: Int) {
        thumbnail.setImageResource(imageRes)
        setVideo(videoUri)
    }

    fun setVideo(videoUri: Uri, imageDrawable: Drawable) {
        thumbnail.setImageDrawable(imageDrawable)
        setVideo(videoUri)
    }

    private fun setVideo(videoUri: Uri) {
        videoView.setVideoURI(videoUri)
        videoView.setOnPreparedListener {
            it.isLooping = true
            videoView.start()
        }
        videoView.setOnInfoListener { _, state, _ ->
            when (state) {
                MediaPlayer.MEDIA_INFO_VIDEO_RENDERING_START -> thumbnail.hide()
                else -> thumbnail.show()
            }
            true
        }
        videoView.show()
    }
}