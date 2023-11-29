package com.cloudrun.microservicetemplate.objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Despesa {

    private String descricao;

    private String valor;

}
