package rrs;

public class ConferenceRoom {
	
	private int RoomId ;
	private String name;
	private String city;
	private String building;
	private int floor;
	private int capacity;
	private boolean VC_available;
	
	public void addconfRoom (ConferenceRoom room) {
		
	    room.setRoomId(room.RoomId);
		room.setName(room.name);
		room.setCity(room.city);
		room.setBuilding(room.building);
		room.setFloor(room.floor);
		room.setCapacity(room.capacity);
		room.setVC_available(room.VC_available);
				
	}
	
	public void deleteconfRoom () {}
	public void bookconfRoom() {}
	public void listconfRoom() {}
	
	
	
	public int getRoomId() {
		return RoomId;
	}
	
	public void setRoomId(int roomId) {
		RoomId = roomId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getBuilding() {
		return building;
	}
	
	public void setBuilding(String building) {
		this.building = building;
	}
	
	public int getFloor() {
		return floor;
	}
	
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public boolean isVC_available() {
		return VC_available;
	}
	
	public void setVC_available(boolean vC_available) {
		VC_available = vC_available;
	}
	
	
}
	
	


