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
@Table(name ="payment" )
@NoArgsConstructor
public class Order implements Serializable {
	
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="GCID")
	private Long gcid;
	
	@Column(name="TRANSACTION_ID")
	private String transactionId;
	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="DESCR")
	private String descr;
	
	public Long getGcid() {
		return gcid;
	}
	public void setGcid(Long gcid) {
		this.gcid = gcid;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getDescr() {
		return status;
	}
	public void setSDescr(String status) {
		this.status = status;
	}
}
