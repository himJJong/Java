package cooperation;

public class Subway {

	String SubwayNumber;
	int passengerCount;
	int money;
	

	public Subway(String SubwayNumber) {
		this.SubwayNumber = SubwayNumber;
	}

	public void take(int money) {
		this.money += money;
		passengerCount++;
		}
	public void showInfo() {
		System.out.println("지하철 " + SubwayNumber + "번의승객" + passengerCount +"명이고 수입은 "+ money+"입니다.");
	}
}

