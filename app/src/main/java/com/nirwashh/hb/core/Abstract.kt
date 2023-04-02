package com.nirwashh.hb.core

abstract class Abstract {
    interface Mapper {
        class Empty : Mapper
    }

    abstract class Object<T, M : Mapper> {
        abstract fun map(mapper: M): T
    }
}