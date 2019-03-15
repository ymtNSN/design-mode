package com.ymt.design.strategy;

/**
 * @Description TODO
 * @Author yangmingtian
 * @Date 2019/3/15
 */
public class StrategyMain {
    public static void main(String[] args) {
        PayStrategy normalStrategy = PayStrategy.normalStrategy();
        PayStrategy halveStrategy = PayStrategy.halveStrategy();

        Customer customer = new Customer(normalStrategy);
        customer.add(100, 2);
        customer.setStrategy(halveStrategy);
        customer.add(300, 3);
        customer.printPay();

        Customer customer1 = new Customer(halveStrategy);
        customer1.add(200, 1);
        customer1.setStrategy(normalStrategy);
        customer1.add(100, 4);
        customer1.printPay();
    }
}
