package idv.bruce.markert.share.market_api

import idv.bruce.market.core.base.DataSource

class MarketInfoService: DataSource<Events, MarketData>() {


    override fun get(event: Events): MarketData {
        TODO("Not yet implemented")
    }

    override fun init() {
        TODO("Not yet implemented")
    }

    override fun release() {
        TODO("Not yet implemented")
    }
}