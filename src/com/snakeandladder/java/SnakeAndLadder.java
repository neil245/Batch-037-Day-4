package com.snakeandladder.java;
import java.util.Random;
public class SnakeAndLadder {
public static void main(String[] args) {
	int roll = 0;
	System.out.println("Welcome to the Snakes and Ladders game");
	int init_position = 0;
	System.out.println("Initial position is"+init_position);
	int dice = (int)Math.floor(Math.random()*6+1);
	System.out.println("The dice roll gives : "+dice);
}
}