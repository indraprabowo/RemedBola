package com.indra.remedbola.view.matchesDetail

import com.indra.remedbola.model.TeamsItem

interface MatchesDetailView {

    fun showLoading()
    fun hideLoading()
    fun showTeamDetail(dataHomeTeam: MutableList<TeamsItem>, dataAwayTeam: MutableList<TeamsItem>)
}
