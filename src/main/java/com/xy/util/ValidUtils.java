package com.xy.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUtils {
  public static boolean isEmail(String email)
  {
      if(email==null||email.equals(""))
          return false;
      Pattern pattern_email = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$");
      Matcher matcher = pattern_email.matcher(email);
       if(matcher.matches())
      return true;
       else
       return false;
  }
  public static boolean isPhone(String phone)
  {
      if(phone==null||phone.equals(""))
          return false;
      Pattern pattern_phone = Pattern.compile("^((13[0-9])|(14[0-9])|(15[^4,\\D])|(17[0-9])|(18[0-9]))\\d{8}$");
      Matcher matcher = pattern_phone.matcher(phone);
       if(matcher.matches())
      return true;
       else
       return false;
  }
}
