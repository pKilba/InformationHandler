package com.epam.hadler.entity;

public enum ComponentType {
    TEXT,
    PARAGRAPH,
    SENTENCE,
    WORD;

    private String RegexForSplit;

    static {
        TEXT.RegexForSplit = "[^\n]+\n?";
        PARAGRAPH.RegexForSplit = "[^!?.]+[!?.](\\.{2})?([^\\n\\w]*\\n)?";//PARSING ON SENTENCE
        SENTENCE.RegexForSplit = "\\[[^]\\[]*]|[^ \\[\\]]+\n?";
        WORD.RegexForSplit = "\\w+";
    }

    public String getRegexForSplit() {
        return RegexForSplit;
    }
}
