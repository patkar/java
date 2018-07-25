interface TvRemote {
	public void switchOff();

	public void switchOn();

	public void ChangeChannel();

	public void increaseVolume();

	public void decreaseVolune();
}

class Sony implements TvRemote {
	@Override
	public void switchOff() {
		System.out.println("Sony tv switching off");
	}

	@Override
	public void switchOn() {
		// TODO Auto-generated method stub
		System.out.println("sony tv switching on");
	}

	@Override
	public void ChangeChannel() {
		// TODO Auto-generated method stub
		System.out.println("sony tv changing channel");
	}

	@Override
	public void increaseVolume() {
		// TODO Auto-generated method stub
		System.out.println("sony tv increasing volume");
	}

	@Override
	public void decreaseVolune() {
		// TODO Auto-generated method stub
		System.out.println("sony tv decreasing volume");
	}
}

class samsung implements TvRemote {

	@Override
	public void switchOff() {
		// TODO Auto-generated method stub
		System.out.println("samsung tv switching off");
	}

	@Override
	public void switchOn() {
		// TODO Auto-generated method stub
		System.out.println("samsung tv switching on");
	}

	@Override
	public void ChangeChannel() {
		// TODO Auto-generated method stub
		System.out.println("Sony tv changing channel");
	}

	@Override
	public void increaseVolume() {
		// TODO Auto-generated method stub
		System.out.println("Sony tv increasing volume");
	}

	@Override
	public void decreaseVolune() {
		// TODO Auto-generated method stub
		System.out.println("Sony tv decreasing volume");
	}

}

class InterfaceDemo {
	public static void main(String[] args) {
Sony s=new Sony();
s.switchOn();
s.switchOff();
s.ChangeChannel();
s.increaseVolume();
s.decreaseVolune();

samsung sm=new samsung();
sm.switchOn();
sm.switchOff();
sm.ChangeChannel();
sm.increaseVolume();
sm.decreaseVolune();
	}
}