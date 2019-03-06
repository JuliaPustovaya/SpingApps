package com.project.rest.domain;



import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class MyDataObject {
	private String time;
	private String message;

	public MyDataObject() {
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MyDataObject(String time, String message) {
		this.time = time;
		this.message = message;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MyDataObject that = (MyDataObject) o;
		return new EqualsBuilder()
				.append(getTime(), that.getTime())
				.append(getMessage(), that.getMessage())
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37)
				.append(getTime())
				.append(getMessage())
				.toHashCode();
	}
}
