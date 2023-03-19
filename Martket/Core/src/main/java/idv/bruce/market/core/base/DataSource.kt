package idv.bruce.market.core.base

interface DataSource<E, T : Data> {
    operator fun get(event: E): T
    operator fun set(event: E, data: T)
}