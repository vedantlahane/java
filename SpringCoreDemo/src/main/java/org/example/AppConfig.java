package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * @Configuration tells Spring:
 *
 * "This class contains configuration information
 * for the Spring application."
 *
 * Spring will read this class when the IoC Container starts.
 */
@Configuration


/*
 * @ComponentScan tells Spring where to search for
 * classes annotated with @Component.
 *
 * Here we are telling Spring:
 *
 * "Scan the org.example package and its sub-packages."
 *
 * Therefore Spring will discover:
 *
 * org.example.OrderService
 * org.example.payment.UpiPayment
 * org.example.payment.CardPayment
 *
 * because these classes have @Component.
 *
 * IMPORTANT:
 *
 * Component scanning also searches inside sub-packages.
 *
 * So:
 *
 * org.example
 *     ├── OrderService
 *     │
 *     └── payment
 *           ├── UpiPayment
 *           └── CardPayment
 *
 * will all be scanned.
 */
@ComponentScan("org.example")
public class AppConfig {

    /*
     * Currently we don't need to write anything inside
     * this configuration class.
     *
     * The annotations above are enough for this example.
     *
     * Later, this class can contain additional Spring
     * configuration such as @Bean methods.
     */
}