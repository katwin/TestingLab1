package com.githab.eefimova.part2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HashInteger {
    public List<Integer>[] array;

    public HashInteger() {
        array = new ArrayList[13];
        for (int i = 0; i < 13; i++) {
            array[i] = new ArrayList<>();
        }
    }

    public void add(int number) {
        int hash = getHash(number);
        switch (hash) {
            case 0:
                array[0].add(number);
                break;
            case 1:
                array[1].add(number);
                break;
            case 2:
                array[2].add(number);
                break;
            case 3:
                array[3].add(number);
                break;
            case 4:
                array[4].add(number);
                break;
            case 5:
                array[5].add(number);
                break;
            case 6:
                array[6].add(number);
                break;
            case 7:
                array[7].add(number);
                break;
            case 8:
                array[8].add(number);
                break;
            case 9:
                array[9].add(number);
                break;
            case 10:
                array[10].add(number);
                break;
            case 11:
                array[11].add(number);
                break;
            case 12:
                array[12].add(number);
                break;
        }
    }

    public boolean delete(int number) {
        int hash = getHash(number);
        boolean isExist = false;
        Iterator<Integer> i = array[hash].iterator();
        while (i.hasNext()) {
            int n = i.next();
            if (n == number) {
                isExist = true;
                i.remove();
                break;
            }
        }

        return isExist;
    }

    public boolean contains(int number) {
        int hash = getHash(number);
        boolean isExist = false;
        for (int i : array[hash]) {
            if (i == number) {
                isExist = true;
                break;
            }
        }
        return isExist;
    }

    private int getHash(int number) {
        return number % 13;
    }
}
