package shop.mtcoding.transferdto.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BoardDto {
    private Integer id;
    private String title;
    private String content;
    private Timestamp createdAt;
}
