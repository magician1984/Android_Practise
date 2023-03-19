package idv.bruce.markert.share.market_api

import idv.bruce.market.core.database.DatabaseConfig

object MarketServiceConfig {
    const val DB_NAME = DatabaseConfig.DB_FILE_NAME

    const val DB_TABLE_NAME = "t_market_remote_cache"

    const val API_ROOT = "https://openapi.twse.com.tw/v1/"
}