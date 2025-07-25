package Facebook;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Random;
import java.time.LocalDate;
import java.time.LocalTime;

public class Member extends Person{
	
	private String name;
	private LocalDate dateOfMembership;
	private int memberId;
	
	private Profile profile;
//	private HashSet<Integer> memberFollows;
	private HashSet<Member> memberConnections;
	private HashSet<ConnectionInvitation> connectionInvitation;
//	private HashSet<Integer> groupFollows;
//	private HashSet<Integer> pageFollows;
	private HashSet<Post> posts;
	Random rand;
	
	Member(String name, String gender, String email, String phone, String password){
		super(name,email,phone,password, AccountStatus.ACTIVE);
		rand = new Random();
		this.name = name;
		this.dateOfMembership = LocalDate.now();
		this.memberId = rand.nextInt(10000);
		this.profile = new Profile(gender,null,null);
		connectionInvitation = new HashSet<>();
		memberConnections = new HashSet<>();
		posts = new HashSet<>();
	}
	
	public void getProfile() {
		System.out.println(" Member Profile is as follows - ");
		System.out.println("Name - "+ this.name );
		System.out.println("Date of Joining - " + this.dateOfMembership);
		System.out.println("Unique ID - " + this.memberId);
		System.out.println("Profile - " + this.profile);
		System.out.println("Account Status - " + this.account.status);
		System.out.println("User id / Email - " + this.account.userid);
		System.out.println("Friends - " + this.memberConnections);
	}
	
	public Message createMessage(String text, byte[] picture) {
		return new Message(text,rand.nextInt(100),this,null);
	}
	public void sendMessage(Message message, Member recipient) {
		// 
		recipient.notify("New message Received from -" + this.name);
	}
	public void createPost(String text, byte[] picture) {
		posts.add(new Post(text,rand.nextInt(1000),this,picture));
	}
	public void getPost() {
		// chronologically order 
		System.out.println(" NewsFeed for " + this.name);
		PriorityQueue<Post> pq = new PriorityQueue<>(new Comparator<Post>() {
			public int compare(Post p1, Post p2) {
				if( p2.createdAt.isAfter(p1.createdAt)) return 1;
				else return -1;
		    }
		});
		for(Post p: posts) {
			pq.add(p);
		}
		for(Member friend: this.memberConnections) {
			for(Post p: friend.posts) {
				pq.add(p);
			}
		}
		
		while(pq.size()>0) {
			Post p =pq.poll();
			System.out.println(p);
			System.out.println(p.text);
			System.out.println("Likes -" + p.likes);
			System.out.println("Comments -" + p.comments);
		}
	}
	public void sendConnectionRequest(Member friend) {
		ConnectionInvitation request = new ConnectionInvitation(friend);
		connectionInvitation.add(request);
		friend.notify("Connection request sent!");
		this.notify("New Connection Request");
	}
	public void acceptConnectionRequest(Member friend) {
		for(ConnectionInvitation invite:connectionInvitation) {
			if(invite.memberInvited.equals(friend)) {
				invite.status = ConnectionStatus.ACCECPTED;
				invite.dateUpdated = LocalTime.now();
				this.memberConnections.add(friend);
				friend.notify("Friend Request Accepted!");
			}
		}
	}
	public void rejectConnectionRequest(Member friend) {
		for(ConnectionInvitation invite:connectionInvitation) {
			if(invite.memberInvited.equals(friend)) {
				invite.status = ConnectionStatus.REJECTED;
				invite.dateUpdated = LocalTime.now();
				friend.notify("Friend Request Rejected!");
			}
		}
	}
	
}
