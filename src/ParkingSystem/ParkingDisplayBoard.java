package ParkingSystem;

import java.util.Random;

public class ParkingDisplayBoard {
	private String id;
	private HandicappedSpot handicappedFreeSpot;
	private MotorbikeSpot motorbikeFreeSpot;
	private LargeSpot largeFreeSpot;
	private CompactSpot compactFreeSpot;
	private ElectricSpot electricFreeSpot;
	private Random rand;
	
	ParkingDisplayBoard(){
		rand  = new Random();
		this.id = Integer.toString(rand.nextInt(1000));
	}
	
	public void printDisplayBoard() {
		System.out.println(" ---------- Display Board --------------");
		System.out.println("HandiCapped Free Spot - " + handicappedFreeSpot==null ? "HandiCapped is full" :handicappedFreeSpot.getNumber());
		System.out.println("Electric Free Spot - " + electricFreeSpot==null ? "Electric is full" : electricFreeSpot.getNumber());
		System.out.println("Motorbike Free Spot - " + motorbikeFreeSpot==null ? "Motorbike is full" : motorbikeFreeSpot.getNumber());
		System.out.println("Large Free Spot - " + largeFreeSpot==null ? "Large is full" : largeFreeSpot.getNumber());
		System.out.println("Compact Free Spot - " + compactFreeSpot==null ? "Compact is full" : compactFreeSpot.getNumber());
	}
	
	public ElectricSpot getElectricFreeSpot() {
		return electricFreeSpot;
	}
	public void setElectricFreeSpot(ElectricSpot electricFreeSpot) {
		this.electricFreeSpot = electricFreeSpot;
	}
	public HandicappedSpot getHandicappedFreeSpot() {
		return handicappedFreeSpot;
	}
	public void setHandicappedFreeSpot(HandicappedSpot handicappedFreeSpot) {
		this.handicappedFreeSpot = handicappedFreeSpot;
	}
	public MotorbikeSpot getMotorbikeFreeSpot() {
		return motorbikeFreeSpot;
	}
	public void setMotorbikeFreeSpot(MotorbikeSpot motorbikeFreeSpot) {
		this.motorbikeFreeSpot = motorbikeFreeSpot;
	}
	public LargeSpot getLargeFreeSpot() {
		return largeFreeSpot;
	}
	public void setLargeFreeSpot(LargeSpot largeFreeSpot) {
		this.largeFreeSpot = largeFreeSpot;
	}
	public CompactSpot getCompactFreeSpot() {
		return compactFreeSpot;
	}
	public void setCompactFreeSpot(CompactSpot compactFreeSpot) {
		this.compactFreeSpot = compactFreeSpot;
	}
	public String getId() {
		return id;
	}
	
	
	
}
