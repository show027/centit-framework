package com.centit.framework.security.model;


/**
 * Created by codefan on 17-1-20.
 */
@SuppressWarnings("deprecation")
public interface CentitPasswordEncoder {
    //String pretreatPassword(String rawPass);

    //String pretreatPassword(String rawPass, Object salt);

    String createPassword(String rawPass, Object salt);

    String encodePassword(String rawPass, Object salt);

    boolean isPasswordValid(String encodedPassword, String rawPass, Object salt);

}
