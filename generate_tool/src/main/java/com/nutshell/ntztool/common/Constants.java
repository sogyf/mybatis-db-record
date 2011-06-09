/*
 * Copyright (c) 2010-2011 NutShell.
 * [Id:Constants.java  11-6-8 下午1:59 poplar.mumu ]
 */
package com.nutshell.ntztool.common;

import java.util.HashMap;
import java.util.Map;

/**
 * 系统常量.
 * <br/>
 *
 * @author poplar_mumu
 * @version 1.0 11-6-8 下午1:59
 * @since JDK 1.0
 */
public class Constants {
    /**
     * 数据库与JDBCJava类型
     */
    public static final Map<String, String> DATA_TYPE_MAP = new HashMap<String, String>();

    static {
        DATA_TYPE_MAP.put("bit","boolean");
        DATA_TYPE_MAP.put("tinyint","boolean");
        DATA_TYPE_MAP.put("varchar","String");
        DATA_TYPE_MAP.put("char","String");
        DATA_TYPE_MAP.put("text","String");
        DATA_TYPE_MAP.put("tinytext","String");
        DATA_TYPE_MAP.put("mediumtext","String");
        DATA_TYPE_MAP.put("longtext","String");
        DATA_TYPE_MAP.put("bigint","long");
        DATA_TYPE_MAP.put("mediumint","long");
        DATA_TYPE_MAP.put("int","int");
        DATA_TYPE_MAP.put("smallint","int");
        DATA_TYPE_MAP.put("number","int");
        DATA_TYPE_MAP.put("date","java.util.Date");
        DATA_TYPE_MAP.put("datetime","java.util.Date");
        DATA_TYPE_MAP.put("decimal","java.math.BigDecimal");
        DATA_TYPE_MAP.put("timestamp","java.util.Timestamp");
        DATA_TYPE_MAP.put("double","double");
    }

    /**
     * 当前工作目录
     */
    public static final String USER_DIR =System.getProperty("user.dir");
}