package concurrent;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapdemo {

	public static void main(String[] args) {

		ConcurrentMap<Object, Object> cm = new ConcurrentHashMap<Object, Object>();
		cm.put(101, "TOM");
		cm.put(102, "JERRY");

		System.out.println(cm);  //{101=TOM, 102=JERRY}

		cm.putIfAbsent(102, "CAT"); // not added because key already present
		cm.putIfAbsent(103, "RAT");
		cm.putIfAbsent(104, "DOG");
		cm.putIfAbsent(105, "COW");

		System.out.println(cm);  //{101=TOM, 102=JERRY, 103=RAT}
		
		cm.remove(104);
		cm.remove(104,"NOTCOW");   //not deleted because value not matched
		
		System.out.println(cm);  //{101=TOM, 102=JERRY, 103=RAT, 105=COW}
		
        cm.replace(101, "TOM-REPLACED");
        cm.replace(102, "NOT-JERRY","JERRY-REPLACED"); //not replaced value not matchedS
        
		System.out.println(cm);  //{101=TOM-REPLACED, 102=JERRY, 103=RAT, 105=COW}

	}

}
