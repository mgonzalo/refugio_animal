/**
 * 
 */
package com.refugioanimal.domain.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Administrator
 */
@Entity
@Table(name = "EVENTOS")
public class EventInfo {

	@Id
	@Column(name = "idEvento", nullable = false)
	@GeneratedValue(strategy = IDENTITY)
	private Long id;

	@Column(name = "fecha", nullable = true)
	private Date eventDate;

	@Column(name = "descripcion", nullable = true, length=500)
	private String description;

	@Column(name = "lugar", nullable = true, length=200)
	private String place;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the eventDate
	 */
	public Date getEventDate() {
		return eventDate;
	}

	/**
	 * @param eventDate the eventDate to set
	 */
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the place
	 */
	public String getPlace() {
		return place;
	}

	/**
	 * @param place the place to set
	 */
	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "id= " + this.id + ", eventDate= " + this.eventDate + ", description= " + this.description + ", place= " + this.place;
	}

}
