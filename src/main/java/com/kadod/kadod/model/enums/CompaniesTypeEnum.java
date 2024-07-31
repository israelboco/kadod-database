package com.kadod.kadod.model.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum CompaniesTypeEnum {

    ENTREPRISE("Entreprise"),
    ECOLE("Ecole"),
    UNIVERSITY("Universite"),
    HOPITALE("Hopitale");

    private String value;

    public String getValue() {
        return value;
    }
}
