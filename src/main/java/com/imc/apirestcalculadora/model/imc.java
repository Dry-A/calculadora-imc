package com.imc.apirestcalculadora.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="TB_IMC")
public class imc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_IMC")
    private Integer id;
    @Column(name="CD_FUNC")
    private Integer codFuncionario;
    @Column(name="NM_FUNC")
    private String nomeFuncionario;
    @Column(name= "IDADE_FUNC")
    private Integer idade;
    @Column(name = "SEXO_FUNC")
    private String sexo;
    @Column(name="PESO_FUNC")
    private BigDecimal peso;
    @Column(name = "ALT_FUNC")
    private BigDecimal altura;
    @Column(name = "RESULT_IMC")
    private BigDecimal resultadoImc;
    @Column(name="DESCRIÇÃO_RESULT")
    private String descricaoResultado;
    @Column(name = "DT_IMC")
    private LocalDateTime dtResultadoImc = LocalDateTime.now();
    @Column(name ="DT_ALTERAÇÃO" )
    private Date dtAlteracao;
    @Column(name = "ID_OPERADOR")
    private Integer idOperador;
    @Column(name ="DT_EXCLUSÃO" )
    private Date dtExclusao;


}
