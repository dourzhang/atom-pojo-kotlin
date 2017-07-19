package com.watent.kotlin.model

/**
 * Account Repository
 *
 * Created by Atom on 2017/7/17.
 */
interface AccountRepository {
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

    /**
     * 主键查找
     *
     * @param id ID
     */
    fun findOne(id: Long): Account

    /**
     * 通过昵称查找
     *
     * @param  nickName 昵称
     */
    fun findByNickName(nickName: String): List<Account>
}