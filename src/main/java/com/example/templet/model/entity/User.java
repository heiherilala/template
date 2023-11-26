package com.example.templet.model.entity;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.Type;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "\"user\"")
@Getter
@Setter
@ToString
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
  @Id
  @GeneratedValue(strategy = IDENTITY)
  private String id;
  private String firstName;
  private String lastName;
  private String email;
  private String ref;
  private String phone;
  private LocalDate birthDate;
  private Instant entranceDatetime;
  private Sex sex;
  private String address;
  private Role role;

  public enum Sex {
    M, F
  }

  public enum Role {
    STUDENT, TEACHER, MANAGER
  }
}