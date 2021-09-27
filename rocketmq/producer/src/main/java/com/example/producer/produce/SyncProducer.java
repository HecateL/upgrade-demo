package com.example.producer.produce;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;

/**
 * @author liurongqi
 * @since 2021/09/27
 */
public class SyncProducer {
    public static void main(String[] args) throws Exception {
        DefaultMQProducer producer = new DefaultMQProducer("PRODUCER-GROUP-1");
        producer.setNamesrvAddr("47.115.43.145:9876");
        producer.start();

        for (int i = 0; i < 100; i++) {
            Message message = new Message(
                    "TOPIC_TEST",
                    "TAG_A",
                    ("Hello RocketMQ "+i).getBytes(RemotingHelper.DEFAULT_CHARSET)
            );

            SendResult sendResult = producer.send(message);
            System.out.printf("%s%n", sendResult);
        }

        producer.shutdown();
    }
}
