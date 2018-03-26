package com.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * com.iotek.util
 *
 * @author <Author Administrator>
 * @date 2018/3/14 12:00
 */
public class RegularExpressCheck {
    public static boolean checkEmail(String email){
        String regex_email="^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        Pattern pattern=Pattern.compile(regex_email);
        Matcher m=pattern.matcher(email);
        if(m.matches()){
           return true;
        }else{
            return false;
        }
    }
    public static boolean checkPhone(String phone){
        String regex_phone="^((1[3,5,8][0-9])|(14[5,7])|(17[0,6,7,8])|(19[7]))\\d{8}$";
        Pattern pattern=Pattern.compile(regex_phone);
        Matcher m=pattern.matcher(phone);
        if(m.matches()){
            return true;
        }else {
            return false;
        }
    }

    public static boolean checkName(String name){
        String regex_name="^[a-z0-9_-]{3,16}$";
        Pattern pattern=Pattern.compile(regex_name);
        Matcher m=pattern.matcher(name);
        if(m.matches()){
            return true;
        }else {
            return false;
        }
    }
}