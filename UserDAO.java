package JPAPractice_1.group.dao;

import org.springframework.data.repository.CrudRepository;

import JPAPractice_1.group.model.Home;

public interface UserDAO extends CrudRepository <Home,Integer> {
        
}
