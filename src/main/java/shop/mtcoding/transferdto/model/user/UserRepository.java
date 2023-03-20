package shop.mtcoding.transferdto.model.user;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {
    public List<User> findAll(

    );

    public User findById(
    
    );

    public User findByUsernameAndPassword(
    
    );

    public int insert(
    
    );

    public int updateById(
    
    );

    public int deleteById(
    
    );
}
