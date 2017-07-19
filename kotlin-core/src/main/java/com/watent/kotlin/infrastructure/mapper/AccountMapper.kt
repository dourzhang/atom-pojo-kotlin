package com.watent.kotlin.infrastructure.mapper

import com.watent.kotlin.model.Account
import org.apache.ibatis.annotations.*

/**
 * Account Mapper
 *
 * Created by Atom on 2017/7/17.
 */
@Mapper
interface AccountMapper {

    /**
     * 新增
     *
     * @param account 账户
     */
    @Insert("insert into account (nick_name , username ,  password , created_at , updated_at) values ( #{account.nickName} , #{account.username}  ,#{account.password} , now() , now() ) ")
    fun insert(@Param("account") account: Account): Long

    /**
     * 更新
     *
     * @param account 账户
     */
    @Update("update account set nick_name = #{account.nickName} , password = #{account.password} , update_at = now where id = #{account.id}")
    fun update(@Param("account") account: Account)

    /**
     * 删除
     *
     * @param id ID
     */
    @Delete("delete from account where id = #{id}")
    fun delete(@Param("id") id: Long)

    /**
     * 主键查找
     *
     * @param id ID
     */
    @Select("select * from account where id = #{id}")
    @ResultType(Account::class)
    fun selectOne(@Param("id") id: Long): Account

    /**
     * 通过昵称查找
     *
     * @param  nickName 昵称
     */
    @Select("select * from account where nick_name = #{nickName}")
    @ResultMap("AccountResultMap")
    fun selectByNickName(@Param("nickName") nickName: String): List<Account>

}