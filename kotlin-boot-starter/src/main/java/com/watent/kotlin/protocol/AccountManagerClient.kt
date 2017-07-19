package com.watent.kotlin.protocol

import com.watent.kotlin.model.Account
import feign.Param
import feign.RequestLine
import org.springframework.cloud.netflix.feign.FeignClient

/**
 * AccountManager Client
 *
 * Created by Atom on 2017/7/17.
 */
@FeignClient(name = "kotlin-server/account")
interface AccountManagerClient : BaseClient<Account> {

    /**
     * 通过名字查找

     * @return Pojo
     */
    @RequestLine("GET /nickName/{name}")
    fun findByNickName(@Param("name") name: String): List<Account>

}