package model;

public enum ComponentType {
    TEXT,
    PARAGRAPH,
    SENTENCE,
    WORD,
    SYMBOL;

    private String RegexForSplit;

    static {
        TEXT.RegexForSplit = "[^\n]+\n?";
        PARAGRAPH.RegexForSplit = "[^!?.]+[!?.](\\.{2})?([^\\n\\w]*\\n)?";//парсит на предложения
        SENTENCE.RegexForSplit = "\\[[^]\\[]*]|[^ \\[\\]]+\n?";
        WORD.RegexForSplit = ".";
        SYMBOL.RegexForSplit = ".";
    }

    public String getRegexForSplit() {
        return RegexForSplit;
    }
}
