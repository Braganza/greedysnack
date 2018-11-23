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

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * @Type Snack.java
 * @Desc 
 * @author Braganza
 * @date 2018年11月23日 上午11:27:42
 * @version 
 */
public class Snack {
    static final int DIR[][] = { { 0, -1 }, { 0, 1 }, { -1, 0 }, { 1, 0 } };
    private List<Node> lt = new ArrayList<Node>();
    private int curDir;

    public Snack() {
        curDir = 3;
        lt.add(new Node(350, 250));
    }

    int length() {
        return lt.size();
    }

    int getDir() {
        return curDir;
    }

    void draw(Graphics g) {
        g.setColor(Color.black);
        for (int i = 0; i < lt.size(); i++) {
            g.fillRect(lt.get(i).getX(), lt.get(i).getY(), 10, 10);
        }
    }

    boolean Dead() {
        for (int i = 1; i < lt.size(); i++) {
            if (lt.get(0).getX() == lt.get(i).getX() && lt.get(0).getY() == lt.get(i).getY())
                return true;
        }
        return false;
    }

    Node headMove() {
        int tx = lt.get(0).getX() + SnackWin.Size * DIR[curDir][0];
        int ty = lt.get(0).getY() + SnackWin.Size * DIR[curDir][1];
        if (tx > SnackWin.GameLocX + SnackWin.GameWidth - SnackWin.Size)
            tx = SnackWin.GameLocX;
        if (tx < SnackWin.GameLocX)
            tx = SnackWin.GameWidth + SnackWin.GameLocX - SnackWin.Size;
        if (ty > SnackWin.GameLocY + SnackWin.GameHeight - SnackWin.Size)
            ty = SnackWin.GameLocY;
        if (ty < SnackWin.GameLocY)
            ty = SnackWin.GameHeight + SnackWin.GameLocY - SnackWin.Size;
        Node tmp = new Node(tx, ty);
        return tmp;
    }

    void move() {
        Node head = headMove(), newNode = new Node();
        boolean eat = false;
        if (Math.abs(head.getX() - SnackWin.rx) < 10 && Math.abs(head.getY() - SnackWin.ry) < 10) {
            eat = true;
            newNode = new Node(lt.get(lt.size() - 1));
            SnackWin.rx = (int) (Math.random() * (SnackWin.GameWidth - 10) + SnackWin.GameLocX);
            SnackWin.ry = (int) (Math.random() * (SnackWin.GameHeight - 10) + SnackWin.GameLocY);
        }
        for (int i = lt.size() - 1; i > 0; i--)
            lt.set(i, lt.get(i - 1));
        lt.set(0, head);
        if (Dead()) {
            JOptionPane.showMessageDialog(null, "Snake eating itself", "Message", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        if (eat) {
            lt.add(newNode);
            SnackWin.score++;
            SnackWin.speed++;
        }
    }

    void changeDir(int dir) {
        curDir = dir;
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
