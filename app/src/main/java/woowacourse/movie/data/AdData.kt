package woowacourse.movie.data

import woowacourse.movie.R
import woowacourse.movie.presentation.movielist.MovieItem

object AdData {
    val ads = List(10000) { MovieItem.Ad(R.drawable.woowa_ad) }
}
