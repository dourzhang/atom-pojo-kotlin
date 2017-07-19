package com.watent.kotlin.infrastructure.mapper

import com.watent.kotlin.model.AccountRepository
import com.watent.kotlin.model.Account
import org.springframework.stereotype.Repository
import javax.annotation.Resource

/**
 * AccountRepository Impl
 *
 * Created by Atom on 2017/7/17.
 */
@Repository
open class AccountRepositoryImpl : AccountRepository {

    @Resource
    lateinit var accountMapper: AccountMapper

    override fun save(account: Account): Long {

        if (null == account.id) {
            accountMapper.insert(account)
        } else {
            accountMapper.update(account)
        }
        return account.id
    }

    override fun findOne(id: Long): Account {
        return accountMapper.selectOne(id)
    }


    override fun delete(id: Long) {
        accountMapper.delete(id)
    }

    override fun findByNickName(nickName: String): List<Account> {
        return accountMapper.selectByNickName(nickName)
    }

}

