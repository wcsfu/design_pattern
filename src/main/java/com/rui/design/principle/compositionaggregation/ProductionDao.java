package com.rui.design.principle.compositionaggregation;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/21
 * @描述
 */
public class ProductionDao  {
    private AbstactDBConnection dbConnection;

    public void setDbConnection(AbstactDBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduction(){
        String conn =dbConnection.getDBConnection();
        System.out.println("使用"+conn+"增加产品");
    }
}
