// Urawit Jearrajinda 6410406932
package ku.cs.cafe.repository;


import ku.cs.cafe.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MemberRepository extends JpaRepository<Member, UUID> {
    // SELECT * FROM Member WHERE username = 'username'
    Member findByUsername(String username);
}

