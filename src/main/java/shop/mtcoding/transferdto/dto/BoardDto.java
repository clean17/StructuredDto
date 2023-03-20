package shop.mtcoding.transferdto.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
public class BoardDto {
    private Integer id;
    private String title;
    private String content;
    // private UserDto user;
    private Timestamp createdAt;
}
