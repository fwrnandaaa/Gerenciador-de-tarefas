package br.com.fernanda.todolist.user;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;



public interface IUserRepository extends JpaRepository<UserModel, UUID> {
   UserModel findByUsername(String username); //verificando se ja existe alguem no banco de dados com aquele username e, se houver, retornar os dados
}
