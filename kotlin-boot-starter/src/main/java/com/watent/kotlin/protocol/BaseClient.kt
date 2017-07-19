package com.watent.kotlin.protocol

import feign.Param
import feign.RequestLine

/**
 * BaseClient
 *
 * Created by Atom on 2017/7/17.
 */
interface BaseClient<V> {

    @RequestLine("POST /save")
    fun save(v: V): Long

    @RequestLine("DELETE /{id}")
    fun delete(@Param("id") id: Long)

    @RequestLine("GET /{id}")
    fun findOne(@Param("id") id: Long): V


}