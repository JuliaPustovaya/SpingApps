package com.websystique.springmvc.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "JOB")
public class Job implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotNull
	@NotEmpty
	@Column(name = "NAMEOFCOMPANY")
	private String nameOfCompany;

	@NotNull
	@NotEmpty
	@Column(name = "ADRESSOFCOMPANY")
	private String adresssOfCompany;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNameOfCompany() {
		return nameOfCompany;
	}

	public void setNameOfCompany(String nameOfCompany) {
		this.nameOfCompany = nameOfCompany;
	}

	public String getAdresssOfCompany() {
		return adresssOfCompany;
	}

	public void setAdresssOfCompany(String adresssOfCompany) {
		this.adresssOfCompany = adresssOfCompany;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Job job = (Job) o;
		return new org.apache.commons.lang.builder.EqualsBuilder()
				.append(getId(), job.getId())
				.append(getNameOfCompany(), job.getNameOfCompany())
				.append(getAdresssOfCompany(), job.getAdresssOfCompany())
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37)
				.append(getId())
				.append(getNameOfCompany())
				.append(getAdresssOfCompany())
				.toHashCode();
	}

	@Override
	public String toString() {
		return "Job{" +
				"id=" + id +
				", nameOfCompany='" + nameOfCompany + '\'' +
				", adresssOfCompany='" + adresssOfCompany + '\'' +
				'}';
	}
}