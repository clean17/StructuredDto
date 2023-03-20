package shop.mtcoding.transferdto.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
public class BoardJoinUserDto {
    private BoardDto board;
    private UserDto user;
}
