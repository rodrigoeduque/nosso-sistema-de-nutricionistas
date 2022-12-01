package br.com.zup.edu.nutricionistas.exception;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ApiErrorMessage {

    private HttpStatus status;

    private Integer code;

    private LocalDateTime timestamp;
    @JsonProperty("error")
    private List<Object> detalheErro = new ArrayList<>();

    public ApiErrorMessage(HttpStatus status, Integer code, LocalDateTime timestamp, List<Object> detalheErro) {
        this.status = status;
        this.code = code;
        this.timestamp = timestamp;
        this.detalheErro = detalheErro;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public List<Object> getDetalheErro() {
        return detalheErro;
    }

    public void setDetalheErro(List<Object> detalheErro) {
        this.detalheErro = detalheErro;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
