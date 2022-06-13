package com.chainsys.projectA.beans;

public class Wheels {
	public void rotate() {
		System.out.println("Wheel rotating "+ hashCode());
	}
	public Wheels() {
		System.out.println("Wheel Object created "+ hashCode());
	}
}