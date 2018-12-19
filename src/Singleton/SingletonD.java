package Singleton;

public class SingletonD {
	private static SingletonD instance;
	private SingletonD() {
		//throw new RuntimeException("Exception occured in creating singleton instance");
	}
	public static SingletonD getInstance(){
		if(instance == null){
			synchronized(SingletonD.class){
				if(instance == null) {
					instance = new SingletonD();
				}
			}
		}
		return instance;
	}

}
