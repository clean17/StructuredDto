package shop.mtcoding.transferdto.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BoardDetailOutStructuredDto {
    private Integer id;
    private String title;
    private String content;
    private UserDto user;
    private Timestamp createdAt;

    public  BoardDetailOutStructuredDto(BoardDetailOutFlatDto board) {
        this.id = board.getId();
        this.title = board.getTitle();
        this.content = board.getContent();
        this.user = new UserDto(
                board.getUserId(),
                board.getUserUsername(),
                board.getUserPassword(),
                board.getUserEmail(),
                board.getUserCreatedAt()
        );
        this.createdAt = board.getCreatedAt();
    }

    @Getter @Setter
    public class UserDto {
        private Integer id;
        private String username;
        private String password;
        private String email;
        private Timestamp createdAt;

        public UserDto(Integer id, String username, String password, String email, Timestamp createdAt) {
            this.id = id;
            this.username = username;
            this.password = password;
            this.email = email;
            this.createdAt = createdAt;
        }
    }
}