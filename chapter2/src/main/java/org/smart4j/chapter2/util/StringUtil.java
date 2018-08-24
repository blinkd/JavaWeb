package org.smart4j.chapter2.util;


import org.apache.commons.lang3.StringUtils;

/**
 *�ַ���������
 *
 */
public class StringUtil {

    /**
     *�ж��ַ����Ƿ�Ϊ��
     *
     */
    public static boolean isEmpty(String str){
        if(str != null){
            str = str.trim();
        }
        return StringUtils.isNotEmpty(str);
    }

    /**
     *�ж��ַ����Ƿ�Ϊ��
     *
     */
    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }

}
