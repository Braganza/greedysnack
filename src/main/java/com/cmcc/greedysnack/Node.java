/*
 * Project: greedysnack
 * 
 * File Created at 2018年11月23日
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package com.cmcc.greedysnack;

/**
 * @Type Node.java
 * @Desc 
 * @author Braganza
 * @date 2018年11月23日 上午11:44:58
 * @version 
 */
public class Node {
    private int x, y;

    public Node() {
    }

    public Node(int a, int b) {
        x = a;
        y = b;
    }

    public Node(Node tmp) {
        x = tmp.getX();
        y = tmp.getY();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2018年11月23日 Braganza creat
 */
