package dublinBikes;

import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface RootRepository extends JpaRepository<Root, Long> {

    @Query("Select name from Root")
    public List<Root> findAll();
}