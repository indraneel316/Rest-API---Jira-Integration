
package com.jira.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "project",
    "summary",
    "description",
    "issuetype"
})
@Data
public class Fields {

    @JsonProperty("project")
    private Map<String,String> project;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("description")
    private String description;
    @JsonProperty("issuetype")
    private Map<String,String> issuetype;
    @JsonProperty("priority")
    private Map<String,String> priority;

}
