package cn.bugkit.serialization.components;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.*;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

/**
 * @author bugkit
 * @since 2022.2.25
 */
@JsonComponent
public class WenSerialization {

    /**
     * 序列化，即将Java对象转为JSON，用于将Java对象转为前端所需的结果，此处只传输Result的code字段
     */
    public static class ResultSerializer extends JsonSerializer<Result> {

        @Override
        public void serialize(Result value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeNumber(value.getCode());
        }
    }

    /**
     * 反序列化，将JSON转为Java对象，用于接收前端参数
     */
    public static class ResultDeSerializer extends JsonDeserializer<Result> {

        @Override
        public Result deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
            ObjectCodec codec = p.getCodec();
            JsonNode treeNode = codec.readTree(p);
            int code = treeNode.intValue();
            return Result.valueOf(code);
        }
    }
}
