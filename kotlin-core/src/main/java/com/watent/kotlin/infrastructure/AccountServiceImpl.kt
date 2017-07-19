package com.watent.kotlin.infrastructure

import com.watent.kotlin.model.AccountRepository
import com.watent.kotlin.model.Account
import com.watent.kotlin.service.AccountService
import org.springframework.stereotype.Service
import javax.annotation.Resource

/**
 * AccountService Impl
 *
 * Created by Atom on 2017/7/17.
 */
@Service
class AccountServiceImpl : AccountService {

    @Resource
    lateinit var accountRepository: AccountRepository

    override fun save(account: Account): Long {
        return accountRepository.save(account)
    }

    override fun delete(id: Long) {
        accountRepository.delete(id)
    }

}