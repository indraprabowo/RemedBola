package com.indra.remedbola.view.teams

import com.indra.remedbola.model.LeagueResponse
import com.indra.remedbola.model.TeamsItem

interface TeamsView {

    fun showLoading()
    fun hideLoading()
    fun showEmptyData()
    fun showLeagueList(data: LeagueResponse)
    fun showTeamList(data: MutableList<TeamsItem>)
}
