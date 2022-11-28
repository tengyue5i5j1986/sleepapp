package com.bizi.sleep.mapper;
import java.util.List;

import com.bizi.sleep.domain.User;


public interface UserMapper {
    
    List<User> findAll();

    void Insert(User user);

    void Update(User user);

    void Delete(int id);
    

}

