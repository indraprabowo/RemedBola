package com.indra.remedbola.view.favorites

import com.indra.remedbola.model.EventsItem
import com.indra.remedbola.model.TeamsItem

interface FavoritesTabsView {

    fun showLoading()
    fun hideLoading()
    fun showEmptyData()
    fun showEventList(data: MutableList<EventsItem>)
    fun showTeamList(data: MutableList<TeamsItem>)
}
