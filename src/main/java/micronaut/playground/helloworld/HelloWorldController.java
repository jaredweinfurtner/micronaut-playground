package micronaut.playground.helloworld;

import io.micronaut.core.convert.ConversionService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Controller("/hello-world")
public class HelloWorldController {

    @Inject
    HelloWordService helloWordService;

    @Get
    public List<HelloWorldDTO> get() {
        return helloWordService.findAll()
                .stream()
                .map(hw -> ConversionService.SHARED.convert(hw, HelloWorldDTO.class).orElseThrow())
                .collect(Collectors.toList());
    }
}
