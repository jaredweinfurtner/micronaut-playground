package micronaut.playground.helloworld;

import io.micronaut.core.convert.ConversionContext;
import io.micronaut.core.convert.TypeConverter;

import javax.inject.Singleton;
import java.util.Optional;

@Singleton
public class HelloWorldConverter implements TypeConverter<HelloWorldEntity, HelloWorldDTO> {

    @Override
    public Optional<HelloWorldDTO> convert(HelloWorldEntity entity, Class<HelloWorldDTO> dto, ConversionContext context) {
        return Optional.of(HelloWorldDTO.builder()
                .message(entity.getMessage())
                .build());
    }
}
