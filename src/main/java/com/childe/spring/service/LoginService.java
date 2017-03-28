package com.childe.spring.service;

import com.childe.spring.Entity.UserInfo;
import com.childe.spring.dto.UserInfoDTO;
import org.springframework.stereotype.Service;

/**
 * Created by user on 2017/3/28.
 */
@Service
public class LoginService {

    public UserInfoDTO login(String  userName, String passwd){

        UserInfoDTO userInfoDTO= new UserInfoDTO();
        return userInfoDTO;
    }
}
