package com.main.services;

import com.main.entities.Login;
import com.main.entities.UserMaster;

public interface SignUp {
  public UserMaster signUp(UserMaster user) throws Exception;
  public boolean login(Login cred);
}
