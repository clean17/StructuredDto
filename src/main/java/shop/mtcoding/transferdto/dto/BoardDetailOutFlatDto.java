package shop.mtcoding.transferdto.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BoardDetailOutFlatDto  {
    private Integer id;
    private String title;
    private String content;
    private Timestamp createdAt;
    private Integer userId;
    private String userUsername;
    private String userPassword;
    private String userEmail;
    private Timestamp userCreatedAt;
}
