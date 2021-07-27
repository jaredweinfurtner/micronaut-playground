package micronaut.playground.helloworld;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

@Repository
interface HelloWorldRepository extends JpaRepository<HelloWorldEntity, Long> {

}
