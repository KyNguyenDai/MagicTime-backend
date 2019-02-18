package com.appsdevelopblog.app.ws.security;

import com.appsdevelopblog.app.ws.SpringApplicationContext;

public class SecurityConstants {
    public static final long EXPIRATION = 86400000;
    public static final String TOKEN_PREFIX = "Dknguyen";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/users";
    public static final String TOKEN_SECRET = "jp09090902bjkdnkjfoie";

    public static String getTokenSecret() {
        AppProperties appProperties = (AppProperties) SpringApplicationContext.getBean("AppProperties");
        return appProperties.getTokenSecret();
    }
}


