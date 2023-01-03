package ca.sar.coding.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name ="customerinfo" )
@NoArgsConstructor
public class Customer implements Serializable {
	
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CID")
	private Integer cid;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="LASTNAME")
	private String lastname;
	
	@Column(name="PHONE_NO")
	private Long phoneno;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="ENABLED")
	private String enabled;
	
	
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer gcid, Integer cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String transactionId, String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String transactionId, String lastname) {
		this.lastname = lastname;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	

}
