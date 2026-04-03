package dev.tori.wraith.subscriber;

import dev.tori.wraith.bus.EventBus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * General tests for {@link Subscriber}.
 *
 * @author <a href="https://github.com/7orivorian">7orivorian</a>
 * @since 4.2.0
 */
class SubscriberTest {

    private EventBus eventBus;
    private Subscriber subscriber;

    @BeforeEach
    void setUp() {
        eventBus = new EventBus();
        subscriber = new Subscriber();
    }

    @Test
    void toStringEmpty() {
        Assertions.assertDoesNotThrow(() -> {
            subscriber.toString();
        }, "Calling toString() on a Subscriber should not throw an exception.");
    }

    @Test
    void toStringNonEmpty() {
        eventBus.subscribe(subscriber);

        Assertions.assertDoesNotThrow(() -> {
            subscriber.toString();
        }, "Calling toString() on a subscribed Subscriber should not throw an exception.");
    }
}