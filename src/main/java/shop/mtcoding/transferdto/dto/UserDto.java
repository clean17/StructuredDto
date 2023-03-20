package shop.mtcoding.transferdto.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
public class UserDto {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private Timestamp createdAt; 
}
