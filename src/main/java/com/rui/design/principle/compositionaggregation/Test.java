package com.rui.design.principle.compositionaggregation;

/**
 * @创建人 wangrui
 * @创建时间 2019/10/21
 * @描述
 */
public class Test {

    public static void main(String[] args) {
        ProductionDao productionDao=new ProductionDao();
        productionDao.setDbConnection(new PostgreSQLConnection());
        productionDao.addProduction();
    }
}
