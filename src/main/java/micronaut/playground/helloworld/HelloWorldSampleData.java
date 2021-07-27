package micronaut.playground.helloworld;

import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.context.event.StartupEvent;
import io.micronaut.discovery.event.ServiceReadyEvent;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
@Requires(env = Environment.DEVELOPMENT) // Don't load data in tests.
public class HelloWorldSampleData implements ApplicationEventListener<StartupEvent> {

    @Inject
    private HelloWorldRepository helloWorldRepository;

    @Override
    public void onApplicationEvent(StartupEvent event) {

        HelloWorldEntity hw = new HelloWorldEntity();
        hw.setMessage("howdy");
        helloWorldRepository.save(hw);
    }
}
