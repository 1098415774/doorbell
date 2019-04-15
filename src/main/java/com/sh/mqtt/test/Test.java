package com.sh.mqtt.test;

import com.sh.mqtt.annotation.MQTTRequestMapping;
import com.sh.mqtt.annotation.MQTTResponseBody;
import com.sh.mqtt.stereotype.MQTTController;

@MQTTController
@MQTTRequestMapping("test")
public class Test {

    @MQTTRequestMapping("test")
    @MQTTResponseBody("act/5568")
    public String test(String args){
        System.out.println(args + "test1 OK");
        return "cacac";
    }

    @MQTTRequestMapping("ccc")
    @MQTTResponseBody("act/88998")
    public String ccc(){
        System.out.println("ccc OK");
        return "cacac";
    }
}
