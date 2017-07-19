package com.watent.kotlin.model;

import java.util.List;

/**
 * Account Manager
 * <p>
 * Created by Atom on 2017/7/17.
 */
public interface AccountManager {

    /**
     * 新增
     *
     * @param account 账户
     */
    Long save(Account account);

    /**
     * 删除
     *
     * @param id ID
     */
    void delete(Long id);

    /**
     * 主键查找
     *
     * @param id ID
     */
    Account findOne(Long id);

    /**
     * 通过昵称查找
     *
     * @param nickName 昵称
     */
    List<Account> findByNickName(String nickName);
}
