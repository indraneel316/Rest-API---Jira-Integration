
package com.jira.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fields"
})
@Data
public class JiraPayload {

    @JsonProperty("fields")
    private Fields fields;
    @JsonProperty
    private Update update;

}
