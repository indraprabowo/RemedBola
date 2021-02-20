package com.indra.remedbola.view.matches

import com.indra.remedbola.model.EventsItem
import com.indra.remedbola.model.LeagueResponse

interface MatchesEventsView {

    fun showLoading()
    fun hideLoading()
    fun showEmptyData()
    fun showLeagueList(data: LeagueResponse)
    fun showEventList(data: MutableList<EventsItem>)
}
