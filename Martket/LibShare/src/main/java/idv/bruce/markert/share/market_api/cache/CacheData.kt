package idv.bruce.markert.share.market_api.cache

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import idv.bruce.markert.share.market_api.MarketServiceConfig
import idv.bruce.markert.share.market_api.MarketData

@Entity(tableName = MarketServiceConfig.DB_TABLE_NAME)
internal class CacheData(
    @PrimaryKey
    val key: String,
    data: MarketData
) {
    @ColumnInfo(name = "time")
    val date: Long = System.currentTimeMillis()

    @ColumnInfo(name = "value")
    private val blob: ByteArray

    init {
        blob = data.toCache()
    }
}