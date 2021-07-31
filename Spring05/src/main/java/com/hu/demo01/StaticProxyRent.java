package com.hu.demo01;

/**
 * @author Dia o
 */
public class StaticProxyRent implements Rent{


    private Host host;
    public StaticProxyRent(Host host){
        this.host = host;
    }
    @Override
    public void rent() {
        host.rent();
        ad();
        contract();
        backAd();
    }
    public void ad(){
        System.out.println("有房屋出租！");
    }
    public void contract(){
        System.out.println("与房东签合同");
    }
    public void backAd(){
        System.out.println("房屋被出租");
    }
}
