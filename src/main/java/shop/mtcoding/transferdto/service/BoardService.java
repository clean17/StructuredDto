package shop.mtcoding.transferdto.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.transferdto.dto.BoardJoinUserDtoV2;
import shop.mtcoding.transferdto.model.board.BoardRepository;

@Service
@Transactional(readOnly =  true)
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    @Transactional
    public BoardJoinUserDtoV2 게시글상세보기(Integer id) {
        // BoardDetailOutFlatDto flatDto = boardRepository.findByIdJoinUser(id);
        // BoardDetailOutStructuredDto dto = new BoardDetailOutStructuredDto(flatDto);
        // BoardJoinUserDto dto = boardRepository.findByIdJoinUser2(id);
        BoardJoinUserDtoV2 dto = boardRepository.findByIdJoinUser3(id);
        // BoardDetailOutStructuredDto boardDetailOutStructuredDto = new (boardDetailOutFlatDto);
        return dto;
    }
    
}
