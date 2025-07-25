package Practice;

import java.util.HashMap;

class Node{
	int key,val;
	Node next,prev;
	
	Node(int k, int v){
		this.key=k;
		this.val=v;
	}
}

public class Solution {
	
	Node head,tail;
	HashMap<Integer,Node> map = new HashMap<>();
	int capacity =2;
	Solution(){
		head = new Node(-1,-1);
		tail = new Node(-1,-1);
		head.next=tail;
		tail.prev=head;
	}
	
	int get(int key) {
		if(!map.containsKey(key)) return -1;
		Node curr = map.get(key);
		delete(curr);
		insert(curr);
		return curr.val;
	}
	
	void put(int key, int value) {
		if(map.containsKey(key)) {
			delete(map.get(key));
		}
		else if(map.size()==capacity) {
			delete(tail.prev);
		}
		insert(new Node(key,value));
	}
	
	void insert(Node node) {
		map.put(node.key, node);
		
		node.next = head.next;
		head.next.prev = node;
		head.next = node;
		node.prev = head;
	}
	void delete(Node node) {
		map.remove(node.key);
		
		node.next.prev = node.prev;
		node.prev.next = node.next;
	}
	
	public static void main(String[] args) {
		
		
	}
}
