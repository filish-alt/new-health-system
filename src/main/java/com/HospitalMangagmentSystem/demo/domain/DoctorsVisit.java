package com.HospitalMangagmentSystem.demo.domain;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;


/**
 * The persistent class for the doctors_visits database table.
 * 
 */
@Entity
@Table(name="doctors_visits")
@NamedQuery(name="DoctorsVisit.findAll", query="SELECT d FROM DoctorsVisit d")
public class DoctorsVisit extends AuditModel {
   private static final long serialVersionUID = 1L;

   @Id
   @GeneratedValue
   
   private int doctor_Visits_ID;

   //bi-directional many-to-one association to Patient
   @ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
   @JoinColumn(name="Patient_ID")
   @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
   private Patients patient;

   private int age;

   @Temporal(TemporalType.TIMESTAMP)
   @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSS")
   //@JsonFormat(pattern = "MM/dd/yyyy", timezone = "America/New_York")
   private Date servicedate;

   @Temporal(TemporalType.TIMESTAMP)
   @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSS")
   //@JsonFormat(pattern = "MM/dd/yyyy", timezone = "America/New_York")
   private Date Nextservicedate;


   //bi-directional many-to-one association to Doctor
   @ManyToOne(fetch=FetchType.LAZY,  cascade = CascadeType.ALL)
   @JoinColumn(name="User_ID")
   @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
   //@JsonIgnore
   private User user;



   private String visit_Details;

   //bi-directional many-to-one association to RefCalender
   @ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
   @JoinColumn(name="Day_Date_Time")
   @JsonIgnoreProperties({"hiber nateLazyInitializer", "handler"})
   //@JsonManagedReference
   private Refcalendar refCalender;


   @OneToMany(mappedBy="patient",cascade = CascadeType.ALL)
// @JsonBackReference
// @JsonIgnore
   private Set<Payment> payment;


   public DoctorsVisit() {
   }

   public int getDoctor_Visits_ID() {
      return doctor_Visits_ID;
   }

   public void setDoctor_Visits_ID(int doctor_Visits_ID) {
      this.doctor_Visits_ID = doctor_Visits_ID;
   }

   public Patients getPatient() {
      return patient;
   }

   public void setPatient(Patients patient) {
      this.patient = patient;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public Date getServicedate() {
      return servicedate;
   }

   public void setServicedate(Date servicedate) {
      this.servicedate = servicedate;
   }

   public Date getNextservicedate() {
      return Nextservicedate;
   }

   public void setNextservicedate(Date nextservicedate) {
      Nextservicedate = nextservicedate;
   }

   public User getUser() {
      return user;
   }

   public void setUser(User user) {
      this.user = user;
   }

   public String getVisit_Details() {
      return visit_Details;
   }

   public void setVisit_Details(String visit_Details) {
      this.visit_Details = visit_Details;
   }

   public Refcalendar getRefCalender() {
      return refCalender;
   }

   public void setRefCalender(Refcalendar refCalender) {
      this.refCalender = refCalender;
   }

   public Set<Payment> getPayment() {
      return payment;
   }

   public void setPayment(Set<Payment> payment) {
      this.payment = payment;
   }
