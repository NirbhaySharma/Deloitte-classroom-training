package collectionexamples;

import java.util.ArrayList;
import java.util.Iterator;

public class SampleArrayList {

	
	public static void main(String[] args) {
		ArrayList list= new ArrayList();
		
		list.add(567);
		list.add("hello");
	    list.add(34.89);
		list.add(567);
		list.add(null);
		System.out.println(list+" "+list.size());
		list.add("hyd");
		list.add("java");
//		list.remove((Object)567);
//    	list.remove(new Integer(567));
		int i=0;
		Iterator itr= list.listIterator();
		System.out.println(list+" "+list.size());
		 
				while(itr.hasNext()){
					Object obj=itr.next();
					if(obj instanceof Integer){
						System.out.println(obj);
					}
				}
		
				while (i<list.size()){
					try{
						int x= Integer.parseInt(list.get(i++).toString());
						System.out.println(x);
						
					}
					catch(ClassCastException|NumberFormatException|NullPointerException e){
						
						}
					}
				
			
		}
	}


