package com.test.utilities;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.JsonNode;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExtractTID {

    public static void main(String[] args) {
        try {
            File jsonFile = new File("src/test/resources/file.json");
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(jsonFile);

            // Iterate over the elements in the JSON array
            int count=0;
            for (JsonNode node : rootNode) {
                // Access fields from the JSON object
                String tenantId = node.get("tenantId").asText();
                System.out.print("\""+tenantId+"\",");
                count++;
            }
            System.out.println(count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static void writeTenantIdToCSV(String tenantId) {
        try {
            // Specify the path to your CSV file
            String csvFilePath = "src/test/resources/file.csv";

            // Create FileWriter instance to append to the CSV file
            FileWriter writer = new FileWriter(csvFilePath, true);

            // Write the TenantId to the CSV file
            writer.append(tenantId);
            writer.append('\n');

            // Close the FileWriter
            writer.close();

            //System.out.println("TenantId added to CSV file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
