package org.annotations.customannotation.advancedlevel.customserializationannotation;
import java.lang.reflect.Field;

public class JsonSerializer {

    public static String toJson(Object obj) throws IllegalAccessException {
        StringBuilder json = new StringBuilder("{");

        Field[] fields = obj.getClass().getDeclaredFields();
        boolean firstField = true;

        for (Field field : fields) {
            field.setAccessible(true);

            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField annotation = field.getAnnotation(JsonField.class);
                String jsonKey = annotation.name();
                Object value = field.get(obj);

                if (!firstField) {
                    json.append(",");
                }

                json.append("\"" + jsonKey + "\":\"" + value + "\"");
                firstField = false;
            }
        }

        json.append("}");
        return json.toString();
    }
}
