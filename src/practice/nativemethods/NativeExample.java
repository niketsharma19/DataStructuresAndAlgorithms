package practice.nativemethods;

public class NativeExample {

	static {
		System.loadLibrary("nativedatetimeutils");
	}

	public native String getSystemTime();

	public static void main(String[] args) {
		NativeExample nativeExample = new NativeExample();
		nativeExample.getSystemTime();
	}

}
