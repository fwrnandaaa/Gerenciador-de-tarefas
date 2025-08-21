package br.com.fernanda.todolist.user;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_users")
public class UserModel {
   @Id
   @GeneratedValue(generator = "UUID")
   private UUID id;
   @Column(unique = true) //definindo a coluna username como unica
   private String username;
   private String name;
   private String password;

   private LocalDateTime createdAt;
}
