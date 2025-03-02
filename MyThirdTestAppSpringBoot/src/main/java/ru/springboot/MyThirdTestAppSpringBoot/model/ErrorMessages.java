package ru.springboot.MyThirdTestAppSpringBoot.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ErrorMessages {
    EMPTY(""),

    VALIDATION("Ошибка валидации"),

    UNSUPPORTED("Произошла непредвиденная ошибка"),

    UNKNOWN("Не поддерживаемая ошибка");

    private final String description;

    ErrorMessages(String description) {
        this.description = description;
    }

    @JsonValue
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
