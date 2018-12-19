package DataStructure;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkList<T> {

	private LinkNode<T> first;  // point to the first node
	private LinkNode<T> last;   // point to the last node
	private static int size = 0;

	private static class LinkNode<T> {
		T data;
		LinkNode<T> next;
		public LinkNode(LinkNode<T> next, T data) {
			this.data = data;
			this.next = next;
			// this.prev = prev;
		}
	}

	public void addNodeToFirst(T t) {
		LinkNode<T> f = first;
		LinkNode<T> newnode = new LinkNode<>(f, t);
		first = newnode;
		if (f == null) {
			last = newnode;
		}
		else{
			newnode.next = last;
		}
		
		size++;

	}

	public void deletefromLast() {
		LinkNode<T> temp = first;
		LinkNode<T> lastp = null;
		LinkNode<T> l = last;
		if (l == null) {
			throw new NoSuchElementException();
		}
		while(temp.next!=null){
			lastp = temp;
			temp = temp.next;
		}
		lastp.next=null;
		size--;
	}

	public void addNode(int index, T t) {
		checkindex(index);
		if (size == index) {
			addToLast(t);
		}

	}

	public void addToLast(T t) {
		LinkNode<T> l = last;
		LinkNode<T> newnode = new LinkNode<>(null, t);
		last = newnode;
		if (l == null) {
			first.next = newnode;
		} else {
			l.next = newnode;
		}
		size++;
	}

	public void deleteFromMiddle(int index) {

	}

	public void checkindex(int index) {
		if (!isPositionIndex(index)) {
			throw new IndexOutOfBoundsException();
		}

	}

	public boolean isPositionIndex(int index) {
		return index >= 0 && index <= size;
	}

	public T printlinklist() {
		LinkNode<T> x = first;
		while (null != x.next) {
			System.out.println(x.data);
			x = x.next;
		}
		return x.data;
	}

	public static void main(String[] args) {
		LinkList<Integer> li = new LinkList<Integer>();
		li.addNodeToFirst(1);
		// li.addNodeToFirst(2);
		li.addNode(2, 3);

		// for(int i:li.first.data){
		// System.out.println(li.first.data);
		// System.out.println(li.first.next.toString());
		// System.out.println("the size:" +size);

		// li.deletefromLast();
		System.out.println("the size:" + size);
		li.printlinklist();
		// }

		// li.addNodeToFirst(2);
	}

	public int size() {
		return size;
	}
}
