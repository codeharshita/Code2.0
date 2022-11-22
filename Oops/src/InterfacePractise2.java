//Concrete class
class Phone{
	void call() {
		System.out.println("Phone is calling");
	}
	void sms() {
		System.out.println("Able to sms.");
	}
}
//Interface class.
interface ICamera{
    void shoot();
	void record();
	void vlog();
}

interface MusicPlayer{
	void play();
	void pause();
	void next();
}
//extends -> Inheritance
//implements ->Abstraction.
class SmartPhone extends Phone implements ICamera,MusicPlayer{
	void videoCall() {
		System.out.println("VideoCalling");
	}
	void playGame() {
		System.out.println("Play Game.");
	}
	@Override
	public void shoot() {
		System.out.println("The camera is shooting the video.");
	}
	@Override
	public void record() {
		System.out.println("The camera is recording the video.");
	}
	@Override
	public void vlog() {
		System.out.println("Vlogging feature is awesome.");
	}
	@Override
	public void play() {
		System.out.println("Audio is playing in the background.");
	}
	@Override
	public void pause() {
		System.out.println("Audio is paused.");
	}
	@Override
	public void next() {
		System.out.println("Song is changed. ");
	}
	
}


public class InterfacePractise2 {

	public static void main(String[] args) {
		MusicPlayer m = new SmartPhone();// restricted till MusicPlayer only.
		m.pause();
		m.play();
		m.next();
		
		ICamera c = new SmartPhone();//Restricted till ICamera only.
		c.shoot();
		c.record();
		c.vlog();
		
		SmartPhone s = new SmartPhone();
		s.call();
		s.next();
		s.pause();
		s.sms();
		s.videoCall();
		s.vlog();
		s.record();
		s.shoot();
		s.play();
		s.playGame();
		s.next();
		
		System.out.println();
		Phone p = new Phone();
		p.call();
		p.sms();

	}

}
