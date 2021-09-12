package petsmartcommision.springcontextmanager;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@PropertySource({"classpath:common.properties"})
@ComponentScan("petsmartcommision")
public class RootContextManager {
}
