package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Result {

    private Boolean success;

    private String code;

    private String message;

    private String stackTrace;

    private Object data;
}
