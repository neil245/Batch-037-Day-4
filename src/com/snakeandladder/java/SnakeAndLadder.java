package com.snakeandladder.java;
import java.util.Random;
public class SnakeAndLadder {
public static void main(String[] args) {
	int player1=0;
	int player2=0;
	int rolls=1;
	while(player1<100 && player2<100) {
		int dice=(int) Math.floor(Math.random()*6+1);
		int option=(int) Math.floor(Math.random()*2);
		int temp1=player1;
		int temp2=player2;
		int ch2;
		switch(option) {
		case 0:
			//Ladder-play
			if(rolls%2!=0) {
				player1=player1+dice;
				System.out.println("player1 position="+player1);
				ch2=(int) Math.floor(Math.random()*6+1);
				player1=player1+ch2;
				System.out.println("player1 position="+player1);
			}else {
				player2=player2+dice;
				ch2=(int) Math.floor(Math.random()*6+1);
				player2=player2+ch2;
				System.out.println("player2 position="+player2);
			}
			break;
		case 1:
			//Snake-play
			if(rolls%2!=0) {
				player1=player1-dice;
				System.out.println("player1 position="+player1);
			}else {
				player2=player2-dice;
				System.out.println("player2 position="+player2);
			}
		default:
			//no-play
			break;
		}
		
		if(rolls%2!=0) {
			if(player1<0) {
				player1=0;
			}
			if(player1>100) {
				player1=temp1;
			}
		}else {
			if(player2<0) {
				player2=0;
			}
			if(player2>100) {
				player2=temp2;
			}
		}
		rolls++;
	}
	System.out.println("Number of rolls required to win the game="+(rolls-1));
	System.out.println("Final position of player1="+player1);
	System.out.println("Final position of player2="+player2);
	if(player1==100) {
		System.out.println("Player1 is the winner!!");
	}else if(player2==100){
		System.out.println("Player2 is the winner!!");
	}
	}
}
