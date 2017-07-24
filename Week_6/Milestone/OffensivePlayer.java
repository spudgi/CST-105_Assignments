package application;

import java.util.Random;

public abstract class OffensivePlayer extends NFLPlayer {
	private int passingTouchdowns,interceptionsThrown,passAttempts,passCompletions,passingYards,rushingYards,rushingAttempts,rushingTouchdowns,fumbles,receivingYards,receptions,receivingTouchdowns;
    private double completionPercent = 0;
    private double yardsPerCarry = 0;
    private double yardsPerCatch = 0;
	private String Name;
	private String Position;
	private int Yardage;
	private int Fumbles;
    
    public OffensivePlayer() {
    	super();
    }
    
    public void setPassingTouchdowns(int passingTouchdowns) {
    	this.passingTouchdowns = passingTouchdowns;
    }
    
    public int getpassingTouchdowns() {
    	return this.passingTouchdowns;
    }
    
    public void setInterceptionsThrown(int interceptionsThrown) {
    	this.interceptionsThrown = interceptionsThrown;
    }
    
    public int getInterceptionsThrown() {
    	return this.interceptionsThrown;
	}
    
    public int setPassAttempts(int passAttempts) {
    	return this.passAttempts = passAttempts;
    }
    
    public int getPassAttempts() {
    	return this.passAttempts;
    }
    
    public void setPassCompletions(int passCompletions) {
    	this.passCompletions = passCompletions;
    }
    
    public int getPassCompletions() {
    	return this.passCompletions;
    }
    
    public void setCompletionPercent(double completionPercent) {
    	this.completionPercent = completionPercent;
    }
    
    public double getCompletionPercent() {
    	return completionPercent;
    }
    
    public void setRushingAttempts(int rushingAttempts) {
    	this.rushingAttempts = rushingAttempts;
    }
    
    public int getRushingAttempts() {
    	return rushingAttempts;
    }
    
    public void setYardsPerCarry(double yardsPerCarry) {
    	this.yardsPerCarry = yardsPerCarry;
    }
    
    public double getYardsPerCarry() {
    	return yardsPerCarry; 
    }
    
    public void setPassingYards(int passingYards) {
    	this.passingYards = passingYards;
    }
    
    public int getPassingYards() {
    	return this.passingYards;
    }
    
    public void setRushingTouchdowns(int rushingTouchdowns) {
    	this.rushingTouchdowns = rushingTouchdowns;
    }
    
    public int getRushingTouchdowns() {
    	return this.rushingTouchdowns;
    }
    
    public void setReceivingYards(int receivingYards) {
    	this.receivingYards = receivingYards;
    }
    
    public int getReceivingYards() {
    	return this.receivingYards;
    }
    
    public void setReceptions(int receptions) {
    	this.receptions = receptions;
    }
    
    public int getReceptions() {
    	return this.receptions;
    }
    
    public void setYardsPerCatch(double yardsPerCatch) {
    	this.yardsPerCatch = yardsPerCatch;
    }
    
    public void setReceivingTouchdowns(int receivingTouchdowns) {
    	this.receivingTouchdowns = receivingTouchdowns;
    }
    
    public int getReceivingTouchdowns() {
    	return this.receivingTouchdowns;
    }
    
    public int randNum(int low, int high) {
    	Random randomNumber = new Random();
    	return randomNumber.nextInt(high) + low;
    }
    
    public OffensivePlayer(String Name, String Position , int passintTouchdowns, int interceptionsThrown, int passAttempts, int passCompletions,double completionPercent, int passingYards, int rushingYards, int rushingAttempts,double yardsPerCarry, int rushingTouchdowns, int fumbles, int receivingYards, int receptions,double yardsPerCatch, int receivingTouchdowns) {

    	setName(Name);
		setPosition(Position);
		setPassingTouchdowns(passingTouchdowns);
		setInterceptionsThrown(interceptionsThrown);
		setPassAttempts(passAttempts);
		setPassCompletions(passCompletions);
		setCompletionPercent(completionPercent);
		setYards(Yardage);
		setRushingAttempts(rushingAttempts);
		setYardsPerCarry(yardsPerCarry);
		setRushingTouchdowns(rushingTouchdowns);
		setFumbles(Fumbles);
		setReceivingYards(receivingYards);
		setReceptions(receptions);
		setYardsPerCatch(yardsPerCatch);
		setReceivingTouchdowns(receivingTouchdowns);
    }
}
