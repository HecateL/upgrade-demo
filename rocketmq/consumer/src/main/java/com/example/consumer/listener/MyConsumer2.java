package com.example.consumer.listener;

import com.example.data.OrderPaidEvent;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

/**
 * @author liurongqi
 * @since 2021/09/27
 */
@Slf4j
@Service
@RocketMQMessageListener(consumerGroup = "my-consumer_test-topic-2", topic = "test-topic-2")
public class MyConsumer2 implements RocketMQListener<OrderPaidEvent> {
    @Override
    public void onMessage(OrderPaidEvent orderPaidEvent) {
        log.info("received orderPaidEvent: {}", orderPaidEvent);
    }
}
