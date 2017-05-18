package com.huangdong.util.comparator;

import java.util.Comparator;
import java.util.Hashtable;

/**
 * Created by Administrator on 2017/5/8.
 */
public class TypeComparator implements Comparator {
    public int compare(Object a, Object b) {
        Hashtable hashA = (Hashtable)a;
        Hashtable hashB = (Hashtable)b;
        if (((Boolean)hashA.get("is_dir")) && !((Boolean)hashB.get("is_dir"))) {
            return -1;
        } else if (!((Boolean)hashA.get("is_dir")) && ((Boolean)hashB.get("is_dir"))) {
            return 1;
        } else {
            return ((String)hashA.get("filetype")).compareTo((String)hashB.get("filetype"));
        }
    }
}