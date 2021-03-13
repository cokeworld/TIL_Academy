package list_hash_map;

import java.sql.Timestamp;

// VO(Value Object): �����ͺ��̽� ���̺� ������ ���� ��ġ�ϰ� ������.
public class ActorVo {

	private int actorId;
	private String firstName;
	private String lastName;
	private Timestamp lastUpdate;
	
	public ActorVo() {
		super();
	}
	
	public ActorVo(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getActorId() {
		return actorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Timestamp getLastUpdate() {
		return lastUpdate;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
	@Override
	public String toString() {
		return "ActorVo [actorId=" + actorId + ", firstName=" + firstName + ", lastName=" + lastName + ", lastUpdate="
				+ lastUpdate + "]";
	}

}
