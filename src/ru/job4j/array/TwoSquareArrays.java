package ru.job4j.array;

import java.util.Arrays;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int[] singleArray = new int[4 * left.length];
        int[][] multiArray = new int[left.length][left.length];
        for (int x = 0; x < left.length; x++) {
            for (int y = 0; y < left[x].length; y++) {
                for (int w = 0; w < right.length; w++) {
                    for (int z = 0; z < right[x].length; z++) {
                        multiArray[x][y] = Math.max(left[x][y], right[w][z]);
                    }
                }
            }
        }
        for(int i = 0; i < singleArray.length; i++) {
            for(int x = 0; x < multiArray.length; x++) {
                for(int z = 0; z < multiArray[x].length;z++) {
                    singleArray[i] = multiArray[x][z];
                }
            }
        }
        return singleArray;
        }
    }
