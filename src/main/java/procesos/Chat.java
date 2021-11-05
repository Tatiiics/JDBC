package procesos;

public class Chat {
	private boolean msg = true;

	public synchronized void Question(String s1){
	
	while (!msg) {
		try{
			wait();		
		}catch (Exception e) {
			// TODO: handle exception
		}
		msg = false;
			notify();
		}
	}

public synchronized void Answer(String s2){	
		while (msg) {
			try{
				wait();
			}catch (Exception e) {
				
			}
			msg = true;
				notify();
			}
		}
}
