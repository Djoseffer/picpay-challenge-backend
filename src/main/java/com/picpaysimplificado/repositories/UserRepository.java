package com.picpaysimplificado.repositories;

import com.picpaysimplificado.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    //Método vai encontrar um user pela tabela,
    // não é necessário implementações pois o jpa já entende pela sintaxe e assinatura do método
    // que é para encontrar um usuario pelo document
    Optional<User> findUserByDocument(String document);
    Optional<User> findUserById(Long id);
}
