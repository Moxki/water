package com.mox.service.impl;

import com.mox.entity.UsUser;
import com.mox.mapper.UsUserMapper;
import com.mox.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<UsUserMapper, UsUser> implements UserService {
}
