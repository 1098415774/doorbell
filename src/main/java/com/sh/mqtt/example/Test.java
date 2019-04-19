package com.sh.mqtt.example;

import com.sh.mqtt.annotation.MQTTRequestMapping;
import com.sh.mqtt.annotation.MQTTResponseBody;
import com.sh.mqtt.core.RequetMqttMessage;
import com.sh.mqtt.stereotype.MQTTController;

@MQTTController
@MQTTRequestMapping("example")
public class Test {

    @MQTTRequestMapping("example")
    @MQTTResponseBody("act/5568")
    public String test(String args){
        System.out.println(args + "test1 OK");
        return "cacac";
    }

    @MQTTRequestMapping("act/#")
    @MQTTResponseBody("act/88998")
    public TestEntity ccc(TestEntity entity, RequetMqttMessage mqttMessage){
        System.out.println(mqttMessage.getTopic() + " ---- " + entity.getName());
        return entity;
    }

}
