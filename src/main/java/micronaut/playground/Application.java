package micronaut.playground;

import io.micronaut.context.env.Environment;
import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) {
        Micronaut.build(args)
                .defaultEnvironments(Environment.DEVELOPMENT)
                .start();
    }
}
