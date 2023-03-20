package shop.mtcoding.transferdto.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.transferdto.dto.BoardJoinUserDto;
import shop.mtcoding.transferdto.dto.BoardJoinUserDto2;
import shop.mtcoding.transferdto.model.board.BoardRepository;

@Service
@Transactional(readOnly =  true)
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    @Transactional
    public BoardJoinUserDto2 게시글상세보기(Integer id) {
        // BoardDetailOutDto boardDetailOutDto = boardRepository.findByIdJoinUser(id);
        // BoardDetailOutDto2 boardDetailOutDto2 = new BoardDetailOutDto2(boardDetailOutDto);
        // return boardDetailOutDto;
        // BoardJoinUserDto dto = boardRepository.findByIdJoinUser2(id);
        BoardJoinUserDto2 dto = boardRepository.findByIdJoinUser3(id);
        // BoardDetailOutDto2 boardDetailOutDto2 = new BoardDetailOutDto2(boardDetailOutDto);
        return dto;
    }
    
}
