package shop.mtcoding.transferdto.model.board;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import shop.mtcoding.transferdto.model.user.User;

@Getter
@Setter
public class Board {
    private Integer id;
    private String title;
    private String content;
    private int userId;
    private Timestamp createdAt;
}
