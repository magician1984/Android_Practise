package idv.bruce.markert.share.market_api.cache

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import idv.bruce.markert.share.market_api.MarketServiceConfig
import okhttp3.Cache

@Dao
internal interface CacheDao {
    @Query("SELECT * from ${MarketServiceConfig.DB_TABLE_NAME} where key = :key")
    fun getCache(key: String): CacheData

    @Upsert(entity = CacheData::class)
    fun updateCache(cache: Cache)
}