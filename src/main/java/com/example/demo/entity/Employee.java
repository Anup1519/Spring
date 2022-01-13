package com.example.demo.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="emptab")
public class Employee {

     @Id
     @Column(name="eid")
     private Integer id;
     @Column(name="ename")
     private String name;
     @Column(name="eaddr")
     private String addr;
     @Column(name = "ephone")
     private Double phone;


     public Employee(){

     }
     public Employee(int id, String name , String addr,Double phone) {
          this.id=id;
          this.name=name;
          this.addr=addr;
          this.phone=phone;
     }

     public Integer getId() {
          return id;
     }
     public void setEmpId(Integer id){
          this.id=id;
     }
     public String getName(){
          return name;
     }
     public void setName(String name){
          this.name=name;
     }
     public String getAddr(){
          return addr;
     }
     public void setAddr(String addr){
          this.addr=addr;
     }
     public Double getPhone(){
          return phone;
     }
     public void setPhone(Double phone){
          this.phone=phone;
     }

}
