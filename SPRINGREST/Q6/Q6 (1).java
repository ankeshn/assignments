package com.capgemini.springrest;

public class Calculator {
	
	private int x;
	private int y;
	int result;
	
	public Calculator(int x, int y, int result) {
		this.x = x;
		this.y = y;
		this.result = result;
	}
	
	public int getX() {
		return x;}
	public void setX(int x) {
		this.x = x;}
	public int getY() {
		return y;}
	public void setY(int y) {
		this.y = y;}
	public int getResult() { return result;} public void setResult(int result) {
		this.result = result;}
}