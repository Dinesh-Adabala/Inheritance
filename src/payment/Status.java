package payment;

public enum Status {
    SUCCESS("transfer success", 200),
    FAILDE("transfer faild", 202);

    private final String key;
    private final Integer value;

    Status(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }
    public Integer getValue() {
        return value;
    }
}
