package com.watent.kotlin.provider

import com.watent.kotlin.model.AccountRepository
import com.watent.kotlin.model.Account
import com.watent.kotlin.model.AccountManager
import org.springframework.web.bind.annotation.*
import javax.annotation.Resource

/**
 * AccountManager Impl
 *
 * Created by Atom on 2017/7/17.
 */
@RestController
@RequestMapping("/account")
class AccountManagerImpl : AccountManager {

    @Resource
    lateinit var accountRepository: AccountRepository

    @PostMapping("/save")
    override fun save(account: Account): Long {
        return accountRepository.save(account)
    }

    @DeleteMapping("/{id}")
    override fun delete(@PathVariable("id") id: Long) {
        accountRepository.delete(id)
    }

    @GetMapping("/{id}")
    override fun findOne(@PathVariable("id") id: Long): Account {
        return accountRepository.findOne(id)
    }

    @GetMapping("/nickName/{nickName}")
    override fun findByNickName(@PathVariable("nickName") nickName: String): List<Account> {
        return accountRepository.findByNickName(nickName)
    }


}