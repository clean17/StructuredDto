package shop.mtcoding.transferdto.model.board;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.mtcoding.transferdto.dto.BoardDetailOutFlatDto ;
import shop.mtcoding.transferdto.dto.BoardJoinUserDto;
import shop.mtcoding.transferdto.dto.BoardJoinUserDtoV2;

@Mapper
public interface BoardRepository {
    public int insert(Board board);

    public int updateById(Board board);

    public int deleteById(int id);

    public List<Board> findAll();

    public Board findById(int id);

    public BoardDetailOutFlatDto findByIdJoinUser(Integer id);

    public BoardJoinUserDto findByIdJoinUser2(Integer id);

    public BoardJoinUserDtoV2 findByIdJoinUser3(Integer id);
    
}
