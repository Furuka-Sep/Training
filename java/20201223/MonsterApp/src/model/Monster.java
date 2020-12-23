package model;

public abstract class Monster {
	String name;
	public Monster(String name) {
		this.name=name;
	}
	public abstract String run();
}
