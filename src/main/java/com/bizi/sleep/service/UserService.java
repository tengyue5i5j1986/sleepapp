package com.bizi.sleep.service;
import com.bizi.sleep.service.impl.IUserService;
import com.bizi.sleep.domain.User;
import com.bizi.sleep.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@SuppressWarnings("ALL")
@Service
public class UserService implements IUserService {
    @Autowired
    private UserMapper userMapper;

    private  final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Override
    public List<User> findAll(){
        int i = 1;
        System.out.println("debug 1");
        logger.info("debug 2");
        i = ++i;
        return userMapper.findAll();
    }

    @Override
    public void Insert(User user){
        userMapper.Insert(user);
    }

    @Override
    public void Update(User user){
        userMapper.Update(user);
    }

    @Override
    public void Delete(int id){
        userMapper.Delete(id);
    }
}