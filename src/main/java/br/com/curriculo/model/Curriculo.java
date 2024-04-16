package br.com.curriculo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curriculo {
    private String nome;
    private String dataNascimento;
    private String descricao;
}
