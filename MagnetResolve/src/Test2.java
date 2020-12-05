import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Timer;
import java.util.TimerTask;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aa = "magnet:?xt=urn:btih:EOKGSHBIBO2H5NS6GKOJ32MNQ2ZTBLW3&";
		System.out.println(aa);
		System.out.println(aa.replace("&", "DOG"));
		final int i = 0;
		Timer a = new Timer();
		Thread t = new Thread();
		while(i<10) {
		a.schedule(new TimerTask() {
			public void run() {
				System.out.println("haha " + i);
			}
		}, 1000);
		i++;
		}
		
		/*LinkedList<String> ll = new LinkedList<String>();
		ll.add("aa");
		ll.add("bb");
		ll.add("cc");
		ListIterator<String> li = ll.listIterator();
		System.out.println(li.next());*/
	}

}
