package org.smart4j.chapter2.util;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import sun.invoke.empty.Empty;

import java.util.Collection;
import java.util.Map;


/**
 *�ַ���������
 *
 */
public class CollectionUtil {
    /**
     *�ж�Collection�Ƿ�Ϊ��
     *
     */
    public static boolean isEmpty(Collection<?> collection){
        return CollectionUtils.isEmpty(collection);
    }

    /**
     *�ж�Collection�Ƿ�Ϊ��
     *
     */
    public static boolean isNotEmpty(Collection<?> collection){
        return !isEmpty(collection);
    }

    /**
     *�ж�Map�Ƿ�Ϊ��
     *
     */
    public static boolean isEmpty(Map<?,?> map){
        return MapUtils.isEmpty(map);
    }

    /**
     *�ж�Map�Ƿ�Ϊ��
     *
     */
    public static boolean isNotEmpty(Map<?,?> map){
        return !isEmpty(map);
    }
}
