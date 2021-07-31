package com.snakeandladder.java;
import java.util.Random;
public class SnakeAndLadder {
public static void main(String[] args) {
	int roll = 0;
	System.out.println("Welcome to the Snakes and Ladders game");
	int init_position = 0;
	//System.out.println("Initial position is"+init_position);
	//int dice = (int)Math.floor(Math.random()*6+1);
	//System.out.println("The dice roll gives : "+dice);
	//int move = (int)Math.floor(Math.random()*3);
	//System.out.println("The value of move is : "+move);
	while(init_position<100) {
		int dice = (int)Math.floor(Math.random()*6+1);
		roll++;
		int move = (int)Math.floor(Math.random()*3);
		if(move == 0) {
			continue;
		}
		else if(move == 1) {
			init_position+=dice;
			if(init_position>100) {
				init_position =init_position-dice;
			}
			if(init_position == 100) {
				System.out.println("Player wins !!");
				break;
			}
		}
		else if(move == 2) {
			init_position = init_position-dice;
			if(init_position<0) {
				init_position = 0;
			}
		}
	}
	System.out.println("Number of dice rolls is"+roll);
}
}