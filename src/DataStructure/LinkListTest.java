package DataStructure;

import java.util.LinkedList;
import java.util.List;

public class LinkListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList<Integer> li = new LinkList<Integer>();
		li.addNodeToFirst(1);
		li.addNodeToFirst(8);
		li.addNode(2,2);
		li.addNode(3,3);
		li.addToLast(7);
		li.addToLast(6);
		li.deletefromLast();
		//for(int i=0;i<li.size();i++){s
		System.out.println("list size:" +li.size());
			System.out.println(li.printlinklist());		
		//}
	}

}
