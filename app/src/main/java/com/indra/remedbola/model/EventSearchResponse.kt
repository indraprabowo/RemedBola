package com.indra.remedbola.model

import com.google.gson.annotations.SerializedName

data class EventSearchResponse(

        @field:SerializedName("event")
        val events: MutableList<EventsItem>
)
