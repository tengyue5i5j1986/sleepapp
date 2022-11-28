package com.bizi.sleep.service.impl;

import java.util.List;

import com.bizi.sleep.domain.User;
public interface IUserService {
    List<User> findAll();
    
    void Insert(User user);

    void Update(User user);

    void Delete(int id);
}