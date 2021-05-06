package com.example.consumeapi.Student;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Records {

    @JsonProperty("status")
    public String status;

    @JsonProperty("nome_unidade_gestora")
    public String nome_unidade_gestora;

    @JsonProperty("_id")
    public Integer _id;

    @JsonProperty("nome_discente")
    public String nome_discente;

    @JsonProperty("periodo_ingresso")
    public Integer periodo_ingresso;

    @JsonProperty("tipo_discente")
    public String tipo_discente;

    @JsonProperty("nome_curso")
    public String nome_curso;

    @JsonProperty("modalidade_educacao")
    public String modalidade_educacao;

    @JsonProperty("sexo")
    public String sexo;

    @JsonProperty("sigla_nivel_ensino")
    public String sigla_nivel_ensino;

    @JsonProperty("id_unidade_gestora")
    public Integer id_unidade_gestora;

    @JsonProperty("id_curso")
    public Integer id_curso;

    @JsonProperty("forma_ingresso")
    public String forma_ingresso;

    @JsonProperty("nome_unidade")
    public String nome_unidade;

    @JsonProperty("matricula")
    public Integer matricula;

    @JsonProperty("id_unidade")
    public int id_unidade;

    @JsonProperty("ano_ingresso")
    public Integer ano_ingresso;

    @JsonProperty("nivel_ensino")
    public String nivel_ensino;


    public Records(String status, String nome_unidade_gestora, Integer _id, String nome_discente, Integer periodo_ingresso, String tipo_discente,
                   String nome_curso, String modalidade_educacao, String sexo, String sigla_nivel_ensino, Integer id_unidade_gestora, Integer id_curso,
                   String forma_ingresso, String nome_unidade, Integer matricula, Integer id_unidade, Integer ano_ingresso, String nivel_ensino) {
        this.status = status;
        this.nome_unidade_gestora = nome_unidade_gestora;
        this._id = _id;
        this.nome_discente = nome_discente;
        this.periodo_ingresso = periodo_ingresso;
        this.tipo_discente = tipo_discente;
        this.nome_curso = nome_curso;
        this.modalidade_educacao = modalidade_educacao;
        this.sexo = sexo;
        this.sigla_nivel_ensino = sigla_nivel_ensino;
        this.id_unidade_gestora = id_unidade_gestora;
        this.id_curso = id_curso;
        this.forma_ingresso = forma_ingresso;
        this.nome_unidade = nome_unidade;
        this.matricula = matricula;
        this.id_unidade = id_unidade;
        this.ano_ingresso = ano_ingresso;
        this.nivel_ensino = nivel_ensino;
    }

    public Records() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "status='" + status + '\'' +
                ", nome_unidade_gestora='" + nome_unidade_gestora + '\'' +
                ", _id=" + _id +
                ", nome_discente='" + nome_discente + '\'' +
                ", periodo_ingresso=" + periodo_ingresso +
                ", tipo_discente='" + tipo_discente + '\'' +
                ", nome_curso='" + nome_curso + '\'' +
                ", modalidade_educacao='" + modalidade_educacao + '\'' +
                ", sexo='" + sexo + '\'' +
                ", sigla_nivel_ensino='" + sigla_nivel_ensino + '\'' +
                ", id_unidade_gestora=" + id_unidade_gestora +
                ", id_curso=" + id_curso +
                ", forma_ingresso='" + forma_ingresso + '\'' +
                ", nome_unidade='" + nome_unidade + '\'' +
                ", matricula=" + matricula +
                ", id_unidade=" + id_unidade +
                ", ano_ingresso=" + ano_ingresso +
                ", nivel_ensino='" + nivel_ensino + '\'' +
                '}';
    }
}
