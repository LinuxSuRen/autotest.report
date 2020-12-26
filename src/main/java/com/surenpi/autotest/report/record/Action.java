package com.surenpi.autotest.report.record;

/**
 * Represent an action, for example: click or fill value into an input
 */
public class Action {
    private ActionType type;
    private String description;
    private String value;

    public ActionType getType() {
        return type;
    }

    public void setType(ActionType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
