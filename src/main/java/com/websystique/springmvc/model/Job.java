package com.websystique.springmvc.model;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

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
    private String adressOfCompany;


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

    public String getAdressOfCompany() {
        return adressOfCompany;
    }

    public void setAdresssOfCompany(String adresssOfCompany) {
        this.adressOfCompany = adresssOfCompany;
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
                .append(getAdressOfCompany(), job.getAdressOfCompany())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(getId())
                .append(getNameOfCompany())
                .append(getAdressOfCompany())
                .toHashCode();
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", nameOfCompany='" + nameOfCompany + '\'' +
                ", adresssOfCompany='" + adressOfCompany + '\'' +
                '}';
    }
}
