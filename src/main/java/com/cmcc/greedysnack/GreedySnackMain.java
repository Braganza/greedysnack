/*
 * Project: mytrain
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

import javax.swing.JFrame;

/**
 * @Type GreedySnackMain.java
 * @Desc 
 * @author Braganza
 * @date 2018年11月23日 上午11:26:34
 * @version 
 */
public class GreedySnackMain extends JFrame {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    static final int Width = 800, Height = 600, LocX = 200, LocY = 80;

    public GreedySnackMain() {
        super("贪吃蛇");
        SnackWin snackwin = new SnackWin();
        add(snackwin);
        // this.setSize(Width, Height);
        this.setVisible(true);
        // this.setLocation(LocX, LocY);
    }

    public static void main(String[] args) {
        new GreedySnackMain();
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
