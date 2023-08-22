package br.portoalegre.car;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;
    private String imagem;
    private int preco;

    public Car (CarRequestDTO data){
        this.marca = data.marca();
        this.modelo = data.modelo();
        this.imagem = data.imagem();
        this.preco = data.preco();
    }
}
