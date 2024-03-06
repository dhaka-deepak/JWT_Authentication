package com.deepak.JWT_Authentication.Config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.security.web.authentication.logout.LogoutHandler;

public interface CustomLogoutHandle extends LogoutHandler {
    void logout(HttpServletRequest request,
                HttpServletResponse response,
                Authentication authentication);
}
