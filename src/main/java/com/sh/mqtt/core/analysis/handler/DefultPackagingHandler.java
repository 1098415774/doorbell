package com.sh.mqtt.core.analysis.handler;

import com.sh.base.utils.StringUtils;
import com.sh.mqtt.core.RequetMqttMessage;
import com.sh.mqtt.core.method.MqttHandlerMethod;

import java.text.ParseException;

public class DefultPackagingHandler {

    private JsonPackagingHandler jsonPackagingHandler = new DefultJsonPackagingHandler();

    public Object[] parser(String msg, RequetMqttMessage requetMqttMessage, MqttHandlerMethod mqttHandlerMethod) throws ParseException {
        Class[] parameterTypes = mqttHandlerMethod.getMethod().getParameterTypes();
        Object[] objects = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++){
            Class parameterType = parameterTypes[i];
            if (parameterType.isPrimitive()){
                objects[i] = StringUtils.convertToOtherType(msg,parameterType);
            }else if (parameterType == String.class){
                objects[i] = msg;
            }else if (parameterType == RequetMqttMessage.class){
                objects[i] = requetMqttMessage;
            }else {
                objects[i] = jsonPackagingHandler.parser(msg,parameterType);
            }
        }
        return objects;
    }

    public JsonPackagingHandler getJsonPackagingHandler() {
        return jsonPackagingHandler;
    }

    public void setJsonPackagingHandler(JsonPackagingHandler jsonPackagingHandler) {
        this.jsonPackagingHandler = jsonPackagingHandler;
    }
}
