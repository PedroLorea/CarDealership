package br.portoalegre.car;

public record CarResponseDTO(Long id, String marca, String modelo, String imagem, int preco) {
    
    public CarResponseDTO(Car car){
        this(car.getId(), car.getMarca(), car.getModelo(), car.getImagem(), car.getPreco());
    }
}
