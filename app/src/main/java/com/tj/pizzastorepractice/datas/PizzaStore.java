package com.tj.pizzastorepractice.datas;

import java.io.Serializable;

public class PizzaStore implements Serializable {

    public String storeName;    // 가게 이름
    public String openTime; //운영시간
    public String logoUrl; //로고url
    public String phoneNum;  //연락처

    public PizzaStore(String storeName, String openTime, String phoneNum, String logoUrl ) {
        this.storeName = storeName;
        this.openTime = openTime;
        this.logoUrl = logoUrl;
        this.phoneNum = phoneNum;

    }
}
