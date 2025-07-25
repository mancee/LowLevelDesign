package SnakeAndLadder;

public class Snake {
	int head,tail;
	
	Snake(int head, int tail){
		this.setHead(head);
		this.setTail(tail);
	}

	public int getHead() {
		return head;
	}

	public void setHead(int head) {
		this.head = head;
	}

	public int getTail() {
		return tail;
	}

	public void setTail(int tail) {
		this.tail = tail;
	}
	
}
