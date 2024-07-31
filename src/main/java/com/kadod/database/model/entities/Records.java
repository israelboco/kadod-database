package com.kadod.database.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "records")
public class Records {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "enrollId")
    private int enrollId;
    @Column(name = "recordsTime")
    private String recordsTime;
    @Column(name = "mode")
    private int mode;
    @Column(name = "intout")
    private int intout;
    @Column(name = "event")
    private int event;
    @Column(name = "deviceSerialNum")
    private String deviceSerialNum;
    @Column(name = "temperature")
    private double temperature;
    @Column(name = "image")
    private String image;


	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEnrollId() {
		return enrollId;
	}
	public void setEnrollId(int enrollId) {
		this.enrollId = enrollId;
	}
	public String getRecordsTime() {
		return recordsTime;
	}
	public void setRecordsTime(String recordTime) {
		this.recordsTime = recordTime;
	}
	public int getMode() {
		return mode;
	}
	public void setMode(int mode) {
		this.mode = mode;
	}
	public int getIntout() {
		return intout;
	}
	public void setIntout(int intout) {
		this.intout = intout;
	}
	public int getEvent() {
		return event;
	}
	public void setEvent(int event) {
		this.event = event;
	}
	public String getDeviceSerialNum() {
		return deviceSerialNum;
	}
	public void setDeviceSerialNum(String deviceSerialNum) {
		this.deviceSerialNum = deviceSerialNum;
	}

	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

}
