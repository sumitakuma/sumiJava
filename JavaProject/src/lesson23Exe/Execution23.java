package lesson23Exe;

import java.util.Objects;

import lesson23Pro.Processing23;

public class Execution23 {
	
	public static void main(String[] args) {
		
		// コンストラクタをライオン用に変換
		Processing23 ani23 = new Processing23();
		
		ani23.setAnimal("ライオン");
		
		// コンストラクタを体長用に変換
		Processing23 body23 = new Processing23();
		
		body23.setBodyLength(2.1);
		
		// コンストラクタを速度に変換
		Processing23 speed23 = new Processing23();
		
		speed23.setSpeed(80);
		
		// ライオン
		if (Objects.nonNull(ani23)) {
			System.out.println("動物名 :" + ani23.getAnimal());
		}
		
		// 体長 : 2.1m
		if (Objects.nonNull(body23)) {
			System.out.println("体長 :" + body23.getBodyLength() + "m");
		}
		// 速度 : 80km/h
		if (Objects.nonNull(speed23)) {
			System.out.println("速度 :" + speed23.getSpeed() + "km/h");
		}
	}
}
/*
	
	下記がコンソールに出力されるように作成してください
	
	動物名：ライオン
	体長：2.1m
	速度：80km/h
	
*/