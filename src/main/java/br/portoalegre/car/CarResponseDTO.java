package br.portoalegre.car;

public record CarResponseDTO(Long id, String marca, String modelo, String imagem, Integer preco) {
    
    public CarResponseDTO(Car car){
        this(car.getId(), car.getMarca(), car.getModelo(), car.getImagem(), car.getPreco());
    }
}
