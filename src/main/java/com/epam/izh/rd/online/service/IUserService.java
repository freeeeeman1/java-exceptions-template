package com.epam.izh.rd.online.service;

import com.epam.izh.rd.online.entity.User;

public interface IUserService {

    User register(User user) throws Exception;

    void delete(String login) throws Exception;
}
