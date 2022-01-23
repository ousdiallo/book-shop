package com.osman.springbootbookseller.service;

import com.osman.springbootbookseller.model.User;

public interface IAuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
