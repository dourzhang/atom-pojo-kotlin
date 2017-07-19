package com.watent.kotlin.controller

import com.watent.kotlin.model.Account
import com.watent.kotlin.protocol.AccountManagerClient
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import javax.annotation.Resource

/**
 * Account Controller
 *
 * Created by Atom on 2017/7/18.
 */
@Controller
@RequestMapping("/account")
class AccountController {

    @Resource
    lateinit var accountManagerClient: AccountManagerClient

    @PostMapping("/save")
    fun save(account: Account): Long {
        return accountManagerClient.save(account)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: Long) {
        accountManagerClient.delete(id)
    }

    @ResponseBody
    @GetMapping("/{id}")
    fun findOne(@PathVariable("id") id: Long): Account {
        return accountManagerClient.findOne(id)
    }

    @ResponseBody
    @GetMapping("/nickName/{nickName}")
    fun findByNickName(@PathVariable("nickName") nickName: String): List<Account> {
        return accountManagerClient.findByNickName(nickName)
    }

}