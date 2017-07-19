package com.watent.kotlin.infrastructure.mapper

import com.watent.kotlin.TestApplication
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

/**
 * Tests for [AccountMapper].

 * @author wonwoo
 * *
 * @since 1.2.1
 */
@RunWith(SpringRunner::class)
@SpringBootTest(classes = arrayOf(TestApplication::class))
class AccountMapperTest {

    @Autowired
    lateinit var accountMapper: AccountMapper

    @Test
    fun findByStateTest() {
        val accounts = accountMapper.selectByNickName("xhr1")
        assertThat(accounts[0].nickName).isEqualTo("xhr1")
    }

}