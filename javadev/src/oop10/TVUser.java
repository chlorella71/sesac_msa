package oop10;

import java.io.FileInputStream;
import java.util.Properties;

public class TVUser {
	public static void main(String[] args) throws Exception {
//		TV tv = new LgTV();	//upcasting해서 쓰는 것이 더 편함?
//		//현재 TV는 Lg에 의존적,Lg가 있어야 실행가능?
//		tv.setSpeaker(new MarshallSpeaker());
//		tv.powerOn();
//		tv.channelUp();
//		tv.channelDown();
//		tv.soundUp();
//		tv.soundDown();
//		tv.powerOff();
		
		Properties prop = new Properties();
		prop.load(new FileInputStream("src/oop10/product.properties"));
		String tvName = prop.getProperty("tv");	//둘이 만나서는게 아니라 홀로선 둘이 만나게 됨?. 의존적이지 않게됨
		Class tvClass = Class.forName(tvName);	//tvName에 해당하는 값을 이름으로 하는 class가 있는지 찾음?
		TV tv = (AppleTV)tvClass.getConstructor().newInstance(); // TV tv = new LgTV();
		// instance를 만들어줌?
		//Object를 참조하기때문에 사용하려면 downcasting을 해주어야함?
		String speakerName = prop.getProperty("speaker");
		Class speakerClass = Class.forName(speakerName);
		tv.setSpeaker((Speaker)speakerClass.getConstructor().newInstance());
		//	클래스는 내비두고 설정파일만 변경해주면 값이 바뀜
		tv.powerOn();
		tv.channelUp();
		tv.channelDown();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();
		
		TV tv2 = new SamsungTV();	//upcasting
		tv2.setSpeaker(new HarmanSpeaker());
		tv2.powerOn();
		tv2.channelUp();
		tv2.channelDown();
		tv2.soundUp();
		tv2.soundDown();
		tv2.powerOff();
		
//		LgTV tv = new LgTV();
//		tv.turnOn();
//		tv.channelUp();
//		tv.channelDown();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.turnOff();
	}
}
