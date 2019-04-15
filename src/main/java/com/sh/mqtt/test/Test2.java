package com.sh.mqtt.test;

import com.sh.doorbell.handler.mqtt.MqttMessage;
import com.sh.mqtt.annotation.MQTTRequestMapping;
import com.sh.mqtt.annotation.MQTTResponseBody;
import com.sh.mqtt.stereotype.MQTTController;

@MQTTController
@MQTTRequestMapping("test2")
public class Test2 {

    @MQTTRequestMapping("test")
    @MQTTResponseBody
    public MqttMessage test(String args){
        System.out.println(args + "2");
        MqttMessage mqttMessage = new MqttMessage();
        mqttMessage.setTopic("act/6678");
        mqttMessage.setMessage("isok");
        return mqttMessage;
    }
}
