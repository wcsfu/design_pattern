package com.rui.design.principle.compositionaggregation;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/21
 * @描述
 */
public  class PostgreSQLConnection extends AbstactDBConnection {
    @Override
    public String getDBConnection() {
        return "Postgre数据库链接";
    }
}
