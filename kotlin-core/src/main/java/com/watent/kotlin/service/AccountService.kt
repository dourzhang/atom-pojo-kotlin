package com.watent.kotlin.service

import com.watent.kotlin.model.Account

/**
 * Account Service
 *
 * Created by Atom on 2017/7/17.
 */
interface AccountService {

    /**
     * 新增
     *
     * @param account 账户
     */
    fun save(account: Account): Long

    /**
     * 删除
     *
     * @param id ID
     */
    fun delete(id: Long)
}