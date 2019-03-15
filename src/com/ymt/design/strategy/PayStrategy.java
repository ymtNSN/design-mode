package com.ymt.design.strategy;

/**
 * @Description TODO
 * @Author yangmingtian
 * @Date 2019/3/15
 */
public interface PayStrategy {

    /**
     * 描述
     *
     * @return int
     * @params [price]
     * @author yangmingtian
     */
    int getPrice(int price);

    /**
     * 描述:
     *
     * @return com.ymt.design.strategy.PayStrategy
     * @params []
     * @author yangmingtian
     */
    static PayStrategy normalStrategy() {
        return price -> price;
    }

    /**
     * 描述：减半
     *
     * @param
     * @return
     * @author yangmingtian
     */
    static PayStrategy halveStrategy() {
        return price -> price / 2;
    }
}
