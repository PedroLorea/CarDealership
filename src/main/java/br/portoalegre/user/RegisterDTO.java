package br.portoalegre.user;

public record RegisterDTO(String login, String password, UserRole role) {
    
}
