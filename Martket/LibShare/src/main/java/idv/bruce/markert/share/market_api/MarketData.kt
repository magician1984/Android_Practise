package idv.bruce.markert.share.market_api

abstract class MarketData {
    abstract fun toCache(): ByteArray
}