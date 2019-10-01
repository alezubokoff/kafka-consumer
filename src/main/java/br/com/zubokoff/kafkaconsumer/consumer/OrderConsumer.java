package br.com.zubokoff.kafkaconsumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import static org.apache.kafka.common.requests.DeleteAclsResponse.log;

@Component
@Slf4j
public class OrderConsumer {

    @KafkaListener(topics = "${order.topic}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumer(String order) {
        log.info("Order: " + order);
    }
}
