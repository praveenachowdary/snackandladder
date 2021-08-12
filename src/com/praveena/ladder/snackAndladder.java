package com.praveena.ladder;

public class snackAndladder {
        public int position=0;
        public static void main(String[] args) {
            double diceroll = Math.floor(Math.random() * 10) % 6+1;
            System.out.println(diceroll);
        }
    }