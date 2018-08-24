package org.smart4j.chapter2.util;


import org.apache.commons.lang3.StringUtils;

/**
 *×Ö·û´®¹¤¾ßÀà
 *
 */
public class StringUtil {

    /**
     *ÅÐ¶Ï×Ö·û´®ÊÇ·ñÎª¿Õ
     *
     */
    public static boolean isEmpty(String str){
        if(str != null){
            str = str.trim();
        }
        return StringUtils.isNotEmpty(str);
    }

    /**
     *ÅÐ¶Ï×Ö·û´®ÊÇ·ñÎª¿Õ
     *
     */
    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }

}
