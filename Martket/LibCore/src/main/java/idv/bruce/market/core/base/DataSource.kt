package idv.bruce.market.core.base

abstract class DataSource<I, O> {
    interface OnDataNotifyListener<O> {
        fun onNotify(data: O)
    }

    var onDataNotifyListener: OnDataNotifyListener<O>? = null

    abstract fun init()

    abstract fun release()

    abstract operator fun get(event: I): O

    protected fun notify(data: O) = onDataNotifyListener?.onNotify(data)
}