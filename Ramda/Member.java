package Ramda;


public class Member {
	private String name;
	private String id;
	private Address address;
	public Member(){
		System.out.println("Member() ½ÇÇà");
	}
	public Member(String id){
		System.out.println("Member(String name, String id)");
		this.id = id;
	}
	
	public Member(String name,String id){
		this.name = name;
		this.id = id;
	}
	
	public Member(String name , String id,Address address){
		this.name = name;
		this.id = id;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public Address getAddress() {
		return address;
	}
}
