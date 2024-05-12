package com.picpaysimplificado.domain.user;

import com.picpaysimplificado.dtos.UserDto;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String document;
    @Column(unique = true)
    private String email;
    private String password;
    private BigDecimal balance;
    @Enumerated(EnumType.STRING)
    private UserType userType;

    public User(UserDto data){
        this.firstName= data.firstName();
        this.lastName= data.lastName();
        this.balance= data.balance();
        this.userType= data.userType();
        this.password= data.password();
        this.email= data.email();
        this.document= data.document();
    }
}
