package com.HospitalMangagmentSystem.demo.Dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DoctorvisitDto {

   private String visitdetails;

   private String doctordetails;
   private String name ;
   private int age;
   private String department;
   private String first;
   private String last;
   private String firstt;
   private String lastt;

   @Temporal(TemporalType.TIMESTAMP)
   @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSS")
   //@JsonFormat(pattern = "MM/dd/yyyy", timezone = "America/New_York")
   private Date servicedate;

   @Temporal(TemporalType.TIMESTAMP)
   @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSS")
   //@JsonFormat(pattern = "MM/dd/yyyy", timezone = "America/New_York")
   private Date Nextservicedate;
   @JsonFormat(pattern = "MM/dd/yyyy", timezone = "America/New_York")
    private Date dateofbirth;

   private String patientname;

      private String otherdetails;
      @JsonFormat(pattern = "MM/dd/yyyy", timezone = "America/New_York")
      private Date daydatetime;

      private int daynumber;

   public String getName() {
      return name;
   }

   public String getDepartment() {
      return department;
   }

   public String getPatientname() {
      return patientname;
   }

   public String getVisitdetails() {
      return visitdetails;
   }


   public String getDoctordetails() {
      return doctordetails;
   }


   public Date getDateofbirth() {
      return dateofbirth;
   }


   public String getOtherdetails() {
      return otherdetails;
   }


   public Date getDaydatetime() {
      return daydatetime;
   }


   public int getDaynumber() {
      return daynumber;
   }


   public int getAge() {
      return age;
   }

   public String getFirst() {
      return first;
   }

   public String getLast() {
      return last;
   }

   public String getFirstt() {
      return firstt;
   }

   public String getLastt() {
      return lastt;
   }

   public Date getServicedate() {
      return servicedate;
   }

   public Date getNextservicedate() {
      return Nextservicedate;
   }
}

