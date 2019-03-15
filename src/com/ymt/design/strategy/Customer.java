package com.ymt.design.strategy;

import java.util.ArrayList;

/**
 * @Description TODO
 * @Author yangmingtian
 * @Date 2019/3/15
 */
class Customer {

    private final ArrayList<Integer> cloths = new ArrayList<>();
    private PayStrategy payStrategy;

    Customer(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    /**
     * 描述
     *
     * @return void
     * @params [price, quantity]
     * @author yangmingtian
     */
    void add(int price, int quantity) {
        this.cloths.add(this.payStrategy.getPrice(price * quantity));
    }

    /**
     * 描述
     *
     * @return void
     * @params []
     * @author yangmingtian
     */
    void printPay() {
        System.out.println("Total:" + this.cloths.stream().mapToInt(value -> value).sum());
    }

    /**
     * 描述
     *
     * @return void
     * @params [payStrategy]
     * @author yangmingtian
     */
    void setStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }
}
