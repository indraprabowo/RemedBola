package com.indra.remedbola.view.favorites

import android.content.Context

import com.indra.remedbola.helper.database
import com.indra.remedbola.model.EventsItem
import com.indra.remedbola.model.TeamsItem

import org.jetbrains.anko.db.classParser
import org.jetbrains.anko.db.select

class FavoritesTabsPresenter(private val context: Context?,
                             private val view: FavoritesTabsView) {

    fun getFavoritedEvents() {
        view.showLoading()

        val data: MutableList<EventsItem> = mutableListOf()

        context?.database?.use {
            val favorites = select(EventsItem.TABLE_EVENTS)
                    .parseList(classParser<EventsItem>())

            data.addAll(favorites)
        }

        view.hideLoading()

        if (data.size > 0) {
            view.showEventList(data)
        } else {
            view.showEmptyData()
        }
    }

    fun getFavoritedTeams() {
        view.showLoading()

        val data: MutableList<TeamsItem> = mutableListOf()

        context?.database?.use {
            val favorites = select(TeamsItem.TABLE_TEAMS)
                    .parseList(classParser<TeamsItem>())

            data.addAll(favorites)
        }

        view.hideLoading()

        if (data.size > 0) {
            view.showTeamList(data)
        } else {
            view.showEmptyData()
        }
    }
}
