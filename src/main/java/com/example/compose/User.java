package com.example.compose;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
// import lombok.Getter;
// import lombok.Setter;


@Entity
@Table(name = "users")
public class User implements Serializable {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  private String name;

  public User() {}

  public Long getId() {
    return id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setId(Long id) {
    this.id = id;
  }
  @Override
  public String toString() {
      return String.format("{ id : %s, name: %s }", this.id, this.name);
  }
}
