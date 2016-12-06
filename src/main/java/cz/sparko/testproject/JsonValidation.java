//package com.ysoft;
//
//import java.io.File;
//import java.io.IOException;
//
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.github.fge.jsonschema.core.exceptions.ProcessingException;
//import com.github.fge.jsonschema.core.report.ProcessingReport;
//import com.github.fge.jsonschema.main.JsonSchema;
//import com.github.fge.jsonschema.main.JsonSchemaFactory;
//
//public class JsonValidation {
//    public static void main(String[] args) throws IOException, ProcessingException {
//        ObjectMapper mapper = new ObjectMapper();
//        System.out.println(new File("src\\resources\\com.ysoft\\schema.json").getAbsolutePath());
//        JsonNode fstabSchema = mapper.readTree(new File("src\\resources\\com.ysoft\\schema.json"));
//        JsonNode good = mapper.readTree(new File("src\\resources\\com.ysoft\\obj.json"));
//        JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
//        JsonSchema schema = factory.getJsonSchema(fstabSchema);
//        ProcessingReport report = schema.validate(good);
//        System.out.println(report.isSuccess());
//        System.out.println(report);
//    }
//}
