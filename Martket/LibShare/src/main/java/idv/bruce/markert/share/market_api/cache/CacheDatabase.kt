package idv.bruce.markert.share.market_api.cache

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import idv.bruce.markert.share.market_api.MarketServiceConfig

@Database(entities = [CacheData::class], version = 1)
internal abstract class CacheDatabase private constructor() : RoomDatabase() {
    companion object {
        private var _instance: CacheDatabase? = null

        fun getInstance(context: Context): CacheDatabase {
            if (_instance == null) {
                synchronized(this) {
                    if (_instance == null) {
                        _instance = Room.databaseBuilder(
                            context,
                            CacheDatabase::class.java,
                            MarketServiceConfig.DB_NAME
                        ).build()
                    }
                }
            }
            return _instance!!
        }
    }

    abstract fun cacheDao(): CacheDao
}