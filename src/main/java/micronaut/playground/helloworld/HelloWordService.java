package micronaut.playground.helloworld;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

@Singleton
public class HelloWordService {

    @Inject
    private HelloWorldRepository helloWorldRepository;

    public List<HelloWorldEntity> findAll() {
        return helloWorldRepository.findAll();
    }
}
